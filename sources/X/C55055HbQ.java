package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import java.io.IOException;

/* renamed from: X.HbQ  reason: case insensitive filesystem */
public abstract class C55055HbQ {
    public static C53548GqJ parseFromJson(16F r13) {
        String str;
        String str2;
        String str3;
        String str4;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = null;
            IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = null;
            String str5 = null;
            Integer num = null;
            IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = null;
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str6 = null;
            IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("background_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                    iGAdsCardBackgroundTypeEnum = (IGAdsCardBackgroundTypeEnum) IGAdsCardBackgroundTypeEnum.A01.get(str4);
                    if (iGAdsCardBackgroundTypeEnum == null) {
                        iGAdsCardBackgroundTypeEnum = IGAdsCardBackgroundTypeEnum.UNRECOGNIZED;
                    }
                } else if ("click_area".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                    iGAdsCardStickerClickAreaEnum = (IGAdsCardStickerClickAreaEnum) IGAdsCardStickerClickAreaEnum.A01.get(str3);
                    if (iGAdsCardStickerClickAreaEnum == null) {
                        iGAdsCardStickerClickAreaEnum = IGAdsCardStickerClickAreaEnum.UNRECOGNIZED;
                    }
                } else if ("context_headline".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("cta_highlight_dwell_time_duration_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if ("cta_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                    iGAdsCardStickerCTATypeEnum = (IGAdsCardStickerCTATypeEnum) IGAdsCardStickerCTATypeEnum.A01.get(str2);
                    if (iGAdsCardStickerCTATypeEnum == null) {
                        iGAdsCardStickerCTATypeEnum = IGAdsCardStickerCTATypeEnum.UNRECOGNIZED;
                    }
                } else if ("dynamic_tooltip_time_duration_ms".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r13);
                } else if ("should_show_SUG".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("should_show_revamp_sticker_design".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if ("sticker_icon_url".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("sticker_size".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    iGAdsCardStickerSizeEnum = (IGAdsCardStickerSizeEnum) IGAdsCardStickerSizeEnum.A01.get(str);
                    if (iGAdsCardStickerSizeEnum == null) {
                        iGAdsCardStickerSizeEnum = IGAdsCardStickerSizeEnum.UNRECOGNIZED;
                    }
                }
                r13.A0z();
            }
            return new C53548GqJ(iGAdsCardBackgroundTypeEnum, iGAdsCardStickerCTATypeEnum, iGAdsCardStickerClickAreaEnum, iGAdsCardStickerSizeEnum, bool, bool2, num, num2, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
