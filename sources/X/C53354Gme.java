package X;

/* renamed from: X.Gme  reason: case insensitive filesystem */
public final class C53354Gme extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53354Gme) {
                C53354Gme gme = (C53354Gme) obj;
                if (!(Float.compare(this.A00, gme.A00) == 0 && Float.compare(this.A01, gme.A01) == 0 && Float.compare(this.A02, gme.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01), this.A02);
    }

    public C53354Gme(float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public C53354Gme() {
        this(0.0f, 0.0f, 0.0f);
    }
}
