package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import java.util.List;

public final class WCW implements Animation.AnimationListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C14669U0p A02;
    public final /* synthetic */ AnonymousClass7NX A03;
    public final /* synthetic */ U3J A04;
    public final /* synthetic */ boolean A05;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public WCW(Context context, View view, C14669U0p u0p, AnonymousClass7NX r4, U3J u3j, boolean z) {
        this.A05 = z;
        this.A00 = context;
        this.A04 = u3j;
        this.A01 = view;
        this.A02 = u0p;
        this.A03 = r4;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.A05) {
            Context context = this.A00;
            0qQ.A0A(context);
            Object systemService = context.getSystemService("vibrator");
            0qQ.A0C(systemService, C273654mx.A00(347));
            ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(50, 150));
        }
        U3J u3j = this.A04;
        View view = this.A01;
        C14669U0p u0p = this.A02;
        List A0a = 00k.A0a(u0p.A0H);
        int[] iArr = new int[2];
        u3j.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int i = iArr2[0];
        u3j.A01.add(new VR3(new RectF((float) i, (float) (iArr2[1] - iArr[1]), (float) (i + view.getWidth()), (float) ((iArr2[1] + view.getHeight()) - iArr[1])), 00k.A0a(A0a)));
        u3j.invalidate();
        OvershootInterpolator overshootInterpolator = this.A03.A00;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.0f, 0.95f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(400);
        scaleAnimation.setInterpolator(overshootInterpolator);
        view.startAnimation(scaleAnimation);
        u0p.A0G.clear();
        u0p.invalidateSelf();
    }
}
