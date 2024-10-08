package com.instagram.video.live.mvvm.viewmodel.optionsdialog;

import X.0qQ;
import X.0u9;
import X.1HR;
import X.2YL;
import X.AnonymousClass0iw;
import X.AnonymousClass0r6;
import X.AnonymousClass2f1;
import X.AnonymousClass4D7;
import X.C249513ju;
import X.C313666go;
import X.C313716gt;
import X.C313816h4;
import X.C339667jy;
import X.C51969G9p;
import X.C51973G9u;
import X.C51974G9v;
import X.C59720JVe;
import X.G9w;
import X.JTS;
import X.L7I;
import X.LES;
import X.LF6;
import X.M0X;
import X.MHK;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class IgLiveOptionsDialogViewModel extends 2YL {
    public L7I A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C339667jy A03;
    public final AnonymousClass2f1 A04;
    public final IgLiveFollowStatusApi A05;
    public final C313666go A06;
    public final M0X A07;
    public final LF6 A08;
    public final C313716gt A09;
    public final IgLiveCommentsRepository A0A;
    public final IgLiveModerationRepository A0B;
    public final IgLiveBroadcastInfoManager A0C;
    public final C313816h4 A0D;
    public final IgLiveHeartbeatManager A0E;
    public final LES A0F;
    public final C59720JVe A0G;
    public final C249513ju A0H;
    public final AnonymousClass0r6 A0I;

    public /* synthetic */ IgLiveOptionsDialogViewModel(AnonymousClass0iw r14, UserSession userSession, IgLiveFollowStatusApi igLiveFollowStatusApi, C313666go r17, L7I l7i, M0X m0x, LF6 lf6, C313716gt r21, IgLiveCommentsRepository igLiveCommentsRepository, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r25, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe) {
        C339667jy A002 = C339667jy.A03.A00(userSession);
        AnonymousClass2f1 A003 = AnonymousClass2f1.A00(userSession);
        0qQ.A0B(userSession, 1);
        IgLiveHeartbeatManager igLiveHeartbeatManager2 = igLiveHeartbeatManager;
        IgLiveCommentsRepository igLiveCommentsRepository2 = igLiveCommentsRepository;
        IgLiveBroadcastInfoManager igLiveBroadcastInfoManager2 = igLiveBroadcastInfoManager;
        C313666go r11 = r17;
        C51974G9v.A1S(r11, r14, igLiveCommentsRepository2, igLiveBroadcastInfoManager2, igLiveHeartbeatManager2);
        LES les2 = les;
        C59720JVe jVe2 = jVe;
        IgLiveModerationRepository igLiveModerationRepository2 = igLiveModerationRepository;
        C51973G9u.A0t(7, jVe2, igLiveModerationRepository2, les2);
        C313816h4 r7 = r25;
        LF6 lf62 = lf6;
        C51969G9p.A1P(r7, 10, lf62);
        0qQ.A0B(A002, 15);
        this.A02 = userSession;
        this.A06 = r11;
        this.A01 = r14;
        this.A0A = igLiveCommentsRepository2;
        this.A0C = igLiveBroadcastInfoManager2;
        this.A0E = igLiveHeartbeatManager2;
        this.A0G = jVe2;
        this.A0B = igLiveModerationRepository2;
        this.A0F = les2;
        this.A0D = r7;
        this.A05 = igLiveFollowStatusApi;
        this.A07 = m0x;
        this.A09 = r21;
        this.A08 = lf62;
        this.A03 = A002;
        this.A04 = A003;
        this.A00 = l7i;
        1HR A0w = G9w.A0w();
        this.A0H = A0w;
        this.A0I = 0u9.A04(A0w);
        JTS.A13(this, new MHK(this, (AnonymousClass4D7) null, 10), jVe2.A00);
    }

    public static Iterable A00(IgLiveOptionsDialogViewModel igLiveOptionsDialogViewModel) {
        return (Iterable) igLiveOptionsDialogViewModel.A0F.A0V.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r30 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (X.JTQ.A1T(r5, r28) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r26 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0099, code lost:
        if (r30 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b5, code lost:
        if ((r6 instanceof X.M0V) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d4, code lost:
        if ((r6 instanceof X.M0V) != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ec, code lost:
        if (r2.A04.A0N(r5) != com.instagram.user.model.FollowStatus.A06) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0104, code lost:
        if (r2.A04.A0N(r5) != com.instagram.user.model.FollowStatus.A05) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.user.model.User r25, X.MVW r26, java.lang.String r27, java.util.List r28, X.AnonymousClass4D7 r29, boolean r30) {
        /*
            r24 = this;
            r5 = r25
            java.lang.String r0 = r5.getId()
            r2 = r24
            com.instagram.common.session.UserSession r3 = r2.A02
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            r4 = 1
            r6 = r26
            if (r0 != 0) goto L_0x0129
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r0 = r2.A0E
            X.0Ud r1 = r0.A08
            java.lang.Object r0 = r1.getValue()
            X.Juh r0 = (X.C60985Juh) r0
            if (r0 == 0) goto L_0x0129
            boolean r0 = r0.A0D
            if (r0 != r4) goto L_0x0129
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r2.A0C
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x0126
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = r0.getId()
        L_0x0033:
            boolean r0 = X.DbV.A1Z(r5, r0)
            if (r0 != 0) goto L_0x0129
            java.lang.Object r0 = r1.getValue()
            X.Juh r0 = (X.C60985Juh) r0
            if (r0 == 0) goto L_0x004b
            java.util.Set r0 = r0.A09
            if (r0 == 0) goto L_0x004b
            boolean r0 = X.DbV.A1a(r5, r0)
            if (r0 != 0) goto L_0x0129
        L_0x004b:
            if (r30 == 0) goto L_0x004f
            if (r26 != 0) goto L_0x0129
        L_0x004f:
            r9 = 1
        L_0x0050:
            X.3ju r1 = r2.A0H
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 != 0) goto L_0x0063
            boolean r0 = r6 instanceof X.M0V
            if (r0 == 0) goto L_0x0063
            r8 = 1
            if (r30 == 0) goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            if (r9 == 0) goto L_0x006f
            r0 = r28
            boolean r0 = X.JTQ.A1T(r5, r0)
            r10 = 1
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r10 = 0
        L_0x0070:
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 == 0) goto L_0x0089
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r0 = r2.A0E
            X.Juh r0 = X.JTP.A0e(r0)
            if (r0 == 0) goto L_0x0089
            boolean r0 = r0.A0D
            if (r0 != r4) goto L_0x0089
            r11 = 1
            if (r26 == 0) goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r6 instanceof X.M0V
            if (r0 == 0) goto L_0x009b
            r13 = 1
            if (r30 == 0) goto L_0x009c
        L_0x009b:
            r13 = 0
        L_0x009c:
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 != 0) goto L_0x00b7
            X.4Cl r0 = r5.A03
            java.lang.Boolean r0 = r0.CXE()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r6 instanceof X.M0V
            r15 = 1
            if (r0 != 0) goto L_0x00b8
        L_0x00b7:
            r15 = 0
        L_0x00b8:
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 != 0) goto L_0x00d6
            X.4Cl r0 = r5.A03
            java.lang.Boolean r0 = r0.CXE()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d6
        L_0x00d0:
            boolean r0 = r6 instanceof X.M0V
            r16 = 1
            if (r0 == 0) goto L_0x00d8
        L_0x00d6:
            r16 = 0
        L_0x00d8:
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 != 0) goto L_0x00ee
            X.2f1 r0 = r2.A04
            com.instagram.user.model.FollowStatus r4 = r0.A0N(r5)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r20 = 1
            if (r4 == r0) goto L_0x00f0
        L_0x00ee:
            r20 = 0
        L_0x00f0:
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 != 0) goto L_0x0106
            X.2f1 r0 = r2.A04
            com.instagram.user.model.FollowStatus r2 = r0.A0N(r5)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            r21 = 1
            if (r2 == r0) goto L_0x0108
        L_0x0106:
            r21 = 0
        L_0x0108:
            r12 = 0
            X.KeM r4 = new X.KeM
            r7 = r27
            r14 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r22 = r12
            r23 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r29
            java.lang.Object r0 = r1.ELH(r4, r0)
            java.lang.Object r0 = X.JTP.A0l(r0)
            return r0
        L_0x0126:
            r0 = 0
            goto L_0x0033
        L_0x0129:
            r9 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel.A01(com.instagram.user.model.User, X.MVW, java.lang.String, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MDk, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ce, code lost:
        if (r6.contains(r11.getId()) != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e6, code lost:
        if (r1.A04.A0N(r11) != com.instagram.user.model.FollowStatus.A06) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01fe, code lost:
        if (r1.A04.A0N(r11) != com.instagram.user.model.FollowStatus.A05) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0212, code lost:
        if (r11.CPV() == false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        if (r6.contains(r11.getId()) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        if (r35 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
        if (r35 != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (r35 != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0154, code lost:
        if (r35 != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016c, code lost:
        if (r11.A03.BNL() != com.instagram.api.schemas.IGLiveModeratorStatus.ACTIVE) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017a, code lost:
        if ((r12 instanceof X.M0U) != false) goto L_0x017c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.user.model.User r31, X.MVW r32, java.lang.String r33, X.AnonymousClass4D7 r34, boolean r35) {
        /*
            r30 = this;
            r11 = r31
            r5 = 5
            r6 = r34
            boolean r0 = X.C66132MDk.A01(r5, r6)
            r1 = r30
            if (r0 == 0) goto L_0x0238
            r0 = r6
            X.MDk r0 = (X.C66132MDk) r0
            int r4 = r0.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0238
            int r4 = r4 - r3
            r0.A01 = r4
        L_0x001b:
            java.lang.Object r3 = r0.A04
            X.1Hj r4 = X.1Hj.A02
            int r2 = r0.A01
            r8 = 1
            if (r2 == 0) goto L_0x00b3
            if (r2 != r8) goto L_0x023f
            int r2 = r0.A00
            java.lang.Object r11 = r0.A03
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.Object r0 = r0.A02
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r0 = (com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel) r0
            X.0eS.A00(r3)
        L_0x0033:
            if (r2 == 0) goto L_0x00a9
            X.L7I r8 = r0.A00
            if (r8 == 0) goto L_0x00a9
            java.lang.String r10 = r11.getId()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r0.A0C
            X.0Ud r1 = r0.A06
            X.JvD r0 = X.JTO.A0r(r1)
            r6 = 0
            if (r0 == 0) goto L_0x00b1
            java.lang.String r9 = r0.A08
        L_0x004a:
            X.JvD r0 = X.JTO.A0r(r1)
            if (r0 == 0) goto L_0x00af
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x00af
            java.lang.String r7 = r0.getId()
        L_0x0058:
            X.JvD r0 = X.JTO.A0r(r1)
            if (r0 == 0) goto L_0x0060
            java.lang.String r6 = r0.A09
        L_0x0060:
            java.lang.String r5 = "comment_action_sheet"
            X.0wc r1 = r8.A01
            java.lang.String r0 = "ig_live_moderator_selection"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            r2 = 0
            if (r7 == 0) goto L_0x00ac
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r7)
            if (r0 == 0) goto L_0x00ac
            long r0 = r0.longValue()
        L_0x0078:
            X.JTS.A17(r4, r0)
            java.lang.String r0 = "add_as_moderator_impression"
            X.DbS.A1H(r4, r0)
            if (r9 == 0) goto L_0x0086
            long r2 = X.JTR.A0M(r9)
        L_0x0086:
            X.JTQ.A10(r4, r2)
            if (r6 != 0) goto L_0x008d
            java.lang.String r6 = "0"
        L_0x008d:
            X.C51965G9l.A1I(r4, r6)
            X.0iw r0 = r8.A00
            X.C51969G9p.A1A(r4, r0)
            X.JTP.A1G(r4)
            java.lang.String r0 = "method"
            r4.AAJ(r0, r5)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r10)
            java.lang.String r0 = "target_user_id"
            r4.A9F(r0, r1)
            r4.Cgf()
        L_0x00a9:
            X.0gF r4 = X.C60340gF.A00
        L_0x00ab:
            return r4
        L_0x00ac:
            r0 = 0
            goto L_0x0078
        L_0x00af:
            r7 = r6
            goto L_0x0058
        L_0x00b1:
            r9 = r6
            goto L_0x004a
        L_0x00b3:
            X.0eS.A00(r3)
            java.lang.String r2 = r11.getId()
            com.instagram.common.session.UserSession r3 = r1.A02
            boolean r2 = X.C51966G9m.A1W(r3, r2)
            if (r2 != 0) goto L_0x0101
            boolean r2 = r11.CPV()
            if (r2 != 0) goto L_0x0101
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r2 = r1.A0B
            X.0Ud r2 = r2.A09
            java.lang.Object r2 = r2.getValue()
            int r2 = X.AnonymousClass7TE.A0M(r2)
            if (r2 != 0) goto L_0x0101
            X.4Cl r2 = r11.A03
            com.instagram.api.schemas.IGLiveModeratorEligibilityType r5 = r2.BNK()
            com.instagram.api.schemas.IGLiveModeratorEligibilityType r2 = com.instagram.api.schemas.IGLiveModeratorEligibilityType.ELIGIBLE
            if (r5 != r2) goto L_0x0101
            java.lang.Iterable r2 = A00(r1)
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r5 = r2.iterator()
        L_0x00ec:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00f6
            X.DbY.A1W(r6, r5)
            goto L_0x00ec
        L_0x00f6:
            java.lang.String r2 = r11.getId()
            boolean r5 = r6.contains(r2)
            r2 = 1
            if (r5 == 0) goto L_0x0102
        L_0x0101:
            r2 = 0
        L_0x0102:
            X.3ju r9 = r1.A0H
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            r12 = r32
            r24 = r35
            if (r5 != 0) goto L_0x0119
            boolean r5 = r12 instanceof X.M0V
            if (r5 == 0) goto L_0x0119
            r14 = 1
            if (r35 == 0) goto L_0x011a
        L_0x0119:
            r14 = 0
        L_0x011a:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 != 0) goto L_0x012d
            boolean r5 = r11.CPV()
            if (r5 != 0) goto L_0x012d
            r15 = 1
            if (r35 == 0) goto L_0x012e
        L_0x012d:
            r15 = 0
        L_0x012e:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 != 0) goto L_0x0142
            boolean r5 = r11.CPV()
            if (r5 != 0) goto L_0x0142
            r18 = 1
            if (r35 == 0) goto L_0x0144
        L_0x0142:
            r18 = 0
        L_0x0144:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 == 0) goto L_0x0156
            boolean r5 = r12 instanceof X.M0V
            if (r5 == 0) goto L_0x0156
            r19 = 1
            if (r35 == 0) goto L_0x0158
        L_0x0156:
            r19 = 0
        L_0x0158:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 != 0) goto L_0x016e
            X.4Cl r5 = r11.A03
            com.instagram.api.schemas.IGLiveModeratorStatus r6 = r5.BNL()
            com.instagram.api.schemas.IGLiveModeratorStatus r5 = com.instagram.api.schemas.IGLiveModeratorStatus.ACTIVE
            r20 = 1
            if (r6 == r5) goto L_0x0170
        L_0x016e:
            r20 = 0
        L_0x0170:
            boolean r5 = r11.CPV()
            if (r5 != 0) goto L_0x017c
            boolean r5 = r12 instanceof X.M0U
            r23 = 1
            if (r5 == 0) goto L_0x017e
        L_0x017c:
            r23 = 0
        L_0x017e:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 != 0) goto L_0x01d0
            boolean r5 = r11.CPV()
            if (r5 != 0) goto L_0x01d0
            X.LES r6 = r1.A0F
            X.0Ud r5 = r6.A0h
            boolean r5 = X.JTR.A1a(r5)
            if (r5 != 0) goto L_0x01d0
            java.lang.Integer r7 = r11.A0M()
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r7 != r5) goto L_0x01d0
            X.4Cl r5 = r11.A03
            com.instagram.api.schemas.IGLiveModeratorStatus r7 = r5.BNL()
            com.instagram.api.schemas.IGLiveModeratorStatus r5 = com.instagram.api.schemas.IGLiveModeratorStatus.ACTIVE
            if (r7 == r5) goto L_0x01d0
            X.0Ud r5 = r6.A0V
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x01ba:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01c4
            X.DbY.A1W(r6, r5)
            goto L_0x01ba
        L_0x01c4:
            java.lang.String r5 = r11.getId()
            boolean r5 = r6.contains(r5)
            r25 = 1
            if (r5 == 0) goto L_0x01d2
        L_0x01d0:
            r25 = 0
        L_0x01d2:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 != 0) goto L_0x01e8
            X.2f1 r5 = r1.A04
            com.instagram.user.model.FollowStatus r6 = r5.A0N(r11)
            com.instagram.user.model.FollowStatus r5 = com.instagram.user.model.FollowStatus.A06
            r26 = 1
            if (r6 == r5) goto L_0x01ea
        L_0x01e8:
            r26 = 0
        L_0x01ea:
            java.lang.String r5 = r11.getId()
            boolean r5 = X.C51966G9m.A1W(r3, r5)
            if (r5 != 0) goto L_0x0200
            X.2f1 r5 = r1.A04
            com.instagram.user.model.FollowStatus r6 = r5.A0N(r11)
            com.instagram.user.model.FollowStatus r5 = com.instagram.user.model.FollowStatus.A05
            r27 = 1
            if (r6 == r5) goto L_0x0202
        L_0x0200:
            r27 = 0
        L_0x0202:
            java.lang.String r5 = r11.getId()
            boolean r3 = X.C51966G9m.A1W(r3, r5)
            if (r3 != 0) goto L_0x0214
            boolean r3 = r11.CPV()
            r29 = 1
            if (r3 != 0) goto L_0x0216
        L_0x0214:
            r29 = 0
        L_0x0216:
            r16 = 0
            X.KeM r10 = new X.KeM
            r13 = r33
            r17 = r16
            r21 = r16
            r22 = r16
            r28 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A02 = r1
            r0.A03 = r11
            r0.A00 = r2
            r0.A01 = r8
            java.lang.Object r0 = r9.ELH(r10, r0)
            if (r0 == r4) goto L_0x00ab
            r0 = r1
            goto L_0x0033
        L_0x0238:
            X.MDk r0 = new X.MDk
            r0.<init>(r1, r6, r5)
            goto L_0x001b
        L_0x023f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel.A02(com.instagram.user.model.User, X.MVW, java.lang.String, X.4D7, boolean):java.lang.Object");
    }
}
