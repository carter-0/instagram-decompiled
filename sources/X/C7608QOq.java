package X;

import com.fbpay.w3c.CardDetails;

/* renamed from: X.QOq  reason: case insensitive filesystem */
public final class C7608QOq extends AnonymousClass0T0 {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C11216SFq A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7608QOq) {
                C7608QOq qOq = (C7608QOq) obj;
                if (!(0qQ.A0K(this.A00, qOq.A00) && 0qQ.A0K(this.A05, qOq.A05) && this.A01 == qOq.A01 && this.A04 == qOq.A04 && 0qQ.A0K(this.A06, qOq.A06) && this.A03 == qOq.A03 && this.A02 == qOq.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A01, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        return Pxh.A06(this.A02, AnonymousClass7TF.A01(this.A03, (AnonymousClass7TF.A01(this.A04, A012) + C41845B3m.A00(this.A06)) * 31));
    }

    public C7608QOq(CardDetails cardDetails, C11216SFq sFq, String str, long j, long j2, long j3, long j4) {
        this.A00 = cardDetails;
        this.A05 = sFq;
        this.A01 = j;
        this.A04 = j2;
        this.A06 = str;
        this.A03 = j3;
        this.A02 = j4;
    }
}
