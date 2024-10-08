package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.DlT  reason: case insensitive filesystem */
public final class C46794DlT extends 2YL implements CallerContextable {
    public static final String __redex_internal_original_name = "UpdateProfilePictureTabViewModel";
    public final Context A00;
    public final ONT A01;
    public final InstantAvatarsGraphQLRepository A02;
    public final AvatarStore A03;
    public final AnonymousClass0kM A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;
    public final 05G A08 = 106.A01(C47386Dwx.A00);
    public final 05G A09 = 106.A01(Dx1.A00);
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARNING: type inference failed for: r1v5, types: [X.7yS, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0230, code lost:
        if (r1 != false) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C46794DlT(android.content.Context r45, X.ONT r46, com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r47, com.instagram.common.session.UserSession r48, java.lang.String r49, java.lang.String r50, boolean r51, boolean r52) {
        /*
            r44 = this;
            r9 = r48
            com.instagram.avatars.store.AvatarStore r5 = X.25x.A00(r9)
            X.FYr r3 = X.C48927EmR.A00(r9)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            X.0kM r2 = new X.0kM
            r2.<init>(r9)
            com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository r1 = new com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository
            r1.<init>(r9)
            r10 = r45
            r6 = r47
            X.AnonymousClass7TG.A1U(r10, r9, r6)
            X.AnonymousClass7TG.A1R(r5, r3)
            r0 = 7
            r8 = r49
            r7 = r50
            X.AnonymousClass7TF.A1F(r8, r0, r7)
            r0 = 11
            X.0qQ.A0B(r2, r0)
            r0 = r44
            r0.<init>()
            r0.A00 = r10
            r0.A05 = r9
            r0.A03 = r5
            r5 = r46
            r0.A01 = r5
            r0.A07 = r8
            r0.A06 = r7
            r5 = r51
            r0.A0A = r5
            r5 = r52
            r0.A0B = r5
            r0.A04 = r2
            r0.A02 = r1
            X.Dwx r1 = X.C47386Dwx.A00
            X.02z r1 = X.106.A01(r1)
            r0.A08 = r1
            X.Dx1 r1 = X.Dx1.A00
            X.02z r1 = X.106.A01(r1)
            r0.A09 = r1
            X.7yS r1 = new X.7yS
            r1.<init>()
            r3.A00 = r1
            int r2 = r6.ordinal()
            r7 = 0
            if (r2 == r4) goto L_0x0081
            r1 = 1
            if (r2 != r1) goto L_0x007c
            com.instagram.avatars.store.AvatarStore r3 = r0.A03
            r2 = 14
            X.J6h r1 = new X.J6h
            r1.<init>(r0, r2)
            r3.A04(r1)
            return
        L_0x007c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0081:
            X.05G r6 = r0.A08
            android.content.Context r10 = r0.A00
            r14 = 2131238638(0x7f081eee, float:1.809356E38)
            r15 = 2131961494(0x7f132696, float:1.9559687E38)
            r16 = 2131961495(0x7f132697, float:1.9559689E38)
            r1 = 17
            X.FP6 r11 = new X.FP6
            r11.<init>((java.lang.Object) r0, (int) r1)
            r12 = 0
            r17 = 4080(0xff0, float:5.717E-42)
            X.F13 r9 = new X.F13
            r13 = r12
            r19 = r4
            r20 = r4
            r21 = r4
            r18 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.instagram.common.session.UserSession r3 = r0.A05
            boolean r1 = X.C322606w6.A06(r3)
            r1 = r1 ^ 1
            r43 = 0
            if (r1 != 0) goto L_0x00b3
            r9 = r12
        L_0x00b3:
            r24 = 2131955113(0x7f130da9, float:1.9546744E38)
            r2 = 18
            X.FP6 r1 = new X.FP6
            r1.<init>((java.lang.Object) r0, (int) r2)
            X.F13 r18 = new X.F13
            r19 = r10
            r20 = r1
            r21 = r12
            r22 = r12
            r23 = r14
            r25 = r24
            r26 = r17
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r1 = X.C322606w6.A06(r3)
            if (r1 != 0) goto L_0x00e0
            r18 = r12
        L_0x00e0:
            r24 = 2131238293(0x7f081d95, float:1.809286E38)
            r25 = 2131961492(0x7f132694, float:1.9559682E38)
            r26 = 2131961493(0x7f132695, float:1.9559684E38)
            r2 = 19
            X.FP6 r1 = new X.FP6
            r1.<init>((java.lang.Object) r0, (int) r2)
            X.F13 r19 = new X.F13
            r20 = r10
            r21 = r1
            r23 = r12
            r27 = r17
            r31 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.0Tu r5 = X.0Tu.A06
            r1 = 36321576349672982(0x810a4800012616, double:3.0332493665573354E-306)
            boolean r1 = X.182.A06(r5, r3, r1)
            if (r1 == 0) goto L_0x024b
            X.2Ly r8 = X.2Lv.A00(r3)
            java.lang.Class<X.DlT> r1 = X.C46794DlT.class
            com.facebook.common.callercontext.CallerContext r2 = com.facebook.common.callercontext.CallerContext.A00(r1)
            r1 = 527(0x20f, float:7.38E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r8.A00(r2, r1)
            if (r1 != 0) goto L_0x024b
            X.0Tu r8 = X.0Tu.A05
            r1 = 36321576349607445(0x810a4800002615, double:3.0332493665158896E-306)
            boolean r1 = X.182.A06(r8, r3, r1)
            if (r1 != 0) goto L_0x0257
        L_0x012f:
            r25 = 2131238040(0x7f081c98, float:1.8092347E38)
            r26 = 2131975010(0x7f135b62, float:1.95871E38)
            r2 = 20
            X.FP6 r1 = new X.FP6
            r1.<init>((java.lang.Object) r0, (int) r2)
            X.F13 r20 = new X.F13
            r21 = r10
            r22 = r1
            r24 = r12
            r27 = r26
            r28 = r17
            r32 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r1 = X.C322606w6.A06(r3)
            if (r1 != 0) goto L_0x0155
            r20 = r12
        L_0x0155:
            r26 = 2131238196(0x7f081d34, float:1.8092664E38)
            r27 = 2131961502(0x7f13269e, float:1.9559703E38)
            r28 = 2131961503(0x7f13269f, float:1.9559705E38)
            r2 = 21
            X.FP6 r1 = new X.FP6
            r1.<init>((java.lang.Object) r0, (int) r2)
            r4 = 1
            r29 = 4064(0xfe0, float:5.695E-42)
            X.F13 r21 = new X.F13
            r22 = r10
            r23 = r1
            r25 = r12
            r30 = r4
            r33 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            com.instagram.user.model.User r1 = X.AnonymousClass0eD.A00(r3)
            if (r1 == 0) goto L_0x021c
            boolean r1 = r1.isVerified()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r1 = r2.equals(r1)
            if (r1 != r4) goto L_0x021c
        L_0x018f:
            r21 = r12
        L_0x0191:
            java.lang.Boolean r1 = X.C306096Kt.A00(r3)
            boolean r1 = r1.booleanValue()
            r35 = 2131238821(0x7f081fa5, float:1.8093932E38)
            if (r1 == 0) goto L_0x01a1
            r35 = 2131238252(0x7f081d6c, float:1.8092777E38)
        L_0x01a1:
            r36 = 2131961500(0x7f13269c, float:1.9559699E38)
            r37 = 2131961501(0x7f13269d, float:1.95597E38)
            r2 = 16
            X.FP6 r1 = new X.FP6
            r1.<init>((java.lang.Object) r0, (int) r2)
            X.F13 r30 = new X.F13
            r31 = r10
            r32 = r1
            r33 = r12
            r34 = r12
            r38 = r29
            r39 = r4
            r40 = r7
            r41 = r7
            r42 = r7
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            com.instagram.user.model.User r0 = X.AnonymousClass0eD.A00(r3)
            if (r0 == 0) goto L_0x01d3
            boolean r0 = X.C240943Ng.A02(r3, r0)
            if (r0 == 0) goto L_0x01d3
            r43 = r30
        L_0x01d3:
            r38 = r9
            r39 = r18
            r40 = r19
            r41 = r20
            r42 = r21
            X.F13[] r0 = new X.F13[]{r38, r39, r40, r41, r42, r43}
            java.util.ArrayList r2 = X.0sr.A1M(r0)
            r0 = 36315400187022504(0x8104aa00060ca8, double:3.029343536427762E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x020b
            r15 = 2131961483(0x7f13268b, float:1.9559664E38)
            X.FOf r11 = X.C50090FOf.A00
            r17 = 2032(0x7f0, float:2.847E-42)
            X.F13 r0 = new X.F13
            r9 = r0
            r14 = r7
            r16 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.add(r7, r0)
        L_0x020b:
            java.util.List r0 = X.00k.A0a(r2)
            java.util.List r1 = X.00k.A0X(r0)
            X.Dwu r0 = new X.Dwu
            r0.<init>(r1)
            r6.Epw(r0)
            return
        L_0x021c:
            boolean r1 = X.DE2.A0F()
            if (r1 == 0) goto L_0x0234
            boolean r1 = X.DE2.A0G()
            if (r1 == 0) goto L_0x0234
            java.lang.Boolean r1 = X.DE2.A0A()
            boolean r1 = X.C41845B3m.A14(r1)
        L_0x0230:
            if (r1 == 0) goto L_0x018f
            goto L_0x0191
        L_0x0234:
            com.instagram.user.model.User r1 = X.AnonymousClass0eD.A00(r3)
            if (r1 == 0) goto L_0x0191
            boolean r1 = r1.A1n()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            boolean r1 = r2.equals(r1)
            goto L_0x0230
        L_0x024b:
            boolean r1 = X.DE2.A0F()
            if (r1 == 0) goto L_0x012f
            boolean r1 = X.DE2.A0G()
            if (r1 == 0) goto L_0x012f
        L_0x0257:
            r19 = r12
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46794DlT.<init>(android.content.Context, X.ONT, com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
