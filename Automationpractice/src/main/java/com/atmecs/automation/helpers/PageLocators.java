package com.atmecs.automation.helpers;

import java.util.Properties;

import com.atmecs.automation.constants.FilePaths;
import com.atmecs.automation.utils.ReadProperties;



public class PageLocators {
	
	Properties property;
	public String Frameswitch;
	public String Frame;
	public String iFrame;
	public String getiFrame() {
		return iFrame;
	}

	public void setiFrame() {
		iFrame =property.getProperty("loc.iframe");
	}

	public void getData() throws Exception {
		property=ReadProperties.loadProperty(FilePaths.LOGIN);
	   setFrameswitch();
	   setFrame();
	   setiFrame();
	}
	
	public String getFrameswitch() {
		return Frameswitch;
	}
	public void setFrameswitch() {
		Frameswitch =property.getProperty("loc.switchto");
	}

	public String getFrame() {
		return Frame;
	}

	public void setFrame() {
		Frame =property.getProperty("loc.frame");
	}
	
}