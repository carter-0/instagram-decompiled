package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Car  reason: case insensitive filesystem */
public abstract class C44230Car {
    public static C42052BFf parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            16L A11 = r14.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r14.A0z();
                return null;
            }
            HashMap hashMap = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r14.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r14);
                if ("friendship_status".equals(A17)) {
                    if (r14.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r14.A1J() != r4) {
                            String A1P = r14.A1P();
                            if (C41845B3m.A0W(r14) == 16L.A0G) {
                                hashMap.put(A1P, (Object) null);
                            } else {
                                Boolean A0S = AnonymousClass7TF.A0S(r14);
                                if (A0S != null) {
                                    hashMap.put(A1P, A0S);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("full_name".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("profile_pic_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("user_name".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (hashMap == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("friendship_status", r14, "MutedUserImpl");
            } else if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("full_name", r14, "MutedUserImpl");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14, "MutedUserImpl");
            } else if (str4 != null || !(r14 instanceof 0c9)) {
                return new C42052BFf(str, str2, str3, str4, hashMap);
            } else {
                AnonymousClass7TF.A1L("user_name", r14, "MutedUserImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
