package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Gui  reason: case insensitive filesystem */
public final class C53815Gui extends C251343mx {
    public final int A00 = 200;
    public final Drawable A01;
    public final C62320sa A02;
    public final 0sP A03;
    public final boolean A04 = true;
    public final long A05;
    public final 2WX A06;

    public C53815Gui(Drawable drawable, 2WX r4, C62320sa r5, 0sP r6, long j) {
        this.A01 = drawable;
        this.A05 = j;
        this.A02 = r5;
        this.A06 = r4;
        this.A03 = r6;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        long j = this.A05;
        AnonymousClass3XV r5 = 2WX.A02;
        C53705Gsw gsw = new C53705Gsw(r5.A00(this.A06), C58708IwH.A01(this, 3), j);
        if (this.A02 != null) {
            return new C53775Gu4(gsw, r5, new C57550Icc(AnonymousClass05K.A01, AnonymousClass05K.A00, AnonymousClass05K.A0C), C58708IwH.A01(this, 2), (C62320sa) null);
        }
        return gsw;
    }
}
