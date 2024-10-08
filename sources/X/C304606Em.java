package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.6Em  reason: invalid class name and case insensitive filesystem */
public final class C304606Em implements Database.SchemaDeployer {
    public final /* synthetic */ AnonymousClass6Ei A00;

    public C304606Em(AnonymousClass6Ei r1) {
        this.A00 = r1;
    }

    public final int upgrade(SqliteHolder sqliteHolder) {
        0fh.A01("InMemorySchemaDeployer.upgrade", -362784319);
        try {
            AnonymousClass6Ei r0 = this.A00;
            C300435xB r2 = r0.A01;
            r2.A0K();
            int upgrade = r0.A00.BGg().upgrade(sqliteHolder);
            r2.A0O(upgrade);
            return upgrade;
        } finally {
            0fh.A00(-1934660788);
        }
    }
}
