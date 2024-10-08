package X;

import java.util.List;

/* renamed from: X.M8n  reason: case insensitive filesystem */
public final class C66028M8n implements Runnable {
    public final /* synthetic */ C60433JlQ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public C66028M8n(C60433JlQ jlQ, List list, boolean z) {
        this.A01 = list;
        this.A00 = jlQ;
        this.A02 = z;
    }

    public final void run() {
        List list = this.A01;
        C60433JlQ jlQ = this.A00;
        JTP.A1C(new C60358Jk6(list, jlQ.A01, this.A02), jlQ);
    }
}
