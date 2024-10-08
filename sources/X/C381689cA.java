package X;

/* renamed from: X.9cA  reason: invalid class name and case insensitive filesystem */
public final class C381689cA extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final int A04;

    public C381689cA(int i, float f, float f2, float f3, float f4) {
        this.A04 = i;
        switch (i) {
            case 0:
                this.A01 = f;
                this.A03 = f2;
                this.A00 = f3;
                break;
            case 1:
                this.A02 = f;
                this.A00 = f2;
                this.A03 = f3;
                this.A01 = f4;
                return;
            case 2:
                this.A01 = f;
                this.A03 = f2;
                this.A02 = f3;
                this.A00 = f4;
                return;
            default:
                this.A00 = f;
                this.A01 = f2;
                this.A03 = f3;
                break;
        }
        this.A02 = f4;
    }

    public final boolean equals(Object obj) {
        float f;
        float f2;
        switch (this.A04) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C381689cA)) {
                    return false;
                }
                C381689cA r3 = (C381689cA) obj;
                if (r3.A04 != 0 || !C289095d0.A01(this.A01, r3.A01) || !C289095d0.A01(this.A03, r3.A03) || !C289095d0.A01(this.A00, r3.A00) || !C289095d0.A01(this.A02, r3.A02)) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C381689cA) {
                    C381689cA r32 = (C381689cA) obj;
                    if (r32.A04 == 1 && Float.compare(this.A02, r32.A02) == 0 && Float.compare(this.A00, r32.A00) == 0 && Float.compare(this.A03, r32.A03) == 0) {
                        f = this.A01;
                        f2 = r32.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C381689cA) {
                    C381689cA r33 = (C381689cA) obj;
                    if (r33.A04 == 2 && Float.compare(this.A01, r33.A01) == 0 && Float.compare(this.A03, r33.A03) == 0 && Float.compare(this.A02, r33.A02) == 0) {
                        f = this.A00;
                        f2 = r33.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C381689cA) {
                    C381689cA r34 = (C381689cA) obj;
                    if (r34.A04 == 3 && Float.compare(this.A00, r34.A00) == 0 && Float.compare(this.A01, r34.A01) == 0 && Float.compare(this.A03, r34.A03) == 0) {
                        f = this.A02;
                        f2 = r34.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (Float.compare(f, f2) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002;
        float f;
        int A003;
        float f2;
        switch (this.A04) {
            case 0:
                A003 = AnonymousClass7TF.A00(Float.floatToIntBits(this.A01) * 31, this.A03);
                f2 = this.A00;
                break;
            case 1:
                A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00(Float.floatToIntBits(this.A02) * 31, this.A00), this.A03);
                f = this.A01;
                break;
            case 2:
                A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00(Float.floatToIntBits(this.A01) * 31, this.A03), this.A02);
                f = this.A00;
                break;
            default:
                A003 = AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31, this.A01);
                f2 = this.A03;
                break;
        }
        A002 = AnonymousClass7TF.A00(A003, f2);
        f = this.A02;
        return A002 + Float.floatToIntBits(f);
    }

    public final String toString() {
        StringBuilder sb;
        float f;
        switch (this.A04) {
            case 2:
                sb = AnonymousClass7TE.A1A();
                sb.append("DraftCropCoordinates(cropLeft=");
                sb.append(this.A01);
                sb.append(", cropTop=");
                sb.append(this.A03);
                sb.append(", cropRight=");
                sb.append(this.A02);
                sb.append(", cropBottom=");
                f = this.A00;
                break;
            case 3:
                sb = AnonymousClass7TE.A1A();
                sb.append("MusicSoundwaveBounds(distanceOfCenterXToSticker=");
                sb.append(this.A00);
                sb.append(", distanceOfCenterYToSticker=");
                sb.append(this.A01);
                sb.append(", width=");
                sb.append(this.A03);
                sb.append(", height=");
                f = this.A02;
                break;
            default:
                return super.toString();
        }
        sb.append(f);
        return AnonymousClass7TG.A0p(sb);
    }
}
