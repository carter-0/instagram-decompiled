package X;

/* renamed from: X.6OV  reason: invalid class name */
public final class AnonymousClass6OV extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6OV) {
                AnonymousClass6OV r5 = (AnonymousClass6OV) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || Float.compare(this.A00, r5.A00) != 0 || Float.compare(this.A01, r5.A01) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A04;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.A02;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A03;
        if (f3 != null) {
            i = f3.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01);
    }

    public AnonymousClass6OV(Float f, Float f2, Float f3, float f4, float f5) {
        this.A04 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A01 = f5;
    }
}
