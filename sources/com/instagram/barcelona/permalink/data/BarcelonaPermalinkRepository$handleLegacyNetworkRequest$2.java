package com.instagram.barcelona.permalink.data;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C54439HDr;
import X.C60340gF;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
public final class BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ C54439HDr A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2(C54439HDr hDr, List list, AnonymousClass4D7 r4, boolean z, boolean z2) {
        super(1, r4);
        this.A04 = z;
        this.A01 = hDr;
        this.A03 = z2;
        this.A02 = list;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        boolean z = this.A04;
        return new BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2(this.A01, this.A02, r7, z, this.A03);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4D7, com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r2 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r1 = r6.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r6.AIY(r1, X.C53384GnG.A00((X.JV7) null, (X.C53384GnG) r1, (X.JRG) null, X.AnonymousClass05K.A01, (java.util.List) null, 1023, false, false, false, false)) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r2 = r9.A02;
        r13 = r9.A05;
        r12 = r4.A02;
        r14 = X.182.A06(X.0Tu.A05, r2, 36324003006131876L);
        r11 = X.AnonymousClass7TF.A1V(X.C638918c.A01(X.C61170le.A00).A05);
        r10 = ((X.C53384GnG) r6.getValue()).A07;
        r4.A00 = 1;
        r9 = null;
        r6 = X.AnonymousClass7TG.A0b(r2);
        r6.A0A("text_feed/{post_id}/replies/");
        r6.A0F("X-IG-App-ID", "871865944585275");
        r6.A9m("post_id", X.C51965G9l.A0u(r13));
        r6.A0H("is_app_start", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bb, code lost:
        if (r12 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        if (X.AnonymousClass7TE.A1b(r12) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
        r11 = X.AnonymousClass7TG.A0r(r12);
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        if (r1.hasNext() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d1, code lost:
        r11.add(X.1Xv.A06(X.AnonymousClass7TE.A18(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        r1 = X.C51970G9q.A0k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e3, code lost:
        r6.A0G("prioritized_reply_ids", r1);
        r6.A0G("paging_token", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        if (r14 == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f3, code lost:
        r6.A0E("check_for_unavailable_replies", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        if (r10 == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fa, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r6.A0E("media_archived", r9);
        r6.A0O((X.15p) null, X.C43818CEk.class, X.D0B.class, false);
        r6.A01 = X.1NY.A00((X.15p) null, r6, X.1XP.class, X.1XY.class, false);
        r6.A0A = "text_feed/{post_id}/replies/";
        r6.A03();
        r2 = r6.A0M().A02(r4, 104842234, 3, X.0yU.A07(X.AnonymousClass0yP.A00(36327932901276473L)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0132, code lost:
        if (r2 != r5) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0134, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0135, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r2 = r26
            X.1Hj r5 = X.1Hj.A02
            r4 = r25
            int r0 = r4.A00
            r7 = 1
            if (r0 == 0) goto L_0x002b
            X.0eS.A00(r2)
        L_0x000e:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x0137
            boolean r5 = r4.A04
            X.HDr r3 = r4.A01
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.CEk r0 = (X.C43818CEk) r0
            X.Gm9 r2 = r0.A02
            if (r2 != 0) goto L_0x0158
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002b:
            X.0eS.A00(r2)
            boolean r2 = r4.A04
            X.HDr r9 = r4.A01
            boolean r1 = r4.A03
            r8 = 0
            X.05G r6 = r9.A07
            java.lang.Object r0 = r6.getValue()
            X.GnG r0 = (X.C53384GnG) r0
            X.JV7 r0 = r0.A01
            if (r1 == 0) goto L_0x004b
            if (r0 == 0) goto L_0x0047
            java.lang.String r8 = r0.A01
        L_0x0045:
            if (r8 != 0) goto L_0x0050
        L_0x0047:
            if (r2 != 0) goto L_0x0050
            goto L_0x0163
        L_0x004b:
            if (r0 == 0) goto L_0x0047
            java.lang.String r8 = r0.A02
            goto L_0x0045
        L_0x0050:
            java.lang.Object r1 = r6.getValue()
            r0 = r1
            X.GnG r0 = (X.C53384GnG) r0
            r3 = 0
            r15 = 0
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            r20 = 1023(0x3ff, float:1.434E-42)
            r17 = r15
            r19 = r15
            r21 = r3
            r22 = r3
            r23 = r3
            r24 = r3
            r16 = r0
            X.GnG r0 = X.C53384GnG.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r6.AIY(r1, r0)
            if (r0 == 0) goto L_0x0050
            com.instagram.common.session.UserSession r2 = r9.A02
            java.lang.String r13 = r9.A05
            java.util.List r12 = r4.A02
            X.0Tu r9 = X.0Tu.A05
            r0 = 36324003006131876(0x810c7d00002ea4, double:3.034783993873301E-306)
            boolean r14 = X.182.A06(r9, r2, r0)
            X.0wX r0 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r0)
            X.1Jv r0 = r0.A05
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Object r0 = r6.getValue()
            X.GnG r0 = (X.C53384GnG) r0
            boolean r10 = r0.A07
            r4.A00 = r7
            r9 = 0
            X.1NY r6 = X.AnonymousClass7TG.A0b(r2)
            java.lang.String r2 = "text_feed/{post_id}/replies/"
            r6.A0A(r2)
            java.lang.String r1 = "X-IG-App-ID"
            java.lang.String r0 = "871865944585275"
            r6.A0F(r1, r0)
            java.lang.String r1 = X.C51965G9l.A0u(r13)
            java.lang.String r0 = "post_id"
            r6.A9m(r0, r1)
            java.lang.String r0 = "is_app_start"
            r6.A0H(r0, r11)
            if (r12 == 0) goto L_0x00e2
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x00e2
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x00cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            java.lang.String r0 = X.1Xv.A06(r0)
            r11.add(r0)
            goto L_0x00cb
        L_0x00dd:
            java.lang.String r1 = X.C51970G9q.A0k(r11)
            goto L_0x00e3
        L_0x00e2:
            r1 = r15
        L_0x00e3:
            java.lang.String r0 = "prioritized_reply_ids"
            r6.A0G(r0, r1)
            java.lang.String r0 = "paging_token"
            r6.A0G(r0, r8)
            if (r14 == 0) goto L_0x0135
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
        L_0x00f3:
            java.lang.String r0 = "check_for_unavailable_replies"
            r6.A0E(r0, r1)
            if (r10 == 0) goto L_0x00fe
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        L_0x00fe:
            java.lang.String r0 = "media_archived"
            r6.A0E(r0, r9)
            java.lang.Class<X.CEk> r1 = X.C43818CEk.class
            java.lang.Class<X.D0B> r0 = X.D0B.class
            r6.A0O(r15, r1, r0, r3)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1NT r0 = X.1NY.A00(r15, r6, r1, r0, r3)
            r6.A01 = r0
            r6.A0A = r2
            r6.A03()
            X.1OC r3 = r6.A0M()
            r0 = 36327932901276473(0x81101000013b39, double:3.037269275387162E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r2 = X.0yU.A07(r0)
            r1 = 104842234(0x63fc3fa, float:3.6067088E-35)
            r0 = 3
            java.lang.Object r2 = r3.A02(r4, r1, r0, r2)
            if (r2 != r5) goto L_0x000e
            return r5
        L_0x0135:
            r1 = r15
            goto L_0x00f3
        L_0x0137:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0153
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r0 = r2.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Object r0 = r0.A00()
            X.1XP r0 = (X.1XP) r0
            if (r0 == 0) goto L_0x014d
            java.lang.String r1 = r0.getErrorMessage()
        L_0x014d:
            X.HDr r0 = r4.A01
            X.C54439HDr.A02(r0, r1)
            goto L_0x0163
        L_0x0153:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0158:
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1E4.A00(r0)
            boolean r1 = r4.A03
            r0 = 0
            X.C54439HDr.A01(r2, r3, r5, r1, r0)
        L_0x0163:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
