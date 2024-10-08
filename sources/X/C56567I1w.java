package X;

/* renamed from: X.I1w  reason: case insensitive filesystem */
public final class C56567I1w {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56567I1w) {
                C56567I1w i1w = (C56567I1w) obj;
                if (!(Float.compare(this.A05, i1w.A05) == 0 && Float.compare(this.A00, i1w.A00) == 0 && Float.compare(this.A08, i1w.A08) == 0 && Float.compare(this.A06, i1w.A06) == 0 && Float.compare(this.A07, i1w.A07) == 0 && Float.compare(this.A01, i1w.A01) == 0 && Float.compare(this.A03, i1w.A03) == 0 && Float.compare(this.A04, i1w.A04) == 0 && Float.compare(this.A02, i1w.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(G9w.A00(this.A05), this.A00), this.A08), this.A06), this.A07), this.A01), this.A03), this.A04), this.A02);
    }

    public C56567I1w(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A05 = f;
        this.A00 = f2;
        this.A08 = f3;
        this.A06 = f4;
        this.A07 = f5;
        this.A01 = f6;
        this.A03 = f7;
        this.A04 = f8;
        this.A02 = f9;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SpeechIndicatorParameters(topRingAlpha=");
        A1A.append(this.A05);
        A1A.append(", backgroundRingAlpha=");
        A1A.append(this.A00);
        A1A.append(", topRingRotationAngleDiff=");
        A1A.append(this.A08);
        A1A.append(", topRingRotationAcceleration=");
        A1A.append(this.A06);
        A1A.append(", topRingRotationAccelerationFactor=");
        A1A.append(this.A07);
        A1A.append(", backgroundRingRotationAngleDiff=");
        A1A.append(this.A01);
        A1A.append(", pulseDiff=");
        A1A.append(this.A03);
        A1A.append(", ringWaveFactor=");
        A1A.append(this.A04);
        A1A.append(", gradientOffsetDiff=");
        A1A.append(this.A02);
        return AnonymousClass7TG.A0p(A1A);
    }

    public C56567I1w() {
        this(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
    }
}
