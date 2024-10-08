package X;

import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.ReelCTA;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3m1  reason: invalid class name and case insensitive filesystem */
public abstract class C250763m1 {
    public static ReelCTA parseFromJson(16F r20) {
        String str;
        16F r4 = r20;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            EffectPreview effectPreview = null;
            String str5 = null;
            String str6 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            ReelMultiProductLink reelMultiProductLink = null;
            String str7 = null;
            ArrayList arrayList2 = null;
            ProductCollectionLink productCollectionLink = null;
            ReelProductLink reelProductLink = null;
            ProfileShopLink profileShopLink = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("cta_link_icon".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    shoppingSwipeUpCTATextIcon = (ShoppingSwipeUpCTATextIcon) ShoppingSwipeUpCTATextIcon.A01.get(str);
                    if (shoppingSwipeUpCTATextIcon == null) {
                        shoppingSwipeUpCTATextIcon = ShoppingSwipeUpCTATextIcon.UNRECOGNIZED;
                    }
                } else if ("cta_link_tap_and_hold_context".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("cta_link_text".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("cta_type".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("effect_preview".equals(A0q)) {
                    effectPreview = C263064Hf.parseFromJson(r4);
                } else if ("felix_deep_link".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("felix_video_id".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if ("has_instagram_shop_link".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                } else if ("links".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson = C250113kv.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(1606).equals(A0q)) {
                    reelMultiProductLink = C45690D1p.parseFromJson(r4);
                } else if ("object_id".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if (AnonymousClass000.A00(1705).equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson2 = C250113kv.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AnonymousClass000.A00(1706).equals(A0q)) {
                    productCollectionLink = C45686D1l.parseFromJson(r4);
                } else if (AnonymousClass000.A00(1708).equals(A0q)) {
                    reelProductLink = C44941Cnb.parseFromJson(r4);
                } else if ("profile_shop_link".equals(A0q)) {
                    profileShopLink = C45689D1o.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new ReelCTA(shoppingSwipeUpCTATextIcon, effectPreview, productCollectionLink, profileShopLink, reelMultiProductLink, reelProductLink, bool, str2, str3, str4, str5, str6, str7, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, ReelCTA reelCTA) {
        r2.A0c();
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = reelCTA.A00;
        if (shoppingSwipeUpCTATextIcon != null) {
            r2.A0R("cta_link_icon", shoppingSwipeUpCTATextIcon.A00);
        }
        String str = reelCTA.A07;
        if (str != null) {
            r2.A0R("cta_link_tap_and_hold_context", str);
        }
        String str2 = reelCTA.A08;
        if (str2 != null) {
            r2.A0R("cta_link_text", str2);
        }
        String str3 = reelCTA.A09;
        if (str3 != null) {
            r2.A0R("cta_type", str3);
        }
        EffectPreview effectPreview = reelCTA.A01;
        if (effectPreview != null) {
            r2.A0q("effect_preview");
            C263064Hf.A00(r2, effectPreview);
        }
        String str4 = reelCTA.A0A;
        if (str4 != null) {
            r2.A0R("felix_deep_link", str4);
        }
        String str5 = reelCTA.A0B;
        if (str5 != null) {
            r2.A0R("felix_video_id", str5);
        }
        Boolean bool = reelCTA.A06;
        if (bool != null) {
            r2.A0S("has_instagram_shop_link", bool.booleanValue());
        }
        List<AndroidLink> list = reelCTA.A0D;
        if (list != null) {
            16P.A03(r2, "links");
            for (AndroidLink androidLink : list) {
                if (androidLink != null) {
                    C250113kv.A00(r2, androidLink.FES());
                }
            }
            r2.A0Y();
        }
        ReelMultiProductLink reelMultiProductLink = reelCTA.A04;
        if (reelMultiProductLink != null) {
            r2.A0q(AnonymousClass000.A00(1606));
            C45690D1p.A00(r2, reelMultiProductLink);
        }
        String str6 = reelCTA.A0C;
        if (str6 != null) {
            r2.A0R("object_id", str6);
        }
        List<AndroidLink> list2 = reelCTA.A0E;
        if (list2 != null) {
            16P.A03(r2, AnonymousClass000.A00(1705));
            for (AndroidLink androidLink2 : list2) {
                if (androidLink2 != null) {
                    C250113kv.A00(r2, androidLink2.FES());
                }
            }
            r2.A0Y();
        }
        ProductCollectionLink productCollectionLink = reelCTA.A02;
        if (productCollectionLink != null) {
            r2.A0q(AnonymousClass000.A00(1706));
            C45686D1l.A00(r2, productCollectionLink);
        }
        ReelProductLink reelProductLink = reelCTA.A05;
        if (reelProductLink != null) {
            r2.A0q(AnonymousClass000.A00(1708));
            r2.A0c();
            ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
            if (productDetailsProductItemDict != null) {
                r2.A0q("product");
                C275404q6.A00(r2, productDetailsProductItemDict);
            }
            r2.A0Z();
        }
        ProfileShopLink profileShopLink = reelCTA.A03;
        if (profileShopLink != null) {
            r2.A0q("profile_shop_link");
            C45689D1o.A00(r2, profileShopLink);
        }
        r2.A0Z();
    }
}
