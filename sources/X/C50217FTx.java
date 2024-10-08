package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.FTx  reason: case insensitive filesystem */
public final class C50217FTx implements C51896G6m {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final String A02;

    public C50217FTx(AnonymousClass4DH r2, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Crf() {
        /*
            r7 = this;
            X.4DH r0 = r7.A00
            android.content.Context r5 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.0gy r4 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r3 = r7.A01
            java.lang.String r6 = r7.A02
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r1 = "link_flow_source"
            java.lang.String r0 = "instagram"
            r2.put(r1, r0)
            org.json.JSONObject r1 = X.DbS.A11()
            int r0 = r6.hashCode()
            switch(r0) {
                case -2026751916: goto L_0x0092;
                case -864092448: goto L_0x0087;
                case 229373044: goto L_0x007c;
                case 407391086: goto L_0x006d;
                case 1383187472: goto L_0x0062;
                case 1985941072: goto L_0x0057;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.String r0 = "UNKNOWN_LINK_DO_NOT_USE"
        L_0x002a:
            java.lang.String r6 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "entry_point"
            r1.put(r0, r6)
            java.lang.String r6 = "flow"
            java.lang.String r0 = "pro2pro_framework_page_linking_flow"
            r1.put(r6, r0)
            java.lang.String r0 = "custom_parameters"
            r1.put(r0, r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "server_params"
            java.util.HashMap r1 = X.DbY.A0m(r0, r1)
            java.lang.String r0 = "com.bloks.www.pro_to_pro.framework.async.controller.entry"
            X.8ey r1 = X.C359988do.A05(r3, r0, r1)
            r0 = 4
            X.E84.A00(r1, r7, r0)
            X.1ES.A00(r5, r4, r1)
            return
        L_0x0057:
            java.lang.String r0 = "setting"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "IG_SETTINGS_BUSINESS_TAB"
            goto L_0x002a
        L_0x0062:
            java.lang.String r0 = "personal_to_business_conversion"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "IG_PERSONAL_TO_BUSINESS_CONVERSION"
            goto L_0x002a
        L_0x006d:
            r0 = 1809(0x711, float:2.535E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "IG_SHARE_TO_FB"
            goto L_0x002a
        L_0x007c:
            java.lang.String r0 = "edit_profile"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "IG_EDIT_PROFILE"
            goto L_0x002a
        L_0x0087:
            java.lang.String r0 = "ig_cross_posting_settings"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "IG_SETTINGS_SHARE_TO_FB"
            goto L_0x002a
        L_0x0092:
            r0 = 693(0x2b5, float:9.71E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "IG_CLAIM_LOCATION"
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50217FTx.Crf():void");
    }

    public final void DfQ(int i, int i2, Intent intent) {
        Bundle extras;
        AnonymousClass4DH r3;
        if ((i == 32779 || i == 1122563) && i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
            r3 = this.A00;
            DbV.A0I(r3).A0z("page_linking_request", extras);
        } else {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putBoolean(AnonymousClass000.A00(818), true);
            A0a.putInt(AnonymousClass000.A00(819), -1);
            r3 = this.A00;
            DbV.A0I(r3).A0z("page_linking_request", A0a);
        }
        DbT.A1I(r3);
    }
}
