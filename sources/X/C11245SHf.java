package X;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.SHf  reason: case insensitive filesystem */
public final class C11245SHf {
    public int A00 = -1;
    public boolean A01 = false;
    public long A02 = Long.MIN_VALUE;
    public final ViewGroup A03;
    public final float[] A04 = new float[2];
    public final C10226Rom A05 = new C10226Rom();

    public static void A00(MotionEvent motionEvent, C11245SHf sHf, C20877X2e x2e) {
        if (sHf.A00 == -1) {
            0I1.A04("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        0Sd.A03(!sHf.A01, "Expected to not have already sent a cancel for this gesture");
        int A012 = UIManagerHelper.A01(sHf.A03);
        int i = sHf.A00;
        Integer num = AnonymousClass05K.A0N;
        long j = sHf.A02;
        float[] fArr = sHf.A04;
        float f = fArr[0];
        float f2 = fArr[1];
        x2e.APe(S9E.A00(motionEvent, sHf.A05, num, f, f2, A012, i, j));
    }

    public final void A01(MotionEvent motionEvent, Q6H q6h, C20877X2e x2e) {
        int A012;
        int i;
        Integer num;
        ViewGroup viewGroup;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & 255;
        Q6H q6h2 = q6h;
        C20877X2e x2e2 = x2e;
        if (action == 0) {
            if (this.A00 != -1) {
                0I1.A03("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.A01 = false;
            this.A02 = motionEvent2.getEventTime();
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            viewGroup = this.A03;
            this.A00 = C18797W2f.A00(viewGroup, this.A04, x, y);
            UIManagerHelper.A01(viewGroup);
            if (C18401Vr3.A00.enableEventEmitterRetentionDuringGesturesOnAndroid() && q6h != null) {
                UIManagerHelper.A03(q6h2, 2, true);
            }
        } else if (!this.A01) {
            int i2 = this.A00;
            if (i2 == -1) {
                0I1.A03("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
                return;
            }
            if (action == 1) {
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                ViewGroup viewGroup2 = this.A03;
                float[] fArr = this.A04;
                C18797W2f.A00(viewGroup2, fArr, x2, y2);
                int A013 = UIManagerHelper.A01(viewGroup2);
                int i3 = this.A00;
                Integer num2 = AnonymousClass05K.A01;
                long j = this.A02;
                x2e2.APe(S9E.A00(motionEvent2, this.A05, num2, fArr[0], fArr[1], A013, i3, j));
            } else {
                if (action == 2) {
                    float x3 = motionEvent2.getX();
                    float y3 = motionEvent2.getY();
                    ViewGroup viewGroup3 = this.A03;
                    C18797W2f.A00(viewGroup3, this.A04, x3, y3);
                    A012 = UIManagerHelper.A01(viewGroup3);
                    i = this.A00;
                    num = AnonymousClass05K.A0C;
                } else if (action == 5) {
                    viewGroup = this.A03;
                } else if (action == 6) {
                    A012 = UIManagerHelper.A01(this.A03);
                    i = this.A00;
                    num = AnonymousClass05K.A01;
                } else if (action == 3) {
                    if (this.A05.A00.get((int) motionEvent2.getDownTime(), -1) == -1) {
                        0I1.A03("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                    } else {
                        A00(motionEvent2, this, x2e2);
                    }
                    UIManagerHelper.A01(this.A03);
                } else {
                    0I1.A04("ReactNative", 002.A02(action, i2, "Warning : touch event was ignored. Action=", " Target="));
                    return;
                }
                long j2 = this.A02;
                float[] fArr2 = this.A04;
                x2e2.APe(S9E.A00(motionEvent2, this.A05, num, fArr2[0], fArr2[1], A012, i, j2));
            }
            if (C18401Vr3.A00.enableEventEmitterRetentionDuringGesturesOnAndroid() && q6h != null) {
                UIManagerHelper.A03(q6h2, 2, true);
            }
            this.A00 = -1;
            this.A02 = Long.MIN_VALUE;
            return;
        } else {
            return;
        }
        A012 = UIManagerHelper.A01(viewGroup);
        i = this.A00;
        num = AnonymousClass05K.A00;
        long j22 = this.A02;
        float[] fArr22 = this.A04;
        x2e2.APe(S9E.A00(motionEvent2, this.A05, num, fArr22[0], fArr22[1], A012, i, j22));
    }

    public C11245SHf(ViewGroup viewGroup) {
        this.A03 = viewGroup;
    }
}
