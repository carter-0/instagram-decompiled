package X;

public final class QOw extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public QOw(String str, String str2, int i, int i2, long j) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QOw) {
                QOw qOw = (QOw) obj;
                if (!(0qQ.A0K(this.A04, qOw.A04) && this.A01 == qOw.A01 && this.A00 == qOw.A00 && this.A02 == qOw.A02 && 0qQ.A0K(this.A03, qOw.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, C51972G9s.A07(this.A02, (((AnonymousClass7TE.A0O(this.A04) + this.A01) * 31) + this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DcpSubscriptionOffer(period=");
        A1A.append(this.A04);
        A1A.append(C66579MXk.A00(440));
        A1A.append(this.A01);
        A1A.append(", periodCount=");
        A1A.append(this.A00);
        A1A.append(", price=");
        A1A.append(this.A02);
        A1A.append(", formattedPrice=");
        return C51975G9x.A0i(this.A03, A1A);
    }
}
