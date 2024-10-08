package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.instagram.android.R;

public final class LtB implements MXF {
    public static final String __redex_internal_original_name = "MediaKitActionBarHolder";
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public TextView A08;
    public AppBarLayout A09;
    public CollapsingToolbarLayout A0A;
    public 2dZ A0B;
    public C62466KgG A0C = C62466KgG.VIEW;
    public LCA A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final ValueAnimator A0I;
    public final Drawable A0J;
    public final Drawable A0K;
    public final AnonymousClass4DS A0L;
    public final L9D A0M;
    public final int A0N;
    public final AnonymousClass0iw A0O;
    public final LDW A0P;

    public LtB(Context context, AnonymousClass0iw r5, LDW ldw, L9D l9d, LCA lca, int i) {
        0qQ.A0B(ldw, 5);
        this.A0G = i;
        this.A0D = lca;
        this.A0M = l9d;
        this.A0O = r5;
        this.A0P = ldw;
        this.A0H = context.getColor(R.color.fds_transparent);
        this.A0J = AnonymousClass3JT.A08(context, R.drawable.instagram_x_pano_outline_24, R.color.design_dark_default_color_on_background, R.drawable.instagram_x_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0K = AnonymousClass3JT.A08(context, R.drawable.instagram_more_vertical_pano_outline_24, R.color.design_dark_default_color_on_background, R.drawable.instagram_more_vertical_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0N = context.getColor(2Yu.A0B(context));
        this.A0E = context.getColor(2Yu.A0D(context));
        this.A0F = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_button_on_media);
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        0qQ.A07(ofFloat);
        this.A0I = ofFloat;
        this.A0L = new C64465LcS(0, context, this);
    }

    public static final void A00(LtB ltB) {
        String str;
        int A022 = 0nH.A02(ltB.A00, -1, ltB.A0N);
        ColorFilter A002 = AnonymousClass37O.A00(A022);
        ltB.A0J.setColorFilter(A002);
        ltB.A0K.setColorFilter(A002);
        View view = ltB.A03;
        if (view == null) {
            str = "actionBarDimmer";
        } else {
            view.setAlpha(ltB.A00);
            View view2 = ltB.A05;
            if (view2 == null) {
                str = "statusBarBackground";
            } else {
                view2.setAlpha(ltB.A00);
                View view3 = ltB.A04;
                if (view3 != null) {
                    float alpha = view3.getAlpha();
                    float f = ltB.A00;
                    if (alpha != f) {
                        View view4 = ltB.A04;
                        if (view4 != null) {
                            view4.setAlpha(f);
                        }
                    }
                    TextView textView = ltB.A07;
                    if (textView == null) {
                        str = "actionBarTitle";
                    } else {
                        textView.setTextColor(A022);
                        return;
                    }
                }
                0qQ.A0F("actionBarShadow");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final LDW BO3() {
        return this.A0P;
    }

    public final String getModuleName() {
        return this.A0O.getModuleName();
    }
}
