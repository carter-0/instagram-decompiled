package X;

import android.view.KeyEvent;

/* renamed from: X.Xuc  reason: case insensitive filesystem */
public final class C22051Xuc implements C22544Y8t {
    public final /* synthetic */ C22544Y8t A00;

    public C22051Xuc(C22544Y8t y8t) {
        this.A00 = y8t;
    }

    public final Integer Clc(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long A01 = C21055XCg.A01(keyEvent);
            if (A01 == C21355XYi.A08) {
                return AnonymousClass05K.A0S;
            }
            if (A01 == C21355XYi.A09) {
                return AnonymousClass05K.A0T;
            }
            if (A01 == C21355XYi.A0A) {
                return AnonymousClass05K.A0V;
            }
            if (A01 == C21355XYi.A07) {
                return AnonymousClass05K.A0U;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long A012 = C21055XCg.A01(keyEvent);
            if (A012 == C21355XYi.A08) {
                return AnonymousClass05K.A0N;
            }
            if (A012 == C21355XYi.A09) {
                return AnonymousClass05K.A0C;
            }
            if (A012 == C21355XYi.A0A) {
                return AnonymousClass05K.A0j;
            }
            if (A012 == C21355XYi.A07) {
                return AnonymousClass05K.A0Y;
            }
            if (A012 == C21355XYi.A0C) {
                return AnonymousClass05K.A0B;
            }
            if (A012 == C21355XYi.A06) {
                return AnonymousClass05K.A0F;
            }
            if (A012 == C21355XYi.A02) {
                return AnonymousClass05K.A0E;
            }
            if (A012 == C21355XYi.A01) {
                return AnonymousClass05K.A0b;
            }
        } else if (keyEvent.isShiftPressed()) {
            long A013 = C21055XCg.A01(keyEvent);
            if (A013 == C21355XYi.A0F) {
                return AnonymousClass05K.A0Z;
            }
            if (A013 == C21355XYi.A0E) {
                return AnonymousClass05K.A0a;
            }
        } else if (keyEvent.isAltPressed()) {
            long A014 = C21055XCg.A01(keyEvent);
            if (A014 == C21355XYi.A02) {
                return AnonymousClass05K.A0G;
            }
            if (A014 == C21355XYi.A06) {
                return AnonymousClass05K.A0H;
            }
        }
        return this.A00.Clc(keyEvent);
    }
}
