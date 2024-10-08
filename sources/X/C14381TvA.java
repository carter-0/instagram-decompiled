package X;

import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.TvA  reason: case insensitive filesystem */
public abstract class C14381TvA extends C232222tE {
    public final boolean A00;

    /* renamed from: A00 */
    public void bind(C14424Tvt tvt, C15812Uiv uiv) {
        0qQ.A0B(tvt, 1);
        boolean z = this.A00;
        ShimmerFrameLayout shimmerFrameLayout = tvt.A00;
        if (z) {
            shimmerFrameLayout.post(new C20019Wjf(tvt));
        } else {
            shimmerFrameLayout.A02();
        }
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        C14424Tvt tvt = (C14424Tvt) r2;
        0qQ.A0B(tvt, 0);
        tvt.A00.A03();
    }

    public C14381TvA(boolean z) {
        this.A00 = z;
    }
}
