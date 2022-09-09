package constants;

import enums.ConfigProperties;
import utils.PropertyUtlis;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final int EXPLICITWAIT = 10;

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "/resources/";

	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String GECKODRIVERPATH = RESOURCESPATH + "/executables/geckodriver.exe";
	private static final String EDGEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String CONFIGILEPATH = RESOURCESPATH + "/config/config.properties";
	private static final String JSONFILEPATH = RESOURCESPATH + "/json/config.json";
	private static final String JSONUSERFILEPATH = RESOURCESPATH + "/json/users.json";

	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir") + "/extent-test-output/";

	private static String extentReportFilePath = "";

	public static String getExtentReportFilePath() throws Exception {
		if (extentReportFilePath.isEmpty()) {
			return extentReportFilePath = createReportPath();
		}
		return extentReportFilePath;
	}

	private static String createReportPath() throws Exception {
		if (PropertyUtlis.get(ConfigProperties.OVERRIDEREPORTS).equals("no")) {
			return EXTENTREPORTFOLDERPATH + System.currentTimeMillis() + "/index.html";
		} else {
			return EXTENTREPORTFOLDERPATH + "/index.html";
		}
	}

	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getGeckoDriverPath() {
		return GECKODRIVERPATH;
	}

	public static String getEdgeDriverPath() {
		return EDGEDRIVERPATH;
	}

	public static String getJsonFilePath() {
		return JSONFILEPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGILEPATH;
	}

	public static String getJsonUserFilePat() {
		return JSONUSERFILEPATH;
	}

}
