package X;

import com.fbpay.w3c.CardDetails;

/* renamed from: X.QOo  reason: case insensitive filesystem */
public final class C7606QOo extends AnonymousClass0T0 {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C11216SFq A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7606QOo) {
                C7606QOo qOo = (C7606QOo) obj;
                if (!0qQ.A0K(this.A00, qOo.A00) || !0qQ.A0K(this.A04, qOo.A04) || this.A01 != qOo.A01 || !0qQ.A0K(this.A05, qOo.A05) || this.A03 != qOo.A03 || this.A02 != qOo.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return Pxh.A06(this.A02, AnonymousClass7TF.A01(this.A03, (AnonymousClass7TF.A01(j, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C41845B3m.A00(this.A05)) * 31));
    }

    public C7606QOo(CardDetails cardDetails, C11216SFq sFq, String str, long j, long j2, long j3) {
        this.A00 = cardDetails;
        this.A04 = sFq;
        this.A01 = j;
        this.A05 = str;
        this.A03 = j2;
        this.A02 = j3;
    }
}
