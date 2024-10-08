package com.meta.compose.material.bottomsheet;

import X.0qQ;
import X.0sL;
import X.AnonymousClass5QP;
import X.AnonymousClass6Gj;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C52911Gel;

public final class DraggableAnchorsElement extends AnonymousClass5QP {
    public final AnonymousClass6Gj A00;
    public final AnchoredDraggableState A01;
    public final 0sL A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.meta.compose.material.bottomsheet.DraggableAnchorsElement<*>");
            DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
            if (!0qQ.A0K(this.A01, draggableAnchorsElement.A01) || !0qQ.A0K(this.A02, draggableAnchorsElement.A02) || this.A00 != draggableAnchorsElement.A00) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Gel] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        AnchoredDraggableState anchoredDraggableState = this.A01;
        0sL r2 = this.A02;
        AnonymousClass6Gj r1 = this.A00;
        AnonymousClass7TG.A1U(anchoredDraggableState, r2, r1);
        ? r0 = new C267794cD();
        r0.A01 = anchoredDraggableState;
        r0.A02 = r2;
        r0.A00 = r1;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52911Gel gel = (C52911Gel) r3;
        0qQ.A0B(gel, 0);
        AnchoredDraggableState anchoredDraggableState = this.A01;
        0qQ.A0B(anchoredDraggableState, 0);
        gel.A01 = anchoredDraggableState;
        0sL r0 = this.A02;
        0qQ.A0B(r0, 0);
        gel.A02 = r0;
        AnonymousClass6Gj r02 = this.A00;
        0qQ.A0B(r02, 0);
        gel.A00 = r02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public DraggableAnchorsElement(AnonymousClass6Gj r1, AnchoredDraggableState anchoredDraggableState, 0sL r3) {
        this.A01 = anchoredDraggableState;
        this.A02 = r3;
        this.A00 = r1;
    }
}
