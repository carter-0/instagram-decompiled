package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggerActivity;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;

/* renamed from: X.Qcp  reason: case insensitive filesystem */
public abstract class C7918Qcp extends QCA {
    public SelfieCaptureLogger A00;

    public final void A03(Integer num) {
        String str;
        float f;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        C7927Qcy qcy = (C7927Qcy) this;
        if (num != qcy.A0C) {
            qcy.A0C = num;
            FaceCaptureProgressView faceCaptureProgressView = qcy.A09;
            if (faceCaptureProgressView != null) {
                faceCaptureProgressView.A03();
                C7927Qcy.A01(qcy.A06, qcy, num);
                Integer num2 = AnonymousClass05K.A0Y;
                FaceCaptureProgressView faceCaptureProgressView2 = qcy.A09;
                if (num == num2) {
                    if (faceCaptureProgressView2 != null) {
                        f = 1.0f;
                    }
                } else if (faceCaptureProgressView2 != null) {
                    f = 0.0f;
                }
                ObjectAnimator objectAnimator = faceCaptureProgressView2.A01;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(faceCaptureProgressView2, FaceCaptureProgressView.A0K, new float[]{f}).setDuration(250);
                faceCaptureProgressView2.A01 = duration2;
                0qQ.A0A(duration2);
                duration2.addListener(new C7345Q4x(faceCaptureProgressView2, 3));
                ObjectAnimator objectAnimator2 = faceCaptureProgressView2.A01;
                0qQ.A0A(objectAnimator2);
                objectAnimator2.start();
                ArrowHintView arrowHintView = qcy.A08;
                if (arrowHintView == null) {
                    str = "arrowHintView";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                ViewPropertyAnimator animate = arrowHintView.animate();
                if (animate != null && (alpha = animate.alpha(f)) != null && (duration = alpha.setDuration(250)) != null) {
                    duration.start();
                    return;
                }
                return;
            }
            str = "captureProgressView";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof SelfieCaptureLoggerActivity) {
            this.A00 = ((SelfieCaptureLoggerActivity) context).getLogger();
        }
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(1549287516);
        C7918Qcp.super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(1400291696, A02);
    }
}
