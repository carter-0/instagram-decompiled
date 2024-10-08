package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class I6J {
    public static final I6J A00 = new Object();

    public static final int A00(ProductType productType) {
        int ordinal;
        if (productType == null || (ordinal = productType.ordinal()) == -1) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        if (ordinal == 13) {
            return 16;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 16) {
            return 9;
        }
        if (ordinal != 9) {
            return 0;
        }
        return 3;
    }

    public static final LinkedHashMap A01(List list, List list2, List list3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = null;
        if (!(list == null && list2 == null && list3 == null)) {
            linkedHashMap = AnonymousClass7TE.A1H();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AchievementIntf achievementIntf = (AchievementIntf) it.next();
                    linkedHashMap.put(achievementIntf.BVI().toString(), AnonymousClass7TF.A0w("is_earned", Boolean.valueOf(AnonymousClass7TF.A1V(achievementIntf.C7F()))).toString());
                }
            }
            String A002 = AnonymousClass000.A00(354);
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Challenge challenge = (Challenge) it2.next();
                    String obj = challenge.A05.toString();
                    String str6 = challenge.A09;
                    if (str6 == null) {
                        str6 = "";
                    }
                    0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(1164), str6);
                    0eP A1L2 = AnonymousClass7TE.A1L(ReactProgressBarViewManager.PROP_PROGRESS, String.valueOf(challenge.A00));
                    0eP A1L3 = AnonymousClass7TE.A1L("total", String.valueOf(challenge.A01));
                    Integer num = challenge.A07;
                    if (num == null || (str3 = num.toString()) == null) {
                        str3 = "";
                    }
                    0eP A1L4 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1543), str3);
                    0eP A1L5 = AnonymousClass7TE.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, challenge.A06.A00);
                    String str7 = challenge.A08;
                    if (str7 == null) {
                        str7 = "";
                    }
                    0eP A1L6 = AnonymousClass7TE.A1L(A002, str7);
                    ChallengeButtonInfo challengeButtonInfo = challenge.A03;
                    if (challengeButtonInfo == null || (str4 = challengeButtonInfo.Air()) == null) {
                        str4 = "";
                    }
                    0eP A1L7 = AnonymousClass7TE.A1L("progress_description_button_text", str4);
                    if (challengeButtonInfo == null || (str5 = challengeButtonInfo.Avk()) == null) {
                        str5 = "";
                    }
                    linkedHashMap.put(obj, 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AnonymousClass7TE.A1L("progress_description_button_deeplink_url", str5)}).toString());
                }
            }
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    ChallengeDetails challengeDetails = (ChallengeDetails) it3.next();
                    String obj2 = challengeDetails.A05.toString();
                    0eP A1L8 = AnonymousClass7TE.A1L(DialogModule.KEY_TITLE, challengeDetails.A0E);
                    0eP A1L9 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj2);
                    String str8 = challengeDetails.A0D;
                    if (str8 == null) {
                        str8 = "";
                    }
                    0eP A1L10 = AnonymousClass7TE.A1L("subtitle", str8);
                    0eP A1L11 = AnonymousClass7TE.A1L(ReactProgressBarViewManager.PROP_PROGRESS, String.valueOf(challengeDetails.A00));
                    0eP A1L12 = AnonymousClass7TE.A1L("total", String.valueOf(challengeDetails.A01));
                    0eP A1L13 = AnonymousClass7TE.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, challengeDetails.A06.A00);
                    String str9 = challengeDetails.A08;
                    if (str9 == null) {
                        str9 = "";
                    }
                    0eP A1L14 = AnonymousClass7TE.A1L(DevServerEntity.COLUMN_DESCRIPTION, str9);
                    String str10 = challengeDetails.A0C;
                    if (str10 == null) {
                        str10 = "";
                    }
                    0eP A1L15 = AnonymousClass7TE.A1L(A002, str10);
                    ChallengeButtonInfo challengeButtonInfo2 = challengeDetails.A03;
                    if (challengeButtonInfo2 == null || (str = challengeButtonInfo2.Air()) == null) {
                        str = "";
                    }
                    0eP A1L16 = AnonymousClass7TE.A1L("progress_description_button_text", str);
                    if (challengeButtonInfo2 == null || (str2 = challengeButtonInfo2.Avk()) == null) {
                        str2 = "";
                    }
                    linkedHashMap.put(obj2, 0Yt.A06(new 0eP[]{A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, AnonymousClass7TE.A1L("progress_description_button_deeplink_url", str2)}).toString());
                }
            }
        }
        return linkedHashMap;
    }

    public final void A06(UserSession userSession, String str, String str2) {
        A04(userSession, (ProductType) null, str, (String) null, str2, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null);
    }

    public final void A07(UserSession userSession, String str, String str2, String str3, String str4, String str5, List list) {
        A03(userSession, (ProductType) null, str, str2, str3, str4, str5, list, (List) null, (List) null, (Map) null, (Map) null);
    }

    public final void A08(UserSession userSession, String str, String str2, String str3, String str4, List list, List list2, List list3, Map map) {
        A05(userSession, (ProductType) null, str, str2, str3, str4, list, list2, list3, (List) null, (List) null, (Map) null, map);
    }

    public static final List A02(List list) {
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object A1E : list) {
            C51973G9u.A1F(C41847B3o.A1E(A1E), A1C);
        }
        return A1C;
    }

    public final void A05(UserSession userSession, ProductType productType, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, Map map, Map map2) {
        ArrayList arrayList;
        Map map3 = map;
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        A0M.A01 = "ig_achievements";
        0Aj A0e = AnonymousClass7TE.A0e(A0M.A00(), "ig_achievements");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, "click");
            A0e.AAJ("screen", str);
            A0e.AAJ("target", str2);
            DbS.A1N(A0e, str3);
            int A002 = A00(productType);
            if (A002 != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0e, "product_type", A002);
            } else {
                A0e.AAJ("product_type", (String) null);
            }
            A0e.A9F("media_igid", DbZ.A0d(str4));
            A0e.AAe("achievement_ids", A02(list));
            if (list2 != null) {
                arrayList = AnonymousClass7TG.A0r(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    DbU.A1X(((AchievementIntf) it.next()).BVI(), arrayList);
                }
            } else {
                arrayList = null;
            }
            A0e.AAe("achievement_names", arrayList);
            A0e.AAe("challenge_ids", list3);
            List<Challenge> list6 = list5;
            ArrayList arrayList2 = list4;
            if (list4 == null) {
                if (list5 != null) {
                    ArrayList A0r = AnonymousClass7TG.A0r(list6);
                    for (Challenge challenge : list6) {
                        DbU.A1X(challenge.A05, A0r);
                    }
                    arrayList2 = A0r;
                } else {
                    arrayList2 = null;
                }
            }
            A0e.AAe("challenge_names", arrayList2);
            if (map == null) {
                map3 = A01(list2, list6, (List) null);
            }
            A0e.A9H("additional_achievements_data", map3);
            A0e.A9H("extra_data", map2);
            A0e.Cgf();
        }
    }

    public final void A03(UserSession userSession, ProductType productType, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, Map map, Map map2) {
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        A0M.A01 = "ig_achievements";
        0Aj A0e = AnonymousClass7TE.A0e(A0M.A00(), "ig_achievements");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, "reliability_client");
            A0e.AAJ("screen", str);
            A0e.AAJ("target", str2);
            DbS.A1N(A0e, str3);
            int A002 = A00(productType);
            if (A002 != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0e, "product_type", A002);
            } else {
                A0e.AAJ("product_type", (String) null);
            }
            A0e.A9F("media_igid", DbZ.A0d(str4));
            A0e.AAe("achievement_ids", A02(list));
            A0e.AAe("achievement_names", (List) null);
            A0e.AAe("challenge_ids", list2);
            if (list3 == null) {
                list3 = null;
            }
            A0e.AAe("challenge_names", list3);
            if (map == null) {
                map = null;
            }
            A0e.A9H("additional_achievements_data", map);
            C51969G9p.A1E(A0e, "error_message", str5, map2);
            A0e.Cgf();
        }
    }

    public final void A04(UserSession userSession, ProductType productType, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, List list6, Map map) {
        ArrayList arrayList;
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        A0M.A01 = "ig_achievements";
        0Aj A0e = AnonymousClass7TE.A0e(A0M.A00(), "ig_achievements");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, "impression");
            A0e.AAJ("screen", str);
            A0e.AAJ("target", str2);
            DbS.A1N(A0e, str3);
            int A002 = A00(productType);
            if (A002 != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0e, "product_type", A002);
            } else {
                A0e.AAJ("product_type", (String) null);
            }
            A0e.A9F("media_igid", DbZ.A0d(str4));
            A0e.AAe("achievement_ids", A02(list));
            if (list2 != null) {
                arrayList = AnonymousClass7TG.A0r(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    DbU.A1X(((AchievementIntf) it.next()).BVI(), arrayList);
                }
            } else {
                arrayList = null;
            }
            A0e.AAe("achievement_names", arrayList);
            A0e.AAe("challenge_ids", list3);
            ArrayList arrayList2 = list5;
            if (list5 == null) {
                if (list4 != null) {
                    ArrayList A0r = AnonymousClass7TG.A0r(list4);
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        DbU.A1X(((Challenge) it2.next()).A05, A0r);
                    }
                    arrayList2 = A0r;
                } else {
                    arrayList2 = null;
                }
            }
            A0e.AAe("challenge_names", arrayList2);
            A0e.A9H("additional_achievements_data", A01(list2, list4, list6));
            A0e.A9H("extra_data", map);
            A0e.Cgf();
        }
    }
}
