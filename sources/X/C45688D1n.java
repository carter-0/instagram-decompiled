package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1n  reason: case insensitive filesystem */
public abstract class C45688D1n {
    public static ProductSticker parseFromJson(16F r19) {
        String str;
        16F r3 = r19;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            String str2 = null;
            DropsLaunchAnimation dropsLaunchAnimation = null;
            DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            ArrayList arrayList = null;
            String str5 = null;
            String str6 = null;
            TextReviewStatus textReviewStatus = null;
            String str7 = null;
            String str8 = null;
            Boolean bool3 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("creation_method".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("drops_launch_animation".equals(A17)) {
                    dropsLaunchAnimation = C44918Cn9.parseFromJson(r3);
                } else if ("event_page_navigation_metadata".equals(A17)) {
                    dropsEventPageNavigationMetadataImpl = CXG.parseFromJson(r3);
                } else if (C41845B3m.A17(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("is_organic_product_tagging".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("is_set_reminder_button_enabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r3);
                } else if (C41845B3m.A1J(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("product_item".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r3);
                } else if ("stickers".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            StoryProductItemStickerTappableData parseFromJson = C44418Cec.parseFromJson(r3);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1A(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("text_format".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("text_review_status".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    textReviewStatus = (TextReviewStatus) TextReviewStatus.A01.get(str);
                    if (textReviewStatus == null) {
                        textReviewStatus = TextReviewStatus.UNRECOGNIZED;
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if (!"vibrant_text_color".equals(A17)) {
                    bool3 = C41847B3o.A0z(r3, bool3, A17, "was_text_edited");
                } else if (r3.A11() == 16L.A0G) {
                    str8 = null;
                } else {
                    str8 = r3.A1P();
                }
                r3.A0z();
            }
            return new ProductSticker(dropsEventPageNavigationMetadataImpl, textReviewStatus, dropsLaunchAnimation, productDetailsProductItemDict, bool, bool2, bool3, str2, str3, str4, str5, str6, str7, str8, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, ProductSticker productSticker) {
        r3.A0c();
        String str = productSticker.A07;
        if (str != null) {
            r3.A0R("creation_method", str);
        }
        DropsLaunchAnimation dropsLaunchAnimation = productSticker.A02;
        if (dropsLaunchAnimation != null) {
            r3.A0q("drops_launch_animation");
            r3.A0c();
            Boolean bool = dropsLaunchAnimation.A00;
            if (bool != null) {
                r3.A0S("show_animation", bool.booleanValue());
            }
            r3.A0Z();
        }
        DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata = productSticker.A00;
        if (dropsEventPageNavigationMetadata != null) {
            r3.A0q("event_page_navigation_metadata");
            DropsEventPageNavigationMetadataImpl F2h = dropsEventPageNavigationMetadata.F2h();
            r3.A0c();
            String str2 = F2h.A00;
            if (str2 != null) {
                r3.A0R("upcoming_event_id", str2);
            }
            r3.A0Z();
        }
        C41846B3n.A0y(r3, productSticker.A08);
        Boolean bool2 = productSticker.A04;
        if (bool2 != null) {
            r3.A0S("is_organic_product_tagging", bool2.booleanValue());
        }
        Boolean bool3 = productSticker.A05;
        if (bool3 != null) {
            r3.A0S("is_set_reminder_button_enabled", bool3.booleanValue());
        }
        C41846B3n.A11(r3, productSticker.A09);
        ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
        if (productDetailsProductItemDict != null) {
            r3.A0q("product_item");
            C275404q6.A00(r3, productDetailsProductItemDict);
        }
        List list = productSticker.A0E;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "stickers", list);
            while (A0s.hasNext()) {
                StoryProductItemStickerTappableData storyProductItemStickerTappableData = (StoryProductItemStickerTappableData) A0s.next();
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
        C41846B3n.A0z(r3, productSticker.A0A);
        String str3 = productSticker.A0B;
        if (str3 != null) {
            r3.A0R("text_format", str3);
        }
        TextReviewStatus textReviewStatus = productSticker.A01;
        if (textReviewStatus != null) {
            r3.A0R("text_review_status", textReviewStatus.A00);
        }
        String str4 = productSticker.A0C;
        if (str4 != null) {
            r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        }
        String str5 = productSticker.A0D;
        if (str5 != null) {
            r3.A0R("vibrant_text_color", str5);
        }
        Boolean bool4 = productSticker.A06;
        if (bool4 != null) {
            r3.A0S("was_text_edited", bool4.booleanValue());
        }
        r3.A0Z();
    }
}
