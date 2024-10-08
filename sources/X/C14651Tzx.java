package X;

import com.facebook.proxygen.TraceFieldType;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Tzx  reason: case insensitive filesystem */
public final class C14651Tzx extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C14651Tzx(Object obj, Object obj2, String str, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = obj;
        this.A05 = z;
        this.A03 = str;
        this.A04 = z2;
        this.A01 = obj2;
    }

    public final void onFail(C268654dm r7) {
        int A032;
        int i;
        Long A002;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-458123745);
            C14651Tzx.super.onFail(r7);
            if (this.A05) {
                W0E A003 = C14639Tzl.A00(((ReelDashboardFragment) this.A01).A06);
                String str = this.A03;
                if (W0E.A01(A003, str) && (A002 = W0E.A00(A003, str)) != null) {
                    long longValue = A002.longValue();
                    1QP r4 = A003.A02;
                    r4.flowAnnotate(longValue, TraceFieldType.FailureReason, "ig_viewers_list_fetch_failure");
                    r4.flowEndFail(longValue, "ig_viewers_list_fetch_failure", (String) null);
                }
            }
            i = -1477884785;
        } else {
            A032 = AnonymousClass0fD.A03(-571480865);
            C13757TgT tgT = (C13757TgT) this.A01;
            if (tgT != null) {
                tgT.onFailure(r7.A01());
            }
            i = 227497566;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        boolean z;
        if (1 - this.A00 != 0) {
            C14651Tzx.super.onFinish();
            return;
        }
        int A032 = AnonymousClass0fD.A03(1405146395);
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        if (tzX != null) {
            boolean z2 = this.A04;
            String str = this.A03;
            if (!z2) {
                C14629Tzb A012 = C14625TzX.A01(tzX, str);
                if (A012 != null) {
                    z = A012.A0j.A0A;
                } else {
                    z = false;
                }
                tzX.A0A(str, z);
            } else {
                C14629Tzb A013 = C14625TzX.A01(tzX, str);
                if (A013 != null) {
                    A013.A0j.A0A = false;
                }
                reelDashboardFragment.mListAdapter.A0A(str, false);
            }
        }
        AnonymousClass0fD.A0A(687188766, A032);
    }

    public final void onStart() {
        C14629Tzb A012;
        Long A002;
        if (1 - this.A00 != 0) {
            C14651Tzx.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(1214422198);
        if (this.A05) {
            W0E A003 = C14639Tzl.A00(((ReelDashboardFragment) this.A01).A06);
            String str = this.A03;
            if (W0E.A01(A003, str) && (A002 = W0E.A00(A003, str)) != null) {
                A003.A02.flowMarkPoint(A002.longValue(), "ig_viewers_list_fetch_begin");
            }
        }
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        if (tzX != null) {
            String str2 = this.A03;
            tzX.A0A(str2, true);
            if (this.A04 && (A012 = C14625TzX.A01(reelDashboardFragment.mListAdapter, str2)) != null) {
                A012.A0j.A0A = true;
            }
        }
        AnonymousClass0fD.A0A(-682111404, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r11.A0H != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0145, code lost:
        r0 = r7.mListAdapter;
        r4 = r12.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r34) {
        /*
            r33 = this;
            r12 = r33
            r11 = r34
            int r0 = r12.A00
            if (r0 == 0) goto L_0x01b1
            r0 = 1513218769(0x5a31e2d1, float:1.25176145E16)
            int r10 = X.AnonymousClass0fD.A03(r0)
            X.B7x r11 = (X.C41945B7x) r11
            r0 = -1860753874(0xffffffff9117262e, float:-1.1923565E-28)
            int r9 = X.AnonymousClass0fD.A03(r0)
            boolean r2 = r12.A05
            if (r2 != 0) goto L_0x003d
            java.lang.Object r0 = r12.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            X.TzX r1 = r0.mListAdapter
            java.lang.String r0 = r12.A03
            X.Tzb r0 = X.C14625TzX.A01(r1, r0)
            if (r0 == 0) goto L_0x0030
            X.Dew r0 = r0.A0k
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x003d
        L_0x0030:
            r0 = -1084476899(0xffffffffbf5c321d, float:-0.86013967)
        L_0x0033:
            X.AnonymousClass0fD.A0A(r0, r9)
            r0 = -1312088008(0xffffffffb1cb2038, float:-5.9117404E-9)
        L_0x0039:
            X.AnonymousClass0fD.A0A(r0, r10)
            return
        L_0x003d:
            if (r2 == 0) goto L_0x0081
            java.lang.Object r0 = r12.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.W0E r2 = X.C14639Tzl.A00(r0)
            java.lang.String r1 = r12.A03
            int r6 = r11.A02
            java.util.List r0 = r11.A0G
            int r5 = r0.size()
            int r4 = r11.A01
            boolean r0 = X.W0E.A01(r2, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Long r0 = X.W0E.A00(r2, r1)
            if (r0 == 0) goto L_0x0081
            long r0 = r0.longValue()
            X.1QP r3 = r2.A02
            java.lang.String r2 = "total_viewer_count"
            r3.flowAnnotate(r0, r2, r6)
            java.lang.String r2 = "fetched_ig_viewers_count"
            r3.flowAnnotate(r0, r2, r5)
            java.lang.String r2 = "fb_viewer_count"
            r3.flowAnnotate(r0, r2, r4)
            int r6 = r6 - r4
            java.lang.String r2 = "ig_viewer_count"
            r3.flowAnnotate(r0, r2, r6)
            java.lang.String r2 = "ig_viewers_list_fetch_success"
            r3.flowMarkPoint(r0, r2)
        L_0x0081:
            X.C14651Tzx.super.onSuccess(r11)
            java.lang.Object r8 = r12.A02
            X.X5Q r8 = (X.X5Q) r8
            java.util.List r0 = r11.A0B
            r20 = r0
            java.util.List r21 = r11.A00()
            java.util.List r0 = r11.A0C
            r18 = r0
            java.lang.Object r7 = r12.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r7 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r7
            com.instagram.common.session.UserSession r0 = r7.A06
            com.instagram.reels.store.ReelStore r5 = com.instagram.reels.store.ReelStore.A03(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r11.A0A
            if (r0 == 0) goto L_0x00cd
            java.util.Iterator r13 = r0.iterator()
        L_0x00ab:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r4 = r13.next()
            X.Cv1 r4 = (X.C45359Cv1) r4
            X.3HX r1 = r4.A01
            if (r1 == 0) goto L_0x00ab
            r0 = 0
            com.instagram.model.reels.Reel r3 = r5.A0I(r1, r0)
            int r2 = r4.A00
            boolean r1 = r4.A02
            X.VW6 r0 = new X.VW6
            r0.<init>(r3, r2, r1)
            r6.add(r0)
            goto L_0x00ab
        L_0x00cd:
            int r0 = r11.A02
            r17 = r0
            java.lang.String r0 = r11.A09
            r19 = r0
            X.VcV r15 = r11.A04
            java.lang.Boolean r14 = r11.A06
            int r5 = r11.A00
            int r4 = r11.A01
            java.util.List r3 = r11.A0G
            java.util.List r2 = r11.A0D
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r11.A0E
            if (r0 == 0) goto L_0x010c
            java.util.Iterator r16 = r0.iterator()
        L_0x00ee:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r13 = r16.next()
            X.1bK r13 = (X.1bK) r13
            java.lang.Boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0108
            r1.add(r13)
            goto L_0x00ee
        L_0x0108:
            r0 = 1
            r11.A0H = r0
            goto L_0x00ee
        L_0x010c:
            boolean r0 = r11.A0I
            X.1Xj r13 = r11.A03
            if (r13 == 0) goto L_0x0118
            boolean r13 = r13.A4l()
            if (r13 != 0) goto L_0x011e
        L_0x0118:
            boolean r13 = r11.A0H
            r32 = 0
            if (r13 == 0) goto L_0x0120
        L_0x011e:
            r32 = 1
        L_0x0120:
            X.Csz r13 = r11.A05
            if (r13 != 0) goto L_0x01a9
            X.0sn r27 = X.0sn.A00
        L_0x0126:
            r22 = r18
            r23 = r6
            r24 = r3
            r25 = r2
            r26 = r1
            r28 = r17
            r29 = r5
            r30 = r4
            r31 = r0
            r16 = r8
            r17 = r15
            r18 = r14
            r16.DzV(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.String r0 = r11.A09
            if (r0 != 0) goto L_0x01a4
            X.TzX r0 = r7.mListAdapter
            java.lang.String r4 = r12.A03
            X.Tzb r1 = X.C14625TzX.A01(r0, r4)
            if (r1 == 0) goto L_0x01a4
            X.3uh r0 = r1.A0G
            r0.getClass()
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x01a4
            X.3uh r0 = r1.A0G
            r0.getClass()
            X.1Xj r1 = r0.A0b
            boolean r0 = r1.A5O()
            if (r0 == 0) goto L_0x01a4
            int r1 = r1.A12()
            r0 = 19
            if (r1 == r0) goto L_0x01a4
            com.instagram.common.session.UserSession r3 = r7.A06
            X.0Tu r2 = X.0Tu.A06
            r0 = 36313029364876906(0x8102820003066a, double:3.0278442189563516E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x01a4
            com.instagram.common.session.UserSession r0 = r7.A06
            X.W0E r2 = X.C14639Tzl.A00(r0)
            boolean r0 = X.W0E.A01(r2, r4)
            if (r0 == 0) goto L_0x0199
            java.lang.Long r0 = X.W0E.A00(r2, r4)
            if (r0 == 0) goto L_0x0199
            long r0 = r0.longValue()
            X.1QP r3 = r2.A02
            java.lang.String r2 = "fb_viewers_list_fetch_begin"
            r3.flowMarkPoint(r0, r2)
        L_0x0199:
            r2 = 0
            boolean r1 = r12.A04
            X.Wgl r0 = new X.Wgl
            r0.<init>(r12)
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A08(r0, r7, r4, r2, r1)
        L_0x01a4:
            r0 = -798828118(0xffffffffd062d9aa, float:-1.52236626E10)
            goto L_0x0033
        L_0x01a9:
            java.util.List r13 = r13.A00
            com.google.common.collect.ImmutableList r27 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r13)
            goto L_0x0126
        L_0x01b1:
            r0 = -784546259(0xffffffffd13cc62d, float:-5.0673668E10)
            int r10 = X.AnonymousClass0fD.A03(r0)
            X.3JC r11 = (X.AnonymousClass3JC) r11
            r0 = -753706961(0xffffffffd313582f, float:-6.3283967E11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r11.A01
            if (r7 == 0) goto L_0x0220
            X.3FZ r7 = (X.AnonymousClass3FZ) r7
            java.lang.Class<X.QNh> r6 = X.QNh.class
            r0 = 768(0x300, float:1.076E-42)
            java.lang.String r5 = X.Pxd.A00(r0)
            X.3FZ r0 = r7.A00(r6, r5)
            if (r0 == 0) goto L_0x0220
            X.RGX r4 = X.RGX.SUCCESS
            X.3FZ r2 = r7.A00(r6, r5)
            X.RGX r1 = X.RGX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r0 = r2.A04(r0, r1)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0220
            X.3FZ r0 = r7.A00(r6, r5)
            java.lang.String r1 = "count"
            org.json.JSONObject r0 = r0.A00
            int r4 = r0.optInt(r1)
            java.lang.Object r0 = r12.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r2 = X.1Au.A00(r0)
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x0205
            r0 = 1
            r2.A1G(r0)
        L_0x0205:
            java.lang.String r1 = r12.A03
            r0 = 56
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x022b
            r2.A0U(r4)
        L_0x0216:
            java.lang.Object r1 = r12.A01
            X.TgT r1 = (X.C13757TgT) r1
            if (r1 == 0) goto L_0x0220
            r0 = 0
            r1.Dod(r0)
        L_0x0220:
            r0 = -54001237(0xfffffffffcc801ab, float:-8.3079456E36)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1466671263(0x576ba09f, float:2.59075095E14)
            goto L_0x0039
        L_0x022b:
            boolean r0 = r12.A04
            r2.A1H(r0)
            r2.A0T(r4)
            goto L_0x0216
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14651Tzx.onSuccess(java.lang.Object):void");
    }
}
