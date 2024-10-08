package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1c  reason: case insensitive filesystem */
public abstract class C45677D1c {
    public static C239673Ho parseFromJson(16F r20) {
        String str;
        String str2;
        String str3;
        16F r4 = r20;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C61222JzF jzF = null;
            C61222JzF jzF2 = null;
            C61222JzF jzF3 = null;
            Integer num = null;
            ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = null;
            Long l = null;
            Boolean bool = null;
            ShoppingNetegoType shoppingNetegoType = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            C61222JzF jzF4 = null;
            ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = null;
            C61222JzF jzF5 = null;
            String str4 = null;
            String str5 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("bottom_cta".equals(A17)) {
                    jzF = LJK.parseFromJson(r4);
                } else if ("description_header".equals(A17)) {
                    jzF2 = LJK.parseFromJson(r4);
                } else if ("description_text".equals(A17)) {
                    jzF3 = LJK.parseFromJson(r4);
                } else if (TraceFieldType.Duration.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                    shoppingNetegoInStoryIconType = (ShoppingNetegoInStoryIconType) ShoppingNetegoInStoryIconType.A01.get(str3);
                    if (shoppingNetegoInStoryIconType == null) {
                        shoppingNetegoInStoryIconType = ShoppingNetegoInStoryIconType.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A17(A17)) {
                    l = AnonymousClass7TF.A0Z(r4);
                } else if ("is_unit_dismissable".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("netego_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                    shoppingNetegoType = (ShoppingNetegoType) ShoppingNetegoType.A01.get(str2);
                    if (shoppingNetegoType == null) {
                        shoppingNetegoType = ShoppingNetegoType.UNRECOGNIZED;
                    }
                } else if ("products".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C42126BIe parseFromJson = C44897Cmn.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("shops".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C42127BIf parseFromJson2 = C44899Cmp.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    jzF4 = LJK.parseFromJson(r4);
                } else if ("suggestion_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    shoppingNetegoInStorySuggestionType = (ShoppingNetegoInStorySuggestionType) ShoppingNetegoInStorySuggestionType.A01.get(str);
                    if (shoppingNetegoInStorySuggestionType == null) {
                        shoppingNetegoInStorySuggestionType = ShoppingNetegoInStorySuggestionType.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    jzF5 = LJK.parseFromJson(r4);
                } else if (C41845B3m.A1W(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("ui_variant".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                }
                r4.A0z();
            }
            return new C239673Ho(jzF, jzF2, jzF3, jzF4, jzF5, shoppingNetegoInStoryIconType, shoppingNetegoInStorySuggestionType, shoppingNetegoType, bool, num, l, str4, str5, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r5, C239673Ho r6) {
        r5.A0c();
        C61222JzF jzF = r6.A00;
        if (jzF != null) {
            r5.A0q("bottom_cta");
            LJK.A00(r5, jzF);
        }
        C61222JzF jzF2 = r6.A01;
        if (jzF2 != null) {
            r5.A0q("description_header");
            LJK.A00(r5, jzF2);
        }
        C61222JzF jzF3 = r6.A02;
        if (jzF3 != null) {
            r5.A0q("description_text");
            LJK.A00(r5, jzF3);
        }
        Integer num = r6.A09;
        if (num != null) {
            r5.A0P(TraceFieldType.Duration, num.intValue());
        }
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = r6.A05;
        if (shoppingNetegoInStoryIconType != null) {
            r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, shoppingNetegoInStoryIconType.A00);
        }
        Long l = r6.A0A;
        if (l != null) {
            r5.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l.longValue());
        }
        Boolean bool = r6.A08;
        if (bool != null) {
            r5.A0S("is_unit_dismissable", bool.booleanValue());
        }
        ShoppingNetegoType shoppingNetegoType = r6.A07;
        if (shoppingNetegoType != null) {
            r5.A0R("netego_type", shoppingNetegoType.A00);
        }
        List list = r6.A0D;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r5, "products", list);
            while (A0s.hasNext()) {
                C42126BIe bIe = (C42126BIe) A0s.next();
                if (bIe != null) {
                    r5.A0c();
                    Long l2 = bIe.A02;
                    if (l2 != null) {
                        r5.A0Q("ad_id", l2.longValue());
                    }
                    String str = bIe.A03;
                    if (str != null) {
                        r5.A0R("card_modifier_label", str);
                    }
                    C61222JzF jzF4 = bIe.A00;
                    if (jzF4 != null) {
                        r5.A0q("cta");
                        LJK.A00(r5, jzF4);
                    }
                    ProductDetailsProductItemDict productDetailsProductItemDict = bIe.A01;
                    if (productDetailsProductItemDict != null) {
                        r5.A0q("micro_product");
                        C275404q6.A00(r5, productDetailsProductItemDict);
                    }
                    String str2 = bIe.A04;
                    if (str2 != null) {
                        r5.A0R("product_context", str2);
                    }
                    List list2 = bIe.A05;
                    if (list2 != null) {
                        Iterator A0s2 = C41845B3m.A0s(r5, "shoppable_media", list2);
                        while (A0s2.hasNext()) {
                            C46282DTl dTl = (C46282DTl) A0s2.next();
                            if (dTl != null) {
                                C42068BFv F7q = dTl.F7q(new 1hu((UserSession) null));
                                r5.A0c();
                                String str3 = F7q.A01;
                                if (str3 != null) {
                                    r5.A0R("highlighted_media_id", str3);
                                }
                                1Xj r1 = F7q.A00;
                                if (r1 != null) {
                                    r5.A0q("media");
                                    1Xv r0 = 1Xj.A0h;
                                    1Xv.A07(r5, r1);
                                }
                                r5.A0Z();
                            }
                        }
                        r5.A0Y();
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        List list3 = r6.A0E;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(r5, "shops", list3);
            while (A0s3.hasNext()) {
                C42127BIf bIf = (C42127BIf) A0s3.next();
                if (bIf != null) {
                    r5.A0c();
                    Long l3 = bIf.A02;
                    if (l3 != null) {
                        r5.A0Q("ad_id", l3.longValue());
                    }
                    C61222JzF jzF5 = bIf.A00;
                    if (jzF5 != null) {
                        r5.A0q("cta");
                        LJK.A00(r5, jzF5);
                    }
                    User user = bIf.A01;
                    if (user != null) {
                        C41845B3m.A0w(r5, user, "merchant");
                    }
                    String str4 = bIf.A03;
                    if (str4 != null) {
                        r5.A0R("merchant_details", str4);
                    }
                    List list4 = bIf.A04;
                    if (list4 != null) {
                        Iterator A0s4 = C41845B3m.A0s(r5, "product_image_urls", list4);
                        while (A0s4.hasNext()) {
                            C41846B3n.A18(r5, A0s4);
                        }
                        r5.A0Y();
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        C61222JzF jzF6 = r6.A03;
        if (jzF6 != null) {
            r5.A0q("subtitle");
            LJK.A00(r5, jzF6);
        }
        ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = r6.A06;
        if (shoppingNetegoInStorySuggestionType != null) {
            r5.A0R("suggestion_type", shoppingNetegoInStorySuggestionType.A00);
        }
        C61222JzF jzF7 = r6.A04;
        if (jzF7 != null) {
            r5.A0q(DialogModule.KEY_TITLE);
            LJK.A00(r5, jzF7);
        }
        String str5 = r6.A0B;
        if (str5 != null) {
            r5.A0R("tracking_token", str5);
        }
        String str6 = r6.A0C;
        if (str6 != null) {
            r5.A0R("ui_variant", str6);
        }
        r5.A0Z();
    }
}
