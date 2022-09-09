package constants;

public final class FrameworkConstants {
	
    private FrameworkConstants() {
		
	}
    
	private static final int EXPLICITWAIT = 10;

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "/resources/";

	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String GECKODRIVERPATH = RESOURCESPATH + "/executables/geckodriver.exe";
	private static final String EDGEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";

	public static String getExtentReportFilePath() {
		return null;
	}
	
	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getGeckodriverpath() {
		return GECKODRIVERPATH;
	}

	public static String getEdgedriverpath() {
		return EDGEDRIVERPATH;
	}

	

}
