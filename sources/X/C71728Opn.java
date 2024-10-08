package X;

import android.net.Uri;
import android.os.ConditionVariable;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.MsysDatabaseRedactor;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.io.File;
import java.util.List;

/* renamed from: X.Opn  reason: case insensitive filesystem */
public final class C71728Opn implements DatabaseConnection.DatabaseRunnable {
    public final MsysDatabaseRedactor A00;
    public final ConditionVariable A01;
    public final File A02;
    public final List A03;

    public final void run(SqliteHolder sqliteHolder) {
        try {
            List list = this.A03;
            File A0s = JTO.A0s(this.A02, "msys_debug");
            if (A0s.exists() || A0s.mkdirs()) {
                File A0s2 = JTO.A0s(A0s, "msys_debug_database.bin");
                int copyAndRedactDatabase = this.A00.copyAndRedactDatabase(sqliteHolder, Uri.fromFile(A0s2).toString());
                if (copyAndRedactDatabase == 0) {
                    list.add(A0s2);
                } else {
                    0KC.A0O("MsysAddReportRunnable", "copyAndRedactDatabase for msys DB failed with error code: %d", new Object[]{Integer.valueOf(copyAndRedactDatabase)});
                }
            } else {
                0KC.A0C("MsysAddReportRunnable", C273654mx.A00(1262));
            }
        } finally {
            this.A01.open();
        }
    }

    public C71728Opn(ConditionVariable conditionVariable, MsysDatabaseRedactor msysDatabaseRedactor, File file, List list) {
        this.A03 = list;
        this.A01 = conditionVariable;
        this.A02 = file;
        this.A00 = msysDatabaseRedactor;
    }
}
