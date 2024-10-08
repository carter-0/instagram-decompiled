package X;

import android.os.Handler;

public final class SGl {
    public static final Handler A01 = AnonymousClass7TF.A0D();
    public final C307446Qd A00;

    public SGl(C307446Qd r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A00(S4e s4e, Object obj) {
        Q3P q3p = (Q3P) obj;
        0qQ.A0B(q3p, 0);
        if (C245983dn.A03()) {
            this.A00.A0A(q3p);
            return;
        }
        A01.postAtTime(new TJE(q3p, s4e, this), 0);
    }
}
