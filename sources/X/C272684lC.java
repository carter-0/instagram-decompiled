package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4lC  reason: invalid class name and case insensitive filesystem */
public abstract class C272684lC {
    public static C272714lF parseFromJson(16F r19) {
        16F r7 = r19;
        0qQ.A0B(r7, 0);
        try {
            16L A11 = r7.A11();
            16L r5 = 16L.A0D;
            if (A11 != r5) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str4 = null;
            C250533lb r9 = null;
            Boolean bool2 = null;
            HashMap hashMap = null;
            Integer num2 = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r4 = 16L.A09;
                if (A1J != r4) {
                    String A0q = r7.A0q();
                    r7.A1J();
                    if ("active_group_id".equals(A0q)) {
                        if (r7.A11() == 16L.A0G) {
                            str = null;
                        } else {
                            str = r7.A1P();
                        }
                    } else if ("connected_group_id".equals(A0q)) {
                        if (r7.A11() == 16L.A0G) {
                            str2 = null;
                        } else {
                            str2 = r7.A1P();
                        }
                    } else if ("enable_sticky_header".equals(A0q)) {
                        bool = Boolean.valueOf(r7.A0d());
                    } else if ("format".equals(A0q)) {
                        if (r7.A11() == 16L.A0G) {
                            str3 = null;
                        } else {
                            str3 = r7.A1P();
                        }
                    } else if ("global_position".equals(A0q)) {
                        num = Integer.valueOf(r7.A1D());
                    } else if ("groups".equals(A0q)) {
                        if (r7.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r7.A1J() != 16L.A08) {
                                C272704lE parseFromJson = C272694lD.parseFromJson(r7);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (r7.A11() == 16L.A0G) {
                            str4 = null;
                        } else {
                            str4 = r7.A1P();
                        }
                    } else if ("item_client_gap_rules".equals(A0q)) {
                        r9 = C250523la.parseFromJson(r7);
                    } else if ("remember_group_choice".equals(A0q)) {
                        bool2 = Boolean.valueOf(r7.A0d());
                    } else if ("style".equals(A0q)) {
                        if (r7.A11() == r5) {
                            hashMap = new HashMap();
                            while (r7.A1J() != r4) {
                                String A1P = r7.A1P();
                                r7.A1J();
                                if (r7.A11() == 16L.A0G) {
                                    hashMap.put(A1P, (Object) null);
                                } else {
                                    String A1P2 = r7.A1P();
                                    if (A1P2 != null) {
                                        hashMap.put(A1P, A1P2);
                                    }
                                }
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("view_state_item_type".equals(A0q)) {
                        num2 = Integer.valueOf(r7.A1D());
                    }
                    r7.A0z();
                } else {
                    return new C272714lF(r9, bool, bool2, num, num2, str, str2, str3, str4, hashMap, arrayList);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
