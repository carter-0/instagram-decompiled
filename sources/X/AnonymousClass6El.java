package X;

import android.content.Context;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.io.IOException;

/* renamed from: X.6El  reason: invalid class name */
public final class AnonymousClass6El implements Database.SchemaDeployer {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C300435xB A01;
    public final /* synthetic */ Database.SchemaDeployer A02;

    public AnonymousClass6El(Context context, C300435xB r2, Database.SchemaDeployer schemaDeployer) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = schemaDeployer;
    }

    public final int upgrade(SqliteHolder sqliteHolder) {
        0fh.A01("PersistentSchemaDeployer.upgrade", 842197878);
        try {
            C300435xB r2 = this.A01;
            r2.A0L();
            int upgrade = this.A02.upgrade(sqliteHolder);
            r2.A0P(upgrade);
            0fh.A00(-882965865);
            return upgrade;
        } catch (IOException e) {
            0KC.A0F("MsysInfraDatabase", "Exception when performing schema upgrade", e);
            this.A01.A0P(1);
            0fh.A00(870966026);
            return 1;
        } catch (Throwable th) {
            this.A01.A0P(1);
            0fh.A00(416973871);
            throw th;
        }
    }
}
