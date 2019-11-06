package fr.htc.mr.anagram;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Anagram {

	static Collection<Text> anagrams = new HashSet<Text>();

	public static class AnagramMakerMapper extends

			Mapper<Object, Text, Text, Text> {

		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

			StringTokenizer itr = new StringTokenizer(value.toString());
	
			while (itr.hasMoreTokens()) {

				String word = itr.nextToken();

				char[] arr = word.toCharArray();

				Arrays.sort(arr);

				String wordKey = new String(arr);

				context.write(new Text(wordKey), new Text(word));

			}

		}

	}

	// Does not summarize, but simply collets the list of anagramming words for

	// a key

	public static class AnagramAggregatorReducer extends

			Reducer<Text, Text, Text, Text> {

		public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

			/*String anagram = null;
			for (Text val : values) {
				if (anagram == null) {
					anagram = val.toString();
				} else {
					anagram = anagram + ',' + val.toString();
				}
			}*/
			
			StringBuilder anagrams2 = new StringBuilder("| ");
			for (Text word : values) {
				anagrams2.append(word + " | ");
			}
			context.write(key, new Text(anagrams2.toString()));

		}

	}

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();

		Job job = new Job(conf, "word count");

		job.setJarByClass(Anagram.class);

		job.setMapperClass(AnagramMakerMapper.class);

		job.setReducerClass(AnagramAggregatorReducer.class);

		job.setOutputKeyClass(Text.class);

		job.setOutputValueClass(Text.class);

		FileInputFormat.addInputPath(job, new Path(args[1]));

		FileOutputFormat.setOutputPath(job, new Path(args[2]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);

	}

}
