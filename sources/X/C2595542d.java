package X;

/* renamed from: X.42d  reason: invalid class name and case insensitive filesystem */
public final class C2595542d extends AnonymousClass0T0 {
    public final long A00;
    public final 1Jq A01;
    public final 1Jo A02;
    public final 1Jm A03;
    public final 1Jm A04;
    public final String A05;
    public final boolean A06;
    public final 2TT A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2595542d) {
                C2595542d r5 = (C2595542d) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Navigation(qeParams=");
        sb.append(this.A07);
        sb.append(", exitEvent=");
        sb.append(this.A02);
        sb.append(", enterEvent=");
        sb.append(this.A01);
        sb.append(", triggerDownEvent=");
        sb.append(this.A03);
        sb.append(", isCold=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A07.hashCode() * 31;
        1Jo r0 = this.A02;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return hashCode3 + i;
    }

    public C2595542d(2TT r3, 1Jq r4, 1Jo r5, 1Jm r6, boolean z) {
        long j;
        this.A07 = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A06 = z;
        this.A05 = r4.A03;
        1Jm r1 = r4.A00;
        this.A04 = r1;
        if (r3.A0E) {
            j = r1.A00;
        } else {
            j = r6.A00;
        }
        this.A00 = j;
    }
}
