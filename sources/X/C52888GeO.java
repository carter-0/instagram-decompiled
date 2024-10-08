package X;

import androidx.compose.foundation.gestures.DragGestureNode;

/* renamed from: X.GeO  reason: case insensitive filesystem */
public final class C52888GeO extends DragGestureNode {
    public JNP A00;
    public AnonymousClass6Gj A01;
    public 0sK A02;
    public 0sK A03;
    public boolean A04;

    public final Object A0J(AnonymousClass4D7 r9, 0sL r10) {
        Object AQC = this.A00.AQC(C54609HKs.UserInput, r9, new MHP((Object) this, (Object) r10, (AnonymousClass4D7) null, 4, 42));
        if (AQC != 1Hj.A02) {
            return C60340gF.A00;
        }
        return AQC;
    }

    public final void A0L(long j) {
        if (this.A08 && !0qQ.A0K(this.A02, GQV.A00)) {
            AnonymousClass7TE.A1Z(new MGF((Object) this, j, (AnonymousClass4D7) null, 0), A05());
        }
    }

    public final void A0M(long j) {
        if (this.A08 && !0qQ.A0K(this.A03, GQV.A01)) {
            AnonymousClass7TE.A1Z(new MGF((Object) this, j, (AnonymousClass4D7) null, 1), A05());
        }
    }

    public final boolean A0O() {
        return this.A04;
    }
}
