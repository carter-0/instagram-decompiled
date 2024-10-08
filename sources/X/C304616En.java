package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.6En  reason: invalid class name and case insensitive filesystem */
public final class C304616En implements Database.SchemaDeployer {
    public final /* synthetic */ AnonymousClass6Ei A00;

    public C304616En(AnonymousClass6Ei r1) {
        this.A00 = r1;
    }

    public final int upgrade(SqliteHolder sqliteHolder) {
        return this.A00.A00.BGh().upgrade(sqliteHolder);
    }
}
