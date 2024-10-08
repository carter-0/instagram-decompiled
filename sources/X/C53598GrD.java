package X;

/* renamed from: X.GrD  reason: case insensitive filesystem */
public final class C53598GrD extends AnonymousClass0T0 implements JNG {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public C53598GrD(C53451Goj goj, JSC jsc) {
        this.A02 = goj;
        this.A01 = jsc;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53598GrD)) {
                return false;
            }
            C53598GrD grD = (C53598GrD) obj;
            if (grD.A00 != 1 || !0qQ.A0K(this.A02, grD.A02) || !0qQ.A0K(this.A01, grD.A01)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53598GrD)) {
                return false;
            }
            C53598GrD grD2 = (C53598GrD) obj;
            if (grD2.A00 == 0 && 0qQ.A0K(this.A02, grD2.A02) && this.A01 == grD2.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A02) * 31);
    }

    public C53598GrD(C59725JVj jVj, C53451Goj goj) {
        this.A02 = goj;
        this.A01 = jVj;
    }
}
