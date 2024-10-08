package com.instagram.banyan;

import X.002;
import X.00k;
import X.02m;
import X.04u;
import X.0KC;
import X.0Tu;
import X.0Yt;
import X.0c9;
import X.0eO;
import X.0fS;
import X.0mh;
import X.0nY;
import X.0qQ;
import X.0u4;
import X.0wb;
import X.0xY;
import X.0xa;
import X.14i;
import X.15Y;
import X.15n;
import X.16P;
import X.182;
import X.1NY;
import X.1Ng;
import X.1OC;
import X.1wn;
import X.27U;
import X.2Kd;
import X.A61;
import X.AnonymousClass000;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass16y;
import X.AnonymousClass1HI;
import X.AnonymousClass1Nd;
import X.AnonymousClass2hV;
import X.AnonymousClass3KA;
import X.AnonymousClass9M0;
import X.C257513xW;
import X.C290655fg;
import X.C290665fh;
import X.C290675fi;
import X.C290695fo;
import X.C290705fp;
import X.C290715fq;
import X.C290725fr;
import X.C290735fs;
import X.C290745ft;
import X.C290755fu;
import X.C290765fv;
import X.C290775fw;
import X.C290785fx;
import X.C290795fy;
import X.C290825g1;
import X.C290835g2;
import X.C290845g3;
import X.C290855g4;
import X.C290865g5;
import X.C290875g6;
import X.C290905gC;
import X.C290915gD;
import X.C290925gE;
import X.C290935gF;
import X.C290985gK;
import X.C290995gL;
import X.C291015gN;
import X.C291165gf;
import X.C293635l6;
import X.C45608CzK;
import X.C61110lV;
import X.C61480nO;
import X.C68515NLm;
import X.C68649NRg;
import X.C68650NRh;
import X.C68651NRi;
import X.C70162Jt;
import X.CDI;
import X.MMP;
import X.NRf;
import X.OOd;
import android.os.Parcelable;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class BanyanCoordinator {
    public static final String[] A0T = {"reshare_share_sheet", "story_share_sheet", "forwarding_recipient_sheet", "direct_ibc_nullstate"};
    public int A00;
    public long A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public C290665fh A05;
    public final int A06;
    public final C290675fi A07;
    public final C290715fq A08;
    public final C290655fg A09;
    public final C290705fp A0A;
    public final C290695fo A0B;
    public final 1wn A0C;
    public final 1wn A0D;
    public final 1wn A0E;
    public final 1wn A0F;
    public final 1wn A0G;
    public final 1wn A0H;
    public final UserSession A0I;
    public final C61480nO A0J;
    public final HashMap A0K = new HashMap();
    public final ReentrantReadWriteLock A0L = new ReentrantReadWriteLock();
    public final AnonymousClass0eM A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final C290795fy A0P;
    public final C61110lV A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public HashMap cachedClickstreamTokenResults;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.banyan.BanyanCoordinator r7, X.AnonymousClass4D7 r8) {
        /*
            r1 = 0
            r4 = 7
            boolean r0 = X.C66128MDg.A01(r4, r8)
            if (r0 == 0) goto L_0x00a6
            r6 = r8
            X.MDg r6 = (X.C66128MDg) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00a6
            int r3 = r3 - r2
            r6.A00 = r3
        L_0x0016:
            java.lang.Object r4 = r6.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x0096
            if (r0 != r5) goto L_0x00ad
            java.lang.Object r7 = r6.A01
            com.instagram.banyan.BanyanCoordinator r7 = (com.instagram.banyan.BanyanCoordinator) r7
            X.0eS.A00(r4)
        L_0x0028:
            X.BvW r4 = (X.C43270BvW) r4
            if (r4 == 0) goto L_0x006e
            java.lang.Class<X.BvV> r3 = X.C43269BvV.class
            java.lang.String r2 = "get_paginated_ig_share_sheet_ranking_query(input:$input)"
            r0 = 846393017(0x3272eeb9, float:1.4140533E-8)
            X.3lr r2 = r4.A03(r3, r2, r0)
            if (r2 == 0) goto L_0x003f
            java.lang.String r0 = "status"
            java.lang.String r1 = r2.A09(r0)
        L_0x003f:
            java.lang.String r0 = "ok"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006e
            X.5gL r4 = X.D0S.A00(r4)
            java.util.List r3 = r4.A03
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.5g4 r2 = X.C290825g1.A00(r0)
            X.5g6 r1 = r2.A00
            if (r1 == 0) goto L_0x0066
            r0 = 0
            r1.A04 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "graphql_fetch_end"
            X.C290855g4.A02(r1, r0, r3)
            X.C290855g4.A00(r2)
        L_0x0066:
            java.lang.String r0 = "GraphQL"
            r7.A0C(r4, r0, r5)
        L_0x006b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x006e:
            com.instagram.common.session.UserSession r0 = r7.A0I
            X.5g4 r4 = X.C290825g1.A00(r0)
            java.util.List r3 = java.util.Collections.emptyList()
            X.0qQ.A07(r3)
            r2 = 0
            X.5g6 r0 = r4.A00
            if (r0 == 0) goto L_0x006b
            r0.A04 = r2
            java.util.List r1 = r0.A01
            java.lang.String r0 = "graphql_fetch_failed"
            r1.add(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "graphql_fetch_end"
            X.C290855g4.A02(r1, r0, r3)
            X.C290855g4.A00(r4)
            goto L_0x006b
        L_0x0096:
            X.0eS.A00(r4)
            r6.A01 = r7
            r6.A00 = r5
            java.lang.String r0 = "reshare_share_sheet"
            java.lang.Object r4 = A01(r7, r0, r6)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00a6:
            X.MDg r6 = new X.MDg
            r6.<init>(r7, r8, r4)
            goto L_0x0016
        L_0x00ad:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A02(com.instagram.banyan.BanyanCoordinator, X.4D7):java.lang.Object");
    }

    public final C290865g5 A07(String str) {
        C290865g5 A002;
        04u r8 = new 04u(0);
        04u r9 = new 04u(0);
        String str2 = str;
        if (str2.equals("forwarding_recipient_sheet") || str2.equals("story_share_sheet")) {
            if (182.A06(0Tu.A05, this.A0I, 36324355193450524L)) {
                A002 = A00(this, (String) null, "reshare_share_sheet", (String) null, r8, r9);
                if (str2.equals("direct_user_search_nullstate") && A002.A02.isEmpty()) {
                    A04(this);
                }
                return A002;
            }
        }
        A002 = A00(this, (String) null, str2, (String) null, r8, r9);
        A04(this);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (X.182.A06(X.0Tu.A05, r11.A0I, 36329947240874372L) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r8 == null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C290865g5 A00(com.instagram.banyan.BanyanCoordinator r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.Set r34, java.util.Set r35) {
        /*
            java.lang.String r20 = "Unable to acquire lock for executing this block."
            r11 = r30
            r10 = r32
            X.5fg r0 = r11.A09     // Catch:{ IOException | InterruptedException -> 0x02ea }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A00     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r29 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r29.writeLock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r1 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IOException | InterruptedException -> 0x02ea }
            boolean r0 = r3.tryLock(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x02ea }
            if (r0 == 0) goto L_0x02da
            X.5fi r9 = r11.A07     // Catch:{ all -> 0x02d8 }
            X.5fg r0 = r9.A02     // Catch:{ all -> 0x02d8 }
            r28 = r0
            r28.A00()     // Catch:{ all -> 0x02d8 }
            java.util.Map r0 = r9.A07     // Catch:{ all -> 0x02d8 }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x0045
            boolean r0 = X.C290685fj.A01(r10)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = "BANYAN_FETCH_FAILURE_RESHARE_SHEET_VIEW_NOT_FOUND"
            r11.A06(r10, r0)     // Catch:{ all -> 0x02d8 }
            com.instagram.common.session.UserSession r3 = r11.A0I     // Catch:{ all -> 0x02d8 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x02d8 }
            r0 = 36329947240874372(0x8111e500004184, double:3.038543151859968E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x02ce
        L_0x0045:
            X.5gF r8 = r9.A02(r10)     // Catch:{ all -> 0x02d8 }
            if (r8 != 0) goto L_0x007e
            boolean r4 = X.C290685fj.A01(r10)     // Catch:{ all -> 0x02d8 }
            if (r4 == 0) goto L_0x006d
            com.instagram.common.session.UserSession r3 = r11.A0I     // Catch:{ all -> 0x02d8 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x02d8 }
            r0 = 36329947240874372(0x8111e500004184, double:3.038543151859968E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "BANYAN_FETCH_FAILURE_RESHARE_SHEET_RANKING_STORE_INBOX_FALLBACK"
            r11.A06(r10, r0)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "direct_user_search_nullstate"
            X.5gF r8 = r9.A02(r0)     // Catch:{ all -> 0x02d8 }
            if (r8 != 0) goto L_0x007e
        L_0x006d:
            if (r4 == 0) goto L_0x0074
            java.lang.String r0 = "BANYAN_FETCH_FAILURE_RESHARE_SHEET_RANKING_STORE_NOT_FOUND"
            r11.A06(r10, r0)     // Catch:{ all -> 0x02d8 }
        L_0x0074:
            X.5g5 r1 = X.C290865g5.A03     // Catch:{ all -> 0x02d8 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r29.writeLock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r0.unlock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            return r1
        L_0x007e:
            r14 = 1
            r7 = 0
            java.util.HashMap r0 = r8.A04     // Catch:{ all -> 0x02d8 }
            X.5gc r2 = new X.5gc     // Catch:{ all -> 0x02d8 }
            r2.<init>(r0)     // Catch:{ all -> 0x02d8 }
            r3 = r33
            if (r33 == 0) goto L_0x0092
            int r0 = r3.length()     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0092
            r14 = 0
        L_0x0092:
            com.instagram.common.session.UserSession r5 = r9.A03     // Catch:{ all -> 0x02d8 }
            X.0Tu r4 = X.0Tu.A06     // Catch:{ all -> 0x02d8 }
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r0 = X.182.A06(r4, r5, r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0106
            r0 = 38
            X.Pm0 r1 = new X.Pm0     // Catch:{ all -> 0x02d8 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x02d8 }
            java.lang.Class<X.ODu> r0 = X.C70623ODu.class
            java.lang.Object r6 = r5.A01(r0, r1)     // Catch:{ all -> 0x02d8 }
            X.ODu r6 = (X.C70623ODu) r6     // Catch:{ all -> 0x02d8 }
            r9.A00 = r6     // Catch:{ all -> 0x02d8 }
            r28.A00()     // Catch:{ all -> 0x02d8 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x02d8 }
            r1.<init>()     // Catch:{ all -> 0x02d8 }
            java.util.Map r0 = r9.A0A     // Catch:{ all -> 0x02d8 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x02d8 }
            r1.addAll(r0)     // Catch:{ all -> 0x02d8 }
            java.util.Map r0 = r9.A09     // Catch:{ all -> 0x02d8 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x02d8 }
            r1.addAll(r0)     // Catch:{ all -> 0x02d8 }
            r0 = 3
            X.9LQ r5 = new X.9LQ     // Catch:{ all -> 0x02d8 }
            r5.<init>(r9, r0)     // Catch:{ all -> 0x02d8 }
            X.6EZ r0 = r6.A00     // Catch:{ all -> 0x02d8 }
            X.6Ea r0 = r0.A00     // Catch:{ all -> 0x02d8 }
            java.util.List r12 = X.00k.A0a(r1)     // Catch:{ all -> 0x02d8 }
            X.1aU r1 = r0.A00     // Catch:{ all -> 0x02d8 }
            java.lang.String r4 = "get_instagram_user_cutover_status_array"
            X.Oul r0 = new X.Oul     // Catch:{ all -> 0x02d8 }
            r0.<init>(r12)     // Catch:{ all -> 0x02d8 }
            X.1aU r1 = r1.A0M(r0)     // Catch:{ all -> 0x02d8 }
            X.4fh r0 = X.AnonymousClass6F9.A00(r4)     // Catch:{ all -> 0x02d8 }
            X.1aU r0 = r1.A0P(r0)     // Catch:{ all -> 0x02d8 }
            X.1aU r4 = r0.A0H()     // Catch:{ all -> 0x02d8 }
            X.0eM r0 = r6.A01     // Catch:{ all -> 0x02d8 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x02d8 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x02d8 }
            X.1a8 r1 = (X.1a8) r1     // Catch:{ all -> 0x02d8 }
            X.PS9 r0 = new X.PS9     // Catch:{ all -> 0x02d8 }
            r0.<init>(r5)     // Catch:{ all -> 0x02d8 }
            r1.A02(r4, r0)     // Catch:{ all -> 0x02d8 }
        L_0x0106:
            if (r14 == 0) goto L_0x0109
            goto L_0x0110
        L_0x0109:
            r0 = 1
            X.PmS r13 = new X.PmS     // Catch:{ all -> 0x02d8 }
            r13.<init>(r11, r3, r0, r7)     // Catch:{ all -> 0x02d8 }
            goto L_0x0112
        L_0x0110:
            X.5tq r13 = X.C298675tq.A00     // Catch:{ all -> 0x02d8 }
        L_0x0112:
            X.0sP r13 = (X.0sP) r13     // Catch:{ all -> 0x02d8 }
            if (r14 == 0) goto L_0x02b2
            X.5gd r12 = X.C291145gd.A00     // Catch:{ all -> 0x02d8 }
        L_0x0118:
            boolean r0 = X.C290685fj.A01(r10)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "BANYAN_FETCH_BUILD_RANKING_RESULT"
            r11.A06(r10, r0)     // Catch:{ all -> 0x02d8 }
        L_0x0123:
            com.instagram.common.session.UserSession r15 = r11.A0I     // Catch:{ all -> 0x02d8 }
            X.5ge r6 = new X.5ge     // Catch:{ all -> 0x02d8 }
            r6.<init>(r9)     // Catch:{ all -> 0x02d8 }
            r5 = 29
            X.9Ly r4 = new X.9Ly     // Catch:{ all -> 0x02d8 }
            r30 = r34
            r0 = r30
            r4.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r13)     // Catch:{ all -> 0x02d8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02d8 }
            r3.<init>()     // Catch:{ all -> 0x02d8 }
            java.util.HashMap r0 = r8.A04     // Catch:{ all -> 0x02d8 }
            r27 = r0
            java.util.Set r0 = r27.keySet()     // Catch:{ all -> 0x02d8 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x02d8 }
            java.util.List r2 = X.00k.A0g(r0, r2)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "reshare_share_sheet"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0178
            X.0Tu r14 = X.0Tu.A05     // Catch:{ all -> 0x02d8 }
            r0 = 36329234276302717(0x81113f00003f7d, double:3.038092270193975E-306)
            boolean r0 = X.182.A06(r14, r15, r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0178
            r0 = 36610709253068879(0x82113f0001184f, double:3.2160981789096536E-306)
            long r0 = X.182.A01(r14, r15, r0)     // Catch:{ all -> 0x02d8 }
            int r14 = (int) r0     // Catch:{ all -> 0x02d8 }
            int r0 = r2.size()     // Catch:{ all -> 0x02d8 }
            int r0 = java.lang.Math.min(r0, r14)     // Catch:{ all -> 0x02d8 }
            java.util.List r2 = r2.subList(r7, r0)     // Catch:{ all -> 0x02d8 }
        L_0x0178:
            java.util.Iterator r18 = r2.iterator()     // Catch:{ all -> 0x02d8 }
        L_0x017c:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object r14 = r18.next()     // Catch:{ all -> 0x02d8 }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x02d8 }
            r0 = r27
            java.lang.Object r1 = r0.get(r14)     // Catch:{ all -> 0x02d8 }
            X.5gH r1 = (X.C290955gH) r1     // Catch:{ all -> 0x02d8 }
            if (r1 == 0) goto L_0x017c
            java.lang.String r2 = r1.A01     // Catch:{ all -> 0x02d8 }
            if (r2 != 0) goto L_0x0199
            java.lang.String r2 = "unknown"
        L_0x0199:
            java.lang.String r0 = "thread"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x028e
            r28.A00()     // Catch:{ all -> 0x02d8 }
            java.util.Map r0 = r9.A08     // Catch:{ all -> 0x02d8 }
            java.lang.Object r2 = r0.get(r14)     // Catch:{ all -> 0x02d8 }
            X.5gD r2 = (X.C290915gD) r2     // Catch:{ all -> 0x02d8 }
            if (r2 == 0) goto L_0x017c
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r2.A03     // Catch:{ all -> 0x02d8 }
            r14 = 1
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x01e8
            java.util.List r0 = r2.A0B     // Catch:{ all -> 0x02d8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r2.A0C     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x01e8
        L_0x01c3:
            boolean r0 = r17.booleanValue()     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x017c
            double r0 = r1.A00     // Catch:{ all -> 0x02d8 }
            java.lang.Double r25 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x02d8 }
            X.B7Q r1 = new X.B7Q     // Catch:{ all -> 0x02d8 }
            r1.<init>(r6)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x02d8 }
            r21 = r1
            r22 = r2
            r23 = r15
            r24 = r19
            r26 = r0
            com.instagram.model.direct.DirectShareTarget r0 = X.C291165gf.A00(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x02d8 }
        L_0x01e4:
            r3.add(r0)     // Catch:{ all -> 0x02d8 }
            goto L_0x017c
        L_0x01e8:
            int r0 = r2.A00     // Catch:{ all -> 0x02d8 }
            if (r0 != r14) goto L_0x0201
            java.lang.String r0 = "story_share_sheet"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x01f8
            boolean r0 = r11.A0O     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x01c3
        L_0x01f8:
            java.lang.String r0 = "forwarding_recipient_sheet"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x0201
            goto L_0x01c3
        L_0x0201:
            if (r31 == 0) goto L_0x021a
            int r0 = r2.A01     // Catch:{ all -> 0x02d8 }
            if (r0 == r5) goto L_0x0213
            boolean r16 = X.AnonymousClass48O.A01(r0)     // Catch:{ all -> 0x02d8 }
            if (r16 != 0) goto L_0x0213
            boolean r0 = X.AnonymousClass48O.A02(r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x021a
        L_0x0213:
            boolean r0 = X.C290685fj.A01(r31)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x021a
            goto L_0x01c3
        L_0x021a:
            int r0 = r2.A01     // Catch:{ all -> 0x02d8 }
            if (r0 == r5) goto L_0x022a
            boolean r16 = X.AnonymousClass48O.A01(r0)     // Catch:{ all -> 0x02d8 }
            if (r16 != 0) goto L_0x022a
            boolean r0 = X.AnonymousClass48O.A02(r0)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x023d
        L_0x022a:
            boolean r0 = X.C290685fj.A00(r10)     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x023d
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r2.A03     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x023d
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r2.A04     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x023d
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = r2.A05     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x023d
            goto L_0x01c3
        L_0x023d:
            int r0 = r2.A01     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x027d
            java.util.List r0 = r2.A0B     // Catch:{ all -> 0x02d8 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x02d8 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x02d8 }
            int r0 = r0.size()     // Catch:{ all -> 0x02d8 }
            if (r0 != r14) goto L_0x027d
            java.util.List r0 = r2.A0B     // Catch:{ all -> 0x02d8 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x02d8 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x02d8 }
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch:{ all -> 0x02d8 }
            java.lang.Object r14 = r13.invoke(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x02d8 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x02d8 }
            if (r14 != 0) goto L_0x027d
            r14 = r30
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x02d8 }
        L_0x0271:
            boolean r0 = r14.add(r0)     // Catch:{ all -> 0x02d8 }
            r0 = r0 ^ 1
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02d8 }
            goto L_0x01c3
        L_0x027d:
            java.lang.Object r0 = r12.invoke(r2)     // Catch:{ all -> 0x02d8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x02d8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x01c3
            r14 = r35
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x02d8 }
            goto L_0x0271
        L_0x028e:
            java.lang.Object r2 = r6.invoke(r14)     // Catch:{ all -> 0x02d8 }
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2     // Catch:{ all -> 0x02d8 }
            if (r2 == 0) goto L_0x017c
            java.lang.Object r0 = r4.invoke(r2)     // Catch:{ all -> 0x02d8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x02d8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02d8 }
            if (r0 != 0) goto L_0x017c
            double r0 = r1.A00     // Catch:{ all -> 0x02d8 }
            java.lang.Double r14 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = r8.A02     // Catch:{ all -> 0x02d8 }
            r0 = r19
            com.instagram.model.direct.DirectShareTarget r0 = X.C291165gf.A01(r2, r0, r14, r1)     // Catch:{ all -> 0x02d8 }
            goto L_0x01e4
        L_0x02b2:
            X.PmS r12 = new X.PmS     // Catch:{ all -> 0x02d8 }
            r12.<init>(r11, r3, r7, r7)     // Catch:{ all -> 0x02d8 }
            goto L_0x0118
        L_0x02b9:
            java.lang.String r2 = r8.A02     // Catch:{ all -> 0x02d8 }
            long r0 = r8.A01     // Catch:{ all -> 0x02d8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02d8 }
            X.5g5 r1 = new X.5g5     // Catch:{ all -> 0x02d8 }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x02d8 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r29.writeLock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r0.unlock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            return r1
        L_0x02ce:
            X.5g5 r1 = X.C290865g5.A03     // Catch:{ all -> 0x02d8 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r29.writeLock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r0.unlock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            return r1
        L_0x02d8:
            r1 = move-exception
            goto L_0x02e2
        L_0x02da:
            java.lang.String r0 = "Failed to claim lock after 1 seconds"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r1.<init>(r0)     // Catch:{ IOException | InterruptedException -> 0x02ea }
            goto L_0x02e9
        L_0x02e2:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r29.writeLock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
            r0.unlock()     // Catch:{ IOException | InterruptedException -> 0x02ea }
        L_0x02e9:
            throw r1     // Catch:{ IOException | InterruptedException -> 0x02ea }
        L_0x02ea:
            r2 = move-exception
            java.lang.String r1 = "BanyanCoordinator"
            r0 = r20
            X.0KC.A0F(r1, r0, r2)
            java.lang.String r0 = "BANYAN_FETCH_FAILURE_RESHARE_SHEET_VIEW_UNABLE_TO_ACQUIRE_LOCK"
            r11.A06(r10, r0)
            X.5g5 r1 = X.C290865g5.A03
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A00(com.instagram.banyan.BanyanCoordinator, java.lang.String, java.lang.String, java.lang.String, java.util.Set, java.util.Set):X.5g5");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.banyan.BanyanCoordinator r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 34
            boolean r0 = X.ME4.A03(r3, r11)
            if (r0 == 0) goto L_0x0024
            r5 = r11
            X.ME4 r5 = (X.ME4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r8 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r6) goto L_0x002c
            goto L_0x00b9
        L_0x0024:
            r0 = 42
            X.ME4 r5 = new X.ME4
            r5.<init>(r9, r11, r3, r0)
            goto L_0x0016
        L_0x002c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            X.0eS.A00(r1)
            X.2IV r4 = new X.2IV
            r4.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r10)
            X.0qQ.A07(r1)
            java.lang.String r0 = "views"
            r4.A05(r0, r1)
            com.instagram.common.session.UserSession r3 = r9.A0I
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604885277414522(0x820bf30001147a, double:3.2124150732545706E-306)
            long r0 = X.182.A01(r2, r3, r0)
            int r9 = (int) r0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r0 = "count_per_page"
            r4.A07(r1, r0)
            java.lang.String r0 = "page_max_id"
            r4.A09(r7, r0)
            r0 = 36320756011049793(0x81098900032341, double:3.032730581108792E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 36602230987625060(0x82098900011264, double:3.210736489703748E-306)
            long r0 = X.182.A01(r2, r3, r0)
            int r9 = (int) r0
            r0 = 36602230987559523(0x82098900001263, double:3.210736489662302E-306)
            long r0 = X.182.A01(r2, r3, r0)
            int r10 = (int) r0
            if (r9 <= 0) goto L_0x00ab
            if (r10 <= 0) goto L_0x00ab
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r10)
            java.lang.String r0 = "position"
            X.0Df r2 = r2.A02()
            X.0Df.A00(r2, r1, r0)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r0 = "size"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r1 = "ibc_share_sheet_params"
            X.0Df r0 = r4.A02()
            r0.A0E(r2, r1)
        L_0x00ab:
            r0 = 0
            com.google.common.util.concurrent.SettableFuture r0 = X.C290985gK.A00(r4, r3, r0)     // Catch:{ Exception -> 0x00c5 }
            r5.A00 = r6     // Catch:{ Exception -> 0x00c5 }
            java.lang.Object r1 = X.C70357O3j.A00(r0, r5)     // Catch:{ Exception -> 0x00c5 }
            if (r1 != r8) goto L_0x00bc
            return r8
        L_0x00b9:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x00c5 }
        L_0x00bc:
            X.3JD r1 = (X.AnonymousClass3JD) r1     // Catch:{ Exception -> 0x00c5 }
            java.lang.Object r0 = r1.Bny()     // Catch:{ Exception -> 0x00c5 }
            X.BvW r0 = (X.C43270BvW) r0     // Catch:{ Exception -> 0x00c5 }
            return r0
        L_0x00c5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A01(com.instagram.banyan.BanyanCoordinator, java.lang.String, X.4D7):java.lang.Object");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final void A03(X.C74529PwO r11, com.instagram.banyan.BanyanCoordinator r12) {
        /*
            X.JxQ r11 = (X.C61114JxQ) r11
            java.util.List r0 = r11.A00
            java.util.List r0 = X.00k.A0Y(r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x0011:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r6 = r9.next()
            X.MWK r6 = (X.MWK) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.JxP r6 = (X.C61113JxP) r6
            java.util.List r8 = r6.A06
            if (r8 == 0) goto L_0x0034
            boolean r1 = r8.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            r7 = 10
            if (r0 != 0) goto L_0x005e
            if (r8 == 0) goto L_0x005e
            int r0 = X.0Yv.A1E(r8, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r8.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            boolean r0 = r5.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.add(r0)
            goto L_0x0048
        L_0x005e:
            java.util.List r1 = r6.A05
            if (r1 == 0) goto L_0x008b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008b
            int r0 = X.0Yv.A1E(r1, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.add(r0)
            goto L_0x0075
        L_0x008b:
            long r0 = r6.A01
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r6.A03
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = ""
        L_0x0097:
            X.F2P r0 = new X.F2P
            r0.<init>(r2, r1, r5, r3)
            r4.put(r2, r0)
            goto L_0x0011
        L_0x00a1:
            X.5fo r3 = r12.A0B
            java.util.LinkedHashMap r0 = r3.A02
            r0.clear()
            r0.putAll(r4)
            java.util.Collection r0 = r4.values()
            X.0qQ.A07(r0)
            java.util.List r2 = X.00k.A0a(r0)
            java.lang.String r8 = "36325201302335795L"
            X.5fh r1 = r3.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r7 = 0
            if (r0 != 0) goto L_0x00d2
            int r6 = r1.getReadHoldCount()
            r0 = 0
        L_0x00ca:
            if (r0 >= r6) goto L_0x00d3
            r12.unlock()
            int r0 = r0 + 1
            goto L_0x00ca
        L_0x00d2:
            r6 = 0
        L_0x00d3:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r1.writeLock()
            r11.lock()
            X.0xa r0 = r3.A01     // Catch:{ all -> 0x012b }
            X.0xY r5 = r0.AR4()     // Catch:{ all -> 0x012b }
            r5.AHM()     // Catch:{ all -> 0x012b }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x012b }
        L_0x00e7:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x012b }
            X.F2P r9 = (X.F2P) r9     // Catch:{ all -> 0x012b }
            if (r9 == 0) goto L_0x00e7
            java.util.List r2 = r9.A02     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "36325201302335711L:"
            r0 = 0
            java.lang.String r4 = ""
            java.lang.String r3 = X.00k.A0P(r1, r4, r4, r2, r0)     // Catch:{ all -> 0x012b }
            java.util.List r2 = r9.A03     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "36325201302335720L"
            X.Ayu r0 = X.C41703Ayu.A00     // Catch:{ all -> 0x012b }
            java.lang.String r2 = X.00k.A0P(r1, r4, r4, r2, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "shortcuts:"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x012b }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x012b }
            java.lang.String r0 = X.002.A11(r3, r8, r2, r8, r0)     // Catch:{ all -> 0x012b }
            r5.E5g(r1, r0)     // Catch:{ all -> 0x012b }
            goto L_0x00e7
        L_0x011c:
            r5.commit()     // Catch:{ all -> 0x012b }
        L_0x011f:
            if (r7 >= r6) goto L_0x0127
            r12.lock()
            int r7 = r7 + 1
            goto L_0x011f
        L_0x0127:
            r11.unlock()
            return
        L_0x012b:
            r0 = move-exception
        L_0x012c:
            if (r7 >= r6) goto L_0x0134
            r12.lock()
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0134:
            r11.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A03(X.PwO, com.instagram.banyan.BanyanCoordinator):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final void A04(com.instagram.banyan.BanyanCoordinator r24) {
        /*
            r5 = r24
            java.util.List r6 = r5.A02
            if (r6 != 0) goto L_0x000a
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x000a:
            r7 = 1
            r4 = 0
            if (r6 == 0) goto L_0x0250
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0250
            com.instagram.common.session.UserSession r3 = r5.A0I
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323410300775570(0x810bf300022c92, double:3.0344091646193404E-306)
            boolean r11 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r11)
            X.5g4 r8 = X.C290825g1.A00(r3)
            X.5g6 r0 = r8.A00
            if (r0 == 0) goto L_0x0052
            X.02m r9 = X.02m.A0p
            r1 = 135806945(0x8183fe1, float:4.5815925E-34)
            java.lang.String r0 = "is_graphql_enabled"
            r9.markerAnnotate(r1, r0, r11)
            com.facebook.quicklog.MarkerEditor r1 = r9.withMarker(r1)
            java.lang.String r0 = "network_fetch_start"
            com.facebook.quicklog.PointEditor r9 = r1.pointEditor(r0)
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r1 = r6.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "requested_ranking_views"
            com.facebook.quicklog.PointEditor r0 = r9.addPointData(r0, r1)
            r0.markerEditingCompleted()
        L_0x0052:
            long r0 = java.lang.System.currentTimeMillis()
            r5.A01 = r0
            if (r11 == 0) goto L_0x00ac
            java.lang.String r1 = "reshare_share_sheet"
            boolean r0 = r6.contains(r1)
            if (r0 == 0) goto L_0x00ac
            r6.remove(r1)
            r0 = 36324355193450524(0x810ccf0000301c, double:3.035006718551759E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "forwarding_recipient_sheet"
            r6.remove(r0)
            java.lang.String r0 = "story_share_sheet"
            r6.remove(r0)
        L_0x007a:
            X.5g6 r0 = r8.A00
            if (r0 != 0) goto L_0x0081
            X.C290855g4.A01(r8)
        L_0x0081:
            X.5g6 r0 = r8.A00
            if (r0 == 0) goto L_0x0091
            r0.A04 = r7
            X.02m r8 = X.02m.A0p
            r1 = 135806945(0x8183fe1, float:4.5815925E-34)
            java.lang.String r0 = "graphql_fetch_start"
            r8.markerPoint(r1, r0)
        L_0x0091:
            X.12T r8 = X.AnonymousClass12T.A00
            r9 = 0
            r1 = 839557200(0x320aa050, float:8.069108E-9)
            r0 = 3
            X.0nV r0 = r8.AOJ(r1, r0)
            X.19S r8 = X.19E.A02(r0)
            r0 = 31
            X.MFS r1 = new X.MFS
            r1.<init>(r5, r9, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r8)
        L_0x00ac:
            r0 = 36320416709681564(0x81093a0013219c, double:3.032516005557267E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x015c
            r0 = 36320416709747101(0x81093a0014219d, double:3.032516005598713E-306)
            boolean r16 = X.182.A06(r2, r3, r0)
            r0 = 36320416709812638(0x81093a0015219e, double:3.032516005640159E-306)
            boolean r15 = X.182.A06(r2, r3, r0)
            r0 = 36320416709878175(0x81093a0016219f, double:3.032516005681605E-306)
            boolean r14 = X.182.A06(r2, r3, r0)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r13 = r6.iterator()
        L_0x00ea:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0168
            java.lang.Object r12 = r13.next()
            java.lang.String r12 = (java.lang.String) r12
            if (r16 == 0) goto L_0x011f
            X.0qQ.A0B(r12, r4)
            java.lang.String r0 = "direct_ibc_nullstate"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "direct_ibc_inbox_discovery"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "direct_ibc_inbox_invitations"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "direct_ibc_inbox_discovery_nullstate"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x011f
        L_0x011b:
            r9.add(r12)
            goto L_0x00ea
        L_0x011f:
            if (r15 == 0) goto L_0x0138
            X.0qQ.A0B(r12, r4)
            java.lang.String r0 = "direct_ibc_inbox_discovery"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0134
            java.lang.String r0 = "direct_ibc_inbox_invitations"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0138
        L_0x0134:
            r8.add(r12)
            goto L_0x00ea
        L_0x0138:
            if (r14 == 0) goto L_0x0158
            boolean r0 = X.C290685fj.A00(r12)
            if (r0 == 0) goto L_0x0144
            r10.add(r12)
            goto L_0x00ea
        L_0x0144:
            X.0qQ.A0B(r12, r4)
            java.lang.String r0 = "direct_ibc_inbox_discovery"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0134
            java.lang.String r0 = "direct_ibc_inbox_invitations"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0158
            goto L_0x0134
        L_0x0158:
            r1.add(r12)
            goto L_0x00ea
        L_0x015c:
            java.util.Set r0 = X.00k.A0k(r6)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            goto L_0x0175
        L_0x0168:
            r0 = 2
            if (r16 == 0) goto L_0x0233
            java.util.Set[] r0 = new java.util.Set[r0]
            r0[r4] = r9
        L_0x016f:
            r0[r7] = r1
        L_0x0171:
            java.util.List r0 = X.0sr.A1P(r0)
        L_0x0175:
            java.util.Iterator r17 = r0.iterator()
        L_0x0179:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0259
            java.lang.Object r10 = r17.next()
            java.util.Set r10 = (java.util.Set) r10
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A0L
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r16 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L_0x019e
            int r9 = r1.getReadHoldCount()
            r0 = 0
        L_0x0196:
            if (r0 >= r9) goto L_0x019f
            r16.unlock()
            int r0 = r0 + 1
            goto L_0x0196
        L_0x019e:
            r9 = 0
        L_0x019f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r15 = r1.writeLock()
            r15.lock()
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0243 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0225
            java.util.HashMap r8 = r5.A0K     // Catch:{ all -> 0x0243 }
            boolean r0 = r8.containsKey(r10)     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x0225
            X.5gJ r0 = X.C290965gI.A00(r3)     // Catch:{ all -> 0x0243 }
            r6 = 77008831(0x4970fbf, float:3.551439E-36)
            X.02m r1 = r0.A00     // Catch:{ all -> 0x0243 }
            r1.markerStart(r6)     // Catch:{ all -> 0x0243 }
            if (r18 == 0) goto L_0x01c9
            java.lang.String r0 = "is_graph_ql_enabled"
            r1.markerAnnotate(r6, r0, r11)     // Catch:{ all -> 0x0243 }
        L_0x01c9:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0243 }
            r12.<init>(r10)     // Catch:{ all -> 0x0243 }
            r21 = 0
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0243 }
            boolean r0 = r5.A0N     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x01df
            boolean r0 = r5.A0O     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x01df
            r23 = 0
            goto L_0x020a
        L_0x01df:
            r0 = 36602230987625060(0x82098900011264, double:3.210736489703748E-306)
            long r0 = X.182.A01(r2, r3, r0)     // Catch:{ all -> 0x0243 }
            r6 = 36602230987887206(0x82098900051266, double:3.21073648986953E-306)
            long r13 = X.182.A01(r2, r3, r6)     // Catch:{ all -> 0x0243 }
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x01f6
            r0 = r13
        L_0x01f6:
            int r6 = (int) r0     // Catch:{ all -> 0x0243 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0243 }
            java.lang.String r1 = "size"
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x0243 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0243 }
            X.0eP[] r0 = new X.0eP[]{r0}     // Catch:{ all -> 0x0243 }
            java.util.LinkedHashMap r23 = X.0Yt.A07(r0)     // Catch:{ all -> 0x0243 }
        L_0x020a:
            r22 = r12
            r24 = r4
            r19 = r3
            X.1OC r1 = X.C290985gK.A01(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0243 }
            X.5gN r0 = new X.5gN     // Catch:{ all -> 0x0243 }
            r0.<init>(r5)     // Catch:{ all -> 0x0243 }
            r1.A00 = r0     // Catch:{ all -> 0x0243 }
            X.4D6 r0 = X.AnonymousClass1HI.A00()     // Catch:{ all -> 0x0243 }
            r0.schedule(r1)     // Catch:{ all -> 0x0243 }
            r8.put(r10, r1)     // Catch:{ all -> 0x0243 }
        L_0x0225:
            r0 = 0
        L_0x0226:
            if (r0 >= r9) goto L_0x022e
            r16.lock()
            int r0 = r0 + 1
            goto L_0x0226
        L_0x022e:
            r15.unlock()
            goto L_0x0179
        L_0x0233:
            if (r15 == 0) goto L_0x023b
            java.util.Set[] r0 = new java.util.Set[r0]
            r0[r4] = r8
            goto L_0x016f
        L_0x023b:
            if (r14 == 0) goto L_0x015c
            java.util.Set[] r0 = new java.util.Set[]{r10, r8, r1}
            goto L_0x0171
        L_0x0243:
            r0 = move-exception
        L_0x0244:
            if (r4 >= r9) goto L_0x024c
            r16.lock()
            int r4 = r4 + 1
            goto L_0x0244
        L_0x024c:
            r15.unlock()
            throw r0
        L_0x0250:
            com.instagram.common.session.UserSession r0 = r5.A0I
            X.5g4 r0 = X.C290825g1.A00(r0)
            r0.A03(r7)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.banyan.BanyanCoordinator.A04(com.instagram.banyan.BanyanCoordinator):void");
    }

    public static final void A05(BanyanCoordinator banyanCoordinator, User user) {
        InterruptedException th;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    if (user.CXO() || user.isRestricted()) {
                        C290675fi r4 = banyanCoordinator.A07;
                        C290655fg r5 = r4.A02;
                        r5.A00();
                        if (r4.A0A.remove(user.getId()) != null) {
                            for (C290935gF r0 : r4.A07.values()) {
                                r0.A04.remove(user.getId());
                            }
                        }
                        r5.A00();
                        Iterator it = r4.A08.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            C290915gD r02 = (C290915gD) entry.getValue();
                            if (r02 != null) {
                                List unmodifiableList = Collections.unmodifiableList(r02.A0B);
                                0qQ.A07(unmodifiableList);
                                if (00k.A0u(unmodifiableList, user)) {
                                    it.remove();
                                    for (C290935gF r03 : r4.A07.values()) {
                                        0u4.A03(r03.A04).remove(key);
                                    }
                                }
                            }
                        }
                    }
                    C290675fi r2 = banyanCoordinator.A07;
                    r2.A02.A00();
                    C290675fi.A00(r2, (C293635l6) null);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    th = th2;
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    private final void A06(String str, String str2) {
        if (str.equals("reshare_share_sheet")) {
            02m.A0p.markerPoint(145755797, str2);
        }
    }

    public final DirectShareTarget A08(String str) {
        Lock writeLock;
        DirectShareTarget directShareTarget;
        try {
            C290655fg r1 = this.A09;
            if (r1.A01) {
                writeLock = r1.A00.readLock();
            } else {
                writeLock = r1.A00.writeLock();
            }
            if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                C290675fi r12 = this.A07;
                r12.A02.A00();
                C290915gD r6 = (C290915gD) r12.A08.get(str);
                if (r6 != null) {
                    directShareTarget = C291165gf.A00((AnonymousClass2hV) null, r6, this.A0I, (Boolean) null, (Double) null, (String) null);
                } else {
                    directShareTarget = null;
                }
                writeLock.unlock();
                return directShareTarget;
            }
            throw new InterruptedException("Failed to claim lock after 1 seconds");
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            return null;
        } catch (IOException e2) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e2);
            return null;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public final String A09(String str) {
        Lock writeLock;
        InterruptedException th;
        try {
            C290655fg r1 = this.A09;
            if (r1.A01) {
                writeLock = r1.A00.readLock();
            } else {
                writeLock = r1.A00.writeLock();
            }
            if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    C290935gF A022 = this.A07.A02(str);
                    if (A022 != null) {
                        String str2 = A022.A02;
                        writeLock.unlock();
                        return str2;
                    }
                    writeLock.unlock();
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    writeLock.unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (IOException | InterruptedException e) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            return null;
        }
    }

    public final void A0A() {
        ArrayList arrayList;
        Lock writeLock;
        InterruptedException th;
        int i;
        ArrayList arrayList2;
        C290855g4 r1;
        InterruptedException th2;
        User A002;
        UserSession userSession = this.A0I;
        C290855g4.A01(C290825g1.A00(userSession));
        C290675fi r8 = this.A07;
        AtomicBoolean atomicBoolean = r8.A0C;
        if (!atomicBoolean.get()) {
            AtomicBoolean atomicBoolean2 = r8.A0B;
            if (!atomicBoolean2.get()) {
                atomicBoolean2.set(true);
                if (Systrace.A0E(1)) {
                    0fS.A01("BanyanCache::loadFromDisk", -786678983);
                }
                try {
                    if (C290825g1.A00(userSession).A00 != null) {
                        02m.A0p.markerPoint(135806945, "disk_fetch_start");
                    }
                    C290655fg r13 = r8.A02;
                    ReentrantReadWriteLock reentrantReadWriteLock = r13.A00;
                    if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                        try {
                            r13.A00();
                            r8.A04(false);
                            if (Systrace.A0E(1)) {
                                0fS.A01("BanyanCache::loadFromSharedPreferences", -1907660100);
                            }
                            for (Map.Entry entry : r8.A05.getAll().entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (!(str == null || value == null)) {
                                    0qQ.A0B("user:", 1);
                                    if (str.startsWith("user:")) {
                                        if (182.A06(0Tu.A05, r8.A03, 36320416710140320L)) {
                                            A002 = 15n.A00((String) value);
                                        } else {
                                            A002 = AnonymousClass16y.A00(0c9.A04.A01(userSession, (String) value));
                                        }
                                        0qQ.A07(A002);
                                        Parcelable.Creator creator = User.CREATOR;
                                        User user = new User(A002.getId(), A002.getUsername());
                                        user.A0k(userSession, A002, false);
                                        r8.A0A.put(A002.getId(), user);
                                        C257513xW r132 = r8.A01;
                                        String fullName = user.getFullName();
                                        if (fullName == null) {
                                            fullName = "";
                                        }
                                        r132.E5L(002.A0T(fullName, user.getUsername(), ' '), user.getId());
                                    } else {
                                        0qQ.A0B("thread:", 1);
                                        if (str.startsWith("thread:")) {
                                            C290915gD parseFromJson = C290905gC.parseFromJson(0c9.A04.A01(userSession, (String) value));
                                            if (parseFromJson != null) {
                                                r8.A08.put(parseFromJson.A09, parseFromJson);
                                                C290675fi.A01(r8, parseFromJson);
                                            }
                                        } else {
                                            0qQ.A0B("ranking_store:", 1);
                                            if (str.startsWith("ranking_store:")) {
                                                C290935gF parseFromJson2 = C290925gE.parseFromJson(16P.A00((String) value));
                                                r8.A07.put(parseFromJson2.A03, parseFromJson2);
                                            }
                                        }
                                    }
                                }
                            }
                            if (Systrace.A0E(1)) {
                                0fS.A00(-1337041578);
                            }
                            atomicBoolean.set(true);
                            reentrantReadWriteLock.writeLock().unlock();
                            atomicBoolean2.set(false);
                            r1 = C290825g1.A00(userSession);
                            arrayList2 = new ArrayList(r8.A07.values());
                            if (r1.A00 != null) {
                                C290855g4.A02(true, "disk_fetch_end", arrayList2);
                            }
                            if (Systrace.A0E(1)) {
                                0fS.A00(844609465);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            reentrantReadWriteLock.writeLock().unlock();
                        }
                    } else {
                        th2 = new InterruptedException("Failed to claim lock after 1 seconds");
                        throw th2;
                    }
                } catch (IOException e) {
                    0wb.A06("BanyanCache", "IOException occurred loading banyan", e);
                    r8.A04(true);
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    r1 = C290825g1.A00(userSession);
                    arrayList2 = new ArrayList(r8.A07.values());
                } catch (InterruptedException e2) {
                    0KC.A0F("BanyanCache", "Unable to acquire lock for executing this block.", e2);
                    atomicBoolean2.set(false);
                    r1 = C290825g1.A00(userSession);
                    arrayList2 = new ArrayList(r8.A07.values());
                } catch (Throwable th4) {
                    th = th4;
                    if (Systrace.A0E(1)) {
                        0fS.A00(1520067387);
                        throw th;
                    }
                }
            }
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328907858788010L)) {
            C290695fo r133 = this.A0B;
            AtomicBoolean atomicBoolean3 = r133.A04;
            if (!atomicBoolean3.get()) {
                AtomicBoolean atomicBoolean4 = r133.A03;
                if (!atomicBoolean4.get()) {
                    atomicBoolean4.set(true);
                    if (Systrace.A0E(1)) {
                        0fS.A01("BanyanCache::loadFromDisk", -561990904);
                    }
                    C290665fh r3 = r133.A00;
                    ReentrantReadWriteLock.ReadLock readLock = r3.readLock();
                    int i2 = 0;
                    if (r3.getWriteHoldCount() == 0) {
                        i = r3.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock2 = r3.writeLock();
                    writeLock2.lock();
                    try {
                        r133.A02.clear();
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock2.unlock();
                        r133.A00();
                        atomicBoolean3.set(true);
                        if (Systrace.A0E(1)) {
                            0fS.A00(1569076635);
                        }
                        atomicBoolean4.set(false);
                    } catch (Throwable th5) {
                        th = th5;
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock2.unlock();
                        throw th;
                    }
                }
            }
        }
        try {
            C290655fg r12 = this.A09;
            if (r12.A01) {
                writeLock = r12.A00.readLock();
            } else {
                writeLock = r12.A00.writeLock();
            }
            if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    r8.A02.A00();
                    LinkedList linkedList = new LinkedList();
                    Iterator it = r8.A06.iterator();
                    0qQ.A07(it);
                    while (it.hasNext()) {
                        Object next = it.next();
                        0qQ.A07(next);
                        Map map = r8.A07;
                        if (map.containsKey(next)) {
                            Object obj = map.get(next);
                            0qQ.A0A(obj);
                            if (((C290935gF) obj).A01 >= System.currentTimeMillis()) {
                            }
                        }
                        linkedList.add(next);
                    }
                    List unmodifiableList = Collections.unmodifiableList(linkedList);
                    0qQ.A07(unmodifiableList);
                    ArrayList arrayList3 = new ArrayList(unmodifiableList);
                    arrayList = new ArrayList(00k.A0X(arrayList3));
                    boolean A062 = 182.A06(r2, userSession, 36313454566639623L);
                    String[] strArr = A0T;
                    int i4 = 0;
                    do {
                        String str2 = strArr[i4];
                        if (arrayList3.contains(str2) && r8.A02(str2) != null && A062) {
                            arrayList.remove(str2);
                        }
                        i4++;
                    } while (i4 < 4);
                    writeLock.unlock();
                    this.A02 = arrayList;
                    this.A00 = 0;
                    A04(this);
                    if (182.A06(r2, userSession, 36328907858788010L)) {
                        0xa r32 = this.A0B.A01;
                        if (r32.getLong("last_sync_timestamp_sec", -1) < System.currentTimeMillis() || r32.getAll().isEmpty()) {
                            1NY r33 = new 1NY(userSession, -2);
                            List singletonList = Collections.singletonList(AnonymousClass000.A00(3987));
                            0qQ.A07(singletonList);
                            r33.A05();
                            r33.A02();
                            r33.A0A("api/v1/stories/private_stories/friend_lists/");
                            r33.A0Q(CDI.class, C45608CzK.class);
                            r33.A9m("list_types", 0mh.A00(singletonList));
                            1OC A0M2 = r33.A0M();
                            A0M2.A00 = new C68515NLm(this);
                            AnonymousClass1HI.A00().schedule(A0M2);
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    writeLock.unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (IOException | InterruptedException e3) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e3);
            arrayList = new ArrayList();
        }
    }

    public final void A0B() {
        int i;
        int i2;
        UserSession userSession = this.A0I;
        0Tu r11 = 0Tu.A05;
        if (182.A06(r11, userSession, 36321997256402829L)) {
            C290715fq r1 = this.A08;
            ReentrantReadWriteLock.WriteLock writeLock = r1.writeLock();
            0qQ.A07(writeLock);
            if (writeLock.tryLock()) {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock = this.A0L;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    readLock.lock();
                    try {
                        HashMap hashMap = this.A0K;
                        Map A0B2 = 0Yt.A0B(hashMap);
                        readLock.unlock();
                        Set keySet = A0B2.keySet();
                        int i3 = 0;
                        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                            Iterator it = keySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Set) it.next()).contains("direct_ibc_nullstate")) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        ReentrantReadWriteLock.ReadLock readLock2 = r1.readLock();
                        int i4 = 0;
                        if (r1.getWriteHoldCount() == 0) {
                            i = r1.getReadHoldCount();
                            for (int i5 = 0; i5 < i; i5++) {
                                readLock2.unlock();
                            }
                        } else {
                            i = 0;
                        }
                        ReentrantReadWriteLock.WriteLock writeLock2 = r1.writeLock();
                        writeLock2.lock();
                        try {
                            AnonymousClass0eM r13 = this.A0M;
                            long j = ((A61) r13.getValue()).A01.getLong("timestamp", -1);
                            if (j == -1) {
                                while (i4 < i) {
                                    readLock2.lock();
                                    i4++;
                                }
                            } else if (((double) ((System.currentTimeMillis() / 1000) - j)) <= 182.A00(r11, userSession, 37166422186721712L)) {
                                for (int i6 = 0; i6 < i; i6++) {
                                    readLock2.lock();
                                }
                                writeLock2.unlock();
                                writeLock.unlock();
                                return;
                            } else {
                                while (i4 < i) {
                                    readLock2.lock();
                                    i4++;
                                }
                            }
                            writeLock2.unlock();
                            List singletonList = Collections.singletonList("direct_ibc_nullstate");
                            0qQ.A07(singletonList);
                            1OC A012 = C290985gK.A01(userSession, false, (String) null, singletonList, (Map) null, false);
                            A012.A00 = new C291015gN(this);
                            AnonymousClass1HI.A00().schedule(A012);
                            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock.readLock();
                            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                i2 = reentrantReadWriteLock.getReadHoldCount();
                                for (int i7 = 0; i7 < i2; i7++) {
                                    readLock3.unlock();
                                }
                            } else {
                                i2 = 0;
                            }
                            ReentrantReadWriteLock.WriteLock writeLock3 = reentrantReadWriteLock.writeLock();
                            writeLock3.lock();
                            try {
                                Set singleton = Collections.singleton("direct_ibc_nullstate");
                                0qQ.A07(singleton);
                                hashMap.put(singleton, A012);
                                while (i3 < i2) {
                                    readLock3.lock();
                                    i3++;
                                }
                                writeLock3.unlock();
                                A61 a61 = (A61) r13.getValue();
                                if (a61.A00.writeLock().isHeldByCurrentThread()) {
                                    0xY AR4 = a61.A01.AR4();
                                    AR4.AHM();
                                    AR4.E5c("timestamp", System.currentTimeMillis() / 1000);
                                    AR4.apply();
                                    writeLock.unlock();
                                    return;
                                }
                                th = new IllegalStateException("Check failed.");
                                throw th;
                            } catch (Throwable th) {
                                th = th;
                                while (i3 < i2) {
                                    readLock3.lock();
                                    i3++;
                                }
                                writeLock3.unlock();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            while (i4 < i) {
                                readLock2.lock();
                                i4++;
                            }
                            writeLock2.unlock();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        readLock.unlock();
                    }
                } catch (IOException e) {
                    0wb.A06("IBCCache", "Unable to save to disk", e);
                } catch (Throwable th4) {
                    writeLock.unlock();
                    throw th4;
                }
            }
        }
    }

    public final void A0C(C290995gL r8, String str, boolean z) {
        InterruptedException th;
        C293635l6 r1;
        C290855g4 A002 = C290825g1.A00(this.A0I);
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                if (!z) {
                    try {
                        for (C290935gF r3 : r8.A03) {
                            C290935gF A022 = this.A07.A02(r3.A03);
                            0qQ.A0A(A022);
                            OOd.A00(A022, r3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                }
                C290675fi r5 = this.A07;
                r5.A03(r8);
                if (str.equals("GraphQL")) {
                    r5.A02.A00();
                    ArrayList arrayList = new ArrayList(r5.A07.values());
                    C290875g6 r2 = A002.A00;
                    if (r2 != null) {
                        C290855g4.A02((Boolean) null, "disk_persist_gql_start", arrayList);
                        r2.A00.add("GraphQL");
                    }
                }
                if (str.length() > 0) {
                    r1 = new C293635l6(this, str);
                } else {
                    r1 = null;
                }
                r5.A02.A00();
                C290675fi.A00(r5, r1);
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            th = new InterruptedException("Failed to claim lock after 1 seconds");
            throw th;
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    public final void A0D(String str) {
        InterruptedException th;
        if (this.A0R) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
                if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        C290675fi r2 = this.A07;
                        r2.A04.ATE(new NRf(r2, str));
                        reentrantReadWriteLock.writeLock().unlock();
                    } catch (Throwable th2) {
                        th = th2;
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                } else {
                    th = new InterruptedException("Failed to claim lock after 1 seconds");
                    throw th;
                }
            } catch (InterruptedException e) {
                0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            }
        }
    }

    public final void A0E(String str) {
        InterruptedException th;
        if (this.A0S) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
                if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        C290675fi r2 = this.A07;
                        r2.A04.ATE(new C68649NRg(r2, str));
                        reentrantReadWriteLock.writeLock().unlock();
                    } catch (Throwable th2) {
                        th = th2;
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                } else {
                    th = new InterruptedException("Failed to claim lock after 1 seconds");
                    throw th;
                }
            } catch (InterruptedException e) {
                0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            }
        }
    }

    public final void A0F(String str) {
        InterruptedException th;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    C290675fi r2 = this.A07;
                    r2.A04.ATE(new C68650NRh(r2, str));
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    th = th2;
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    public final void A0H(boolean z) {
        InterruptedException th;
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        int i2;
        ReentrantReadWriteLock.WriteLock writeLock;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A09.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock2 = this.A0L;
                    readLock = reentrantReadWriteLock2.readLock();
                    if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                        i2 = reentrantReadWriteLock2.getReadHoldCount();
                        for (int i3 = 0; i3 < i2; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i2 = 0;
                    }
                    writeLock = reentrantReadWriteLock2.writeLock();
                    writeLock.lock();
                    HashMap hashMap = this.A0K;
                    if (!hashMap.isEmpty()) {
                        for (Object next : hashMap.values()) {
                            0qQ.A07(next);
                            ((1OC) next).cancel();
                        }
                        hashMap.clear();
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        readLock.lock();
                    }
                    writeLock.unlock();
                    1Ng A002 = AnonymousClass1Nd.A00(this.A0I);
                    A002.A02(this.A0F, 27U.class);
                    A002.A02(this.A0H, C290835g2.class);
                    A002.A02(this.A0G, AnonymousClass3KA.class);
                    A002.A02(this.A0E, 2Kd.class);
                    A002.A02(this.A0D, C290845g3.class);
                    A002.A02(this.A0C, C70162Jt.class);
                    14i r0 = 14i.A08;
                    14i.A06(this.A0Q);
                    this.A07.A04(z);
                    this.A02 = null;
                    this.A04 = false;
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    th = th2;
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.concurrent.locks.ReentrantReadWriteLock, X.5fh] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.5fp, java.util.concurrent.locks.ReentrantReadWriteLock] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.5fq, java.util.concurrent.locks.ReentrantReadWriteLock] */
    public BanyanCoordinator(UserSession userSession) {
        this.A0I = userSession;
        0Tu r2 = 0Tu.A05;
        C290655fg r1 = new C290655fg(182.A06(r2, userSession, 36323358761102441L));
        this.A09 = r1;
        this.A05 = new ReentrantReadWriteLock();
        this.A07 = new C290675fi(r1, userSession);
        this.A0B = new C290695fo(this.A05, userSession);
        this.A0A = new ReentrantReadWriteLock();
        this.A0M = AnonymousClass0eN.A00(0eO.A03, new AnonymousClass9M0(34, userSession, this));
        this.A08 = new ReentrantReadWriteLock();
        this.A0O = 182.A06(r2, userSession, 36320756011049793L);
        this.A0N = 182.A06(r2, userSession, 36320756010984256L);
        this.A0R = 182.A06(r2, userSession, 36317521900672267L);
        this.A0S = 182.A06(r2, userSession, 36317521901196557L);
        this.A06 = (int) 182.A01(r2, userSession, 36598996877708634L);
        this.A0F = new C290725fr(this);
        this.A0H = new C290735fs(this);
        this.A0G = new C290745ft(this);
        this.A0E = new C290755fu(this);
        this.A0D = new C290765fv(this, userSession);
        this.A0C = new C290775fw(this, userSession);
        C290785fx r22 = new C290785fx(this, userSession);
        this.A0Q = r22;
        this.A0J = 0nY.A00();
        this.A0P = (C290795fy) userSession.A01(C290795fy.class, new MMP(userSession, 33));
        14i.A03(15Y.A03, r22);
    }

    public final void A0G(ArrayList arrayList) {
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        A002.ATE(new C68651NRi(this, arrayList));
    }
}
