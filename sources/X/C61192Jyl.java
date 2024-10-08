package X;

import android.graphics.Bitmap;

/* renamed from: X.Jyl  reason: case insensitive filesystem */
public final class C61192Jyl extends AnonymousClass0T0 implements C66472MTa {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Bitmap A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61192Jyl) {
                C61192Jyl jyl = (C61192Jyl) obj;
                if (!(0qQ.A0K(this.A06, jyl.A06) && Float.compare(this.A04, jyl.A04) == 0 && Float.compare(this.A01, jyl.A01) == 0 && Float.compare(this.A00, jyl.A00) == 0 && Float.compare(this.A02, jyl.A02) == 0 && Float.compare(this.A03, jyl.A03) == 0 && 0qQ.A0K(this.A05, jyl.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return false;
    }

    public final String getName() {
        return this.A06;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(((AnonymousClass7TG.A0E(this.A06) * 31) + C54732HQn.A00()) * 31, this.A04), this.A01), this.A00), this.A02), this.A03) + AnonymousClass7TE.A0L(this.A05);
    }

    public C61192Jyl(Bitmap bitmap, String str, float f, float f2, float f3, float f4, float f5) {
        this.A06 = str;
        this.A04 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = f4;
        this.A03 = f5;
        this.A05 = bitmap;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipTransformModel(name=");
        A1A.append(this.A06);
        A1A.append(", isSelected=");
        A1A.append(false);
        A1A.append(AnonymousClass000.A00(2054));
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(405));
        A1A.append(this.A01);
        A1A.append(", rotate=");
        A1A.append(this.A00);
        A1A.append(", translateX=");
        A1A.append(this.A02);
        A1A.append(", translateY=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(2002));
        return AnonymousClass7TG.A0n(this.A05, A1A);
    }

    public C61192Jyl() {
        this((Bitmap) null, (String) null, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }
}
