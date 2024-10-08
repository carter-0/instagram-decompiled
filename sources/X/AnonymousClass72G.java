package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.Animation;
import com.instagram.android.R;

/* renamed from: X.72G  reason: invalid class name */
public final class AnonymousClass72G implements Animation.AnimationListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ boolean A02;

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public AnonymousClass72G(Context context, View view, boolean z) {
        this.A01 = view;
        this.A00 = context;
        this.A02 = z;
    }

    public final void onAnimationStart(Animation animation) {
        View view = this.A01;
        if (view != null) {
            Context context = this.A00;
            view.setElevation(0nA.A04(context, 4));
            if (!this.A02) {
                view.setBackground(new ColorDrawable(2Yu.A0F(context, R.attr.igds_color_primary_background)));
            }
        }
    }
}
