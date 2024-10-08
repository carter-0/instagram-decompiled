package X;

import android.view.MotionEvent;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class SKV {
    public static void A00(RCTEventEmitter rCTEventEmitter, C7842QbP qbP) {
        Integer num = qbP.A03;
        0Sd.A00(num);
        0qQ.A07(num);
        C13948Tm8[] A01 = A01(qbP);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (C13948Tm8 tm8 : A01) {
            if (tm8 != null) {
                writableNativeArray.pushMap(tm8);
            }
        }
        MotionEvent motionEvent = qbP.A02;
        0Sd.A00(motionEvent);
        0qQ.A07(motionEvent);
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                writableNativeArray2.pushInt(i);
            }
        } else if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            writableNativeArray2.pushInt(motionEvent.getActionIndex());
        } else {
            throw Pxg.A0k("Unknown touch type: ", C9547Rck.A00(num));
        }
        rCTEventEmitter.receiveTouches(S9F.A00(num), writableNativeArray, writableNativeArray2);
    }

    public static C13948Tm8[] A01(C7842QbP qbP) {
        MotionEvent motionEvent = qbP.A02;
        0Sd.A00(motionEvent);
        0qQ.A07(motionEvent);
        C13948Tm8[] tm8Arr = new C13948Tm8[motionEvent.getPointerCount()];
        float x = motionEvent.getX() - qbP.A00;
        float y = motionEvent.getY() - qbP.A01;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            WritableNativeMap A0U = Pxe.A0U();
            A0U.putDouble("pageX", (double) W2U.A00(motionEvent.getX(i)));
            A0U.putDouble("pageY", (double) W2U.A00(motionEvent.getY(i)));
            A0U.putDouble("locationX", (double) W2U.A00(motionEvent.getX(i) - x));
            A0U.putDouble("locationY", (double) W2U.A00(motionEvent.getY(i) - y));
            A0U.putInt("targetSurface", qbP.A00);
            A0U.putInt("target", qbP.A02);
            A0U.putDouble("timestamp", (double) qbP.A03);
            A0U.putDouble("identifier", (double) motionEvent.getPointerId(i));
            tm8Arr[i] = A0U;
        }
        return tm8Arr;
    }
}
