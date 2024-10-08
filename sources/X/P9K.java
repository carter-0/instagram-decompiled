package X;

import android.os.Bundle;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;

public final class P9K implements AnonymousClass7XE {
    public final AnonymousClass0eK A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass7SM A03;
    public final OT9 A04;
    public final C332257Ug A05;
    public final AnonymousClass0eK A06;
    public final C62320sa A07;

    public P9K(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7SM r4, OT9 ot9, C332257Ug r6, AnonymousClass0eK r7, AnonymousClass0eK r8, C62320sa r9) {
        0qQ.A0B(r2, 1);
        C51972G9s.A1E(r7, r8);
        this.A01 = r2;
        this.A02 = userSession;
        this.A05 = r6;
        this.A07 = r9;
        this.A03 = r4;
        this.A00 = r7;
        this.A06 = r8;
        this.A04 = ot9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (X.AnonymousClass7TF.A1Z(r9.A1A) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cpe(android.graphics.RectF r44, X.C74455PvA r45, com.instagram.model.direct.messageid.MessageIdentifier r46, java.util.List r47, java.util.List r48, boolean r49, boolean r50, boolean r51) {
        /*
            r43 = this;
            r0 = 0
            r2 = r46
            X.0qQ.A0B(r2, r0)
            r8 = r43
            X.0eK r7 = r8.A00
            X.7Zg r4 = X.C66580MXl.A0V(r7)
            X.9Gx r1 = X.C376179Gx.RAVEN_VISUAL_MESSAGING
            boolean r1 = r4.AH1(r1)
            if (r1 != 0) goto L_0x0025
            com.instagram.common.session.UserSession r1 = r8.A02
            X.2HN r1 = X.2HM.A00(r1)
            X.2HR r1 = r1.A0k
            boolean r1 = X.DbX.A1Z(r1)
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            X.0eK r1 = r8.A06
            java.lang.Object r9 = r1.get()
            X.9HC r9 = (X.AnonymousClass9HC) r9
            X.0sa r1 = r8.A07
            java.lang.Object r14 = r1.invoke()
            X.7Mn r14 = (X.C330377Mn) r14
            X.7S7 r13 = r4.C6l()
            X.3sy r3 = r13.AfV()
            java.lang.String r5 = "DirectThreadFragment.navigateToExpiringMediaViewerFragment"
            if (r3 != 0) goto L_0x0047
            X.4DH r0 = r8.A01
            X.OPK.A01(r0, r5)
            return
        L_0x0047:
            com.instagram.common.session.UserSession r6 = r8.A02
            X.7SD r1 = r13.C6Q()
            boolean r12 = X.C308556Us.A08(r6, r1)
            boolean r11 = r13.CYS()
            java.lang.String r2 = r2.A01
            boolean r1 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r10 = 0
            if (r1 == 0) goto L_0x0067
            X.7Zg r7 = X.C66580MXl.A0V(r7)
            X.7LQ r7 = r7.Bjv(r2)
            if (r7 == 0) goto L_0x0067
            r10 = 1
        L_0x0067:
            r27 = 0
            if (r11 != 0) goto L_0x00e2
            if (r10 != 0) goto L_0x00e2
            if (r12 != 0) goto L_0x00e2
            r41 = 1
            X.9Gx r7 = X.C376179Gx.ENABLE_VISUAL_MESSAGE_REPLY
            boolean r7 = r4.AH1(r7)
            if (r7 == 0) goto L_0x0083
            X.0eM r7 = r9.A1A
            boolean r7 = X.AnonymousClass7TF.A1Z(r7)
            r40 = 1
            if (r7 != 0) goto L_0x0085
        L_0x0083:
            r40 = 0
        L_0x0085:
            boolean r9 = X.C66647MaG.A0F(r3)
            r20 = 0
            java.lang.String r7 = "Required value was null."
            r15 = r44
            r16 = r45
            r23 = r47
            r22 = r48
            r25 = r49
            r26 = r50
            if (r9 == 0) goto L_0x0117
            X.OT9 r1 = r8.A04
            r4 = 1
            X.3su r1 = X.OT9.A00(r1, r2, r5, r4)
            if (r41 == 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00b8
            boolean r2 = r1.A1T()
            if (r2 != 0) goto L_0x00b8
            X.4ik r2 = r1.A0e
            if (r2 == 0) goto L_0x00b4
            X.1Xj r2 = r2.A05
            if (r2 != 0) goto L_0x00df
        L_0x00b4:
            X.7Qt r2 = r1.A0w
            if (r2 == 0) goto L_0x00df
        L_0x00b8:
            r28 = 0
        L_0x00ba:
            if (r40 == 0) goto L_0x00c0
            if (r28 == 0) goto L_0x00c0
            r27 = 1
        L_0x00c0:
            if (r51 == 0) goto L_0x00e5
            com.instagram.model.direct.DirectThreadKey r19 = X.C66647MaG.A03(r3)
            X.2Ep r18 = r13.Cms()
            if (r18 == 0) goto L_0x010d
            if (r1 == 0) goto L_0x00dc
            java.lang.String r21 = r1.A0f()
        L_0x00d2:
            r24 = r0
            r29 = r4
            r17 = r1
            r14.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x00dc:
            r21 = r20
            goto L_0x00d2
        L_0x00df:
            r28 = 1
            goto L_0x00ba
        L_0x00e2:
            r41 = 0
            goto L_0x0083
        L_0x00e5:
            if (r1 == 0) goto L_0x0024
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A03(r3)
            X.2Ep r8 = r13.Cms()
            if (r8 == 0) goto L_0x0112
            java.lang.String r11 = r1.A0f()
            X.0qQ.A0B(r2, r0)
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r1
            r9 = r2
            r10 = r20
            r12 = r10
            r13 = r10
            r14 = r0
            r15 = r25
            r16 = r26
            r17 = r27
            r18 = r28
            goto L_0x01cc
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0112:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0117:
            if (r1 == 0) goto L_0x01d7
            X.7LQ r5 = r4.Bjv(r2)
            if (r5 == 0) goto L_0x0129
            X.3su r1 = r5.A0e
            if (r1 == 0) goto L_0x0129
            java.lang.String r2 = r1.A0f()
            if (r2 != 0) goto L_0x0135
        L_0x0129:
            if (r47 == 0) goto L_0x0170
            java.lang.Object r1 = X.00k.A0J(r23)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel r1 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel) r1
            if (r1 == 0) goto L_0x0170
            java.lang.String r2 = r1.A04
        L_0x0135:
            if (r5 == 0) goto L_0x01a5
            X.3t0 r1 = r13.BN3()
            if (r1 == 0) goto L_0x01a0
            com.instagram.model.direct.DirectThreadKey r4 = X.AnonymousClass6W4.A01(r1)
            X.2Dm r3 = X.1bJ.A00(r6)
            X.3su r1 = r5.A0e
            X.0qQ.A07(r1)
            if (r51 == 0) goto L_0x0178
            X.3U9 r31 = r3.B33(r4)
            if (r31 == 0) goto L_0x0173
            r42 = 1
            r27 = r14
            r28 = r15
            r29 = r16
            r30 = r1
            r32 = r4
            r33 = r20
            r34 = r2
            r35 = r22
            r36 = r23
            r37 = r0
            r38 = r25
            r39 = r26
            r27.A02(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        L_0x0170:
            r2 = r20
            goto L_0x0135
        L_0x0173:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0178:
            X.3U9 r9 = r3.B33(r4)
            if (r9 == 0) goto L_0x019b
            X.0qQ.A0B(r4, r0)
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r1
            r10 = r4
            r11 = r20
            r12 = r2
            r13 = r11
            r14 = r11
            r15 = r0
            r16 = r25
            r17 = r26
            r18 = r40
            r19 = r41
            r20 = r0
            r5.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x019b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x01a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x01a5:
            java.util.List r12 = r13.C6O()
            java.lang.String r10 = r13.C6f()
            X.3t0 r1 = r13.BN3()
            if (r1 == 0) goto L_0x01b5
            r27 = 1
        L_0x01b5:
            if (r47 == 0) goto L_0x01d2
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r20
            r8 = r7
            r9 = r3
            r11 = r2
            r13 = r23
            r14 = r27
            r15 = r25
            r16 = r26
            r17 = r40
            r18 = r41
        L_0x01cc:
            r19 = r0
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x01d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x01d7:
            X.4DH r0 = r8.A01
            X.OPK.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9K.Cpe(android.graphics.RectF, X.PvA, com.instagram.model.direct.messageid.MessageIdentifier, java.util.List, java.util.List, boolean, boolean, boolean):void");
    }

    public final void E0y(MessageIdentifier messageIdentifier, long j) {
        boolean z;
        C332247Uf r1;
        this.A03.CLU();
        String A002 = messageIdentifier.A00();
        C333517Zg A0V = C66580MXl.A0V(this.A00);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A01.requireActivity());
        AnonymousClass7S7 C6l = A0V.C6l();
        C254793t3 CBU = C6l.CBU();
        if (CBU == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (!(CBU instanceof MsysThreadId) || !A0V.CYZ(messageIdentifier.A01) || (CBU = C6l.BN3()) != null) {
            UserSession userSession = this.A02;
            String str = messageIdentifier.A01;
            Long valueOf = Long.valueOf(j);
            ArrayList A013 = AnonymousClass48M.A01(C6l.BRZ());
            if (A002 != null) {
                z = A0V.CXH(A002);
            } else {
                z = false;
            }
            long longValue = valueOf.longValue();
            Bundle A0a = AnonymousClass7TE.A0a();
            OXL.A02(A0a, CBU, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID", str);
            A0a.putLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS", longValue);
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT", A002);
            A0a.putParcelableArrayList("DirectFragment.ARGUMENT_RECIPIENTS", AnonymousClass7TE.A1D(A013));
            A0a.putBoolean("is_instamadillo", z);
            DbU.A1D(A0a, userSession);
            DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = new DirectVisualMessageActionLogPriorityFragment();
            directVisualMessageActionLogPriorityFragment.setArguments(A0a);
            if (A012 != null) {
                C332257Ug r2 = this.A05;
                C332277Ui r0 = null;
                if ((r2 instanceof C332247Uf) && (r1 = (C332247Uf) r2) != null) {
                    r0 = r1.A02;
                }
                A012.A0P(r0);
                0qQ.A0A(directVisualMessageActionLogPriorityFragment);
                A012.A0J(directVisualMessageActionLogPriorityFragment);
                r2.Cyt();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void EFg(MessageIdentifier messageIdentifier) {
        C333517Zg A0V = C66580MXl.A0V(this.A00);
        if (A0V.AH1(C376179Gx.RAVEN_VISUAL_MESSAGING)) {
            OT9 ot9 = this.A04;
            UserSession userSession = this.A02;
            C254703su A002 = OT9.A00(ot9, messageIdentifier.A01, "DirectThreadFragment.reportBugForVisualMessage", true);
            if (A002 != null) {
                AnonymousClass2Ad r1 = (AnonymousClass2Ad) userSession.A01(AnonymousClass2Ad.class, new C69742Ae());
                AnonymousClass2Ep Cms = A0V.C6l().Cms();
                if (Cms != null) {
                    r1.A01 = Cms;
                    r1.A00 = A002;
                    AnonymousClass4DH r4 = this.A01;
                    FGP.A01(r4.requireActivity(), BugReportSource.DIRECT_VISUAL_MESSAGE_REPORT_FLOW, userSession, AnonymousClass7TE.A16(r4.requireContext(), 2131971293), AnonymousClass7TE.A16(r4.requireContext(), 2131954333));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
