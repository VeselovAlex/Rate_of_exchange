package com.rateofexchange;

import com.rateofexchange.model.Currency;
import com.rateofexchange.model.CurrencyList;
import com.rateofexchange.parser.CurrencyParser;
import com.rateofexchange.parser.vendors.FileVendor;


public class AppMain {

	public static void main(String[] args) {
		CurrencyParser parser = new CurrencyParser(new FileVendor("testing/data/testcurs.xml"));
		CurrencyList list = parser.parse();
		for (Currency cur : list) {
			System.out.println(cur.getDisplayName() + " (" + cur.getCharCode() + ")\t" + cur.getCurRate());		
		}
	}

}
