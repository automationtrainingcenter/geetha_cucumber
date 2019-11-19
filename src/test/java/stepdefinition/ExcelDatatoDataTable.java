package stepdefinition;

import banking.cucumber_framework.Excel;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import utilities.ExcelHelper;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExcelDatatoDataTable implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        TableEntryTransformer<Excel> entryTransformer = new TableEntryTransformer<Excel>() {
            @Override
            public Excel transform(Map<String, String> entry)  {
                ExcelHelper excelHelper = new ExcelHelper();
                List<List<String>> readData = excelHelper.getSheetData(entry.get("folderName"), entry.get("fileName"), entry.get("sheetName"));
                return new Excel(readData);
            }
        };
        typeRegistry.defineDataTableType(new DataTableType(Excel.class, entryTransformer));
    }
}
