package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5F8  reason: invalid class name */
public abstract class AnonymousClass5F8 implements View.OnTouchListener {
    public final 0lg A00;
    public final boolean A01;

    public boolean A00(View view, MotionEvent motionEvent) {
        int i;
        AnonymousClass5F7 r0 = (AnonymousClass5F7) this;
        C258383yv r9 = r0.A02;
        C254073rt r7 = r0.A01;
        C282815Ev r10 = r0.A00;
        AnonymousClass3W1 r6 = r0.A03;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            View view2 = r7.A0I;
            view2.setVisibility(0);
            AnonymousClass3z3 r02 = r7.A0U;
            boolean z = r6.A29;
            AnonymousClass3z2 r03 = r02.A00;
            if (z) {
                i = r03.A07;
            } else {
                i = r03.A08;
            }
            view2.setBackgroundColor(i);
            return true;
        } else if (actionMasked != 1) {
            if (actionMasked == 3) {
                r7.A0I.setVisibility(8);
            }
            return true;
        } else {
            r7.A0I.setVisibility(8);
            C258403yx r8 = r9.A03;
            1Xj r5 = r10.A02;
            0qQ.A0B(r5, 1);
            r8.A01(C58409IrS.A00);
            02m r3 = r8.A00;
            if (r3 != null) {
                r3.markerStart(1056313521);
                r3.markerAnnotate(1056313521, "ui_framework", "NATIVE");
            }
            C258403yx.A00(r8, r5);
            r10.A00.A09.invoke(r9.A02, r6, r7, motionEvent);
            return true;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C238863Ds r0;
        C55951HqF hqF;
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        if (this.A01 && motionEvent.getActionMasked() == 1) {
            C238833Dp A002 = C238833Dp.A00(this.A00);
            0qQ.A07(A002);
            if (this instanceof AnonymousClass5F7) {
                AnonymousClass5F7 r5 = (AnonymousClass5F7) this;
                C282815Ev r1 = r5.A00;
                if (r1.A09) {
                    hqF = new C55951HqF(C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON);
                    hqF.A01 = Integer.valueOf(r5.A03.A03);
                } else {
                    if (r1.A05 == AnonymousClass47L.AD_DESTINATION_AR_CAMERA) {
                        r0 = C238863Ds.AR_ADS_OPEN_CAMERA;
                    } else {
                        r0 = C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON;
                    }
                    hqF = new C55951HqF(r0);
                }
                A002.A09(view, hqF.A00(), new String[0], 1);
            } else {
                A002.A0B(view, new String[0]);
            }
        }
        return A00(view, motionEvent);
    }

    public AnonymousClass5F8(0lg r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
