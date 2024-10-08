package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import java.util.List;

/* renamed from: X.4gH  reason: invalid class name and case insensitive filesystem */
public final class C270154gH extends AnonymousClass0T0 implements C270164gI {
    public final IGAdsCardBackgroundTypeEnum A00;
    public final IGAdsCardStickerCTATypeEnum A01;
    public final IGAdsCardStickerClickAreaEnum A02;
    public final IGAdsCardStickerSizeEnum A03;
    public final IGAdsGenericCardFormatEnum A04;
    public final IGAdsGenericCardInfoTypeEnum A05;
    public final IGAdsStickerCardRevampTypographyHierarchyEnum A06;
    public final C2804251u A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;

    public final C270154gH FF5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C270154gH) {
                C270154gH r5 = (C270154gH) obj;
                if (this.A00 != r5.A00 || this.A02 != r5.A02 || !0qQ.A0K(this.A0B, r5.A0B) || this.A01 != r5.A01 || !0qQ.A0K(this.A0C, r5.A0C) || this.A04 != r5.A04 || !0qQ.A0K(this.A0E, r5.A0E) || this.A05 != r5.A05 || !0qQ.A0K(this.A0M, r5.A0M) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0K, r5.A0K) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0A, r5.A0A) || this.A03 != r5.A03 || this.A06 != r5.A06 || !0qQ.A0K(this.A0L, r5.A0L)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = this.A00;
        int i = 0;
        int hashCode = (iGAdsCardBackgroundTypeEnum == null ? 0 : iGAdsCardBackgroundTypeEnum.hashCode()) * 31;
        IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = this.A02;
        int hashCode2 = (hashCode + (iGAdsCardStickerClickAreaEnum == null ? 0 : iGAdsCardStickerClickAreaEnum.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = this.A01;
        int hashCode4 = (hashCode3 + (iGAdsCardStickerCTATypeEnum == null ? 0 : iGAdsCardStickerCTATypeEnum.hashCode())) * 31;
        Integer num2 = this.A0C;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = this.A04;
        int hashCode6 = (hashCode5 + (iGAdsGenericCardFormatEnum == null ? 0 : iGAdsGenericCardFormatEnum.hashCode())) * 31;
        String str = this.A0E;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = this.A05;
        int hashCode8 = (hashCode7 + (iGAdsGenericCardInfoTypeEnum == null ? 0 : iGAdsGenericCardInfoTypeEnum.hashCode())) * 31;
        List list = this.A0M;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A0F;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.A0D;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.A0G;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0H;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0I;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C2804251u r0 = this.A07;
        int hashCode15 = (hashCode14 + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str6 = this.A0J;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0K;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.A09;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A08;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A0A;
        int hashCode20 = (hashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = this.A03;
        int hashCode21 = (hashCode20 + (iGAdsCardStickerSizeEnum == null ? 0 : iGAdsCardStickerSizeEnum.hashCode())) * 31;
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = this.A06;
        int hashCode22 = (hashCode21 + (iGAdsStickerCardRevampTypographyHierarchyEnum == null ? 0 : iGAdsStickerCardRevampTypographyHierarchyEnum.hashCode())) * 31;
        String str8 = this.A0L;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode22 + i;
    }

    public final IGAdsCardBackgroundTypeEnum Aes() {
        return this.A00;
    }

    public final IGAdsCardStickerClickAreaEnum AnS() {
        return this.A02;
    }

    public final Integer AtH() {
        return this.A0B;
    }

    public final IGAdsCardStickerCTATypeEnum AtS() {
        return this.A01;
    }

    public final Integer Azf() {
        return this.A0C;
    }

    public final IGAdsGenericCardFormatEnum B7X() {
        return this.A04;
    }

    public final String BCo() {
        return this.A0E;
    }

    public final IGAdsGenericCardInfoTypeEnum BH0() {
        return this.A05;
    }

    public final List BH2() {
        return this.A0M;
    }

    public final String BJi() {
        return this.A0F;
    }

    public final Integer BXT() {
        return this.A0D;
    }

    public final String Bb6() {
        return this.A0G;
    }

    public final String BfM() {
        return this.A0H;
    }

    public final String Bo8() {
        return this.A0I;
    }

    public final /* bridge */ /* synthetic */ C2804351v Bor() {
        return this.A07;
    }

    public final String Bth() {
        return this.A0J;
    }

    public final String Btv() {
        return this.A0K;
    }

    public final Boolean Bui() {
        return this.A08;
    }

    public final Boolean Bun() {
        return this.A09;
    }

    public final Boolean Buq() {
        return this.A0A;
    }

    public final IGAdsCardStickerSizeEnum Bzg() {
        return this.A03;
    }

    public final IGAdsStickerCardRevampTypographyHierarchyEnum CAw() {
        return this.A06;
    }

    public final String CGM() {
        return this.A0L;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGenericCardDict", C55053HbO.A00(this));
    }

    public C270154gH(IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum, IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum, IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum, IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum, IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum, IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum, IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum, C2804251u r9, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        this.A00 = iGAdsCardBackgroundTypeEnum;
        this.A02 = iGAdsCardStickerClickAreaEnum;
        this.A0B = num;
        this.A01 = iGAdsCardStickerCTATypeEnum;
        this.A0C = num2;
        this.A04 = iGAdsGenericCardFormatEnum;
        this.A0E = str;
        this.A05 = iGAdsGenericCardInfoTypeEnum;
        this.A0M = list;
        this.A0F = str2;
        this.A0D = num3;
        this.A0G = str3;
        this.A0H = str4;
        this.A0I = str5;
        this.A07 = r9;
        this.A0J = str6;
        this.A0K = str7;
        this.A09 = bool;
        this.A08 = bool2;
        this.A0A = bool3;
        this.A03 = iGAdsCardStickerSizeEnum;
        this.A06 = iGAdsStickerCardRevampTypographyHierarchyEnum;
        this.A0L = str8;
    }
}
