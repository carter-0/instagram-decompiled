package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Cz0  reason: case insensitive filesystem */
public abstract class C45588Cz0 {
    public static BFM parseFromJson(16F r17) {
        16F r2 = r17;
        0qQ.A0B(r2, 0);
        try {
            Float f = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Float f2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            String str5 = null;
            String str6 = null;
            Float f3 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("collection_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("effect_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("effect_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("facebook_places_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("is_collected".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("lat".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r2);
                } else if ("lng".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r2);
                } else if (C41845B3m.A19(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("placement_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("radius".equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r2);
                }
                r2.A0z();
            }
            if (f == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("lat", r2, "LocationCoordinates");
            } else if (f2 != null || !(r2 instanceof 0c9)) {
                return new BFM(bool, f3, str, str2, str3, str4, str5, str6, f.floatValue(), f2.floatValue());
            } else {
                AnonymousClass7TF.A1L("lng", r2, "LocationCoordinates");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BFM bfm) {
        r2.A0c();
        String str = bfm.A04;
        if (str != null) {
            r2.A0R("collection_id", str);
        }
        String str2 = bfm.A05;
        if (str2 != null) {
            r2.A0R("effect_id", str2);
        }
        String str3 = bfm.A06;
        if (str3 != null) {
            r2.A0R("effect_type", str3);
        }
        String str4 = bfm.A07;
        if (str4 != null) {
            r2.A0R("facebook_places_id", str4);
        }
        Boolean bool = bfm.A02;
        if (bool != null) {
            r2.A0S("is_collected", bool.booleanValue());
        }
        r2.A0O("lat", bfm.A00);
        r2.A0O("lng", bfm.A01);
        String str5 = bfm.A08;
        if (str5 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
        }
        String str6 = bfm.A09;
        if (str6 != null) {
            r2.A0R("placement_id", str6);
        }
        Float f = bfm.A03;
        if (f != null) {
            r2.A0O("radius", f.floatValue());
        }
        r2.A0Z();
    }
}
