package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Cfc  reason: case insensitive filesystem */
public abstract class C44480Cfc {
    public static N5I parseFromJson(16F r19) {
        16F r3 = r19;
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str5 = null;
            String str6 = null;
            Integer num2 = null;
            String str7 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("creator_igid".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("creator_username".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("group_image_uri".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("invite_link".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("is_creator_verified".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("is_following_chat_creator".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r3);
                } else if ("is_member".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r3);
                } else if ("number_of_members".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if (C41845B3m.A1L(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("thread_igid".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("thread_subtype".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r3);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            if (num == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("number_of_members", r3, "SuggestedIGDChannelsNetEgoClientItemUnitImpl");
            } else if (str6 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("thread_igid", r3, "SuggestedIGDChannelsNetEgoClientItemUnitImpl");
            } else if (str7 != null || !(r3 instanceof 0c9)) {
                return new N5I(bool, bool2, bool3, num2, str, str2, str3, str4, str5, str6, str7, num.intValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r3, "SuggestedIGDChannelsNetEgoClientItemUnitImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
