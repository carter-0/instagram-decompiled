package X;

/* renamed from: X.A9r  reason: case insensitive filesystem */
public final class C39796A9r {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C390729rk A04;
    public final String A05;

    public C39796A9r(C390729rk r2, String str, float f, int i, int i2, int i3) {
        0qQ.A0B(r2, 2);
        this.A05 = str;
        this.A04 = r2;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39796A9r) {
                C39796A9r a9r = (C39796A9r) obj;
                if (!(0qQ.A0K(this.A05, a9r.A05) && this.A04 == a9r.A04 && this.A02 == a9r.A02 && this.A01 == a9r.A01 && this.A03 == a9r.A03 && Float.compare(this.A00, a9r.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(this.A05)) + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DetectionResultData(videoPath=");
        A1A.append(this.A05);
        A1A.append(", type=");
        A1A.append(this.A04);
        A1A.append(", videoSegmentId=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(1152));
        A1A.append(this.A01);
        A1A.append(", durationInMs=");
        A1A.append(this.A03);
        A1A.append(", rating=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
