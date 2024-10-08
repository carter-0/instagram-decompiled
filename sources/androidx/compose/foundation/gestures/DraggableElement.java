package androidx.compose.foundation.gestures;

import X.0qQ;
import X.0sK;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass6Gj;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267794cD;
import X.C287605aT;
import X.C51971G9r;
import X.C51975G9x;
import X.C52888GeO;
import X.C58867Iys;
import X.JNP;

public final class DraggableElement extends AnonymousClass5QP {
    public static final 0sP A07 = C58867Iys.A00;
    public final JNP A00;
    public final AnonymousClass6Gj A01;
    public final C287605aT A02;
    public final 0sK A03;
    public final 0sK A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ void A01(C267794cD r12) {
        boolean z;
        C52888GeO geO = (C52888GeO) r12;
        JNP jnp = this.A00;
        0sP r8 = A07;
        AnonymousClass6Gj r6 = this.A01;
        boolean z2 = this.A05;
        C287605aT r7 = this.A02;
        boolean z3 = this.A06;
        0sK r2 = this.A03;
        0sK r1 = this.A04;
        if (!0qQ.A0K(geO.A00, jnp)) {
            geO.A00 = jnp;
            z = true;
        } else {
            z = false;
        }
        if (geO.A01 != r6) {
            geO.A01 = r6;
            z = true;
        }
        geO.A02 = r2;
        geO.A03 = r1;
        geO.A04 = z3;
        geO.A0N(r6, r7, r8, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DraggableElement draggableElement = (DraggableElement) obj;
                if (!0qQ.A0K(this.A00, draggableElement.A00) || this.A01 != draggableElement.A01 || this.A05 != draggableElement.A05 || !0qQ.A0K(this.A02, draggableElement.A02) || this.A06 != draggableElement.A06 || !0qQ.A0K(this.A03, draggableElement.A03) || !0qQ.A0K(this.A04, draggableElement.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DragGestureNode, X.4cD, X.GeO] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        JNP jnp = this.A00;
        0sP r7 = A07;
        AnonymousClass6Gj r6 = this.A01;
        boolean z = this.A05;
        C287605aT r4 = this.A02;
        boolean z2 = this.A06;
        0sK r2 = this.A03;
        0sK r1 = this.A04;
        ? dragGestureNode = new DragGestureNode(r6, r4, r7, z);
        dragGestureNode.A00 = jnp;
        dragGestureNode.A01 = r6;
        dragGestureNode.A04 = z2;
        dragGestureNode.A02 = r2;
        dragGestureNode.A03 = r1;
        return dragGestureNode;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00));
        return C51975G9x.A05(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, A072) + C51971G9r.A0E(this.A02)) * 31)));
    }

    public DraggableElement(JNP jnp, AnonymousClass6Gj r2, C287605aT r3, 0sK r4, 0sK r5, boolean z, boolean z2) {
        this.A00 = jnp;
        this.A01 = r2;
        this.A05 = z;
        this.A02 = r3;
        this.A06 = z2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
