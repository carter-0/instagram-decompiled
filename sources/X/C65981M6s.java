package X;

import java.util.List;

/* renamed from: X.M6s  reason: case insensitive filesystem */
public final class C65981M6s implements Runnable {
    public final /* synthetic */ C60434JlR A00;
    public final /* synthetic */ List A01;

    public C65981M6s(C60434JlR jlR, List list) {
        this.A01 = list;
        this.A00 = jlR;
    }

    public final void run() {
        List list = this.A01;
        C60434JlR jlR = this.A00;
        JTP.A1C(new C60358Jk6(list, jlR.A03, false), jlR);
    }
}
