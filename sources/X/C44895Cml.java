package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;
import java.io.IOException;

/* renamed from: X.Cml  reason: case insensitive filesystem */
public abstract class C44895Cml {
    public static C239633Hj parseFromJson(16F r25) {
        String A00;
        String A002;
        String str;
        16F r8 = r25;
        0qQ.A0B(r8, 0);
        try {
            Integer num = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            String str3 = null;
            BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle = null;
            String str4 = null;
            C61076JwE jwE = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r11 = 16L.A09;
                A00 = AnonymousClass000.A00(671);
                A002 = AnonymousClass000.A00(609);
                if (A1J == r11) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("bloks_app_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("cta_button_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("cta_style".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    bloksStoryNetegoCTAStyle = (BloksStoryNetegoCTAStyle) BloksStoryNetegoCTAStyle.A01.get(str);
                    if (bloksStoryNetegoCTAStyle == null) {
                        bloksStoryNetegoCTAStyle = BloksStoryNetegoCTAStyle.UNRECOGNIZED;
                    }
                } else if (TraceFieldType.Duration.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if (A002.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if (A00.equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r8);
                } else if ("payload".equals(A17)) {
                    jwE = C44893Cmj.parseFromJson(r8);
                } else if (C41845B3m.A1E(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("tracking_token".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("bloks_app_id", r8, "BloksStoryNetegoDict");
            } else if (bloksStoryNetegoCTAStyle == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cta_style", r8, "BloksStoryNetegoDict");
            } else if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(TraceFieldType.Duration, r8, "BloksStoryNetegoDict");
            } else if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r8, "BloksStoryNetegoDict");
            } else if (str4 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8, "BloksStoryNetegoDict");
            } else if (bool2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r8, "BloksStoryNetegoDict");
            } else if (jwE == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("payload", r8, "BloksStoryNetegoDict");
            } else if (str6 != null || !(r8 instanceof 0c9)) {
                return new C239633Hj(jwE, bloksStoryNetegoCTAStyle, str2, str3, str4, str5, str6, num.intValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("tracking_token", r8, "BloksStoryNetegoDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
