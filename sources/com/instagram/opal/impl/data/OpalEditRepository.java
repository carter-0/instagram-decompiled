package com.instagram.opal.impl.data;

import X.02z;
import X.05G;
import X.0qQ;
import X.0s0;
import X.0sn;
import X.0xY;
import X.0xa;
import X.1Au;
import X.1Av;
import X.1vm;
import X.1vn;
import X.AnonymousClass0YZ;
import X.AnonymousClass43D;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C273654mx;
import X.C62520KhB;
import X.DbS;
import X.DbU;
import X.N4R;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OpalEditRepository extends C252733pa {
    public final Context A00;
    public final UserSession A01;
    public final 1vn A02;
    public final 05G A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpalEditRepository(Context context, UserSession userSession) {
        super("Opal", AnonymousClass43D.A01(72627069, 3));
        Object value;
        UserSession userSession2 = userSession;
        1vn A012 = 1vm.A01(userSession2);
        Context context2 = context;
        AnonymousClass7TG.A1O(userSession2, context2);
        0qQ.A0B(A012, 3);
        this.A01 = userSession2;
        this.A00 = context2;
        this.A02 = A012;
        02z A10 = DbS.A10(new N4R((OpalProfileData) null, (C62520KhB) null, (DefaultConstructorMarker) null, 3, 43));
        this.A03 = A10;
        User A0Q = AnonymousClass7TF.A0Q(userSession2);
        String str = "";
        String str2 = "";
        OpalProfileData opalProfileData = new OpalProfileData(C62520KhB.Uninitialized, A0Q.getId(), A0Q.getUsername(), "", str, (String) null, str2, 0sn.A00, 0, AnonymousClass7TF.A1V(A0Q.A03.BYD()), false, false, false);
        do {
            value = A10.getValue();
        } while (!A10.AIY(value, N4R.A00(opalProfileData, (C62520KhB) ((N4R) value).A02)));
    }

    private final void A00() {
        1Av A002 = 1Au.A00(this.A01);
        0xa r5 = A002.A01;
        0xY AR4 = r5.AR4();
        AR4.E5Z("opal_delight_animation_count", 0);
        0xY A0e = DbU.A0e(AR4, r5);
        A0e.E5Z(C273654mx.A00(862), 0);
        0xY A0e2 = DbU.A0e(A0e, r5);
        A0e2.E5Z("opal_profile_menu_option_view_count", 0);
        0xY A0e3 = DbU.A0e(A0e2, r5);
        A0e3.E5Z("opal_profile_tease_animation_count", 0);
        A0e3.apply();
        0s0 r1 = A002.A4u;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        r1.Epx(A002, false, r3[453]);
        DbS.A1a(A002, false, A002.A5S, r3, 454);
        DbS.A1a(A002, false, A002.A5T, r3, 456);
        DbS.A1a(A002, false, A002.A4L, r3, 455);
        0xY AR42 = r5.AR4();
        AR42.E5T("has_seen_feed_opal_indicator_tooltip", false);
        AR42.apply();
    }

    public static boolean A01(N4R n4r, C62520KhB khB, Object obj, 05G r3) {
        return r3.AIY(obj, N4R.A00((OpalProfileData) n4r.A00, khB));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r2 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (r13 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r13 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r2 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r15 = r2.Afn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r15 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        r9 = X.C62520KhB.Loaded;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if (r2 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r17 = r2.BrZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r3.A03.BYD() == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r8 = new com.instagram.opal.impl.data.OpalProfileData(r9, r10, r11, r12, r13, (java.lang.String) null, r15, X.0sn.A00, r17, r18, false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.opal.impl.data.OpalProfileData r28, X.AnonymousClass4D7 r29) {
        /*
            r27 = this;
            r8 = r28
            r5 = 12
            r6 = r29
            boolean r0 = X.ME9.A03(r5, r6)
            r4 = r27
            if (r0 == 0) goto L_0x0162
            r3 = r6
            X.ME9 r3 = (X.ME9) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0162
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001c:
            java.lang.Object r5 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r14 = 0
            r1 = 1
            if (r0 == 0) goto L_0x010e
            if (r0 != r1) goto L_0x0169
            java.lang.Object r8 = r3.A02
            com.instagram.opal.impl.data.OpalProfileData r8 = (com.instagram.opal.impl.data.OpalProfileData) r8
            java.lang.Object r0 = r3.A01
            com.instagram.opal.impl.data.OpalEditRepository r0 = (com.instagram.opal.impl.data.OpalEditRepository) r0
            X.0eS.A00(r5)
        L_0x0033:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00fc
            X.3lr r5 = X.C41846B3n.A0R(r5)
            if (r5 == 0) goto L_0x00f9
            java.lang.Class<com.instagram.opal.impl.graphql.RemoveEveryoneMutationResponseImpl$XdtClearOpalAudience> r3 = com.instagram.opal.impl.graphql.RemoveEveryoneMutationResponseImpl.XdtClearOpalAudience.class
            X.3sh r1 = X.C250663lr.Companion
            r2 = -441759890(0xffffffffe5ab476e, float:-1.0110529E23)
            r4 = 0
            r1 = 1936(0x790, float:2.713E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.3lr r3 = r5.getRequiredTreeField(r4, r1, r3, r2)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.RemoveEveryoneMutationResponseImpl.XdtClearOpalAudience"
            X.0qQ.A0C(r3, r1)
            if (r3 == 0) goto L_0x00f9
            X.EWx r2 = X.C48131EWx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "status"
            java.lang.Enum r2 = r3.getRequiredEnumField(r4, r1, r2)
            X.0qQ.A07(r2)
        L_0x0063:
            X.EWx r1 = X.C48131EWx.SUCCESS
            if (r2 != r1) goto L_0x00fc
            if (r8 != 0) goto L_0x00bb
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.String r10 = r1.A06
            r19 = 0
            com.instagram.user.model.User r3 = X.DbV.A0j(r1, r10)
            if (r3 == 0) goto L_0x00ec
            X.4Cl r1 = r3.A03
            X.4bl r2 = r1.BYD()
            java.lang.String r11 = r3.getUsername()
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x0089
            java.lang.String r12 = r2.getName()
            if (r12 != 0) goto L_0x008c
        L_0x0089:
            r12 = r1
            if (r2 == 0) goto L_0x0092
        L_0x008c:
            java.lang.String r13 = r2.Bh8()
            if (r13 != 0) goto L_0x0095
        L_0x0092:
            r13 = r1
            if (r2 == 0) goto L_0x009b
        L_0x0095:
            java.lang.String r15 = r2.Afn()
            if (r15 != 0) goto L_0x009c
        L_0x009b:
            r15 = r1
        L_0x009c:
            X.KhB r9 = X.C62520KhB.Loaded
            r18 = 0
            if (r2 == 0) goto L_0x00e9
            int r17 = r2.BrZ()
        L_0x00a6:
            X.4Cl r1 = r3.A03
            X.4bl r1 = r1.BYD()
            if (r1 == 0) goto L_0x00b0
            r18 = 1
        L_0x00b0:
            X.0sn r16 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r8 = new com.instagram.opal.impl.data.OpalProfileData
            r20 = r19
            r21 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00bb:
            r10 = 0
            X.0sn r9 = X.0sn.A00
            r11 = 5119(0x13ff, float:7.173E-42)
            r2 = r8
            r3 = r14
            r4 = r14
            r5 = r14
            r6 = r14
            r7 = r14
            r8 = r14
            r12 = r10
            r13 = r10
            com.instagram.opal.impl.data.OpalProfileData r3 = com.instagram.opal.impl.data.OpalProfileData.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.opal.impl.data.OpalRepoUtil r2 = com.instagram.opal.impl.data.OpalRepoUtil.A00
            com.instagram.common.session.UserSession r1 = r0.A01
            r2.A03(r1, r3)
            X.05G r2 = r0.A03
        L_0x00d6:
            java.lang.Object r1 = r2.getValue()
            X.KhB r0 = X.C62520KhB.Loaded
            X.N4R r0 = X.N4R.A00(r3, r0)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x00d6
        L_0x00e6:
            X.0gF r2 = X.C60340gF.A00
        L_0x00e8:
            return r2
        L_0x00e9:
            r17 = 0
            goto L_0x00a6
        L_0x00ec:
            X.05G r1 = r0.A03
            java.lang.Object r1 = r1.getValue()
            X.N4R r1 = (X.N4R) r1
            java.lang.Object r8 = r1.A00
            com.instagram.opal.impl.data.OpalProfileData r8 = (com.instagram.opal.impl.data.OpalProfileData) r8
            goto L_0x00bb
        L_0x00f9:
            r2 = r14
            goto L_0x0063
        L_0x00fc:
            X.05G r3 = r0.A03
        L_0x00fe:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.N4R r1 = (X.N4R) r1
            X.KhB r0 = X.C62520KhB.Error
            boolean r0 = A01(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x00fe
            goto L_0x00e6
        L_0x010e:
            X.0eS.A00(r5)
            X.05G r7 = r4.A03
        L_0x0113:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            X.N4R r5 = (X.N4R) r5
            X.KhB r0 = X.C62520KhB.Loading
            boolean r0 = A01(r5, r0, r6, r7)
            if (r0 == 0) goto L_0x0113
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r16 = X.C41845B3m.A05()
            java.util.Map r18 = r5.getParamsCopy()
            java.util.Map r19 = r0.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.RemoveEveryoneMutationResponseImpl> r20 = com.instagram.opal.impl.graphql.RemoveEveryoneMutationResponseImpl.class
            java.util.ArrayList r26 = X.AnonymousClass7TE.A1C()
            java.lang.String r17 = "RemoveEveryoneMutation"
            r23 = 0
            r0 = 1936(0x790, float:2.713E-42)
            java.lang.String r25 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r15 = new com.facebook.pando.PandoGraphQLRequest
            r21 = r1
            r22 = r14
            r24 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.1vn r0 = r4.A02
            r3.A01 = r4
            r3.A02 = r8
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r15, r3)
            if (r5 == r2) goto L_0x00e8
            r0 = r4
            goto L_0x0033
        L_0x0162:
            X.ME9 r3 = new X.ME9
            r3.<init>(r4, r6, r5)
            goto L_0x001c
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalEditRepository.A02(com.instagram.opal.impl.data.OpalProfileData, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A[LOOP:0: B:11:0x002e->B:12:0x003c, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[LOOP:1: B:14:0x0041->B:15:0x004e, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.opal.impl.data.OpalProfileData r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r3 = 16
            boolean r0 = X.C66138MDq.A02(r3, r13)
            if (r0 == 0) goto L_0x007b
            r10 = r13
            X.MDq r10 = (X.C66138MDq) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007b
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r10.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r3) goto L_0x0081
            java.lang.Object r0 = r10.A01
            com.instagram.opal.impl.data.OpalEditRepository r0 = (com.instagram.opal.impl.data.OpalEditRepository) r0
            X.0eS.A00(r2)
        L_0x0028:
            com.instagram.opal.impl.data.OpalProfileData r2 = (com.instagram.opal.impl.data.OpalProfileData) r2
            X.05G r3 = r0.A03
            if (r2 == 0) goto L_0x0041
        L_0x002e:
            java.lang.Object r1 = r3.getValue()
            X.KhB r0 = X.C62520KhB.Loaded
            X.N4R r0 = X.N4R.A00(r2, r0)
            boolean r0 = r3.AIY(r1, r0)
            if (r0 == 0) goto L_0x002e
        L_0x003e:
            X.0gF r4 = X.C60340gF.A00
        L_0x0040:
            return r4
        L_0x0041:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.N4R r1 = (X.N4R) r1
            X.KhB r0 = X.C62520KhB.Error
            boolean r0 = A01(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x0041
            goto L_0x003e
        L_0x0051:
            X.0eS.A00(r2)
            X.05G r2 = r11.A03
        L_0x0056:
            java.lang.Object r1 = r2.getValue()
            X.KhB r0 = X.C62520KhB.Loading
            r9 = r12
            X.N4R r0 = X.N4R.A00(r12, r0)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0056
            com.instagram.opal.impl.data.OpalRepoUtil r5 = com.instagram.opal.impl.data.OpalRepoUtil.A00
            android.content.Context r6 = r11.A00
            com.instagram.common.session.UserSession r7 = r11.A01
            X.1vn r8 = r11.A02
            r10.A01 = r11
            r10.A00 = r3
            java.lang.Object r2 = r5.A01(r6, r7, r8, r9, r10)
            if (r2 == r4) goto L_0x0040
            r0 = r11
            goto L_0x0028
        L_0x007b:
            X.MDq r10 = new X.MDq
            r10.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x0081:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalEditRepository.A03(com.instagram.opal.impl.data.OpalProfileData, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r24) {
        /*
            r23 = this;
            r5 = 15
            r6 = r24
            boolean r0 = X.C66138MDq.A02(r5, r6)
            r4 = r23
            if (r0 == 0) goto L_0x011a
            r3 = r6
            X.MDq r3 = (X.C66138MDq) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011a
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r10 = 0
            r0 = 1
            if (r1 == 0) goto L_0x00c8
            if (r1 != r0) goto L_0x0121
            java.lang.Object r3 = r3.A01
            com.instagram.opal.impl.data.OpalEditRepository r3 = (com.instagram.opal.impl.data.OpalEditRepository) r3
            X.0eS.A00(r5)
        L_0x002d:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00b3
            X.3lr r6 = X.C41846B3n.A0R(r5)
            if (r6 == 0) goto L_0x00b1
            java.lang.Class<com.instagram.opal.impl.graphql.DeleteOpalMutationResponseImpl$XdtDeleteOpal> r4 = com.instagram.opal.impl.graphql.DeleteOpalMutationResponseImpl.XdtDeleteOpal.class
            X.3sh r1 = X.C250663lr.Companion
            r2 = 1915251565(0x72286b6d, float:3.3358945E30)
            r5 = 0
            r1 = 1937(0x791, float:2.714E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.3lr r4 = r6.getRequiredTreeField(r5, r1, r4, r2)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.DeleteOpalMutationResponseImpl.XdtDeleteOpal"
            X.0qQ.A0C(r4, r1)
            if (r4 == 0) goto L_0x00b1
            X.EWx r2 = X.C48131EWx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "status"
            java.lang.Enum r2 = r4.getRequiredEnumField(r5, r1, r2)
            X.0qQ.A07(r2)
        L_0x005d:
            X.EWx r1 = X.C48131EWx.SUCCESS
            if (r2 != r1) goto L_0x00b3
            X.05G r2 = r3.A03
            java.lang.Object r1 = r2.getValue()
            X.N4R r1 = (X.N4R) r1
            java.lang.Object r1 = r1.A00
            com.instagram.opal.impl.data.OpalProfileData r1 = (com.instagram.opal.impl.data.OpalProfileData) r1
            java.lang.String r6 = r1.A05
            java.lang.String r7 = r1.A07
            boolean r14 = r1.A09
            java.lang.String r8 = ""
            r13 = 0
            X.KhB r5 = X.C62520KhB.Uninitialized
            X.0sn r12 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r4 = new com.instagram.opal.impl.data.OpalProfileData
            r9 = r8
            r11 = r8
            r15 = r13
            r16 = r13
            r17 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.KhB r6 = X.C62520KhB.Loaded
            r14 = 7423(0x1cff, float:1.0402E-41)
            r5 = r4
            r7 = r10
            r8 = r10
            r9 = r10
            r11 = r10
            r12 = r10
            r16 = r0
            com.instagram.opal.impl.data.OpalProfileData r4 = com.instagram.opal.impl.data.OpalProfileData.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.opal.impl.data.OpalRepoUtil r1 = com.instagram.opal.impl.data.OpalRepoUtil.A00
            com.instagram.common.session.UserSession r0 = r3.A01
            r1.A03(r0, r4)
            r3.A00()
        L_0x00a0:
            java.lang.Object r1 = r2.getValue()
            X.N4R r0 = X.N4R.A00(r4, r6)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x00a0
        L_0x00ae:
            X.0gF r2 = X.C60340gF.A00
        L_0x00b0:
            return r2
        L_0x00b1:
            r2 = r10
            goto L_0x005d
        L_0x00b3:
            r3.A00()
            X.05G r3 = r3.A03
        L_0x00b8:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.N4R r1 = (X.N4R) r1
            X.KhB r0 = X.C62520KhB.Error
            boolean r0 = A01(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x00b8
            goto L_0x00ae
        L_0x00c8:
            X.0eS.A00(r5)
            X.05G r7 = r4.A03
        L_0x00cd:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            X.N4R r5 = (X.N4R) r5
            X.KhB r1 = X.C62520KhB.Loading
            boolean r1 = A01(r5, r1, r6, r7)
            if (r1 == 0) goto L_0x00cd
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            X.1vR r12 = X.C41845B3m.A05()
            java.util.Map r14 = r5.getParamsCopy()
            java.util.Map r15 = r1.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.DeleteOpalMutationResponseImpl> r16 = com.instagram.opal.impl.graphql.DeleteOpalMutationResponseImpl.class
            java.util.ArrayList r22 = X.AnonymousClass7TE.A1C()
            java.lang.String r13 = "DeleteOpalMutation"
            r19 = 0
            r1 = 1937(0x791, float:2.714E-42)
            java.lang.String r21 = X.AnonymousClass000.A00(r1)
            com.facebook.pando.PandoGraphQLRequest r11 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r0
            r18 = r10
            r20 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1vn r1 = r4.A02
            r3.A01 = r4
            r3.A00 = r0
            java.lang.Object r5 = r1.A04(r11, r3)
            if (r5 == r2) goto L_0x00b0
            r3 = r4
            goto L_0x002d
        L_0x011a:
            X.MDq r3 = new X.MDq
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x0121:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalEditRepository.A04(X.4D7):java.lang.Object");
    }
}
