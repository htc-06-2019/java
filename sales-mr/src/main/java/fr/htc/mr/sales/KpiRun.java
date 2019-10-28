package fr.htc.mr.sales;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class KpiRun {

	public static class Map extends Mapper<Object, Text, LongWritable, DoubleWritable> {

		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

			Sale sale = Sale.build(value);
			LongWritable myKey = new LongWritable(sale.getStoreId());
			DoubleWritable myValue = new DoubleWritable(sale.getStoreSales() * sale.getUnitSales());

			context.write(myKey, myValue);
		}
	}


	public static class Reduce extends Reducer<LongWritable, DoubleWritable, LongWritable, DoubleWritable> {

		protected void reduce(LongWritable key, Iterable<DoubleWritable> chiffreAffaires, Context context)
				throws IOException, InterruptedException {
			Double caGlobalParMagazin = 0.0;

			for (DoubleWritable ca : chiffreAffaires) {
				caGlobalParMagazin = caGlobalParMagazin + ca.get();
			}

			context.write(key, new DoubleWritable(caGlobalParMagazin));
		}

	}

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();

		Job job = new Job(conf, "KpiRun");

		job.setJarByClass(KpiRun.class);

		job.setMapperClass(Map.class);
		job.setReducerClass(Reduce.class);

		job.setOutputKeyClass(LongWritable.class);
		job.setOutputValueClass(DoubleWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[1]));

		FileOutputFormat.setOutputPath(job, new Path(args[2]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);

	}

}
