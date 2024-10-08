package X;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;

/* renamed from: X.QbP  reason: case insensitive filesystem */
public final class C7842QbP extends W0S {
    public static final 0l2 A05 = new 0l2(3);
    public float A00;
    public float A01;
    public MotionEvent A02;
    public Integer A03;
    public short A04;

    public final void A0B(RCTEventEmitter rCTEventEmitter) {
        0qQ.A0B(rCTEventEmitter, 0);
        if (this.A02 == null) {
            ReactSoftExceptionLogger.logSoftException("TouchEvent", AnonymousClass7TE.A0z("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            SKV.A00(rCTEventEmitter, this);
        }
    }

    public final void A0C(RCTModernEventEmitter rCTModernEventEmitter) {
        0qQ.A0B(rCTModernEventEmitter, 0);
        if (this.A02 == null) {
            ReactSoftExceptionLogger.logSoftException("TouchEvent", AnonymousClass7TE.A0z("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    public final int A04() {
        Integer num = this.A03;
        if (num == null) {
            return 2;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1 || intValue == 3) {
            return 1;
        }
        if (intValue == 2) {
            return 4;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final String A07() {
        Integer num = this.A03;
        0Sd.A00(num);
        0qQ.A07(num);
        return S9F.A00(num);
    }

    public final short A08() {
        return this.A04;
    }

    public final void A09() {
        MotionEvent motionEvent = this.A02;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.A02 = null;
        try {
            A05.ECR(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("TouchEvent", e);
        }
    }

    public final boolean A0D() {
        Integer num = this.A03;
        0Sd.A00(num);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0 || intValue == 1 || intValue == 3) {
                return false;
            }
            if (intValue == 2) {
                return true;
            }
        }
        throw Pxg.A0k("Unknown touch event type: ", C9547Rck.A00(this.A03));
    }
}
