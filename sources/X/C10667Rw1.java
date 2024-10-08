package X;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: X.Rw1  reason: case insensitive filesystem */
public final class C10667Rw1 {
    public ArrayList A00;
    public boolean A01;
    public final Looper A02;
    public final Q7m A03;

    public C10667Rw1(Looper looper) {
        Q7m q7m;
        this.A02 = looper;
        if (looper == null) {
            q7m = null;
        } else {
            q7m = new Q7m(looper, this);
        }
        this.A03 = q7m;
        this.A00 = AnonymousClass7TE.A1C();
    }
}
