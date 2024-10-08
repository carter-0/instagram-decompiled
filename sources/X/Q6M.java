package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

public final class Q6M extends ContentObserver {
    public final /* synthetic */ Q9E A00;

    public final boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q6M(Q9E q9e) {
        super(new Handler());
        this.A00 = q9e;
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        Q9E q9e = this.A00;
        if (q9e.A05 && (cursor = q9e.A02) != null && !cursor.isClosed()) {
            q9e.A06 = q9e.A02.requery();
        }
    }
}
