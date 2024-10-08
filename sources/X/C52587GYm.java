package X;

import android.content.Context;

/* renamed from: X.GYm  reason: case insensitive filesystem */
public final class C52587GYm extends C251343mx {
    public final int A00;
    public final GFO A01;
    public final C51987GAk A02;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        C51987GAk gAk = this.A02;
        if (gAk == null) {
            return new AnonymousClass3XA();
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0B = C51974G9v.A0B(C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0));
        GFO gfo = this.A01;
        C267324bN r1 = gfo.A0D;
        C52058GDe gDe = gfo.A0E;
        int i = this.A00;
        Context context = gAk.A01;
        2el r7 = gAk.A04;
        String str = gAk.A0J;
        return new C52580GYf(A0B, new C52579GYe(context, gAk.A03, r7, gAk.A06, gAk.A07, str, i), r1, gDe);
    }

    public C52587GYm(GFO gfo, C51987GAk gAk, int i) {
        this.A01 = gfo;
        this.A00 = i;
        this.A02 = gAk;
    }
}
