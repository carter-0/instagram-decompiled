package X;

/* renamed from: X.HsX  reason: case insensitive filesystem */
public final class C56084HsX {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56084HsX) {
                C56084HsX hsX = (C56084HsX) obj;
                if (!(Float.compare(this.A00, hsX.A00) == 0 && Float.compare(this.A01, hsX.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0U("AudioLevel(botAudioLevel=", ", userAudioLevel=", ')', this.A00, this.A01);
    }

    public final int hashCode() {
        return C51966G9m.A02(G9w.A00(this.A00), this.A01);
    }

    public C56084HsX(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
