package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggingEvents;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.SelfieTimeoutActivity;
import com.instagram.android.R;

public final class Q7e extends CountDownTimer {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7e(V4I v4i, long j, long j2) {
        super(j, j2);
        this.A01 = v4i;
    }

    public final void onFinish() {
        switch (this.A00) {
            case 0:
                V4I v4i = (V4I) this.A01;
                v4i.A02 = null;
                VLO vlo = v4i.A03;
                if (vlo != null) {
                    vlo.A00.A01(C16482Uvc.A08, (String) null);
                    return;
                }
                return;
            case 1:
                C12061Slo slo = ((C10680RwJ) this.A01).A02;
                slo.A0L.logEvent(SelfieCaptureLoggingEvents.SELFIE_TIMER_ELAPSED);
                C40161AUb aUb = (C40161AUb) slo.A0C.get();
                if (aUb != null) {
                    aUb.A02();
                }
                S3Y s3y = (S3Y) slo.A0D.get();
                if (s3y != null) {
                    s3y.A00();
                }
                ComponentActivity componentActivity = (C13580Td6) slo.A0P.get();
                if (componentActivity != null) {
                    ComponentActivity componentActivity2 = (BaseSelfieCaptureActivity) componentActivity;
                    Intent A0A = C66580MXl.A0A(componentActivity2, SelfieTimeoutActivity.class);
                    A0A.putExtra("selfie_capture_config", componentActivity2.A02());
                    A0A.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, SelfieCaptureStep.CAPTURE);
                    BaseSelfieCaptureActivity.A00(componentActivity2).nextStep = SelfieCaptureStep.TIMEOUT;
                    componentActivity2.startActivityForResult(A0A, 1);
                    return;
                }
                return;
            default:
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(((Fragment) this.A01).getActivity());
                if (A012 != null) {
                    A012.A0B();
                    return;
                }
                return;
        }
    }

    public final void onTick(long j) {
        C13873Tiu tiu;
        Object obj;
        String quantityString;
        if (1 - this.A00 == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C10680RwJ rwJ = (C10680RwJ) this.A01;
            long A0P = AnonymousClass7TE.A0P(elapsedRealtime - rwJ.A00);
            long j2 = 25 - A0P;
            if (j2 < 0) {
                j2 = 0;
            }
            int i = (int) j2;
            if (A0P <= 5) {
                tiu = rwJ.A03;
                obj = C7932Qd3.A00;
            } else {
                int i2 = (((long) i) > 5 ? 1 : (((long) i) == 5 ? 0 : -1));
                tiu = rwJ.A03;
                if (i2 <= 0) {
                    obj = new C7930Qd1(i);
                } else {
                    obj = C7931Qd2.A00;
                }
            }
            C7927Qcy qcy = ((C12282Sqf) tiu).A01.A00;
            Interpolator interpolator = C7927Qcy.A0S;
            TextView textView = qcy.A04;
            if (textView == null) {
                0qQ.A0F("subtitleView");
                throw AnonymousClass00P.createAndThrow();
            }
            if (obj.equals(C7932Qd3.A00)) {
                quantityString = DbU.A05(textView).getString(2131972662);
            } else if (obj.equals(C7931Qd2.A00)) {
                quantityString = "";
            } else if (obj instanceof C7930Qd1) {
                Resources A05 = DbU.A05(textView);
                int i3 = ((C7930Qd1) obj).A00;
                quantityString = A05.getQuantityString(R.plurals.sc_selfie_timer_warning_subtitle, i3, AnonymousClass7TF.A1b(i3));
            } else {
                throw AnonymousClass7TE.A1K();
            }
            textView.setText(quantityString);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7e(C10680RwJ rwJ) {
        super(25000, 250);
        this.A01 = rwJ;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7e(C15374UbS ubS) {
        super(500, 500);
        this.A01 = ubS;
    }
}
