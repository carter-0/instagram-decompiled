package X;

import android.animation.Animator;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.android.R;

/* renamed from: X.Vcj  reason: case insensitive filesystem */
public final class C17714Vcj {
    public float A00;
    public float A01;
    public float A02 = 2.0f;
    public C17214VMs A03;
    public Float A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public final float A08;
    public final int A09;
    public final Animator.AnimatorListener A0A = new W3z(this, 1);
    public final VelocityTracker A0B;
    public final View A0C;
    public final View A0D;

    public C17714Vcj(View view, View view2, Integer num) {
        this.A0D = view;
        this.A0C = view2;
        this.A05 = num;
        Context context = view.getContext();
        this.A0B = VelocityTracker.obtain();
        this.A08 = (float) context.getResources().getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A09 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
