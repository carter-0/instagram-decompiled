package X;

/* renamed from: X.Gpx  reason: case insensitive filesystem */
public final class C53527Gpx extends AnonymousClass0T0 implements C59498JLw {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public C53527Gpx(Integer num, String str, int i, boolean z) {
        0qQ.A0B(num, 2);
        this.A02 = str;
        this.A01 = num;
        this.A00 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53527Gpx) {
                C53527Gpx gpx = (C53527Gpx) obj;
                if (!(0qQ.A0K(this.A02, gpx.A02) && this.A01 == gpx.A01 && this.A00 == gpx.A00 && this.A03 == gpx.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, ((((AnonymousClass7TG.A0E(this.A02) * 31) + HYU.A00(this.A01)) * 31) + this.A00) * 31);
    }
}
