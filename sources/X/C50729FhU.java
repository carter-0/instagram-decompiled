package X;

/* renamed from: X.FhU  reason: case insensitive filesystem */
public final class C50729FhU implements AnonymousClass5IX {
    public final long A00;
    public final C48101EVt A01;
    public final C21233XQe A02;
    public final String A03;

    public final boolean E1z(AnonymousClass5IY r6) {
        0qQ.A0B(r6, 0);
        C48101EVt eVt = this.A01;
        C21233XQe xQe = this.A02;
        String str = r6.A01;
        String str2 = this.A03;
        if (!0qQ.A0K(str, str2)) {
            0qQ.A0A(str2);
            if (!str2.equals(str)) {
                r6 = new AnonymousClass5IY(r6.A00, str2);
            }
        }
        return xQe.A00(r6, eVt.A00, this.A00);
    }

    public C50729FhU(C48101EVt eVt, C21233XQe xQe, String str, long j) {
        this.A03 = str;
        this.A01 = eVt;
        this.A02 = xQe;
        this.A00 = j;
    }
}
