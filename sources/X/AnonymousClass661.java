package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployerMDMS_DEFERRED;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.661  reason: invalid class name */
public final class AnonymousClass661 implements Database.SchemaDeployer {
    public static final AnonymousClass661 A00 = new AnonymousClass661();

    public final int upgrade(SqliteHolder sqliteHolder) {
        0dV.A0C("instagramDatabaseSchemaDeployer-jniMDMS_DEFERREDnovt");
        return InstagramDatabaseSchemaDeployerMDMS_DEFERRED.deployInMemorySchemaNative(sqliteHolder);
    }
}
