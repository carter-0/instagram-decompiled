package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import org.webrtc.CameraCapturer;

/* renamed from: X.5wu  reason: invalid class name and case insensitive filesystem */
public final class C300315wu extends Database.OpenCallback {
    public final int A00 = -1;
    public final int A01 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
    public final int A02 = 1;
    public final boolean A03;

    public final void onConfig(SqliteHolder sqliteHolder, int i, DatabaseConnectionSettings databaseConnectionSettings) {
        0qQ.A0B(sqliteHolder, 0);
        DatabaseConnectionSettings databaseConnectionSettings2 = databaseConnectionSettings;
        0qQ.A0B(databaseConnectionSettings2, 2);
        databaseConnectionSettings2.config(2500, this.A03, this.A01, false, false, 0, false, false, false, this.A02, this.A00, 0);
    }

    public C300315wu(boolean z) {
        this.A03 = z;
    }
}
