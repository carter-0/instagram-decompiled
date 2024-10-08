package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.3Ny  reason: invalid class name and case insensitive filesystem */
public final class C241123Ny {
    public static final C241123Ny A00 = new Object();

    public final ShimmerFrameLayout A01(Context context, ViewGroup viewGroup) {
        0qQ.A0B(context, 0);
        ShimmerFrameLayout A002 = A00(context, viewGroup);
        C14422Tvr tvr = new C14422Tvr(context);
        tvr.setLayoutType(C14411Tvf.TWO_BY_TWO);
        tvr.setLayoutParams(new ViewGroup.LayoutParams(-1, Resources.getSystem().getDisplayMetrics().heightPixels));
        A002.addView(tvr);
        return A002;
    }

    public final ShimmerFrameLayout A02(Context context, ViewGroup viewGroup) {
        0qQ.A0B(context, 0);
        C389179p1 r4 = new C389179p1(context);
        r4.setBackgroundColor(2Yu.A0F(context, R.attr.actionBarBackgroundColor));
        View inflate = LayoutInflater.from(context).inflate(R.layout.shimmer_header_layout, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        r4.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) 0nA.A04(context, 44)));
        shimmerFrameLayout.addView(r4);
        return shimmerFrameLayout;
    }

    public static final ShimmerFrameLayout A00(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shimmer_content_layout, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        return (ShimmerFrameLayout) inflate;
    }
}
