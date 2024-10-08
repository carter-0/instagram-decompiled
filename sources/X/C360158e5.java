package X;

import java.util.List;

/* renamed from: X.8e5  reason: invalid class name and case insensitive filesystem */
public final class C360158e5 implements C62220rx {
    public final C62220rx A00;

    public C360158e5(C62220rx r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        C62220rx r5;
        AnonymousClass0y3 AnR;
        C360158e5 r0;
        if (obj == null) {
            return false;
        }
        C62220rx r2 = this.A00;
        C62220rx r1 = null;
        if ((obj instanceof C360158e5) && (r0 = (C360158e5) obj) != null) {
            r1 = r0.A00;
        }
        if (!0qQ.A0K(r2, r1)) {
            return false;
        }
        AnonymousClass0y3 AnR2 = r2.AnR();
        if (!(AnR2 instanceof C62230ry) || !(obj instanceof C62220rx) || (r5 = (C62220rx) obj) == null || (AnR = r5.AnR()) == null || !(AnR instanceof C62230ry)) {
            return false;
        }
        return 0qQ.A0K(AnonymousClass2YU.A00((C62230ry) AnR2), AnonymousClass2YU.A00((C62230ry) AnR));
    }

    public final List AcS() {
        return this.A00.AcS();
    }

    public final AnonymousClass0y3 AnR() {
        return this.A00.AnR();
    }

    public final boolean CWq() {
        return this.A00.CWq();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KTypeWrapper: ");
        sb.append(this.A00);
        return sb.toString();
    }

    public final List getAnnotations() {
        throw AnonymousClass00P.createAndThrow();
    }
}
