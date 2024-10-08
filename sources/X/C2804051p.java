package X;

import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsRrFormatEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.51p  reason: invalid class name and case insensitive filesystem */
public abstract class C2804051p {
    public static C270154gH parseFromJson(16F r27) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        16F r3 = r27;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = null;
            IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = null;
            Integer num = null;
            IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = null;
            Integer num2 = null;
            IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = null;
            String str9 = null;
            IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = null;
            ArrayList arrayList = null;
            String str10 = null;
            Integer num3 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            C2804251u r12 = null;
            String str14 = null;
            String str15 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = null;
            IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = null;
            String str16 = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("background_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                    iGAdsCardBackgroundTypeEnum = (IGAdsCardBackgroundTypeEnum) IGAdsCardBackgroundTypeEnum.A01.get(str8);
                    if (iGAdsCardBackgroundTypeEnum == null) {
                        iGAdsCardBackgroundTypeEnum = IGAdsCardBackgroundTypeEnum.UNRECOGNIZED;
                    }
                } else if ("click_area".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                    iGAdsCardStickerClickAreaEnum = (IGAdsCardStickerClickAreaEnum) IGAdsCardStickerClickAreaEnum.A01.get(str7);
                    if (iGAdsCardStickerClickAreaEnum == null) {
                        iGAdsCardStickerClickAreaEnum = IGAdsCardStickerClickAreaEnum.UNRECOGNIZED;
                    }
                } else if ("cta_highlight_dwell_time_duration_ms".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("cta_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                    iGAdsCardStickerCTATypeEnum = (IGAdsCardStickerCTATypeEnum) IGAdsCardStickerCTATypeEnum.A01.get(str6);
                    if (iGAdsCardStickerCTATypeEnum == null) {
                        iGAdsCardStickerCTATypeEnum = IGAdsCardStickerCTATypeEnum.UNRECOGNIZED;
                    }
                } else if ("dynamic_tooltip_time_duration_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r3.A1D());
                } else if ("format_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                    iGAdsGenericCardFormatEnum = (IGAdsGenericCardFormatEnum) IGAdsGenericCardFormatEnum.A01.get(str5);
                    if (iGAdsGenericCardFormatEnum == null) {
                        iGAdsGenericCardFormatEnum = IGAdsGenericCardFormatEnum.UNRECOGNIZED;
                    }
                } else if ("headline".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r3.A1P();
                    }
                } else if ("info_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                    iGAdsGenericCardInfoTypeEnum = (IGAdsGenericCardInfoTypeEnum) IGAdsGenericCardInfoTypeEnum.A01.get(str4);
                    if (iGAdsGenericCardInfoTypeEnum == null) {
                        iGAdsGenericCardInfoTypeEnum = IGAdsGenericCardInfoTypeEnum.UNRECOGNIZED;
                    }
                } else if ("info_types".equals(A0q)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            if (r3.A11() == 16L.A0G) {
                                str3 = null;
                            } else {
                                str3 = r3.A1P();
                            }
                            IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum2 = (IGAdsGenericCardInfoTypeEnum) IGAdsGenericCardInfoTypeEnum.A01.get(str3);
                            if (iGAdsGenericCardInfoTypeEnum2 == null) {
                                iGAdsGenericCardInfoTypeEnum2 = IGAdsGenericCardInfoTypeEnum.UNRECOGNIZED;
                            }
                            arrayList.add(iGAdsGenericCardInfoTypeEnum2);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("join_date_str".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r3.A1P();
                    }
                } else if ("number_of_followers".equals(A0q)) {
                    num3 = Integer.valueOf(r3.A1D());
                } else if ("payment_options".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r3.A1P();
                    }
                } else if ("price_range".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r3.A1P();
                    }
                } else if ("return_policy".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r3.A1P();
                    }
                } else if ("rr_info".equals(A0q)) {
                    r12 = C17015VEp.parseFromJson(r3);
                } else if ("shipping_policy".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r3.A1P();
                    }
                } else if ("short_caption".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r3.A1P();
                    }
                } else if ("should_show_SUG".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                } else if ("should_show_revamp_sticker_design".equals(A0q)) {
                    bool2 = Boolean.valueOf(r3.A0d());
                } else if ("should_show_url_in_tooltip".equals(A0q)) {
                    bool3 = Boolean.valueOf(r3.A0d());
                } else if ("sticker_size".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                    iGAdsCardStickerSizeEnum = (IGAdsCardStickerSizeEnum) IGAdsCardStickerSizeEnum.A01.get(str2);
                    if (iGAdsCardStickerSizeEnum == null) {
                        iGAdsCardStickerSizeEnum = IGAdsCardStickerSizeEnum.UNRECOGNIZED;
                    }
                } else if ("typography_hierarchy_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    iGAdsStickerCardRevampTypographyHierarchyEnum = (IGAdsStickerCardRevampTypographyHierarchyEnum) IGAdsStickerCardRevampTypographyHierarchyEnum.A01.get(str);
                    if (iGAdsStickerCardRevampTypographyHierarchyEnum == null) {
                        iGAdsStickerCardRevampTypographyHierarchyEnum = IGAdsStickerCardRevampTypographyHierarchyEnum.UNRECOGNIZED;
                    }
                } else if ("website_name".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            return new C270154gH(iGAdsCardBackgroundTypeEnum, iGAdsCardStickerCTATypeEnum, iGAdsCardStickerClickAreaEnum, iGAdsCardStickerSizeEnum, iGAdsGenericCardFormatEnum, iGAdsGenericCardInfoTypeEnum, iGAdsStickerCardRevampTypographyHierarchyEnum, r12, bool, bool2, bool3, num, num2, num3, str9, str10, str11, str12, str13, str14, str15, str16, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, C270154gH r6) {
        r5.A0c();
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = r6.A00;
        if (iGAdsCardBackgroundTypeEnum != null) {
            r5.A0R("background_type", iGAdsCardBackgroundTypeEnum.A00);
        }
        IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = r6.A02;
        if (iGAdsCardStickerClickAreaEnum != null) {
            r5.A0R("click_area", iGAdsCardStickerClickAreaEnum.A00);
        }
        Integer num = r6.A0B;
        if (num != null) {
            r5.A0P("cta_highlight_dwell_time_duration_ms", num.intValue());
        }
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = r6.A01;
        if (iGAdsCardStickerCTATypeEnum != null) {
            r5.A0R("cta_type", iGAdsCardStickerCTATypeEnum.A00);
        }
        Integer num2 = r6.A0C;
        if (num2 != null) {
            r5.A0P("dynamic_tooltip_time_duration_ms", num2.intValue());
        }
        IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = r6.A04;
        if (iGAdsGenericCardFormatEnum != null) {
            r5.A0R("format_type", iGAdsGenericCardFormatEnum.A00);
        }
        String str = r6.A0E;
        if (str != null) {
            r5.A0R("headline", str);
        }
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = r6.A05;
        if (iGAdsGenericCardInfoTypeEnum != null) {
            r5.A0R("info_type", iGAdsGenericCardInfoTypeEnum.A00);
        }
        List<IGAdsGenericCardInfoTypeEnum> list = r6.A0M;
        if (list != null) {
            16P.A03(r5, "info_types");
            for (IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum2 : list) {
                if (iGAdsGenericCardInfoTypeEnum2 != null) {
                    r5.A0t(iGAdsGenericCardInfoTypeEnum2.A00);
                }
            }
            r5.A0Y();
        }
        String str2 = r6.A0F;
        if (str2 != null) {
            r5.A0R("join_date_str", str2);
        }
        Integer num3 = r6.A0D;
        if (num3 != null) {
            r5.A0P("number_of_followers", num3.intValue());
        }
        String str3 = r6.A0G;
        if (str3 != null) {
            r5.A0R("payment_options", str3);
        }
        String str4 = r6.A0H;
        if (str4 != null) {
            r5.A0R("price_range", str4);
        }
        String str5 = r6.A0I;
        if (str5 != null) {
            r5.A0R("return_policy", str5);
        }
        C2804251u r3 = r6.A07;
        if (r3 != null) {
            r5.A0q("rr_info");
            r5.A0c();
            UN3 un3 = r3.A00;
            if (un3 != null) {
                r5.A0q("core_rating_info");
                r5.A0c();
                Float f = un3.A00;
                if (f != null) {
                    r5.A0O("avg_rating", f.floatValue());
                }
                Integer num4 = un3.A02;
                if (num4 != null) {
                    r5.A0P("review_count", num4.intValue());
                }
                Float f2 = un3.A01;
                if (f2 != null) {
                    r5.A0O("satisfaction_score", f2.floatValue());
                }
                r5.A0Z();
            }
            UOA uoa = r3.A02;
            if (uoa != null) {
                r5.A0q("profile_card_display_info");
                r5.A0c();
                UN8 un8 = uoa.A00;
                if (un8 != null) {
                    r5.A0q("dimensional_info");
                    r5.A0c();
                    String str6 = un8.A01;
                    if (str6 != null) {
                        r5.A0R("dimension", str6);
                    }
                    String str7 = un8.A02;
                    if (str7 != null) {
                        r5.A0R("rating_text", str7);
                    }
                    Integer num5 = un8.A00;
                    if (num5 != null) {
                        r5.A0P("satisfaction_score_converted", num5.intValue());
                    }
                    String str8 = un8.A03;
                    if (str8 != null) {
                        r5.A0R("satisfaction_text", str8);
                    }
                    r5.A0Z();
                }
                UN9 un9 = uoa.A01;
                if (un9 != null) {
                    r5.A0q("rating_only_info");
                    r5.A0c();
                    String str9 = un9.A00;
                    if (str9 != null) {
                        r5.A0R("rating_only_text", str9);
                    }
                    String str10 = un9.A01;
                    if (str10 != null) {
                        r5.A0R("review_count_text", str10);
                    }
                    r5.A0Z();
                }
                UNA una = uoa.A02;
                if (una != null) {
                    r5.A0q("topics_info");
                    r5.A0c();
                    String str11 = una.A00;
                    if (str11 != null) {
                        r5.A0R("rating_text", str11);
                    }
                    String str12 = una.A01;
                    if (str12 != null) {
                        r5.A0R("topic_text", str12);
                    }
                    List<String> list2 = una.A02;
                    if (list2 != null) {
                        16P.A03(r5, "topics");
                        for (String str13 : list2) {
                            if (str13 != null) {
                                r5.A0t(str13);
                            }
                        }
                        r5.A0Y();
                    }
                    r5.A0Z();
                }
                r5.A0Z();
            }
            IGAdsRrFormatEnum iGAdsRrFormatEnum = r3.A01;
            if (iGAdsRrFormatEnum != null) {
                r5.A0R("rr_format", iGAdsRrFormatEnum.A00);
            }
            r5.A0Z();
        }
        String str14 = r6.A0J;
        if (str14 != null) {
            r5.A0R("shipping_policy", str14);
        }
        String str15 = r6.A0K;
        if (str15 != null) {
            r5.A0R("short_caption", str15);
        }
        Boolean bool = r6.A09;
        if (bool != null) {
            r5.A0S("should_show_SUG", bool.booleanValue());
        }
        Boolean bool2 = r6.A08;
        if (bool2 != null) {
            r5.A0S("should_show_revamp_sticker_design", bool2.booleanValue());
        }
        Boolean bool3 = r6.A0A;
        if (bool3 != null) {
            r5.A0S("should_show_url_in_tooltip", bool3.booleanValue());
        }
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = r6.A03;
        if (iGAdsCardStickerSizeEnum != null) {
            r5.A0R("sticker_size", iGAdsCardStickerSizeEnum.A00);
        }
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = r6.A06;
        if (iGAdsStickerCardRevampTypographyHierarchyEnum != null) {
            r5.A0R("typography_hierarchy_type", iGAdsStickerCardRevampTypographyHierarchyEnum.A00);
        }
        String str16 = r6.A0L;
        if (str16 != null) {
            r5.A0R("website_name", str16);
        }
        r5.A0Z();
    }
}
