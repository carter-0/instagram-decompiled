package X;

import android.app.Activity;

/* renamed from: X.78b  reason: invalid class name and case insensitive filesystem */
public final class C3267678b extends AnonymousClass78Y implements AnonymousClass78Z {
    public boolean A00;
    public final Activity A01;
    public final String A02;

    public final C3260875i createCommandData() {
        return new C3260975j(this, this.loggingId, this.commandType, this.A00, this.A02, this.description, "ai", this.iconDrawableRes);
    }

    public final boolean shouldPrependOnReply(String str, C69347Njm njm) {
        0qQ.A0B(str, 0);
        0qQ.A0B(njm, 1);
        if (!str.equals(this.A02) || njm == C69347Njm.LONG_PRESS_REIMAGINE || !AnonymousClass9B8.A04(this.userSession)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3267678b(android.app.Activity r12, com.instagram.common.session.UserSession r13) {
        /*
            r11 = this;
            X.7OR r4 = X.AnonymousClass7OR.MENTION
            java.lang.String r5 = "ai"
            X.7OS r6 = X.AnonymousClass7OS.AI
            X.AnonymousClass9B9.A00()
            r0 = 2131960443(0x7f13227b, float:1.9557555E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330088975122885(0x811206000541c5, double:3.0386327851694454E-306)
            r3 = r13
            boolean r0 = X.182.A06(r2, r13, r0)
            r8 = 2131238407(0x7f081e07, float:1.8093092E38)
            if (r0 == 0) goto L_0x0024
            r8 = 2131238404(0x7f081e04, float:1.8093086E38)
        L_0x0024:
            X.78c r9 = X.C3267778c.A00
            r0 = 5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A01 = r12
            X.AnonymousClass9B9.A00()
            r0 = 2131960442(0x7f13227a, float:1.9557553E38)
            java.lang.String r0 = r12.getString(r0)
            X.0qQ.A07(r0)
            r11.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3267678b.<init>(android.app.Activity, com.instagram.common.session.UserSession):void");
    }
}
