package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HbO  reason: case insensitive filesystem */
public abstract /* synthetic */ class C55053HbO {
    public static Map A00(C270164gI r6) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str7 = null;
        if (r6.Aes() != null) {
            IGAdsCardBackgroundTypeEnum Aes = r6.Aes();
            if (Aes != null) {
                str6 = Aes.A00;
            } else {
                str6 = null;
            }
            A1H.put("background_type", str6);
        }
        if (r6.AnS() != null) {
            IGAdsCardStickerClickAreaEnum AnS = r6.AnS();
            if (AnS != null) {
                str5 = AnS.A00;
            } else {
                str5 = null;
            }
            A1H.put("click_area", str5);
        }
        if (r6.AtH() != null) {
            A1H.put("cta_highlight_dwell_time_duration_ms", r6.AtH());
        }
        if (r6.AtS() != null) {
            IGAdsCardStickerCTATypeEnum AtS = r6.AtS();
            if (AtS != null) {
                str4 = AtS.A00;
            } else {
                str4 = null;
            }
            A1H.put("cta_type", str4);
        }
        if (r6.Azf() != null) {
            A1H.put("dynamic_tooltip_time_duration_ms", r6.Azf());
        }
        if (r6.B7X() != null) {
            IGAdsGenericCardFormatEnum B7X = r6.B7X();
            if (B7X != null) {
                str3 = B7X.A00;
            } else {
                str3 = null;
            }
            A1H.put("format_type", str3);
        }
        if (r6.BCo() != null) {
            A1H.put("headline", r6.BCo());
        }
        if (r6.BH0() != null) {
            IGAdsGenericCardInfoTypeEnum BH0 = r6.BH0();
            if (BH0 != null) {
                str2 = BH0.A00;
            } else {
                str2 = null;
            }
            A1H.put("info_type", str2);
        }
        if (r6.BH2() != null) {
            List<IGAdsGenericCardInfoTypeEnum> BH2 = r6.BH2();
            if (BH2 != null) {
                arrayList = AnonymousClass7TG.A0r(BH2);
                for (IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum : BH2) {
                    0qQ.A0B(iGAdsGenericCardInfoTypeEnum, 0);
                    arrayList.add(iGAdsGenericCardInfoTypeEnum.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("info_types", arrayList);
        }
        if (r6.BJi() != null) {
            A1H.put(AnonymousClass000.A00(3477), r6.BJi());
        }
        if (r6.BXT() != null) {
            A1H.put("number_of_followers", r6.BXT());
        }
        if (r6.Bb6() != null) {
            A1H.put(C273654mx.A00(876), r6.Bb6());
        }
        if (r6.BfM() != null) {
            A1H.put("price_range", r6.BfM());
        }
        if (r6.Bo8() != null) {
            A1H.put(C273654mx.A00(3272), r6.Bo8());
        }
        if (r6.Bor() != null) {
            C2804351v Bor = r6.Bor();
            if (Bor != null) {
                treeUpdaterJNI = Bor.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("rr_info", treeUpdaterJNI);
        }
        if (r6.Bth() != null) {
            A1H.put(C273654mx.A00(3328), r6.Bth());
        }
        if (r6.Btv() != null) {
            A1H.put("short_caption", r6.Btv());
        }
        if (r6.Bun() != null) {
            A1H.put("should_show_SUG", r6.Bun());
        }
        if (r6.Bui() != null) {
            A1H.put("should_show_revamp_sticker_design", r6.Bui());
        }
        if (r6.Buq() != null) {
            A1H.put("should_show_url_in_tooltip", r6.Buq());
        }
        if (r6.Bzg() != null) {
            IGAdsCardStickerSizeEnum Bzg = r6.Bzg();
            if (Bzg != null) {
                str = Bzg.A00;
            } else {
                str = null;
            }
            A1H.put("sticker_size", str);
        }
        if (r6.CAw() != null) {
            IGAdsStickerCardRevampTypographyHierarchyEnum CAw = r6.CAw();
            if (CAw != null) {
                str7 = CAw.A00;
            }
            A1H.put("typography_hierarchy_type", str7);
        }
        if (r6.CGM() != null) {
            A1H.put("website_name", r6.CGM());
        }
        return 0Yt.A0B(A1H);
    }
}
