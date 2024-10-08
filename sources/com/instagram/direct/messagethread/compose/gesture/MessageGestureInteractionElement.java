package com.instagram.direct.messagethread.compose.gesture;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WV;
import X.C267794cD;
import X.OG2;

public final class MessageGestureInteractionElement extends AnonymousClass5QP {
    public final OG2 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof MessageGestureInteractionElement) && 0qQ.A0K(this.A00, ((MessageGestureInteractionElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new AnonymousClass5WV(this.A00);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        AnonymousClass5WV r32 = (AnonymousClass5WV) r3;
        0qQ.A0B(r32, 0);
        OG2 og2 = this.A00;
        0qQ.A0B(og2, 0);
        r32.A00 = og2;
    }

    public MessageGestureInteractionElement(OG2 og2) {
        this.A00 = og2;
    }
}
