package ch.ethz.coss.nervousnetgen.storage;

import ch.ethz.coss.nervousnetgen.SensorReading;

/**
 * Created by ales on 21/09/16.
 */
public interface iDatabaseHelper {
    public boolean store(SensorReading reading);
}
