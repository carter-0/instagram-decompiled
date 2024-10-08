package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployer;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.Opm  reason: case insensitive filesystem */
public final class C71727Opm implements Database.SchemaDeployer {
    public static final C71727Opm A00 = new C71727Opm();

    public final int upgrade(SqliteHolder sqliteHolder) {
        0dV.A0C("instagramDatabaseSchemaDeployer-jninovt");
        return InstagramDatabaseSchemaDeployer.deployPersistentSchemaNoVirtualTablesNative(sqliteHolder);
    }
}
