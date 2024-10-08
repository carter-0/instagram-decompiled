package com.instagram.contentnotes.ui.immersivereply;

import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.C262224Cq;
import X.L62;
import X.LCf;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;

public final class ImmersiveReplyControlMenuViewBinder {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final ContentNotesImmersiveReplyContent A03;
    public final L62 A04;
    public final C262224Cq A05;
    public final LCf A06;

    public ImmersiveReplyControlMenuViewBinder(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent, L62 l62, LCf lCf, C262224Cq r8) {
        0qQ.A0B(contentNotesImmersiveReplyContent, 4);
        AnonymousClass7TG.A1S(lCf, userSession);
        this.A00 = fragmentActivity;
        this.A04 = l62;
        this.A01 = r3;
        this.A03 = contentNotesImmersiveReplyContent;
        this.A06 = lCf;
        this.A02 = userSession;
        this.A05 = r8;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C586704n r14, com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r15, com.instagram.user.model.User r16, X.AnonymousClass4D7 r17) {
        /*
            r2 = r14
            r12 = r16
            r8 = r15
            r4 = 24
            r5 = r17
            boolean r0 = X.MED.A04(r4, r5)
            if (r0 == 0) goto L_0x013f
            r7 = r5
            X.MED r7 = (X.MED) r7
            int r3 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x013f
            int r3 = r3 - r1
            r7.A00 = r3
        L_0x001c:
            java.lang.Object r9 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0074
            if (r0 == r4) goto L_0x00ca
            if (r0 != r5) goto L_0x014b
            java.lang.Object r10 = r7.A03
            X.0SM r10 = (X.0SM) r10
            java.lang.Object r2 = r7.A02
            X.04n r2 = (X.C586704n) r2
            java.lang.Object r8 = r7.A01
            com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r8 = (com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder) r8
            X.0eS.A00(r9)
        L_0x003a:
            X.3Ii r9 = (X.C239803Ii) r9
            X.0SM.A00(r10, r3, r3, r4)
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0051
            X.L62 r0 = r8.A04
            X.LAH r0 = r0.A02
            X.05G r1 = r0.A05
            X.KgQ r0 = X.C62475KgQ.DISMISS_ON_MUTE
            r1.Epw(r0)
        L_0x004e:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0051:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0146
            X.6ap r1 = X.DbV.A0W()
            X.4dm r0 = X.JTP.A0N(r9)
            java.lang.Object r0 = r0.A00()
            X.1XP r0 = (X.1XP) r0
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r0.getErrorMessage()
            if (r0 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r0 = ""
        L_0x006d:
            r1.A0D = r0
            X.DbY.A1N(r1)
            goto L_0x00f4
        L_0x0074:
            X.0eS.A00(r9)
            X.MED.A00(r15, r12, r14, r7, r4)
            X.1IW r10 = X.JTS.A0s(r7)
            androidx.fragment.app.FragmentActivity r11 = r15.A00
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r0 = r15.A03
            java.lang.String r1 = r0.A0A
            X.0qQ.A0B(r1, r4)
            X.8ab r9 = X.DbS.A0X(r11)
            r0 = 2131956649(0x7f1313a9, float:1.954986E38)
            java.lang.String r0 = X.DbW.A0h(r11, r1, r0)
            r9.A05 = r0
            r0 = 2131968593(0x7f134251, float:1.9574085E38)
            r9.A08(r0)
            r9.A0r(r4)
            r9.A0s(r4)
            r1 = 2131956648(0x7f1313a8, float:1.9549858E38)
            r0 = 11
            X.LV0 r0 = X.LV0.A00(r10, r15, r0)
            r9.A0L(r0, r1)
            r1 = 2131968595(0x7f134253, float:1.957409E38)
            r0 = 12
            X.LV0 r0 = X.LV0.A00(r10, r15, r0)
            r9.A0H(r0, r1)
            X.LTz r0 = new X.LTz
            r0.<init>(r3, r15, r10)
            r9.A0B(r0)
            X.DbT.A1V(r9)
            java.lang.Object r9 = r10.A0E()
            if (r9 != r6) goto L_0x00d9
            return r6
        L_0x00ca:
            java.lang.Object r2 = r7.A03
            X.04n r2 = (X.C586704n) r2
            java.lang.Object r12 = r7.A02
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            java.lang.Object r8 = r7.A01
            com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r8 = (com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder) r8
            X.0eS.A00(r9)
        L_0x00d9:
            X.Kg3 r9 = (X.C62453Kg3) r9
            int r0 = r9.ordinal()
            if (r0 == r3) goto L_0x00fd
            if (r0 != r4) goto L_0x0150
            X.L62 r0 = r8.A04
            boolean r1 = X.C71106Ock.A01()
            X.LAH r0 = r0.A02
            if (r1 != 0) goto L_0x00f4
            X.05G r1 = r0.A05
            X.KgQ r0 = X.C62475KgQ.REDISPLAY_KEYBOARD_OLD_APIS
            r1.Epw(r0)
        L_0x00f4:
            r1 = 8
            X.04l r0 = r2.A00
            r0.A03(r1)
            goto L_0x004e
        L_0x00fd:
            X.L62 r0 = r8.A04
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r1 = r8.A03
            X.0qQ.A0B(r12, r3)
            X.LAH r0 = r0.A02
            X.KWS r11 = r0.A04
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r1.A02
            java.lang.String r13 = r0.A04
            java.lang.String r14 = r0.A0A
            java.lang.String r15 = r1.A07
            X.0qQ.A0B(r13, r5)
            X.4Cq r0 = r11.A01
            r16 = 0
            X.MFq r10 = new X.MFq
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.2Q8 r9 = X.JTO.A1E(r10, r0)
            X.R8F r10 = new X.R8F
            r10.<init>()
            r10.A0D(r3)
            androidx.fragment.app.FragmentActivity r0 = r8.A00
            X.0hq r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "mute_progress_dialog"
            r10.A0B(r1, r0)
            X.MED.A00(r8, r2, r10, r7, r5)
            java.lang.Object r9 = r9.A0E(r7)
            if (r9 != r6) goto L_0x003a
            return r6
        L_0x013f:
            X.MED r7 = new X.MED
            r7.<init>(r15, r5, r4)
            goto L_0x001c
        L_0x0146:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x014b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0150:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder.A01(X.04n, com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder, com.instagram.user.model.User, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.view.View r20, com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r21, X.AnonymousClass4D7 r22) {
        /*
            r9 = r20
            r0 = r21
            r4 = 23
            r5 = r22
            boolean r1 = X.MED.A04(r4, r5)
            if (r1 == 0) goto L_0x0193
            r6 = r5
            X.MED r6 = (X.MED) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0193
            int r3 = r3 - r2
            r6.A00 = r3
        L_0x001c:
            java.lang.Object r4 = r6.A04
            X.1Hj r2 = X.1Hj.A02
            int r1 = r6.A00
            r11 = 4
            r8 = 3
            r3 = 2
            r10 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0046
            if (r1 == r10) goto L_0x00c2
            if (r1 == r3) goto L_0x0042
            if (r1 == r8) goto L_0x0169
            if (r1 != r11) goto L_0x019a
            java.lang.Object r0 = r6.A01
            com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r0 = (com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder) r0
            X.0eS.A00(r4)
        L_0x0038:
            X.LCf r1 = r0.A06
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            r1.A00(r0)
        L_0x003f:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0042:
            X.0eS.A00(r4)
            goto L_0x003f
        L_0x0046:
            X.0eS.A00(r4)
            androidx.fragment.app.FragmentActivity r12 = r0.A00
            android.view.Window r5 = r12.getWindow()
            android.view.Window r1 = r12.getWindow()
            android.view.View r4 = r1.getDecorView()
            X.04n r1 = new X.04n
            r1.<init>(r4, r5)
            r5 = 8
            X.04l r4 = r1.A00
            r4.A01(r5)
            X.MED.A00(r0, r9, r1, r6, r10)
            X.1IW r7 = X.JTS.A0s(r6)
            X.Ocp r16 = X.C71110Ocp.A00
            com.instagram.common.session.UserSession r15 = r0.A02
            X.0iw r5 = r0.A01
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r14 = r0.A03
            java.lang.String r4 = r14.A0A
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r14 = r14.A02
            com.instagram.user.model.User r14 = r14.A01
            com.instagram.common.typedurl.ImageUrl r20 = r14.Bh3()
            r19 = r15
            r21 = r4
            r22 = r13
            r18 = r5
            r17 = r12
            X.Dg1 r5 = r16.A03(r17, r18, r19, r20, r21, r22)
            r15 = 2131954046(0x7f13097e, float:1.954458E38)
            r14 = 33
            X.LY8 r4 = new X.LY8
            r4.<init>(r14, r7, r0)
            r5.A02(r4, r15)
            r15 = 2131954071(0x7f130997, float:1.954463E38)
            r14 = 34
            X.LY8 r4 = new X.LY8
            r4.<init>(r14, r7, r0)
            r5.A02(r4, r15)
            r14 = 2131954073(0x7f130999, float:1.9544635E38)
            r4 = 35
            X.LY8.A01(r5, r7, r0, r4, r14)
            X.Lro r4 = new X.Lro
            r4.<init>(r13, r7, r0)
            r5.A03 = r4
            X.FFy r4 = new X.FFy
            r4.<init>(r5)
            r4.A03(r12)
            java.lang.Object r4 = r7.A0E()
            if (r4 != r2) goto L_0x00d1
            return r2
        L_0x00c2:
            java.lang.Object r1 = r6.A03
            X.04n r1 = (X.C586704n) r1
            java.lang.Object r9 = r6.A02
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r0 = r6.A01
            com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r0 = (com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder) r0
            X.0eS.A00(r4)
        L_0x00d1:
            X.Kgl r4 = (X.C62495Kgl) r4
            int r4 = r4.ordinal()
            if (r4 == r13) goto L_0x0179
            if (r4 == r10) goto L_0x0119
            if (r4 == r3) goto L_0x00e4
            if (r4 == r8) goto L_0x0170
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e4:
            X.L62 r12 = r0.A04
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r13 = r0.A03
            boolean r14 = X.C71106Ock.A01()
            X.GPJ r15 = X.GPJ.A00
            com.instagram.common.session.UserSession r8 = r12.A01
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r3 = r13.A02
            java.lang.String r7 = r3.A04
            X.GPK r16 = X.GPK.NOTE_THREE_DOT
            java.lang.String r5 = r3.A06
            java.lang.String r4 = r3.A0A
            java.lang.String r3 = r13.A07
            r18 = r7
            r19 = r5
            r20 = r4
            r21 = r3
            r17 = r8
            r15.A04(r16, r17, r18, r19, r20, r21)
            if (r14 != 0) goto L_0x010f
            X.LAH r3 = r12.A02
            r3.A01 = r10
        L_0x010f:
            X.MED.A02(r0, r6, r11)
            java.lang.Object r1 = X.C63120Kro.A00(r9, r1, r6)
            if (r1 != r2) goto L_0x0038
            return r2
        L_0x0119:
            X.L62 r4 = r0.A04
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r5 = r0.A03
            X.GPJ r9 = X.GPJ.A00
            com.instagram.common.session.UserSession r11 = r4.A01
            X.0iw r4 = r4.A00
            java.lang.String r13 = r4.getModuleName()
            X.GPK r10 = X.GPK.NOTE_THREE_DOT
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r4 = r5.A02
            java.lang.String r7 = r4.A06
            java.lang.String r15 = r5.A07
            java.lang.String r5 = r4.A05
            java.lang.Integer r4 = r4.A02
            r12 = r4
            r14 = r7
            r16 = r5
            r9.A03(r10, r11, r12, r13, r14, r15, r16)
            X.MED.A02(r1, r6, r8)
            X.1IW r6 = X.JTS.A0s(r6)
            com.instagram.common.session.UserSession r12 = r0.A02
            androidx.fragment.app.FragmentActivity r10 = r0.A00
            X.0iw r11 = r0.A01
            X.TpH r13 = X.C14068TpH.NOTE
            X.UzD r14 = X.C16677UzD.NOTE
            X.OcF r5 = X.ORV.A01(r10, r11, r12, r13, r14, r15)
            X.Kfe r4 = new X.Kfe
            r4.<init>(r3, r0, r6)
            r5.A07(r4)
            X.37D r0 = X.DbT.A0i(r10)
            X.7Pu r0 = X.C48943Emh.A00(r0)
            X.C71093OcF.A00(r0, r5)
            java.lang.Object r0 = r6.A0E()
            if (r0 != r2) goto L_0x0170
            return r2
        L_0x0169:
            java.lang.Object r1 = r6.A01
            X.04n r1 = (X.C586704n) r1
            X.0eS.A00(r4)
        L_0x0170:
            r2 = 8
            X.04l r0 = r1.A00
            r0.A03(r2)
            goto L_0x003f
        L_0x0179:
            com.instagram.common.session.UserSession r4 = r0.A02
            X.17i r5 = X.17h.A00(r4)
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r4 = r0.A03
            java.lang.String r4 = r4.A05
            com.instagram.user.model.User r4 = r5.A02(r4)
            if (r4 == 0) goto L_0x003f
            X.MED.A03(r6, r3)
            java.lang.Object r0 = A01(r1, r0, r4, r6)
            if (r0 != r2) goto L_0x003f
            return r2
        L_0x0193:
            X.MED r6 = new X.MED
            r6.<init>(r0, r5, r4)
            goto L_0x001c
        L_0x019a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder.A00(android.view.View, com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder, X.4D7):java.lang.Object");
    }
}
