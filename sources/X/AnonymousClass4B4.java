package X;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: X.4B4  reason: invalid class name */
public final class AnonymousClass4B4 implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass2NT A01;

    public AnonymousClass4B4(1WY r1, AnonymousClass2NT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        C251983oI r0 = this.A01.A00;
        1WY r3 = this.A00;
        boolean z2 = false;
        Cursor A002 = 1wT.A00(r0, r3, false);
        try {
            if (A002.moveToFirst()) {
                if (A002.getInt(0) != 0) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            return z;
        } finally {
            A002.close();
            r3.A00();
        }
    }
}
