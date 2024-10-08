package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.J8y  reason: case insensitive filesystem */
public final class C59168J8y extends 0Yg implements 0sL {
    public final /* synthetic */ AnonymousClass9IB A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C246953fX A02;
    public final /* synthetic */ C278414wq A03;
    public final /* synthetic */ C231502rm A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59168J8y(AnonymousClass9IB r2, 1Xj r3, C246953fX r4, C278414wq r5, C231502rm r6, C62320sa r7, boolean z) {
        super(2);
        this.A03 = r5;
        this.A02 = r4;
        this.A06 = z;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj2;
        0qQ.A0B(simpleZoomableViewContainer, 1);
        C278414wq r1 = this.A03;
        C246663ey A042 = C278414wq.A04(simpleZoomableViewContainer, r1);
        MediaFrameLayout A012 = A042.A01();
        IgProgressImageView A002 = A042.A00();
        if (r1.A0A) {
            f = r1.A04.A00;
        } else {
            0nA.A0V(A012, -1);
            f = -1.0f;
        }
        A012.A00 = f;
        AnonymousClass4DU r4 = r1.A03;
        C246613et r6 = r1.A04;
        C247013fd.A0A(r4, this.A02, r6, r1.A05, A002, this.A05, this.A06);
        C231502rm r14 = this.A04;
        C247013fd.A02(this.A00, this.A01, r4, A042, r6.A0E, r14, r6.A0G);
        if (r1.A09) {
            A002.setVisibility(0);
        }
        if (Systrace.A0E(1)) {
            0fS.A01(AnonymousClass000.A00(775), 795699839);
        }
        try {
            C56815IDm.A00(A042.A01(), 5, (C253873rY) r6.A0A.A0J.invoke(A042));
            return C51965G9l.A0f(new C58186Inq(46, A002, A012));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1220285676);
            }
        }
    }
}
