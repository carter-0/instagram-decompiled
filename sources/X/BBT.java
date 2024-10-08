package X;

public final class BBT extends AnonymousClass0T0 {
    public long A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public BBT(Integer num, String str, String str2, String str3, long j) {
        this.A05 = 0;
        this.A02 = str;
        this.A01 = num;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A05 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BBT)) {
                return false;
            }
            BBT bbt = (BBT) obj;
            if (bbt.A05 != 1 || !0qQ.A0K(this.A02, bbt.A02) || this.A00 != bbt.A00 || !0qQ.A0K(this.A04, bbt.A04) || !0qQ.A0K(this.A03, bbt.A03)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = bbt.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof BBT)) {
                return false;
            }
            BBT bbt2 = (BBT) obj;
            if (bbt2.A05 != 0 || !0qQ.A0K(this.A02, bbt2.A02) || !0qQ.A0K(this.A01, bbt2.A01) || this.A00 != bbt2.A00 || !0qQ.A0K(this.A03, bbt2.A03)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = bbt2.A04;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012;
        int A002;
        if (this.A05 != 0) {
            A012 = (((AnonymousClass7TF.A01(this.A00, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
            A002 = AnonymousClass7TE.A0L(this.A01);
        } else {
            A012 = (AnonymousClass7TF.A01(this.A00, ((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
            A002 = C41845B3m.A00(this.A04);
        }
        return A012 + A002;
    }

    public BBT() {
        this.A05 = 1;
        this.A05 = 1;
        this.A05 = 1;
        this.A02 = "";
        this.A00 = 0;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
    }
}
