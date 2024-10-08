package com.instagram.opal.impl.data;

import X.05G;
import X.0Tu;
import X.0qQ;
import X.182;
import X.1Hj;
import X.1qJ;
import X.1vn;
import X.1wn;
import X.AnonymousClass1Nd;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C229342nE;
import X.C229352nF;
import X.C252733pa;
import X.C324576zY;
import X.C335967dq;
import X.C51640Fxb;
import X.C60340gF;
import X.C61064Jw2;
import X.C61074JwC;
import X.C62520KhB;
import X.DbS;
import X.FXZ;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OpalRepository extends C252733pa {
    public final C229352nF A00;
    public final 1wn A01;
    public final AnonymousClass4HW A02;
    public final AnonymousClass4HW A03;
    public final UserSession A04;
    public final 1vn A05;
    public final String A06;
    public final List A07;
    public final 05G A08 = DbS.A10(new C61074JwC());
    public final Context A09;
    public final AnonymousClass4HW A0A;
    public final AnonymousClass4HW A0B;

    public final Object A04(String str, AnonymousClass4D7 r11, boolean z) {
        C60340gF r2;
        Object A002;
        boolean A062 = 182.A06(0Tu.A05, this.A04, 36321082428761161L);
        AnonymousClass4HW r0 = this.A02;
        String str2 = str;
        boolean z2 = z;
        if (!A062) {
            C51640Fxb fxb = new C51640Fxb(this, str2, (AnonymousClass4D7) null, 0, z2);
            r2 = C60340gF.A00;
            A002 = r0.A00(r2, r11, fxb);
            if (A002 != 1Hj.A02) {
                A002 = r2;
            }
        } else {
            C51640Fxb fxb2 = new C51640Fxb(this, str2, (AnonymousClass4D7) null, 1, z2);
            r2 = C60340gF.A00;
            A002 = r0.A00(r2, r11, fxb2);
        }
        if (A002 != 1Hj.A02) {
            return r2;
        }
        return A002;
    }

    public final Object A06(String str, AnonymousClass4D7 r9, boolean z, boolean z2) {
        AnonymousClass4HW r0 = this.A0A;
        OpalRepository$fetchOpalClipsData$2 opalRepository$fetchOpalClipsData$2 = new OpalRepository$fetchOpalClipsData$2(this, str, (AnonymousClass4D7) null, z2, z);
        C60340gF r2 = C60340gF.A00;
        Object A002 = r0.A00(r2, r9, opalRepository$fetchOpalClipsData$2);
        if (A002 != 1Hj.A02) {
            return r2;
        }
        return A002;
    }

    public static final void A00(C61064Jw2 jw2, OpalRepository opalRepository) {
        Object value;
        C61074JwC jwC;
        OpalProfileData opalProfileData;
        C61064Jw2 jw22;
        05G r5 = opalRepository.A08;
        do {
            value = r5.getValue();
            jwC = (C61074JwC) value;
            opalProfileData = (OpalProfileData) jwC.A02;
            jw22 = (C61064Jw2) jwC.A00;
            AnonymousClass7TG.A1T(opalProfileData, jw2, jw22);
        } while (!r5.AIY(value, new C61074JwC(jw2, jw22, (C324576zY) jwC.A03, opalProfileData)));
    }

    public static final void A01(OpalRepository opalRepository, C62520KhB khB) {
        Object value;
        C61074JwC jwC;
        C61064Jw2 jw2;
        OpalProfileData opalProfileData;
        C61064Jw2 jw22;
        05G r7 = opalRepository.A08;
        do {
            value = r7.getValue();
            jwC = (C61074JwC) value;
            C61064Jw2 jw23 = (C61064Jw2) jwC.A00;
            List list = (List) jw23.A00;
            String str = jw23.A02;
            boolean z = jw23.A03;
            AnonymousClass7TG.A1N(list, khB);
            jw2 = new C61064Jw2(khB, str, list, z);
            opalProfileData = (OpalProfileData) jwC.A02;
            jw22 = (C61064Jw2) jwC.A01;
            AnonymousClass7TG.A1T(opalProfileData, jw22, jw2);
        } while (!r7.AIY(value, new C61074JwC(jw22, jw2, (C324576zY) jwC.A03, opalProfileData)));
    }

    public static final void A02(OpalRepository opalRepository, C62520KhB khB) {
        Object value;
        C61074JwC jwC;
        C61064Jw2 jw2;
        OpalProfileData opalProfileData;
        C61064Jw2 jw22;
        05G r7 = opalRepository.A08;
        do {
            value = r7.getValue();
            jwC = (C61074JwC) value;
            C61064Jw2 jw23 = (C61064Jw2) jwC.A01;
            List list = (List) jw23.A00;
            String str = jw23.A02;
            boolean z = jw23.A03;
            AnonymousClass7TG.A1N(list, khB);
            jw2 = new C61064Jw2(khB, str, list, z);
            opalProfileData = (OpalProfileData) jwC.A02;
            jw22 = (C61064Jw2) jwC.A00;
            AnonymousClass7TG.A1T(opalProfileData, jw2, jw22);
        } while (!r7.AIY(value, new C61074JwC(jw2, jw22, (C324576zY) jwC.A03, opalProfileData)));
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[LOOP:0: B:11:0x0038->B:12:0x0047, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c A[LOOP:1: B:14:0x004c->B:15:0x006f, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.opal.impl.data.OpalProfileData r21, X.AnonymousClass4D7 r22) {
        /*
            r20 = this;
            r8 = r21
            r3 = 13
            r6 = r22
            boolean r0 = X.ME9.A03(r3, r6)
            r5 = r20
            if (r0 == 0) goto L_0x00b7
            r4 = r6
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001c:
            java.lang.Object r6 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0072
            if (r0 != r2) goto L_0x00be
            java.lang.Object r8 = r4.A02
            com.instagram.opal.impl.data.OpalProfileData r8 = (com.instagram.opal.impl.data.OpalProfileData) r8
            java.lang.Object r0 = r4.A01
            com.instagram.opal.impl.data.OpalRepository r0 = (com.instagram.opal.impl.data.OpalRepository) r0
            X.0eS.A00(r6)
        L_0x0032:
            com.instagram.opal.impl.data.OpalProfileData r6 = (com.instagram.opal.impl.data.OpalProfileData) r6
            X.05G r3 = r0.A08
            if (r6 == 0) goto L_0x004c
        L_0x0038:
            java.lang.Object r1 = r3.getValue()
            r0 = r1
            X.JwC r0 = (X.C61074JwC) r0
            X.JwC r0 = X.C61074JwC.A00(r0, r6)
            boolean r0 = r3.AIY(r1, r0)
            if (r0 == 0) goto L_0x0038
        L_0x0049:
            X.0gF r3 = X.C60340gF.A00
        L_0x004b:
            return r3
        L_0x004c:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.JwC r1 = (X.C61074JwC) r1
            r16 = 0
            r10 = 0
            X.KhB r9 = X.C62520KhB.Error
            r17 = 7935(0x1eff, float:1.112E-41)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r16
            r19 = r16
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.JwC r0 = X.C61074JwC.A00(r1, r0)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x004c
            goto L_0x0049
        L_0x0072:
            X.0eS.A00(r6)
            X.05G r7 = r5.A08
        L_0x0077:
            java.lang.Object r6 = r7.getValue()
            r1 = r6
            X.JwC r1 = (X.C61074JwC) r1
            r16 = 0
            r10 = 0
            X.KhB r9 = X.C62520KhB.Saving
            r17 = 7935(0x1eff, float:1.112E-41)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r16
            r19 = r16
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.JwC r0 = X.C61074JwC.A00(r1, r0)
            boolean r0 = r7.AIY(r6, r0)
            if (r0 == 0) goto L_0x0077
            com.instagram.opal.impl.data.OpalRepoUtil r9 = com.instagram.opal.impl.data.OpalRepoUtil.A00
            android.content.Context r10 = r5.A09
            com.instagram.common.session.UserSession r1 = r5.A04
            X.1vn r0 = r5.A05
            r4.A01 = r5
            r4.A02 = r8
            r4.A00 = r2
            r13 = r8
            r11 = r1
            r12 = r0
            r14 = r4
            java.lang.Object r6 = r9.A01(r10, r11, r12, r13, r14)
            if (r6 == r3) goto L_0x004b
            r0 = r5
            goto L_0x0032
        L_0x00b7:
            X.ME9 r4 = new X.ME9
            r4.<init>(r5, r6, r3)
            goto L_0x001c
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepository.A03(com.instagram.opal.impl.data.OpalProfileData, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1 != X.C62520KhB.Error) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r12, X.AnonymousClass4D7 r13, boolean r14) {
        /*
            r11 = this;
            r3 = 18
            boolean r0 = X.C66138MDq.A02(r3, r13)
            r6 = r11
            if (r0 == 0) goto L_0x005f
            r4 = r13
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r2) goto L_0x0065
            java.lang.Object r9 = r4.A01
            X.0rm r9 = (X.0rm) r9
            X.0eS.A00(r1)
        L_0x0029:
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L_0x003e
            com.instagram.opal.impl.data.OpalProfileData r0 = (com.instagram.opal.impl.data.OpalProfileData) r0
            if (r0 == 0) goto L_0x003c
            X.KhB r1 = r0.A01
        L_0x0033:
            X.KhB r0 = X.C62520KhB.Error
            if (r1 == r0) goto L_0x003e
        L_0x0037:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x003c:
            r1 = 0
            goto L_0x0033
        L_0x003e:
            r2 = 0
            goto L_0x0037
        L_0x0040:
            X.0eS.A00(r1)
            X.0rm r9 = new X.0rm
            r9.<init>()
            X.4HW r1 = r11.A0B
            r8 = 0
            com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2 r5 = new com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2
            r7 = r12
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r9
            r4.A00 = r2
            X.0gF r0 = X.C60340gF.A00
            java.lang.Object r0 = r1.A00(r0, r4, r5)
            if (r0 != r3) goto L_0x0029
            return r3
        L_0x005f:
            X.MDq r4 = new X.MDq
            r4.<init>(r11, r13, r3)
            goto L_0x0017
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepository.A05(java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpalRepository(Context context, UserSession userSession, 1vn r6, String str) {
        super("Opal", AnonymousClass43D.A01(72627069, 3));
        AnonymousClass7TG.A1O(str, userSession);
        AnonymousClass7TF.A1D(context, 3, r6);
        this.A06 = str;
        this.A04 = userSession;
        this.A09 = context;
        this.A05 = r6;
        AnonymousClass4HU r1 = AnonymousClass4HU.A00;
        this.A02 = C335967dq.A00(r1);
        this.A0A = C335967dq.A00(r1);
        this.A0B = C335967dq.A00(r1);
        this.A03 = C335967dq.A00(r1);
        C229352nF A002 = C229342nE.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
        this.A07 = AnonymousClass7TE.A1C();
        FXZ A003 = FXZ.A00(this, 52);
        this.A01 = A003;
        AnonymousClass1Nd.A00(userSession).A01(A003, 1qJ.class);
    }
}
