package X;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.DecelerateInterpolator;
import com.instagram.ui.widget.emitter.PulseEmitter;
import java.util.List;

/* renamed from: X.4wS  reason: invalid class name and case insensitive filesystem */
public final class C278204wS extends Handler {
    public final /* synthetic */ PulseEmitter A00;

    public final void handleMessage(Message message) {
        ValueAnimator duration;
        0qQ.A0B(message, 0);
        if (message.what == 0) {
            PulseEmitter pulseEmitter = this.A00;
            if (pulseEmitter.isShown()) {
                int[] iArr = PulseEmitter.A09;
                List list = pulseEmitter.A02;
                if (!list.isEmpty()) {
                    duration = (ValueAnimator) list.remove(0);
                    duration.setCurrentPlayTime(0);
                } else {
                    duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(2000);
                    duration.setInterpolator(new DecelerateInterpolator());
                    duration.addListener(new C278244wX(duration, pulseEmitter));
                    duration.addUpdateListener(new C278254wY(pulseEmitter));
                }
                pulseEmitter.A03.add(duration);
                duration.start();
                sendEmptyMessageDelayed(0, 800);
                return;
            }
            pulseEmitter.A02();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C278204wS(Looper looper, PulseEmitter pulseEmitter) {
        super(looper);
        this.A00 = pulseEmitter;
    }
}
