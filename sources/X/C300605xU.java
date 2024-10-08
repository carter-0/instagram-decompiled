package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5xU  reason: invalid class name and case insensitive filesystem */
public abstract class C300605xU {
    public static C376459Ib parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            16L A11 = r9.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r9.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            HashMap hashMap = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r8 = 16L.A09;
                if (A1J == r8) {
                    return new C376459Ib(5, (Object) num, (Object) bool, (Object) hashMap);
                }
                String A0q = r9.A0q();
                r9.A1J();
                if ("visible".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if ("data".equals(A0q)) {
                    if (r9.A11() == r7) {
                        hashMap = new HashMap();
                        while (r9.A1J() != r8) {
                            String A1P = r9.A1P();
                            r9.A1J();
                            if (r9.A11() == 16L.A0G) {
                                hashMap.put(A1P, (Object) null);
                            } else {
                                String A1P2 = r9.A1P();
                                if (A1P2 != null) {
                                    hashMap.put(A1P, A1P2);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                }
                r9.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C376459Ib r2, 17Z r3) {
        r3.A0c();
        Boolean bool = (Boolean) r2.A02;
        if (bool != null) {
            r3.A0S("visible", bool.booleanValue());
        }
        Number number = (Number) r2.A01;
        if (number != null) {
            r3.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, number.intValue());
        }
        AbstractMap abstractMap = (AbstractMap) r2.A00;
        if (abstractMap != null) {
            r3.A0q("data");
            r3.A0c();
            for (Map.Entry entry : abstractMap.entrySet()) {
                if (!16P.A04(r3, entry)) {
                    r3.A0t((String) entry.getValue());
                }
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
