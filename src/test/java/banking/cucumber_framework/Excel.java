package banking.cucumber_framework;

import java.util.List;

public class Excel {
    private List<List<String>> excelData;

    public Excel(List<List<String>> excelData){
        this.excelData = excelData;
    }

    public List<List<String>> getExcelData() {
        return excelData;
    }
}
