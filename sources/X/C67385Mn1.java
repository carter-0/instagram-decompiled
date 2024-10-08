package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.keyword.Keyword;
import java.io.IOException;

/* renamed from: X.Mn1  reason: case insensitive filesystem */
public abstract class C67385Mn1 {
    public static Keyword parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Keyword keyword = new Keyword();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    keyword.A03 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    keyword.A04 = str;
                } else if ("media_count".equals(A0q)) {
                    keyword.A00 = r5.A0y();
                } else if ("profile_pic_url".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    keyword.A05 = str;
                } else if ("search_result_subtitle".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    keyword.A06 = str;
                } else if ("header_title".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    keyword.A02 = str;
                } else if ("score".equals(A0q)) {
                    keyword.A01 = Double.valueOf(r5.A0U());
                } else if ("is_popular".equals(A0q)) {
                    keyword.A0A = r5.A0d();
                } else if ("subtitle".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    keyword.A08 = str;
                } else if ("style".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    keyword.A07 = str;
                } else if ("is_echo".equals(A0q)) {
                    keyword.A09 = r5.A0d();
                }
                r5.A0z();
            }
            return keyword;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, Keyword keyword) {
        r3.A0c();
        String str = keyword.A03;
        if (str != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        String str2 = keyword.A04;
        if (str2 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        }
        r3.A0Q("media_count", keyword.A00);
        String str3 = keyword.A05;
        if (str3 != null) {
            r3.A0R("profile_pic_url", str3);
        }
        String str4 = keyword.A06;
        if (str4 != null) {
            r3.A0R("search_result_subtitle", str4);
        }
        String str5 = keyword.A02;
        if (str5 != null) {
            r3.A0R("header_title", str5);
        }
        Double d = keyword.A01;
        if (d != null) {
            r3.A0N("score", d.doubleValue());
        }
        r3.A0S("is_popular", keyword.A0A);
        String str6 = keyword.A08;
        if (str6 != null) {
            r3.A0R("subtitle", str6);
        }
        String str7 = keyword.A07;
        if (str7 != null) {
            r3.A0R("style", str7);
        }
        r3.A0S("is_echo", keyword.A09);
        r3.A0Z();
    }
}
