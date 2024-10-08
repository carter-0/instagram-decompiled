package X;

import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.smartcapture.view.HelpButton;
import com.instagram.android.R;

/* renamed from: X.TCo  reason: case insensitive filesystem */
public final class C12900TCo implements Runnable {
    public final /* synthetic */ C7927Qcy A00;

    public C12900TCo(C7927Qcy qcy) {
        this.A00 = qcy;
    }

    public final void run() {
        String str;
        C7927Qcy qcy = this.A00;
        Interpolator interpolator = C7927Qcy.A0S;
        HelpButton helpButton = qcy.A0A;
        if (helpButton == null) {
            str = "helpButton";
        } else {
            Handler handler = helpButton.A04;
            Runnable runnable = helpButton.A05;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            View view = qcy.A00;
            if (view == null) {
                str = "rootView";
            } else {
                View A002 = SKW.A00(view, R.id.placeholder);
                C51972G9s.A0I(A002).setDuration(300).setListener(new C7345Q4x(A002, 1));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
