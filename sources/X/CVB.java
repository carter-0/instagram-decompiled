package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CVB {
    public static BDz parseFromJson(16F r19) {
        16F r6 = r19;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            Integer num = null;
            String str3 = null;
            C250533lb r11 = null;
            String str4 = null;
            String str5 = null;
            Integer num2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("arrow_url".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("button_title".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("contents".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r11 = C250523la.parseFromJson(r6);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r6.A1P();
                    }
                } else if (!"tracking_token".equals(A17)) {
                    num2 = C41847B3o.A13(r6, num2, A17, "view_state_item_type");
                } else if (r6.A11() == 16L.A0G) {
                    str5 = null;
                } else {
                    str5 = r6.A1P();
                }
                r6.A0z();
            }
            if (str == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("arrow_url", r6, "BusinessConversionNetegoImpl");
            } else if (str2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_title", r6, "BusinessConversionNetegoImpl");
            } else if (arrayList == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("contents", r6, "BusinessConversionNetegoImpl");
            } else if (str3 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6, "BusinessConversionNetegoImpl");
            } else if (str4 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r6, "BusinessConversionNetegoImpl");
            } else if (str5 != null || !(r6 instanceof 0c9)) {
                return new BDz(r11, num, num2, str, str2, str3, str4, str5, arrayList);
            } else {
                AnonymousClass7TF.A1L("tracking_token", r6, "BusinessConversionNetegoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
