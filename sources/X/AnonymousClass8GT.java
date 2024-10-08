package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.VibrationEffect;
import android.view.ViewConfiguration;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8GT  reason: invalid class name */
public final class AnonymousClass8GT implements AnonymousClass8GU {
    public float A00;
    public float A01;
    public C340297l2 A02;
    public final Rect A03;
    public final VibrationEffect A04;
    public final ViewConfiguration A05;
    public final AnonymousClass8GD A06;
    public final AnonymousClass82X A07;
    public final C3503684j A08;
    public final AtomicReference A09 = new AtomicReference(AnonymousClass8GV.NORMAL);
    public final AnonymousClass4CZ A0A = AnonymousClass12T.A00.A04;
    public final C262224Cq A0B;
    public final UserSession A0C;

    public AnonymousClass8GT(Rect rect, ViewConfiguration viewConfiguration, AnonymousClass07Z r6, AnonymousClass82X r7, UserSession userSession, C3503684j r9) {
        VibrationEffect vibrationEffect;
        0qQ.A0B(viewConfiguration, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r7, 5);
        0qQ.A0B(r6, 6);
        this.A05 = viewConfiguration;
        this.A0C = userSession;
        this.A03 = rect;
        this.A08 = r9;
        this.A07 = r7;
        if (Build.VERSION.SDK_INT >= 29) {
            vibrationEffect = VibrationEffect.createPredefined(5);
        } else {
            vibrationEffect = null;
        }
        this.A04 = vibrationEffect;
        this.A06 = new AnonymousClass8GW(this);
        this.A0B = C71772f0.A00(r6.getLifecycle());
    }

    public static final void A01(C340297l2 r6, AnonymousClass8GT r7, float f) {
        AnonymousClass8GT r3 = r7;
        if (r7.A09.get() != AnonymousClass8GV.STUCK) {
            C340297l2 r4 = r6;
            r6.A0S(false);
            float f2 = -0.0075f + f;
            1Eo.A05(r7.A0A, new C41545AwB(r3, r4, (AnonymousClass4D7) null, f2, 1), r7.A0B);
            0mp.A06("Easing from %f to %f smooth zoom", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
        }
    }

    public static final void A02(C340297l2 r7, AnonymousClass8GT r8, long j) {
        C340297l2 r3 = r7;
        if (!r7.A0V()) {
            1Eo.A05(r8.A0A, new MGF(r3, r8, (AnonymousClass4D7) null, 4, j), r8.A0B);
        }
    }

    public static final C340297l2 A00(AnonymousClass8GT r3, String str) {
        if (r3.A02 == null) {
            0kD.A0I(002.A0R("CameraZoomController - cameraController is unexpectedly null at ", str), (Throwable) null, 0Yt.A0E());
        }
        return r3.A02;
    }

    public final void DAk(float f) {
        if (this.A09.get() == AnonymousClass8GV.NORMAL) {
            IgCameraEffectsController igCameraEffectsController = this.A07.A05;
            CameraAREffect cameraAREffect = igCameraEffectsController.A09;
            if (cameraAREffect == null || cameraAREffect.A0Z.get("worldTracker") == null) {
                C340297l2 A002 = A00(this, "onDragZoomPercent()");
                if (A002 != null) {
                    float f2 = this.A00;
                    C340547lR r0 = ((BasicCameraOutputController) C340297l2.A02(A002)).A04;
                    if (r0 != null) {
                        r0.A0N.ErA(f2, f);
                    }
                    this.A01 = f;
                    return;
                }
                return;
            }
            float f3 = f + 1.0f;
            AnonymousClass6e9 r02 = igCameraEffectsController.A02;
            if (r02 != null) {
                r02.setZoomFactor(f3);
            }
        }
    }
}
