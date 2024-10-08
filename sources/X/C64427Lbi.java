package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.arlink.ui.NametagCardHintView;
import java.util.Arrays;

/* renamed from: X.Lbi  reason: case insensitive filesystem */
public final class C64427Lbi implements C3497181l {
    public final int A00;
    public final Object A01;

    public C64427Lbi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DDD(Exception exc) {
        if (this.A00 != 0) {
            C59867Jal jal = (C59867Jal) this.A01;
            jal.A0C = true;
            C59867Jal.A03(jal);
            AnonymousClass7TF.A19(0wj.A01.AEf("InAppCaptureView.CameraInitialisationError", 817904119), DialogModule.KEY_MESSAGE, "An exception occurred attempting to connect the camera.", exc);
        } else if (exc != null) {
            0wb.A03("Camera initialization failure.", Arrays.deepToString(exc.getStackTrace()));
        }
    }

    public final void DKf(C343367q6 r7) {
        if (this.A00 != 0) {
            C59867Jal jal = (C59867Jal) this.A01;
            C340297l2 r2 = jal.A0Y;
            r2.A0J(new K04(jal, 5));
            jal.A0A = Integer.valueOf(r7.A01);
            jal.A0b.setBackground((Drawable) null);
            Integer num = jal.A0A;
            boolean z = true;
            if (num == null || 1 != num.intValue()) {
                z = false;
            }
            int i = 0;
            if (z) {
                r2.A0K(jal.A0V, 0);
            } else {
                1Av A002 = 1Au.A00(jal.A0a);
                if (C378899Rq.A00(DbV.A13(A002, A002.A1I, 1Av.A8a, 25)) != 0) {
                    i = 1;
                    if (jal.A06 == C59893JbI.CAMCORDER) {
                        i = 3;
                    }
                }
                jal.setFlashMode(i);
            }
            C59867Jal.A04(jal);
            return;
        }
        KB1 kb1 = (KB1) this.A01;
        synchronized (kb1) {
            if (kb1.A02 == null) {
                kb1.A02 = new LP6(kb1, kb1.A0R, kb1.A0S);
            }
            Activity activity = kb1.A0H;
            if (!C61970qY.A0E(activity)) {
                Dialog dialog = kb1.A00;
                if (dialog == null) {
                    C358248ab A0X = DbS.A0X(activity);
                    A0X.A09(2131968399);
                    A0X.A08(2131971018);
                    A0X.A0I((DialogInterface.OnClickListener) null, 2131960862);
                    dialog = A0X.A02();
                    kb1.A00 = dialog;
                }
                if (!dialog.isShowing()) {
                    AnonymousClass0fN.A00(kb1.A00);
                }
            }
            kb1.A02.A02();
            NametagCardHintView nametagCardHintView = kb1.A0Q;
            if (nametagCardHintView.getVisibility() == 4) {
                nametagCardHintView.setVisibility(0);
                C71392co r0 = C315596kB.A02;
                C294975nL A012 = C294975nL.A01(nametagCardHintView, 0);
                A012.A0M(0.0f, 1.0f);
                A012.A0A().A0H();
            }
        }
        kb1.A07();
    }
}
