package X;

public final class QOx extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final 2HY A06;

    public QOx(Integer num, 2HY r3, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(num, 1);
        this.A05 = num;
        this.A04 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A06 = r3;
        this.A00 = i4;
        this.A03 = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QOx) {
                QOx qOx = (QOx) obj;
                if (!(this.A05 == qOx.A05 && this.A04 == qOx.A04 && this.A02 == qOx.A02 && this.A01 == qOx.A01 && 0qQ.A0K(this.A06, qOx.A06) && this.A00 == qOx.A00 && this.A03 == qOx.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A05;
        return ((AnonymousClass7TF.A07(this.A06, ((((((C51971G9r.A0D(num, C9616Rdu.A00(num)) * 31) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BitrateLadderRung(quality=");
        Integer num = this.A05;
        if (num != null) {
            str = C9616Rdu.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", width=");
        A1A.append(this.A04);
        A1A.append(", height=");
        A1A.append(this.A02);
        A1A.append(", frameRate=");
        A1A.append(this.A01);
        A1A.append(", bitRateRange=");
        A1A.append(this.A06);
        A1A.append(", captureFrameRate=");
        A1A.append(this.A00);
        A1A.append(", iFrameInterval=");
        return C51975G9x.A0j(A1A, this.A03);
    }
}
