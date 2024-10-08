package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;

/* renamed from: X.GqJ  reason: case insensitive filesystem */
public final class C53548GqJ extends AnonymousClass0T0 implements JSN {
    public final IGAdsCardBackgroundTypeEnum A00;
    public final IGAdsCardStickerCTATypeEnum A01;
    public final IGAdsCardStickerClickAreaEnum A02;
    public final IGAdsCardStickerSizeEnum A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final C53548GqJ FF6() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53548GqJ) {
                C53548GqJ gqJ = (C53548GqJ) obj;
                if (this.A00 != gqJ.A00 || this.A02 != gqJ.A02 || !0qQ.A0K(this.A08, gqJ.A08) || !0qQ.A0K(this.A06, gqJ.A06) || this.A01 != gqJ.A01 || !0qQ.A0K(this.A07, gqJ.A07) || !0qQ.A0K(this.A05, gqJ.A05) || !0qQ.A0K(this.A04, gqJ.A04) || !0qQ.A0K(this.A09, gqJ.A09) || this.A03 != gqJ.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final IGAdsCardBackgroundTypeEnum Aes() {
        return this.A00;
    }

    public final IGAdsCardStickerClickAreaEnum AnS() {
        return this.A02;
    }

    public final String Aqz() {
        return this.A08;
    }

    public final Integer AtH() {
        return this.A06;
    }

    public final IGAdsCardStickerCTATypeEnum AtS() {
        return this.A01;
    }

    public final Integer Azf() {
        return this.A07;
    }

    public final Boolean Bui() {
        return this.A04;
    }

    public final Boolean Bun() {
        return this.A05;
    }

    public final String Bzd() {
        return this.A09;
    }

    public final IGAdsCardStickerSizeEnum Bzg() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenCardDict", C55054HbP.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C53548GqJ(IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum, IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum, IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum, IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2) {
        this.A00 = iGAdsCardBackgroundTypeEnum;
        this.A02 = iGAdsCardStickerClickAreaEnum;
        this.A08 = str;
        this.A06 = num;
        this.A01 = iGAdsCardStickerCTATypeEnum;
        this.A07 = num2;
        this.A05 = bool;
        this.A04 = bool2;
        this.A09 = str2;
        this.A03 = iGAdsCardStickerSizeEnum;
    }
}
