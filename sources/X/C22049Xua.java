package X;

import android.view.KeyEvent;

/* renamed from: X.Xua  reason: case insensitive filesystem */
public final class C22049Xua implements C22544Y8t {
    public final Integer Clc(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long A01 = C21055XCg.A01(keyEvent);
            if (A01 == C21355XYi.A08) {
                return AnonymousClass05K.A0Z;
            }
            if (A01 == C21355XYi.A09) {
                return AnonymousClass05K.A0a;
            }
            if (A01 == C21355XYi.A0A) {
                return AnonymousClass05K.A0Q;
            }
            if (A01 == C21355XYi.A07) {
                return AnonymousClass05K.A0R;
            }
        } else if (keyEvent.isAltPressed()) {
            long A012 = C21055XCg.A01(keyEvent);
            if (A012 == C21355XYi.A08) {
                return AnonymousClass05K.A1F;
            }
            if (A012 == C21355XYi.A09) {
                return AnonymousClass05K.A1I;
            }
            if (A012 == C21355XYi.A0A) {
                return AnonymousClass05K.A06;
            }
            if (A012 == C21355XYi.A07) {
                return AnonymousClass05K.A07;
            }
        }
        return XY3.A00.Clc(keyEvent);
    }
}
