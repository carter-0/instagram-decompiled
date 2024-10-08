package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class W1R {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public 2dZ A0D;
    public C17934ViP A0E;
    public UZ2 A0F;
    public String A0G = "";
    public String A0H = "";
    public boolean A0I = false;
    public boolean A0J;
    public final int A0K;
    public final ValueAnimator A0L;
    public final ColorDrawable A0M;
    public final ColorDrawable A0N;
    public final Drawable A0O;
    public final Drawable A0P;
    public final Drawable A0Q;
    public final Drawable A0R;
    public final VOF A0S = new VOF(this);
    public final UZ2 A0T;
    public final int A0U;
    public final Activity A0V;
    public final AnonymousClass4DS A0W = new FTS(this, 3);
    public final UserSession A0X;

    public static void A00(Context context, W1R w1r) {
        int A022 = 0nH.A02(w1r.A00, context.getColor(w1r.A0T.A00()), w1r.A0U);
        int A052 = AnonymousClass7TE.A05(w1r.A00, 255.0f);
        ColorFilter A002 = AnonymousClass37O.A00(A022);
        w1r.A0O.setColorFilter(A002);
        w1r.A0P.setColorFilter(A002);
        w1r.A0R.setColorFilter(A002);
        w1r.A0Q.setColorFilter(A002);
        w1r.A0M.setAlpha(A052);
        w1r.A0N.setAlpha(A052);
        View view = w1r.A05;
        if (view != null) {
            float alpha = view.getAlpha();
            float f = w1r.A00;
            if (alpha != f) {
                view.setAlpha(f);
            }
        }
    }

    public static void A01(W1R w1r) {
        if (w1r.A0I) {
            int i = w1r.A03;
            if (i <= w1r.A02) {
                ValueAnimator valueAnimator = w1r.A0L;
                if (!valueAnimator.isRunning() && Float.compare(w1r.A00, 1.0f) == 0) {
                    valueAnimator.reverse();
                }
            } else if (i >= w1r.A01) {
                ValueAnimator valueAnimator2 = w1r.A0L;
                if (!valueAnimator2.isRunning() && Float.compare(w1r.A00, 0.0f) == 0) {
                    valueAnimator2.start();
                }
            }
        }
    }

    public static void A02(W1R w1r) {
        View view = w1r.A07;
        int i = 4;
        if (view != null) {
            int i2 = 0;
            if (w1r.A0J) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
        View view2 = w1r.A08;
        if (view2 != null) {
            if (!w1r.A0J) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    public final void A03() {
        if (this.A0D != null) {
            A00(this.A0V, this);
            this.A0D.A0X(this.A0W);
        }
    }

    public W1R(Activity activity, UserSession userSession, C17934ViP viP, UZ2 uz2) {
        this.A0V = activity;
        this.A0E = viP;
        this.A0U = activity.getColor(2Yu.A0B(activity));
        int A002 = 2db.A00(activity);
        this.A0K = A002;
        this.A0M = new ColorDrawable(AnonymousClass7TF.A03(activity, R.attr.igds_color_secondary_background));
        this.A0N = new ColorDrawable(A002);
        int A003 = uz2.A00();
        this.A0O = AnonymousClass3JT.A08(activity, R.drawable.instagram_x_pano_outline_24, A003, R.drawable.instagram_x_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0R = AnonymousClass3JT.A08(activity, R.drawable.instagram_direct_pano_outline_24, A003, R.drawable.instagram_direct_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0Q = AnonymousClass3JT.A08(activity, R.drawable.instagram_more_vertical_pano_outline_24, A003, R.drawable.instagram_more_vertical_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0P = AnonymousClass3JT.A08(activity, R.drawable.instagram_info_pano_outline_24, A003, R.drawable.instagram_info_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0L = ofFloat;
        ofFloat.setDuration(200);
        this.A0X = userSession;
        this.A0T = uz2;
    }
}
