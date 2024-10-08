package X;

public final class GP4 extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GP4) {
                GP4 gp4 = (GP4) obj;
                if (!(this.A02 == gp4.A02 && this.A03 == gp4.A03 && this.A01 == gp4.A01 && this.A00 == gp4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return C51972G9s.A07(this.A01, AnonymousClass7TF.A09(this.A03, C51971G9r.A0D(num, GOR.A00(num)) * 31)) + this.A00;
    }

    public GP4(Integer num, int i, long j, boolean z) {
        this.A02 = num;
        this.A03 = z;
        this.A01 = j;
        this.A00 = i;
    }
}
