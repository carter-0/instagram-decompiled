package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.8KO  reason: invalid class name */
public final class AnonymousClass8KO {
    public final Context A00;
    public final 28D A01;
    public final UserSession A02;
    public final C3499582p A03;
    public final AnonymousClass80D A04;
    public final AnonymousClass8KN A05;
    public final AnonymousClass4D6 A06;

    public final TransformMatrixConfig A02(TargetViewSizeProvider targetViewSizeProvider, C364758lx r5, C352218Cl r6) {
        C3499582p r0;
        TransformMatrixConfig transformMatrixConfig;
        0qQ.A0B(targetViewSizeProvider, 2);
        if (r5 != null && (transformMatrixConfig = r5.A03) != null) {
            return transformMatrixConfig;
        }
        AnonymousClass81W r02 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = r02.getWidth();
        int height = r02.getHeight();
        if ((!r6.A0y || !r6.A19) && (r0 = this.A03) != null) {
            r0.A02.A0I();
        }
        return C364738lv.A02(r6, 1.0f, width, height);
    }

    public final C39650A3q A03(1GK r35, 1GK r36, 1GK r37, TargetViewSizeProvider targetViewSizeProvider, B1O b1o, C364758lx r40, A6R a6r, C273814nE r42, C352218Cl r43, LinkedHashMap linkedHashMap, Set set, boolean z, boolean z2, boolean z3) {
        String str;
        C352218Cl r11 = r43;
        0qQ.A0B(r11, 0);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 5);
        B1O b1o2 = b1o;
        C364758lx r6 = r40;
        A6R a6r2 = a6r;
        C273814nE r9 = r42;
        A76 a76 = new A76(targetViewSizeProvider2, b1o2, r6, this, a6r2, r9, (AnonymousClass8VT) null, r11, AnonymousClass0HM.A00().toString(), (String) null, "share_sheet", set, z, z3);
        boolean z4 = z2;
        1GK r62 = r36;
        if (r36 != null || z2) {
            a76.A03.A5w = true;
        }
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass3Q2 r5 = a76.A03;
        FilterGroupModel filterGroupModel = a76.A02;
        L83 l83 = a76.A01;
        AnonymousClass4D6 r2 = this.A06;
        AnonymousClass80D r0 = this.A04;
        if (r0 != null) {
            str = r0.A2i;
        } else {
            str = null;
        }
        1GK r27 = r35;
        if (r5.A5w) {
            C41264Ar0 ar0 = new C41264Ar0(context, userSession, r2, r27, l83, filterGroupModel, r5, r11, str);
            1GK r16 = r37;
            if (r36 != null) {
                C59797JYq.A0B(userSession, r2, r62, new C40379AbC(context, userSession, r2, r16, l83, filterGroupModel, r5, r11, ar0, z4));
            } else if (z2) {
                C59797JYq.A05(context, userSession, r2, r16, l83, filterGroupModel, r5, r11, ar0, false);
            } else {
                throw new IllegalStateException("Cannot prepare Story Template PendingMedia if neither overlay nor background are part of the template");
            }
        } else {
            C59797JYq.A06(context, userSession, r2, r27, l83, filterGroupModel, r5, r11, str, linkedHashMap);
        }
        String str2 = r5.A35;
        0qQ.A0B(str2, 0);
        return new C39650A3q(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007c, code lost:
        if (r9 != true) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.1GK r41, X.1GK r42, X.1GK r43, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r44, X.B1O r45, X.C364758lx r46, X.LD4 r47, X.C381539bv r48, X.C381779cJ r49, X.A6R r50, X.L8M r51, X.AnonymousClass8VT r52, X.C15023UKc r53, X.C352218Cl r54, java.lang.Boolean r55, java.lang.Boolean r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.util.List r62, java.util.List r63, java.util.Set r64, X.0sP r65, X.0sP r66, boolean r67, boolean r68, boolean r69) {
        /*
            r40 = this;
            r0 = 5
            r9 = r47
            X.0qQ.A0B(r9, r0)
            r0 = 12
            r6 = r44
            X.0qQ.A0B(r6, r0)
            r13 = r52
            r12 = r50
            r11 = r49
            r10 = r48
            r8 = r46
            r7 = r45
            r5 = r40
            r26 = r69
            r14 = r53
            r15 = r54
            r16 = r55
            r25 = r64
            r24 = r63
            r23 = r62
            r22 = r61
            r21 = r60
            r20 = r59
            r19 = r58
            r18 = r57
            r17 = r56
            X.A76 r0 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.3Q2 r4 = r0.A03
            android.content.Context r3 = r5.A00
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r0.A02
            boolean r27 = r5.A01(r9)
            X.L83 r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r5.A02
            X.4D6 r5 = r5.A06
            r8 = 0
            X.0qQ.A0B(r4, r8)
            r6 = 1
            r7 = 2
            X.0qQ.A0B(r3, r7)
            r7 = 5
            X.0qQ.A0B(r1, r7)
            r7 = r51
            X.C59797JYq.A0C(r0, r9, r7, r4)
            com.instagram.model.direct.DirectShareTarget r11 = r9.A00
            if (r11 == 0) goto L_0x009d
            X.2Dm r9 = X.1bJ.A00(r0)
            com.instagram.model.direct.DirectThreadKey r7 = r11.A00()
            X.3U9 r10 = r9.B33(r7)
            if (r10 == 0) goto L_0x009d
            if (r67 == 0) goto L_0x00c0
            java.lang.Integer r19 = X.AnonymousClass05K.A0N
        L_0x0071:
            X.ODs r7 = r10.B25()
            if (r7 == 0) goto L_0x007e
            boolean r9 = X.C70054NwW.A00(r7)
            r7 = 1
            if (r9 == r6) goto L_0x007f
        L_0x007e:
            r7 = 0
        L_0x007f:
            com.instagram.model.direct.DirectThreadKey r17 = r11.A00()
            boolean r20 = r10.CVE()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r7)
            r22 = r8
            r16 = r0
            r21 = r8
            X.797 r8 = X.AnonymousClass796.A02(r16, r17, r18, r19, r20, r21, r22)
            X.797 r7 = X.AnonymousClass797.OPEN_ONLY
            if (r8 == r7) goto L_0x009d
            r4.A5D = r6
            r4.A53 = r6
        L_0x009d:
            X.C59797JYq.A0E(r0, r4)
            r32 = r42
            r20 = r41
            r38 = r68
            r26 = r66
            r25 = r65
            if (r68 != 0) goto L_0x00c3
            if (r42 != 0) goto L_0x00c3
            r17 = r3
            r18 = r0
            r19 = r5
            r21 = r1
            r22 = r2
            r23 = r4
            r24 = r15
            X.C63182Ksp.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        L_0x00c0:
            java.lang.Integer r19 = X.AnonymousClass05K.A04
            goto L_0x0071
        L_0x00c3:
            r4.A5w = r6
            X.Ar2 r16 = new X.Ar2
            r17 = r3
            r18 = r0
            r19 = r5
            r21 = r1
            r22 = r2
            r23 = r4
            r24 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7 = r43
            if (r43 == 0) goto L_0x00f9
            X.AbD r6 = new X.AbD
            r28 = r6
            r29 = r3
            r30 = r0
            r31 = r5
            r33 = r1
            r34 = r2
            r35 = r4
            r36 = r15
            r37 = r16
            r39 = r27
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.C59797JYq.A0B(r0, r5, r7, r6)
            return
        L_0x00f9:
            if (r68 == 0) goto L_0x010c
            r6 = r3
            r7 = r0
            r8 = r5
            r9 = r32
            r10 = r1
            r11 = r2
            r12 = r4
            r13 = r15
            r14 = r16
            r15 = r27
            X.C59797JYq.A05(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x010c:
            java.lang.String r1 = "Cannot prepare Story Template PendingMedia if neither overlay nor background are part of the template"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KO.A06(X.1GK, X.1GK, X.1GK, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.B1O, X.8lx, X.LD4, X.9bv, X.9cJ, X.A6R, X.L8M, X.8VT, X.UKc, X.8Cl, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.Set, X.0sP, X.0sP, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r24 != null) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.A76 A00(com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r20, X.B1O r21, X.C364758lx r22, X.LD4 r23, X.C381539bv r24, X.C381779cJ r25, X.A6R r26, X.AnonymousClass8VT r27, X.C15023UKc r28, X.C352218Cl r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.List r37, java.util.List r38, java.util.Set r39, boolean r40) {
        /*
            r19 = this;
            r0 = r23
            com.instagram.pendingmedia.model.constants.ShareType r2 = r0.A02
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.PROMPTS
            r0 = 0
            if (r2 != r1) goto L_0x000a
            r0 = 1
        L_0x000a:
            r1 = r25
            r3 = r24
            if (r25 != 0) goto L_0x0016
            if (r0 != 0) goto L_0x0016
            r17 = 0
            if (r24 == 0) goto L_0x00b3
        L_0x0016:
            r17 = 1
            if (r25 == 0) goto L_0x00b3
            java.lang.String r2 = r1.A06
            java.lang.String r1 = r1.A03
            r0 = 0
            X.4nE r10 = new X.4nE
            r10.<init>(r2, r1, r0)
        L_0x0024:
            r6 = 0
            r2 = 1
            X.A76 r4 = new X.A76
            r12 = r29
            r11 = r27
            r9 = r26
            r18 = r40
            r16 = r39
            r7 = r22
            r14 = r34
            r13 = r33
            r5 = r20
            r8 = r19
            r15 = r32
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r21
            if (r21 == 0) goto L_0x004a
            X.3Q2 r0 = r4.A03
            r1.FHp(r0)
        L_0x004a:
            r0 = r28
            if (r28 == 0) goto L_0x00a6
            X.3Q2 r1 = r4.A03
            r1.A1l = r0
            X.AeT r0 = new X.AeT
            r0.<init>(r8)
            r1.A0Y(r0)
        L_0x005a:
            if (r37 == 0) goto L_0x0064
            X.3Q2 r1 = r4.A03
            java.util.List r0 = X.00k.A0X(r37)
            r1.A49 = r0
        L_0x0064:
            r1 = r38
            if (r38 == 0) goto L_0x006c
            X.3Q2 r0 = r4.A03
            r0.A4e = r1
        L_0x006c:
            r0 = r35
            if (r35 == 0) goto L_0x0082
            X.3Q2 r1 = r4.A03
            r1.A31 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3 = r30
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0082
            r1.A56 = r2
        L_0x0082:
            r0 = r36
            if (r36 == 0) goto L_0x0099
            X.3Q2 r1 = r4.A03
            r1.A3D = r0
            r0 = 8
            r1.A0N = r0
            r0 = 0
            r1.A5e = r0
            X.CTE r0 = new X.CTE
            r0.<init>()
            r1.A0a(r0)
        L_0x0099:
            X.3Q2 r1 = r4.A03
            if (r31 == 0) goto L_0x00a4
            boolean r0 = r31.booleanValue()
        L_0x00a1:
            r1.A5B = r0
            return r4
        L_0x00a4:
            r0 = 0
            goto L_0x00a1
        L_0x00a6:
            if (r24 == 0) goto L_0x005a
            X.AeV r1 = new X.AeV
            r1.<init>(r8, r3)
            X.3Q2 r0 = r4.A03
            r0.A0Y(r1)
            goto L_0x005a
        L_0x00b3:
            r10 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KO.A00(com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.B1O, X.8lx, X.LD4, X.9bv, X.9cJ, X.A6R, X.8VT, X.UKc, X.8Cl, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.Set, boolean):X.A76");
    }

    private final boolean A01(LD4 ld4) {
        ShareType shareType = ld4.A02;
        if (shareType == ShareType.PROMPTS) {
            return true;
        }
        if ((ld4.A00 != null && shareType == ShareType.DIRECT_SHARE) || ld4.A00()) {
            return true;
        }
        if (shareType != ShareType.NOTE_MEDIA_REPLY) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A02, 36320738831377196L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r10.A19 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel A05(com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8, X.C364758lx r9, X.C352218Cl r10) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0007
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r9.A06
            if (r3 == 0) goto L_0x0007
            return r3
        L_0x0007:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r3 = X.C364978mK.A00()
            X.0v6 r1 = r10.A0I
            boolean r0 = r10.A0y
            if (r0 == 0) goto L_0x0016
            boolean r0 = r10.A19
            r4 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            X.82p r2 = r7.A03
            com.instagram.common.session.UserSession r0 = r7.A02
            r5 = 0
            r6 = r5
            X.C365048mR.A00(r0, r1, r2, r3, r4, r5, r6)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r1 = r3.A02
            float[] r0 = r8.C5o()
            X.C366708pX.A02(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KO.A05(com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, X.8lx, X.8Cl):com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel");
    }

    public AnonymousClass8KO(Context context, 28D r2, UserSession userSession, AnonymousClass4D6 r4, C3499582p r5, AnonymousClass80D r6, AnonymousClass8KN r7) {
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r4;
        this.A01 = r2;
    }

    public final C39651A3r A04(C53401GnY gnY, 1GK r57, 1GK r58, 1GK r59, TargetViewSizeProvider targetViewSizeProvider, B1O b1o, C364758lx r62, LD4 ld4, C381539bv r64, C381779cJ r65, A6R a6r, L8M l8m, AnonymousClass8VT r68, C15023UKc uKc, C352218Cl r70, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Set set, boolean z, boolean z2, boolean z3) {
        AnonymousClass3U9 B33;
        Integer num;
        boolean z4;
        LD4 ld42 = ld4;
        0qQ.A0B(ld42, 5);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 12);
        String str8 = str5;
        0qQ.A0B(str8, 19);
        C381779cJ r15 = r65;
        A6R a6r2 = a6r;
        C352218Cl r19 = r70;
        A76 A002 = A00(targetViewSizeProvider2, b1o, r62, ld42, r64, r15, a6r2, r68, uKc, r19, bool, bool2, str, str2, str3, str4, str6, list, list2, set, z3);
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass3Q2 r2 = A002.A03;
        FilterGroupModel filterGroupModel = A002.A02;
        L83 l83 = A002.A01;
        AnonymousClass4D6 r1 = this.A06;
        boolean A012 = A01(ld42);
        1ua A003 = 1ua.A00(context, userSession);
        C59797JYq.A0C(userSession, ld42, l8m, r2);
        DirectShareTarget directShareTarget = ld42.A00;
        boolean z5 = z;
        if (!(directShareTarget == null || (B33 = 1bJ.A00(userSession).B33(directShareTarget.A00())) == null)) {
            if (z) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A04;
            }
            C70621ODs B25 = B33.B25();
            if (B25 != null) {
                z4 = C70054NwW.A00(B25);
            } else {
                z4 = false;
            }
            if (AnonymousClass796.A02(userSession, directShareTarget.A00(), Boolean.valueOf(z4), num, B33.CVE(), false, false) != AnonymousClass797.OPEN_ONLY) {
                r2.A5D = true;
                r2.A53 = true;
            }
        }
        C53401GnY gnY2 = gnY;
        String str9 = str7;
        if (!z && !C59797JYq.A0G(userSession, directShareTarget)) {
            A003.A0E(r2);
            C59797JYq.A0A(gnY2, userSession, ld42, r15, r2, str9, (String) null);
        }
        C59797JYq.A0E(userSession, r2);
        1GK r24 = r57;
        1GK r9 = r58;
        boolean z6 = z2;
        if (z2 || r58 != null) {
            r2.A5w = true;
            C41268Ar4 ar4 = new C41268Ar4(context, userSession, r1, r24, ld42, l83, filterGroupModel, directShareTarget, r15, r2, A003, r19, str8, str9, A012, z5);
            1GK r14 = r59;
            if (r58 != null) {
                C59797JYq.A0B(userSession, r1, r9, new C40381AbE(context, userSession, r1, r14, l83, filterGroupModel, r2, r19, ar4, z6, A012));
            } else if (z2) {
                C59797JYq.A05(context, userSession, r1, r14, l83, filterGroupModel, r2, r19, ar4, A012);
            } else {
                throw new IllegalStateException("Cannot prepare Story Template PendingMedia if neither overlay nor background are part of the template");
            }
        } else {
            C59797JYq.A04(context, gnY2, userSession, r1, r24, ld42, l83, filterGroupModel, directShareTarget, r15, a6r2, r2, A003, r19, str8, str9, A012, z5);
        }
        return new C39651A3r(r2.A35);
    }
}
