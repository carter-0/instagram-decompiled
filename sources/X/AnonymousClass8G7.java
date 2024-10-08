package X;

import android.os.Message;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.8G7  reason: invalid class name */
public final class AnonymousClass8G7 implements AnonymousClass8G8 {
    public Guideline A00;
    public AnonymousClass88T A01;
    public boolean A02;
    public boolean A03;
    public final C252063oV A04;
    public final int A05;
    public final UserSession A06;

    public AnonymousClass8G7(ViewStub viewStub, UserSession userSession, int i) {
        0qQ.A0B(viewStub, 1);
        0qQ.A0B(userSession, 2);
        this.A06 = userSession;
        this.A05 = i;
        this.A04 = 2b1.A01(viewStub, false, false);
    }

    public final A6C Dy4(A3h a3h) {
        boolean z = false;
        if (!this.A03) {
            z = true;
            this.A02 = true;
            C252063oV r2 = this.A04;
            View requireViewById = r2.getView().requireViewById(R.id.hands_free_timer);
            0qQ.A07(requireViewById);
            CountdownTimerView countdownTimerView = (CountdownTimerView) requireViewById;
            Guideline requireViewById2 = r2.getView().requireViewById(R.id.hands_free_container_guideline);
            this.A00 = requireViewById2;
            if (requireViewById2 != null) {
                float f = 1.0f;
                if (this.A01 == AnonymousClass88T.TABLE_TOP) {
                    f = 0.5f;
                }
                requireViewById2.setGuidelinePercent(f);
            }
            countdownTimerView.A03 = new C40665Agf(a3h);
            GradientSpinner gradientSpinner = countdownTimerView.A04;
            0qQ.A0A(gradientSpinner);
            gradientSpinner.A06();
            0qQ.A0A(gradientSpinner);
            gradientSpinner.setVisibility(0);
            TextView textView = countdownTimerView.A02;
            0qQ.A0A(textView);
            textView.setAlpha(0.0f);
            0qQ.A0A(textView);
            textView.setTextSize(0, (float) countdownTimerView.getResources().getDimensionPixelSize(R.dimen.abc_star_medium));
            0qQ.A0A(textView);
            textView.setVisibility(0);
            int i = countdownTimerView.A00;
            AnonymousClass8JB r0 = new AnonymousClass8JB(new C40683Agx(countdownTimerView), new C40684Agy(countdownTimerView), i, IgNetworkConsentStorage.MAX_ENTRIES);
            countdownTimerView.A05 = r0;
            r0.A02.sendMessage(Message.obtain());
        }
        return new A6C("", this.A05, z);
    }

    public final String getName() {
        return "HandsFreeFormatController";
    }
}
