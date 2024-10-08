package X;

import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.M4r  reason: case insensitive filesystem */
public final class C65928M4r implements Runnable {
    public final /* synthetic */ C61363K4f A00;

    public C65928M4r(C61363K4f k4f) {
        this.A00 = k4f;
    }

    public final void run() {
        String str;
        C61363K4f k4f = this.A00;
        ShimmerFrameLayout shimmerFrameLayout = k4f.A0A;
        if (shimmerFrameLayout == null) {
            str = "headerGlassesDeviceNameShimmer";
        } else {
            shimmerFrameLayout.A03();
            ShimmerFrameLayout shimmerFrameLayout2 = k4f.A0C;
            if (shimmerFrameLayout2 == null) {
                str = "headerGlassesModelNameShimmer";
            } else {
                shimmerFrameLayout2.A03();
                ShimmerFrameLayout shimmerFrameLayout3 = k4f.A0B;
                if (shimmerFrameLayout3 == null) {
                    str = "headerGlassesImageShimmer";
                } else {
                    shimmerFrameLayout3.A03();
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
