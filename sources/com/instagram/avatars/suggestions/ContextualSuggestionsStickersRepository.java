package com.instagram.avatars.suggestions;

import X.02m;
import X.0eO;
import X.0qQ;
import X.1Er;
import X.25x;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0r6;
import X.AnonymousClass27C;
import X.AnonymousClass27E;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.C252733pa;
import X.C297395rg;
import X.C317846nw;
import X.C317866ny;
import X.C318056oJ;
import X.C51966G9m;
import X.DbW;
import X.MFS;
import X.MMP;
import X.MVY;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ContextualSuggestionsStickersRepository extends C252733pa implements MVY {
    public AnonymousClass27E A00 = AnonymousClass27C.A00;
    public final C317846nw A01;
    public final C317866ny A02;
    public final AvatarStore A03;
    public final 02m A04;
    public final UserSession A05;
    public final C318056oJ A06;
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A00(0eO.A02, new MMP(this, 25));
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101 A[PHI: r2 
      PHI: (r2v1 java.lang.Object) = (r2v2 java.lang.Object), (r2v0 java.lang.Object) binds: [B:29:0x00a5, B:51:0x00fe] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r14, java.lang.String r15, X.AnonymousClass4D7 r16, boolean r17) {
        /*
            r0 = r14
            r6 = r15
            r4 = r17
            r9 = 3
            r7 = r16
            boolean r1 = X.C66140MDs.A01(r9, r7)
            if (r1 == 0) goto L_0x0030
            r5 = r7
            X.MDs r5 = (X.C66140MDs) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0030
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001b:
            java.lang.Object r2 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r8 = r5.A00
            r1 = 2
            r7 = 1
            if (r8 == 0) goto L_0x0036
            if (r8 == r7) goto L_0x0081
            if (r8 == r1) goto L_0x00fe
            if (r8 == r9) goto L_0x00fe
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0030:
            X.MDs r5 = new X.MDs
            r5.<init>(r14, r7, r9)
            goto L_0x001b
        L_0x0036:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r9 = r14.A05
            X.0Tu r8 = X.0Tu.A05
            r1 = 36322096040847293(0x810ac1000327bd, double:3.033578021348598E-306)
            boolean r1 = X.182.A06(r8, r9, r1)
            if (r1 == 0) goto L_0x007f
            r1 = 36603571017618360(0x820ac1000413b8, double:3.2115839300673784E-306)
            int r1 = X.DbS.A04(r8, r9, r1)
            java.lang.Integer r14 = X.JTO.A0w(r1)
        L_0x0055:
            if (r17 == 0) goto L_0x007c
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
        L_0x0059:
            X.6oJ r8 = r0.A06
            X.6ny r11 = r0.A02
            X.6nw r10 = r0.A01
            r9 = 0
            java.lang.String r1 = "cs_"
            java.lang.String r16 = X.002.A0R(r1, r15)
            r5.A01 = r0
            r5.A02 = r15
            r5.A05 = r4
            r5.A00 = r7
            r2 = r3
            X.6oK r8 = r8.A02
            r13 = r9
            r15 = r9
            r17 = r5
            java.lang.Object r11 = r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r11 != r3) goto L_0x0090
            return r2
        L_0x007c:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x0059
        L_0x007f:
            r14 = 0
            goto L_0x0055
        L_0x0081:
            boolean r4 = r5.A05
            java.lang.Object r6 = r5.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r5.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r0 = (com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r0
            X.0eS.A00(r2)
            r11 = r2
            r2 = r3
        L_0x0090:
            X.3Ii r11 = (X.C239803Ii) r11
            boolean r1 = r11 instanceof X.C297815sO
            r12 = 0
            if (r1 == 0) goto L_0x00a8
            if (r4 == 0) goto L_0x010b
            r1 = 0
            r5.A01 = r1
            r5.A02 = r1
            r1 = 2
        L_0x009f:
            r5.A00 = r1
            java.lang.Object r0 = A00(r0, r6, r5, r12)
            if (r0 == r3) goto L_0x0101
            return r0
        L_0x00a8:
            boolean r1 = r11 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x010c
            if (r4 == 0) goto L_0x0102
            r1 = r11
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r7 = r1.A00
            X.K1h r7 = (X.C61294K1h) r7
            java.lang.String r1 = r7.A06
            boolean r9 = X.0qQ.A0K(r1, r6)
            java.util.List r1 = r7.A08
            if (r1 == 0) goto L_0x00e6
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r1.iterator()
        L_0x00c7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00df
            X.6o8 r1 = X.JTO.A0a(r7)
            com.instagram.common.typedurl.ImageUrl r1 = r1.A0H
            if (r1 == 0) goto L_0x00c7
            java.lang.Long r1 = X.C63449KxE.A00(r1)
            if (r1 == 0) goto L_0x00c7
            r8.add(r1)
            goto L_0x00c7
        L_0x00df:
            java.lang.Comparable r1 = X.00k.A06(r8)
            java.lang.Number r1 = (java.lang.Number) r1
            goto L_0x00e7
        L_0x00e6:
            r1 = 0
        L_0x00e7:
            if (r9 == 0) goto L_0x00f7
            if (r1 == 0) goto L_0x0102
            long r9 = r1.longValue()
            long r7 = X.AnonymousClass7TG.A0I()
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0102
        L_0x00f7:
            r1 = 0
            r5.A01 = r1
            r5.A02 = r1
            r1 = 3
            goto L_0x009f
        L_0x00fe:
            X.0eS.A00(r2)
        L_0x0101:
            return r2
        L_0x0102:
            r0 = r11
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.K1h r0 = (X.C61294K1h) r0
            r0.A09 = r4
        L_0x010b:
            return r11
        L_0x010c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.A00(com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDd, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r11 = this;
            r5 = 0
            boolean r0 = r12 instanceof X.MDd
            if (r0 == 0) goto L_0x00b7
            r8 = r12
            X.MDd r8 = (X.MDd) r8
            int r0 = r8.A06
            if (r0 != r5) goto L_0x00b7
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b7
            int r2 = r2 - r1
            r8.A01 = r2
        L_0x0017:
            java.lang.Object r10 = r8.A03
            X.1Hj r9 = X.1Hj.A02
            int r0 = r8.A01
            r3 = 0
            r2 = 2
            r1 = 1
            r6 = 192490478(0xb792bee, float:4.7988705E-32)
            if (r0 == 0) goto L_0x0073
            if (r0 == r1) goto L_0x0086
            if (r0 != r2) goto L_0x00be
            int r4 = r8.A00
            boolean r13 = r8.A05
            java.lang.Object r7 = r8.A02
            com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r7 = (com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r7
            X.0eS.A00(r10)
        L_0x0034:
            X.3Ii r10 = (X.C239803Ii) r10
            boolean r0 = r10 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00c3
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r9 = r10.A00
            X.K1h r9 = (X.C61294K1h) r9
            X.02m r8 = r7.A04
            boolean r5 = r9.A09
            java.lang.String r0 = "is_cache"
            r8.markerAnnotate(r6, r4, r0, r5)
            boolean r0 = r9.A09
            if (r0 == r13) goto L_0x004e
            r3 = 1
        L_0x004e:
            java.lang.String r0 = "cache_miss"
            r8.markerAnnotate(r6, r4, r0, r3)
            r8.markerEnd(r6, r4, r2)
            java.util.concurrent.ConcurrentHashMap r4 = r7.A08
            r4.clear()
            java.util.List r0 = r9.A08
            if (r0 == 0) goto L_0x00f5
            java.util.Iterator r3 = r0.iterator()
        L_0x0063:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f5
            X.6o8 r2 = X.JTO.A0a(r3)
            java.lang.String r0 = r2.A0a
            r4.put(r0, r2)
            goto L_0x0063
        L_0x0073:
            X.0eS.A00(r10)
            com.instagram.avatars.store.AvatarStore r0 = r11.A03
            r8.A02 = r11
            r8.A05 = r13
            r8.A01 = r1
            java.lang.Object r10 = r0.A02(r8, r5, r5)
            if (r10 == r9) goto L_0x00f9
            r7 = r11
            goto L_0x008f
        L_0x0086:
            boolean r13 = r8.A05
            java.lang.Object r7 = r8.A02
            com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r7 = (com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r7
            X.0eS.A00(r10)
        L_0x008f:
            X.27E r10 = (X.AnonymousClass27E) r10
            r7.A00 = r10
            boolean r0 = r10 instanceof X.C293135kC
            if (r0 == 0) goto L_0x00eb
            X.2SP r0 = X.2SP.A01
            int r4 = r0.A03()
            X.02m r0 = r7.A04
            r0.markerStart(r6, r4)
            X.5kC r10 = (X.C293135kC) r10
            X.5kB r0 = r10.A00
            java.lang.String r0 = r0.A02
            r8.A02 = r7
            r8.A05 = r13
            r8.A00 = r4
            r8.A01 = r2
            java.lang.Object r10 = A00(r7, r0, r8, r13)
            if (r10 != r9) goto L_0x0034
            return r9
        L_0x00b7:
            X.MDd r8 = new X.MDd
            r8.<init>((com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r11, (X.AnonymousClass4D7) r12)
            goto L_0x0017
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c3:
            boolean r0 = r10 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00f0
            X.4dm r0 = X.JTP.A0N(r10)
            java.lang.Throwable r3 = r0.A01()
            if (r3 == 0) goto L_0x00e5
            X.02m r2 = r7.A04
            java.lang.String r1 = X.2Og.A00(r3)
            java.lang.String r0 = "fail_stacktrace"
            r2.markerAnnotate(r6, r4, r0, r1)
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "fail_reason"
            r2.markerAnnotate(r6, r4, r0, r1)
        L_0x00e5:
            X.02m r1 = r7.A04
            r0 = 3
            r1.markerEnd(r6, r4, r0)
        L_0x00eb:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f5:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
        L_0x00f9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.A01(X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0009 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List AjS(java.util.List r6) {
        /*
            r5 = this;
            r0 = 0
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0q(r6, r0)
            java.util.Iterator r3 = r6.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = r3.next()
            X.LFl r2 = (X.C63961LFl) r2
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x003a
            r0 = 4
            if (r1 == r0) goto L_0x0036
            r0 = 6
            if (r1 != r0) goto L_0x0009
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0009
            java.util.concurrent.ConcurrentHashMap r1 = r5.A07
        L_0x002a:
            java.lang.String r0 = r2.A01
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0009
            r4.add(r0)
            goto L_0x0009
        L_0x0036:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0009
        L_0x003a:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A08
            goto L_0x002a
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.AjS(java.util.List):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E3g(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 6
            boolean r0 = X.C66128MDg.A01(r3, r8)
            if (r0 == 0) goto L_0x005b
            r6 = r8
            X.MDg r6 = (X.C66128MDg) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r4) goto L_0x0061
            java.lang.Object r0 = r6.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r0 = (com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r0
            X.0eS.A00(r1)
        L_0x0027:
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36603459348927398(0x820aa7000b13a6, double:3.21151331033756E-306)
            int r2 = X.DbS.A04(r2, r3, r0)
            java.lang.String r1 = "igd_typeahead"
            r0 = 8
            X.N4G r5 = new X.N4G
            r5.<init>((int) r2, (java.lang.String) r1, (int) r0)
        L_0x003d:
            return r5
        L_0x003e:
            X.0eS.A00(r1)
            X.4Cq r3 = r7.A01
            r2 = 0
            r1 = 29
            X.MFS r0 = new X.MFS
            r0.<init>(r7, r2, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r0 = r0.CfH(r6)
            if (r0 == r5) goto L_0x003d
            r0 = r7
            goto L_0x0027
        L_0x005b:
            X.MDg r6 = new X.MDg
            r6.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.E3g(X.4D7):java.lang.Object");
    }

    public final AnonymousClass0r6 FIB(List list) {
        return null;
    }

    public final boolean BAc() {
        ConcurrentHashMap concurrentHashMap = this.A08;
        0qQ.A0B(concurrentHashMap, 0);
        return !concurrentHashMap.isEmpty();
    }

    public final boolean CKi() {
        AnonymousClass27E r1 = this.A03.A01;
        if (!0qQ.A0K(r1, C297395rg.A00)) {
            return 0qQ.A0K(this.A00, r1);
        }
        ConcurrentHashMap concurrentHashMap = this.A08;
        0qQ.A0B(concurrentHashMap, 0);
        return AnonymousClass7TF.A1Q(concurrentHashMap.isEmpty() ^ true ? 1 : 0);
    }

    public final 1Er EBC() {
        if (!this.A09.compareAndSet(false, true)) {
            return null;
        }
        this.A08.clear();
        return C51966G9m.A1L(new MFS(this, (AnonymousClass4D7) null, 30), this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextualSuggestionsStickersRepository(C317846nw r6, C317866ny r7, 02m r8, UserSession userSession, boolean z, boolean z2) {
        super("ContextualSuggestionsStickersRepository", AnonymousClass43D.A00(1342004349));
        AvatarStore A002 = 25x.A00(userSession);
        C318056oJ r2 = new C318056oJ(userSession);
        DbW.A1N(r8, 2, r6);
        0qQ.A0B(A002, 7);
        this.A05 = userSession;
        this.A04 = r8;
        this.A0B = z;
        this.A0C = z2;
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = A002;
        this.A06 = r2;
    }
}
