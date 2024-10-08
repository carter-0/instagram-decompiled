package X;

/* renamed from: X.9c8  reason: invalid class name and case insensitive filesystem */
public final class C381669c8 extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final C381809cM A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381669c8) {
                C381669c8 r8 = (C381669c8) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A02, r8.A02) || this.A01 != r8.A01 || Float.compare(this.A00, r8.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03))) + Float.floatToIntBits(this.A00);
    }

    public C381669c8(C381809cM r1, String str, float f, long j) {
        AnonymousClass7TG.A1O(str, r1);
        this.A03 = str;
        this.A02 = r1;
        this.A01 = j;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsSoundEffect(effectName=");
        A1A.append(this.A03);
        A1A.append(", effectAudio=");
        A1A.append(this.A02);
        A1A.append(", startTimeMs=");
        A1A.append(this.A01);
        A1A.append(", volume=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
