package X;

import com.facebook.instagram.msys.InstagramDatabaseSchemaDeployer;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.662  reason: invalid class name */
public final class AnonymousClass662 implements Database.VirtualTableModuleRegistrator {
    public static final AnonymousClass662 A00 = new AnonymousClass662();

    public final int register(SqliteHolder sqliteHolder) {
        0dV.A0C("instagramDatabaseSchemaDeployer-jni");
        return InstagramDatabaseSchemaDeployer.registerVirtualTableModuleFunctionsNative(sqliteHolder);
    }
}
