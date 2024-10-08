package X;

import java.util.List;

/* renamed from: X.Sgn  reason: case insensitive filesystem */
public final class C11801Sgn implements C13765Tgd {
    public final QGY A00;
    public final QGY A01;

    public final C11388SRb ALS() {
        return new QGM(C11802Sgo.A00(this.A00), C11802Sgo.A00(this.A01));
    }

    public final List BKA() {
        throw AnonymousClass7TE.A1B("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean CcS() {
        if (!this.A00.CcS() || !this.A01.CcS()) {
            return false;
        }
        return true;
    }

    public C11801Sgn(QGY qgy, QGY qgy2) {
        this.A00 = qgy;
        this.A01 = qgy2;
    }
}
