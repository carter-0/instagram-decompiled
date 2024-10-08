package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

public final class GFI implements JR8, JQ0 {
    public 0sK A00;
    public 0sP A01;
    public 0sP A02;
    public 0sL A03;
    public 0sK A04;
    public 0sK A05;
    public final C270694h9 A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final JU5 A09;
    public final JQ0 A0A;
    public final AnonymousClass93T A0B;
    public final C55684Hlh A0C;
    public final GF2 A0D;

    public final void ER2(0sK r2) {
        0qQ.A0B(r2, 0);
        this.A0A.ER2(r2);
    }

    private final void A00(C53370Gmu gmu, C53389GnL gnL, C267324bN r24, AnonymousClass4DU r25, AnonymousClass3W1 r26, String str, boolean z) {
        C53389GnL gnL2 = gnL;
        C53370Gmu gmu2 = gmu;
        AnonymousClass3W1 r11 = r26;
        boolean z2 = z;
        A01((ClipsViewerConfig) gnL2.A03, (C267324bN) gnL2.A04, (HLF) gmu2.A03, r25, r11, (User) null, Float.valueOf(gmu2.A00), Float.valueOf(gmu2.A01), z2);
        C267324bN r3 = r24;
        1Xj r4 = r3.A02;
        if (r4 != null) {
            String A1B = C51966G9m.A1B(r3);
            0qQ.A0B(A1B, 0);
            String id = r4.getId();
            if (id != null) {
                SourceModelInfoParams A0Q = C51974G9v.A0Q(r4, r11, id, str);
                UserSession userSession = this.A08;
                C55813Hnt hnt = new C55813Hnt((UserSession) null, A0Q, A1B, C324666zh.A01(userSession, r3.A06()), z2);
                User A2A = r4.A2A(userSession);
                if (A2A != null && A2A.A01() == 31 && 182.A06(0Tu.A05, userSession, 36327859886766846L)) {
                    0sL r0 = this.A03;
                    if (r0 != null) {
                        r0.invoke(r4, r11);
                    }
                } else if (!r11.A1p || !182.A06(0Tu.A06, userSession, 36321584941180467L)) {
                    0sK r02 = this.A04;
                    if (r02 != null) {
                        r02.invoke(hnt, r4, r11);
                    }
                } else {
                    0sP r03 = this.A01;
                    if (r03 != null) {
                        r03.invoke(hnt);
                    }
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    private final void A01(ClipsViewerConfig clipsViewerConfig, C267324bN r24, HLF hlf, AnonymousClass4DU r26, AnonymousClass3W1 r27, User user, Float f, Float f2, boolean z) {
        C267324bN r8 = r24;
        1Xj r0 = r8.A02;
        if (r0 != null) {
            UserSession userSession = this.A08;
            AnonymousClass3W1 r3 = r27;
            IT8 it8 = new IT8(r8, userSession, r3, user);
            User A2A = r0.A2A(userSession);
            if (A2A != null) {
                boolean A2Q = A2A.A2Q();
                int position = r3.getPosition();
                ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
                String str = clipsViewerConfig2.A13;
                String str2 = clipsViewerConfig2.A14;
                C233822wX.A0J(userSession, it8, hlf, r8, r26, this.A0B, f, f2, (Integer) null, (Integer) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str, str2, clipsViewerConfig2.A18, position, A2Q, z);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaD(android.content.Context r37, android.view.View r38, X.C53370Gmu r39, X.C53389GnL r40, X.AnonymousClass4DU r41, X.AnonymousClass3W1 r42, com.instagram.user.model.User r43, X.C62320sa r44, boolean r45, boolean r46, boolean r47, boolean r48) {
        /*
            r36 = this;
            r10 = r38
            r5 = 1
            r15 = r41
            r13 = r43
            X.C51972G9s.A1F(r13, r15)
            r4 = r36
            com.instagram.common.session.UserSession r2 = r4.A08
            r8 = r39
            float r9 = r8.A00
            float r12 = r8.A01
            r0 = r48
            boolean r0 = X.GL7.A00(r10, r2, r9, r12, r0)
            if (r0 != r5) goto L_0x0074
            r3 = r40
            java.lang.Object r1 = r3.A04
            X.4bN r1 = (X.C267324bN) r1
            X.5o2 r6 = r1.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r6 == r0) goto L_0x0074
            X.1Xj r0 = r1.A02
            r7 = 0
            r19 = r42
            r25 = r47
            if (r0 == 0) goto L_0x0112
            boolean r6 = r0.A4z()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r1.CcK()
            if (r6 == 0) goto L_0x0075
            com.instagram.user.model.User r6 = r0.A2A(r2)
            if (r6 == 0) goto L_0x0075
            boolean r6 = r6.A2Q()
            if (r6 != r5) goto L_0x0075
            r9 = r4
            r10 = r8
            r11 = r3
            r12 = r1
            r13 = r15
            r14 = r19
            r15 = r7
            r16 = r25
            r9.A00(r10, r11, r12, r13, r14, r15, r16)
        L_0x0056:
            X.4h9 r8 = r4.A06
            X.2v9 r6 = X.C233162v9.PROFILE_TAP
            java.lang.Object r5 = r3.A05
            r3 = 0
            if (r0 == 0) goto L_0x0065
            X.16V r0 = r0.A2B(r2)
            java.lang.String r7 = r0.A02
        L_0x0065:
            X.5yf r0 = new X.5yf
            r0.<init>(r3, r3, r3, r7)
            r8.DUE(r0, r6, r1, r5)
            X.GNk r2 = X.C52318GNk.ITEM_INTERACTION_NEW_PAGE
            X.GNj r0 = X.C52317GNj.A0X
            r4.CIR(r1, r2, r0)
        L_0x0074:
            return
        L_0x0075:
            boolean r6 = r0.A4z()
            if (r6 == 0) goto L_0x0092
            boolean r6 = r13.A2Q()
            if (r6 == 0) goto L_0x0092
            java.lang.String r16 = r13.getId()
            r10 = r4
            r11 = r8
            r12 = r3
            r13 = r1
            r14 = r15
            r15 = r19
            r17 = r25
            r10.A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0056
        L_0x0092:
            boolean r6 = r0.A4b()
            if (r6 == 0) goto L_0x0112
            if (r45 == 0) goto L_0x0112
            boolean r6 = X.C271174i4.A03(r2, r0)
            if (r6 == 0) goto L_0x0112
            java.lang.Object r6 = r3.A05
            X.GDe r6 = (X.C52058GDe) r6
            X.3W1 r6 = r6.A0E
            if (r6 == 0) goto L_0x0056
            X.0sK r9 = r4.A00
            if (r9 == 0) goto L_0x0056
            java.lang.Object r8 = r3.A06
            X.1Xj r8 = (X.1Xj) r8
            boolean r6 = r8.A4b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            X.C51967G9n.A1N(r8, r6, r9, r5)
            X.0iw r12 = r4.A07
            int r5 = r19.getPosition()
            long r5 = (long) r5
            X.1sQ r9 = X.C51966G9m.A0n(r8)
            if (r9 == 0) goto L_0x010f
            java.lang.Long r17 = X.C291335gz.A04(r9)
        L_0x00cc:
            X.Hlh r9 = r4.A0C
            java.lang.String r11 = r9.A00
            X.93T r10 = r4.A0B
            java.lang.Object r9 = r3.A03
            com.instagram.clips.intf.ClipsViewerConfig r9 = (com.instagram.clips.intf.ClipsViewerConfig) r9
            com.instagram.search.common.analytics.SearchContext r9 = r9.A0S
            r13 = r2
            r14 = r8
            r15 = r9
            r16 = r10
            r18 = r11
            r19 = r5
            X.C56246HvD.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.ArrayList r10 = r8.A3I()
            java.lang.String r9 = X.C51972G9s.A0q(r2, r8)
            if (r10 == 0) goto L_0x0056
            boolean r5 = r10.isEmpty()
            if (r5 != 0) goto L_0x0056
            X.LOQ r6 = X.LOQ.A00
            boolean r5 = r8.A5G()
            boolean r5 = r6.A01(r2, r9, r5)
            if (r5 == 0) goto L_0x0056
            boolean r5 = r8.A4b()
            if (r5 != 0) goto L_0x0056
            java.util.ArrayList r5 = X.C51973G9u.A0l(r8)
            X.C51974G9v.A1H(r2, r8, r5, r10)
            goto L_0x0056
        L_0x010f:
            r17 = r7
            goto L_0x00cc
        L_0x0112:
            if (r46 != 0) goto L_0x0115
            r10 = r7
        L_0x0115:
            X.1OP r5 = X.1OP.$redex_init_class
            r5 = 0
            X.0qQ.A0B(r2, r5)
            com.instagram.model.reels.Reel r6 = X.AnonymousClass3PQ.A02(r2, r13)
            if (r10 == 0) goto L_0x012e
            if (r6 == 0) goto L_0x012e
            X.0sK r5 = r4.A05
            if (r5 == 0) goto L_0x012e
            r8 = r44
            r5.invoke(r10, r8, r6)
            goto L_0x0056
        L_0x012e:
            if (r0 == 0) goto L_0x0056
            X.0sP r11 = r4.A02
            if (r11 == 0) goto L_0x0171
            X.0iw r5 = r4.A07
            java.lang.String r23 = r5.getModuleName()
            java.lang.Object r10 = r8.A03
            X.HLF r10 = (X.HLF) r10
            java.lang.String r14 = X.AnonymousClass3ZA.A00(r13)
            boolean r5 = r0.CcK()
            if (r5 == 0) goto L_0x01bd
            X.6zo r6 = new X.6zo
            r6.<init>(r2)
            java.lang.String r5 = r0.getId()
            boolean r5 = r6.A01(r5, r14)
            if (r5 == 0) goto L_0x01bd
            java.lang.String r24 = "profile_products"
        L_0x0159:
            java.lang.Float r21 = java.lang.Float.valueOf(r9)
            java.lang.Float r22 = java.lang.Float.valueOf(r12)
            X.Gma r5 = new X.Gma
            r20 = r13
            r18 = r10
            r17 = r1
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11.invoke(r5)
        L_0x0171:
            X.GF2 r6 = r4.A0D
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.GF2.A00(r6, r5)
            X.JU5 r10 = r4.A09
            X.4Cq r6 = r10.A0N
            r5 = 5
            X.C51971G9r.A1P(r10, r6, r5)
            java.lang.Object r6 = r8.A03
            X.HLF r6 = (X.HLF) r6
            java.lang.Object r5 = r3.A03
            com.instagram.clips.intf.ClipsViewerConfig r5 = (com.instagram.clips.intf.ClipsViewerConfig) r5
            java.lang.Float r33 = java.lang.Float.valueOf(r9)
            java.lang.Float r34 = java.lang.Float.valueOf(r12)
            r26 = r4
            r27 = r5
            r28 = r1
            r29 = r6
            r30 = r15
            r31 = r19
            r32 = r13
            r35 = r25
            r26.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            com.instagram.api.schemas.MusicPageTabType r5 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            X.GLN r10 = X.GLB.A00(r5, r2)
            X.1sQ r9 = X.C51966G9m.A0n(r0)
            X.0iw r8 = r4.A07
            java.lang.String r6 = r8.getModuleName()
            java.lang.String r5 = "open_profile_page"
            r10.A01(r9, r2, r5, r6)
            X.G9w.A1J(r8, r2, r0, r5)
            goto L_0x0056
        L_0x01bd:
            boolean r5 = r0.A5G()
            if (r5 != 0) goto L_0x01dc
            boolean r5 = r0.A5I()
            if (r5 != 0) goto L_0x01dc
            boolean r5 = r0.CcK()
            if (r5 == 0) goto L_0x01e0
            X.0Tu r14 = X.0Tu.A05
            r5 = 36322899199535773(0x810b7c00002a9d, double:3.034085942137253E-306)
            boolean r5 = X.182.A06(r14, r2, r5)
            if (r5 == 0) goto L_0x01e0
        L_0x01dc:
            java.lang.String r24 = "profile_clips"
            goto L_0x0159
        L_0x01e0:
            java.lang.String r24 = "profile_media_grid"
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFI.DaD(android.content.Context, android.view.View, X.Gmu, X.GnL, X.4DU, X.3W1, com.instagram.user.model.User, X.0sa, boolean, boolean, boolean, boolean):void");
    }

    public /* synthetic */ GFI(C270694h9 r2, AnonymousClass0iw r3, UserSession userSession, JQ0 jq0, C55684Hlh hlh) {
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        AnonymousClass7TG.A1S(A002, jq0);
        this.A08 = userSession;
        this.A07 = r3;
        this.A0C = hlh;
        this.A06 = r2;
        this.A0B = A002;
        this.A0A = jq0;
        this.A0D = new GF2(userSession);
        this.A09 = new JU5(userSession);
    }

    public final void CIR(C267324bN r2, C52318GNk gNk, C52317GNj gNj) {
        DbY.A1S(gNk, gNj);
        this.A0A.CIR(r2, gNk, gNj);
    }

    public final void EeY(0sK r1) {
        this.A00 = r1;
    }

    public final void EfS(0sK r1) {
        this.A04 = r1;
    }

    public final void EfT(0sP r1) {
        this.A01 = r1;
    }

    public final void Eh9(0sP r1) {
        this.A02 = r1;
    }

    public final void Ei8(0sK r1) {
        this.A05 = r1;
    }

    public final void Eqx(0sL r1) {
        this.A03 = r1;
    }
}
