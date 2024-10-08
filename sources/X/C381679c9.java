package X;

/* renamed from: X.9c9  reason: invalid class name and case insensitive filesystem */
public final class C381679c9 extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381679c9) {
                C381679c9 r8 = (C381679c9) obj;
                if (!0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || this.A01 != r8.A01 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)));
        long j = this.A00;
        return A012 + ((int) (j ^ (j >>> 32)));
    }

    public C381679c9(long j, String str, long j2, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SafetyInterventionsUserImpressionTrackerEntity(interventionType=");
        A1A.append(this.A02);
        A1A.append(AnonymousClass000.A00(855));
        A1A.append(this.A03);
        A1A.append(", totalImpressions=");
        A1A.append(this.A01);
        A1A.append(", lastImpressionTimestamp=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
