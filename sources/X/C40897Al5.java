package X;

import android.widget.TextView;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;

/* renamed from: X.Al5  reason: case insensitive filesystem */
public final class C40897Al5 implements Runnable {
    public final /* synthetic */ CountdownTimerView A00;

    public C40897Al5(CountdownTimerView countdownTimerView) {
        this.A00 = countdownTimerView;
    }

    public final void run() {
        TextView textView = this.A00.A02;
        0qQ.A0A(textView);
        textView.animate().alpha(0.0f).setDuration(400);
    }
}
