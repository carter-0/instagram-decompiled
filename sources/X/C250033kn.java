package X;

/* renamed from: X.3kn  reason: invalid class name and case insensitive filesystem */
public final class C250033kn extends AnonymousClass0T0 {
    public long A00 = 0;
    public AnonymousClass3HX A01;
    public String A02 = "";
    public String A03 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250033kn) {
                C250033kn r8 = (C250033kn) obj;
                if (!0qQ.A0K(this.A01, r8.A01) || this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StoriesItem(story=");
        sb.append(this.A01);
        sb.append(", deliveredAt=");
        sb.append(this.A00);
        sb.append(Pxd.A00(10));
        sb.append(this.A02);
        sb.append(", requestUUID=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C250033kn() {
        AnonymousClass3HX r4 = AnonymousClass3P9.A00;
        0qQ.A0B(r4, 1);
        this.A01 = r4;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((this.A01.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }
}
