package X;

import androidx.compose.ui.Modifier;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.J9u  reason: case insensitive filesystem */
public final class C59190J9u extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59190J9u(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(2);
        this.A00 = i;
        this.A06 = obj4;
        this.A01 = obj3;
        this.A07 = z;
        this.A05 = obj6;
        this.A03 = obj5;
        this.A04 = obj2;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A00 != 0) {
            SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj4;
            0qQ.A0B(simpleZoomableViewContainer, 1);
            C53992Gxa gxa = (C53992Gxa) this.A06;
            C246663ey A042 = C53992Gxa.A04(simpleZoomableViewContainer, gxa);
            MediaFrameLayout A012 = A042.A01();
            IgProgressImageView A002 = A042.A00();
            if (gxa.A08) {
                f = gxa.A03.A00;
            } else {
                0nA.A0V(A012, -1);
                f = -1.0f;
            }
            A012.A00 = f;
            AnonymousClass4DU r4 = gxa.A02;
            C246613et r6 = gxa.A03;
            C247013fd.A0A(r4, (C246953fX) this.A01, r6, gxa.A04, A002, (C62320sa) this.A05, this.A07);
            1Xj r10 = (1Xj) this.A04;
            AnonymousClass3W1 r13 = r6.A0E;
            AnonymousClass3TO r15 = r6.A0G;
            C247013fd.A02((AnonymousClass9IB) this.A02, r10, r4, A042, r13, (C231502rm) this.A03, r15);
            if (Systrace.A0E(1)) {
                0fS.A01(AnonymousClass000.A00(775), 1574986571);
            }
            try {
                C56815IDm.A00(A042.A01(), 2, (C253873rY) r6.A0A.A0J.invoke(A042));
                return C51965G9l.A0f(new C58186Inq(39, A002, A012));
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(1562266530);
                }
            }
        } else {
            C286575Wy r5 = (C286575Wy) obj3;
            if (C51968G9o.A0C(obj4) != 2 || !r5.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(-778022407, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbar.<anonymous>.<anonymous> (MagicModToolbar.kt:114)");
                }
                int A0M = AnonymousClass7TE.A0M(((C61084JwM) this.A06).A02);
                if (A0M == 0) {
                    C286575Wy r62 = r5;
                    HYC.A00(r62, C287195Zj.A0B(C51965G9l.A0K(r5, -1711399310), 12.0f, 0.0f, 0.0f, 12.0f), (HLB) this.A01, (C62320sa) this.A05, (0sP) this.A04, 3072, 0);
                } else if (A0M == 1) {
                    r5.ExS(-1711057690);
                    String A003 = C304346Dc.A00(r5, 2131960992);
                    long A052 = G9w.A05(r5);
                    AnonymousClass5Z4 A0h = C51966G9m.A0h(r5);
                    C285245Qk r63 = Modifier.A00;
                    boolean z = this.A07;
                    r5.ExS(1468834524);
                    Object obj5 = this.A03;
                    boolean AGu = r5.AGu(obj5);
                    Object ECw = r5.ECw();
                    if (AGu || ECw == AnonymousClass5XT.A00) {
                        ECw = C58678Ivn.A00(r5, obj5, 28);
                    }
                    C51965G9l.A1X(r5, false);
                    AnonymousClass5ZZ.A0Q(r5, G9w.A0G(C288235ba.A01(r5, r63, (C287625aV) null, (String) null, (C62320sa) ECw, 6, z)), A0h, A003, A052);
                } else if (A0M == 3) {
                    r5.ExS(1468837748);
                } else if (A0M == 2) {
                    r5.ExS(1468840338);
                    AnonymousClass2DO A004 = C287975bA.A00(r5, R.drawable.instagram_x_pano_filled_24, 0);
                    String A005 = C304346Dc.A00(r5, 2131954722);
                    Modifier A09 = C287195Zj.A09(C287195Zj.A0B(Modifier.A00, 0.0f, 0.0f, 12.0f, 0.0f), 0.0f, 12.0f);
                    r5.ExS(1468851433);
                    Object obj6 = this.A02;
                    boolean AGu2 = r5.AGu(obj6);
                    Object ECw2 = r5.ECw();
                    if (AGu2 || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = C58678Ivn.A00(r5, obj6, 29);
                    }
                    C51965G9l.A1X(r5, false);
                    C288165bT.A07(r5, C288235ba.A04(r5, A09, (C62320sa) ECw2), A004, A005, 8, C51965G9l.A09(r5));
                } else {
                    throw C51973G9u.A0n(r5, 1468811768);
                }
                if (C51970G9q.A1a(r5, false)) {
                    0fL.A00(-89206395);
                }
            } else {
                r5.Evl();
            }
            return C60340gF.A00;
        }
    }
}
