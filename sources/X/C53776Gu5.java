package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.Gu5  reason: case insensitive filesystem */
public final class C53776Gu5 extends C251343mx {
    public final List A00;
    public final boolean A01;
    public final long A02;
    public final 2WX A03;
    public final C62320sa A04;

    public C53776Gu5(2WX r2, List list, C62320sa r4, long j, boolean z) {
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A01 = z;
        this.A04 = r4;
        this.A02 = j;
        this.A03 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r8) {
        0qQ.A0B(r8, 0);
        if (this.A00.isEmpty()) {
            return new AnonymousClass3XA();
        }
        Drawable A002 = C55218He9.A00(r8, C58714IwN.A01(r8, 14), C51966G9m.A1b());
        return new C53746Gtb(this.A03, this.A04, C58697Iw6.A00(A002, r8, this, 22), this.A02);
    }
}
