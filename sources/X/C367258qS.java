package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8qS  reason: invalid class name and case insensitive filesystem */
public final class C367258qS implements CallerContextable {
    public static final C367258qS A00 = new Object();
    public static final CallerContext A01 = CallerContext.A00(C367258qS.class);
    public static final String __redex_internal_original_name = "NoticeEligibilityMetaDataUtil";

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.0oI.A0B(r5) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2IV A01(android.content.Context r5, com.instagram.common.session.UserSession r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.2IV r3 = new X.2IV
            r3.<init>()
            if (r5 == 0) goto L_0x0016
            boolean r1 = X.0oI.A0B(r5)
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_fb_app_installed"
            r3.A08(r0, r1)
            java.lang.String r0 = "client_session_id"
            r3.A09(r7, r0)
            boolean r0 = A00(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_content_reshare"
            r3.A08(r0, r1)
            if (r5 == 0) goto L_0x0055
            X.8je r1 = X.C363378jd.A08
            com.facebook.common.callercontext.CallerContext r0 = A01
            boolean r0 = r1.A04(r0, r6)
            if (r0 != 0) goto L_0x0055
            X.2IV r2 = new X.2IV
            r2.<init>()
            X.6nu r0 = X.C317816nt.A00(r6)
            com.google.common.collect.ImmutableList r1 = r0.A06(r5)
            java.lang.String r0 = "target_accounts"
            r2.A05(r0, r1)
            java.lang.String r0 = "fx_native_auth_input_data"
            r3.A06(r2, r0)
        L_0x0055:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367258qS.A01(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):X.2IV");
    }

    public static final boolean A00(UserSession userSession) {
        int ordinal = 27p.A01(userSession).A04.A09.ordinal();
        if (ordinal == 5 || ordinal == 571 || ordinal == 179 || ordinal == 16 || ordinal == 155) {
            return true;
        }
        return false;
    }
}
