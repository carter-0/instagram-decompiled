package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployer;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.65x  reason: invalid class name and case insensitive filesystem */
public final class C3029165x implements Database.SchemaDeployer {
    public static final C3029165x A00 = new C3029165x();

    public final int upgrade(SqliteHolder sqliteHolder) {
        0dV.A0C("instagramDatabaseSchemaDeployer-jni");
        return InstagramDatabaseSchemaDeployer.deployPersistentSchemaNative(sqliteHolder);
    }
}
