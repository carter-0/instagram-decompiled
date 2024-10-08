package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class J8W extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A00 != 0) {
            SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj4;
            0qQ.A0B(simpleZoomableViewContainer, 1);
            C53991GxZ gxZ = (C53991GxZ) this.A04;
            C246663ey A042 = C53991GxZ.A04(simpleZoomableViewContainer, gxZ);
            MediaFrameLayout A012 = A042.A01();
            IgProgressImageView A002 = A042.A00();
            if (gxZ.A07) {
                f = gxZ.A03.A00;
            } else {
                0nA.A0V(A012, -1);
                f = -1.0f;
            }
            A012.A00 = f;
            AnonymousClass4DU r4 = gxZ.A02;
            C246613et r6 = gxZ.A03;
            C247013fd.A0A(r4, (C246953fX) this.A01, r6, gxZ.A04, A002, (C62320sa) this.A03, this.A05);
            A012.setVideoSource((1Xj) this.A02, r4);
            if (Systrace.A0E(1)) {
                0fS.A01(AnonymousClass000.A00(775), -966588286);
            }
            try {
                C56815IDm.A00(A042.A01(), 3, (C253873rY) r6.A0A.A0J.invoke(A042));
                return C51965G9l.A0f(new C58186Inq(40, A002, A012));
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(142945559);
                }
            }
        } else {
            AnonymousClass3V9 r8 = (AnonymousClass3V9) obj3;
            C262864Gh r7 = (C262864Gh) obj4;
            boolean A1U = AnonymousClass7TF.A1U(0, r8, r7);
            if (!this.A05) {
                return C56795ICs.A00;
            }
            1Xj r3 = (1Xj) this.A01;
            AnonymousClass3W1 r62 = (AnonymousClass3W1) this.A02;
            AnonymousClass4DU r5 = (AnonymousClass4DU) this.A03;
            UserSession userSession = ((C55985Hqq) this.A04).A00;
            0qQ.A0B(r3, 0);
            AnonymousClass7TF.A1D(r62, A1U ? 1 : 0, r5);
            return C262914Gm.A00(userSession, r3, r3, r5, r62, r7, r8, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8W(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A05 = z;
        this.A03 = obj3;
        this.A02 = obj4;
    }
}
