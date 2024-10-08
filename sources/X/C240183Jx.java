package X;

/* renamed from: X.3Jx  reason: invalid class name and case insensitive filesystem */
public final class C240183Jx extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final 1Xj A00;
    public final AnonymousClass3W9 A01;
    public final JOH A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240183Jx) {
                C240183Jx r5 = (C240183Jx) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        AnonymousClass3W9 r0 = this.A01;
        int i = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31 * 31;
        JOH joh = this.A02;
        if (joh != null) {
            i = joh.hashCode();
        }
        return hashCode2 + i;
    }

    public C240183Jx(1Xj r1, AnonymousClass3W9 r2, JOH joh) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = joh;
    }
}
