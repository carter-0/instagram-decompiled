package X;

import com.instagram.react.modules.base.IgReactQEModule;

public abstract class I34 {
    public static final void A00(0lg r4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8;
        String str9 = null;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "ig_collections");
        if (A0e.isSampled()) {
            A0e.AAJ("module_name", str);
            switch (num.intValue()) {
                case 0:
                    str7 = "collection_viewer_entered";
                    break;
                case 1:
                    str7 = "collection_viewer_exited";
                    break;
                case 2:
                    str7 = "send_button_visible";
                    break;
                case 3:
                    str7 = "send_button_tooltip_shown";
                    break;
                case 4:
                    str7 = "send_button_clicked";
                    break;
                case 5:
                    str7 = "collection_granting_read_access_sending";
                    break;
                case 6:
                    str7 = "collection_granting_read_access_success";
                    break;
                case 7:
                    str7 = "collection_granting_read_access_failure";
                    break;
                case 8:
                    str7 = "create_new_thread_starting";
                    break;
                case 9:
                    str7 = "create_new_thread_success";
                    break;
                case 10:
                    str7 = "create_new_thread_failure";
                    break;
                case 11:
                    str7 = "direct_collection_sending";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str7 = "direct_collection_send_success";
                    break;
                default:
                    str7 = "direct_collection_send_failure";
                    break;
            }
            DbS.A1I(A0e, str7);
            DbS.A1N(A0e, str2);
            A0e.AAJ("event_desc", str3);
            A0e.A9F("age", (Long) null);
            if (str4 != null) {
                str8 = AnonymousClass7TF.A0j(str4);
            } else {
                str8 = null;
            }
            A0e.AAJ("user_type", str8);
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str9 = "private";
                        break;
                    case 2:
                        str9 = "collaborative";
                        break;
                    default:
                        str9 = "public";
                        break;
                }
            }
            A0e.AAJ("collection_type", str9);
            A0e.AAJ("collection_id", str5);
            A0e.AAJ("collection_name", str6);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A01(0lg r4, Integer num, String str, String str2, String str3) {
        A00(r4, num, (Integer) null, str, (String) null, str2, str3, (String) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.session.UserSession r9, com.instagram.save.model.SavedCollection r10, java.lang.String r11, java.lang.String r12) {
        /*
            r0 = 0
            r2 = r9
            X.0qQ.A0B(r9, r0)
            r6 = r12
            boolean r1 = X.DbW.A1Y(r12)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r7 = 0
            if (r10 == 0) goto L_0x002e
            java.lang.Integer r0 = r10.A01(r9)
            java.lang.String r8 = X.I35.A01(r0)
            java.lang.String r9 = r10.A0F
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r10.A05
            if (r0 == 0) goto L_0x0026
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x001f:
            java.lang.String r10 = r10.A0G
        L_0x0021:
            r5 = r11
            A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0026:
            boolean r0 = r10.A06()
            if (r0 != r1) goto L_0x0031
            r4 = r3
            goto L_0x001f
        L_0x002e:
            java.lang.String r8 = "null"
            r9 = r7
        L_0x0031:
            r4 = r7
            if (r10 != 0) goto L_0x001f
            r10 = r7
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I34.A02(com.instagram.common.session.UserSession, com.instagram.save.model.SavedCollection, java.lang.String, java.lang.String):void");
    }
}
