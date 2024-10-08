package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OVN {
    public final Activity A00;
    public final UserSession A01;
    public final C254743sy A02;
    public final List A03;
    public final boolean A04;
    public final C59583JPd A05 = new C57572Icz(this, 5);

    public static /* synthetic */ void A00(OVN ovn, C69416Nky nky, C56139HtR htR, AnonymousClass7K7 r15, Integer num, String str, int i) {
        boolean z;
        int i2 = i;
        AnonymousClass7K7 r8 = r15;
        C56139HtR htR2 = htR;
        Integer num2 = num;
        if ((i & 4) != 0) {
            num2 = AnonymousClass05K.A00;
        }
        OVN ovn2 = ovn;
        if ((i & 8) != 0) {
            z = 182.A06(0Tu.A05, ovn.A01, 36327159807424717L);
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            htR2 = null;
        }
        if ((i2 & 128) != 0) {
            r8 = null;
        }
        ovn2.A01(nky, htR2, r8, num2, str, z, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
        if (r30 != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C69416Nky r39, X.C56139HtR r40, X.AnonymousClass7K7 r41, java.lang.Integer r42, java.lang.String r43, boolean r44, boolean r45, boolean r46) {
        /*
            r38 = this;
            r15 = r42
            r4 = r41
            boolean r27 = X.C51970G9q.A1Y(r15)
            r8 = r38
            com.instagram.common.session.UserSession r2 = r8.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36327159807949012(0x810f5c000d38d4, double:3.0367803680538787E-306)
            boolean r30 = X.182.A06(r3, r2, r0)
            r11 = r39
            int r5 = r11.ordinal()
            switch(r5) {
                case 3: goto L_0x00e6;
                case 4: goto L_0x0020;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00e6;
                case 7: goto L_0x00e6;
                case 8: goto L_0x0020;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00e6;
                case 11: goto L_0x0020;
                case 12: goto L_0x00e6;
                case 13: goto L_0x0020;
                case 14: goto L_0x00e6;
                default: goto L_0x0020;
            }
        L_0x0020:
            X.HMY r10 = X.HMY.PORTRAIT
        L_0x0022:
            if (r30 == 0) goto L_0x00df
            X.HMY r0 = X.HMY.SQUARE
            if (r10 != r0) goto L_0x00df
            r0 = 36608634784782055(0x820f5c000f16e7, double:3.214786276811853E-306)
        L_0x002d:
            int r20 = X.DbS.A04(r3, r2, r0)
            android.app.Activity r0 = r8.A00
            X.HrX r6 = new X.HrX
            r6.<init>(r0, r2)
            if (r41 != 0) goto L_0x004b
            r22 = 0
            r26 = 1
            X.7K7 r4 = new X.7K7
            r21 = r4
            r23 = r22
            r24 = r27
            r25 = r27
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x004b:
            r26 = r30 ^ 1
            r16 = 0
            java.lang.String r7 = r4.A01
            boolean r1 = r4.A03
            boolean r0 = r4.A02
            java.lang.String r4 = r4.A00
            X.7K7 r13 = new X.7K7
            r21 = r13
            r22 = r7
            r23 = r4
            r24 = r1
            r25 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r0 = 36327159807097032(0x810f5c000038c8, double:3.036780367515083E-306)
            boolean r23 = X.182.A06(r3, r2, r0)
            r0 = 36327159807293643(0x810f5c000338cb, double:3.0367803676394207E-306)
            boolean r25 = X.182.A06(r3, r2, r0)
            r0 = 36327159807359180(0x810f5c000438cc, double:3.0367803676808665E-306)
            boolean r24 = X.182.A06(r3, r2, r0)
            r0 = 36325836957627660(0x810e280007350c, double:3.035943792183965E-306)
            boolean r28 = X.182.A06(r3, r2, r0)
            r0 = 36327159807621328(0x810f5c000838d0, double:3.03678036784665E-306)
            boolean r32 = X.182.A06(r3, r2, r0)
            r0 = 3
            if (r5 == r0) goto L_0x00dc
            r0 = 5
            if (r5 == r0) goto L_0x00dc
            r0 = 6
            if (r5 == r0) goto L_0x00dc
            r0 = 14
            if (r5 == r0) goto L_0x00dc
            r0 = 7
            if (r5 == r0) goto L_0x00dc
            java.lang.Integer r14 = X.AnonymousClass05K.A01
        L_0x00a5:
            if (r45 != 0) goto L_0x00ab
            r29 = 0
            if (r30 == 0) goto L_0x00ad
        L_0x00ab:
            r29 = 1
        L_0x00ad:
            r0 = 36327159808014549(0x810f5c000e38d5, double:3.0367803680953245E-306)
            boolean r37 = X.182.A06(r3, r2, r0)
            r21 = -325220222(0xffffffffec9d8882, float:-1.523568E27)
            r22 = 1
            X.Htc r9 = new X.Htc
            r12 = r40
            r18 = r43
            r26 = r44
            r36 = r46
            r17 = r16
            r19 = r16
            r31 = r27
            r33 = r27
            r34 = r27
            r35 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.JPd r1 = r8.A05
            X.Pnc r0 = X.C74011Pnc.A00
            r6.A00(r9, r1, r0)
            return
        L_0x00dc:
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            goto L_0x00a5
        L_0x00df:
            r0 = 36608634784585446(0x820f5c000c16e6, double:3.2147862766875165E-306)
            goto L_0x002d
        L_0x00e6:
            X.HMY r10 = X.HMY.SQUARE
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVN.A01(X.Nky, X.HtR, X.7K7, java.lang.Integer, java.lang.String, boolean, boolean, boolean):void");
    }

    public OVN(Activity activity, UserSession userSession, C254743sy r5, List list, boolean z) {
        C51972G9s.A1C(activity, list);
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = r5;
        this.A03 = list;
        this.A04 = z;
    }
}
