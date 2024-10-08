package X;

import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1m  reason: case insensitive filesystem */
public abstract class C45687D1m {
    public static C42131BIk parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            ProductCollectionImpl productCollectionImpl = null;
            DropsLaunchAnimation dropsLaunchAnimation = null;
            DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("collection_metadata".equals(A17)) {
                    productCollectionImpl = C45710D2j.parseFromJson(r14);
                } else if ("drops_launch_animation".equals(A17)) {
                    dropsLaunchAnimation = C44918Cn9.parseFromJson(r14);
                } else if ("event_page_navigation_metadata".equals(A17)) {
                    dropsEventPageNavigationMetadataImpl = CXG.parseFromJson(r14);
                } else if (C41845B3m.A17(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if (C41845B3m.A1J(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("merchant_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("stickers".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            BHH parseFromJson = C44438Cew.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1A(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("text_format".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if ("vibrant_text_color".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            return new C42131BIk(dropsEventPageNavigationMetadataImpl, dropsLaunchAnimation, productCollectionImpl, str, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42131BIk bIk) {
        r2.A0c();
        ProductCollection productCollection = bIk.A02;
        if (productCollection != null) {
            C45710D2j.A00(r2, productCollection.FGp(C41846B3n.A0T(r2, "collection_metadata")));
        }
        DropsLaunchAnimation dropsLaunchAnimation = bIk.A01;
        if (dropsLaunchAnimation != null) {
            r2.A0q("drops_launch_animation");
            r2.A0c();
            Boolean bool = dropsLaunchAnimation.A00;
            if (bool != null) {
                r2.A0S("show_animation", bool.booleanValue());
            }
            r2.A0Z();
        }
        DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata = bIk.A00;
        if (dropsEventPageNavigationMetadata != null) {
            r2.A0q("event_page_navigation_metadata");
            DropsEventPageNavigationMetadataImpl F2h = dropsEventPageNavigationMetadata.F2h();
            r2.A0c();
            String str = F2h.A00;
            if (str != null) {
                r2.A0R("upcoming_event_id", str);
            }
            r2.A0Z();
        }
        C41846B3n.A0y(r2, bIk.A03);
        C41846B3n.A11(r2, bIk.A04);
        C41846B3n.A14(r2, bIk.A05);
        List list = bIk.A0A;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "stickers", list);
            while (A0s.hasNext()) {
                BHH bhh = (BHH) A0s.next();
                if (bhh != null) {
                    r2.A0c();
                    C41846B3n.A0y(r2, bhh.A00);
                    r2.A0Z();
                }
            }
            r2.A0Y();
        }
        C41846B3n.A0z(r2, bIk.A06);
        String str2 = bIk.A07;
        if (str2 != null) {
            r2.A0R("text_format", str2);
        }
        String str3 = bIk.A08;
        if (str3 != null) {
            r2.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
        }
        String str4 = bIk.A09;
        if (str4 != null) {
            r2.A0R("vibrant_text_color", str4);
        }
        r2.A0Z();
    }
}
