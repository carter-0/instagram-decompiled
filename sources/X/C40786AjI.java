package X;

import android.os.Bundle;

/* renamed from: X.AjI  reason: case insensitive filesystem */
public final class C40786AjI implements Runnable {
    public final /* synthetic */ C342847pG A00;

    public C40786AjI(C342847pG r1) {
        this.A00 = r1;
    }

    public final void run() {
        C342847pG r5 = this.A00;
        C331127Pr r3 = new C331127Pr(r5.A01);
        r3.A0k = false;
        r3.A0a = true;
        r3.A0q = false;
        r3.A11 = false;
        r3.A13 = true;
        r3.A0y = false;
        C331157Pu A002 = r3.A00();
        String str = r5.A03;
        C47433E2f e2f = new C47433E2f();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(253), str);
        e2f.setArguments(A0a);
        e2f.A01 = new AOW(4, A002, r5);
        e2f.A00 = new AOW(5, A002, r5);
        A002.A02(r5.A00, e2f);
    }
}
