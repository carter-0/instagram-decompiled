package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Unj  reason: case insensitive filesystem */
public final class C16056Unj extends C14773U8j {
    public final LeadGenEntryPoint A00 = LeadGenEntryPoint.PROMOTE;
    public final WYX A01;
    public final UserSession A02;
    public final Long A03;
    public final String A04;
    public final boolean A05;
    public final PromoteData A06;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        r4 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        if (r4 == null) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16056Unj(X.C319836rJ r33, X.WYX r34, com.instagram.business.promote.model.PromoteData r35) {
        /*
            r32 = this;
            r1 = 1
            r0 = r32
            r0.<init>()
            r5 = r35
            r0.A06 = r5
            r2 = r34
            r0.A01 = r2
            com.instagram.common.session.UserSession r2 = r5.A0y
            X.0qQ.A06(r2)
            r0.A02 = r2
            java.lang.String r2 = r5.A1R
            r0.A04 = r2
            com.instagram.api.schemas.LeadGenEntryPoint r2 = com.instagram.api.schemas.LeadGenEntryPoint.PROMOTE
            r0.A00 = r2
            java.lang.String r2 = "is_lead_form_creation_flow"
            r3 = r33
            boolean r4 = X.C13991Tnr.A1X(r3, r2)
            r0.A05 = r4
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r0.A02
            java.lang.String r2 = X.C13991Tnr.A0h(r2)
            r12 = 0
            java.lang.Long r2 = X.C51972G9s.A0j(r2)
            r0.A03 = r2
            r6 = 10
            if (r4 == 0) goto L_0x00ba
            java.util.List r4 = r5.A1s
            X.0qQ.A06(r4)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r9 = r4.iterator()
        L_0x0047:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x011b
            java.lang.Object r8 = r9.next()
            X.GSY r8 = (X.GSY) r8
            X.0qQ.A0A(r8)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            java.lang.String r14 = r8.A03
            java.lang.Object r4 = r8.A01
            com.instagram.leadgen.core.api.LeadGenInfoFieldTypes r4 = (com.instagram.leadgen.core.api.LeadGenInfoFieldTypes) r4
            int r7 = r4.ordinal()
            if (r7 == r1) goto L_0x00b7
            if (r7 == r6) goto L_0x00b4
            r4 = 14
            if (r7 == r4) goto L_0x00b1
            r4 = 6
            if (r7 == r4) goto L_0x00ae
            r4 = 20
            if (r7 == r4) goto L_0x00ab
            X.Uxp r11 = X.C16595Uxp.A0X
        L_0x0075:
            java.lang.Object r4 = r8.A00
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x007d
            X.0sn r4 = X.0sn.A00
        L_0x007d:
            java.lang.String r15 = ""
            X.0sm r26 = X.0Yt.A0E()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r10 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r13 = r12
            r16 = r15
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r4
            r23 = r12
            r24 = r12
            r25 = r12
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.add(r10)
            goto L_0x0047
        L_0x00ab:
            X.Uxp r11 = X.C16595Uxp.A0a
            goto L_0x0075
        L_0x00ae:
            X.Uxp r11 = X.C16595Uxp.A0A
            goto L_0x0075
        L_0x00b1:
            X.Uxp r11 = X.C16595Uxp.A0P
            goto L_0x0075
        L_0x00b4:
            X.Uxp r11 = X.C16595Uxp.A0O
            goto L_0x0075
        L_0x00b7:
            X.Uxp r11 = X.C16595Uxp.A06
            goto L_0x0075
        L_0x00ba:
            com.instagram.leadgen.core.api.LeadForm r2 = r5.A16
            if (r2 == 0) goto L_0x00c2
            java.util.List r4 = r2.A05
            if (r4 != 0) goto L_0x00c4
        L_0x00c2:
            X.0sn r4 = X.0sn.A00
        L_0x00c4:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r7 = r4.iterator()
        L_0x00cc:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x011b
            java.lang.Object r6 = r7.next()
            com.instagram.leadgen.core.api.LeadGenInfoFieldData r6 = (com.instagram.leadgen.core.api.LeadGenInfoFieldData) r6
            r5 = 0
            X.0qQ.A0B(r6, r5)
            java.lang.String r14 = r6.A00
            boolean r4 = r6.A02
            if (r4 == 0) goto L_0x0118
            X.Uxp r11 = X.C16595Uxp.A06
        L_0x00e4:
            java.util.List r4 = r6.A01
            if (r4 != 0) goto L_0x00ea
            X.0sn r4 = X.0sn.A00
        L_0x00ea:
            java.lang.String r15 = ""
            X.0sm r26 = X.0Yt.A0E()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r10 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r13 = r12
            r16 = r15
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r4
            r23 = r12
            r24 = r12
            r25 = r12
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.add(r10)
            goto L_0x00cc
        L_0x0118:
            X.Uxp r11 = X.C16595Uxp.A07
            goto L_0x00e4
        L_0x011b:
            boolean r4 = r0.A05
            com.instagram.business.promote.model.PromoteData r5 = r0.A06
            if (r4 == 0) goto L_0x013c
            java.lang.String r7 = r5.A1O
            com.instagram.common.typedurl.ImageUrl r4 = r5.A0z
        L_0x0125:
            if (r4 != 0) goto L_0x0129
        L_0x0127:
            com.instagram.common.typedurl.ImageUrl r4 = r5.A11
        L_0x0129:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r2.iterator()
        L_0x0132:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x0147
            X.C13991Tnr.A1O(r8, r6)
            goto L_0x0132
        L_0x013c:
            com.instagram.leadgen.core.api.LeadForm r4 = r5.A16
            if (r4 == 0) goto L_0x0145
            java.lang.String r7 = r4.A04
            com.instagram.common.typedurl.ImageUrl r4 = r4.A00
            goto L_0x0125
        L_0x0145:
            r7 = r12
            goto L_0x0127
        L_0x0147:
            X.05G r5 = r0.A0C
            r5.Epw(r8)
            X.05G r9 = r0.A0D
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x0157:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0161
            X.C13991Tnr.A1N(r6, r5)
            goto L_0x0157
        L_0x0161:
            r9.Epw(r6)
            com.instagram.common.session.UserSession r2 = r0.A02
            com.instagram.user.model.User r3 = r3.A01(r2)
            X.05G r2 = r0.A0G
            java.lang.String r18 = r3.getUsername()
            com.instagram.common.typedurl.ImageUrl r15 = r3.Bh3()
            int r21 = r8.size()
            X.4Yx r14 = X.W33.A01(r7)
            r20 = 0
            X.0sn r19 = X.0sn.A00
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.UKg r13 = new X.UKg
            r22 = r20
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.Epw(r13)
            X.05G r3 = r0.A0E
            r0 = 2131964787(0x7f133373, float:1.9566365E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.N4R r0 = new X.N4R
            r0.<init>((X.C266444Yx) r12, (java.lang.Integer) r2, (int) r1)
            r3.Epw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16056Unj.<init>(X.6rJ, X.WYX, com.instagram.business.promote.model.PromoteData):void");
    }
}
