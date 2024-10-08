package X;

/* renamed from: X.GlU  reason: case insensitive filesystem */
public final class C53282GlU extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C304806Fh A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53282GlU) {
                C53282GlU glU = (C53282GlU) obj;
                long j = this.A01;
                long j2 = glU.A01;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A02 == glU.A02 && this.A05 == glU.A05 && 0qQ.A0K(this.A04, glU.A04) && Float.compare(this.A00, glU.A00) == 0 && this.A03 == glU.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        int A012 = AnonymousClass7TF.A01(this.A02, C51967G9n.A02(j));
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "PILL";
                break;
            case 2:
                str = "CIRCLE";
                break;
            default:
                str = "ROUNDED_RECT";
                break;
        }
        int A002 = AnonymousClass7TF.A00((C51971G9r.A0F(str, intValue, A012) + AnonymousClass7TG.A0C(this.A04)) * 31, this.A00);
        long j3 = this.A03;
        return A002 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C53282GlU(C304806Fh r1, Integer num, float f, long j, long j2, long j3) {
        this.A01 = j;
        this.A02 = j2;
        this.A05 = num;
        this.A04 = r1;
        this.A00 = f;
        this.A03 = j3;
    }
}
