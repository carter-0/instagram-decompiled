package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vmy  reason: case insensitive filesystem */
public abstract class C18184Vmy {
    public static C17731Vd0 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C17731Vd0 vd0 = new C17731Vd0();
            16L A11 = r6.A11();
            16L r3 = 16L.A0D;
            if (A11 != r3) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return vd0;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if ("ts_insertion".equals(A17)) {
                    vd0.A04 = r6.A0y();
                } else if ("ts_eviction".equals(A17)) {
                    vd0.A02 = r6.A0y();
                } else if ("ts_first_access".equals(A17)) {
                    vd0.A03 = r6.A0y();
                } else if ("ts_last_access".equals(A17)) {
                    vd0.A05 = r6.A0y();
                } else {
                    HashMap hashMap = null;
                    if ("module".equals(A17)) {
                        vd0.A0D = AnonymousClass7TG.A0l(r6);
                    } else if ("size".equals(A17)) {
                        vd0.A07 = r6.A0y();
                    } else if ("insertion_reason".equals(A17)) {
                        vd0.A0A = AnonymousClass7TG.A0l(r6);
                    } else if ("eviction_reason".equals(A17)) {
                        vd0.A09 = AnonymousClass7TG.A0l(r6);
                    } else if (C41845B3m.A1C(A17)) {
                        C16667Uz3 uz3 = (C16667Uz3) C16667Uz3.A01.get(r6.A1Q());
                        if (uz3 == null) {
                            uz3 = C16667Uz3.UNKNOWN_ITEM_TYPE;
                        }
                        vd0.A08 = uz3;
                    } else if ("num_hits".equals(A17)) {
                        vd0.A00 = r6.A1D();
                    } else if ("accessed".equals(A17)) {
                        vd0.A0G = r6.A0d();
                    } else if ("start_position".equals(A17)) {
                        vd0.A06 = r6.A0y();
                    } else if ("end_position".equals(A17)) {
                        vd0.A01 = r6.A0y();
                    } else if ("item_id".equals(A17)) {
                        vd0.A0B = AnonymousClass7TG.A0l(r6);
                    } else if ("item_url".equals(A17)) {
                        vd0.A0C = AnonymousClass7TG.A0l(r6);
                    } else if ("exif_data".equals(A17)) {
                        if (r6.A11() == r3) {
                            hashMap = new HashMap();
                            while (r6.A1J() != r4) {
                                C41847B3o.A1M(r6, hashMap);
                            }
                        }
                        vd0.A0F = hashMap;
                    } else if ("xmp_data".equals(A17)) {
                        vd0.A0E = AnonymousClass7TG.A0l(r6);
                    }
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C17731Vd0 vd0) {
        r3.A0c();
        r3.A0Q("ts_insertion", vd0.A04);
        r3.A0Q("ts_eviction", vd0.A02);
        r3.A0Q("ts_first_access", vd0.A03);
        r3.A0Q("ts_last_access", vd0.A05);
        String str = vd0.A0D;
        if (str != null) {
            r3.A0R("module", str);
        }
        r3.A0Q("size", vd0.A07);
        String str2 = vd0.A0A;
        if (str2 != null) {
            r3.A0R("insertion_reason", str2);
        }
        String str3 = vd0.A09;
        if (str3 != null) {
            r3.A0R("eviction_reason", str3);
        }
        C16667Uz3 uz3 = vd0.A08;
        if (uz3 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, uz3.toString());
        }
        r3.A0P("num_hits", vd0.A00);
        r3.A0S("accessed", vd0.A0G);
        r3.A0Q("start_position", vd0.A06);
        r3.A0Q("end_position", vd0.A01);
        String str4 = vd0.A0B;
        if (str4 != null) {
            r3.A0R("item_id", str4);
        }
        String str5 = vd0.A0C;
        if (str5 != null) {
            r3.A0R("item_url", str5);
        }
        if (vd0.A0F != null) {
            r3.A0q("exif_data");
            r3.A0c();
            Iterator A0s = AnonymousClass7TF.A0s(vd0.A0F);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                if (!16P.A04(r3, A1J)) {
                    r3.A0t((String) A1J.getValue());
                }
            }
            r3.A0Z();
        }
        String str6 = vd0.A0E;
        if (str6 != null) {
            r3.A0R("xmp_data", str6);
        }
        r3.A0Z();
    }
}
