package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CXY {
    public static C53441GoZ parseFromJson(16F r36) {
        String A00;
        16F r3 = r36;
        0qQ.A0B(r3, 0);
        try {
            Long l = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            C250533lb r21 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Integer num2 = null;
            while (true) {
                16L A1J = r3.A1J();
                16L r17 = 16L.A09;
                A00 = C273654mx.A00(46);
                if (A1J == r17) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r3);
                if ("action_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("facepile_outline_color_hex".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else if ("facepile_photo_urls".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            C41846B3n.A1B(r3, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fb_app_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r21 = C250523la.parseFromJson(r3);
                } else if (A00.equals(A17)) {
                    f = AnonymousClass7TF.A0V(r3);
                } else if ("media_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r3);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("message_background_media_url".equals(A17)) {
                    simpleImageUrl2 = 16h.A00(r3);
                } else if ("msite_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if (!"tracking_token".equals(A17)) {
                    num2 = C41847B3o.A13(r3, num2, A17, "view_state_item_type");
                } else if (r3.A11() == 16L.A0G) {
                    str7 = null;
                } else {
                    str7 = r3.A1P();
                }
                r3.A0z();
            }
            if (str == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action_text", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (l == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("facepile_outline_color_hex", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (arrayList == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("facepile_photo_urls", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (str2 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("fb_app_url", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (str3 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (f == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (simpleImageUrl == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_url", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (str4 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_MESSAGE, r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (simpleImageUrl2 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("message_background_media_url", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (str5 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("msite_url", r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (str6 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r3, "FamilyBridgesBasicNetegoItemImpl");
            } else if (str7 != null || !(r3 instanceof 0c9)) {
                return new C53441GoZ(r21, simpleImageUrl, simpleImageUrl2, num, num2, str, str2, str3, str4, str5, str6, str7, arrayList, f.floatValue(), l.longValue());
            } else {
                AnonymousClass7TF.A1L("tracking_token", r3, "FamilyBridgesBasicNetegoItemImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
