package X;

/* renamed from: X.HtF  reason: case insensitive filesystem */
public final class C56127HtF {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C56127HtF)) {
                long j = this.A00;
                C56127HtF htF = (C56127HtF) obj;
                long j2 = htF.A00;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A04 == htF.A04 && this.A03 == htF.A03 && this.A02 == htF.A02 && this.A01 == htF.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        int A012 = AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A01(this.A04, C51967G9n.A02(j))));
        long j3 = this.A01;
        return A012 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C56127HtF(long j, long j2, long j3, long j4, long j5) {
        this.A00 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A01 = j5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ContextMenuColors(backgroundColor=");
        A1A.append(AnonymousClass5RW.A06(this.A00));
        A1A.append(", textColor=");
        A1A.append(AnonymousClass5RW.A06(this.A04));
        A1A.append(", iconColor=");
        A1A.append(AnonymousClass5RW.A06(this.A03));
        A1A.append(", disabledTextColor=");
        A1A.append(AnonymousClass5RW.A06(this.A02));
        A1A.append(", disabledIconColor=");
        return AnonymousClass7TG.A0n(AnonymousClass5RW.A06(this.A01), A1A);
    }
}
