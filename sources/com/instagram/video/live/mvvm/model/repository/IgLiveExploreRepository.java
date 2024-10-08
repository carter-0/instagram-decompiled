package com.instagram.video.live.mvvm.model.repository;

import X.02z;
import X.05G;
import X.0sn;
import X.106;
import X.10b;
import X.26G;
import X.26t;
import X.AnonymousClass0Ud;
import X.AnonymousClass7TF;
import X.C61077JwF;
import X.DbS;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgLiveExploreRepository {
    public boolean A00;
    public final UserSession A01;
    public final 26t A02;
    public final IgLiveExploreLiveApi A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDm] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (A00(r11, r3, r6, !r13) == r5) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.user.model.UpcomingEvent r11, X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r10 = this;
            r3 = 4
            boolean r0 = X.C66134MDm.A01(r3, r12)
            if (r0 == 0) goto L_0x00be
            r6 = r12
            X.MDm r6 = (X.C66134MDm) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00be
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 3
            r1 = 2
            r4 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r8) goto L_0x0031
            if (r0 == r1) goto L_0x0094
            if (r0 != r7) goto L_0x00c5
            java.lang.Object r1 = r6.A01
            X.0eS.A00(r2)
        L_0x002c:
            X.5sO r2 = X.C41845B3m.A0c(r1)
        L_0x0030:
            return r2
        L_0x0031:
            boolean r13 = r6.A05
            java.lang.Object r9 = r6.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r6.A02
            com.instagram.user.model.UpcomingEvent r11 = (com.instagram.user.model.UpcomingEvent) r11
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r3
            X.0eS.A00(r2)
            goto L_0x005d
        L_0x0043:
            X.0eS.A00(r2)
            java.lang.String r9 = r11.getId()
            if (r9 == 0) goto L_0x00cf
            r6.A01 = r10
            r6.A02 = r11
            r6.A03 = r9
            r6.A05 = r13
            r6.A00 = r8
            java.lang.Object r0 = A00(r11, r10, r6, r13)
            if (r0 == r5) goto L_0x00bd
            r3 = r10
        L_0x005d:
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi r0 = r3.A03
            r6.A01 = r3
            r6.A02 = r11
            r6.A03 = r4
            r6.A05 = r13
            r6.A00 = r1
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0qQ.A0B(r9, r8)
            if (r13 == 0) goto L_0x0091
            java.lang.String r1 = "upcoming_events/set_reminder/"
        L_0x0072:
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            r0 = 47
            java.lang.String r0 = X.002.A0S(r1, r9, r0)
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r1 = X.DbT.A0R(r4, r2, r1, r0, r8)
            r0 = 548510594(0x20b19b82, float:3.0087873E-19)
            java.lang.Object r2 = r1.A00(r0, r6)
            if (r2 != r5) goto L_0x00a1
            return r5
        L_0x0091:
            java.lang.String r1 = "upcoming_events/unset_reminder/"
            goto L_0x0072
        L_0x0094:
            boolean r13 = r6.A05
            java.lang.Object r11 = r6.A02
            com.instagram.user.model.UpcomingEvent r11 = (com.instagram.user.model.UpcomingEvent) r11
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r3
            X.0eS.A00(r2)
        L_0x00a1:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0030
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ca
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r1 = r2.A00
            r0 = r13 ^ 1
            r6.A01 = r1
            r6.A02 = r4
            r6.A00 = r7
            java.lang.Object r0 = A00(r11, r3, r6, r0)
            if (r0 != r5) goto L_0x002c
        L_0x00bd:
            return r5
        L_0x00be:
            X.MDm r6 = new X.MDm
            r6.<init>(r10, r12, r3)
            goto L_0x0015
        L_0x00c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ca:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A01(com.instagram.user.model.UpcomingEvent, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r10) {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = X.C66131MDj.A01(r5, r10)
            if (r0 == 0) goto L_0x009f
            r4 = r10
            X.MDj r4 = (X.C66131MDj) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r1) goto L_0x002b
            if (r0 == r8) goto L_0x0079
            if (r0 != r5) goto L_0x00a6
            X.0eS.A00(r2)
        L_0x0028:
            X.0gF r3 = X.C60340gF.A00
        L_0x002a:
            return r3
        L_0x002b:
            java.lang.Object r7 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r7 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r7
            X.0eS.A00(r2)
            goto L_0x0043
        L_0x0033:
            X.0eS.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi r0 = r9.A03
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r2 = r0.A00(r4, r1)
            if (r2 == r3) goto L_0x002a
            r7 = r9
        L_0x0043:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0096
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r6 = r2.A00
            X.CG0 r6 = (X.CG0) r6
            java.util.List r0 = r6.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0055:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r2.next()
            X.4gL r1 = (X.C270194gL) r1
            com.instagram.common.session.UserSession r0 = r7.A01
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r0)
            r0.A0G(r1)
            goto L_0x0055
        L_0x006b:
            X.05G r1 = r7.A05
            java.util.List r0 = r6.A00
            X.C51966G9m.A1P(r7, r6, r4, r8)
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L_0x0084
            return r3
        L_0x0079:
            java.lang.Object r6 = r4.A02
            X.CG0 r6 = (X.CG0) r6
            java.lang.Object r7 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r7 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r7
            X.0eS.A00(r2)
        L_0x0084:
            X.05G r2 = r7.A04
            java.util.List r1 = r6.A01
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x0096:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0028
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009f:
            X.MDj r4 = new X.MDj
            r4.<init>(r9, r10, r5)
            goto L_0x0015
        L_0x00a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A02(X.4D7):java.lang.Object");
    }

    public /* synthetic */ IgLiveExploreRepository(UserSession userSession) {
        IgLiveExploreLiveApi igLiveExploreLiveApi = new IgLiveExploreLiveApi(userSession);
        26t A002 = 26G.A00(userSession);
        AnonymousClass7TF.A1C(userSession, 1, A002);
        this.A01 = userSession;
        this.A03 = igLiveExploreLiveApi;
        this.A02 = A002;
        0sn r1 = 0sn.A00;
        02z A10 = DbS.A10(new C61077JwF((List) r1, true, (String) null, 4, (DefaultConstructorMarker) null, 18));
        this.A06 = A10;
        this.A09 = 10b.A03(A10);
        02z A012 = 106.A01(r1);
        this.A05 = A012;
        this.A08 = 10b.A03(A012);
        02z A013 = 106.A01(r1);
        this.A04 = A013;
        this.A07 = 10b.A03(A013);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDK, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.user.model.UpcomingEvent r12, com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            boolean r0 = r14 instanceof X.MDK
            if (r0 == 0) goto L_0x00b3
            r7 = r14
            X.MDK r7 = (X.MDK) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b3
            int r2 = r2 - r1
            r7.A01 = r2
        L_0x0012:
            java.lang.Object r1 = r7.A07
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A01
            r6 = 1
            if (r0 == 0) goto L_0x009e
            if (r0 != r6) goto L_0x00bd
            int r3 = r7.A00
            boolean r15 = r7.A06
            java.lang.Object r10 = r7.A05
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r0 = r7.A04
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r12 = r7.A03
            com.instagram.user.model.UpcomingEvent r12 = (com.instagram.user.model.UpcomingEvent) r12
            java.lang.Object r13 = r7.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r13 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r13
            X.0eS.A00(r1)
        L_0x0034:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r10.next()
            int r9 = r3 + 1
            if (r3 >= 0) goto L_0x004a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004a:
            com.instagram.user.model.UpcomingEvent r1 = (com.instagram.user.model.UpcomingEvent) r1
            java.lang.String r2 = r12.getId()
            java.lang.String r1 = r1.getId()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x009c
            X.Cwd r1 = new X.Cwd
            r1.<init>(r12)
            r1.A0E = r15
            com.instagram.user.model.UpcomingEvent r1 = r1.A00()
            java.util.ArrayList r2 = X.00k.A0U(r0)
            r2.remove(r3)
            r2.add(r3, r1)
            X.05G r11 = r13.A06
            java.lang.Object r1 = r11.getValue()
            X.JwF r1 = (X.C61077JwF) r1
            java.util.List r5 = X.00k.A0a(r2)
            boolean r4 = r1.A02
            java.lang.String r3 = r1.A01
            r2 = 18
            X.JwF r1 = new X.JwF
            r1.<init>((java.util.List) r5, (boolean) r4, (java.lang.String) r3, (int) r2)
            r7.A02 = r13
            r7.A03 = r12
            r7.A04 = r0
            r7.A05 = r10
            r7.A06 = r15
            r7.A00 = r9
            r7.A01 = r6
            java.lang.Object r1 = r11.emit(r1, r7)
            if (r1 == r8) goto L_0x00bc
            r3 = r9
            goto L_0x0034
        L_0x009c:
            r3 = r9
            goto L_0x0034
        L_0x009e:
            X.0eS.A00(r1)
            X.05G r0 = r13.A06
            java.lang.Object r0 = r0.getValue()
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            java.util.Iterator r10 = r0.iterator()
            goto L_0x0034
        L_0x00b3:
            X.MDK r7 = new X.MDK
            r7.<init>(r13, r14)
            goto L_0x0012
        L_0x00ba:
            X.0gF r8 = X.C60340gF.A00
        L_0x00bc:
            return r8
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A00(com.instagram.user.model.UpcomingEvent, com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r12) {
        /*
            r11 = this;
            r3 = 16
            boolean r0 = X.C66139MDr.A01(r3, r12)
            if (r0 == 0) goto L_0x00e4
            r9 = r12
            X.MDr r9 = (X.C66139MDr) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e4
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r9.A02
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r7 = 0
            r10 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r5) goto L_0x003f
            if (r0 != r10) goto L_0x00f0
            java.lang.Object r6 = r9.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r6 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r6
            X.0eS.A00(r1)
        L_0x002c:
            r6.A00 = r7
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0032:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x003c
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00eb
            r6.A00 = r7
        L_0x003c:
            X.0gF r8 = X.C60340gF.A00
        L_0x003e:
            return r8
        L_0x003f:
            java.lang.Object r6 = r9.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r6 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r6
            X.0eS.A00(r1)
            goto L_0x009d
        L_0x0047:
            X.0eS.A00(r1)
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x003c
            X.05G r2 = r11.A06
            java.lang.Object r0 = r2.getValue()
            X.JwF r0 = (X.C61077JwF) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x003c
            r11.A00 = r5
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi r1 = r11.A03
            java.lang.Object r0 = r2.getValue()
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.String r4 = r0.A01
            r9.A01 = r11
            r9.A00 = r5
            com.instagram.common.session.UserSession r0 = r1.A00
            r3 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "upcoming_events/get_event_chaining/"
            r2.A0A(r0)
            r0 = 3070(0xbfe, float:4.302E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "broadcast"
            r2.A9m(r1, r0)
            java.lang.Class<X.CG4> r1 = X.CG4.class
            java.lang.Class<X.D2s> r0 = X.C45719D2s.class
            r2.A0O(r3, r1, r0, r5)
            if (r4 == 0) goto L_0x008f
            java.lang.String r0 = "max_id"
            r2.A9m(r0, r4)
        L_0x008f:
            X.1OC r1 = r2.A0M()
            r0 = 1111151264(0x423ad2a0, float:46.70569)
            java.lang.Object r1 = r1.A00(r0, r9)
            if (r1 == r8) goto L_0x003e
            r6 = r11
        L_0x009d:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00db
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.CG4 r2 = (X.CG4) r2
            X.05G r5 = r6.A06
            java.lang.Object r0 = r5.getValue()
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x00f5
            java.util.List[] r0 = new java.util.List[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r4 = X.0Yv.A1F(r0)
            boolean r3 = r2.A02
            java.lang.String r2 = r2.A00
            r1 = 18
            X.JwF r0 = new X.JwF
            r0.<init>((java.util.List) r4, (boolean) r3, (java.lang.String) r2, (int) r1)
            r9.A01 = r6
            r9.A00 = r10
            java.lang.Object r0 = r5.emit(r0, r9)
            if (r0 != r8) goto L_0x002c
            return r8
        L_0x00db:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0032
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e4:
            X.MDr r9 = new X.MDr
            r9.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x00eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f5:
            java.lang.String r0 = "upcomingEvents"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A03(X.4D7):java.lang.Object");
    }
}
