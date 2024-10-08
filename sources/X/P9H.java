package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

public final class P9H implements AnonymousClass7Wt {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass7SD A02;
    public final AnonymousClass2Ep A03;
    public final DirectShareTarget A04;
    public final C254743sy A05;

    public P9H(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7SD r4, AnonymousClass2Ep r5, DirectShareTarget directShareTarget, C254743sy r7) {
        0qQ.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = directShareTarget;
    }

    public final void CpK(String str, String str2) {
        UserSession userSession = this.A01;
        OJc oJc = new OJc(userSession);
        C270634h3 r0 = new C270634h3(ClipsViewerSource.BLEND, userSession);
        r0.A0g = str;
        r0.A1I = null;
        oJc.A00(this.A00.requireActivity(), r0.A00(), (OMU) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (X.C331057Pi.A02(r6.AiM()) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CpS(android.graphics.RectF r40, com.instagram.common.typedurl.ImageUrl r41, X.OMU r42, com.instagram.model.direct.messageid.MessageIdentifier r43, X.AnonymousClass3OA r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, boolean r52) {
        /*
            r39 = this;
            r0 = 6
            r1 = r40
            X.0qQ.A0B(r1, r0)
            r12 = r47
            if (r47 == 0) goto L_0x0179
            r1 = r39
            com.instagram.common.session.UserSession r4 = r1.A01
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            X.4h3 r0 = new X.4h3
            r0.<init>(r2, r4)
            r0.A1C = r12
            r11 = 0
            r0.A1c = r11
            r2 = r50
            if (r50 == 0) goto L_0x0020
            r0.A1G = r2
        L_0x0020:
            X.3sy r2 = r1.A05
            com.instagram.model.direct.DirectThreadKey r3 = X.C66647MaG.A04(r2)
            r23 = 0
            if (r3 == 0) goto L_0x0157
            com.instagram.model.direct.DirectThreadKey r7 = X.C66647MaG.A03(r2)
            java.lang.String r10 = r7.A00
            r2 = r23
            X.2Dm r3 = X.1bJ.A00(r4)
            java.util.HashSet r3 = r3.Bk6()
            boolean r36 = r3.contains(r7)
        L_0x003e:
            com.instagram.model.direct.DirectShareTarget r5 = r1.A04
            X.2Dm r3 = X.1bJ.A00(r4)
            X.3U9 r6 = r3.BYf(r5)
            boolean r3 = r6.Axj()
            if (r3 != 0) goto L_0x005a
            X.3Tu r3 = r6.AiM()
            boolean r3 = X.C331057Pi.A02(r3)
            r37 = 0
            if (r3 == 0) goto L_0x005c
        L_0x005a:
            r37 = 1
        L_0x005c:
            X.2Ep r6 = r1.A03
            r9 = r43
            java.lang.String r3 = r9.A01
            r18 = r3
            r8 = 0
            java.lang.String r19 = r9.A00()
            if (r6 == 0) goto L_0x0128
            boolean r29 = r6.CKb()
            boolean r30 = X.C66641MaA.A00(r6)
            boolean r31 = r6.isPending()
            boolean r32 = X.AnonymousClass7TF.A1V(r2)
            boolean r33 = r6.Ca9()
            r35 = 1
            boolean r38 = r6.COb()
            com.instagram.clips.intf.ClipsViewerDirectData r3 = new com.instagram.clips.intf.ClipsViewerDirectData
            r24 = r3
            r25 = r18
            r26 = r19
            r27 = r10
            r28 = r11
            r34 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x0096:
            r0.A0G = r3
            X.OJc r3 = new X.OJc
            r3.<init>(r4)
            if (r19 == 0) goto L_0x00d6
            if (r6 == 0) goto L_0x00ef
            java.lang.String r21 = r6.C6f()
            boolean r27 = r6.CVE()
            boolean r28 = r6.CUG()
            int r4 = r5.A01
            int r26 = r6.AdN()
            java.lang.String r20 = "clips_reply_direct"
            com.instagram.clips.model.ClipsReplyBarData r13 = new com.instagram.clips.model.ClipsReplyBarData
            r24 = r23
            r29 = r11
            r30 = r11
            r31 = r11
            r32 = r11
            r33 = r11
            r35 = r11
            r36 = r11
            r22 = r10
            r25 = r4
            r16 = r2
            r17 = r12
            r14 = r5
            r15 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x00d4:
            r0.A0I = r13
        L_0x00d6:
            com.instagram.clips.intf.ClipsViewerConfig r4 = r0.A00()
            X.4DH r0 = r1.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r5 = 201(0xc9, float:2.82E-43)
            r6 = 5
            X.GVC r0 = new X.GVC
            r2 = r3
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.invoke()
            return
        L_0x00ef:
            X.7SD r4 = r1.A02
            if (r4 == 0) goto L_0x0125
            java.lang.String r9 = r4.A0W
            boolean r6 = r4.A0x
            boolean r8 = r4.A0r
        L_0x00f9:
            int r4 = r5.A01
            java.lang.String r20 = "clips_reply_direct"
            com.instagram.clips.model.ClipsReplyBarData r13 = new com.instagram.clips.model.ClipsReplyBarData
            r14 = r5
            r15 = r7
            r16 = r2
            r17 = r12
            r21 = r9
            r22 = r10
            r24 = r23
            r25 = r4
            r26 = r11
            r27 = r6
            r28 = r8
            r29 = r11
            r30 = r11
            r31 = r11
            r32 = r11
            r33 = r11
            r35 = r11
            r36 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x00d4
        L_0x0125:
            r9 = 0
            r6 = 0
            goto L_0x00f9
        L_0x0128:
            X.7SD r3 = r1.A02
            if (r3 == 0) goto L_0x0169
            boolean r15 = r3.A15
            boolean r14 = r3.A14
            boolean r32 = X.AnonymousClass7TF.A1V(r2)
            boolean r13 = r3.A16
            r35 = 1
            boolean r9 = r3.A0o
            com.instagram.clips.intf.ClipsViewerDirectData r3 = new com.instagram.clips.intf.ClipsViewerDirectData
            r24 = r3
            r25 = r18
            r26 = r19
            r27 = r10
            r28 = r11
            r29 = r15
            r30 = r14
            r31 = r11
            r33 = r13
            r34 = r11
            r38 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0096
        L_0x0157:
            boolean r3 = r2 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r3 == 0) goto L_0x016e
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            java.lang.Long r3 = r2.A02
            java.lang.String r10 = java.lang.String.valueOf(r3)
            r7 = r23
            r36 = 0
            goto L_0x003e
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Expected DirectThreadKey or MsysThreadKey, instead found: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r2, r0, r1)
            throw r0
        L_0x0179:
            java.lang.String r0 = "Must pass mediaId"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9H.CpS(android.graphics.RectF, com.instagram.common.typedurl.ImageUrl, X.OMU, com.instagram.model.direct.messageid.MessageIdentifier, X.3OA, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
