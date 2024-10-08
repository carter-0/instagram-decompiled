package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3nk  reason: invalid class name and case insensitive filesystem */
public abstract class C251833nk {
    public static AnonymousClass3f1 parseFromJson(16F r20) {
        16F r3 = r20;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            C250503lY r8 = null;
            Boolean bool = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C250533lb r5 = null;
            1Xj r6 = null;
            1Xj r7 = null;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("ad".equals(A0q)) {
                    r8 = C250153kz.parseFromJson(r3);
                } else if ("allow_feedback".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                } else if ("brs_severity".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("feed_recs_hide_reasons".equals(A0q)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            C42036BEo parseFromJson = C44145CXk.parseFromJson(r3);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("feed_survey_integration_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("global_position".equals(A0q)) {
                    num2 = Integer.valueOf(r3.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("inventory_source".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("is_eof".equals(A0q)) {
                    bool2 = Boolean.valueOf(r3.A0d());
                } else if ("is_seen".equals(A0q)) {
                    bool3 = Boolean.valueOf(r3.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r5 = C250523la.parseFromJson(r3);
                } else if ("media".equals(A0q)) {
                    r6 = 1Xj.A00(r3);
                } else if ("media_or_ad".equals(A0q)) {
                    r7 = 1Xj.A00(r3);
                } else if ("mezql_token".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("source".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(r3.A1D());
                }
                r3.A0z();
            }
            return new AnonymousClass3f1(r5, r6, r7, r8, bool, bool2, bool3, num, num2, num3, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
