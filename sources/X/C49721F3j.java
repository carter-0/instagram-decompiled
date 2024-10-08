package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.F3j  reason: case insensitive filesystem */
public final class C49721F3j {
    public final E25 A02(Bundle bundle, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        EW8 ew8;
        E25 e25 = new E25();
        bundle.putString("argument_two_fac_identifier", str);
        bundle.putString("argument_username", str2);
        bundle.putString("argument_pk", str3);
        bundle.putString("argument_abfuscated_phone_number", str4);
        bundle.putBoolean("argument_is_from_one_click_flow", z6);
        bundle.putBoolean("argument_show_trusted_device_option", z);
        bundle.putBoolean("argument_sms_two_factor_on", z2);
        bundle.putBoolean("argument_whatsapp_two_factor_on", z4);
        bundle.putBoolean("argument_totp_two_factor_on", z3);
        bundle.putBoolean("argument_is_trusted_device", z9);
        bundle.putBoolean("argument_should_opt_in_trusted_device_option", z5);
        if (z7) {
            ew8 = EW8.TRUSTED_NOTIFICATION;
        } else if (z4) {
            ew8 = EW8.WHATSAPP;
        } else if (z3) {
            ew8 = EW8.AUTHENTICATOR_APP;
        } else if (!z2 || str5 != null) {
            ew8 = EW8.BACKUP_CODE;
        } else {
            ew8 = EW8.SMS;
        }
        bundle.putInt("argument_two_fac_clear_method", ew8.A00);
        DbU.A1C(bundle);
        bundle.putBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD", false);
        bundle.putString("argument_sms_not_allowed_reason", str5);
        bundle.putBoolean("eligible_for_multiple_totp", z8);
        e25.setArguments(bundle);
        return e25;
    }

    public final E5C A01(UserSession userSession) {
        E5C e5c = new E5C();
        if (userSession != null) {
            e5c.setArguments(DbY.A09(userSession));
        }
        return e5c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.E3X A03(android.os.Bundle r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r3 = "IgSessionManager.LOGGED_OUT_TOKEN"
            r2 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0010
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r0 = 1
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            X.17k.A0E(r0)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            if (r6 == 0) goto L_0x0026
            if (r7 == 0) goto L_0x0026
            java.lang.String r0 = "phone_number_key"
            r1.putString(r0, r6)
            java.lang.String r0 = "query_key"
            r1.putString(r0, r7)
        L_0x0026:
            java.lang.String r0 = "should_enable_auto_conf"
            r1.putBoolean(r0, r2)
            java.lang.String r0 = "arg_is_reg_flow"
            r1.putBoolean(r0, r2)
            X.DbS.A1A(r1, r3)
            if (r8 == 0) goto L_0x003a
            java.lang.String r0 = "arg_is_multiple_account_recovery"
            r1.putBoolean(r0, r8)
        L_0x003a:
            r1.putAll(r5)
            X.E3X r0 = new X.E3X
            r0.<init>()
            r0.setArguments(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49721F3j.A03(android.os.Bundle, java.lang.String, java.lang.String, boolean):X.E3X");
    }

    public final E75 A00(UserSession userSession, String str) {
        Bundle A0a = AnonymousClass7TE.A0a();
        if (str != null) {
            A0a.putString(C66579MXk.A00(268), str);
        }
        DbU.A1D(A0a, userSession);
        E75 e75 = new E75();
        e75.setArguments(A0a);
        return e75;
    }
}
