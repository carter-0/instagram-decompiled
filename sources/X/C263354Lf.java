package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.4Lf  reason: invalid class name and case insensitive filesystem */
public abstract class C263354Lf {
    public static AnonymousClass9JN parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            AnonymousClass9JN r7 = null;
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C61078JwG jwG = null;
            String str4 = null;
            String str5 = null;
            Integer num = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("cta_type".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("action_url".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("platform_token".equals(A0q)) {
                    jwG = C44660Cie.parseFromJson(r10);
                } else if ("platform_xmd".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("xma_action".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                } else if ("icon_type".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str != null) {
                r7 = new AnonymousClass9JN(str);
                if (str2 != null) {
                    r7.A05 = str2;
                }
                if (str3 != null) {
                    r7.A02 = str3;
                }
                if (jwG != null) {
                    r7.A01 = jwG;
                }
                if (str4 != null) {
                    r7.A03 = str4;
                }
                if (str5 != null) {
                    r7.A06 = str5;
                }
                if (num != null) {
                    r7.A00 = num;
                }
            }
            return r7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass9JN r2, 17Z r3) {
        r3.A0c();
        String str = r2.A05;
        if (str != null) {
            r3.A0R("cta_type", str);
        }
        String str2 = r2.A02;
        if (str2 != null) {
            r3.A0R("action_url", str2);
        }
        if (r2.A01 != null) {
            r3.A0q("platform_token");
            r3.A0c();
            BBV bbv = (BBV) ((C61078JwG) r2.A01).A00;
            if (bbv != null) {
                r3.A0q("postback");
                r3.A0c();
                String str3 = bbv.A00;
                if (str3 != null) {
                    r3.A0R("postback_payload", str3);
                }
                r3.A0Z();
            }
            r3.A0Z();
        }
        String str4 = r2.A03;
        if (str4 != null) {
            r3.A0R("platform_xmd", str4);
        }
        String str5 = r2.A06;
        if (str5 != null) {
            r3.A0R("xma_action", str5);
        }
        Number number = (Number) r2.A00;
        if (number != null) {
            r3.A0P("icon_type", number.intValue());
        }
        String str6 = r2.A04;
        if (str6 != null) {
            r3.A0R(DialogModule.KEY_TITLE, str6);
        }
        r3.A0Z();
    }
}
