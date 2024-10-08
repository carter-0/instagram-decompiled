package X;

import android.graphics.Typeface;

/* renamed from: X.HtG  reason: case insensitive filesystem */
public final class C56128HtG {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Typeface A03;
    public final C55432Hhc A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56128HtG) {
                C56128HtG htG = (C56128HtG) obj;
                if (!(0qQ.A0K(this.A03, htG.A03) && Float.compare(this.A00, htG.A00) == 0 && Float.compare(this.A01, htG.A01) == 0 && 0qQ.A0K(this.A04, htG.A04) && this.A02 == htG.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TE.A0K(this.A03), this.A00), this.A01)) + this.A02;
    }

    public C56128HtG(Typeface typeface, C55432Hhc hhc, float f, float f2, int i) {
        this.A03 = typeface;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = hhc;
        this.A02 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextStyleValues(typeface=");
        A1A.append(this.A03);
        A1A.append(C273654mx.A00(444));
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(447));
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(1094));
        A1A.append(this.A04);
        A1A.append(", textColor=");
        return C51975G9x.A0j(A1A, this.A02);
    }
}
