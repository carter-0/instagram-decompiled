package X;

/* renamed from: X.3Or  reason: invalid class name and case insensitive filesystem */
public final class C241303Or extends AnonymousClass0T0 {
    public final C266544Zk A00;
    public final C266544Zk A01;
    public final C266544Zk A02;
    public final C266544Zk A03;
    public final C266544Zk A04;
    public final C67241sS A05;
    public final C241283Op A06;
    public final Integer A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C241303Or) {
                C241303Or r5 = (C241303Or) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A07;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        C67241sS r0 = this.A05;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        C266544Zk r02 = this.A00;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C266544Zk r03 = this.A01;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        C266544Zk r04 = this.A02;
        int hashCode5 = (hashCode4 + (r04 == null ? 0 : r04.hashCode())) * 31;
        C266544Zk r05 = this.A03;
        int hashCode6 = (hashCode5 + (r05 == null ? 0 : r05.hashCode())) * 31;
        C266544Zk r06 = this.A04;
        int hashCode7 = (hashCode6 + (r06 == null ? 0 : r06.hashCode())) * 31;
        C241283Op r07 = this.A06;
        if (r07 != null) {
            i = r07.hashCode();
        }
        return hashCode7 + i;
    }

    public C241303Or(C266544Zk r1, C266544Zk r2, C266544Zk r3, C266544Zk r4, C266544Zk r5, C67241sS r6, C241283Op r7, Integer num) {
        this.A07 = num;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
    }
}
