package X;

import android.widget.TextView;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;

/* renamed from: X.Agy  reason: case insensitive filesystem */
public final class C40684Agy implements AnonymousClass8J8 {
    public final /* synthetic */ CountdownTimerView A00;

    public C40684Agy(CountdownTimerView countdownTimerView) {
        this.A00 = countdownTimerView;
    }

    public final void DrY(int i) {
        CountdownTimerView countdownTimerView = this.A00;
        TextView textView = countdownTimerView.A02;
        0qQ.A0A(textView);
        textView.setText(String.valueOf(i));
        0qQ.A0A(textView);
        textView.animate().alpha(1.0f).setDuration(400).withEndAction(new C40897Al5(countdownTimerView));
    }
}
