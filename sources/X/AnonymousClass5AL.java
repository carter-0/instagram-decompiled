package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.5AL  reason: invalid class name */
public abstract class AnonymousClass5AL {
    public static C267554bk parseFromJson(16F r20) {
        16F r2 = r20;
        0qQ.A0B(r2, 0);
        try {
            Boolean bool = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("bio".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("biography".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("content_empty".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("is_anonymous_profile_picture".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("is_profile_picture_same".equals(A0q)) {
                    bool3 = Boolean.valueOf(r2.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("profile_picture_url".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("selected_audience_count".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                }
                r2.A0z();
            }
            if (str2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("biography", "OpalInfo");
            } else if (bool == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("content_empty", "OpalInfo");
            } else if (bool2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("is_anonymous_profile_picture", "OpalInfo");
            } else if (bool3 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("is_profile_picture_same", "OpalInfo");
            } else if (num != null || !(r2 instanceof 0c9)) {
                return new C267554bk(num.intValue(), str, str2, str3, str4, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                ((0c9) r2).A03.A00("selected_audience_count", "OpalInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C267554bk r3) {
        r2.A0c();
        String str = r3.A01;
        if (str != null) {
            r2.A0R("bio", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R("biography", str2);
        }
        r2.A0S("content_empty", r3.A05);
        r2.A0S("is_anonymous_profile_picture", r3.A06);
        r2.A0S("is_profile_picture_same", r3.A07);
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0R("profile_picture_url", str4);
        }
        r2.A0P("selected_audience_count", r3.A00);
        r2.A0Z();
    }
}
