package X;

import android.database.Cursor;
import java.util.concurrent.Callable;

public final class As5 implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ C311976dc A01;

    public As5(1WY r1, C311976dc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C251983oI r0 = this.A01.A07;
        1WY r4 = this.A00;
        Long l = null;
        Cursor A002 = 1wT.A00(r0, r4, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                l = Long.valueOf(A002.getLong(0));
            }
            return l;
        } finally {
            A002.close();
            r4.A00();
        }
    }
}
