package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.41X  reason: invalid class name */
public abstract class AnonymousClass41X {
    public static AnonymousClass4hP parseFromJson(16F r15) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            AdsRatingInfo adsRatingInfo = null;
            MoreInfoStickerCTAType moreInfoStickerCTAType = null;
            String str6 = null;
            C275694rj r3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            MoreInfoType moreInfoType = null;
            MoreInfoProductTagType moreInfoProductTagType = null;
            ArrayList arrayList = null;
            MoreInfoSUGPositionType moreInfoSUGPositionType = null;
            MoreInfoTextStyle moreInfoTextStyle = null;
            Integer num = null;
            while (r15.A1J() != 16L.A09) {
                String A0q = r15.A0q();
                r15.A1J();
                if ("ads_ratings_and_review_info".equals(A0q)) {
                    adsRatingInfo = AnonymousClass5I9.parseFromJson(r15);
                } else if ("cta_sticker_style".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                    moreInfoStickerCTAType = (MoreInfoStickerCTAType) MoreInfoStickerCTAType.A01.get(str5);
                    if (moreInfoStickerCTAType == null) {
                        moreInfoStickerCTAType = MoreInfoStickerCTAType.UNRECOGNIZED;
                    }
                } else if ("display_string".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                } else if ("facepile".equals(A0q)) {
                    r3 = C275684rg.parseFromJson(r15);
                } else if ("hide_sug".equals(A0q)) {
                    bool = Boolean.valueOf(r15.A0d());
                } else if ("is_interactive".equals(A0q)) {
                    bool2 = Boolean.valueOf(r15.A0d());
                } else if ("more_info_type".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                    moreInfoType = (MoreInfoType) MoreInfoType.A01.get(str4);
                    if (moreInfoType == null) {
                        moreInfoType = MoreInfoType.UNRECOGNIZED;
                    }
                } else if ("product_tag_type".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                    moreInfoProductTagType = (MoreInfoProductTagType) MoreInfoProductTagType.A01.get(str3);
                    if (moreInfoProductTagType == null) {
                        moreInfoProductTagType = MoreInfoProductTagType.UNRECOGNIZED;
                    }
                } else if ("subitems".equals(A0q)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r15.A1J() != 16L.A08) {
                            C42048BFb parseFromJson = C44221Cai.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sug_position".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                    moreInfoSUGPositionType = (MoreInfoSUGPositionType) MoreInfoSUGPositionType.A01.get(str2);
                    if (moreInfoSUGPositionType == null) {
                        moreInfoSUGPositionType = MoreInfoSUGPositionType.UNRECOGNIZED;
                    }
                } else if ("text_style".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    moreInfoTextStyle = (MoreInfoTextStyle) MoreInfoTextStyle.A01.get(str);
                    if (moreInfoTextStyle == null) {
                        moreInfoTextStyle = MoreInfoTextStyle.UNRECOGNIZED;
                    }
                } else if (C66579MXk.A00(178).equals(A0q)) {
                    num = Integer.valueOf(r15.A1D());
                }
                r15.A0z();
            }
            return new AnonymousClass4hP(r3, moreInfoProductTagType, moreInfoSUGPositionType, moreInfoStickerCTAType, moreInfoTextStyle, moreInfoType, adsRatingInfo, bool, bool2, num, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, AnonymousClass4hP r5) {
        r4.A0c();
        AdsRatingInfo adsRatingInfo = r5.A06;
        if (adsRatingInfo != null) {
            r4.A0q("ads_ratings_and_review_info");
            AnonymousClass5I9.A00(r4, adsRatingInfo);
        }
        MoreInfoStickerCTAType moreInfoStickerCTAType = r5.A03;
        if (moreInfoStickerCTAType != null) {
            r4.A0R("cta_sticker_style", moreInfoStickerCTAType.A00);
        }
        String str = r5.A0A;
        if (str != null) {
            r4.A0R("display_string", str);
        }
        C275704rk r1 = r5.A00;
        if (r1 != null) {
            r4.A0q("facepile");
            C275694rj F6P = r1.F6P();
            r4.A0c();
            MoreInfoFacepilePositionType moreInfoFacepilePositionType = F6P.A00;
            if (moreInfoFacepilePositionType != null) {
                r4.A0R("position", moreInfoFacepilePositionType.A00);
            }
            MoreInfoFacepileSizeType moreInfoFacepileSizeType = F6P.A01;
            if (moreInfoFacepileSizeType != null) {
                r4.A0R("size", moreInfoFacepileSizeType.A00);
            }
            r4.A0Z();
        }
        Boolean bool = r5.A07;
        if (bool != null) {
            r4.A0S("hide_sug", bool.booleanValue());
        }
        Boolean bool2 = r5.A08;
        if (bool2 != null) {
            r4.A0S("is_interactive", bool2.booleanValue());
        }
        MoreInfoType moreInfoType = r5.A05;
        if (moreInfoType != null) {
            r4.A0R("more_info_type", moreInfoType.A00);
        }
        MoreInfoProductTagType moreInfoProductTagType = r5.A01;
        if (moreInfoProductTagType != null) {
            r4.A0R("product_tag_type", moreInfoProductTagType.A00);
        }
        List<C46253DSi> list = r5.A0B;
        if (list != null) {
            16P.A03(r4, "subitems");
            for (C46253DSi dSi : list) {
                if (dSi != null) {
                    C42048BFb F6R = dSi.F6R();
                    r4.A0c();
                    String str2 = F6R.A00;
                    if (str2 != null) {
                        r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str2);
                    }
                    String str3 = F6R.A01;
                    if (str3 != null) {
                        r4.A0R(AnonymousClass000.A00(1427), str3);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        MoreInfoSUGPositionType moreInfoSUGPositionType = r5.A02;
        if (moreInfoSUGPositionType != null) {
            r4.A0R("sug_position", moreInfoSUGPositionType.A00);
        }
        MoreInfoTextStyle moreInfoTextStyle = r5.A04;
        if (moreInfoTextStyle != null) {
            r4.A0R("text_style", moreInfoTextStyle.A00);
        }
        Integer num = r5.A09;
        if (num != null) {
            r4.A0P(C66579MXk.A00(178), num.intValue());
        }
        r4.A0Z();
    }
}
