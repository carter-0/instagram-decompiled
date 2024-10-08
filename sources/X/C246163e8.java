package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.3e8  reason: invalid class name and case insensitive filesystem */
public abstract class C246163e8 {
    public static C246183eA parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            1eB r8 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("data".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("demotion_control".equals(A0q)) {
                    r8 = AnonymousClass1e3.parseFromJson(r13);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("show_icon".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("style".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str2 == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "FollowUpOption");
            } else if (bool == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00("show_icon", "FollowUpOption");
            } else if (str4 != null || !(r13 instanceof 0c9)) {
                return new C246183eA(r8, str, str2, str3, str4, bool.booleanValue());
            } else {
                ((0c9) r13).A03.A00("text", "FollowUpOption");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C246183eA r3) {
        r2.A0c();
        String str = r3.A01;
        if (str != null) {
            r2.A0R("data", str);
        }
        1eB r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("demotion_control");
            AnonymousClass1e3.A00(r2, r1);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        r2.A0S("show_icon", r3.A05);
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0R("style", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0R("text", str4);
        }
        r2.A0Z();
    }
}
