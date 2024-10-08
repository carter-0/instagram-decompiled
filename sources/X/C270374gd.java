package X;

/* renamed from: X.4gd  reason: invalid class name and case insensitive filesystem */
public final class C270374gd {
    public C48220Eb1 A00;
    public ELJ A01;
    public C15966Uli A02;
    public ELK A03;
    public ELK A04;
    public ELK A05;
    public Integer A06;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ELK elk = this.A04;
        int i7 = 0;
        if (elk != null) {
            i = elk.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        ELK elk2 = this.A05;
        if (elk2 != null) {
            i2 = elk2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        ELK elk3 = this.A03;
        if (elk3 != null) {
            i3 = elk3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        C15966Uli uli = this.A02;
        if (uli != null) {
            i4 = uli.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        ELJ elj = this.A01;
        if (elj != null) {
            i5 = elj.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Integer num = this.A06;
        if (num != null) {
            i6 = C17009VEj.A00(num).hashCode() + num.intValue();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        C48220Eb1 eb1 = this.A00;
        if (eb1 != null) {
            i7 = eb1.hashCode();
        }
        return (i13 + i7) * 31;
    }
}
