package X;

import com.facebook.msys.mci.DatabaseConnection;

/* renamed from: X.PXx  reason: case insensitive filesystem */
public final class C73162PXx implements Runnable {
    public final /* synthetic */ DatabaseConnection.DatabaseRunnable A00;
    public final /* synthetic */ DatabaseConnection A01;

    public C73162PXx(DatabaseConnection.DatabaseRunnable databaseRunnable, DatabaseConnection databaseConnection) {
        this.A01 = databaseConnection;
        this.A00 = databaseRunnable;
    }

    public final void run() {
        this.A01.execute(this.A00);
    }
}
