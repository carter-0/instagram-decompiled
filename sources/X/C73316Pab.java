package X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

/* renamed from: X.Pab  reason: case insensitive filesystem */
public final /* synthetic */ class C73316Pab implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ AnonymousClass768 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C73316Pab(TextView textView, AnonymousClass768 r2, String str) {
        this.A01 = r2;
        this.A00 = textView;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass768 r4 = this.A01;
        TextView textView = this.A00;
        String str = this.A02;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(125);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setAnimationListener(new C71454Okt(r4, str));
        textView.startAnimation(scaleAnimation);
        AnonymousClass2S0.A01.A03();
    }
}
