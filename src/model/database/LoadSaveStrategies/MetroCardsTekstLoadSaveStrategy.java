package model.database.LoadSaveStrategies;

import model.database.utilities.TekstLoadSaveTemplate;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class MetroCardsTekstLoadSaveStrategy extends TekstLoadSaveTemplate implements LoadSaveStrategy {
    @Override
    public Map load(File file) throws IOException {
        return super.load(file);
    }

}