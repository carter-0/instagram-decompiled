package com.instagram.newsfeed.viewmodel;

import X.05G;
import X.0qQ;
import X.1Ng;
import X.2ah;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass11E;
import X.AnonymousClass4D7;
import X.AnonymousClass5GM;
import X.AnonymousClass5GP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C294645mn;
import X.C318116oQ;
import X.C318136oS;
import X.C361478gI;
import X.C46513DgG;
import X.C51645Fy4;
import X.C51865G4z;
import X.C59815JZm;
import X.C59816JZn;
import X.C66193MHj;
import X.C66920MfE;
import X.JV7;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.repository.common.FeedPagedData;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;

public final class ActivityFeedViewModel extends C361478gI {
    public C294645mn A00;
    public FeedPagedData A01;
    public boolean A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C46513DgG A05;
    public final AnonymousClass5GM A06;
    public final ActivityFeedRecommendedUserRepository A07;
    public final ActivityFeedRepository A08;
    public final C59816JZn A09;
    public final C59815JZm A0A;
    public final 2ah A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final 1Ng A0I;
    public final AnonymousClass0r6 A0J;
    public final AnonymousClass0Ud A0K;

    public final void A0G(JV7 jv7, User user, int i) {
        0qQ.A0B(user, 0);
        C318136oS A002 = C318116oQ.A00(this);
        JV7 jv72 = jv7;
        AnonymousClass7TE.A1Z(new ActivityFeedViewModel$followUser$1(jv72, this, user, (AnonymousClass4D7) null, i), A002);
        A0F();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60340gF A00(X.C283155Gi r5, com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 10
            boolean r0 = X.ME9.A03(r3, r7)
            if (r0 == 0) goto L_0x0085
            r4 = r7
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0085
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 != r3) goto L_0x008b
            java.lang.Object r5 = r4.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r6 = r4.A01
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r6 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r6
            X.0eS.A00(r1)
        L_0x002a:
            X.5GM r0 = r6.A06
            java.lang.String r6 = r5.A09
            X.0qQ.A07(r6)
            X.05G r5 = r0.A06
        L_0x0033:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.5GP r1 = (X.AnonymousClass5GP) r1
            boolean r0 = r1 instanceof X.AnonymousClass5GQ
            if (r0 == 0) goto L_0x007c
            X.5GQ r1 = (X.AnonymousClass5GQ) r1
            java.lang.Object r0 = r1.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x004c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r0 = r0.A09
            X.DbY.A1T(r0, r6, r1, r3)
            goto L_0x004c
        L_0x005f:
            X.0eS.A00(r1)
            if (r5 == 0) goto L_0x0082
            com.instagram.repository.common.FeedPagedData r2 = r6.A01
            r1 = 14
            X.G4U r0 = new X.G4U
            r0.<init>(r5, r1)
            r4.A01 = r6
            r4.A02 = r5
            r4.A00 = r3
            com.instagram.repository.common.FeedPagedData.A01(r2, r0)
            goto L_0x002a
        L_0x0077:
            X.5GQ r1 = new X.5GQ
            r1.<init>(r3)
        L_0x007c:
            boolean r0 = r5.AIY(r4, r1)
            if (r0 == 0) goto L_0x0033
        L_0x0082:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0085:
            X.ME9 r4 = new X.ME9
            r4.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.A00(X.5Gi, com.instagram.newsfeed.viewmodel.ActivityFeedViewModel, X.4D7):X.0gF");
    }

    public static final void A01(C51865G4z g4z, ActivityFeedViewModel activityFeedViewModel) {
        Object value;
        LinkedHashSet linkedHashSet;
        05G r3 = activityFeedViewModel.A0C;
        do {
            value = r3.getValue();
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) value;
            0qQ.A0B(linkedHashSet2, 0);
            linkedHashSet = new LinkedHashSet(linkedHashSet2);
            linkedHashSet.add(g4z);
        } while (!r3.AIY(value, linkedHashSet));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    public final AnonymousClass0r6 A0E(C294645mn r12, boolean z, boolean z2) {
        Object obj;
        ? obj2 = new Object();
        if (!z || !z2) {
            obj = null;
        } else {
            obj = ((AnonymousClass5GP) this.A01.A02.getValue()).A00();
        }
        obj2.A00 = obj;
        if (!r12.equals(this.A00) || z) {
            this.A00 = r12;
            this.A01 = this.A08.A01(r12, z);
            C59816JZn jZn = this.A09;
            C318136oS A002 = C318116oQ.A00(this);
            if (AnonymousClass7TF.A1Z(jZn.A03) && jZn.A00) {
                jZn.A00(A002);
                jZn.A00 = false;
            }
            C51645Fy4.A01(this, C318116oQ.A00(this), 35);
        }
        return AnonymousClass11E.A01(AnonymousClass10H.A03(new C66193MHj(33, (AnonymousClass4D7) null), AnonymousClass10H.A02(new ActivityFeedViewModel$getUiState$2(r12, this, (AnonymousClass4D7) null, obj2), this.A01.A01, this.A0J, this.A0C, this.A0D, this.A0K), this.A0E));
    }

    public final void A0F() {
        Object value;
        C66920MfE mfE;
        05G r5 = this.A0D;
        do {
            value = r5.getValue();
            mfE = (C66920MfE) value;
        } while (!r5.AIY(value, new C66920MfE(mfE.A01 + 1, mfE.A02, 4)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0067, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 36322684451236191L) != false) goto L_0x0069;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityFeedViewModel(android.app.Application r20, X.AnonymousClass0iw r21, X.1Ng r22, com.instagram.common.session.UserSession r23, X.C294645mn r24, X.C46513DgG r25, X.AnonymousClass5GM r26, com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository r27, com.instagram.newsfeed.data.ActivityFeedRepository r28, X.C59816JZn r29, X.C59815JZm r30, X.2ah r31) {
        /*
            r19 = this;
            r3 = 1
            r14 = r20
            r15 = r24
            int r18 = X.DbW.A02(r3, r14, r15)
            r17 = 3
            r13 = 4
            r9 = r28
            X.0qQ.A0B(r9, r13)
            r12 = 5
            r10 = r26
            X.0qQ.A0B(r10, r12)
            r0 = 6
            r1 = r27
            r8 = r29
            X.AnonymousClass7TF.A1E(r1, r0, r8)
            r0 = 8
            r6 = r22
            r2 = r31
            X.AnonymousClass7TF.A1G(r2, r0, r6)
            r0 = 11
            r11 = r21
            r4 = r25
            X.DbW.A1P(r11, r0, r4)
            r7 = r19
            r7.<init>(r14)
            r5 = r23
            r7.A04 = r5
            r7.A08 = r9
            r7.A06 = r10
            r7.A07 = r1
            r7.A09 = r8
            r7.A0B = r2
            r7.A0I = r6
            r0 = r30
            r7.A0A = r0
            r7.A03 = r11
            r7.A05 = r4
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321481861244339(0x810a32000e25b3, double:3.033189611694587E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0069
            X.0Tu r11 = X.0Tu.A06
            r0 = 36322684451236191(0x810b4a0001295f, double:3.0339501344478756E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            r11 = 0
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r11 = 1
        L_0x006a:
            r7.A0F = r11
            r0 = 36319935672950576(0x8108ca000d1f30, double:3.032211795991611E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r7.A0H = r0
            r0 = 36319935673016113(0x8108ca000e1f31, double:3.032211796033057E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r7.A0G = r0
            r0 = 36330552831263412(0x811272000042b4, double:3.0389261296605135E-306)
            boolean r16 = X.182.A06(r2, r5, r0)
            r7.A00 = r15
            android.content.Context r0 = X.DbT.A05(r14)
            X.C267044ar.A00(r0, r5)
            X.5mn r0 = r7.A00
            r2 = 0
            r5 = 0
            com.instagram.newsfeed.data.ActivityPagedData r9 = r9.A01(r0, r5)
            X.6oS r1 = X.C318116oQ.A00(r7)
            r0 = 37
            X.C51645Fy4.A01(r9, r1, r0)
            r7.A01 = r9
            X.0r6 r0 = r10.A05
            if (r11 == 0) goto L_0x00ae
            r10.A02()
        L_0x00ae:
            r7.A0J = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            X.02z r0 = X.DbS.A10(r0)
            r7.A0C = r0
            X.02z r0 = X.106.A01(r2)
            r7.A0E = r0
            if (r16 == 0) goto L_0x01ca
            X.0Ud r0 = r8.A05
        L_0x00c4:
            r7.A0K = r0
            java.util.concurrent.atomic.AtomicLong r0 = r4.A01
            long r15 = r0.get()
            long r0 = r4.A00
            long r15 = r15 + r0
            long r9 = java.lang.System.currentTimeMillis()
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            java.util.concurrent.atomic.AtomicReference r1 = r4.A02
            X.MfE r0 = new X.MfE
            r0.<init>()
            r1.set(r0)
        L_0x00e1:
            java.util.concurrent.atomic.AtomicReference r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            X.02z r0 = X.106.A01(r0)
            r7.A0D = r0
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.FVx> r0 = X.C50266FVx.class
            X.032 r4 = r1.A00(r0)
            r1 = 49
            X.MGW r0 = new X.MGW
            r0.<init>(r7, r2, r1)
            X.DbY.A19(r7, r0, r4)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.INm> r0 = X.C57072INm.class
            X.032 r4 = r1.A00(r0)
            r1 = 41
            X.MH3 r0 = new X.MH3
            r0.<init>(r7, r2, r1)
            X.DbY.A19(r7, r0, r4)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.Lfv> r0 = X.C64669Lfv.class
            X.032 r4 = r1.A00(r0)
            r1 = 42
            X.MH3 r0 = new X.MH3
            r0.<init>(r7, r2, r1)
            X.DbY.A19(r7, r0, r4)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.6qz> r0 = X.C319666qz.class
            X.032 r1 = r1.A00(r0)
            X.Fy7 r0 = new X.Fy7
            r0.<init>(r7, r2, r5)
            X.DbY.A19(r7, r0, r1)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.WQA> r0 = X.WQA.class
            X.032 r4 = r1.A00(r0)
            X.Fy5 r1 = new X.Fy5
            r0 = r17
            r1.<init>(r7, r2, r0)
            X.DbY.A19(r7, r1, r4)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.FWO> r0 = X.FWO.class
            X.032 r1 = r1.A00(r0)
            X.Fy7 r0 = new X.Fy7
            r0.<init>(r7, r2, r3)
            X.DbY.A19(r7, r0, r1)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.36g> r0 = X.C2370836g.class
            X.032 r3 = r1.A00(r0)
            r0 = 50
            X.0r6 r3 = X.AnonymousClass11F.A00(r3, r0)
            r1 = 34
            X.Fy4 r0 = new X.Fy4
            r0.<init>(r7, r2, r1)
            X.DbY.A19(r7, r0, r3)
            X.64X r1 = new X.64X
            r1.<init>(r6)
            java.lang.Class<X.FWi> r0 = X.C50277FWi.class
            X.032 r3 = r1.A00(r0)
            X.Fy7 r1 = new X.Fy7
            r0 = r18
            r1.<init>(r7, r14, r2, r0)
            X.DbY.A19(r7, r1, r3)
            X.1xC r3 = X.1xC.A01
            X.64X r1 = new X.64X
            r1.<init>(r3)
            java.lang.Class<X.FVi> r0 = X.C50251FVi.class
            X.032 r1 = r1.A00(r0)
            X.Fy5 r0 = new X.Fy5
            r0.<init>(r7, r2, r13)
            X.DbY.A19(r7, r0, r1)
            X.64X r1 = new X.64X
            r1.<init>(r3)
            java.lang.Class<X.3H2> r0 = X.AnonymousClass3H2.class
            X.032 r1 = r1.A00(r0)
            X.Fy5 r0 = new X.Fy5
            r0.<init>(r7, r2, r12)
            X.DbY.A19(r7, r0, r1)
            X.6oS r0 = X.C318116oQ.A00(r7)
            r8.A00(r0)
            return
        L_0x01ca:
            X.0sn r1 = X.0sn.A00
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r3)
            X.02z r0 = X.DbS.A10(r0)
            X.05F r0 = X.10b.A03(r0)
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.<init>(android.app.Application, X.0iw, X.1Ng, com.instagram.common.session.UserSession, X.5mn, X.DgG, X.5GM, com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository, com.instagram.newsfeed.data.ActivityFeedRepository, X.JZn, X.JZm, X.2ah):void");
    }
}
