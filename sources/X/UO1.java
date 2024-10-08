package X;

public final class UO1 extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final C61062Jw0 A01;
    public final QP5 A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public UO1(C61062Jw0 jw0, QP5 qp5, Integer num, String str, String str2, String str3, String str4, int i) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A00 = i;
        this.A04 = str4;
        this.A03 = num;
        this.A02 = qp5;
        this.A01 = jw0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UO1) {
                UO1 uo1 = (UO1) obj;
                if (!0qQ.A0K(this.A05, uo1.A05) || !0qQ.A0K(this.A06, uo1.A06) || !0qQ.A0K(this.A07, uo1.A07) || this.A00 != uo1.A00 || !0qQ.A0K(this.A04, uo1.A04) || !0qQ.A0K(this.A03, uo1.A03) || !0qQ.A0K(this.A02, uo1.A02) || !0qQ.A0K(this.A01, uo1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A05))) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        UO1 uo1 = (UO1) obj;
        String str2 = this.A05;
        if (uo1 != null) {
            str = uo1.A05;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }

    public final String toString() {
        return this.A05;
    }
}
