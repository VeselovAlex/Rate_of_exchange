package com.rateofexchange;

import com.rateofexchange.model.Currency;
import com.rateofexchange.model.CurrencyList;
import com.rateofexchange.parser.CurrencyParser;
import com.rateofexchange.parser.vendors.CBRVendor;
import com.rateofexchange.parser.vendors.FileVendor;
import com.rateofexchange.parser.vendors.Vendor;


public class AppMain {

	public static void main(String[] args) {
		Vendor testVendor = new FileVendor("testing/data/testcurs.xml");
		Vendor cbr = new CBRVendor();
		CurrencyParser parser = new CurrencyParser(cbr);
		CurrencyList list = parser.parse();
		for (Currency cur : list) {
			System.out.println(cur.getDisplayName() + " (" + cur.getCharCode() + ")\t" + cur.getCurRate());		
		}
	}

}
