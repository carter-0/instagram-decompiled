package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.3O7  reason: invalid class name */
public abstract class AnonymousClass3O7 extends View {
    private final ShimmerFrameLayout A00(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof ShimmerFrameLayout) {
            return (ShimmerFrameLayout) parent;
        }
        if (parent instanceof View) {
            return A00((View) parent);
        }
        return null;
    }

    public final void onAttachedToWindow() {
        ShimmerFrameLayout A00;
        int A06 = AnonymousClass0fD.A06(156275885);
        super.onAttachedToWindow();
        if (1Jk.A07 && (A00 = A00(this)) != null) {
            C240693Lw.A00.A00(A00);
        }
        AnonymousClass0fD.A0D(-319410261, A06);
    }

    public final void onDetachedFromWindow() {
        ShimmerFrameLayout A00;
        int A06 = AnonymousClass0fD.A06(283001980);
        super.onDetachedFromWindow();
        if (1Jk.A07 && (A00 = A00(this)) != null) {
            C240693Lw.A00.A01(A00);
        }
        AnonymousClass0fD.A0D(-123686011, A06);
    }
}
