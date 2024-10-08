package X;

/* renamed from: X.Gqi  reason: case insensitive filesystem */
public final class C53567Gqi extends AnonymousClass0T0 implements C59504JMc {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public C53567Gqi(AnonymousClass62P r2, AnonymousClass62P r3) {
        AnonymousClass7TG.A1O(r2, r3);
        this.A02 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C53567Gqi)) {
            return false;
        }
        C53567Gqi gqi = (C53567Gqi) obj;
        if (gqi.A00 != i || !0qQ.A0K(this.A02, gqi.A02) || !0qQ.A0K(this.A01, gqi.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A02));
    }

    public C53567Gqi(AnonymousClass62P r2, YCQ ycq) {
        AnonymousClass7TF.A1B(r2, 1, ycq);
        this.A02 = r2;
        this.A01 = ycq;
    }
}
