package ch.ethz.coss.nervousnetgen.storage;

import java.util.ArrayList;
import java.util.HashMap;

import ch.ethz.coss.nervousnetgen.SensorReading;

/**
 * Created by ales on 21/09/16.
 */
public interface iDatabaseHelper {
    public void store(HashMap<String, Object> sample);
}
