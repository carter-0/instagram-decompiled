package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

public final class BEE extends AnonymousClass0T0 implements DV5 {
    public final ClipsTextAlignment A00;
    public final ClipsTextEmphasisMode A01;
    public final ClipsTextFormatType A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Float A0B;
    public final Float A0C;
    public final Float A0D;
    public final Integer A0E;
    public final String A0F;
    public final List A0G;

    public final BEE F1e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEE) {
                BEE bee = (BEE) obj;
                if (this.A00 != bee.A00 || !0qQ.A0K(this.A0G, bee.A0G) || !0qQ.A0K(this.A05, bee.A05) || !0qQ.A0K(this.A06, bee.A06) || !0qQ.A0K(this.A07, bee.A07) || !0qQ.A0K(this.A03, bee.A03) || !0qQ.A0K(this.A04, bee.A04) || !0qQ.A0K(this.A08, bee.A08) || !0qQ.A0K(this.A09, bee.A09) || !0qQ.A0K(this.A0A, bee.A0A) || !0qQ.A0K(this.A0B, bee.A0B) || !0qQ.A0K(this.A0C, bee.A0C) || !0qQ.A0K(this.A0F, bee.A0F) || this.A01 != bee.A01 || this.A02 != bee.A02 || !0qQ.A0K(this.A0D, bee.A0D) || !0qQ.A0K(this.A0E, bee.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ClipsTextAlignment Aah() {
        return this.A00;
    }

    public final List Ap5() {
        return this.A0G;
    }

    public final Float B1i() {
        return this.A05;
    }

    public final Float B79() {
        return this.A06;
    }

    public final Float BCt() {
        return this.A07;
    }

    public final Float BXt() {
        return this.A08;
    }

    public final Float BXv() {
        return this.A09;
    }

    public final Float Boh() {
        return this.A0A;
    }

    public final Float BpV() {
        return this.A0B;
    }

    public final Float Byt() {
        return this.A0C;
    }

    public final ClipsTextEmphasisMode C56() {
        return this.A01;
    }

    public final ClipsTextFormatType C5D() {
        return this.A02;
    }

    public final Float CGX() {
        return this.A0D;
    }

    public final Integer CHa() {
        return this.A0E;
    }

    public final Boolean COk() {
        return this.A03;
    }

    public final Boolean CTZ() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsSpinSwappableText", C44092CVj.A00(this));
    }

    public final String getText() {
        return this.A0F;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((AnonymousClass7TF.A07(this.A0G, AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TE.A0L(this.A0E);
    }

    public BEE(ClipsTextAlignment clipsTextAlignment, ClipsTextEmphasisMode clipsTextEmphasisMode, ClipsTextFormatType clipsTextFormatType, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Integer num, String str, List list) {
        List list2 = list;
        0qQ.A0B(list2, 2);
        this.A00 = clipsTextAlignment;
        this.A0G = list2;
        this.A05 = f;
        this.A06 = f2;
        this.A07 = f3;
        this.A03 = bool;
        this.A04 = bool2;
        this.A08 = f4;
        this.A09 = f5;
        this.A0A = f6;
        this.A0B = f7;
        this.A0C = f8;
        this.A0F = str;
        this.A01 = clipsTextEmphasisMode;
        this.A02 = clipsTextFormatType;
        this.A0D = f9;
        this.A0E = num;
    }
}
