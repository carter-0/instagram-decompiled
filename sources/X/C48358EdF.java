package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.TextPostAppAYSFButton;
import com.instagram.api.schemas.TextPostAppAYSFStyle;
import java.io.IOException;

/* renamed from: X.EdF  reason: case insensitive filesystem */
public abstract class C48358EdF {
    public static C61008Jv7 parseFromJson(16F r13) {
        String str;
        String str2;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Integer num = null;
            TextPostAppAYSFButton textPostAppAYSFButton = null;
            String str3 = null;
            String str4 = null;
            TextPostAppAYSFStyle textPostAppAYSFStyle = null;
            N4D n4d = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("button".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                    textPostAppAYSFButton = (TextPostAppAYSFButton) TextPostAppAYSFButton.A01.get(str2);
                    if (textPostAppAYSFButton == null) {
                        textPostAppAYSFButton = TextPostAppAYSFButton.UNRECOGNIZED;
                    }
                } else if ("header".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if ("style".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    textPostAppAYSFStyle = (TextPostAppAYSFStyle) TextPostAppAYSFStyle.A01.get(str);
                    if (textPostAppAYSFStyle == null) {
                        textPostAppAYSFStyle = TextPostAppAYSFStyle.UNRECOGNIZED;
                    }
                } else if ("users".equals(A17)) {
                    n4d = C69759Nri.parseFromJson(r13);
                }
                r13.A0z();
            }
            if (num == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("index", r13, "TextPostAppAYSFOnActivityFeedImpl");
            } else if (textPostAppAYSFStyle == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("style", r13, "TextPostAppAYSFOnActivityFeedImpl");
            } else if (n4d != null || !(r13 instanceof 0c9)) {
                return new C61008Jv7(n4d, textPostAppAYSFButton, textPostAppAYSFStyle, str3, str4, num.intValue());
            } else {
                AnonymousClass7TF.A1L("users", r13, "TextPostAppAYSFOnActivityFeedImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
