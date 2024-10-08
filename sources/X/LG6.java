package X;

import com.fbpay.w3c.CardDetails;

public final class LG6 {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C11216SFq A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LG6) {
                LG6 lg6 = (LG6) obj;
                if (!(0qQ.A0K(this.A00, lg6.A00) && 0qQ.A0K(this.A05, lg6.A05) && this.A01 == lg6.A01 && this.A04 == lg6.A04 && 0qQ.A0K(this.A06, lg6.A06) && this.A03 == lg6.A03 && this.A02 == lg6.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A01, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        int A013 = AnonymousClass7TF.A01(this.A03, (AnonymousClass7TF.A01(this.A04, A012) + C41845B3m.A00(this.A06)) * 31);
        long j = this.A02;
        return A013 + ((int) (j ^ (j >>> 32)));
    }

    public LG6(CardDetails cardDetails, C11216SFq sFq, String str, long j, long j2, long j3, long j4) {
        this.A00 = cardDetails;
        this.A05 = sFq;
        this.A01 = j;
        this.A04 = j2;
        this.A06 = str;
        this.A03 = j3;
        this.A02 = j4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DemaskResults(cardDetails=");
        A1A.append(this.A00);
        A1A.append(", failure=");
        A1A.append(this.A05);
        A1A.append(", timeInMs=");
        A1A.append(this.A01);
        A1A.append(", timeInMsForBindCard=");
        A1A.append(this.A04);
        A1A.append(", errorLogEventResultType=");
        A1A.append(this.A06);
        A1A.append(", timeInMsDemaskCardStart=");
        A1A.append(this.A03);
        A1A.append(", timeInMsDemaskCardEnd=");
        A1A.append(this.A02);
        return AnonymousClass7TG.A0p(A1A);
    }
}
