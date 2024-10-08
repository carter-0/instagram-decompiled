package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6DB  reason: invalid class name */
public final class AnonymousClass6DB extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass6D6 A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sK A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6DB(AnonymousClass6D6 r2, C62320sa r3, C62320sa r4, 0sK r5, float f, int i, boolean z) {
        super(3);
        this.A06 = z;
        this.A01 = i;
        this.A02 = r2;
        this.A00 = f;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C62320sa r7;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C286575Wy r5 = (C286575Wy) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            int i = 2;
            if (r5.AGv(booleanValue)) {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1610017027, "com.instagram.barcelona.feed.post.ui.SingleMedia.<anonymous> (PostSingleMedia.kt:513)");
            }
            boolean z = this.A06;
            int i2 = 450;
            if (!z) {
                i2 = 520;
            }
            float f = (float) i2;
            int i3 = this.A01;
            if (i3 > 0) {
                float f2 = (float) i3;
                if (f > f2) {
                    f = f2;
                }
            }
            C286565Wx r4 = (C286565Wx) r5;
            0lg r10 = (0lg) C286615Xc.A01(C286955Yl.A00, C286565Wx.A04(r4));
            r5.ExS(1695192028);
            Modifier modifier = Modifier.A00;
            int i4 = 100;
            float f3 = 100.0f;
            if (!z) {
                f3 = 116.0f;
            }
            if (this.A02 != AnonymousClass6D6.Video) {
                i4 = 60;
            }
            Modifier Ezh = C287205Zk.A0I(modifier, f3, (float) i4, Float.NaN, f).Ezh(new AnonymousClass6DH(C287655aY.A00, this.A00));
            long j = AnonymousClass5aQ.A00(r5).A0d;
            AnonymousClass5aQ.A02(r5);
            Modifier A032 = C304816Fi.A03(Ezh, AnonymousClass5ZM.A01, 0.0f, j);
            if (182.A06(0Tu.A05, r10, 36327688088599157L)) {
                A032 = A032.Ezh(new DraggableElement(GQV.A00(r5, C41704Ayv.A00), AnonymousClass6Gj.Horizontal, (C287605aT) null, GQV.A00, GQV.A01, true, false));
            }
            C286565Wx.A0L(r4, false);
            r5.ExS(1695205327);
            if (!booleanValue && (r7 = this.A03) != null) {
                C62320sa r1 = this.A04;
                if (r1 != null) {
                    r5.ExS(1011838869);
                    modifier = AnonymousClass6DI.A01(r5, modifier, r1, r7);
                } else {
                    r5.ExS(1012065014);
                    modifier = AnonymousClass6DI.A00(r5, modifier, r7);
                }
                C286565Wx.A0L(r4, false);
            }
            C286565Wx.A0L(r4, false);
            Modifier Ezh2 = A032.Ezh(modifier);
            0sK r3 = this.A05;
            AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A0E, false);
            int A003 = C287425a7.A00(r5);
            AnonymousClass5RM A042 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r5, Ezh2);
            C62320sa r12 = C287485aD.A00;
            r5.ExX();
            if (r4.A0K) {
                r5.AMT(r12);
            } else {
                r5.FMk();
            }
            C287595aO.A00(r5, A002, C287485aD.A03);
            C287595aO.A00(r5, A042, C287485aD.A05);
            0sL r2 = C287485aD.A02;
            if (r4.A0K || !0qQ.A0K(r5.ECw(), Integer.valueOf(A003))) {
                Integer valueOf = Integer.valueOf(A003);
                r5.FLL(valueOf);
                r5.ABr(valueOf, r2);
            }
            C287595aO.A00(r5, A012, C287485aD.A04);
            r3.invoke(C289515dj.A00, r5, 6);
            C286565Wx.A0L(r4, true);
            if (0fL.A02()) {
                0fL.A00(1618336568);
            }
        } else {
            r5.Evl();
        }
        return C60340gF.A00;
    }
}
