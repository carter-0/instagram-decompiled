package X;

import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CwD  reason: case insensitive filesystem */
public final class C45433CwD {
    public C61059Jvx A00;
    public Cu5 A01;
    public C17695VcQ A02;
    public C45385CvR A03;
    public C45351Cut A04;
    public C45352Cuu A05;
    public C45884D9d A06;
    public LeadGenDisqualifyingScreenData A07;
    public LeadGenPrivacyPolicy A08;
    public String A09;
    public List A0A;
    public List A0B;
    public Map A0C = AnonymousClass7TE.A1H();
    public Set A0D;
    public boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r2 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C45433CwD(X.CHI r23) {
        /*
            r22 = this;
            r7 = 1
            r0 = r23
            X.0qQ.A0B(r0, r7)
            r1 = r22
            r1.<init>()
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            r1.A0C = r2
            java.lang.String r2 = r0.A08
            if (r2 == 0) goto L_0x0017
            r1.A09 = r2
        L_0x0017:
            X.Cw8 r4 = r0.A00
            if (r4 == 0) goto L_0x0306
            X.CvL r3 = r4.A00
            if (r3 == 0) goto L_0x0026
            X.CvR r2 = new X.CvR
            r2.<init>(r3)
            r1.A03 = r2
        L_0x0026:
            X.Cvq r8 = r4.A01
            if (r8 == 0) goto L_0x01a2
            X.Cty r3 = r0.A01
            X.Ctr r2 = r8.A00
            r6 = 0
            if (r2 == 0) goto L_0x005d
            java.lang.String r10 = r2.A01
            X.CsZ r2 = r2.A00
            if (r2 == 0) goto L_0x00dd
            X.CsY r2 = r2.A00
            if (r2 == 0) goto L_0x00dd
            java.lang.String r9 = r2.A00
        L_0x003d:
            if (r10 == 0) goto L_0x005d
            if (r9 == 0) goto L_0x005d
            if (r3 == 0) goto L_0x00da
            java.lang.String r5 = r3.A01
            X.Csf r2 = r3.A00
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x0052
            com.instagram.common.typedurl.SimpleImageUrl r6 = new com.instagram.common.typedurl.SimpleImageUrl
            r6.<init>(r2)
        L_0x0052:
            com.instagram.common.typedurl.SimpleImageUrl r3 = new com.instagram.common.typedurl.SimpleImageUrl
            r3.<init>(r9)
            X.UO9 r2 = new X.UO9
            r2.<init>(r6, r3, r5, r10)
            r6 = r2
        L_0x005d:
            X.Cuo r2 = r8.A02
            r10 = 0
            if (r2 == 0) goto L_0x007b
            java.lang.String r5 = r2.A02
            java.lang.String r3 = r2.A01
            if (r5 == 0) goto L_0x007b
            if (r3 == 0) goto L_0x007b
            X.Csa r2 = r2.A00
            if (r2 == 0) goto L_0x0072
            java.util.List r2 = r2.A00
            if (r2 != 0) goto L_0x0076
        L_0x0072:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x0076:
            X.UO8 r10 = new X.UO8
            r10.<init>(r5, r3, r2)
        L_0x007b:
            if (r6 == 0) goto L_0x01a2
            if (r10 == 0) goto L_0x01a2
            java.util.List r5 = r8.A05
            X.0qQ.A07(r5)
            int r3 = r5.size()
            r12 = 0
            r2 = 0
            if (r3 <= 0) goto L_0x008d
            r2 = 1
        L_0x008d:
            r17 = 0
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r5.get(r12)
            X.Cun r2 = (X.C45345Cun) r2
            java.lang.String r9 = r2.A02
            java.lang.String r5 = r2.A00
            java.lang.String r3 = r2.A01
            if (r9 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00aa
            if (r3 == 0) goto L_0x00aa
            X.UO7 r17 = new X.UO7
            r2 = r17
            r2.<init>(r9, r5, r3)
        L_0x00aa:
            X.Ctt r2 = r8.A01
            r11 = 0
            if (r2 == 0) goto L_0x00eb
            java.lang.String r13 = r2.A00
            if (r13 == 0) goto L_0x00eb
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.List r2 = r2.A01
            java.util.Iterator r14 = r2.iterator()
        L_0x00bd:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r14.next()
            X.Cts r2 = (X.C45289Cts) r2
            java.lang.String r5 = r2.A01
            java.lang.String r3 = r2.A00
            if (r5 == 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00bd
            X.ULg r2 = new X.ULg
            r2.<init>(r5, r3, r7)
            r9.add(r2)
            goto L_0x00bd
        L_0x00da:
            r5 = r6
            goto L_0x0052
        L_0x00dd:
            r9 = r6
            goto L_0x003d
        L_0x00e0:
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x00eb
            X.UO6 r11 = new X.UO6
            r11.<init>(r9, r12, r13)
        L_0x00eb:
            X.Ctu r2 = r8.A03
            r13 = 0
            if (r2 == 0) goto L_0x013e
            java.lang.String r14 = r2.A00
            if (r14 == 0) goto L_0x013e
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.List r2 = r2.A01
            java.util.Iterator r16 = r2.iterator()
        L_0x00fe:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0133
            java.lang.Object r3 = r16.next()
            X.CvM r3 = (X.C45380CvM) r3
            java.lang.String r15 = r3.A02
            java.lang.String r9 = r3.A01
            X.Csc r2 = r3.A00
            if (r2 == 0) goto L_0x0131
            X.Csb r2 = r2.A00
            if (r2 == 0) goto L_0x0131
            java.lang.String r2 = r2.A00
        L_0x0118:
            if (r15 == 0) goto L_0x00fe
            if (r9 == 0) goto L_0x00fe
            if (r2 == 0) goto L_0x00fe
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r2)
            java.util.List r3 = r3.A03
            X.0qQ.A07(r3)
            X.GSY r2 = new X.GSY
            r2.<init>((com.instagram.common.typedurl.ImageUrl) r5, (java.lang.String) r15, (java.lang.String) r9, (java.util.List) r3)
            r12.add(r2)
            goto L_0x00fe
        L_0x0131:
            r2 = r13
            goto L_0x0118
        L_0x0133:
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x013e
            X.UO6 r13 = new X.UO6
            r13.<init>(r12, r7, r14)
        L_0x013e:
            X.Ctv r2 = r8.A04
            r9 = 0
            if (r2 == 0) goto L_0x018f
            java.lang.String r12 = r2.A00
            if (r12 == 0) goto L_0x018f
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.List r2 = r2.A01
            java.util.Iterator r16 = r2.iterator()
        L_0x0151:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0183
            java.lang.Object r2 = r16.next()
            X.Cup r2 = (X.C45347Cup) r2
            java.lang.String r15 = r2.A02
            java.lang.String r14 = r2.A01
            X.Cse r2 = r2.A00
            if (r2 == 0) goto L_0x0181
            X.Csd r2 = r2.A00
            if (r2 == 0) goto L_0x0181
            java.lang.String r2 = r2.A00
        L_0x016b:
            if (r15 == 0) goto L_0x0151
            if (r14 == 0) goto L_0x0151
            if (r2 == 0) goto L_0x0151
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r2)
            r3 = 25
            X.JV7 r2 = new X.JV7
            r2.<init>((java.lang.String) r15, (java.lang.String) r14, (com.instagram.common.typedurl.ImageUrl) r5, (int) r3)
            r8.add(r2)
            goto L_0x0151
        L_0x0181:
            r2 = r9
            goto L_0x016b
        L_0x0183:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x018f
            r2 = 2
            X.UO6 r9 = new X.UO6
            r9.<init>(r8, r2, r12)
        L_0x018f:
            X.Jvx r15 = new X.Jvx
            r21 = r10
            r18 = r9
            r19 = r6
            r20 = r17
            r16 = r11
            r17 = r13
            r15.<init>((X.UO6) r16, (X.UO6) r17, (X.UO6) r18, (X.UO9) r19, (X.UO7) r20, (X.UO8) r21)
            r1.A00 = r15
        L_0x01a2:
            X.Cu0 r3 = r4.A03
            if (r3 == 0) goto L_0x0205
            java.util.List r2 = r3.A00
            X.0qQ.A07(r2)
            java.util.Set r2 = X.00k.A0k(r2)
            r1.A0D = r2
            java.util.List r2 = r3.A01
            X.0qQ.A07(r2)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r2.iterator()
        L_0x01be:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0203
            java.lang.Object r5 = r10.next()
            X.Cvf r5 = (X.C45399Cvf) r5
            java.lang.String r8 = r5.A01
            X.KiT r2 = r5.A00
            if (r2 == 0) goto L_0x0200
            int r3 = r2.ordinal()
            r2 = 3
            if (r3 == r2) goto L_0x01fd
            r2 = 4
            if (r3 == r2) goto L_0x01fa
            if (r3 == r7) goto L_0x01f7
            r2 = 2
            if (r3 != r2) goto L_0x0200
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
        L_0x01e1:
            if (r8 == 0) goto L_0x01be
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            if (r6 == r2) goto L_0x01be
            java.util.List r5 = r5.A04
            X.0qQ.A07(r5)
            r3 = 19
            X.JwH r2 = new X.JwH
            r2.<init>((java.lang.Integer) r6, (java.lang.String) r8, (java.util.List) r5, (int) r3)
            r9.add(r2)
            goto L_0x01be
        L_0x01f7:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x01e1
        L_0x01fa:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x01e1
        L_0x01fd:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x01e1
        L_0x0200:
            java.lang.Integer r6 = X.AnonymousClass05K.A0u
            goto L_0x01e1
        L_0x0203:
            r1.A0A = r9
        L_0x0205:
            X.Cuu r2 = new X.Cuu
            r2.<init>(r0)
            r1.A05 = r2
            X.CvO r3 = r4.A02
            if (r3 == 0) goto L_0x0217
            X.Cut r2 = new X.Cut
            r2.<init>(r3)
            r1.A04 = r2
        L_0x0217:
            X.Cvg r5 = r4.A04
            if (r5 == 0) goto L_0x0224
            java.lang.String r3 = r0.A07
            X.D9d r2 = new X.D9d
            r2.<init>(r5, r3)
            r1.A06 = r2
        L_0x0224:
            X.Cw8 r2 = r0.A00
            if (r2 == 0) goto L_0x0283
            java.util.List r3 = r2.A07
            if (r3 == 0) goto L_0x0283
            boolean r2 = r3.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0283
            java.util.Iterator r8 = r3.iterator()
        L_0x0238:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0283
            java.lang.Object r3 = r8.next()
            X.Cw9 r3 = (X.C45429Cw9) r3
            java.lang.String r5 = r3.A0A
            if (r5 == 0) goto L_0x0238
            java.lang.String r2 = "LeadGenDisqualifyEndScreen"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0260
            java.lang.String r7 = r3.A03
            java.lang.String r6 = r3.A02
            java.lang.String r5 = r3.A04
            java.lang.String r3 = r3.A05
            com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData r2 = new com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData
            r2.<init>(r7, r6, r5, r3)
            r1.A07 = r2
            goto L_0x0238
        L_0x0260:
            java.lang.String r2 = "LeadGenThankYouPage"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0238
            java.lang.String r15 = r0.A07
            java.lang.String r10 = r3.A00
            java.lang.String r11 = r3.A01
            java.lang.String r12 = r3.A06
            java.lang.String r14 = r3.A09
            java.lang.String r13 = r3.A08
            java.lang.String r3 = r3.A07
            if (r3 == 0) goto L_0x0238
            java.util.Map r2 = r1.A0C
            X.D9d r9 = new X.D9d
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2.put(r3, r9)
            goto L_0x0238
        L_0x0283:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r1.A0B = r2
            java.util.List r2 = r4.A09
            if (r2 == 0) goto L_0x02b4
            java.util.Iterator r7 = r2.iterator()
        L_0x0291:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x02b4
            java.lang.Object r2 = r7.next()
            X.Ctx r2 = (X.C45294Ctx) r2
            java.lang.String r6 = r2.A00
            if (r6 == 0) goto L_0x0291
            java.util.List r5 = r1.A0B
            if (r5 == 0) goto L_0x0291
            java.util.List r4 = r2.A01
            X.0qQ.A07(r4)
            r3 = 4
            X.JwE r2 = new X.JwE
            r2.<init>((java.util.List) r4, (int) r3, (java.lang.String) r6)
            r5.add(r2)
            goto L_0x0291
        L_0x02b4:
            java.lang.String r4 = r0.A09
            java.lang.String r5 = r0.A0A
            java.lang.String r6 = r0.A0E
            X.Cw8 r3 = r0.A00
            r8 = 0
            if (r3 == 0) goto L_0x0303
            X.CvO r2 = r3.A02
            if (r2 == 0) goto L_0x0303
            java.lang.String r7 = r2.A00
        L_0x02c5:
            if (r3 == 0) goto L_0x02c9
            java.lang.String r8 = r3.A05
        L_0x02c9:
            com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy r3 = new com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A08 = r3
            X.Cty r3 = r0.A01
            if (r3 == 0) goto L_0x02db
            X.Cu5 r2 = new X.Cu5
            r2.<init>(r3)
            r1.A01 = r2
        L_0x02db:
            X.VcO r3 = r0.A03
            if (r3 == 0) goto L_0x02e6
            X.VcQ r2 = new X.VcQ
            r2.<init>(r3)
            r1.A02 = r2
        L_0x02e6:
            X.Csg r2 = r0.A02
            if (r2 == 0) goto L_0x0306
            java.util.List r2 = r2.A00
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "review_screen"
            boolean r0 = r2.contains(r0)
            r1.A0E = r0
            java.lang.String r0 = "inline_context"
            r2.contains(r0)
            return
        L_0x0303:
            java.lang.String r7 = r0.A0D
            goto L_0x02c5
        L_0x0306:
            java.lang.String r1 = "No lead gen data for form id: "
            java.lang.String r0 = r0.A08
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "LeadAdsDataManager error message"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45433CwD.<init>(X.CHI):void");
    }
}
