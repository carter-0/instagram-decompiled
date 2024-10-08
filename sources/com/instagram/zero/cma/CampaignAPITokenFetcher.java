package com.instagram.zero.cma;

import X.00k;
import X.0KC;
import X.0qQ;
import X.0sn;
import X.0xa;
import X.1Al;
import X.1An;
import X.1R4;
import X.1R6;
import X.1R7;
import X.1vm;
import X.1vn;
import X.AnonymousClass000;
import X.AnonymousClass1R2;
import X.AnonymousClass7TE;
import X.C15137URa;
import X.C17978VjG;
import X.C250663lr;
import X.C273654mx;
import X.C41845B3m;
import X.C51969G9p;
import X.C58686Ivv;
import X.C70634OEf;
import X.QX7;
import X.QX8;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class CampaignAPITokenFetcher {
    public final 0xa A00;
    public final C70634OEf A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final UserSession A03;
    public final 1vn A04;

    public CampaignAPITokenFetcher(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = 1vm.A01(userSession);
        this.A00 = C51969G9p.A0n(1Al.A01(userSession), 1An.A3c, this);
        this.A01 = (C70634OEf) userSession.A01(C70634OEf.class, new C58686Ivv(userSession, 23));
    }

    private final 1R7 A00(QX8 qx8) {
        QX8 qx82 = qx8;
        String valueOf = String.valueOf(qx82.A0C(C273654mx.A00(995)));
        String A07 = qx82.A07(C273654mx.A00(247));
        ImmutableList requiredCompactedTreeListField = qx82.getRequiredCompactedTreeListField(6, C273654mx.A00(946), QX7.class, -1774761223);
        0qQ.A07(requiredCompactedTreeListField);
        List A0a = 00k.A0a(requiredCompactedTreeListField);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0a.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            try {
                A1C.add(new 1R4(String.valueOf(A0V.A07("matcher")), String.valueOf(A0V.A08(C273654mx.A00(938)))));
            } catch (AnonymousClass1R2 e) {
                0KC.A0G("CampaignAPITokenFetcher", C273654mx.A00(1289), e);
            }
        }
        ArrayList A0U = 00k.A0U(A1C);
        0sn r13 = 0sn.A00;
        ImmutableList requiredCompactedStringListField = qx82.getRequiredCompactedStringListField(3, "features");
        0qQ.A07(requiredCompactedStringListField);
        Set A0k = 00k.A0k(requiredCompactedStringListField);
        int A002 = qx82.A00("ttl");
        long currentTimeMillis = System.currentTimeMillis();
        int coercedIntField = qx82.getCoercedIntField(1, AnonymousClass000.A00(2774));
        ImmutableList requiredCompactedStringListField2 = qx82.getRequiredCompactedStringListField(7, C273654mx.A00(681));
        0qQ.A07(requiredCompactedStringListField2);
        Set A0k2 = 00k.A0k(requiredCompactedStringListField2);
        int coercedIntField2 = qx82.getCoercedIntField(8, C273654mx.A00(1020));
        ImmutableList requiredCompactedTreeListField2 = qx82.getRequiredCompactedTreeListField(9, C273654mx.A00(610), C15137URa.class, 567577443);
        0qQ.A07(requiredCompactedTreeListField2);
        List A0a2 = 00k.A0a(requiredCompactedTreeListField2);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = A0a2.iterator();
        while (it2.hasNext()) {
            C250663lr A0V2 = C41845B3m.A0V(it2);
            A1C2.add(new C17978VjG(String.valueOf(A0V2.A08("key")), String.valueOf(A0V2.A07("url")), A0V2.A00("cooldown")));
        }
        return new 1R7(new 1R6(A1C2), valueOf, A07, (String) null, (String) null, qx82.getOptionalStringField(10, "eligibility_hash"), A0U, r13, A0k, A0k2, A002, coercedIntField, coercedIntField2, currentTimeMillis);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0145, code lost:
        if (r3 != null) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.zero.cma.CampaignAPITokenFetcher r22, X.AnonymousClass4D7 r23) {
        /*
            r0 = r22
            r5 = 27
            r6 = r23
            boolean r1 = X.C66139MDr.A01(r5, r6)
            if (r1 == 0) goto L_0x01e4
            r1 = r6
            X.MDr r1 = (X.C66139MDr) r1
            int r4 = r1.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x01e4
            int r4 = r4 - r3
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r6 = r1.A02
            X.1Hj r3 = X.1Hj.A02
            int r4 = r1.A00
            r2 = 1
            if (r4 == 0) goto L_0x015f
            if (r4 != r2) goto L_0x01f5
            java.lang.Object r0 = r1.A01
            com.instagram.zero.cma.CampaignAPITokenFetcher r0 = (com.instagram.zero.cma.CampaignAPITokenFetcher) r0
            X.0eS.A00(r6)
        L_0x002c:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r1 = r6 instanceof X.C239793Ih
            r5 = 0
            if (r1 == 0) goto L_0x0156
            X.3lr r6 = X.C41846B3n.A0R(r6)
            if (r6 == 0) goto L_0x0153
            java.lang.Class<X.QX9> r4 = X.QX9.class
            java.lang.String r3 = "zero_token(basic_token_hash:$basic_token_hash,fetch_reason:$fetch_reason,fetch_type:$fetch_type,normal_token_hash:$normal_token_hash)"
            r1 = -1401161270(0xffffffffac7bf9ca, float:-3.5807906E-12)
            X.3lr r4 = r6.A03(r4, r3, r1)
            if (r4 == 0) goto L_0x0153
            java.lang.Class<X.QX6> r3 = X.QX6.class
            r1 = -1340464140(0xffffffffb01a23f4, float:-5.6075966E-10)
            X.3lr r1 = r4.A01(r3, r1)
        L_0x004f:
            X.3Ih r6 = new X.3Ih
            r6.<init>(r1)
        L_0x0054:
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0060
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 == 0) goto L_0x01f0
            X.5sO r6 = X.JTU.A0R(r6)
        L_0x0060:
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x013b
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r5 = r6.A00
            if (r5 == 0) goto L_0x0138
            X.3lr r5 = (X.C250663lr) r5
        L_0x006c:
            X.1R9 r1 = X.AnonymousClass1R9.A03
            r11 = 0
            r9 = 0
            X.05G r3 = r1.A01
        L_0x0072:
            java.lang.Object r6 = r3.getValue()
            r4 = r6
            X.1RA r4 = (X.1RA) r4
            r14 = 0
            r1 = 1983(0x7bf, float:2.779E-42)
            X.1RA r1 = X.1RA.A00(r4, r1)
            boolean r1 = r3.AIY(r6, r1)
            if (r1 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0135
            java.lang.Class<X.QX4> r6 = X.QX4.class
            java.lang.String r4 = "basic_token"
            r1 = 1941764863(0x73bcfaff, float:2.9945148E31)
            X.3lr r1 = r5.getOptionalTreeField(r2, r4, r6, r1)
            if (r1 == 0) goto L_0x0135
            java.lang.Class<X.QX8> r8 = X.QX8.class
            r7 = 1630626170(0x6131617a, float:2.045061E20)
            X.3lr r6 = r1.reinterpretRequired(r11, r8, r7)
            X.QX8 r6 = (X.QX8) r6
            if (r6 == 0) goto L_0x0135
            java.lang.Class<X.QX5> r4 = X.QX5.class
            r1 = 843(0x34b, float:1.181E-42)
            java.lang.String r2 = X.C273654mx.A00(r1)
            r1 = 970638459(0x39dac47b, float:4.172659E-4)
            X.3lr r1 = r5.getOptionalTreeField(r11, r2, r4, r1)
            if (r1 == 0) goto L_0x0135
            X.3lr r1 = r1.reinterpretRequired(r11, r8, r7)
            X.QX8 r1 = (X.QX8) r1
            if (r1 == 0) goto L_0x0135
            X.1R7 r6 = r0.A00(r6)
            X.1R7 r5 = r0.A00(r1)
            int r12 = r6.A00
        L_0x00c6:
            java.lang.Object r2 = r3.getValue()
            r8 = r2
            X.1RA r8 = (X.1RA) r8
            r13 = 1919(0x77f, float:2.689E-42)
            r10 = r9
            r16 = r14
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            X.1RA r1 = X.1RA.A02(r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22)
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x00c6
            java.util.HashMap r1 = r0.A02
            X.NiS r8 = X.C69266NiS.BASIC
            r1.put(r8, r6)
            X.NiS r7 = X.C69266NiS.NORMAL
            r1.put(r7, r5)
            X.OEf r1 = r0.A01
            X.05G r4 = r1.A00
        L_0x00f6:
            java.lang.Object r2 = r4.getValue()
            X.Nii r1 = X.C69282Nii.FETCHED
            boolean r1 = r4.AIY(r2, r1)
            if (r1 == 0) goto L_0x00f6
            X.0xa r0 = r0.A00
            X.0xY r3 = r0.AR4()
            org.json.JSONObject r0 = X.C271524iz.A01(r6)
            java.lang.String r2 = X.DbT.A10(r0)
            org.json.JSONObject r0 = X.C271524iz.A01(r5)
            java.lang.String r1 = X.DbT.A10(r0)
            java.lang.String r0 = r8.toString()
            r3.E5g(r0, r2)
            java.lang.String r0 = r7.toString()
            r3.E5g(r0, r1)
            r3.apply()
        L_0x0129:
            java.lang.Object r1 = r4.getValue()
            X.Nii r0 = X.C69282Nii.IDLE
            boolean r0 = r4.AIY(r1, r0)
            if (r0 == 0) goto L_0x0129
        L_0x0135:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0138:
            java.lang.String r3 = "Server returned null"
            goto L_0x0147
        L_0x013b:
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 == 0) goto L_0x01eb
            X.5sO r6 = (X.C297815sO) r6
            java.lang.Object r3 = r6.A00
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x006c
        L_0x0147:
            java.lang.String r1 = "CampaignAPITokenFetcher"
            java.lang.String r0 = "GraphQL done error="
            java.lang.String r0 = X.002.A0R(r0, r3)
            X.0KC.A0C(r1, r0)
            goto L_0x0135
        L_0x0153:
            r1 = r5
            goto L_0x004f
        L_0x0156:
            boolean r1 = r6 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0054
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x015f:
            X.0eS.A00(r6)
            X.OEf r4 = r0.A01
            X.05G r6 = r4.A00
        L_0x0166:
            java.lang.Object r5 = r6.getValue()
            X.Nii r4 = X.C69282Nii.IN_PROGRESS
            boolean r4 = r6.AIY(r5, r4)
            if (r4 == 0) goto L_0x0166
            X.1R9 r4 = X.AnonymousClass1R9.A03
            r9 = 0
            r11 = 0
            X.05G r6 = r4.A01
        L_0x0178:
            java.lang.Object r5 = r6.getValue()
            r8 = r5
            X.1RA r8 = (X.1RA) r8
            r14 = 0
            r13 = 1983(0x7bf, float:2.779E-42)
            r10 = r9
            r12 = r11
            r16 = r14
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r2
            r22 = r11
            X.1RA r4 = X.1RA.A02(r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22)
            boolean r4 = r6.AIY(r5, r4)
            if (r4 == 0) goto L_0x0178
            X.1vn r5 = r0.A04
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r6 = "DUAL_TOKEN"
            java.lang.String r4 = "fetch_type"
            r8.A04(r4, r6)
            java.lang.String r4 = "fetch_reason"
            r8.A04(r4, r6)
            java.lang.String r6 = ""
            java.lang.String r4 = "normal_token_hash"
            r8.A04(r4, r6)
            java.lang.String r4 = "basic_token_hash"
            X.1vR r13 = X.DbU.A0J(r8, r4, r6)
            java.util.Map r15 = r8.getParamsCopy()
            java.util.Map r16 = r7.getParamsCopy()
            java.lang.Class<X.QXA> r17 = X.QXA.class
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.lang.String r14 = "ZeroCampaignAPI"
            java.lang.String r22 = "zero_token"
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r19 = r9
            r21 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A01 = r0
            r1.A00 = r2
            java.lang.Object r6 = r5.A04(r12, r1)
            if (r6 != r3) goto L_0x002c
            return r3
        L_0x01e4:
            X.MDr r1 = new X.MDr
            r1.<init>(r0, r6, r5)
            goto L_0x001a
        L_0x01eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.cma.CampaignAPITokenFetcher.A01(com.instagram.zero.cma.CampaignAPITokenFetcher, X.4D7):java.lang.Object");
    }
}
