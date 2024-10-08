package X;

/* renamed from: X.3a7  reason: invalid class name and case insensitive filesystem */
public final class C243793a7 extends AnonymousClass0T0 implements AnonymousClass3ZE {
    public final AnonymousClass9J2 A00;
    public final C61067Jw5 A01;
    public final C376689Iy A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C243793a7) {
                C243793a7 r5 = (C243793a7) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        AnonymousClass9J2 r0 = this.A00;
        int i = 0;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        C376689Iy r02 = this.A02;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return hashCode2 + i;
    }

    public C243793a7(C376689Iy r1, AnonymousClass9J2 r2, C61067Jw5 jw5) {
        this.A01 = jw5;
        this.A00 = r2;
        this.A02 = r1;
    }
}
