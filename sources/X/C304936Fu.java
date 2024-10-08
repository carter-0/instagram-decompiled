package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Fu  reason: invalid class name and case insensitive filesystem */
public final class C304936Fu extends 0Yg implements 0sK {
    public final /* synthetic */ C287625aV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C304936Fu(C287625aV r2, String str, C62320sa r4, boolean z) {
        super(3);
        this.A03 = z;
        this.A01 = str;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C287605aT r5;
        boolean z;
        C286575Wy r13 = (C286575Wy) obj2;
        ((Number) obj3).intValue();
        r13.ExS(-756081143);
        if (0fL.A02()) {
            0fL.A01(1513150614, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
        }
        C286565Wx r3 = (C286565Wx) r13;
        C287095Yz r4 = (C287095Yz) C286615Xc.A01(AnonymousClass5ZU.A00, C286565Wx.A04(r3));
        if (r4 instanceof C287085Yy) {
            r13.ExS(617140216);
            z = false;
            C286565Wx.A0L(r3, false);
            r5 = null;
        } else {
            r13.ExS(617248189);
            Object ECw = r13.ECw();
            if (ECw == AnonymousClass5XT.A00) {
                ECw = new AnonymousClass5aS();
                r3.A0Q(ECw);
            }
            r5 = (C287605aT) ECw;
            z = false;
            C286565Wx.A0I(r3);
        }
        C285245Qk r6 = Modifier.A00;
        boolean z2 = this.A03;
        Modifier A002 = C287635aW.A00(r4, r5, r6, this.A00, this.A01, this.A02, z2);
        if (0fL.A02()) {
            0fL.A00(-300821045);
        }
        C286565Wx.A0L(r3, z);
        return A002;
    }
}
