package X;

import android.app.Activity;
import android.hardware.Sensor;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Wvh  reason: case insensitive filesystem */
public final class C20600Wvh extends 03J implements 0sL {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20600Wvh(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.VtD> r3 = X.C18514VtD.class
            r1 = 2
            java.lang.String r4 = "handleKeyboardHeightChanged"
            java.lang.String r5 = "handleKeyboardHeightChanged(IZ)V"
        L_0x000c:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.VuX> r3 = X.C18581VuX.class
            r1 = 2
            java.lang.String r4 = "handleProximityChange"
            java.lang.String r5 = "handleProximityChange(Landroid/hardware/Sensor;F)V"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20600Wvh.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            int A0M = AnonymousClass7TE.A0M(obj);
            boolean A1a = AnonymousClass7TE.A1a(obj2);
            C18514VtD vtD = (C18514VtD) this.receiver;
            if (A1a) {
                View view = vtD.A02;
                ViewGroup.MarginLayoutParams A0G = DbX.A0G(view);
                if (A0G.bottomMargin != A0M) {
                    A0G.bottomMargin = A0M;
                    view.requestLayout();
                }
            }
            U91 A002 = C18514VtD.A00(vtD);
            if (!A1a && (A002.A0G.getValue() instanceof UOK)) {
                U91.A05(A002, false, A002.A0B.A00());
            }
        } else {
            Sensor sensor = (Sensor) obj;
            float A04 = AnonymousClass7TE.A04(obj2);
            0qQ.A0B(sensor, 0);
            C18581VuX vuX = (C18581VuX) this.receiver;
            int i = (A04 > Math.min(sensor.getMaximumRange(), 5.0f) ? 1 : (A04 == Math.min(sensor.getMaximumRange(), 5.0f) ? 0 : -1));
            Integer num = vuX.A01;
            if (i >= 0) {
                if (num == AnonymousClass05K.A00) {
                    C18581VuX.A00(vuX);
                }
            } else if (num == AnonymousClass05K.A01) {
                vuX.A06.A05(2);
                vuX.A01 = AnonymousClass05K.A00;
                Activity activity = (Activity) 0mE.A00(vuX.A03, Activity.class);
                if (activity != null) {
                    activity.setVolumeControlStream(0);
                }
                vuX.A08.invoke();
            }
        }
        return C60340gF.A00;
    }
}
