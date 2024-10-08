package X;

import com.instagram.ui.widget.countdowntimer.CountdownTimerView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Agx  reason: case insensitive filesystem */
public final class C40683Agx implements AnonymousClass8JA {
    public final /* synthetic */ CountdownTimerView A00;

    public C40683Agx(CountdownTimerView countdownTimerView) {
        this.A00 = countdownTimerView;
    }

    public final void onFinish() {
        CountdownTimerView countdownTimerView = this.A00;
        C41783B0m b0m = countdownTimerView.A03;
        if (b0m != null) {
            C353118Gi.A01(((C40665Agf) b0m).A00.A00);
        }
        GradientSpinner gradientSpinner = countdownTimerView.A04;
        0qQ.A0A(gradientSpinner);
        gradientSpinner.A08();
        0qQ.A0A(gradientSpinner);
        gradientSpinner.setVisibility(8);
    }
}
