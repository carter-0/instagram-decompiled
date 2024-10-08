package com.instagram.mainfeed.data.datasource.local;

import X.02m;
import X.0Tu;
import X.0qQ;
import X.0sr;
import X.136;
import X.14G;
import X.14i;
import X.15Y;
import X.182;
import X.19E;
import X.1NK;
import X.1UQ;
import X.1UU;
import X.1UV;
import X.1UW;
import X.1UX;
import X.1Ua;
import X.1Ug;
import X.1Uh;
import X.1Ui;
import X.1Ux;
import X.1Uz;
import X.1V0;
import X.1XM;
import X.1Xg;
import X.1Xj;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass12T;
import X.AnonymousClass1HX;
import X.AnonymousClass1K7;
import X.AnonymousClass3PG;
import X.AnonymousClass3WR;
import X.AnonymousClass46L;
import X.AnonymousClass4D7;
import X.AnonymousClass4U8;
import X.AnonymousClass4UA;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9MF;
import X.C228572lt;
import X.C228612lx;
import X.C249763kK;
import X.C255593uO;
import X.C256203vO;
import X.C262224Cq;
import X.C59674JTf;
import X.C60340gF;
import X.C61110lV;
import X.C62880wX;
import X.C63657L1t;
import X.C63728L4m;
import X.C66170MGh;
import X.DbS;
import X.DbV;
import X.DbY;
import X.Dba;
import X.INP;
import X.JTZ;
import X.L8I;
import X.MFT;
import X.MH3;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class MainFeedLocalDataSource implements C61110lV, 1Ux, 1Uz {
    public static final AtomicInteger A0O = new AtomicInteger();
    public int A00;
    public L8I A01;
    public C228572lt A02;
    public C249763kK A03;
    public C63728L4m A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final Context A08;
    public final UserSession A09;
    public final C228612lx A0A;
    public final 1V0 A0B;
    public final FlashFeedCache A0C;
    public final List A0D;
    public final Set A0E = DbS.A0y();
    public final AtomicBoolean A0F;
    public final C262224Cq A0G;
    public final C262224Cq A0H;
    public final 136 A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARNING: type inference failed for: r13v1, types: [X.MDk, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r21) {
        /*
            r20 = this;
            r3 = 3
            r4 = r21
            boolean r0 = X.C66132MDk.A01(r3, r4)
            r7 = r20
            if (r0 == 0) goto L_0x00e7
            r13 = r4
            X.MDk r13 = (X.C66132MDk) r13
            int r2 = r13.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e7
            int r2 = r2 - r1
            r13.A01 = r2
        L_0x0019:
            java.lang.Object r8 = r13.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A01
            r1 = 2
            r5 = 1
            r6 = 974459630(0x3a1512ee, float:5.6867197E-4)
            if (r0 == 0) goto L_0x0034
            if (r0 == r5) goto L_0x0087
            if (r0 != r1) goto L_0x00ee
            java.lang.Object r0 = r13.A02
            X.0rm r0 = (X.0rm) r0
            X.0eS.A00(r8)
        L_0x0031:
            java.lang.Object r0 = r0.A00
            return r0
        L_0x0034:
            X.0eS.A00(r8)
            X.0rm r0 = X.C51965G9l.A11()
            com.instagram.common.session.UserSession r8 = r7.A09
            X.0Tu r9 = X.0Tu.A05
            r3 = 36328525606698381(0x81109a00003d8d, double:3.03764410468261E-306)
            boolean r3 = X.182.A06(r9, r8, r3)
            r18 = 0
            java.lang.String r11 = "TLI"
            java.lang.String r10 = "CACHE_NAME"
            if (r3 != 0) goto L_0x00ae
            X.02m r4 = X.02m.A0p
            java.util.concurrent.atomic.AtomicInteger r3 = A0O
            int r3 = r3.incrementAndGet()
            r4.markerStart(r6, r3)
            r4.markerAnnotate(r6, r3, r10, r11)
            com.instagram.mainfeed.network.flashfeed.FlashFeedCache r9 = r7.A0C
            if (r9 == 0) goto L_0x00aa
            int r14 = r7.A00
            long r15 = X.1Uh.A01(r8)
            X.1UQ r7 = X.1UQ.A0Y
            X.1UQ[] r7 = new X.1UQ[]{r7}
            java.util.ArrayList r12 = X.0sr.A1L(r7)
            r10 = 0
            r13.A02 = r0
            r13.A03 = r4
            r13.A00 = r3
            r13.A01 = r5
            r11 = r10
            r19 = r5
            r17 = r5
            java.lang.Object r8 = r9.A04(r10, r11, r12, r13, r14, r15, r17, r18, r19)
            if (r8 != r2) goto L_0x0094
            return r2
        L_0x0087:
            int r3 = r13.A00
            java.lang.Object r4 = r13.A03
            X.02m r4 = (X.02m) r4
            java.lang.Object r0 = r13.A02
            X.0rm r0 = (X.0rm) r0
            X.0eS.A00(r8)
        L_0x0094:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x00aa
            int r5 = r8.size()
            java.lang.String r2 = "LOAD_ITEM_COUNT"
            r4.markerAnnotate(r6, r3, r2, r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.L4m r2 = new X.L4m
            r2.<init>(r5, r8)
            r0.A00 = r2
        L_0x00aa:
            r4.markerEnd(r6, r3, r1)
            goto L_0x0031
        L_0x00ae:
            X.02m r4 = X.02m.A0p
            java.util.concurrent.atomic.AtomicInteger r3 = A0O
            int r9 = r3.incrementAndGet()
            r4.markerStart(r6, r9)
            r4.markerAnnotate(r6, r9, r10, r11)
            com.instagram.mainfeed.network.flashfeed.FlashFeedCache r6 = r7.A0C
            if (r6 == 0) goto L_0x0031
            int r4 = r7.A00
            long r14 = X.1Uh.A01(r8)
            X.1UQ r3 = X.1UQ.A0Y
            X.1UQ[] r3 = new X.1UQ[]{r3}
            java.util.ArrayList r11 = X.0sr.A1L(r3)
            java.lang.Integer r10 = X.JTO.A0w(r9)
            r13.A02 = r0
            r13.A01 = r1
            r8 = r6
            r9 = r7
            r12 = r13
            r13 = r4
            r16 = r5
            r17 = r5
            java.lang.Object r1 = r8.A03(r9, r10, r11, r12, r13, r14, r16, r17)
            if (r1 != r2) goto L_0x0031
            return r2
        L_0x00e7:
            X.MDk r13 = new X.MDk
            r13.<init>(r7, r4, r3)
            goto L_0x0019
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource.A04(X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r23v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r31, boolean r32) {
        /*
            r30 = this;
            r7 = 1
            r3 = r31
            boolean r0 = r3 instanceof X.MDP
            r8 = r30
            if (r0 == 0) goto L_0x0255
            r6 = r3
            X.MDP r6 = (X.MDP) r6
            int r0 = r6.A08
            if (r0 != r7) goto L_0x0255
            int r2 = r6.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0255
            int r2 = r2 - r1
            r6.A01 = r2
        L_0x001b:
            java.lang.Object r5 = r6.A07
            X.1Hj r18 = X.1Hj.A02
            int r0 = r6.A01
            if (r0 == 0) goto L_0x00fb
            if (r0 != r7) goto L_0x025c
            int r1 = r6.A00
            java.lang.Object r3 = r6.A06
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r6.A05
            X.1XM r2 = (X.1XM) r2
            java.lang.Object r0 = r6.A04
            X.02m r0 = (X.02m) r0
            java.lang.Object r4 = r6.A03
            r17 = r4
            r4 = r17
            X.0rm r4 = (X.0rm) r4
            r17 = r4
            java.lang.Object r10 = r6.A02
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r10 = (com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource) r10
            X.0eS.A00(r5)
        L_0x0044:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x004b
            r3.addAll(r5)
        L_0x004b:
            X.0qQ.A0A(r0)
            com.instagram.common.session.UserSession r9 = r10.A09
            r11 = 0
            X.0Tu r8 = X.0Tu.A05
            r4 = 36317801073350192(0x8106d900001630, double:3.0308618666089855E-306)
            boolean r4 = X.182.A06(r8, r9, r4)
            r13 = r4 ^ 1
            r7 = 974459630(0x3a1512ee, float:5.6867197E-4)
            r6 = 0
            if (r2 == 0) goto L_0x00dd
            int r5 = r3.size()
            java.lang.String r4 = "LOAD_ITEM_COUNT"
            r0.markerAnnotate(r7, r1, r4, r5)
            java.util.List r5 = r2.A00()
            java.util.List r4 = r10.A0D
            java.util.ArrayList r4 = X.1sb.A00(r5, r4)
            r3.addAll(r11, r4)
            boolean r4 = X.AnonymousClass7TE.A1b(r3)
            if (r4 == 0) goto L_0x00dd
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00ac
        L_0x008a:
            X.1V0 r4 = r10.A0B
            r4.A00 = r6
            java.util.List r11 = X.00k.A0a(r3)
            X.3PG r10 = X.AnonymousClass3PG.LOCAL
            long r12 = X.1V0.A00(r4)
            X.L8I r6 = new X.L8I
            r8 = r6
            r9 = r2
            r8.<init>(r9, r10, r11, r12)
        L_0x009f:
            r2 = 2
            r0.markerEnd(r7, r1, r2)
            r0 = r17
            r0.A00 = r6
        L_0x00a7:
            r0 = r17
            java.lang.Object r0 = r0.A00
            return r0
        L_0x00ac:
            java.util.Iterator r12 = r3.iterator()
        L_0x00b0:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r11 = r12.next()
            X.1Xg r11 = (X.1Xg) r11
            boolean r4 = r2.A02()
            if (r4 == 0) goto L_0x00d8
            r4 = 36320498313339387(0x81094d000821fb, double:3.032567612039066E-306)
            boolean r4 = X.182.A06(r8, r9, r4)
            if (r4 == 0) goto L_0x00d8
            X.1UQ r5 = r11.A06
            X.1UQ r4 = X.1UQ.A0Y
            if (r5 == r4) goto L_0x00b0
            X.1UQ r4 = X.1UQ.A0H
        L_0x00d5:
            if (r5 != r4) goto L_0x00dd
            goto L_0x00b0
        L_0x00d8:
            X.1UQ r5 = r11.A06
            X.1UQ r4 = X.1UQ.A0Y
            goto L_0x00d5
        L_0x00dd:
            if (r13 == 0) goto L_0x009f
            X.1V0 r3 = r10.A0B
            X.1XM r2 = r3.A00
            if (r2 != 0) goto L_0x00e8
            r3.A01()
        L_0x00e8:
            X.1XM r4 = r3.A00
            if (r4 == 0) goto L_0x009f
            X.0sn r11 = X.0sn.A00
            X.3PG r10 = X.AnonymousClass3PG.CACHED
            long r2 = r4.A00
            X.L8I r6 = new X.L8I
            r12 = r2
            r8 = r6
            r9 = r4
            r8.<init>(r9, r10, r11, r12)
            goto L_0x009f
        L_0x00fb:
            X.0eS.A00(r5)
            X.0rm r17 = X.C51965G9l.A11()
            com.instagram.common.session.UserSession r15 = r8.A09
            X.02m r0 = X.02m.A0p
            java.util.concurrent.atomic.AtomicInteger r1 = A0O
            int r1 = r1.incrementAndGet()
            r9 = 974459630(0x3a1512ee, float:5.6867197E-4)
            r0.markerStart(r9, r1)
            java.lang.String r3 = "CACHE_NAME"
            java.lang.String r2 = "COLD_START"
            r0.markerAnnotate(r9, r1, r3, r2)
            r27 = 0
            X.0Tu r10 = X.0Tu.A05
            r2 = 2342154114433679797(0x208100c2000a01b5, double:4.058043861308393E-152)
            boolean r2 = X.182.A06(r10, r15, r2)
            if (r2 == 0) goto L_0x0233
            X.1V0 r11 = r8.A0B
            long r13 = java.lang.System.currentTimeMillis()
            long r2 = X.1V0.A00(r11)
            long r13 = r13 - r2
            if (r32 == 0) goto L_0x01a6
            r4 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x013c:
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x0233
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0233
            r2 = 36317801073415729(0x8106d900011631, double:3.030861866650431E-306)
            boolean r2 = X.182.A06(r10, r15, r2)
            if (r2 != 0) goto L_0x0233
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.1XM r2 = r11.A00
            if (r2 != 0) goto L_0x015a
            r11.A01()
        L_0x015a:
            X.1XM r2 = r11.A00
            if (r2 == 0) goto L_0x01a4
            java.util.List r5 = r2.A00()
            java.util.List r4 = r8.A0D
            java.util.ArrayList r4 = X.1sb.A00(r5, r4)
        L_0x0168:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            if (r4 == 0) goto L_0x01ab
            java.util.Iterator r16 = r4.iterator()
        L_0x0176:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x01ab
            java.lang.Object r12 = r16.next()
            X.1Xg r12 = (X.1Xg) r12
            X.1Xn r4 = r12.A05
            X.1Xj r11 = X.1Xi.A02(r4)
            if (r11 == 0) goto L_0x01a0
            X.1NK r4 = X.1NK.A00()
            if (r4 == 0) goto L_0x01a0
            X.3op r5 = X.C252253oo.A00(r15)
            android.content.Context r4 = r8.A08
            boolean r4 = r5.A00(r4, r11)
            if (r4 == 0) goto L_0x01a0
            r14.add(r12)
            goto L_0x0176
        L_0x01a0:
            r13.add(r12)
            goto L_0x0176
        L_0x01a4:
            r4 = 0
            goto L_0x0168
        L_0x01a6:
            long r4 = r8.A07
            long r2 = r8.A06
            goto L_0x013c
        L_0x01ab:
            r14.addAll(r13)
            boolean r4 = X.AnonymousClass7TE.A1b(r14)
            java.lang.String r5 = "CONDITIONAL_LOAD_STATE"
            if (r4 == 0) goto L_0x01c1
            java.lang.String r4 = "phl_only"
            r0.markerAnnotate(r9, r1, r5, r4)
            r3.addAll(r14)
            r10 = r8
            goto L_0x004b
        L_0x01c1:
            java.lang.String r4 = "flash_feed_only"
            r0.markerAnnotate(r9, r1, r5, r4)
            if (r2 == 0) goto L_0x022d
            boolean r12 = r2.A02()
        L_0x01cc:
            r6.A02 = r8
            r4 = r17
            r6.A03 = r4
            r6.A04 = r0
            r6.A05 = r2
            r6.A06 = r3
            r6.A00 = r1
            r6.A01 = r7
            com.instagram.mainfeed.network.flashfeed.FlashFeedCache r9 = r8.A0C
            if (r9 == 0) goto L_0x022f
            int r11 = r8.A05
            long r25 = X.1Uh.A01(r15)
            r4 = 36320498313339387(0x81094d000821fb, double:3.032567612039066E-306)
            boolean r4 = X.182.A06(r10, r15, r4)
            if (r4 != 0) goto L_0x021d
            X.1UQ[] r5 = new X.1UQ[r7]
            X.1UQ r4 = X.1UQ.A0Y
        L_0x01f5:
            r5[r27] = r4
        L_0x01f7:
            java.util.ArrayList r22 = X.0sr.A1L(r5)
            r4 = 36592580196893310(0x8200c2000d027e, double:3.204633290784374E-306)
            int r4 = X.DbS.A04(r10, r15, r4)
            java.lang.Integer r20 = X.JTO.A0w(r4)
            r21 = 0
            r23 = r6
            r24 = r11
            r28 = r27
            r29 = r7
            r19 = r9
            java.lang.Object r5 = r19.A04(r20, r21, r22, r23, r24, r25, r27, r28, r29)
            r4 = r18
            if (r5 != r4) goto L_0x0230
            return r18
        L_0x021d:
            if (r12 == 0) goto L_0x0224
            X.1UQ[] r5 = new X.1UQ[r7]
            X.1UQ r4 = X.1UQ.A0H
            goto L_0x01f5
        L_0x0224:
            X.1UQ r5 = X.1UQ.A0Y
            X.1UQ r4 = X.1UQ.A0H
            X.1UQ[] r5 = new X.1UQ[]{r5, r4}
            goto L_0x01f7
        L_0x022d:
            r12 = 0
            goto L_0x01cc
        L_0x022f:
            r5 = 0
        L_0x0230:
            r10 = r8
            goto L_0x0044
        L_0x0233:
            X.1V0 r3 = r8.A0B
            X.1XM r2 = r3.A00
            if (r2 != 0) goto L_0x023c
            r3.A01()
        L_0x023c:
            X.1XM r4 = r3.A00
            if (r4 == 0) goto L_0x024f
            X.0sn r6 = X.0sn.A00
            X.3PG r5 = X.AnonymousClass3PG.CACHED
            long r7 = r4.A00
            X.L8I r3 = new X.L8I
            r3.<init>(r4, r5, r6, r7)
            r2 = r17
            r2.A00 = r3
        L_0x024f:
            r2 = 2
            r0.markerEnd(r9, r1, r2)
            goto L_0x00a7
        L_0x0255:
            X.MDP r6 = new X.MDP
            r6.<init>(r8, r3, r7)
            goto L_0x001b
        L_0x025c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource.A05(X.4D7, boolean):java.lang.Object");
    }

    public final void A8n(List list, boolean z) {
        FlashFeedCache flashFeedCache = this.A0C;
        if (flashFeedCache != null) {
            AnonymousClass7TE.A1Z(new C59674JTf(flashFeedCache, list, this, (AnonymousClass4D7) null, 12, z), this.A0G);
        }
    }

    public /* synthetic */ MainFeedLocalDataSource(UserSession userSession) {
        long j;
        int A042;
        C62880wX r7 = userSession.A03;
        Context A062 = r7.A06();
        this.A09 = userSession;
        this.A08 = A062;
        AnonymousClass12T r8 = AnonymousClass12T.A00;
        0Tu r3 = 0Tu.A05;
        this.A0H = 19E.A02(r8.AOJ(1099672250, DbS.A04(r3, userSession, 36596389832690097L)));
        FlashFeedCache flashFeedCache = null;
        this.A0G = DbY.A0r(r8, 739);
        this.A0J = 182.A06(r3, userSession, 36314914855324554L);
        this.A0L = 182.A06(r3, userSession, 36314914855521165L);
        this.A0M = 182.A06(r3, userSession, 36314914855586702L);
        this.A0K = 182.A06(r3, userSession, 36314914855455628L);
        this.A0F = new AtomicBoolean(false);
        1Ua A002 = 1UX.A00(A062.getApplicationContext(), userSession);
        ArrayList A15 = DbV.A15(A002);
        A15.add(new 1UW(userSession));
        A15.add(new 1Ug(A002));
        this.A0A = new C228612lx(A15);
        if (182.A06(r3, userSession, 36317801073612340L)) {
            A042 = 0;
        } else {
            if (AnonymousClass1K7.A00().A0D() || AnonymousClass1K7.A00().A0E()) {
                j = 36592580196303479L;
            } else {
                j = 36592580196237942L;
            }
            A042 = DbS.A04(r3, userSession, j);
        }
        this.A00 = A042;
        this.A05 = 1Uh.A00(userSession) * 3;
        this.A07 = 182.A01(r3, userSession, 36592580196827773L) * 1000;
        this.A06 = 182.A01(r3, userSession, 36592580196762236L) * 1000;
        1UU r82 = new 1UU(182.A01(r3, userSession, 36592580196434553L), DbY.A0p(1UQ.A0Y, AnonymousClass7TF.A0Y(r3, userSession, 36592580196434553L), AnonymousClass7TE.A1L(1UQ.A0H, AnonymousClass7TF.A0Y(r3, userSession, 36595294615439471L))));
        1UW r9 = new 1UW(userSession);
        1Ua A003 = 1UX.A00(r7.A06(), userSession);
        0qQ.A07(A003);
        List A1P = 0sr.A1P(new 1UV[]{r82, r9, new 1Ug(A003), new 1Ui(182.A06(r3, userSession, 2342154114433941942L), 1Uh.A03(userSession))});
        this.A0D = A1P;
        boolean A1R = AnonymousClass7TF.A1R(this.A00);
        this.A0N = A1R;
        AtomicInteger atomicInteger = A0O;
        0qQ.A0B(atomicInteger, 2);
        this.A0B = (1V0) userSession.A01(1V0.class, new AnonymousClass9MF(41, atomicInteger, userSession, A062));
        this.A0I = new 136();
        this.A0C = A1R ? new FlashFeedCache(A062, userSession, A1P, this.A00) : flashFeedCache;
        if (A1R) {
            14i.A04(15Y.A02, this, false, false);
        }
    }

    public static final C60340gF A00(MainFeedLocalDataSource mainFeedLocalDataSource, C63657L1t l1t, boolean z) {
        if (mainFeedLocalDataSource.A0J) {
            AtomicBoolean atomicBoolean = mainFeedLocalDataSource.A0F;
            if (atomicBoolean.get()) {
                synchronized (mainFeedLocalDataSource) {
                    Set<C63657L1t> set = mainFeedLocalDataSource.A0E;
                    set.add(l1t);
                    L8I l8i = mainFeedLocalDataSource.A01;
                    C63728L4m l4m = mainFeedLocalDataSource.A04;
                    mainFeedLocalDataSource.A01 = null;
                    mainFeedLocalDataSource.A04 = null;
                    atomicBoolean.set(false);
                    if (l8i != null) {
                        for (C63657L1t l1t2 : set) {
                            1XM r6 = l8i.A01;
                            List list = l8i.A03;
                            AnonymousClass3PG r7 = l8i.A02;
                            long j = l8i.A00;
                            0qQ.A0B(r7, 2);
                            l1t2.A00.A07(r6, r7, list, j);
                        }
                    }
                    if (l4m != null) {
                        A02(l4m, mainFeedLocalDataSource);
                    }
                }
                return C60340gF.A00;
            }
        }
        Dba.A1S(mainFeedLocalDataSource, mainFeedLocalDataSource.A0G, 27, z);
        return C60340gF.A00;
    }

    public static final void A01(1Xj r6, MainFeedLocalDataSource mainFeedLocalDataSource) {
        Context context = mainFeedLocalDataSource.A08;
        ExtendedImageUrl A1n = r6.A1n(context);
        String A002 = AnonymousClass000.A00(288);
        if (A1n != null) {
            14G.A05(new 14G());
            1NK.A07(new INP(r6, A1n));
        }
        if (mainFeedLocalDataSource.A0M && r6.CeS()) {
            UserSession userSession = mainFeedLocalDataSource.A09;
            C255593uO.A00(userSession).A00(context);
            if (!r6.A5D() || (r6 = r6.A1c(r6.A0w())) != null) {
                AnonymousClass3WR CEL = r6.CEL();
                C255593uO.A00(userSession).A01(new C256203vO(CEL, A002));
                if (mainFeedLocalDataSource.A0K) {
                    AnonymousClass4U8 r1 = new AnonymousClass4U8(context, userSession, CEL, A002);
                    r1.A02 = true;
                    AnonymousClass4UA.A00(r1.A00());
                }
            }
        }
    }

    public static final void A02(C63728L4m l4m, MainFeedLocalDataSource mainFeedLocalDataSource) {
        boolean z;
        if (mainFeedLocalDataSource.A0J && mainFeedLocalDataSource.A0F.get() && l4m.A00 == AnonymousClass05K.A00) {
            synchronized (mainFeedLocalDataSource) {
                z = true;
                if (mainFeedLocalDataSource.A0E.isEmpty()) {
                    z = false;
                    mainFeedLocalDataSource.A04 = l4m;
                }
            }
            if (!z) {
                return;
            }
        }
        synchronized (mainFeedLocalDataSource) {
            UserSession userSession = mainFeedLocalDataSource.A09;
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 2342154114433089972L)) {
                List list = l4m.A01;
                if (AnonymousClass7TE.A1b(list)) {
                    C228612lx r4 = mainFeedLocalDataSource.A0A;
                    r4.A01(userSession, list);
                    C228572lt r3 = mainFeedLocalDataSource.A02;
                    if (r3 != null) {
                        r3.A00(r4, new AnonymousClass46L(Integer.MAX_VALUE, DbS.A04(r5, userSession, 36592580196172405L)), DbS.A04(r5, userSession, 36592580196041332L));
                    }
                }
            }
        }
    }

    public final void A06() {
        02m r5 = 02m.A0p;
        int incrementAndGet = A0O.incrementAndGet();
        r5.markerStart(974459630, incrementAndGet);
        r5.markerAnnotate(974459630, incrementAndGet, "CACHE_NAME", "RECS");
        if (this.A0C != null) {
            AnonymousClass7TE.A1Z(new JTZ(this, r5, (AnonymousClass4D7) null, incrementAndGet, 17), this.A0G);
        }
        r5.markerEnd(974459630, incrementAndGet, 2);
    }

    public final void A07() {
        AnonymousClass7TE.A1Z(new C66170MGh(this, (AnonymousClass4D7) null, 15), this.A0G);
        if (this.A0N) {
            14i.A07(this);
        }
    }

    public final void AHa() {
        FlashFeedCache flashFeedCache = this.A0C;
        if (flashFeedCache != null) {
            MH3.A00(this, flashFeedCache, this.A0G, 7);
        }
    }

    public final void DU0(List list) {
        A02(new C63728L4m(AnonymousClass05K.A00, list), this);
    }

    public final void FJQ(1Xg r3) {
        MH3.A00(this, r3, this.A0G, 11);
    }

    public static final void A03(MainFeedLocalDataSource mainFeedLocalDataSource, int i) {
        AnonymousClass7TE.A1Z(new MFT(mainFeedLocalDataSource, (AnonymousClass4D7) null, 45), AnonymousClass1HX.A02(117128848, i));
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1517151500);
        FlashFeedCache flashFeedCache = this.A0C;
        if (flashFeedCache != null) {
            MH3.A00(this, flashFeedCache, this.A0G, 8);
        }
        AnonymousClass0fD.A0A(1709845279, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1533182671, AnonymousClass0fD.A03(1294238696));
    }
}
