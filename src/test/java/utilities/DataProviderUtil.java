package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public static Object[][] sehirVerileri() {
        return new Object[][]{
                {"manisa","ege","45"},
                {"ankara","icAnadolu","06"},
                {"antalya","akdeniz","07"}
        };
    }
}
