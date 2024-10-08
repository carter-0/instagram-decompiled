package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTemplatesStickerType;

/* renamed from: X.9cd  reason: invalid class name and case insensitive filesystem */
public final class C381839cd extends AnonymousClass0T0 implements B39 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final ClipsTemplatesStickerType A09;
    public final String A0A;

    public final C381839cd F1h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381839cd) {
                C381839cd r5 = (C381839cd) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A05, r5.A05) == 0 && Float.compare(this.A06, r5.A06) == 0 && 0qQ.A0K(this.A0A, r5.A0A) && this.A09 == r5.A09 && Float.compare(this.A07, r5.A07) == 0 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C381839cd(ClipsTemplatesStickerType clipsTemplatesStickerType, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        AnonymousClass7TF.A1G(str, 8, clipsTemplatesStickerType);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0A = str;
        this.A09 = clipsTemplatesStickerType;
        this.A07 = f8;
        this.A08 = i;
    }

    public final float B1g() {
        return this.A00;
    }

    public final float BCs() {
        return this.A01;
    }

    public final float BXs() {
        return this.A02;
    }

    public final float BXu() {
        return this.A03;
    }

    public final float Bog() {
        return this.A04;
    }

    public final float BpU() {
        return this.A05;
    }

    public final float Byr() {
        return this.A06;
    }

    public final String Bze() {
        return this.A0A;
    }

    public final ClipsTemplatesStickerType Bzm() {
        return this.A09;
    }

    public final float CGW() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsStickerInfo", C393329wG.A00(this));
    }

    public final int getZIndex() {
        return this.A08;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02), this.A03), this.A04), this.A05), this.A06))), this.A07) + this.A08;
    }
}
