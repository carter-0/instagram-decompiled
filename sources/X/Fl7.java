package X;

import android.content.Context;
import java.util.HashMap;

public final class Fl7 implements AnonymousClass08W {
    public static final HashMap A00(Context context, 0lg r14, String str) {
        HashMap A1E = AnonymousClass7TE.A1E();
        0xa A0d = DbV.A0d();
        boolean z = A0d.getBoolean("is_from_log_out", false);
        boolean z2 = A0d.getBoolean("auto_login_success_before", false);
        long A06 = DbW.A06(A0d, "last_auto_login_time");
        boolean z3 = false;
        DbX.A1V(A0d, "is_from_log_out", false);
        String A0c = AnonymousClass7TF.A0c();
        0qQ.A07(A0c);
        C63040xi r1 = 0tS.A4E;
        r1.A00().A0G(A0c);
        0tS A00 = r1.A00();
        A1E.put("logged_out_user", A00.A09.CDM(A00, 0tS.A4G[185]));
        A1E.put("show_internal_settings", false);
        A1E.put("family_device_id", DbT.A0P(r14).A02(19f.A20));
        A1E.put(Dbj.A01(), 0qv.A00(context));
        A1E.put("qe_device_id", 0qv.A02.A04(context));
        A1E.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
        A1E.put("waterfall_id", A0c);
        A1E.put("qpl_join_id", str);
        if (z || z2) {
            z3 = true;
        }
        A1E.put("disable_auto_login", Boolean.valueOf(z3));
        A1E.put("last_auto_login_time", Long.valueOf(A06));
        A1E.put("is_from_logged_out", Boolean.valueOf(z));
        return A1E;
    }

    public static final boolean A01() {
        Integer num = C49917FEr.A00().A05;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2 || C49921FEw.A02.A00().A01() == num2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.os.Bundle r11, androidx.fragment.app.FragmentActivity r12, X.0lg r13, java.lang.String r14) {
        /*
            r10 = this;
            X.AnonymousClass7TG.A1U(r12, r13, r14)
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "flow_name"
            java.lang.String r0 = "secondary_profile_creation_ig_default"
            r3.put(r1, r0)
            java.lang.String r1 = "flow_type"
            java.lang.String r0 = "spc"
            r3.put(r1, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0c()
            java.util.HashMap r6 = A00(r12, r13, r0)
            java.lang.String r1 = X.Dbj.A01()
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "family_device_id"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "qe_device_id"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "waterfall_id"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x00f5
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.put(r1, r0)
            java.lang.String r1 = "soap_creation_source"
            java.lang.String r0 = "profile_switcher"
            r8.put(r1, r0)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            if (r11 == 0) goto L_0x00f5
            java.lang.String r0 = "last_logged_in_ig_access_token"
            r4 = 0
            java.lang.String r0 = r11.getString(r0, r4)
            X.DbS.A1A(r1, r0)
            X.08y r2 = X.09i.A0A
            com.instagram.common.session.UserSession r9 = r2.A07(r1)
            if (r9 == 0) goto L_0x00f5
            android.content.Context r7 = X.DbT.A05(r12)
            java.lang.String r5 = "active_account"
            java.lang.String r1 = "caa_bloks_access_library_spc_account_linking"
            java.lang.String r0 = "MaaSpcHelper"
            java.util.ArrayList r1 = X.FHC.A02(r7, r9, r5, r1, r0)
            boolean r0 = r1.isEmpty()
            java.lang.String r9 = "auth_token"
            if (r0 != 0) goto L_0x00b1
            java.lang.Object r1 = X.AnonymousClass7TE.A12(r1)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00b1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r7 = r1.get(r9)
        L_0x0091:
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r6 = X.AnonymousClass7TF.A0s(r6)
        L_0x0099:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r6)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x0099 }
            r5.put(r1, r0)     // Catch:{ ClassCastException -> 0x0099 }
            goto L_0x0099
        L_0x00b1:
            java.lang.String r7 = ""
            goto L_0x0091
        L_0x00b4:
            r5.put(r9, r7)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "reg_info"
            r5.put(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "flow_info"
            r5.put(r0, r1)
            X.0aP r1 = r2.A03(r10)
            X.0xG r0 = X.DbS.A0O(r14)
            X.2nI r3 = X.C229382nI.A01(r4, r12, r0, r1)
            X.0eM r0 = X.1ET.A01
            java.lang.Object r2 = r0.getValue()
            X.1ET r2 = (X.1ET) r2
            java.lang.String r0 = "com.bloks.www.bloks.caa.reg.spc_create_profile.async"
            X.8ey r1 = X.C359988do.A02(r4, r1, r0, r5)
            r0 = 10
            X.E84.A00(r1, r3, r0)
            r2.schedule(r1)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fl7.A02(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0lg, java.lang.String):void");
    }
}
