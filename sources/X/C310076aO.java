package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.6aO  reason: invalid class name and case insensitive filesystem */
public final class C310076aO {
    public final DialogInterface.OnDismissListener A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C228232l0 A03;
    public final AnonymousClass6a7 A04;
    public final String A05;
    public final String A06;

    public C310076aO(DialogInterface.OnDismissListener onDismissListener, UserSession userSession, AnonymousClass4DU r4, C228232l0 r5, AnonymousClass6a7 r6, String str, String str2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(onDismissListener, 4);
        0qQ.A0B(r6, 6);
        0qQ.A0B(r5, 7);
        this.A01 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = onDismissListener;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        if (r14 == X.2EG.A3j) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013b, code lost:
        if (android.webkit.URLUtil.isValidUrl(r0) != false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(androidx.fragment.app.Fragment r27, X.C255773uh r28, X.C250973mM r29, X.C273384mU r30, X.C309426Yf r31, X.VWL r32, X.2EG r33, X.C17519VYx r34) {
        /*
            r26 = this;
            r18 = 0
            r5 = 1
            r14 = 119(0x77, float:1.67E-43)
            r13 = 118(0x76, float:1.65E-43)
            r2 = 122(0x7a, float:1.71E-43)
            r12 = r31
            float r1 = r12.A0A
            float r0 = r12.A0B
            float r0 = r0 * r1
            double r7 = (double) r0
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 / r3
            double r0 = (double) r1
            double r0 = r0 / r3
            double r0 = r0 - r7
            r10 = r26
            com.instagram.common.session.UserSession r4 = r10.A01
            java.lang.String r3 = r10.A05
            r22 = r3
            java.lang.String r3 = r10.A06
            r17 = r3
            r6 = r29
            com.instagram.model.reels.Reel r9 = r6.A0H
            int r11 = r6.A01
            int r3 = r6.A0E
            r16 = r3
            X.5pf r3 = new X.5pf
            r19 = r3
            r20 = r4
            r21 = r9
            r23 = r17
            r24 = r11
            r25 = r16
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r3.A00 = r7
            r3.A01 = r0
            boolean r0 = r12.A0j
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0D = r0
            int r0 = r12.A0I
            r3.A09 = r0
            r11 = r32
            if (r32 == 0) goto L_0x005b
            X.5sM r0 = r11.A00
            if (r0 == 0) goto L_0x005b
            r3.A0C = r0
        L_0x005b:
            boolean r0 = X.C309456Yi.A02(r6)
            if (r0 == 0) goto L_0x006f
            int r1 = r6.A01()
            java.util.List r0 = r9.A17
            if (r0 == 0) goto L_0x02a2
            r3.A0J = r5
            r3.A0A = r1
            r3.A0I = r0
        L_0x006f:
            r20 = r27
            androidx.fragment.app.FragmentActivity r0 = r20.requireActivity()
            X.AnonymousClass3PI.A03(r0, r3)
            java.lang.Integer r0 = r12.A0V
            r7 = r33
            if (r0 == 0) goto L_0x0088
            int r0 = r7.ordinal()
            if (r0 == r14) goto L_0x0210
            if (r0 == r13) goto L_0x020c
            if (r0 == r2) goto L_0x020c
        L_0x0088:
            r14 = r7
        L_0x0089:
            r13 = r28
            java.lang.String r15 = r13.A0k
            int r2 = r6.A01
            java.lang.String r1 = r13.A0j
            com.instagram.sponsored.analytics.SourceModelInfoParams r8 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r8.<init>()
            r0 = r17
            r8.A09 = r0
            r0 = r22
            r8.A05 = r0
            r8.A04 = r15
            r8.A01 = r2
            r0 = r16
            r8.A03 = r0
            r8.A06 = r1
            X.2EG r17 = X.2EG.A3d
            r0 = r17
            if (r14 == r0) goto L_0x00b3
            X.2EG r0 = X.2EG.A3j
            r1 = 0
            if (r14 != r0) goto L_0x00b4
        L_0x00b3:
            r1 = 1
        L_0x00b4:
            X.4DU r0 = r10.A02
            r23 = r0
            X.Q03 r2 = new X.Q03
            r19 = r2
            r21 = r4
            r22 = r3
            r24 = r14
            r19.<init>(r20, r21, r22, r23, r24)
            r2.A0p = r1
            r2.A0M = r9
            r2.A02(r8)
            android.content.DialogInterface$OnDismissListener r0 = r10.A00
            r21 = r0
            r2.A0E = r0
            X.6a7 r0 = r10.A04
            r19 = r0
            r2.A0W = r0
            boolean r0 = r13.A1A()
            if (r0 == 0) goto L_0x00f0
            float r14 = r12.A0B
            float r0 = r12.A0A
            float r14 = r14 * r0
            int r0 = (int) r14
            r2.A0A = r0
            int r12 = r12.A0C
            r0 = r18
            int[] r0 = new int[]{r0, r12}
            r2.A0w = r0
        L_0x00f0:
            r0 = r34
            if (r34 == 0) goto L_0x00f6
            r2.A0V = r0
        L_0x00f6:
            r16 = 0
            if (r1 != 0) goto L_0x011e
            boolean r0 = X.C309506Yn.A07(r4, r13)
            if (r0 == 0) goto L_0x011e
            X.1Xj r15 = r13.A0b
            if (r15 == 0) goto L_0x011e
            com.instagram.user.model.UpcomingEvent r14 = r15.A27(r4)
            if (r14 == 0) goto L_0x011e
            X.6am r12 = new X.6am
            r1 = r23
            r0 = r16
            r12.<init>(r1, r4, r0)
            java.lang.String r15 = r15.getId()
            java.lang.String r1 = "offsite_link_click"
            java.lang.String r0 = "cta_story_link_sticker"
            r12.A04(r14, r15, r1, r0)
        L_0x011e:
            X.0Tu r12 = X.0Tu.A06
            r0 = 36312226206581768(0x8101c7000c0408, double:3.0273362984164475E-306)
            boolean r1 = X.182.A06(r12, r4, r0)
            int r0 = r6.A01
            boolean r0 = r9.A0w(r0)
            if (r0 != 0) goto L_0x013d
            if (r1 == 0) goto L_0x014b
            if (r32 == 0) goto L_0x0208
            java.lang.String r0 = r11.A02
        L_0x0137:
            boolean r0 = android.webkit.URLUtil.isValidUrl(r0)
            if (r0 == 0) goto L_0x014b
        L_0x013d:
            if (r32 == 0) goto L_0x01c1
            java.lang.String r0 = r11.A02
            if (r0 == 0) goto L_0x01c1
            r2.A0f = r0
            java.lang.Integer r0 = r11.A01
            if (r0 == 0) goto L_0x014b
            r2.A0Z = r0
        L_0x014b:
            X.2l0 r9 = r10.A03
            X.2v9 r1 = X.C233162v9.CTA_CLICK
            X.5yf r0 = X.C301155ye.A00()
            r9.DUE(r0, r1, r13, r6)
            X.1Xj r9 = r13.A0b
            if (r9 == 0) goto L_0x023c
            X.1Xy r0 = r9.A0C
            X.47f r0 = r0.Atb()
            if (r0 == 0) goto L_0x0214
            java.lang.Boolean r1 = r0.Bud()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0214
            X.0Tu r10 = X.0Tu.A05
            r0 = 36321615004313183(0x810a510000265f, double:3.033273811907448E-306)
            boolean r0 = X.182.A06(r10, r4, r0)
            if (r0 == 0) goto L_0x0214
            androidx.fragment.app.FragmentActivity r10 = r20.requireActivity()
            X.Gzw r9 = new X.Gzw
            r9.<init>()
            X.7Pr r7 = new X.7Pr
            r7.<init>(r4)
            r0 = 2131963584(0x7f132ec0, float:1.9563926E38)
            java.lang.String r0 = r10.getString(r0)
            r7.A0g = r0
            X.SbC r2 = new X.SbC
            r25 = r19
            r17 = r2
            r18 = r21
            r19 = r9
            r20 = r4
            r21 = r23
            r22 = r6
            r23 = r3
            r24 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            X.3Ds r1 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r0 = r16
            X.3aW r0 = X.GHY.A00(r2, r1, r4, r0)
            r7.A0K = r0
            r7.A1J = r5
            r7.A0v = r5
            X.7Pu r0 = r7.A00()
            r0.A02(r10, r9)
            return
        L_0x01c1:
            X.1Xj r1 = r13.A0b
            if (r1 == 0) goto L_0x014b
            boolean r0 = r1.A5J()
            if (r0 == 0) goto L_0x01fc
            X.1Xy r0 = r1.A0C
            java.util.List r11 = r0.Bw7()
            if (r11 != 0) goto L_0x01d9
            X.0sn r12 = X.0sn.A00
        L_0x01d5:
            r3.A0G = r12
            goto L_0x014b
        L_0x01d9:
            int r1 = r11.size()
            r0 = 4
            int r9 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r1 = 0
        L_0x01e8:
            if (r1 >= r9) goto L_0x01d5
            java.lang.Object r0 = r11.get(r1)
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x029a
            r12.add(r0)
            int r1 = r1 + 1
            goto L_0x01e8
        L_0x01fc:
            r0 = r18
            java.lang.String r0 = r1.A33(r0)
            if (r0 == 0) goto L_0x014b
            r2.A0f = r0
            goto L_0x014b
        L_0x0208:
            r0 = r16
            goto L_0x0137
        L_0x020c:
            X.2EG r14 = X.2EG.A3k
            goto L_0x0089
        L_0x0210:
            X.2EG r14 = X.2EG.A3j
            goto L_0x0089
        L_0x0214:
            boolean r0 = r9.A5J()
            if (r0 == 0) goto L_0x023c
            X.2EG r0 = X.2EG.A3e
            if (r7 == r0) goto L_0x0226
            X.2EG r0 = X.2EG.A3q
            if (r7 == r0) goto L_0x0226
            r0 = r17
            if (r7 != r0) goto L_0x023c
        L_0x0226:
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C0M()
            if (r0 == 0) goto L_0x0298
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            if (r0 == 0) goto L_0x0298
            java.lang.String r0 = r0.AtU()
        L_0x023a:
            r2.A0a = r0
        L_0x023c:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324892064428477(0x810d4c000131bd, double:3.035346237920022E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0286
            if (r9 == 0) goto L_0x026b
            X.1Xy r0 = r9.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x026b
            X.3lH r0 = r0.BDw()
            if (r0 == 0) goto L_0x026b
            X.3lF r0 = r0.AiD()
            if (r0 == 0) goto L_0x026b
            java.lang.Boolean r0 = r0.Bu1()
            if (r0 == 0) goto L_0x026b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0286
        L_0x026b:
            X.2EG r0 = X.2EG.A3p
            if (r7 != r0) goto L_0x0286
            r0 = 36324892064559551(0x810d4c000331bf, double:3.035346238002914E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x028f
            android.content.Context r0 = r20.getContext()
            if (r0 == 0) goto L_0x0286
            boolean r0 = X.C316216lI.A0B(r0)
            if (r0 != 0) goto L_0x028f
        L_0x0286:
            X.Q02 r0 = new X.Q02
            r0.<init>(r2)
            r0.A02()
            return
        L_0x028f:
            r2.A0v = r5
            r0 = r30
            r2.A0P = r0
            r2.A0N = r6
            goto L_0x0286
        L_0x0298:
            r0 = 0
            goto L_0x023a
        L_0x029a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02a2:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310076aO.A00(androidx.fragment.app.Fragment, X.3uh, X.3mM, X.4mU, X.6Yf, X.VWL, X.2EG, X.VYx):void");
    }
}
