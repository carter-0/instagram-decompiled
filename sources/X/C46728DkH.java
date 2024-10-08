package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DkH  reason: case insensitive filesystem */
public final class C46728DkH extends C361478gI {
    public final C61081JwJ A00 = new C61081JwJ(Et3.A01, "COMMUNITY_VIDEO");
    public final C61081JwJ A01 = new C61081JwJ(Et3.A00, "COMMUNITY_VIDEO_DARK");
    public final C61081JwJ A02 = new C61081JwJ(Et3.A05, "CONNECTIONS_VIDEO");
    public final C61081JwJ A03 = new C61081JwJ(Et3.A04, "CONNECTIONS_VIDEO_DARK");
    public final C61081JwJ A04 = new C61081JwJ(Et3.A03, "CONVERSATION_VIDEO");
    public final C61081JwJ A05 = new C61081JwJ(Et3.A02, "CONVERSATION_VIDEO_DARK");
    public final UserSession A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0083, code lost:
        if (X.C375489Dt.A01(r1) != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46728DkH(android.app.Application r15, com.instagram.common.session.UserSession r16) {
        /*
            r14 = this;
            r0 = r16
            X.AnonymousClass7TG.A1O(r15, r0)
            r14.<init>(r15)
            r14.A06 = r0
            X.3Ja r2 = X.Et3.A01
            java.lang.String r1 = "COMMUNITY_VIDEO"
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C239973Ja) r2, (java.lang.String) r1)
            r14.A00 = r0
            X.3Ja r2 = X.Et3.A00
            java.lang.String r1 = "COMMUNITY_VIDEO_DARK"
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C239973Ja) r2, (java.lang.String) r1)
            r14.A01 = r0
            X.3Ja r2 = X.Et3.A03
            java.lang.String r1 = "CONVERSATION_VIDEO"
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C239973Ja) r2, (java.lang.String) r1)
            r14.A04 = r0
            X.3Ja r2 = X.Et3.A02
            java.lang.String r1 = "CONVERSATION_VIDEO_DARK"
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C239973Ja) r2, (java.lang.String) r1)
            r14.A05 = r0
            X.3Ja r2 = X.Et3.A05
            java.lang.String r1 = "CONNECTIONS_VIDEO"
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C239973Ja) r2, (java.lang.String) r1)
            r14.A02 = r0
            X.3Ja r2 = X.Et3.A04
            java.lang.String r1 = "CONNECTIONS_VIDEO_DARK"
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C239973Ja) r2, (java.lang.String) r1)
            r14.A03 = r0
            X.0sn r2 = X.0sn.A00
            r1 = 0
            r6 = 10
            X.JwA r0 = new X.JwA
            r0.<init>((java.util.List) r2, (int) r1, (int) r6)
            X.02z r5 = X.DbS.A10(r0)
            r14.A07 = r5
            X.05F r0 = X.10b.A03(r5)
            r14.A08 = r0
        L_0x0062:
            java.lang.Object r7 = r5.getValue()
            r8 = r7
            X.JwA r8 = (X.C61072JwA) r8
            r12 = 2131958723(0x7f131bc3, float:1.9554066E38)
            android.app.Application r0 = r14.A0D()
            boolean r13 = X.AnonymousClass3HA.A00(r0)
            com.instagram.common.session.UserSession r1 = r14.A06
            boolean r0 = X.AnonymousClass7K4.A00(r1)
            if (r0 == 0) goto L_0x0085
            boolean r0 = X.C375489Dt.A01(r1)
            r3 = 2131958724(0x7f131bc4, float:1.9554068E38)
            if (r0 == 0) goto L_0x0088
        L_0x0085:
            r3 = 2131958725(0x7f131bc5, float:1.955407E38)
        L_0x0088:
            r11 = 2131958726(0x7f131bc6, float:1.9554072E38)
            r2 = 2131958727(0x7f131bc7, float:1.9554074E38)
            r10 = 2131958728(0x7f131bc8, float:1.9554076E38)
            r9 = 2131958729(0x7f131bc9, float:1.9554078E38)
            r1 = 2131231302(0x7f080246, float:1.8078681E38)
            if (r13 == 0) goto L_0x00d4
            X.JwJ r0 = r14.A01
        L_0x009b:
            X.Ukt r4 = new X.Ukt
            r4.<init>(r0, r1, r12, r3)
            r1 = 2131231304(0x7f080248, float:1.8078685E38)
            if (r13 == 0) goto L_0x00d1
            X.JwJ r0 = r14.A03
        L_0x00a7:
            X.Ukt r3 = new X.Ukt
            r3.<init>(r0, r1, r11, r2)
            r2 = 2131231303(0x7f080247, float:1.8078683E38)
            if (r13 == 0) goto L_0x00ce
            X.JwJ r1 = r14.A05
        L_0x00b3:
            X.Ukt r0 = new X.Ukt
            r0.<init>(r1, r2, r10, r9)
            X.Ukt[] r0 = new X.C15928Ukt[]{r4, r3, r0}
            java.util.List r2 = X.0sr.A1P(r0)
            int r1 = r8.A01
            X.JwA r0 = new X.JwA
            r0.<init>((java.util.List) r2, (int) r1, (int) r6)
            boolean r0 = r5.AIY(r7, r0)
            if (r0 == 0) goto L_0x0062
            return
        L_0x00ce:
            X.JwJ r1 = r14.A04
            goto L_0x00b3
        L_0x00d1:
            X.JwJ r0 = r14.A02
            goto L_0x00a7
        L_0x00d4:
            X.JwJ r0 = r14.A00
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46728DkH.<init>(android.app.Application, com.instagram.common.session.UserSession):void");
    }
}
