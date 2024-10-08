package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.3ik  reason: invalid class name and case insensitive filesystem */
public final class C248883ik extends AnonymousClass0T0 implements C248923io {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final ClipsTextAlignment A0B;
    public final ClipsTextEmphasisMode A0C;
    public final ClipsTextFormatType A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;

    public C248883ik(ClipsTextAlignment clipsTextAlignment, ClipsTextEmphasisMode clipsTextEmphasisMode, ClipsTextFormatType clipsTextFormatType, String str, String str2, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2) {
        0qQ.A0B(clipsTextAlignment, 1);
        0qQ.A0B(list, 2);
        0qQ.A0B(str, 6);
        0qQ.A0B(str2, 13);
        0qQ.A0B(clipsTextEmphasisMode, 14);
        0qQ.A0B(clipsTextFormatType, 15);
        this.A0B = clipsTextAlignment;
        this.A0G = list;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A0E = str;
        this.A09 = i;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A07 = f8;
        this.A0F = str2;
        this.A0C = clipsTextEmphasisMode;
        this.A0D = clipsTextFormatType;
        this.A08 = f9;
        this.A0A = i2;
    }

    public final C248883ik FDp() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C248883ik) {
                C248883ik r5 = (C248883ik) obj;
                if (!(this.A0B == r5.A0B && 0qQ.A0K(this.A0G, r5.A0G) && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && 0qQ.A0K(this.A0E, r5.A0E) && this.A09 == r5.A09 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A05, r5.A05) == 0 && Float.compare(this.A06, r5.A06) == 0 && Float.compare(this.A07, r5.A07) == 0 && 0qQ.A0K(this.A0F, r5.A0F) && this.A0C == r5.A0C && this.A0D == r5.A0D && Float.compare(this.A08, r5.A08) == 0 && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((this.A0B.hashCode() * 31) + this.A0G.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + this.A0E.hashCode()) * 31) + this.A09) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A05)) * 31) + Float.floatToIntBits(this.A06)) * 31) + Float.floatToIntBits(this.A07)) * 31) + this.A0F.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31) + Float.floatToIntBits(this.A08)) * 31) + this.A0A;
    }

    public final /* bridge */ /* synthetic */ A9H AKY() {
        return new A9H(this);
    }

    public final ClipsTextAlignment Aah() {
        return this.A0B;
    }

    public final List Ap5() {
        return this.A0G;
    }

    public final float B1g() {
        return this.A00;
    }

    public final float B78() {
        return this.A01;
    }

    public final float BCs() {
        return this.A02;
    }

    public final float BXs() {
        return this.A03;
    }

    public final float BXu() {
        return this.A04;
    }

    public final float Bog() {
        return this.A05;
    }

    public final float BpU() {
        return this.A06;
    }

    public final float Byr() {
        return this.A07;
    }

    public final ClipsTextEmphasisMode C56() {
        return this.A0C;
    }

    public final ClipsTextFormatType C5D() {
        return this.A0D;
    }

    public final float CGW() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTextInfo", C377979Nz.A00(this));
    }

    public final String getId() {
        return this.A0E;
    }

    public final String getText() {
        return this.A0F;
    }

    public final int getZIndex() {
        return this.A0A;
    }

    public final int isAnimated() {
        return this.A09;
    }
}
