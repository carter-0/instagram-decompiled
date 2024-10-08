package com.instagram.feed.tifu;

import X.00k;
import X.05G;
import X.0eP;
import X.0oI;
import X.0q2;
import X.0qQ;
import X.0sr;
import X.1Av;
import X.1Xj;
import X.AnonymousClass00P;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.AnonymousClass322;
import X.AnonymousClass5O4;
import X.AnonymousClass5vX;
import X.AnonymousClass62O;
import X.AnonymousClass62P;
import X.AnonymousClass62Q;
import X.AnonymousClass9J3;
import X.C243363Yl;
import X.C274524oV;
import X.C274544oX;
import X.C274594oe;
import X.C292845jc;
import X.C299435v9;
import X.C299445vC;
import X.C299455vD;
import X.C299465vE;
import X.C299475vF;
import X.C299485vG;
import X.C49965FGy;
import X.C54994HaR;
import X.C61970qY;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.api.TifuApiHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class TifuViewModel {
    public String A00;
    public final Context A01;
    public final C299465vE A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass322 A05;
    public final C299435v9 A06;
    public final C299455vD A07;
    public final C299445vC A08;
    public final C274594oe A09;
    public final AnonymousClass5O4 A0A;
    public final 1Av A0B;
    public final Double A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final 05G A0F;
    public final AnonymousClass0Ud A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final TifuApiHelper A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (X.0qQ.A0K(((X.C274564oa) r0).A01, true) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        if (X.182.A06(r6, r5, 36326339469719265L) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        if (X.0qQ.A0K(((X.C274564oa) (r0 = r3.A02)).A00, true) == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TifuViewModel(android.content.Context r38, X.AnonymousClass0iw r39, com.instagram.common.session.UserSession r40, X.AnonymousClass322 r41, X.C299435v9 r42, X.C274594oe r43, X.AnonymousClass5O4 r44, boolean r45) {
        /*
            r37 = this;
            r1 = 1
            r0 = 6
            r13 = r44
            X.0qQ.A0B(r13, r0)
            r4 = r37
            r4.<init>()
            r28 = r38
            r0 = r28
            r4.A01 = r0
            r5 = r40
            r4.A04 = r5
            r27 = r39
            r0 = r27
            r4.A03 = r0
            r3 = r43
            r4.A09 = r3
            r0 = r41
            r4.A05 = r0
            r4.A0A = r13
            r2 = r42
            r4.A06 = r2
            java.lang.Integer r8 = r3.A04
            r4.A0E = r8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r12 = 0
            if (r45 == 0) goto L_0x0044
            X.4ob r0 = r3.A02
            if (r0 == 0) goto L_0x0044
            X.4oa r0 = (X.C274564oa) r0
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            r11 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r11 = 0
        L_0x0045:
            r4.A0I = r11
            if (r45 == 0) goto L_0x0058
            X.4ob r0 = r3.A02
            if (r0 == 0) goto L_0x0058
            X.4oa r0 = (X.C274564oa) r0
            java.lang.Boolean r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            r10 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            r4.A0L = r10
            r0 = 41
            X.Ini r1 = new X.Ini
            r1.<init>(r5, r0)
            java.lang.Class<com.instagram.feed.tifu.api.TifuApiHelper> r0 = com.instagram.feed.tifu.api.TifuApiHelper.class
            java.lang.Object r0 = r5.A01(r0, r1)
            com.instagram.feed.tifu.api.TifuApiHelper r0 = (com.instagram.feed.tifu.api.TifuApiHelper) r0
            r4.A0M = r0
            r0 = 0
            X.5vC r1 = new X.5vC
            r1.<init>(r2, r3, r8, r0)
            r4.A08 = r1
            java.util.List r14 = r3.A09
            X.5vD r1 = new X.5vD
            r1.<init>(r2, r8, r0, r14)
            r4.A07 = r1
            X.5vE r1 = new X.5vE
            r1.<init>()
            r4.A02 = r1
            X.1Av r1 = X.1Au.A00(r5)
            r4.A0B = r1
            X.0Tu r6 = X.0Tu.A05
            r1 = 36326339469194972(0x810e9d000d36dc, double:3.036261582522585E-306)
            boolean r9 = X.182.A06(r6, r5, r1)
            r4.A0J = r9
            if (r45 == 0) goto L_0x00a5
            r1 = 36326339469719265(0x810e9d001536e1, double:3.03626158285415E-306)
            boolean r1 = X.182.A06(r6, r5, r1)
            r7 = 1
            if (r1 != 0) goto L_0x00a6
        L_0x00a5:
            r7 = 0
        L_0x00a6:
            r4.A0H = r7
            if (r45 == 0) goto L_0x00b6
            r1 = 36326339469784802(0x810e9d001636e2, double:3.0362615828955956E-306)
            boolean r1 = X.182.A06(r6, r5, r1)
            if (r1 == 0) goto L_0x00b6
            r12 = 1
        L_0x00b6:
            r4.A0K = r12
            if (r9 == 0) goto L_0x0127
            r1 = 36607814445962878(0x820e9d000e167e, double:3.214267491239366E-306)
            long r1 = X.182.A01(r6, r5, r1)
            int r15 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
        L_0x00c8:
            r4.A0D = r2
            if (r45 == 0) goto L_0x00d9
            r0 = 37170764399510032(0x840e9d00100210, double:3.570279308680101E-306)
            double r0 = X.182.A00(r6, r5, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x00d9:
            r4.A0C = r0
            java.lang.String r6 = r3.A06
            java.lang.String r1 = r3.A08
            r26 = 0
            r20 = 0
            r22 = r11
            r23 = r9
            r24 = r7
            r25 = r12
            r18 = r2
            r19 = r14
            r21 = r10
            r16 = r5
            r17 = r0
            r14 = r28
            r15 = r27
            X.62O r30 = X.C299475vF.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.List r2 = r3.A0A
            if (r2 != 0) goto L_0x0103
            X.0sn r2 = X.0sn.A00
        L_0x0103:
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r3 = r2.iterator()
        L_0x0112:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r2)
            r5.add(r0)
            goto L_0x0112
        L_0x0127:
            r2 = r0
            goto L_0x00c8
        L_0x0129:
            X.62O r31 = X.AnonymousClass62Q.A03(r5)
            int r0 = r13.A01
            X.5vX r2 = new X.5vX
            r27 = r8
            r28 = r6
            r29 = r1
            r32 = r0
            r33 = r20
            r34 = r20
            r35 = r20
            r36 = r20
            r25 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.02z r0 = new X.02z
            r0.<init>(r2)
            r4.A0F = r0
            X.05F r0 = X.10b.A03(r0)
            r4.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.<init>(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.322, X.5v9, X.4oe, X.5O4, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r15, X.AnonymousClass4D7 r16, boolean r17) {
        /*
            r14 = this;
            r8 = r15
            r3 = r17
            r5 = 9
            r6 = r16
            boolean r0 = X.C66140MDs.A01(r5, r6)
            if (r0 == 0) goto L_0x00cb
            r2 = r6
            X.MDs r2 = (X.C66140MDs) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x00cb
            int r4 = r4 - r1
            r2.A00 = r4
        L_0x001b:
            java.lang.Object r5 = r2.A03
            X.1Hj r1 = X.1Hj.A02
            int r4 = r2.A00
            r0 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r0) goto L_0x00d2
            boolean r3 = r2.A05
            java.lang.Object r8 = r2.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r2.A01
            com.instagram.feed.tifu.TifuViewModel r0 = (com.instagram.feed.tifu.TifuViewModel) r0
            X.0eS.A00(r5)
        L_0x0033:
            com.instagram.common.session.UserSession r0 = r0.A04
            X.C56242Hv9.A01(r0, r8, r3)
            X.0gF r1 = X.C60340gF.A00
        L_0x003a:
            return r1
        L_0x003b:
            X.0eS.A00(r5)
            r12 = 0
            X.5v9 r7 = r14.A06
            X.4oe r4 = r14.A09
            java.lang.String r9 = r4.A06
            java.lang.String r10 = r4.A07
            X.0Ud r6 = r14.A0G
            java.lang.Object r4 = r6.getValue()
            X.5vX r4 = (X.AnonymousClass5vX) r4
            X.62P r4 = r4.A06
            java.util.Iterator r5 = r4.iterator()
            if (r17 == 0) goto L_0x006e
        L_0x0057:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x009c
            java.lang.Object r4 = r5.next()
            X.9J3 r4 = (X.AnonymousClass9J3) r4
            java.lang.String r4 = r4.A03
            boolean r4 = X.0qQ.A0K(r4, r15)
            if (r4 != 0) goto L_0x009d
            int r12 = r12 + 1
            goto L_0x0057
        L_0x006e:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r5.next()
            X.9J3 r4 = (X.AnonymousClass9J3) r4
            java.lang.String r4 = r4.A03
            boolean r4 = X.0qQ.A0K(r4, r15)
            if (r4 != 0) goto L_0x0086
            int r12 = r12 + 1
            goto L_0x006e
        L_0x0085:
            r12 = -1
        L_0x0086:
            java.lang.Object r4 = r6.getValue()
            X.5vX r4 = (X.AnonymousClass5vX) r4
            X.62P r4 = r4.A06
            int r13 = r4.size()
            java.lang.Integer r4 = r14.A0E
            java.lang.String r11 = X.C292845jc.A00(r4)
            r7.EGj(r8, r9, r10, r11, r12, r13)
            goto L_0x00b2
        L_0x009c:
            r12 = -1
        L_0x009d:
            java.lang.Object r4 = r6.getValue()
            X.5vX r4 = (X.AnonymousClass5vX) r4
            X.62P r4 = r4.A06
            int r13 = r4.size()
            java.lang.Integer r4 = r14.A0E
            java.lang.String r11 = X.C292845jc.A00(r4)
            r7.EGi(r8, r9, r10, r11, r12, r13)
        L_0x00b2:
            com.instagram.feed.tifu.api.TifuApiHelper r5 = r14.A0M
            X.1Xv r4 = X.1Xj.A0h
            java.lang.String r4 = X.1Xv.A06(r15)
            r2.A01 = r14
            r2.A02 = r15
            r2.A05 = r3
            r2.A00 = r0
            java.lang.Object r0 = r5.A02(r4, r2, r3)
            if (r0 == r1) goto L_0x003a
            r0 = r14
            goto L_0x0033
        L_0x00cb:
            X.MDs r2 = new X.MDs
            r2.<init>(r14, r6, r5)
            goto L_0x001b
        L_0x00d2:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A03(java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    public final void A05(FragmentActivity fragmentActivity, String str) {
        C274524oV r7;
        Object obj;
        C274544oX r0;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        AnonymousClass62P r1 = ((AnonymousClass5vX) this.A0G.getValue()).A06;
        C49965FGy fGy = C49965FGy.A00;
        UserSession userSession = this.A04;
        Iterator it = r1.iterator();
        while (true) {
            r7 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass9J3) obj).A03, str)) {
                break;
            }
        }
        AnonymousClass9J3 r2 = (AnonymousClass9J3) obj;
        if (!(r2 == null || (r0 = (C274544oX) r2.A01) == null)) {
            r7 = r0.CB4();
        }
        fGy.A07(fragmentActivity2, r7, userSession, "ufiLikeDestination", "tifu");
        C299435v9 r3 = this.A06;
        C274594oe r02 = this.A09;
        String str3 = r02.A06;
        String str4 = r02.A07;
        int i = 0;
        Iterator it2 = r1.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (0qQ.A0K(((AnonymousClass9J3) it2.next()).A03, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        r3.EGh(str2, str3, str4, C292845jc.A00(this.A0E), (String) null, i, r1.size());
    }

    public final void A08(AnonymousClass62P r18, AnonymousClass62P r19) {
        Object value;
        String str;
        String str2;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool;
        AnonymousClass62P r10 = r18;
        0qQ.A0B(r10, 0);
        AnonymousClass62P r11 = r19;
        0qQ.A0B(r11, 1);
        05G r1 = this.A0F;
        do {
            value = r1.getValue();
            AnonymousClass5vX r5 = (AnonymousClass5vX) value;
            str = r5.A03;
            str2 = r5.A04;
            num = r5.A02;
            z = r5.A0A;
            i = r5.A00;
            z2 = r5.A07;
            z3 = r5.A08;
            z4 = r5.A09;
            bool = r5.A01;
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            0qQ.A0B(num, 2);
        } while (!r1.AIY(value, new AnonymousClass5vX(bool, num, str, str2, r10, r11, i, z, z2, z3, z4)));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.feed.tifu.TifuViewModel r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 33
            boolean r0 = X.C66145MDx.A02(r3, r13)
            if (r0 == 0) goto L_0x002c
            r5 = r13
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r8) goto L_0x00a6
            if (r0 == r9) goto L_0x00a6
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002c:
            X.MDx r5 = new X.MDx
            r5.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x0032:
            X.0eS.A00(r1)
            X.0eP r1 = r11.A01(r12)
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r0 = r1.A00
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            java.lang.Object r10 = r1.A01
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r4 = r0.A2n()
            if (r4 == 0) goto L_0x00bc
            X.3Yl r1 = X.C243363Yl.LIKED
            r3 = 0
            com.instagram.feed.tifu.api.TifuApiHelper r2 = r11.A0M
            X.4oe r7 = r11.A09
            java.lang.String r0 = r7.A07
            if (r10 != r1) goto L_0x007f
            if (r0 == 0) goto L_0x007d
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x007d
            int r1 = r0.intValue()
        L_0x0062:
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0070
            int r3 = r0.intValue()
        L_0x0070:
            r5.A01 = r11
            r5.A02 = r12
            r5.A00 = r8
            java.lang.Object r1 = r2.A00(r4, r5, r1, r3)
        L_0x007a:
            if (r1 != r6) goto L_0x00b1
            return r6
        L_0x007d:
            r1 = 0
            goto L_0x0062
        L_0x007f:
            if (r0 == 0) goto L_0x00a4
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x00a4
            int r1 = r0.intValue()
        L_0x008b:
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L_0x0099
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0099
            int r3 = r0.intValue()
        L_0x0099:
            r5.A01 = r11
            r5.A02 = r12
            r5.A00 = r9
            java.lang.Object r1 = r2.A01(r4, r5, r1, r3)
            goto L_0x007a
        L_0x00a4:
            r1 = 0
            goto L_0x008b
        L_0x00a6:
            java.lang.Object r12 = r5.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r5.A01
            com.instagram.feed.tifu.TifuViewModel r11 = (com.instagram.feed.tifu.TifuViewModel) r11
            X.0eS.A00(r1)
        L_0x00b1:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x00bc
            r11.A01(r12)
        L_0x00bc:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A00(com.instagram.feed.tifu.TifuViewModel, java.lang.String, X.4D7):java.lang.Object");
    }

    private final 0eP A01(String str) {
        C243363Yl r0;
        C243363Yl r10;
        AnonymousClass5vX r6 = (AnonymousClass5vX) this.A0G.getValue();
        AnonymousClass62P r02 = r6.A06;
        ArrayList A0U = 00k.A0U(r02);
        int i = 0;
        for (Object next : r02) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass9J3 r3 = (AnonymousClass9J3) next;
            String str2 = r3.A03;
            if (0qQ.A0K(str2, str)) {
                1Xj r1 = (1Xj) r3.A00;
                if (r1.A5d()) {
                    r0 = C243363Yl.NOT_LIKED;
                } else {
                    r0 = C243363Yl.LIKED;
                }
                UserSession userSession = this.A04;
                0q2 A002 = 0q2.A00(userSession);
                AnonymousClass0iw r8 = this.A03;
                A002.A0M(r8, r0, r1, C61970qY.A07(), (Map) null, false);
                if (r1.A5d()) {
                    r10 = C243363Yl.LIKED;
                } else {
                    r10 = C243363Yl.NOT_LIKED;
                }
                C54994HaR.A00(userSession, r10, r0, r1);
                C299485vG r16 = C299485vG.A00;
                boolean z = this.A0L;
                boolean z2 = this.A0I;
                boolean z3 = this.A0J;
                Integer num = this.A0D;
                Double d = this.A0C;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                Integer num2 = num;
                int i3 = i;
                1Xj r18 = r1;
                Double d2 = d;
                UserSession userSession2 = userSession;
                AnonymousClass62P A003 = r16.A00(userSession2, r18, d2, num2, i3, true, false, true, z4, z5, false, z6, this.A0H, this.A0K);
                AnonymousClass62O A012 = C299475vF.A01(this.A01, r8, A003);
                A0U.set(i, new AnonymousClass9J3((C274544oX) r3.A01, r1, str2, A003, (AnonymousClass62P) A012, r3.A04));
                A08(AnonymousClass62Q.A00(A0U), r6.A05);
                return new 0eP(r3, r0);
            }
            i = i2;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(androidx.fragment.app.FragmentActivity r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r14 = this;
            r7 = r16
            r3 = 29
            r4 = r17
            boolean r0 = X.C376709Ja.A00(r3, r4)
            if (r0 == 0) goto L_0x00ae
            r6 = r4
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ae
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r12 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r3) goto L_0x008a
            if (r0 != r4) goto L_0x00b5
            java.lang.Object r7 = r6.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r6.A01
            com.instagram.feed.tifu.TifuViewModel r2 = (com.instagram.feed.tifu.TifuViewModel) r2
            X.0eS.A00(r1)
        L_0x0034:
            X.0Ud r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r3 = r0.A06
            X.5v9 r6 = r2.A06
            X.4oe r0 = r2.A09
            java.lang.String r8 = r0.A06
            java.lang.String r9 = r0.A07
            java.util.Iterator r1 = r3.iterator()
        L_0x004a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r1.next()
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x00c2
            int r12 = r12 + 1
            goto L_0x004a
        L_0x0061:
            X.0eS.A00(r1)
            X.4oe r0 = r14.A09
            X.4ob r0 = r0.A02
            if (r0 == 0) goto L_0x00bd
            X.4oa r0 = (X.C274564oa) r0
            java.lang.Boolean r1 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00bd
            r14.A00 = r7
            com.instagram.feed.tifu.api.TifuApiHelper r0 = r14.A0M
            r6.A01 = r14
            r6.A02 = r7
            r6.A00 = r3
            java.lang.Object r1 = r0.A03(r6)
            if (r1 == r5) goto L_0x00d2
            r2 = r14
            goto L_0x0095
        L_0x008a:
            java.lang.Object r7 = r6.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r6.A01
            com.instagram.feed.tifu.TifuViewModel r2 = (com.instagram.feed.tifu.TifuViewModel) r2
            X.0eS.A00(r1)
        L_0x0095:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00aa
            r6.A01 = r2
            r6.A02 = r7
            r6.A00 = r4
            java.lang.Object r0 = A00(r2, r7, r6)
            if (r0 != r5) goto L_0x0034
            return r5
        L_0x00aa:
            r2.A09(r3)
            goto L_0x0034
        L_0x00ae:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r14, r4, r3)
            goto L_0x001a
        L_0x00b5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            r14.A05(r15, r7)
            goto L_0x00d0
        L_0x00c1:
            r12 = -1
        L_0x00c2:
            int r13 = r3.size()
            java.lang.Integer r0 = r2.A0E
            java.lang.String r10 = X.C292845jc.A00(r0)
            r11 = 0
            r6.EGh(r7, r8, r9, r10, r11, r12, r13)
        L_0x00d0:
            X.0gF r5 = X.C60340gF.A00
        L_0x00d2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A02(androidx.fragment.app.FragmentActivity, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r20, boolean r21) {
        /*
            r19 = this;
            r5 = 13
            r6 = r20
            boolean r1 = X.C66137MDp.A02(r5, r6)
            r0 = r19
            if (r1 == 0) goto L_0x0097
            r3 = r6
            X.MDp r3 = (X.C66137MDp) r3
            int r4 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto L_0x0097
            int r4 = r4 - r2
            r3.A00 = r4
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r4 = r3.A00
            r1 = 2
            r13 = 1
            if (r4 == 0) goto L_0x0036
            if (r4 == r13) goto L_0x007f
            if (r4 != r1) goto L_0x009e
            java.lang.Object r4 = r3.A01
            com.instagram.feed.tifu.TifuViewModel r4 = (com.instagram.feed.tifu.TifuViewModel) r4
            X.0eS.A00(r5)
        L_0x002f:
            r0 = 0
            r4.A09(r0)
            X.0gF r2 = X.C60340gF.A00
        L_0x0035:
            return r2
        L_0x0036:
            X.0eS.A00(r5)
            if (r21 == 0) goto L_0x0095
            com.instagram.feed.tifu.api.TifuApiHelper r4 = r0.A0M
            r3.A01 = r0
            r3.A00 = r13
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            com.instagram.common.session.UserSession r4 = r4.A00
            X.2IY r5 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bsy> r12 = X.C43112Bsy.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "TifuLikeConfirmationMutation"
            r15 = 0
            java.lang.String r17 = "xdt_likes_ig_threads_set_like_confirmation"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r4 = X.1vm.A01(r4)
            java.lang.Object r4 = r4.A04(r7, r3)
            if (r4 == r2) goto L_0x007b
            X.0gF r4 = X.C60340gF.A00
        L_0x007b:
            if (r4 == r2) goto L_0x0035
            r4 = r0
            goto L_0x0086
        L_0x007f:
            java.lang.Object r4 = r3.A01
            com.instagram.feed.tifu.TifuViewModel r4 = (com.instagram.feed.tifu.TifuViewModel) r4
            X.0eS.A00(r5)
        L_0x0086:
            java.lang.String r0 = r4.A00
            if (r0 == 0) goto L_0x002f
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r0 = A00(r4, r0, r3)
            if (r0 != r2) goto L_0x002f
            return r2
        L_0x0095:
            r4 = r0
            goto L_0x002f
        L_0x0097:
            X.MDp r3 = new X.MDp
            r3.<init>(r0, r6, r5)
            goto L_0x001a
        L_0x009e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A04(X.4D7, boolean):java.lang.Object");
    }

    public final void A06(FragmentActivity fragmentActivity, String str) {
        C274524oV r8;
        String str2;
        Object obj;
        C274544oX r0;
        AnonymousClass62P r3 = ((AnonymousClass5vX) this.A0G.getValue()).A06;
        C49965FGy fGy = C49965FGy.A00;
        UserSession userSession = this.A04;
        Iterator it = r3.iterator();
        while (true) {
            r8 = null;
            str2 = str;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass9J3) obj).A03, str2)) {
                break;
            }
        }
        AnonymousClass9J3 r1 = (AnonymousClass9J3) obj;
        if (!(r1 == null || (r0 = (C274544oX) r1.A01) == null)) {
            r8 = r0.BPy();
        }
        fGy.A07(fragmentActivity, r8, userSession, "mediaDestination", "tifu");
        int i = 0;
        Iterator it2 = r3.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (0qQ.A0K(((AnonymousClass9J3) it2.next()).A03, str2)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        C299435v9 r4 = this.A06;
        C274594oe r12 = this.A09;
        String str3 = r12.A06;
        String str4 = r12.A07;
        int size = r3.size();
        String A002 = C292845jc.A00(this.A0E);
        r4.Cl6(str2, str3, str4, A002, i, size);
        r4.CjL(str2, str3, str4, A002, (String) null, i, r3.size(), 0oI.A0A(this.A01));
        r4.CjP(str3, r12.A03.A0D, str2);
    }

    public final void A07(String str) {
        String str2;
        C299435v9 r2 = this.A06;
        C274594oe r0 = this.A09;
        String str3 = r0.A06;
        String str4 = r0.A07;
        Iterator it = r0.A09.iterator();
        int i = 0;
        while (true) {
            str2 = str;
            if (it.hasNext()) {
                if (0qQ.A0K(((1Xj) it.next()).getId(), str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        r2.EGn(str2, str3, str4, C292845jc.A00(this.A0E), (String) null, i, ((AnonymousClass5vX) this.A0G.getValue()).A06.size());
    }

    public final void A09(boolean z) {
        Object value;
        String str;
        String str2;
        Integer num;
        AnonymousClass62P r8;
        AnonymousClass62P r9;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool;
        05G r1 = this.A0F;
        do {
            value = r1.getValue();
            AnonymousClass5vX r0 = (AnonymousClass5vX) value;
            str = r0.A03;
            str2 = r0.A04;
            num = r0.A02;
            r8 = r0.A06;
            r9 = r0.A05;
            i = r0.A00;
            z2 = r0.A07;
            z3 = r0.A08;
            z4 = r0.A09;
            bool = r0.A01;
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            0qQ.A0B(num, 2);
            0qQ.A0B(r8, 3);
            0qQ.A0B(r9, 4);
        } while (!r1.AIY(value, new AnonymousClass5vX(bool, num, str, str2, r8, r9, i, z, z2, z3, z4)));
    }
}
