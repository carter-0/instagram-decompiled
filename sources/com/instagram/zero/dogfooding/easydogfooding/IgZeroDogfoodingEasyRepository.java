package com.instagram.zero.dogfooding.easydogfooding;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass0lh;
import X.C262204Co;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CancellationException;

public final class IgZeroDogfoodingEasyRepository implements AnonymousClass0lh {
    public C262204Co A00;
    public final UserSession A01;
    public final 1vn A02;

    public IgZeroDogfoodingEasyRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = 1vm.A01(userSession);
    }

    public final void onSessionWillEnd() {
        synchronized (this) {
            C262204Co r1 = this.A00;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            this.A00 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r10 == -1) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository r23, X.1RA r24, X.1RA r25, X.AnonymousClass4D7 r26) {
        /*
            r1 = r23
            r5 = 28
            r6 = r26
            boolean r0 = X.C66139MDr.A01(r5, r6)
            if (r0 == 0) goto L_0x023a
            r0 = r6
            X.MDr r0 = (X.C66139MDr) r0
            int r4 = r0.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x023a
            int r4 = r4 - r3
            r0.A00 = r4
        L_0x001a:
            java.lang.Object r5 = r0.A02
            X.1Hj r3 = X.1Hj.A02
            int r7 = r0.A00
            r6 = 3
            r2 = 2
            r4 = 1
            r12 = 0
            r14 = 0
            if (r7 == 0) goto L_0x004a
            if (r7 == r4) goto L_0x0197
            if (r7 == r2) goto L_0x0149
            if (r7 != r6) goto L_0x0241
            X.0eS.A00(r5)
        L_0x0030:
            X.1R9 r0 = X.AnonymousClass1R9.A03
            X.05G r3 = r0.A01
        L_0x0034:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.1RA r1 = (X.1RA) r1
            r0 = 1999(0x7cf, float:2.801E-42)
            X.1RA r0 = X.1RA.A00(r1, r0)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0034
        L_0x0047:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x004a:
            X.0eS.A00(r5)
            r8 = r24
            r10 = r25
            if (r24 == 0) goto L_0x0060
            int r7 = r8.A01
            int r5 = r10.A01
            if (r7 != r5) goto L_0x0060
            boolean r7 = r8.A0A
            boolean r5 = r10.A0A
            if (r7 != r5) goto L_0x0060
            goto L_0x0047
        L_0x0060:
            java.lang.Integer r9 = r10.A04
            X.0qQ.A0B(r9, r14)
            java.lang.String r11 = "ig_zero_dogfooding_device"
            X.0tX r5 = X.0xn.A01(r11)
            X.0xY r8 = r5.AR4()
            java.lang.String r7 = "dogfooding_mode"
            java.lang.String r5 = X.C70351O3d.A00(r9)
            r8.E5g(r7, r5)
            r8.commit()
            boolean r8 = r10.A0A
            X.0tX r5 = X.0xn.A01(r11)
            X.0xY r7 = r5.AR4()
            java.lang.String r5 = "manually_changed"
            r7.E5T(r5, r8)
            r7.commit()
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.1R9 r5 = X.AnonymousClass1R9.A03
            int r10 = r10.A00
            if (r10 == 0) goto L_0x0099
            r7 = -1
            r5 = 0
            if (r10 != r7) goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r9 != r8) goto L_0x00ff
            if (r5 != 0) goto L_0x0047
        L_0x009e:
            X.1R9 r5 = X.AnonymousClass1R9.A03
            X.05G r7 = r5.A01
        L_0x00a2:
            java.lang.Object r5 = r7.getValue()
            r11 = r5
            X.1RA r11 = (X.1RA) r11
            r17 = 0
            r16 = 1999(0x7cf, float:2.801E-42)
            r13 = r12
            r15 = r14
            r19 = r17
            r21 = r14
            r22 = r14
            r23 = r4
            r24 = r14
            r25 = r14
            X.1RA r10 = X.1RA.A02(r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25)
            boolean r5 = r7.AIY(r5, r10)
            if (r5 == 0) goto L_0x00a2
            if (r9 != r8) goto L_0x0103
            X.1vn r2 = r1.A02
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            X.1vR r16 = X.C41845B3m.A05()
            java.util.Map r18 = r7.getParamsCopy()
            java.util.Map r19 = r5.getParamsCopy()
            java.lang.Class<X.C6p> r20 = X.C43719C6p.class
            java.util.ArrayList r26 = X.AnonymousClass7TE.A1C()
            java.lang.String r17 = "IgZeroEasyDogfoodingStop"
            java.lang.String r25 = "xdt_zero_easy_dogfooding_stop"
            com.facebook.pando.PandoGraphQLRequest r15 = new com.facebook.pando.PandoGraphQLRequest
            r21 = r4
            r22 = r12
            r23 = r14
            r24 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.A01 = r1
            r0.A00 = r4
            java.lang.Object r5 = r2.A04(r15, r0)
            if (r5 != r3) goto L_0x019c
            return r3
        L_0x00ff:
            if (r5 != 0) goto L_0x009e
            goto L_0x0047
        L_0x0103:
            X.0K0 r8 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r7 = X.AnonymousClass7TF.A0b()
            java.lang.String r5 = "client_mutation_id"
            X.0Df r10 = X.C41845B3m.A03(r8, r7, r5)
            X.1vn r5 = r1.A02
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            java.lang.String r7 = "data"
            X.1vR r16 = X.C41847B3o.A04(r10, r9, r7)
            java.util.Map r18 = r9.getParamsCopy()
            java.util.Map r19 = r8.getParamsCopy()
            java.lang.Class<X.C6n> r20 = X.C43717C6n.class
            java.util.ArrayList r26 = X.AnonymousClass7TE.A1C()
            java.lang.String r17 = "IgZeroEasyDogfoodingStart"
            r23 = 64
            java.lang.String r25 = "xig_upsert_ig_easy_zero_dogfooding_account_mobile_ig_zero_dogfooding_account"
            com.facebook.pando.PandoGraphQLRequest r15 = new com.facebook.pando.PandoGraphQLRequest
            r21 = r4
            r22 = r12
            r24 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.A01 = r1
            r0.A00 = r2
            java.lang.Object r5 = r5.A04(r15, r0)
            if (r5 != r3) goto L_0x014e
            return r3
        L_0x0149:
            java.lang.Object r1 = r0.A01
            X.0eS.A00(r5)
        L_0x014e:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x018e
            X.3lr r8 = X.C41846B3n.A0R(r5)
            if (r8 == 0) goto L_0x018c
            java.lang.Class<X.C6m> r7 = X.C43716C6m.class
            java.lang.String r5 = "xig_upsert_ig_easy_zero_dogfooding_account_mobile_ig_zero_dogfooding_account(data:$data)"
            r2 = 2140885168(0x7f9b50b0, float:NaN)
            X.3lr r8 = r8.getOptionalTreeField(r14, r5, r7, r2)
            if (r8 == 0) goto L_0x018c
            java.lang.Class<X.QXB> r7 = X.QXB.class
            java.lang.String r5 = "mobile_ig_zero_dogfooding_account"
            r2 = -327627483(0xffffffffec78cd25, float:-1.2031295E27)
            X.3lr r5 = r8.getOptionalTreeField(r14, r5, r7, r2)
            if (r5 == 0) goto L_0x018c
            java.lang.String r2 = "strong_id__"
            java.lang.String r2 = r5.getOptionalStringField(r4, r2)
        L_0x017a:
            X.3Ih r5 = new X.3Ih
            r5.<init>(r2)
        L_0x017f:
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x01d0
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0246
            X.5sO r5 = X.JTU.A0R(r5)
            goto L_0x01d0
        L_0x018c:
            r2 = r12
            goto L_0x017a
        L_0x018e:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 != 0) goto L_0x017f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0197:
            java.lang.Object r1 = r0.A01
            X.0eS.A00(r5)
        L_0x019c:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0231
            X.3lr r7 = X.C41846B3n.A0R(r5)
            if (r7 == 0) goto L_0x022f
            java.lang.Class<X.C6o> r5 = X.C43718C6o.class
            java.lang.String r4 = "xdt_zero_easy_dogfooding_stop"
            r2 = -595405015(0xffffffffdc82d729, float:-2.94626545E17)
            X.3lr r4 = r7.getRequiredTreeField(r14, r4, r5, r2)
            if (r4 == 0) goto L_0x022f
            java.lang.String r2 = "success"
            boolean r2 = r4.getRequiredBooleanField(r14, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x01bf:
            X.3Ih r5 = new X.3Ih
            r5.<init>(r2)
        L_0x01c4:
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x01d0
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0250
            X.5sO r5 = X.JTU.A0R(r5)
        L_0x01d0:
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0224
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r2 = r5.A00
            if (r2 == 0) goto L_0x0221
            r13 = r12
        L_0x01db:
            r2 = 273884380(0x105324dc, float:4.1640808E-29)
            X.19S r5 = X.AnonymousClass1HX.A02(r2, r6)
            r4 = 22
            X.ImS r2 = new X.ImS
            r2.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r12, (int) r4)
            X.AnonymousClass7TE.A1Z(r2, r5)
            if (r13 == 0) goto L_0x0030
            X.1R9 r1 = X.AnonymousClass1R9.A03
            X.05G r4 = r1.A01
        L_0x01f2:
            java.lang.Object r2 = r4.getValue()
            r11 = r2
            X.1RA r11 = (X.1RA) r11
            r17 = 0
            r16 = 1999(0x7cf, float:2.801E-42)
            r15 = r14
            r19 = r17
            r21 = r14
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            X.1RA r1 = X.1RA.A02(r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25)
            boolean r1 = r4.AIY(r2, r1)
            if (r1 == 0) goto L_0x01f2
            r1 = 3000(0xbb8, double:1.482E-320)
            r0.A01 = r12
            r0.A00 = r6
            java.lang.Object r0 = X.C241603Pv.A01(r0, r1)
            if (r0 != r3) goto L_0x0030
            return r3
        L_0x0221:
            java.lang.String r13 = "Server returned null"
            goto L_0x01db
        L_0x0224:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 == 0) goto L_0x024b
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r13 = r5.A00
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x01db
        L_0x022f:
            r2 = r12
            goto L_0x01bf
        L_0x0231:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 != 0) goto L_0x01c4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x023a:
            X.MDr r0 = new X.MDr
            r0.<init>(r1, r6, r5)
            goto L_0x001a
        L_0x0241:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0246:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x024b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0250:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository.A00(com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository, X.1RA, X.1RA, X.4D7):java.lang.Object");
    }
}
