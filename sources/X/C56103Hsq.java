package X;

/* renamed from: X.Hsq  reason: case insensitive filesystem */
public final class C56103Hsq {
    public final float A00;
    public final long A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56103Hsq) {
                C56103Hsq hsq = (C56103Hsq) obj;
                if (!(this.A02 == hsq.A02 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.A00, hsq.A00) == 0 && this.A01 == hsq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "ALPHA";
                break;
            case 1:
                str = "SCALE_X";
                break;
            default:
                str = "SCALE_Y";
                break;
        }
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(C51968G9o.A0F(str, intValue), 1.0f), this.A00) + C51968G9o.A03(this.A01);
    }

    public C56103Hsq(Integer num, float f, long j) {
        this.A02 = num;
        this.A00 = f;
        this.A01 = j;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PressedStateAnimation(property=");
        switch (this.A02.intValue()) {
            case 0:
                str = "ALPHA";
                break;
            case 1:
                str = "SCALE_X";
                break;
            default:
                str = "SCALE_Y";
                break;
        }
        A1A.append(str);
        A1A.append(", startValue=");
        A1A.append(1.0f);
        A1A.append(", endValue=");
        A1A.append(this.A00);
        A1A.append(Pxd.A00(114));
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
