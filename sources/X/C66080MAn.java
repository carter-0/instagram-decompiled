package X;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: X.MAn  reason: case insensitive filesystem */
public final class C66080MAn implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public C66080MAn(1WY r1, 2NU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r0 = this.A01.A02;
        1WY r4 = this.A00;
        String str = null;
        Cursor A002 = 1wT.A00(r0, r4, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                str = A002.getString(0);
            }
            return str;
        } finally {
            A002.close();
            r4.A00();
        }
    }
}
