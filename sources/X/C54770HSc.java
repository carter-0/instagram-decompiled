package X;

import android.content.Context;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.HSc  reason: case insensitive filesystem */
public abstract class C54770HSc {
    public static final void A00(ShimmerFrameLayout shimmerFrameLayout, Integer num) {
        0qQ.A0B(shimmerFrameLayout, 0);
        AnonymousClass3O3 r3 = new AnonymousClass3O3();
        AnonymousClass2E0.A0A();
        Context A0S = AnonymousClass7TE.A0S(shimmerFrameLayout);
        float f = 0.06f;
        if (AnonymousClass3HA.A00(A0S)) {
            f = 0.15f;
        }
        r3.A02(f);
        AnonymousClass2E0.A0A();
        float f2 = 0.02f;
        if (AnonymousClass3HA.A00(A0S)) {
            f2 = 0.1f;
        }
        r3.A03(f2);
        shimmerFrameLayout.A04(r3.A01());
        if (num != null) {
            shimmerFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new WCB(0, shimmerFrameLayout, num));
        }
    }
}
