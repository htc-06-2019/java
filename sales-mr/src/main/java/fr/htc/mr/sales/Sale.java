package fr.htc.mr.sales;

import org.apache.hadoop.io.Text;

public class Sale {
	// 1;369;4728;501;7;11.4000;3.9900;4.0000
	private long productId;
	private long timeId;
	private long customerId;
	private long promotionId;
	private long storeId;
	private double storeSales;
	private double storeCost;
	private double unitSales;

	public long getProductId() {
		return productId;
	}

	/** 0 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getTimeId() {
		return timeId;
	}

	/** 1 */
	public void setTimeId(long timeId) {
		this.timeId = timeId;
	}

	public long getCustomerId() {
		return customerId;
	}

	/** 2 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getPromotionId() {
		return promotionId;
	}

	/** 3 */
	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	public long getStoreId() {
		return storeId;
	}

	/** 4 */
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public double getStoreSales() {
		return storeSales;
	}

	/** 5 */
	public void setStoreSales(double storeSales) {
		this.storeSales = storeSales;
	}

	public double getStoreCost() {
		return storeCost;
	}

	/** 6 */
	public void setStoreCost(double storeCost) {
		this.storeCost = storeCost;
	}

	public double getUnitSales() {
		return unitSales;
	}

	/** 7 */
	public void setUnitSales(double unitSales) {
		this.unitSales = unitSales;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Sale build(Text value) {
		String[] columns = value.toString().split(";");

		Sale sale = new Sale();

		sale.setProductId(Long.parseLong(columns[0]));
		sale.setTimeId(Long.parseLong(columns[1]));
		sale.setCustomerId(Long.parseLong(columns[2]));
		sale.setPromotionId(Long.parseLong(columns[3]));
		sale.setStoreId(Long.parseLong(columns[4]));
		sale.setStoreSales(Double.parseDouble(columns[5]));
		sale.setStoreCost(Double.parseDouble(columns[6]));
		sale.setUnitSales(Double.parseDouble(columns[7]));
		return sale;
	}

}
