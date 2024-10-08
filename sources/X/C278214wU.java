package X;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.4wU  reason: invalid class name and case insensitive filesystem */
public final class C278214wU extends Handler {
    public final /* synthetic */ PulsingMultiImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C278214wU(Looper looper, PulsingMultiImageView pulsingMultiImageView) {
        super(looper);
        this.A00 = pulsingMultiImageView;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void handleMessage(Message message) {
        ? r2 = this.A00;
        if (!r2.isShown()) {
            r2.A0I();
            return;
        }
        int i = message.what;
        if (i == 0) {
            ValueAnimator valueAnimator = r2.A07;
            float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.end();
            ValueAnimator valueAnimator2 = r2.A08;
            valueAnimator2.setCurrentPlayTime((long) Math.round((1.0f - floatValue) * 400.0f));
            valueAnimator2.start();
        } else if (i == 1) {
            r2.A08.reverse();
        }
    }
}
