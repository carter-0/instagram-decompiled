package com.instagram.appreciation.giftfeed.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.10b;
import X.AnonymousClass0Ud;
import X.C308436Ug;
import X.C59678JTj;
import X.C59702JUj;
import X.C59775JXt;
import X.C61032JvW;
import X.LMC;
import X.MQ0;
import com.instagram.common.session.UserSession;

public final class AppreciationGiftFeedRepository {
    public long A00 = -1;
    public final C59775JXt A01;
    public final AppreciationGiftFeedDataSource A02;
    public final LMC A03;
    public final UserSession A04;
    public final String A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public /* synthetic */ AppreciationGiftFeedRepository(UserSession userSession, String str) {
        AppreciationGiftFeedDataSource appreciationGiftFeedDataSource = new AppreciationGiftFeedDataSource(userSession);
        C59775JXt jXt = new C59775JXt(userSession);
        LMC lmc = new LMC(userSession, C308436Ug.A00);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        this.A04 = userSession;
        this.A05 = str;
        this.A02 = appreciationGiftFeedDataSource;
        this.A01 = jXt;
        this.A03 = lmc;
        02z A012 = 106.A01(C59702JUj.A00);
        this.A06 = A012;
        this.A07 = 10b.A03(A012);
    }

    public static final C61032JvW A00(AppreciationGiftFeedRepository appreciationGiftFeedRepository) {
        MQ0 mq0 = (MQ0) appreciationGiftFeedRepository.A06.getValue();
        if (C59678JTj.A03(mq0)) {
            return (C61032JvW) ((C59678JTj) mq0).A01;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012f, code lost:
        if (r16 == false) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Long r26, java.lang.String r27, X.AnonymousClass4D7 r28, boolean r29) {
        /*
            r25 = this;
            r9 = r26
            r7 = r27
            r3 = 19
            r4 = r28
            boolean r0 = X.C66146MDy.A02(r3, r4)
            r10 = r25
            if (r0 == 0) goto L_0x00ed
            r8 = r4
            X.MDy r8 = (X.C66146MDy) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ed
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001e:
            java.lang.Object r3 = r8.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x007b
            if (r0 != r6) goto L_0x015d
            java.lang.Object r7 = r8.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r8.A01
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r1 = (com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository) r1
            X.0eS.A00(r3)
        L_0x0034:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0162
            X.05G r12 = r1.A06
            X.LMC r2 = r1.A03
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r10 = r3.A00
            X.Ju0 r10 = (X.C60942Ju0) r10
            X.JXt r0 = r1.A01
            r8 = 0
            X.0qQ.A0B(r7, r8)
            X.0xa r11 = r0.A00
            java.lang.String r5 = "gifts_feed_non_recorded_gifter_disclaimer"
            r4 = 95
            java.lang.String r0 = X.002.A0T(r5, r7, r4)
            boolean r0 = r11.getBoolean(r0, r8)
            r16 = r0 ^ 1
            X.0qQ.A0B(r10, r8)
            java.util.List r0 = r10.A03
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0067:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r1.next()
            X.Jtq r0 = (X.C60932Jtq) r0
            X.JuJ r0 = X.LMC.A00(r0, r2)
            r3.add(r0)
            goto L_0x0067
        L_0x007b:
            X.0eS.A00(r3)
            long r0 = X.JTS.A06(r9)
            r10.A00 = r0
            X.JvW r1 = A00(r10)
            X.05G r11 = r10.A06
            if (r29 == 0) goto L_0x00ea
            if (r1 == 0) goto L_0x00ea
            X.0sn r12 = X.0sn.A00
            java.lang.Object r4 = r1.A02
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r1.A05
            r17 = r0
            java.lang.String r0 = r1.A04
            r16 = r0
            boolean r14 = r1.A06
            boolean r13 = r1.A09
            boolean r3 = r1.A08
            boolean r2 = r1.A07
            r0 = 0
            java.lang.Object r15 = r1.A01
            java.lang.Long r15 = (java.lang.Long) r15
            X.0qQ.A0B(r12, r0)
            X.0qQ.A0B(r4, r6)
            X.JvW r1 = new X.JvW
            r22 = r3
            r23 = r2
            r24 = r0
            r19 = r17
            r20 = r14
            r21 = r13
            r17 = r12
            r18 = r4
            r14 = r1
            r14.<init>((java.lang.Long) r15, (java.lang.String) r16, (java.util.List) r17, (java.util.List) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23, (boolean) r24)
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r6)
        L_0x00ca:
            r11.Epw(r0)
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r12 = r10.A02
            java.lang.String r11 = r10.A05
            if (r26 == 0) goto L_0x00de
            long r3 = r9.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            r9 = 0
        L_0x00de:
            X.C66146MDy.A00(r10, r7, r8, r6)
            java.lang.Object r3 = r12.A01(r9, r7, r11, r8)
            if (r3 == r5) goto L_0x0172
            r1 = r10
            goto L_0x0034
        L_0x00ea:
            X.JUj r0 = X.C59702JUj.A00
            goto L_0x00ca
        L_0x00ed:
            X.MDy r8 = new X.MDy
            r8.<init>(r10, r4, r3)
            goto L_0x001e
        L_0x00f4:
            java.util.List r0 = r10.A02
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x00fe:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r13 = r15.next()
            X.JuC r13 = (X.C60954JuC) r13
            long r0 = r13.A01
            java.lang.String r9 = r13.A04
            com.instagram.common.typedurl.SimpleImageUrl r14 = X.DbS.A0V(r9)
            java.lang.String r13 = r13.A02
            X.N46 r9 = new X.N46
            r9.<init>((com.instagram.common.typedurl.ImageUrl) r14, (java.lang.String) r13, (long) r0)
            r2.add(r9)
            goto L_0x00fe
        L_0x011d:
            X.Jti r0 = r10.A00
            if (r0 == 0) goto L_0x015a
            boolean r9 = r0.A01
            java.lang.String r15 = r0.A00
        L_0x0125:
            boolean r1 = r10.A05
            r20 = r1 ^ 1
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0131
            r21 = 1
            if (r16 != 0) goto L_0x0133
        L_0x0131:
            r21 = 0
        L_0x0133:
            java.lang.Long r14 = r10.A01
            X.JvW r13 = new X.JvW
            r19 = r1
            r22 = r8
            r23 = r6
            r16 = r3
            r17 = r2
            r18 = r9
            r13.<init>((java.lang.Long) r14, (java.lang.String) r15, (java.util.List) r16, (java.util.List) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23)
            X.C41847B3o.A1T(r13, r12, r6)
            if (r0 == 0) goto L_0x0170
            X.0xY r1 = r11.AR4()
            java.lang.String r0 = X.002.A0T(r5, r7, r4)
            r1.E5T(r0, r6)
            r1.apply()
            goto L_0x0170
        L_0x015a:
            r9 = 0
            r15 = 0
            goto L_0x0125
        L_0x015d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0162:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0173
            X.05G r2 = r1.A06
            X.5sO r3 = (X.C297815sO) r3
            java.lang.Object r1 = r3.A00
            r0 = 0
            X.C41847B3o.A1T(r1, r2, r0)
        L_0x0170:
            X.0gF r5 = X.C60340gF.A00
        L_0x0172:
            return r5
        L_0x0173:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A01(java.lang.Long, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r18v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r3 = 20
            r4 = r23
            boolean r0 = X.C66146MDy.A02(r3, r4)
            r6 = r21
            if (r0 == 0) goto L_0x00d9
            r5 = r4
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d9
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r7 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 != r1) goto L_0x010b
            java.lang.Object r0 = r5.A02
            X.JvW r0 = (X.C61032JvW) r0
            java.lang.Object r4 = r5.A01
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r4 = (com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository) r4
            X.0eS.A00(r7)
        L_0x0030:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r2 = r7 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0110
            X.05G r3 = r4.A06
            X.LMC r8 = r4.A03
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r7 = r7.A00
            X.JtQ r7 = (X.C60906JtQ) r7
            boolean r14 = X.DbW.A1S(r1, r7, r0)
            java.lang.Object r6 = r0.A03
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r2 = r7.A01
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x0052:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r4.next()
            X.Jtq r2 = (X.C60932Jtq) r2
            X.JuJ r2 = X.LMC.A00(r2, r8)
            r5.add(r2)
            goto L_0x0052
        L_0x0066:
            X.0eS.A00(r7)
            X.JvW r0 = A00(r6)
            if (r0 == 0) goto L_0x011e
            boolean r2 = r0.A07
            if (r2 != 0) goto L_0x011e
            boolean r15 = r0.A05
            if (r15 == 0) goto L_0x011e
            if (r15 != r1) goto L_0x011e
            java.lang.String r12 = r0.A04
            if (r12 == 0) goto L_0x011e
            boolean r2 = X.00l.A0W(r12)
            if (r2 != 0) goto L_0x011e
            X.05G r9 = r6.A06
            java.lang.Object r13 = r0.A03
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r0.A02
            java.util.List r14 = (java.util.List) r14
            boolean r8 = r0.A06
            boolean r7 = r0.A09
            boolean r3 = r0.A08
            r2 = 0
            java.lang.Object r11 = r0.A01
            java.lang.Long r11 = (java.lang.Long) r11
            X.0qQ.A0B(r13, r2)
            X.0qQ.A0B(r14, r1)
            X.JvW r10 = new X.JvW
            r18 = r3
            r19 = r1
            r20 = r2
            r17 = r7
            r16 = r8
            r10.<init>((java.lang.Long) r11, (java.lang.String) r12, (java.util.List) r13, (java.util.List) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20)
            X.C41847B3o.A1T(r10, r9, r1)
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r13 = r6.A02
            java.lang.String r11 = r6.A05
            long r2 = r6.A00
            java.lang.Long r14 = X.JTO.A0y(r2)
            long r9 = r14.longValue()
            r7 = -1
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00c5
            r14 = 0
        L_0x00c5:
            X.C66146MDy.A00(r6, r0, r5, r1)
            r15 = r22
            r16 = r11
            r17 = r12
            r18 = r5
            java.lang.Object r7 = r13.A00(r14, r15, r16, r17, r18)
            if (r7 == r4) goto L_0x0120
            r4 = r6
            goto L_0x0030
        L_0x00d9:
            X.MDy r5 = new X.MDy
            r5.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x00e0:
            java.util.ArrayList r8 = X.00k.A0U(r6)
            r8.addAll(r5)
            X.Jti r2 = r7.A00
            if (r2 == 0) goto L_0x0108
            boolean r10 = r2.A01
            java.lang.String r7 = r2.A00
        L_0x00ef:
            java.lang.Object r9 = r0.A02
            java.util.List r9 = (java.util.List) r9
            boolean r11 = r0.A06
            boolean r12 = r0.A09
            boolean r13 = r0.A08
            java.lang.Object r6 = r0.A01
            java.lang.Long r6 = (java.lang.Long) r6
            X.0qQ.A0B(r9, r1)
            X.JvW r5 = new X.JvW
            r15 = r1
            r5.<init>((java.lang.Long) r6, (java.lang.String) r7, (java.util.List) r8, (java.util.List) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15)
            r0 = 1
            goto L_0x011b
        L_0x0108:
            r10 = 0
            r7 = 0
            goto L_0x00ef
        L_0x010b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0110:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0121
            X.05G r3 = r4.A06
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r5 = r7.A00
            r0 = 0
        L_0x011b:
            X.C41847B3o.A1T(r5, r3, r0)
        L_0x011e:
            X.0gF r4 = X.C60340gF.A00
        L_0x0120:
            return r4
        L_0x0121:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }
}
