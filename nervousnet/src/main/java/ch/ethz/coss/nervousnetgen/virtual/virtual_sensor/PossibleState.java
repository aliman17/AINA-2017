package ch.ethz.coss.nervousnetgen.virtual.virtual_sensor;

import ch.ethz.coss.nervousnetgen.virtual.clusteringOld.Cluster;

/**
 * Created by ales on 05/10/16.
 */
public class PossibleState extends Cluster {
    private long dbID;
    public PossibleState(){}

    public void setDBID(long id){
        this.dbID = id;
    }
}
