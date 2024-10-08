package X;

/* renamed from: X.78g  reason: invalid class name and case insensitive filesystem */
public final class C3268178g extends C3268278h implements AnonymousClass78Z {
    public final String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.182.A06(r2, r4, 36326914994092108L) == false) goto L_0x002a;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3268178g(android.app.Activity r17, com.instagram.common.session.UserSession r18, X.C3267878d r19, X.AnonymousClass78R r20, java.lang.Integer r21) {
        /*
            r16 = this;
            r15 = 0
            r14 = 1
            r13 = r20
            X.7OR r5 = r13.commandType
            java.lang.String r6 = r13.trigger
            X.7OS r7 = r13.loggingId
            X.AnonymousClass9B9.A00()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36326914993961034(0x810f230000384a, double:3.0366255467020946E-306)
            r4 = r18
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x002a
            r0 = 36326914994092108(0x810f230002384c, double:3.036625546784986E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 2131960535(0x7f1322d7, float:1.9557741E38)
            if (r1 != 0) goto L_0x002d
        L_0x002a:
            r0 = 2131960534(0x7f1322d6, float:1.955774E38)
        L_0x002d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 2131238628(0x7f081ee4, float:1.809354E38)
            X.78U r10 = r13.inputChecker
            r2 = r16
            r3 = r17
            r12 = r19
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.AnonymousClass9B9.A00()
            r0 = 2131960533(0x7f1322d5, float:1.9557737E38)
            java.lang.String r1 = r3.getString(r0)
            X.0qQ.A07(r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            X.0qQ.A07(r0)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3268178g.<init>(android.app.Activity, com.instagram.common.session.UserSession, X.78d, X.78R, java.lang.Integer):void");
    }

    public final boolean shouldPrependOnReply(String str, C69347Njm njm) {
        0qQ.A0B(njm, 1);
        if (njm == C69347Njm.LONG_PRESS_REIMAGINE) {
            return true;
        }
        return false;
    }

    public final C3260875i createCommandData() {
        if (!this.removePrefix) {
            return super.createCommandData();
        }
        AnonymousClass7OR r6 = this.commandType;
        String str = this.A00;
        String str2 = this.description;
        int i = this.iconDrawableRes;
        AnonymousClass7OS r5 = this.loggingId;
        Integer num = this.textRangeId;
        return new C3261075k(this.firstCommand.createCommandData(), new C68976Nc5(this.loggingId, this.commandType, this.textRangeId, str, this.description, this.iconDrawableRes), r5, r6, num, str, str2, i, this.preventDuplicates, this.removePrefix);
    }
}
