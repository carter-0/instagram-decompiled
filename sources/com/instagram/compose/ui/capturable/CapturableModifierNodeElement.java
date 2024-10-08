package com.instagram.compose.ui.capturable;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C267794cD;
import X.L3W;

public final class CapturableModifierNodeElement extends AnonymousClass5QP {
    public final L3W A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CapturableModifierNodeElement) && 0qQ.A0K(this.A00, ((CapturableModifierNodeElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new CapturableModifierNode(this.A00);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        CapturableModifierNode capturableModifierNode = (CapturableModifierNode) r3;
        0qQ.A0B(capturableModifierNode, 0);
        L3W l3w = this.A00;
        0qQ.A0B(l3w, 0);
        capturableModifierNode.A00.Epw(l3w);
    }

    public CapturableModifierNodeElement(L3W l3w) {
        this.A00 = l3w;
    }
}
