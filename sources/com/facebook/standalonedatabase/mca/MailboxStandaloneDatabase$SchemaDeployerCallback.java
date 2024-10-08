package com.facebook.standalonedatabase.mca;

import X.0dV;
import X.0qQ;
import com.facebook.instagram.wellbeing.IGDWellBeingDatabaseSchemaDeployer;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public abstract class MailboxStandaloneDatabase$SchemaDeployerCallback {
    private int callbackJNI(SqliteHolder sqliteHolder) {
        0qQ.A0B(sqliteHolder, 0);
        0dV.A0C("IGDWellBeingDatabaseSchemaDeployer-jni");
        return IGDWellBeingDatabaseSchemaDeployer.deployPersistentSchemaNative(sqliteHolder);
    }
}
