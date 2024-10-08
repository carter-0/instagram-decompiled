package X;

/* renamed from: X.7Rm  reason: invalid class name and case insensitive filesystem */
public final class C331567Rm extends C331577Rn {
    public final C3266877t A00;
    public final AnonymousClass752 A01;
    public final AnonymousClass79c A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C331567Rm(C3266877t r2, AnonymousClass752 r3, AnonymousClass79c r4, String str) {
        super(r2, r3, r4);
        0qQ.A0B(str, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(r2, 4);
        this.A03 = str;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r4.A05;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C331567Rm) {
                C331567Rm r5 = (C331567Rm) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
        AnonymousClass752 r0 = this.A01;
        return ((hashCode + (r0 == null ? 0 : r0.hashCode())) * 31) + this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqu() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C328617Fm Ar3() {
        return this.A00;
    }

    public final String ArN() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
