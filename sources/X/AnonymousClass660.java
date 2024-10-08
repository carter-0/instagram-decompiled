package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployerMDMS;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.660  reason: invalid class name */
public final class AnonymousClass660 implements Database.SchemaDeployer {
    public static final AnonymousClass660 A00 = new AnonymousClass660();

    public final int upgrade(SqliteHolder sqliteHolder) {
        0dV.A0C("instagramDatabaseSchemaDeployer-jniMDMSnovt");
        return InstagramDatabaseSchemaDeployerMDMS.deployInMemorySchemaNative(sqliteHolder);
    }
}
