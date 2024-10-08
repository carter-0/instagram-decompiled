package com.instagram.video.live.mvvm.model.repository;

import X.02z;
import X.05D;
import X.05G;
import X.0Tu;
import X.0V1;
import X.0V2;
import X.0eS;
import X.0qQ;
import X.0u9;
import X.106;
import X.10D;
import X.10b;
import X.182;
import X.1HR;
import X.1aF;
import X.1aU;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0r6;
import X.AnonymousClass1aS;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C262204Co;
import X.C262224Cq;
import X.C2815758n;
import X.C313666go;
import X.C339667jy;
import X.C51970G9q;
import X.C61042Jvg;
import X.C61052Jvq;
import X.C61070Jw8;
import X.C61289K1a;
import X.C61770pa;
import X.C64462LcP;
import X.C66292MMb;
import X.DbS;
import X.DbW;
import X.DbX;
import X.G9w;
import X.JTQ;
import X.JTR;
import X.LKA;
import X.LKB;
import X.M0V;
import X.MAX;
import X.ME9;
import X.Y8P;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.requeststream.GraphQLSubscriptionRequestStub;
import com.instagram.realtimeclient.requeststream.IGGraphQLSubscriptionRequestStringStub;
import com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder;
import com.instagram.realtimeclient.requeststream.SubscriptionHandler;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class IgLiveCommentsRepository {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public SubscriptionHandler A05;
    public SubscriptionHandler A06;
    public String A07;
    public List A08;
    public boolean A09;
    public final UserSession A0A;
    public final Set A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(C66292MMb.A01(this, 4));
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;
    public final AnonymousClass0r6 A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final C61770pa A0I;
    public final AnonymousClass0Ud A0J;
    public final AnonymousClass0Ud A0K;
    public final AnonymousClass0Ud A0L;
    public final AnonymousClass1aS A0M;
    public final 1aU A0N;
    public final IgLiveCommentsApi A0O;
    public final C313666go A0P;
    public final IgLiveBroadcastInfoManager A0Q;
    public final Comparator A0R;
    public final List A0S;
    public final Set A0T;
    public final 0V2 A0U;
    public final 0V2 A0V;
    public final 05G A0W;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C61289K1a r6, com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 2
            boolean r0 = X.C66131MDj.A01(r3, r8)
            if (r0 == 0) goto L_0x004f
            r5 = r8
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r3) goto L_0x0058
            java.lang.Object r2 = r5.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r7 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r7
            X.0eS.A00(r1)
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r2.next()
            X.3ju r0 = r7.A0D
            X.C51966G9m.A1P(r7, r2, r5, r3)
            java.lang.Object r0 = r0.ELH(r1, r5)
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x0041:
            X.0eS.A00(r1)
            java.util.List r0 = r6.A07
            java.util.List r0 = X.JTQ.A0j(r0)
            java.util.Iterator r2 = r0.iterator()
            goto L_0x002b
        L_0x004f:
            X.MDj r5 = new X.MDj
            r5.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0055:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A01(X.K1a, com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.4D7, X.MDm] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r10, java.util.List r11, X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r3 = 2
            boolean r0 = X.C66134MDm.A01(r3, r12)
            if (r0 == 0) goto L_0x00c0
            r7 = r12
            X.MDm r7 = (X.C66134MDm) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c0
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r7.A04
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            r5 = 3
            if (r0 == 0) goto L_0x0068
            if (r0 != r6) goto L_0x00ca
            boolean r13 = r7.A05
            java.lang.Object r3 = r7.A03
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r7.A02
            java.lang.Object r10 = r7.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r10 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r10
            X.0eS.A00(r1)
        L_0x0030:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r2 = r3.next()
            X.M0U r2 = (X.M0U) r2
            X.KiH r1 = r2.BNP()
            X.KiH r0 = X.C62584KiH.A0L
            if (r1 != r0) goto L_0x004d
            com.instagram.user.model.User r1 = r2.A04
            if (r1 == 0) goto L_0x004d
            java.util.Set r0 = r10.A0T
            r0.add(r1)
        L_0x004d:
            if (r13 == 0) goto L_0x0055
            java.util.List r0 = r10.A0S
            r0.add(r2)
            goto L_0x0030
        L_0x0055:
            X.0V2 r0 = r10.A0U
            r7.A01 = r10
            r7.A02 = r4
            r7.A03 = r3
            r7.A05 = r13
            r7.A00 = r6
            java.lang.Object r0 = r0.emit(r2, r7)
            if (r0 != r8) goto L_0x0030
            return r8
        L_0x0068:
            java.util.ArrayList r4 = X.JTQ.A0e(r1)
            java.util.Iterator r9 = r11.iterator()
        L_0x0070:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r3 = r9.next()
            r2 = r3
            X.M0U r2 = (X.M0U) r2
            X.KiH r0 = r2.BNP()
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x00a0
            r0 = 4
            if (r1 == r0) goto L_0x00a0
            r0 = 12
            if (r1 == r0) goto L_0x00af
            r0 = 13
            if (r1 == r0) goto L_0x0099
            r0 = 0
            if (r1 == r0) goto L_0x0070
        L_0x0095:
            r4.add(r3)
            goto L_0x0070
        L_0x0099:
            X.6go r1 = r10.A0P
            X.6go r0 = X.C313666go.VIEWER
            if (r1 != r0) goto L_0x0070
            goto L_0x0095
        L_0x00a0:
            com.instagram.user.model.User r2 = r2.A04
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r10.A0A
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            goto L_0x00b7
        L_0x00af:
            java.util.Set r1 = r10.A0T
            com.instagram.user.model.User r0 = r2.A04
            boolean r0 = X.00k.A0u(r1, r0)
        L_0x00b7:
            if (r0 != 0) goto L_0x0070
            goto L_0x0095
        L_0x00ba:
            java.util.Iterator r3 = r4.iterator()
            goto L_0x0030
        L_0x00c0:
            X.MDm r7 = new X.MDm
            r7.<init>(r10, r12, r3)
            goto L_0x0015
        L_0x00c7:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A02(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDm] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.M0V r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r6 = 3
            boolean r0 = X.C66134MDm.A01(r6, r12)
            if (r0 == 0) goto L_0x0097
            r5 = r12
            X.MDm r5 = (X.C66134MDm) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0097
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r8 = 2
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 == r7) goto L_0x002a
            if (r0 == r8) goto L_0x002a
            if (r0 != r6) goto L_0x009e
            X.0eS.A00(r1)
        L_0x0029:
            return r1
        L_0x002a:
            boolean r2 = r5.A05
            java.lang.Object r10 = r5.A03
            X.M0V r10 = (X.M0V) r10
            java.lang.Object r11 = r5.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r8 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r8
            X.0eS.A00(r1)
            goto L_0x0068
        L_0x003c:
            X.0eS.A00(r1)
            java.lang.Boolean r0 = r10.A09
            if (r0 == 0) goto L_0x0094
            boolean r2 = r0.booleanValue()
        L_0x0047:
            X.3pr r1 = r10.A07
            X.3pr r0 = X.C252883pr.Success
            if (r1 != r0) goto L_0x00bb
            java.lang.String r1 = r10.getPk()
            if (r1 == 0) goto L_0x00ab
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r9.A0O
            r5.A01 = r9
            r5.A02 = r11
            r5.A03 = r10
            r5.A05 = r2
            if (r2 == 0) goto L_0x0089
            r5.A00 = r7
            java.lang.Object r1 = r0.A02(r11, r1, r5)
            if (r1 == r4) goto L_0x0085
            r8 = r9
        L_0x0068:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b5
            java.lang.Boolean r0 = r10.A09
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.booleanValue()
        L_0x0074:
            if (r2 == r0) goto L_0x00a3
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A03 = r0
            r5.A00 = r6
            java.lang.Object r1 = r8.A0C(r10, r11, r5)
            if (r1 != r4) goto L_0x0029
        L_0x0085:
            return r4
        L_0x0086:
            boolean r0 = r10.A0F
            goto L_0x0074
        L_0x0089:
            r5.A00 = r8
            java.lang.Object r1 = r0.A03(r11, r1, r5)
            if (r1 == r4) goto L_0x0085
            r8 = r9
            r2 = 0
            goto L_0x0068
        L_0x0094:
            boolean r2 = r10.A0F
            goto L_0x0047
        L_0x0097:
            X.MDm r5 = new X.MDm
            r5.<init>(r9, r12, r6)
            goto L_0x0015
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a3:
            r0 = 19
            X.Jvg r1 = new X.Jvg
            r1.<init>((boolean) r7, (boolean) r2, (int) r0)
            return r1
        L_0x00ab:
            r1 = r2 ^ 1
            r0 = 19
            X.Jvg r4 = new X.Jvg
            r4.<init>((boolean) r3, (boolean) r1, (int) r0)
            return r4
        L_0x00b5:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c3
            r2 = r2 ^ 1
        L_0x00bb:
            r0 = 19
            X.Jvg r4 = new X.Jvg
            r4.<init>((boolean) r3, (boolean) r2, (int) r0)
            return r4
        L_0x00c3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0C(X.M0V, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.M0V r12, java.lang.String r13, X.AnonymousClass4D7 r14, long r15) {
        /*
            r11 = this;
            r3 = 0
            boolean r0 = X.C66131MDj.A01(r3, r14)
            if (r0 == 0) goto L_0x0067
            r8 = r14
            X.MDj r8 = (X.C66131MDj) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0015:
            java.lang.Object r5 = r8.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r4 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r4) goto L_0x0080
            java.lang.Object r1 = r8.A02
            java.lang.Object r2 = r8.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r2 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r2
            X.0eS.A00(r5)
        L_0x0029:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003c
            X.3Ih r5 = X.JTT.A0j(r4)
        L_0x0033:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006d
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            return r0
        L_0x003c:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0033
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0045:
            X.0eS.A00(r5)
            X.0Ud r0 = r11.A0L
            java.lang.Object r1 = r0.getValue()
            X.05G r0 = r11.A0H
            r0.Epw(r12)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r5 = r11.A0O
            java.lang.String r6 = r12.getPk()
            X.C51966G9m.A1P(r11, r1, r8, r4)
            r7 = r13
            r9 = r15
            java.lang.Object r5 = r5.A05(r6, r7, r8, r9)
            if (r5 != r2) goto L_0x0065
            return r2
        L_0x0065:
            r2 = r11
            goto L_0x0029
        L_0x0067:
            X.MDj r8 = new X.MDj
            r8.<init>(r11, r14, r3)
            goto L_0x0015
        L_0x006d:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007b
            X.05G r0 = r2.A0H
            r0.Epw(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x007b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0D(X.M0V, java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(X.M0V r12, java.lang.String r13, X.AnonymousClass4D7 r14, long r15) {
        /*
            r11 = this;
            r3 = 1
            boolean r0 = X.C66131MDj.A01(r3, r14)
            if (r0 == 0) goto L_0x0070
            r8 = r14
            X.MDj r8 = (X.C66131MDj) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0015:
            java.lang.Object r5 = r8.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0044
            if (r0 != r3) goto L_0x0089
            java.lang.Object r2 = r8.A02
            java.lang.Object r1 = r8.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r1
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003b
            X.3Ih r5 = X.JTT.A0j(r3)
        L_0x0032:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0076
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            return r0
        L_0x003b:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0032
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0044:
            X.0eS.A00(r5)
            X.0Ud r0 = r11.A0L
            java.lang.Object r2 = r0.getValue()
            if (r12 == r2) goto L_0x0056
            java.lang.String r1 = "live_comments"
            java.lang.String r0 = "Tried to unpin not currently pinned comment."
            X.0wb.A03(r1, r0)
        L_0x0056:
            X.05G r1 = r11.A0H
            r0 = 0
            r1.Epw(r0)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r5 = r11.A0O
            java.lang.String r6 = r12.getPk()
            X.C51966G9m.A1P(r11, r2, r8, r3)
            r7 = r13
            r9 = r15
            java.lang.Object r5 = r5.A06(r6, r7, r8, r9)
            if (r5 != r4) goto L_0x006e
            return r4
        L_0x006e:
            r1 = r11
            goto L_0x0028
        L_0x0070:
            X.MDj r8 = new X.MDj
            r8.<init>(r11, r14, r3)
            goto L_0x0015
        L_0x0076:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0084
            X.05G r0 = r1.A0H
            r0.Epw(r2)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x0084:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0E(X.M0V, java.lang.String, X.4D7, long):java.lang.Object");
    }

    public final void A0J(String str, C262224Cq r8) {
        0qQ.A0B(str, 1);
        if (this.A06 == null) {
            GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = new GraphQLSubscriptionRequestStub(new IGGraphQLSubscriptionRequestStringStub("ig_live_video_comment_create_subscribe", GraphQLSubscriptionID.IGLIVE_COMMENT_QUERY_ID), LKB.class);
            graphQLSubscriptionRequestStub.addQueryParameter(TraceFieldType.BroadcastId, str);
            this.A06 = ((IGRealtimeGraphQLObserverHolder) this.A0C.getValue()).subscribe(graphQLSubscriptionRequestStub, new C64462LcP(1, r8, this), (Y8P) null);
        }
        if (this.A05 == null) {
            GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub2 = new GraphQLSubscriptionRequestStub(new IGGraphQLSubscriptionRequestStringStub("live_comment_like_subscribe", GraphQLSubscriptionID.IGLIVE_COMMENT_LIKE_QUERY_ID), LKA.class);
            graphQLSubscriptionRequestStub2.addQueryParameter(TraceFieldType.BroadcastId, str);
            this.A05 = ((IGRealtimeGraphQLObserverHolder) this.A0C.getValue()).subscribe(graphQLSubscriptionRequestStub2, new C64462LcP(2, r8, this), (Y8P) null);
        }
    }

    public static IgLiveCommentsRepository A00(Object obj, ME9 me9) {
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) me9.A01;
        0eS.A00(obj);
        return igLiveCommentsRepository;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9, java.util.List r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r3 = 20
            boolean r0 = X.C66147MDz.A02(r3, r11)
            if (r0 == 0) goto L_0x007c
            r7 = r11
            X.MDz r7 = (X.C66147MDz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007c
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A04
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r6) goto L_0x0082
            java.lang.Object r2 = r7.A03
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r7.A02
            java.lang.Object r9 = r7.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r9
            X.0eS.A00(r1)
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r2.next()
            X.0V2 r0 = r9.A0U
            X.C66147MDz.A00(r9, r5, r2, r7, r6)
            java.lang.Object r0 = r0.emit(r1, r7)
            if (r0 != r8) goto L_0x002e
            return r8
        L_0x0044:
            java.util.ArrayList r5 = X.JTQ.A0e(r1)
            java.util.Iterator r4 = r10.iterator()
        L_0x004c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.M0T r0 = (X.M0T) r0
            com.instagram.user.model.User r2 = r0.A01
            if (r2 == 0) goto L_0x004c
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r9.A0A
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r2.equals(r0)
            X.DbV.A1U(r3, r5, r0)
            goto L_0x004c
        L_0x006d:
            if (r12 == 0) goto L_0x0077
            java.util.List r0 = r9.A0S
            r0.addAll(r5)
        L_0x0074:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0077:
            java.util.Iterator r2 = r5.iterator()
            goto L_0x002e
        L_0x007c:
            X.MDz r7 = new X.MDz
            r7.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A03(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.JUI, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r14, java.util.List r15, X.AnonymousClass4D7 r16, boolean r17, boolean r18) {
        /*
            r5 = r18
            r3 = 3
            r4 = r16
            boolean r0 = X.JUI.A01(r3, r4)
            if (r0 == 0) goto L_0x00e4
            r8 = r4
            X.JUI r8 = (X.JUI) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e4
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r8.A05
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x00ad
            if (r0 != r6) goto L_0x00ee
            boolean r5 = r8.A06
            java.lang.Object r3 = r8.A04
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.A03
            java.lang.Object r2 = r8.A02
            java.lang.Object r14 = r8.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r14 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r14
            X.0eS.A00(r1)
        L_0x0035:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r9 = r3.next()
            X.M0V r9 = (X.M0V) r9
            java.util.Set r0 = r14.A0B
            java.util.Iterator r13 = r0.iterator()
        L_0x0047:
            boolean r0 = r13.hasNext()
            r11 = 0
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r12 = r13.next()
            r10 = r12
            X.M0V r10 = (X.M0V) r10
            java.lang.String r0 = r9.A0C
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r9.A0C
            java.lang.String r0 = r10.getPk()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0047
        L_0x0065:
            X.M0V r12 = (X.M0V) r12
            if (r12 == 0) goto L_0x00a8
            com.instagram.user.model.User r0 = r12.A08
            if (r0 == 0) goto L_0x00a8
            java.lang.String r10 = r0.getUsername()
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 64
            r1.append(r0)
            r1.append(r10)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r9.A0D
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            r9.A0D = r0
        L_0x008a:
            if (r5 == 0) goto L_0x0092
            java.util.List r0 = r14.A0S
            r0.add(r9)
            goto L_0x0035
        L_0x0092:
            X.0V2 r0 = r14.A0U
            r8.A01 = r14
            r8.A02 = r2
            r8.A03 = r4
            r8.A04 = r3
            r8.A06 = r5
            r8.A00 = r6
            java.lang.Object r0 = r0.emit(r9, r8)
            if (r0 == r7) goto L_0x00ed
            r5 = 0
            goto L_0x0035
        L_0x00a8:
            r9.A0C = r11
            goto L_0x008a
        L_0x00ab:
            r12 = r11
            goto L_0x0065
        L_0x00ad:
            java.util.ArrayList r4 = X.JTQ.A0e(r1)
            java.util.Iterator r9 = r15.iterator()
        L_0x00b5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r3 = r9.next()
            r0 = r3
            X.M0V r0 = (X.M0V) r0
            if (r17 != 0) goto L_0x00d4
            com.instagram.user.model.User r2 = r0.A08
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r14.A0A
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x00b5
        L_0x00d4:
            r4.add(r3)
            goto L_0x00b5
        L_0x00d8:
            java.util.Set r0 = r14.A0B
            r0.addAll(r4)
            java.util.Iterator r3 = r4.iterator()
            r2 = r4
            goto L_0x0035
        L_0x00e4:
            X.JUI r8 = new X.JUI
            r8.<init>(r14, r4, r3)
            goto L_0x0019
        L_0x00eb:
            X.0gF r7 = X.C60340gF.A00
        L_0x00ed:
            return r7
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A04(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, java.util.List, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        r1 = X.JTQ.A0j(r9.A05);
        r15.A01 = r4;
        r15.A02 = r9;
        r15.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
        if (A02(r4, r1, r15, true) != r6) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        r0 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        if (r0 == null) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
        r1 = (java.util.List) r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0144, code lost:
        if (r1 == null) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        r15.A01 = r4;
        r15.A02 = r9;
        r15.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0151, code lost:
        if (A03(r4, r1, r15, true) != r6) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015c, code lost:
        java.util.Collections.sort(r4.A0S, r4.A0R);
        r15.A01 = r4;
        r15.A02 = r9;
        r15.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016e, code lost:
        if (A06(r4, r15) != r6) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0170, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0179, code lost:
        r0 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017b, code lost:
        if (r0 == null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017d, code lost:
        A09(r0, r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0180, code lost:
        r15.A01 = r4;
        r15.A02 = null;
        r15.A00 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018c, code lost:
        if (A01(r9, r4, r15) != r6) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018f, code lost:
        r1 = (X.M0V) r4.A0H.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0197, code lost:
        if (r1 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0199, code lost:
        A09(r1, r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ab, code lost:
        X.JTR.A1V(r4.A0W);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b2, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r21, X.AnonymousClass4D7 r22) {
        /*
            r4 = r21
            r3 = 47
            r5 = r22
            boolean r0 = X.ME9.A03(r3, r5)
            if (r0 == 0) goto L_0x0029
            r15 = r5
            X.ME9 r15 = (X.ME9) r15
            int r2 = r15.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r15.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r15.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x006a;
                case 2: goto L_0x0118;
                case 3: goto L_0x0134;
                case 4: goto L_0x0154;
                case 5: goto L_0x0171;
                case 6: goto L_0x01a7;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0029:
            X.ME9 r15 = X.ME9.A00(r4, r5, r3)
            goto L_0x001a
        L_0x002e:
            X.0eS.A00(r1)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r4.A0Q
            X.0Ud r1 = r0.A06
            X.JvD r0 = X.JTO.A0r(r1)
            if (r0 == 0) goto L_0x01b0
            java.lang.String r11 = r0.A08
            if (r11 == 0) goto L_0x01b0
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r10 = r4.A0O
            X.JvD r0 = X.JTO.A0r(r1)
            if (r0 == 0) goto L_0x0068
            java.lang.String r12 = r0.A0A
        L_0x0049:
            long r7 = r4.A02
            java.lang.String r13 = r4.A07
            long r2 = r4.A03
            int r9 = r4.A00
            long r0 = r4.A04
            java.util.List r14 = r4.A08
            r15.A01 = r4
            r15.A00 = r5
            r17 = r7
            r19 = r2
            r21 = r0
            r16 = r9
            java.lang.Object r1 = r10.A01(r11, r12, r13, r14, r15, r16, r17, r19, r21)
            if (r1 != r6) goto L_0x006e
            return r6
        L_0x0068:
            r12 = 0
            goto L_0x0049
        L_0x006a:
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = A00(r1, r15)
        L_0x006e:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x019e
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r9 = r1.A00
            X.K1a r9 = (X.C61289K1a) r9
            boolean r3 = r9.A08
            boolean r0 = r9.A09
            r2 = r0 ^ 1
            X.05G r1 = r4.A0G
            r0 = 18
            X.C61042Jvg.A00(r1, r0, r3, r2)
            long r7 = r4.A02
            java.util.List r0 = r9.A04
            java.util.List r0 = X.JTQ.A0j(r0)
            r2 = 0
            java.util.Iterator r12 = r0.iterator()
        L_0x0095:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r12.next()
            X.MVW r1 = (X.MVW) r1
            long r10 = r1.AsD()
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            long r2 = r1.AsD()
            goto L_0x0095
        L_0x00ae:
            java.util.List r0 = r9.A05
            java.util.List r10 = X.JTQ.A0j(r0)
            r0 = 0
            java.util.Iterator r14 = r10.iterator()
        L_0x00ba:
            boolean r10 = r14.hasNext()
            if (r10 == 0) goto L_0x00d3
            java.lang.Object r13 = r14.next()
            X.MVW r13 = (X.MVW) r13
            long r11 = r13.AsD()
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ba
            long r0 = r13.AsD()
            goto L_0x00ba
        L_0x00d3:
            long r0 = java.lang.Math.max(r2, r0)
            long r0 = java.lang.Math.max(r7, r0)
            r4.A02 = r0
            X.Jw8 r0 = r9.A01
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r0.A03
        L_0x00e3:
            r4.A07 = r0
            X.K1Z r2 = r9.A02
            if (r2 == 0) goto L_0x00f1
            long r0 = r2.A02
            r4.A03 = r0
            int r0 = r2.A00
            r4.A00 = r0
        L_0x00f1:
            int r0 = r9.A00
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.A01 = r0
            r4.A08(r9)
            java.util.List r0 = r9.A04
            java.util.List r2 = X.JTQ.A0j(r0)
            X.05G r0 = r4.A0W
            boolean r1 = X.DbX.A1b(r0)
            r15.A01 = r4
            r15.A02 = r9
            r0 = 2
            r15.A00 = r0
            java.lang.Object r0 = A04(r4, r2, r15, r1, r5)
            if (r0 != r6) goto L_0x0120
            return r6
        L_0x0116:
            r0 = 0
            goto L_0x00e3
        L_0x0118:
            java.lang.Object r9 = r15.A02
            X.K1a r9 = (X.C61289K1a) r9
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = A00(r1, r15)
        L_0x0120:
            java.util.List r0 = r9.A05
            java.util.List r1 = X.JTQ.A0j(r0)
            r15.A01 = r4
            r15.A02 = r9
            r0 = 3
            r15.A00 = r0
            java.lang.Object r0 = A02(r4, r1, r15, r5)
            if (r0 != r6) goto L_0x013c
            return r6
        L_0x0134:
            java.lang.Object r9 = r15.A02
            X.K1a r9 = (X.C61289K1a) r9
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = A00(r1, r15)
        L_0x013c:
            X.Jw8 r0 = r9.A01
            if (r0 == 0) goto L_0x015c
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x015c
            r15.A01 = r4
            r15.A02 = r9
            r0 = 4
            r15.A00 = r0
            java.lang.Object r0 = A03(r4, r1, r15, r5)
            if (r0 != r6) goto L_0x015c
            return r6
        L_0x0154:
            java.lang.Object r9 = r15.A02
            X.K1a r9 = (X.C61289K1a) r9
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = A00(r1, r15)
        L_0x015c:
            java.util.List r1 = r4.A0S
            java.util.Comparator r0 = r4.A0R
            java.util.Collections.sort(r1, r0)
            r15.A01 = r4
            r15.A02 = r9
            r0 = 5
            r15.A00 = r0
            java.lang.Object r0 = A06(r4, r15)
            if (r0 != r6) goto L_0x0179
            return r6
        L_0x0171:
            java.lang.Object r9 = r15.A02
            X.K1a r9 = (X.C61289K1a) r9
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = A00(r1, r15)
        L_0x0179:
            X.M0V r0 = r9.A03
            if (r0 == 0) goto L_0x018f
            A09(r0, r4, r5)
        L_0x0180:
            r15.A01 = r4
            r0 = 0
            r15.A02 = r0
            r0 = 6
            r15.A00 = r0
            java.lang.Object r0 = A01(r9, r4, r15)
            if (r0 != r6) goto L_0x01ab
            return r6
        L_0x018f:
            X.05G r0 = r4.A0H
            java.lang.Object r1 = r0.getValue()
            X.M0V r1 = (X.M0V) r1
            if (r1 == 0) goto L_0x0180
            r0 = 0
            A09(r1, r4, r0)
            goto L_0x0180
        L_0x019e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01b0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a7:
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = A00(r1, r15)
        L_0x01ab:
            X.05G r0 = r4.A0W
            X.JTR.A1V(r0)
        L_0x01b0:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A05(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 49
            boolean r0 = X.ME9.A03(r3, r8)
            if (r0 == 0) goto L_0x0071
            r5 = r8
            X.ME9 r5 = (X.ME9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 == r3) goto L_0x0044
            if (r0 != r4) goto L_0x0076
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = A00(r1, r5)
        L_0x0028:
            java.util.List r1 = r7.A0S
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x007b
            java.util.Iterator r0 = r1.iterator()
            X.0V2 r2 = r7.A0U
            java.lang.Object r1 = r0.next()
            X.ME9.A01(r7, r0, r5, r3)
            java.lang.Object r1 = r2.emit(r1, r5)
            if (r1 != r6) goto L_0x004c
            return r6
        L_0x0044:
            java.lang.Object r0 = r5.A02
            java.util.Iterator r0 = (java.util.Iterator) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = A00(r1, r5)
        L_0x004c:
            r0.remove()
            X.05G r0 = r7.A0W
            boolean r0 = X.DbX.A1b(r0)
            if (r0 != 0) goto L_0x0028
            long r1 = r7.A01
            r5.A01 = r7
            r0 = 0
            r5.A02 = r0
            r5.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r5, r1)
            if (r0 != r6) goto L_0x0028
            return r6
        L_0x0067:
            X.0eS.A00(r1)
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x007e
            r7.A09 = r3
            goto L_0x0028
        L_0x0071:
            X.ME9 r5 = X.ME9.A00(r7, r8, r3)
            goto L_0x0016
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x007b:
            r0 = 0
            r7.A09 = r0
        L_0x007e:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A06(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, X.4D7):java.lang.Object");
    }

    public static final void A07(UserSession userSession, M0V m0v, IgLiveCommentsRepository igLiveCommentsRepository, HashMap hashMap, HashMap hashMap2, List list) {
        C61052Jvq jvq;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                M0V m0v2 = (M0V) it.next();
                User user = m0v2.A08;
                if (user != null) {
                    m0v2.A06 = C2815758n.A00(DbS.A0r(user.getId(), hashMap));
                    C61052Jvq jvq2 = (C61052Jvq) hashMap2.get(user.getId());
                    if (jvq2 != null) {
                        int i = jvq2.A00;
                        m0v2.A01 = i;
                        if (i >= DbS.A04(0Tu.A06, userSession, 36593684002702807L)) {
                            if (igLiveCommentsRepository.A0P == C313666go.BROADCASTER) {
                                if (!jvq2.A02) {
                                }
                            } else if (!182.A06(0Tu.A05, userSession, 36312209025926134L)) {
                            }
                            m0v2.A0H = true;
                        }
                    }
                }
            }
        }
        if (m0v != null && (jvq = m0v.A05) != null) {
            int i2 = jvq.A00;
            m0v.A01 = i2;
            m0v.A06 = (LiveUserPaySupportTier) jvq.A01;
            if (i2 >= DbS.A04(0Tu.A06, userSession, 36593684002702807L)) {
                if (igLiveCommentsRepository.A0P == C313666go.BROADCASTER) {
                    if (!jvq.A02) {
                        return;
                    }
                } else if (!182.A06(0Tu.A05, userSession, 36312209025926134L)) {
                    return;
                }
                m0v.A0H = true;
            }
        }
    }

    private final void A08(C61289K1a k1a) {
        C61070Jw8 jw8 = k1a.A01;
        if (jw8 != null) {
            UserSession userSession = this.A0A;
            List A0j = JTQ.A0j(k1a.A04);
            A07(userSession, k1a.A03, this, (HashMap) jw8.A01, (HashMap) jw8.A02, A0j);
        }
    }

    public static final void A09(M0V m0v, IgLiveCommentsRepository igLiveCommentsRepository, boolean z) {
        05G r2;
        if (z) {
            if (igLiveCommentsRepository.A0P.ordinal() == 0) {
                r2 = igLiveCommentsRepository.A0H;
                M0V m0v2 = (M0V) r2.getValue();
                if ((m0v2 == null || !2PP.A00(m0v.getPk(), m0v2.getPk()) || (2PP.A00(Integer.valueOf(m0v.A01), Integer.valueOf(m0v2.A01)) && 2PP.A00(m0v.A06, m0v2.A06))) && (!m0v.A0G || !DbX.A1b(igLiveCommentsRepository.A0W))) {
                    return;
                }
            } else {
                String pk = m0v.getPk();
                if (m0v.A07.A00() && !m0v.A0E && pk != null && !C339667jy.A03.A00(igLiveCommentsRepository.A0A).A00.getBoolean(pk, false)) {
                    r2 = igLiveCommentsRepository.A0H;
                } else {
                    return;
                }
            }
            r2.Epw(m0v);
            return;
        }
        05G r1 = igLiveCommentsRepository.A0H;
        if (0qQ.A0K(r1.getValue(), m0v)) {
            r1.Epw((Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.JV5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.JV5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: X.M0V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: X.JV5} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDO, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x015d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(com.instagram.api.schemas.LiveUserPaySupportTier r19, java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22, int r23, int r24, long r25, long r27, boolean r29, boolean r30) {
        /*
            r18 = this;
            r3 = r22
            r13 = r21
            r16 = r27
            r11 = r30
            boolean r0 = r3 instanceof X.MDO
            r4 = r18
            if (r0 == 0) goto L_0x0236
            r8 = r3
            X.MDO r8 = (X.MDO) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0236
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001c:
            java.lang.Object r3 = r8.A08
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r15 = 4
            r6 = 3
            r10 = 2
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005d
            if (r0 == r5) goto L_0x00b0
            if (r0 == r10) goto L_0x015e
            if (r0 == r6) goto L_0x01d2
            if (r0 != r15) goto L_0x023d
            java.lang.Object r1 = r8.A06
            java.lang.Object r12 = r8.A04
            X.JV5 r12 = (X.JV5) r12
            java.lang.Object r9 = r8.A03
            java.lang.Object r4 = r8.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r4
            X.0eS.A00(r3)
        L_0x0040:
            X.1aS r0 = r4.A0M
            r0.accept(r1)
            X.05G r1 = r4.A0H
            java.lang.Object r0 = r1.getValue()
            if (r0 != r9) goto L_0x0051
            r0 = 0
            r1.Epw(r0)
        L_0x0051:
            java.lang.Object r1 = r12.A03
            if (r1 == 0) goto L_0x005a
            java.util.Set r0 = r4.A0B
            r0.remove(r1)
        L_0x005a:
            X.0gF r7 = X.C60340gF.A00
        L_0x005c:
            return r7
        L_0x005d:
            X.0eS.A00(r3)
            X.M0V r9 = new X.M0V
            r9.<init>()
            r0 = r20
            r9.A0D = r0
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r4.A0A
            com.instagram.user.model.User r0 = r1.A01(r0)
            r9.A08 = r0
            long r0 = X.AnonymousClass7TG.A0I()
            r9.A03 = r0
            r0 = r25
            r9.A04 = r0
            r0 = r23
            r9.A00 = r0
            r0 = r19
            r9.A06 = r0
            r0 = r24
            r9.A01 = r0
            r0 = r29
            r9.A0H = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.JV5 r14 = new X.JV5
            r14.<init>((X.M0V) r9, (java.lang.Integer) r0)
            X.0V2 r3 = r4.A0V
            r8.A02 = r4
            r8.A03 = r13
            r8.A04 = r9
            r8.A05 = r14
            r8.A06 = r14
            r0 = r16
            r8.A01 = r0
            r8.A07 = r11
            r8.A00 = r5
            java.lang.Object r0 = r3.emit(r14, r8)
            if (r0 == r7) goto L_0x005c
            r12 = r14
            goto L_0x00c9
        L_0x00b0:
            boolean r11 = r8.A07
            long r0 = r8.A01
            r16 = r0
            java.lang.Object r14 = r8.A06
            java.lang.Object r12 = r8.A05
            X.JV5 r12 = (X.JV5) r12
            java.lang.Object r9 = r8.A04
            X.M0V r9 = (X.M0V) r9
            java.lang.Object r13 = r8.A03
            java.lang.Object r4 = r8.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r4
            X.0eS.A00(r3)
        L_0x00c9:
            X.1aS r0 = r4.A0M
            r0.accept(r14)
            java.lang.Object r1 = r12.A03
            if (r1 == 0) goto L_0x00d7
            java.util.Set r0 = r4.A0B
            r0.add(r1)
        L_0x00d7:
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r4.A0O
            r11 = r11 ^ 1
            r8.A02 = r4
            r8.A03 = r9
            r8.A04 = r12
            r8.A05 = r2
            r8.A06 = r2
            r8.A00 = r10
            com.instagram.common.session.UserSession r0 = r0.A00
            r3 = 0
            X.0qQ.A0B(r9, r5)
            X.0qQ.A0B(r13, r10)
            r14 = 0
            X.1NY r10 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r13}
            java.lang.String r0 = "live/%s/comment/"
            X.DbU.A1P(r10, r0, r1)
            java.lang.Class<X.K1R> r1 = X.K1R.class
            java.lang.Class<X.Hx2> r0 = X.C56351Hx2.class
            r10.A0O(r2, r1, r0, r5)
            java.lang.String r1 = r9.A0D
            java.lang.String r0 = "comment_text"
            r10.A9m(r0, r1)
            java.lang.String r1 = r9.A0C
            r0 = 5184(0x1440, float:7.264E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
            long r0 = X.AnonymousClass7TE.A0P(r16)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "offset_to_video_start"
            r10.A9m(r0, r1)
            java.lang.String r1 = r9.A0B
            java.lang.String r0 = "idempotence_token"
            r10.A9m(r0, r1)
            java.lang.String r0 = r9.A0D
            if (r0 == 0) goto L_0x0133
            int r14 = r0.length()
        L_0x0133:
            long r0 = r9.A04
            int r13 = r9.A00
            java.lang.String r1 = X.C11155SCk.A00(r0, r14, r13)
            r0 = 1916(0x77c, float:2.685E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9m(r0, r1)
            java.lang.String r1 = "live_or_vod"
            java.lang.String r0 = "1"
            r10.A9m(r1, r0)
            java.lang.String r0 = "force_create"
            r10.A0H(r0, r11)
            X.1OC r1 = X.DbT.A0U(r10, r5)
            r0 = 1410014610(0x540b1d92, float:2.38998625E12)
            java.lang.Object r3 = r1.A02(r8, r0, r6, r3)
            if (r3 != r7) goto L_0x016b
            return r7
        L_0x015e:
            java.lang.Object r12 = r8.A04
            X.JV5 r12 = (X.JV5) r12
            java.lang.Object r9 = r8.A03
            java.lang.Object r4 = r8.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r4
            X.0eS.A00(r3)
        L_0x016b:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01c9
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r10 = r3.A00
            X.K1R r10 = (X.K1R) r10
            X.M0V r11 = r10.A00
            if (r11 == 0) goto L_0x01a9
            java.util.List r13 = r4.A08
            java.lang.Object r3 = r12.A03
            X.M0V r3 = (X.M0V) r3
            if (r3 == 0) goto L_0x01c7
            java.lang.String r1 = r3.getPk()
        L_0x0187:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            int r13 = r13.indexOf(r1)
            r0 = -1
            if (r13 <= r0) goto L_0x019d
            java.lang.String r1 = r11.getPk()
            if (r1 == 0) goto L_0x019d
            java.util.List r0 = r4.A08
            r0.set(r13, r1)
        L_0x019d:
            if (r3 == 0) goto L_0x01a9
            long r0 = r11.A03
            r3.A03 = r0
            java.lang.String r0 = r11.getPk()
            r3.A0A = r0
        L_0x01a9:
            boolean r0 = r10.A01
            r12.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r12.A00 = r0
            X.0V2 r0 = r4.A0V
            r8.A02 = r4
            r8.A03 = r9
            r8.A04 = r12
            r8.A05 = r12
            r8.A06 = r12
            r8.A00 = r6
            java.lang.Object r0 = r0.emit(r12, r8)
            if (r0 == r7) goto L_0x005c
            r6 = r12
            goto L_0x01e1
        L_0x01c7:
            r1 = r2
            goto L_0x0187
        L_0x01c9:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01f9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01d2:
            java.lang.Object r12 = r8.A06
            java.lang.Object r6 = r8.A04
            X.JV5 r6 = (X.JV5) r6
            java.lang.Object r9 = r8.A03
            java.lang.Object r4 = r8.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r4 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r4
            X.0eS.A00(r3)
        L_0x01e1:
            X.1aS r0 = r4.A0M
            r0.accept(r12)
            java.lang.Object r1 = r6.A03
            if (r1 == 0) goto L_0x01f4
            java.util.Set r0 = r4.A0B
            boolean r0 = r0.add(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x01f4:
            X.3Ih r3 = X.C41845B3m.A0d(r2)
            r12 = r6
        L_0x01f9:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x005a
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0242
            X.4dm r1 = X.JTP.A0N(r3)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0234
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x0234
            java.lang.Object r0 = r1.A00
            X.K1R r0 = (X.K1R) r0
            if (r0 == 0) goto L_0x0234
            boolean r0 = r0.A01
            if (r0 != r5) goto L_0x0234
        L_0x0217:
            r12.A01 = r5
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r12.A00 = r0
            X.0V2 r0 = r4.A0V
            r8.A02 = r4
            r8.A03 = r9
            r8.A04 = r12
            r8.A05 = r12
            r8.A06 = r12
            r8.A00 = r15
            java.lang.Object r0 = r0.emit(r12, r8)
            if (r0 == r7) goto L_0x005c
            r1 = r12
            goto L_0x0040
        L_0x0234:
            r5 = 0
            goto L_0x0217
        L_0x0236:
            X.MDO r8 = new X.MDO
            r8.<init>(r4, r3)
            goto L_0x001c
        L_0x023d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0242:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0A(com.instagram.api.schemas.LiveUserPaySupportTier, java.lang.String, java.lang.String, X.4D7, int, int, long, long, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(X.M0V r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 46
            boolean r0 = X.ME9.A03(r3, r8)
            if (r0 == 0) goto L_0x0060
            r4 = r8
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r2) goto L_0x0073
            java.lang.Object r6 = r4.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r1 = A00(r3, r4)
        L_0x0027:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0046
            X.05G r1 = r1.A0H
            java.lang.Object r0 = r1.getValue()
            if (r0 != r6) goto L_0x0039
            r0 = 0
            r1.Epw(r0)
        L_0x0039:
            X.3Ih r3 = X.JTT.A0j(r2)
        L_0x003d:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0065
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0046:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004f:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r5.A0O
            X.ME9.A01(r5, r6, r4, r2)
            java.lang.Object r3 = r0.A00(r6, r7, r4)
            if (r3 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r1 = r5
            goto L_0x0027
        L_0x0060:
            X.ME9 r4 = X.ME9.A00(r5, r8, r3)
            goto L_0x0016
        L_0x0065:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006e
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x006e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0B(X.M0V, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 8
            boolean r0 = X.ME5.A03(r3, r8)
            if (r0 == 0) goto L_0x004e
            r4 = r8
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x0061
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0037
            X.3Ih r3 = X.JTT.A0j(r1)
        L_0x002e:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0037:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0040:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r5.A0O
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r7, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x004e:
            X.ME5 r4 = X.ME5.A01(r5, r8, r3)
            goto L_0x0016
        L_0x0053:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005c
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x005c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0F(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0G(java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r3 = 48
            r4 = r23
            boolean r0 = X.ME9.A03(r3, r4)
            r5 = r21
            if (r0 == 0) goto L_0x00ef
            r13 = r4
            X.ME9 r13 = (X.ME9) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ef
            int r2 = r2 - r1
            r13.A00 = r2
        L_0x001a:
            java.lang.Object r8 = r13.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r11 = 0
            r3 = 4
            r4 = 3
            r7 = 2
            r14 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 == r1) goto L_0x0050
            if (r0 == r7) goto L_0x00b2
            if (r0 == r4) goto L_0x00ca
            if (r0 != r3) goto L_0x00f5
            java.lang.Object r5 = r13.A02
            X.K1a r5 = (X.C61289K1a) r5
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r6 = A00(r8, r13)
        L_0x0038:
            X.M0V r0 = r5.A03
            if (r0 == 0) goto L_0x0042
            A09(r0, r6, r1)
        L_0x003f:
            X.0gF r2 = X.C60340gF.A00
        L_0x0041:
            return r2
        L_0x0042:
            X.05G r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.M0V r0 = (X.M0V) r0
            if (r0 == 0) goto L_0x003f
            A09(r0, r6, r14)
            goto L_0x003f
        L_0x0050:
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r6 = A00(r8, r13)
            goto L_0x0084
        L_0x0055:
            X.0eS.A00(r8)
            X.05G r6 = r5.A0W
            boolean r0 = X.DbX.A1b(r6)
            if (r0 == 0) goto L_0x003f
            X.AnonymousClass7TF.A1O(r6, r14)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r8 = r5.A0O
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r5.A0Q
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r10 = r0.A0A
        L_0x006f:
            r15 = 0
            X.0sn r12 = X.0sn.A00
            r13.A01 = r5
            r13.A00 = r1
            r9 = r22
            r17 = r15
            r19 = r15
            java.lang.Object r8 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r17, r19)
            if (r8 == r2) goto L_0x0041
            r6 = r5
        L_0x0084:
            X.3Ii r8 = (X.C239803Ii) r8
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00e6
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r5 = r8.A00
            X.K1a r5 = (X.C61289K1a) r5
            boolean r10 = r5.A08
            boolean r0 = r5.A09
            r9 = r0 ^ 1
            X.05G r8 = r6.A0G
            r0 = 18
            X.C61042Jvg.A00(r8, r0, r10, r9)
            r6.A08(r5)
            java.util.List r0 = r5.A04
            java.util.List r0 = X.JTQ.A0j(r0)
            X.ME9.A01(r6, r5, r13, r7)
            java.lang.Object r0 = A04(r6, r0, r13, r1, r14)
            if (r0 != r2) goto L_0x00ba
            return r2
        L_0x00b0:
            r10 = r11
            goto L_0x006f
        L_0x00b2:
            java.lang.Object r5 = r13.A02
            X.K1a r5 = (X.C61289K1a) r5
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r6 = A00(r8, r13)
        L_0x00ba:
            java.util.List r0 = r5.A05
            java.util.List r0 = X.JTQ.A0j(r0)
            X.ME9.A01(r6, r5, r13, r4)
            java.lang.Object r0 = A02(r6, r0, r13, r14)
            if (r0 != r2) goto L_0x00d2
            return r2
        L_0x00ca:
            java.lang.Object r5 = r13.A02
            X.K1a r5 = (X.C61289K1a) r5
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r6 = A00(r8, r13)
        L_0x00d2:
            X.Jw8 r0 = r5.A01
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0038
            X.ME9.A01(r6, r5, r13, r3)
            java.lang.Object r0 = A03(r6, r0, r13, r14)
            if (r0 != r2) goto L_0x0038
            return r2
        L_0x00e6:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ef:
            X.ME9 r13 = X.ME9.A00(r5, r4, r3)
            goto L_0x001a
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0G(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    public final X.1Hj A0H(X.AnonymousClass4D7 r12) {
        /*
            r11 = this;
            r3 = 15
            boolean r0 = X.C66139MDr.A01(r3, r12)
            if (r0 == 0) goto L_0x0080
            r5 = r12
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 == r2) goto L_0x0048
            if (r0 == r3) goto L_0x0048
            if (r0 != r4) goto L_0x0086
            java.lang.Object r9 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r9
            X.0eS.A00(r1)
        L_0x002e:
            java.util.List r0 = r9.A0S
            int r0 = r0.size()
            r5.A01 = r9
            if (r0 > r2) goto L_0x0041
            r5.A00 = r2
            java.lang.Object r0 = A05(r9, r5)
        L_0x003e:
            if (r0 != r6) goto L_0x004f
            return r6
        L_0x0041:
            r5.A00 = r3
            java.lang.Object r0 = A06(r9, r5)
            goto L_0x003e
        L_0x0048:
            java.lang.Object r9 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r9
            X.0eS.A00(r1)
        L_0x004f:
            com.instagram.common.session.UserSession r8 = r9.A0A
            X.0Tu r7 = X.0Tu.A05
            r0 = 36592816419242715(0x8200f9000002db, double:3.204782678749329E-306)
            long r0 = X.182.A01(r7, r8, r0)
            r5.A01 = r9
            r5.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r5, r0)
            if (r0 != r6) goto L_0x002e
            return r6
        L_0x0067:
            X.0eS.A00(r1)
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.A02
            long r9 = r9 - r0
            r7 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            r0 = 0
            r11.A02 = r0
            r0 = 0
            r11.A07 = r0
        L_0x007e:
            r9 = r11
            goto L_0x002e
        L_0x0080:
            X.MDr r5 = new X.MDr
            r5.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0H(X.4D7):X.1Hj");
    }

    public final void A0I() {
        this.A0H.Epw((Object) null);
        this.A0G.Epw(new C61042Jvg(false, false, 18));
        this.A02 = 0;
        this.A07 = null;
        this.A03 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A01 = 182.A01(0Tu.A05, this.A0A, 36592816419242715L);
        JTR.A1W(this.A0W);
        this.A09 = false;
        this.A0T.clear();
        this.A0B.clear();
        this.A0S.clear();
    }

    public IgLiveCommentsRepository(UserSession userSession, IgLiveCommentsApi igLiveCommentsApi, C313666go r8, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        boolean A1Y = DbW.A1Y(igLiveBroadcastInfoManager);
        this.A0A = userSession;
        this.A0Q = igLiveBroadcastInfoManager;
        this.A0P = r8;
        this.A0O = igLiveCommentsApi;
        this.A01 = 182.A01(0Tu.A05, userSession, 36592816419242715L);
        this.A08 = AnonymousClass7TE.A1C();
        02z A10 = C51970G9q.A10(A1Y);
        this.A0W = A10;
        this.A0K = 10b.A03(A10);
        this.A0T = DbS.A0y();
        this.A0B = DbS.A0y();
        this.A0S = AnonymousClass7TE.A1C();
        this.A0R = MAX.A00;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A0U = A012;
        this.A0E = new 0V1((C262204Co) null, A012);
        1HR A0w = G9w.A0w();
        this.A0D = A0w;
        this.A0F = 0u9.A04(A0w);
        02z A013 = 106.A01((Object) null);
        this.A0H = A013;
        this.A0L = 10b.A03(A013);
        05D A014 = 10D.A01(num, 0, 0);
        this.A0V = A014;
        this.A0I = new 0V1((C262204Co) null, A014);
        AnonymousClass1aS A002 = 1aF.A00();
        this.A0M = A002;
        this.A0N = A002;
        02z A102 = DbS.A10(new C61042Jvg(false, false, 18));
        this.A0G = A102;
        this.A0J = 10b.A03(A102);
    }
}
