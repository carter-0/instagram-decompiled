package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CGn  reason: case insensitive filesystem */
public final class C43873CGn extends C272124k8 {
    public final /* synthetic */ C46203DQf A00;
    public final /* synthetic */ C239413Gj A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43873CGn(UserSession userSession, C46203DQf dQf, C239413Gj r3, Integer num, String str, boolean z) {
        super(userSession);
        this.A02 = num;
        this.A01 = r3;
        this.A04 = z;
        this.A00 = dQf;
        this.A03 = str;
    }

    public final void A05(C268654dm r6, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(738205022);
        AnonymousClass7TG.A1N(userSession, r6);
        if (this.A02 == AnonymousClass05K.A00) {
            C239413Gj.A07(this.A01, this.A03, userSession.A06, "live_request_failure");
        }
        super.A05(r6, userSession);
        AnonymousClass0fD.A0A(-618439778, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A06(com.instagram.common.session.UserSession r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 1843331511(0x6ddf01b7, float:8.627154E27)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.4gL r12 = (X.C270194gL) r12
            r0 = -1220275218(0xffffffffb74413ee, float:-1.1687151E-5)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.AnonymousClass7TG.A1N(r11, r12)
            java.lang.Integer r9 = r10.A02
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.4wI r0 = r12.A06
            if (r0 != 0) goto L_0x001d
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x001d:
            boolean r0 = r0.A00()
            if (r9 != r8) goto L_0x0038
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = r12.A05(r11)
            if (r0 != 0) goto L_0x0044
            r0 = 2086648967(0x7c5fbc87, float:4.646824E36)
        L_0x002e:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1498297703(0xffffffffa6b1ca99, float:-1.2336756E-15)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0038:
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = r12.A05(r11)
            if (r0 != 0) goto L_0x0044
        L_0x0040:
            r0 = 255335614(0xf381cbe, float:9.077436E-30)
            goto L_0x002e
        L_0x0044:
            java.lang.Boolean r0 = r12.A0I
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0062
        L_0x004e:
            java.lang.Boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0062
        L_0x0058:
            boolean r0 = r12.A07()
            if (r0 != 0) goto L_0x0062
            r0 = -1862060148(0xffffffff9103378c, float:-1.0351195E-28)
            goto L_0x002e
        L_0x0062:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r12.A0N = r0
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r11)
            X.0qQ.A07(r0)
            com.instagram.model.reels.Reel r7 = r0.A0G(r12)
            X.3Gj r4 = r10.A01
            boolean r0 = r10.A04
            X.DQf r3 = r10.A00
            com.instagram.common.session.UserSession r2 = r4.A01
            if (r2 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x009a
            X.4gL r0 = r7.A0H
            if (r0 == 0) goto L_0x00ac
            X.3NV r1 = r0.A0A
            if (r1 != 0) goto L_0x0089
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x0089:
            X.3NV r0 = X.AnonymousClass3NV.A07
            if (r1 == r0) goto L_0x009a
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r2)
            X.0qQ.A07(r0)
            r0.A0Y(r7)
            r7.A0R(r2)
        L_0x009a:
            r3.Cz6(r7)
            if (r9 != r8) goto L_0x00a8
            java.lang.String r2 = r10.A03
            java.lang.String r1 = r11.A06
            java.lang.String r0 = "live_request_success"
            X.C239413Gj.A07(r4, r2, r1, r0)
        L_0x00a8:
            r0 = 539537684(0x2028b114, float:1.4288744E-19)
            goto L_0x002e
        L_0x00ac:
            r1 = 0
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43873CGn.A06(com.instagram.common.session.UserSession, java.lang.Object):void");
    }
}
