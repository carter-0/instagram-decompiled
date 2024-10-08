package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Cxq  reason: case insensitive filesystem */
public abstract class C45516Cxq {
    public static C278004w5 parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            Boolean bool = null;
            String str2 = null;
            C278024w7 r3 = null;
            Boolean bool2 = null;
            String str3 = null;
            C42112BHq bHq = null;
            String str4 = null;
            C42112BHq bHq2 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("action".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if ("action_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("button_type".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r14);
                } else if ("has_chevron".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if (AnonymousClass000.A00(1409).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    r3 = C45582Cyu.parseFromJson(r14);
                } else if ("is_text_centered".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                } else if ("secondary_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if (C66579MXk.A00(161).equals(A17)) {
                    bHq = C44518CgE.parseFromJson(r14);
                } else if (C41845B3m.A1A(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("text_color".equals(A17)) {
                    bHq2 = C44518CgE.parseFromJson(r14);
                }
                r14.A0z();
            }
            return new C278004w5(r3, bHq, bHq2, bool, bool2, num, num2, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C278004w5 r4) {
        r3.A0c();
        Integer num = r4.A05;
        if (num != null) {
            r3.A0P("action", num.intValue());
        }
        String str = r4.A07;
        if (str != null) {
            r3.A0R("action_url", str);
        }
        Integer num2 = r4.A06;
        if (num2 != null) {
            r3.A0P("button_type", num2.intValue());
        }
        Boolean bool = r4.A03;
        if (bool != null) {
            r3.A0S("has_chevron", bool.booleanValue());
        }
        String str2 = r4.A08;
        if (str2 != null) {
            r3.A0R(AnonymousClass000.A00(1409), str2);
        }
        C278024w7 r1 = r4.A00;
        if (r1 != null) {
            r3.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            C45582Cyu.A00(r3, r1);
        }
        Boolean bool2 = r4.A04;
        if (bool2 != null) {
            r3.A0S("is_text_centered", bool2.booleanValue());
        }
        String str3 = r4.A09;
        if (str3 != null) {
            r3.A0R("secondary_text", str3);
        }
        C46269DSy dSy = r4.A01;
        if (dSy != null) {
            r3.A0q(C66579MXk.A00(161));
            C42112BHq FCb = dSy.FCb();
            r3.A0c();
            String str4 = FCb.A00;
            if (str4 != null) {
                r3.A0R("dark", str4);
            }
            String str5 = FCb.A01;
            if (str5 != null) {
                r3.A0R("light", str5);
            }
            r3.A0Z();
        }
        C41846B3n.A0z(r3, r4.A0A);
        C46269DSy dSy2 = r4.A02;
        if (dSy2 != null) {
            r3.A0q("text_color");
            C42112BHq FCb2 = dSy2.FCb();
            r3.A0c();
            String str6 = FCb2.A00;
            if (str6 != null) {
                r3.A0R("dark", str6);
            }
            String str7 = FCb2.A01;
            if (str7 != null) {
                r3.A0R("light", str7);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
