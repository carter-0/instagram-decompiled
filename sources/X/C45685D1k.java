package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryMultiProductStickerLinkDataImpl;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1k  reason: case insensitive filesystem */
public abstract class C45685D1k {
    public static MultiProductSticker parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                if (C41846B3n.A1Y(r14, A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("is_organic_product_tagging".equals(A0q)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("links".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            StoryMultiProductStickerLinkDataImpl parseFromJson = C44412CeW.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1J(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("multi_product_items".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41846B3n.A1G(r14, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("stickers".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            StoryProductItemStickerTappableData parseFromJson2 = C44418Cec.parseFromJson(r14);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (C41845B3m.A1A(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("text_format".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("text_review_status".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if ("vibrant_text_color".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            return new MultiProductSticker(bool, str, str2, str3, str4, str5, str6, str7, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, MultiProductSticker multiProductSticker) {
        r3.A0c();
        C41846B3n.A0y(r3, multiProductSticker.A01);
        Boolean bool = multiProductSticker.A00;
        if (bool != null) {
            r3.A0S("is_organic_product_tagging", bool.booleanValue());
        }
        List list = multiProductSticker.A08;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "links", list);
            while (A0s.hasNext()) {
                StoryMultiProductStickerLinkData storyMultiProductStickerLinkData = (StoryMultiProductStickerLinkData) A0s.next();
                if (storyMultiProductStickerLinkData != null) {
                    StoryMultiProductStickerLinkDataImpl FAU = storyMultiProductStickerLinkData.FAU();
                    r3.A0c();
                    Integer num = FAU.A00;
                    if (num != null) {
                        r3.A0P("linkType", num.intValue());
                    }
                    r3.A0Z();
                }
            }
            r3.A0Y();
        }
        C41846B3n.A11(r3, multiProductSticker.A02);
        List list2 = multiProductSticker.A09;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r3, "multi_product_items", list2);
            while (A0s2.hasNext()) {
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) A0s2.next();
                if (productDetailsProductItemDict != null) {
                    C275404q6.A00(r3, productDetailsProductItemDict);
                }
            }
            r3.A0Y();
        }
        List list3 = multiProductSticker.A0A;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(r3, "stickers", list3);
            while (A0s3.hasNext()) {
                StoryProductItemStickerTappableData storyProductItemStickerTappableData = (StoryProductItemStickerTappableData) A0s3.next();
                if (storyProductItemStickerTappableData != null) {
                    r3.A0c();
                    ProductItemStickerBundleStyle productItemStickerBundleStyle = storyProductItemStickerTappableData.A00;
                    if (productItemStickerBundleStyle != null) {
                        r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, productItemStickerBundleStyle.A00);
                    }
                    r3.A0Z();
                }
            }
            r3.A0Y();
        }
        C41846B3n.A0z(r3, multiProductSticker.A03);
        String str = multiProductSticker.A04;
        if (str != null) {
            r3.A0R("text_format", str);
        }
        String str2 = multiProductSticker.A05;
        if (str2 != null) {
            r3.A0R("text_review_status", str2);
        }
        String str3 = multiProductSticker.A06;
        if (str3 != null) {
            r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
        }
        String str4 = multiProductSticker.A07;
        if (str4 != null) {
            r3.A0R("vibrant_text_color", str4);
        }
        r3.A0Z();
    }
}
