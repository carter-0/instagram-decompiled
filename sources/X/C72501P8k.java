package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Map;

/* renamed from: X.P8k  reason: case insensitive filesystem */
public final class C72501P8k implements C332837Wo, AnonymousClass7X4, AnonymousClass7XP {
    public final Handler A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C327767Cc A03;
    public final AvatarReactionsRepository A04;
    public final AnonymousClass7UA A05;
    public final AnonymousClass7UF A06;
    public final AnonymousClass7UE A07;
    public final AnonymousClass7SE A08;
    public final AnonymousClass7UH A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final AnonymousClass0eK A0C;
    public final AnonymousClass0eK A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A00(0eO.A02, new C73897PlY(this, 6));

    private final void A01(2FW r16, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, boolean z2) {
        if (C69874Ntc.A00(this.A01.requireActivity(), this.A02, ((C333517Zg) C66580MXl.A0s(this.A0B)).C6l().AfV()) && z2) {
            2FW r5 = r16;
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str5;
            long j2 = j;
            if (z) {
                if (str != null) {
                    DRs(r5, C66580MXl.A0i(str7, str8), str9, str10, j2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (A03(r5, str7, str8, str9, str4, str10, str6, j2, true)) {
                A02(str7, true, str10);
                AnonymousClass7UA r0 = this.A05;
                r0.E27();
                this.A00.postDelayed(new PVN(r0), 3000);
            }
            AnonymousClass7SE r1 = this.A08;
            if (r1.A02 == null && !r1.A06) {
                r1.A06 = true;
            }
        }
    }

    public final void D9w() {
    }

    public final void DRi(2FW r13, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        String str5;
        String str6 = null;
        if (messageIdentifier != null) {
            str5 = messageIdentifier.A01;
            str6 = messageIdentifier.A00();
        } else {
            str5 = null;
        }
        A01(r13, str5, str6, str, str2, str3, str4, j, z, z2);
    }

    public final void DRs(2FW r12, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        String str3;
        String str4;
        String str5 = null;
        if (messageIdentifier != null) {
            str3 = messageIdentifier.A01;
            str4 = messageIdentifier.A00();
        } else {
            str3 = null;
            str4 = null;
        }
        A03(r12, str3, str4, str, (String) null, str2, (String) null, j, false);
        if (messageIdentifier != null) {
            str5 = messageIdentifier.A01;
        }
        A02(str5, false, str2);
    }

    public /* synthetic */ C72501P8k(Handler handler, AnonymousClass4DH r6, UserSession userSession, AnonymousClass7UA r8, AnonymousClass7UF r9, AnonymousClass7UE r10, AnonymousClass7SE r11, AnonymousClass7UH r12, AnonymousClass0eK r13, AnonymousClass0eK r14, AnonymousClass0eK r15, AnonymousClass0eK r16) {
        C327767Cc r3 = new C327767Cc(userSession);
        AvatarReactionsRepository A002 = C331867Sr.A00(userSession);
        0qQ.A0B(r6, 1);
        C51973G9u.A0r(3, handler, r8, r9);
        C51973G9u.A0s(6, r11, r12, r13);
        0qQ.A0B(r14, 9);
        0qQ.A0B(A002, 14);
        this.A01 = r6;
        this.A02 = userSession;
        this.A00 = handler;
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = r11;
        this.A09 = r12;
        this.A0B = r13;
        this.A0D = r14;
        this.A0A = r15;
        this.A0C = r16;
        this.A07 = r10;
        this.A03 = r3;
        this.A04 = A002;
    }

    private final C60957JuF A00(String str, String str2) {
        AnonymousClass0eK r4 = this.A0B;
        AnonymousClass7SD A0Z = C66581MXm.A0Z((C333517Zg) C66580MXl.A0s(r4));
        if (str2 == null) {
            return null;
        }
        if (this.A03.A00(A0Z.A0b, A0Z.A08, ((C333517Zg) C66580MXl.A0s(r4)).CXH(str))) {
            return this.A04.A02(str2);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            r8 = this;
            X.0eK r4 = r8.A0B
            X.7S7 r0 = X.C66582MXn.A0d(r4)
            X.3sy r1 = r0.B8S()
            r0 = 0
            if (r1 == 0) goto L_0x00ff
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A04(r1)
            if (r2 == 0) goto L_0x00ff
            com.instagram.common.session.UserSession r1 = r8.A02
            X.2Dm r1 = X.2L2.A00(r1)
            X.3su r7 = r1.BRz(r2, r9)
        L_0x001d:
            X.0eM r1 = r8.A0E
            java.lang.Object r6 = r1.getValue()
            X.7D5 r6 = (X.AnonymousClass7D5) r6
            X.7SD r1 = X.C66582MXn.A0X(r4)
            X.3t3 r1 = r1.A0P
            if (r1 == 0) goto L_0x00fc
            java.lang.String r3 = X.C300965yF.A07(r1)
        L_0x0031:
            java.lang.Object r1 = X.C66580MXl.A0s(r4)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7SD r1 = X.C66581MXm.A0Z(r1)
            X.3Tu r5 = r1.A0H
            com.instagram.common.session.UserSession r4 = r8.A02
            int r2 = r1.A08
            X.7Pi r1 = X.C331077Pk.A02
            boolean r1 = r1.A03(r4, r5)
            boolean r4 = X.AnonymousClass7FS.A01(r4, r2, r1)
            if (r7 == 0) goto L_0x0053
            X.7AG r1 = r7.A0Q
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = r1.A06
        L_0x0053:
            java.lang.String r2 = X.C63238Ktj.A00(r0)
            X.0wc r1 = r6.A00
            java.lang.String r0 = "direct_message_reaction_action"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0094
            if (r10 == 0) goto L_0x00f8
            X.Nln r0 = X.C69443Nln.ADD
        L_0x0069:
            X.C51965G9l.A19(r0, r1)
            java.lang.String r0 = "message_id"
            r1.AAJ(r0, r9)
            X.C66580MXl.A1K(r1, r3)
            if (r4 == 0) goto L_0x00f5
            X.Nlo r3 = X.C69444Nlo.MULTI
        L_0x0078:
            java.lang.String r0 = "type"
            r1.A8M(r3, r0)
            if (r11 == 0) goto L_0x0086
            int r0 = r11.hashCode()
            switch(r0) {
                case -1806278539: goto L_0x00ea;
                case -1108953844: goto L_0x00df;
                case -964777281: goto L_0x00d4;
                case -703760053: goto L_0x00d1;
                case 451915210: goto L_0x00c1;
                case 673059105: goto L_0x00b6;
                case 749856655: goto L_0x00ab;
                case 779098677: goto L_0x00a0;
                case 1583530440: goto L_0x0095;
                default: goto L_0x0086;
            }
        L_0x0086:
            r3 = 0
        L_0x0087:
            java.lang.String r0 = "source"
            r1.A8M(r3, r0)
            java.lang.String r0 = "media_source"
            r1.AAJ(r0, r2)
            r1.Cgf()
        L_0x0094:
            return
        L_0x0095:
            java.lang.String r0 = "action_menu"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.ACTION_MENU
            goto L_0x0087
        L_0x00a0:
            java.lang.String r0 = "double_tap"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.DOUBLE_TAP
            goto L_0x0087
        L_0x00ab:
            java.lang.String r0 = "emoji_tray"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.EMOJI_TRAY
            goto L_0x0087
        L_0x00b6:
            java.lang.String r0 = "quick_emoji_tray"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.QUICK_EMOJI_TRAY
            goto L_0x0087
        L_0x00c1:
            java.lang.String r0 = "overreact_tray"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x00ce
            X.NmY r3 = X.C69490NmY.MULTI_REACT_EMOJI_PICKER
            goto L_0x0087
        L_0x00ce:
            X.NmY r3 = X.C69490NmY.EMOJI_PICKER
            goto L_0x0087
        L_0x00d1:
            java.lang.String r0 = "heart_button"
            goto L_0x00e1
        L_0x00d4:
            java.lang.String r0 = "multi_react_pill"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.MULTI_REACT_PILL
            goto L_0x0087
        L_0x00df:
            java.lang.String r0 = "heart_button_with_nux"
        L_0x00e1:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.HEART_BUTTON
            goto L_0x0087
        L_0x00ea:
            java.lang.String r0 = "users_list"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0086
            X.NmY r3 = X.C69490NmY.USERS_LIST
            goto L_0x0087
        L_0x00f5:
            X.Nlo r3 = X.C69444Nlo.SINGLE
            goto L_0x0078
        L_0x00f8:
            X.Nln r0 = X.C69443Nln.REMOVE
            goto L_0x0069
        L_0x00fc:
            r3 = r0
            goto L_0x0031
        L_0x00ff:
            r7 = r0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72501P8k.A02(java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r6.equals(r3) == false) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A03(X.2FW r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, long r39, boolean r41) {
        /*
            r31 = this;
            r1 = r31
            X.0eK r0 = r1.A0A
            java.lang.Object r2 = X.C66580MXl.A0s(r0)
            com.instagram.direct.capabilities.Capabilities r2 = (com.instagram.direct.capabilities.Capabilities) r2
            r4 = 0
            X.0qQ.A0B(r2, r4)
            X.9Gx r0 = X.C376179Gx.REACTIONS
            boolean r0 = r2.A00(r0)
            r12 = 0
            if (r0 == 0) goto L_0x0042
            X.0eK r10 = r1.A0B
            java.lang.Object r0 = X.C66580MXl.A0s(r10)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3sy r7 = r0.AfV()
            java.lang.String r3 = "DirectThreadFragment.sendInlineLike"
            if (r7 == 0) goto L_0x0087
            r0 = r33
            if (r33 != 0) goto L_0x0043
            X.4DH r0 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            r1 = 2131960632(0x7f132338, float:1.9557938E38)
            java.lang.String r0 = "direct_unknown_error"
            X.C59689JTv.A01(r2, r0, r1, r4)
            java.lang.String r0 = "DirectMessage.id is null"
            X.0wb.A03(r0, r3)
        L_0x0042:
            return r12
        L_0x0043:
            boolean r2 = r7 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r2 == 0) goto L_0x008d
            X.7UE r3 = r1.A07
            java.lang.Object r2 = r3.get()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = X.C66580MXl.A0s(r10)
            X.7Zg r2 = (X.C333517Zg) r2
            boolean r2 = r2.CYZ(r0)
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r3.get()
            if (r2 == 0) goto L_0x021a
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.model.direct.DirectThreadKey r7 = X.C66581MXm.A0e(r2)
        L_0x0067:
            X.7UF r9 = r1.A06
            r9.A00()
            java.lang.String r3 = "DirectThreadFragment.sendLikeReaction"
            java.lang.Object r2 = X.C66580MXl.A0s(r10)
            X.7Zg r2 = (X.C333517Zg) r2
            X.7S7 r2 = r2.C6l()
            X.3sy r2 = r2.AfV()
            r11 = r38
            if (r2 != 0) goto L_0x00a7
            X.7UH r2 = r1.A09
            com.instagram.common.session.UserSession r0 = r1.A02
            X.C69964Nv4.A00(r0, r2, r11)
        L_0x0087:
            X.4DH r0 = r1.A01
            X.OPK.A01(r0, r3)
            return r12
        L_0x008d:
            boolean r2 = r7 instanceof com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = X.C66580MXl.A0s(r10)
            X.7Zg r2 = (X.C333517Zg) r2
            boolean r2 = r2.CXK(r0)
            if (r2 == 0) goto L_0x00a2
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = X.C66647MaG.A06(r7)
            goto L_0x0067
        L_0x00a2:
            com.instagram.model.direct.DirectThreadKey r7 = X.C66647MaG.A03(r7)
            goto L_0x0067
        L_0x00a7:
            java.lang.Object r2 = X.C66580MXl.A0s(r10)
            X.7Zg r2 = (X.C333517Zg) r2
            X.7SD r2 = X.C66581MXm.A0Z(r2)
            int r3 = r2.A08
            r2 = 29
            r6 = r35
            if (r3 != r2) goto L_0x00c5
            if (r35 == 0) goto L_0x00c5
            com.google.common.collect.ImmutableList r2 = X.C254853tA.A03
            java.lang.String r3 = "❤"
            boolean r2 = r6.equals(r3)
            if (r2 != 0) goto L_0x00c6
        L_0x00c5:
            r3 = r6
        L_0x00c6:
            java.lang.Object r2 = X.C66580MXl.A0s(r10)
            X.7Zg r2 = (X.C333517Zg) r2
            X.7LQ r13 = r2.Bjv(r0)
            r2 = 0
            if (r13 == 0) goto L_0x0217
            X.7SD r4 = r13.A0G
            if (r4 == 0) goto L_0x0217
            X.3t3 r12 = r4.A0P
        L_0x00d9:
            com.instagram.common.session.UserSession r8 = r1.A02
            X.0Tu r14 = X.0Tu.A05
            r4 = 2342156064353683117(0x20810288005406ad, double:4.059697228064136E-152)
            boolean r4 = X.182.A06(r14, r8, r4)
            r16 = r32
            r19 = r34
            r21 = r36
            r22 = r37
            r25 = r39
            r27 = r41
            if (r4 == 0) goto L_0x01c0
            if (r13 == 0) goto L_0x01c0
            if (r12 == 0) goto L_0x01c0
            X.7Zi r13 = X.C333527Zh.A00(r8)
            X.3sy r17 = X.C300965yF.A05(r12)
            X.0eK r4 = r1.A0C
            java.lang.Object r4 = r4.get()
            X.7L5 r4 = (X.AnonymousClass7L5) r4
            java.lang.String r23 = r4.A00()
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            X.7ZY r4 = r4.BSN()
            boolean r28 = r4.Cbq(r0)
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            X.7ZY r4 = r4.BSN()
            X.ODs r15 = r4.BS7(r0)
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            boolean r29 = r4.CXH(r0)
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            boolean r30 = r4.CXI(r0)
            X.JuF r14 = r1.A00(r0, r6)
            r24 = r11
            r20 = r3
            r18 = r0
            r13.ELt(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30)
        L_0x0149:
            int r1 = r0.length()
            r12 = 1
            if (r1 == 0) goto L_0x01ae
            if (r3 == 0) goto L_0x01ae
            X.GMD r5 = X.GNS.A00(r8)
            X.0qQ.A07(r5)
            java.lang.Object r1 = X.C66580MXl.A0s(r10)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S9 r1 = r1.AvL()
            X.7LQ r1 = r1.BSO(r0)
            if (r1 == 0) goto L_0x01ae
            java.lang.Object r1 = X.C66580MXl.A0s(r10)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S9 r1 = r1.AvL()
            X.7LQ r4 = r1.BSO(r0)
            r1 = 26
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.0qQ.A0C(r4, r1)
            java.util.ArrayList r6 = r4.A04()
            if (r41 == 0) goto L_0x01b9
            java.lang.Object r1 = X.C66580MXl.A0s(r10)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7SD r1 = X.C66581MXm.A0Z(r1)
            X.3Tu r4 = r1.A0H
            int r2 = r1.A08
            X.7Pi r1 = X.C331077Pk.A02
            boolean r1 = r1.A03(r8, r4)
            boolean r1 = X.AnonymousClass7FS.A01(r8, r2, r1)
            if (r1 == 0) goto L_0x01b4
            if (r6 == 0) goto L_0x01b4
            java.util.ArrayList r2 = X.00k.A0T(r3, r6)
        L_0x01a6:
            java.util.Map r1 = r5.A04
            r1.put(r0, r2)
            X.GMD.A00(r5)
        L_0x01ae:
            r1 = -1
            r0 = 0
            r9.A01(r0, r0, r1)
            return r12
        L_0x01b4:
            java.util.List r2 = X.AnonymousClass7TE.A1I(r3)
            goto L_0x01a6
        L_0x01b9:
            if (r6 == 0) goto L_0x01a6
            java.util.List r2 = X.00k.A0f(r6, r3)
            goto L_0x01a6
        L_0x01c0:
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            X.7Zj r13 = r4.BsD()
            X.0eK r4 = r1.A0C
            java.lang.Object r4 = r4.get()
            X.7L5 r4 = (X.AnonymousClass7L5) r4
            java.lang.String r23 = r4.A00()
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            X.7ZY r4 = r4.BSN()
            boolean r28 = r4.Cbq(r0)
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            X.7ZY r4 = r4.BSN()
            X.ODs r15 = r4.BS7(r0)
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            boolean r29 = r4.CXH(r0)
            java.lang.Object r4 = X.C66580MXl.A0s(r10)
            X.7Zg r4 = (X.C333517Zg) r4
            boolean r30 = r4.CXI(r0)
            X.JuF r14 = r1.A00(r0, r6)
            r24 = r11
            r20 = r3
            r18 = r0
            r17 = r7
            r13.ELt(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30)
            goto L_0x0149
        L_0x0217:
            r12 = r2
            goto L_0x00d9
        L_0x021a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72501P8k.A03(X.2FW, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean):boolean");
    }

    public final void DJ4() {
        String str;
        C70576OBy oBy = new C70576OBy(this.A02);
        AnonymousClass7S7 A0d = C66582MXn.A0d(this.A0B);
        int AdN = A0d.AdN();
        C254793t3 r0 = A0d.C6Q().A0P;
        if (r0 != null) {
            str = C66580MXl.A0x(r0);
        } else {
            str = null;
        }
        DbZ.A0R(oBy.A01).A0W("emoji_moderation_nux_rendered", "impression", "emoji_moderation_nux", "multi_react_overflow_menu", str, A0d.C6k(), (Map) null, AdN);
    }

    public final void DJ5() {
        String str;
        C70576OBy oBy = new C70576OBy(this.A02);
        AnonymousClass7S7 A0d = C66582MXn.A0d(this.A0B);
        int AdN = A0d.AdN();
        C254793t3 r0 = A0d.C6Q().A0P;
        if (r0 != null) {
            str = C66580MXl.A0x(r0);
        } else {
            str = null;
        }
        DbZ.A0R(oBy.A01).A0W("emoji_moderation_bottom_sheet_rendered", "tap", "emoji_moderation_nux", "multi_react_overflow_menu", str, A0d.C6k(), (Map) null, AdN);
    }

    public final void DRe(2FW r19, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        String str4;
        String str5;
        AnonymousClass0eK r5 = this.A0B;
        AnonymousClass7S7 C6l = ((C333517Zg) C66580MXl.A0s(r5)).C6l();
        AnonymousClass4DH r3 = this.A01;
        Context requireContext = r3.requireContext();
        UserSession userSession = this.A02;
        if (!C70104NxK.A00(r3.requireActivity(), requireContext, r3, userSession, C6l)) {
            String str6 = null;
            if (((AnonymousClass9HC) this.A0D.get()).A1X) {
                str4 = C71100Oca.A00(userSession, C66581MXm.A0Z((C333517Zg) C66580MXl.A0s(r5)).A08);
            } else {
                str4 = null;
            }
            MessageIdentifier messageIdentifier2 = messageIdentifier;
            if (messageIdentifier != null) {
                str5 = messageIdentifier2.A01;
                str6 = messageIdentifier2.A00();
            } else {
                str5 = null;
            }
            A01(r19, str5, str6, str4, NetInfoModule.CONNECTION_TYPE_NONE, str, str3, j, z, true);
        }
    }

    public final void DbX(2FW r1, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        DRs(r1, messageIdentifier, str, str2, j);
    }
}
