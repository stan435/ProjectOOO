package model.database.LoadSaveStrategies;

import jxl.read.biff.BiffException;
import model.database.utilities.ExcelLoadSaveTemplate;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class MetroCardsExcelLoadSaveStrategy extends ExcelLoadSaveTemplate implements LoadSaveStrategy {
    @Override
    public Map load(File file) throws BiffException, IOException {
        return super.load(file);
    }
}
