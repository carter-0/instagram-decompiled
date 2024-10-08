package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.4hK  reason: invalid class name and case insensitive filesystem */
public abstract class C270804hK {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        r3 = r2.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r0 = 1
            X.0qQ.A0B(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1485768866: goto L_0x001c;
                case -1008182312: goto L_0x0028;
                case -531705460: goto L_0x0038;
                case -424992633: goto L_0x0044;
                case 334460247: goto L_0x0050;
                case 529700703: goto L_0x005c;
                case 1688919676: goto L_0x0068;
                default: goto L_0x000b;
            }
        L_0x000b:
            if (r4 == 0) goto L_0x001b
            r1 = 2131972984(0x7f135378, float:1.958299E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r3 = r2.getString(r1, r0)
            X.0qQ.A0A(r3)
        L_0x001b:
            return r3
        L_0x001c:
            java.lang.String r0 = "health_disclaimer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131963312(0x7f132db0, float:1.9563374E38)
            goto L_0x0073
        L_0x0028:
            r0 = 5320(0x14c8, float:7.455E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131975070(0x7f135b9e, float:1.9587222E38)
            goto L_0x0073
        L_0x0038:
            java.lang.String r0 = "medication_guide"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131965984(0x7f133820, float:1.9568793E38)
            goto L_0x0073
        L_0x0044:
            java.lang.String r0 = "prescription_information"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131969726(0x7f1346be, float:1.9576383E38)
            goto L_0x0073
        L_0x0050:
            java.lang.String r0 = "prescribing_information"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131969725(0x7f1346bd, float:1.957638E38)
            goto L_0x0073
        L_0x005c:
            java.lang.String r0 = "offer_details"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131968764(0x7f1342fc, float:1.9574432E38)
            goto L_0x0073
        L_0x0068:
            java.lang.String r0 = "important_safety_information"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            r0 = 2131964188(0x7f13311c, float:1.956515E38)
        L_0x0073:
            java.lang.String r3 = r2.getString(r0)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270804hK.A00(android.content.Context, java.lang.String, boolean):java.lang.String");
    }

    public static final void A01(Activity activity, UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        Activity activity2 = activity;
        C71342cb.A00(userSession2).A0A(activity2, AnonymousClass000.A00(2555));
        SimpleWebViewActivity.A02.A02(activity2, userSession2, new SimpleWebViewConfig(AnonymousClass000.A00(3250), (String) null, activity2.getString(2131951987), (String) null, false, false, false, false, false, true, false, true, false, false, false, false));
    }

    public static final boolean A03(AndroidLink androidLink) {
        Object obj;
        0qQ.A0B(androidLink, 0);
        if (C271714jT.A01(androidLink) == AnonymousClass47L.AD_DESTINATION_APP_STORE) {
            Integer Ac8 = androidLink.Ac8();
            if (Ac8 == null || (obj = AnonymousClass5FH.A01.get(Ac8)) == null) {
                obj = AnonymousClass5FH.NONE;
            }
            if (obj == AnonymousClass5FH.INSTALLED) {
                String CHl = androidLink.CHl();
                if (CHl == null) {
                    CHl = "";
                }
                if (!0lz.A03(CHl)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(AndroidLink androidLink) {
        if (androidLink == null || !"com.whatsapp".equals(androidLink.CHl())) {
            return false;
        }
        return true;
    }
}
