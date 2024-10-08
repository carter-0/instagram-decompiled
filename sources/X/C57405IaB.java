package X;

import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.IaB  reason: case insensitive filesystem */
public final class C57405IaB implements C234382xm {
    public final /* synthetic */ HnY A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final void Dgt(C253913rc r1) {
    }

    public C57405IaB(HnY hnY) {
        this.A00 = hnY;
    }

    public final boolean Dgo(C253913rc r15) {
        Object obj;
        HnY hnY = this.A00;
        C234342xi r7 = hnY.A01;
        if (r7.A02()) {
            return true;
        }
        HnW hnW = hnY.A02;
        String str = hnW.A03;
        C267324bN r5 = hnW.A02.A06;
        if (GFN.A00(r5)) {
            obj = hnW.A01.A00;
        } else {
            obj = null;
        }
        String A0R = 002.A0R("clips_zoomable_container_", str);
        if (obj != null) {
            StringBuilder A0n = AnonymousClass7TF.A0n(A0R);
            A0n.append('_');
            A0R = AnonymousClass7TF.A0i(obj, A0n);
        }
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) hnW.A00.A05.A03(A0R);
        if (simpleZoomableViewContainer == null) {
            0f9 AEf = 0wj.A01.AEf("ig_android_reels_empty_zoomable_container", 307496533);
            AEf.ABQ("isCarouselOrganic", String.valueOf(GFN.A00(r5)));
            AEf.ABQ("carouselIndex", String.valueOf(C51970G9q.A09(hnW.A01)));
            AEf.ABQ("tag", String.valueOf(A0R));
            AEf.report();
            return true;
        }
        r7.A01(AnonymousClass046.A00(simpleZoomableViewContainer, 0), simpleZoomableViewContainer, (1Xj) null, hnY.A00, 0, 0);
        return true;
    }
}
