package com.rateofexchange.parser.vendors;

import java.io.File;
import java.io.InputStream;

public interface Vendor {
	public File getFile();
	public InputStream getInputStream();
}
