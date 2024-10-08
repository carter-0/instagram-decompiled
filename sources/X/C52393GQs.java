package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.Iterator;

/* renamed from: X.GQs  reason: case insensitive filesystem */
public final class C52393GQs extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ AnonymousClass62P A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52393GQs(AnonymousClass62P r2, float f, float f2, float f3, float f4, float f5) {
        super(2);
        this.A00 = f;
        this.A05 = r2;
        this.A04 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A01 = f5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r12 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-306677218, "com.instagram.compose.ui.facepile.FacePile.<anonymous> (FacePile.kt:59)");
            }
            C304756Fc A012 = C287275Zs.A01(-this.A00);
            C287245Zp r0 = C287215Zl.A03;
            AnonymousClass62P r4 = this.A05;
            float f = this.A04;
            float f2 = this.A03;
            float f3 = this.A02;
            float f4 = this.A01;
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A022 = C287395a4.A02(A012, r12, r0, 48);
            int i = 0;
            int A002 = C287425a7.A00(r12);
            C286565Wx r5 = (C286565Wx) r12;
            AnonymousClass5RM A042 = C286565Wx.A04(r5);
            Modifier A013 = C287435a8.A01(r12, r7);
            C51973G9u.A0y(r12, r5);
            C51971G9r.A12(r12, A022, A042);
            0sL r2 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r2, A002);
            }
            C51965G9l.A18(r12, A013);
            Iterator A17 = C51968G9o.A17(r12, r4, -1285313981);
            while (A17.hasNext()) {
                Object next = A17.next();
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass2DO r42 = (AnonymousClass2DO) next;
                Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(r7, 0.0f, 0.0f, 0.0f, ((float) i) * f), f2);
                AnonymousClass5ZQ r14 = AnonymousClass5ZN.A00;
                Modifier A014 = AnonymousClass6FZ.A01(A0C, r14);
                if (i > 0) {
                    A014 = C289575dp.A01(A014, new C52394GQt(f4, f3, f));
                }
                AnonymousClass6G3.A00(r12, (Alignment) null, C304816Fi.A03(A014, r14, 0.5f, AnonymousClass5aQ.A00(r12).A0d), (C288195bW) null, r42, (C288095bM) null, (String) null, 0.0f, 48, 120);
                i = i2;
            }
            C286565Wx.A0I(r5);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(909606610);
            }
        } else {
            r12.Evl();
        }
        return C60340gF.A00;
    }
}
