import java.util.Locale;

public class playing_with_locale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***
		 *  multiple ways to create locale object
		 *  
		 *  locale.builder class
		 *  locale constructors
		 *  locale constants
		 *  locale.forLanguageTag factory method	
		 */
		Locale aLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		
		/**
		 * using constructors
		 * 
		 * Locale(String language)
		*	Locale(String language, String country)
		*	Locale(String language, String country, String variant)
		 * 
		 */
		Locale fLocale = new Locale("fr", "FR");
		Locale rLocale = new Locale("ru");
		
			
		/***
		 * using constant but this way the region portion is undefined.
		 */
		Locale locale = Locale.JAPAN;
		Locale jLocale = Locale.CANADA_FRENCH;
		
		
		Locale xLocale = Locale.forLanguageTag("en-US");
		Locale yLocale = Locale.forLanguageTag("ja-JP-u-ca-japanese");
	
		
		
		/***
		 * single result  using all different ways
		 * 
		 */
		
		Locale j5Locale = new Locale.Builder().setLanguage("ja").setRegion("JP").build();
		Locale  j6Locale = new Locale("ja", "JP");
		Locale bLocale = Locale.forLanguageTag("ja-JP-u-ca-japanese");
		Locale j4Locale = Locale.JAPAN;
		
	}

}
