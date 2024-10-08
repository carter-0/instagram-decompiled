package X;

import android.view.KeyEvent;

/* renamed from: X.Xub  reason: case insensitive filesystem */
public final class C22050Xub implements C22544Y8t {
    public final /* synthetic */ 0sP A00;

    public C22050Xub(0sP r1) {
        this.A00 = r1;
    }

    public final Integer Clc(KeyEvent keyEvent) {
        0sP r1 = this.A00;
        if (!((Boolean) r1.invoke(new C56049Hry(keyEvent))).booleanValue() || !keyEvent.isShiftPressed()) {
            if (((Boolean) r1.invoke(new C56049Hry(keyEvent))).booleanValue()) {
                long A01 = C21055XCg.A01(keyEvent);
                if (!(A01 == C21355XYi.A03 || A01 == C21355XYi.A0D)) {
                    if (A01 != C21355XYi.A0K) {
                        if (A01 != C21355XYi.A0L) {
                            if (A01 == C21355XYi.A00) {
                                return AnonymousClass05K.A0I;
                            }
                            if (A01 != C21355XYi.A0M) {
                                if (A01 == C21355XYi.A0N) {
                                    return AnonymousClass05K.A0e;
                                }
                                return null;
                            }
                        }
                        return AnonymousClass05K.A0A;
                    }
                }
                return AnonymousClass05K.A08;
            } else if (keyEvent.isCtrlPressed()) {
                return null;
            } else {
                boolean isShiftPressed = keyEvent.isShiftPressed();
                long A012 = C21055XCg.A01(keyEvent);
                int i = (A012 > C21355XYi.A08 ? 1 : (A012 == C21355XYi.A08 ? 0 : -1));
                if (isShiftPressed) {
                    if (i == 0) {
                        return AnonymousClass05K.A0J;
                    }
                    if (A012 == C21355XYi.A09) {
                        return AnonymousClass05K.A0K;
                    }
                    if (A012 == C21355XYi.A0A) {
                        return AnonymousClass05K.A0L;
                    }
                    if (A012 == C21355XYi.A07) {
                        return AnonymousClass05K.A0M;
                    }
                    if (A012 == C21355XYi.A0H) {
                        return AnonymousClass05K.A0O;
                    }
                    if (A012 == C21355XYi.A0G) {
                        return AnonymousClass05K.A0P;
                    }
                    if (A012 == C21355XYi.A0F) {
                        return AnonymousClass05K.A0W;
                    }
                    if (A012 == C21355XYi.A0E) {
                        return AnonymousClass05K.A0X;
                    }
                    if (A012 != C21355XYi.A0D) {
                        return null;
                    }
                } else if (i == 0) {
                    return AnonymousClass05K.A00;
                } else {
                    if (A012 == C21355XYi.A09) {
                        return AnonymousClass05K.A01;
                    }
                    if (A012 == C21355XYi.A0A) {
                        return AnonymousClass05K.A02;
                    }
                    if (A012 == C21355XYi.A07) {
                        return AnonymousClass05K.A03;
                    }
                    if (A012 == C21355XYi.A0H) {
                        return AnonymousClass05K.A04;
                    }
                    if (A012 == C21355XYi.A0G) {
                        return AnonymousClass05K.A05;
                    }
                    if (A012 == C21355XYi.A0F) {
                        return AnonymousClass05K.A0u;
                    }
                    if (A012 == C21355XYi.A0E) {
                        return AnonymousClass05K.A15;
                    }
                    if (A012 == C21355XYi.A0B) {
                        return AnonymousClass05K.A0c;
                    }
                    if (A012 == C21355XYi.A02) {
                        return AnonymousClass05K.A0B;
                    }
                    if (A012 == C21355XYi.A06) {
                        return AnonymousClass05K.A0D;
                    }
                    if (A012 != C21355XYi.A0I) {
                        if (A012 != C21355XYi.A05) {
                            if (A012 != C21355XYi.A04) {
                                if (A012 == C21355XYi.A0J) {
                                    return AnonymousClass05K.A0d;
                                }
                                return null;
                            }
                            return AnonymousClass05K.A08;
                        }
                        return AnonymousClass05K.A0A;
                    }
                }
            }
            return AnonymousClass05K.A09;
        } else if (C21055XCg.A01(keyEvent) != C21355XYi.A0N) {
            return null;
        }
        return AnonymousClass05K.A0f;
    }
}
