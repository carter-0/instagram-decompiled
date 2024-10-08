package X;

/* renamed from: X.5tg  reason: invalid class name and case insensitive filesystem */
public final class C298575tg extends C289645dx {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C13866Tin A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C298575tg) {
                C298575tg r5 = (C298575tg) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03 && 0qQ.A0K(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = ((((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02) * 31) + this.A03) * 31;
        C13866Tin tin = this.A04;
        if (tin != null) {
            i = tin.hashCode();
        } else {
            i = 0;
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Stroke(width=");
        sb.append(this.A01);
        sb.append(", miter=");
        sb.append(this.A00);
        sb.append(", cap=");
        int i = this.A02;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = "Square";
        }
        sb.append(str);
        sb.append(", join=");
        if (this.A03 == 0) {
            str2 = "Miter";
        } else {
            str2 = "Round";
        }
        sb.append(str2);
        sb.append(", pathEffect=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C298575tg(C13866Tin tin, float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = tin;
    }
}
