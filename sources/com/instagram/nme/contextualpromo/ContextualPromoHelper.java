package com.instagram.nme.contextualpromo;

import X.1vm;
import X.C262224Cq;
import X.C63737L4v;
import X.DbS;
import com.instagram.common.session.UserSession;

public final class ContextualPromoHelper {
    public final UserSession A00;
    public final ContextualPromoApi A01;
    public final ContextualPromoHelper$Companion$getDefaultImageFetcher$1 A02;
    public final C63737L4v A03;

    public ContextualPromoHelper(UserSession userSession, C262224Cq r5) {
        ContextualPromoApi contextualPromoApi = new ContextualPromoApi(1vm.A01(userSession), DbS.A04(DbS.A0J(userSession, 1), userSession, 36610610469083211L));
        ContextualPromoHelper$Companion$getDefaultImageFetcher$1 contextualPromoHelper$Companion$getDefaultImageFetcher$1 = new ContextualPromoHelper$Companion$getDefaultImageFetcher$1(userSession);
        C63737L4v l4v = new C63737L4v(contextualPromoApi, r5);
        this.A00 = userSession;
        this.A01 = contextualPromoApi;
        this.A02 = contextualPromoHelper$Companion$getDefaultImageFetcher$1;
        this.A03 = l4v;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.Il5, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r25, X.AnonymousClass4D7 r26) {
        /*
            r24 = this;
            r15 = 0
            r2 = r15
            r14 = 1
            r4 = r26
            boolean r0 = r4 instanceof X.C58073Il5
            r5 = r24
            if (r0 == 0) goto L_0x00f7
            r13 = r4
            X.Il5 r13 = (X.C58073Il5) r13
            int r0 = r13.A0C
            if (r0 != r14) goto L_0x00f7
            int r3 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00f7
            int r3 = r3 - r1
            r13.A00 = r3
        L_0x001d:
            java.lang.Object r12 = r13.A0B
            X.1Hj r11 = X.1Hj.A02
            int r0 = r13.A00
            r10 = 2
            if (r0 == 0) goto L_0x00c3
            if (r0 == r14) goto L_0x00da
            if (r0 != r10) goto L_0x00ff
            java.lang.Object r9 = r13.A0A
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r8 = r13.A09
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r13.A08
            X.Kiz r3 = (X.C62628Kiz) r3
            java.lang.Object r7 = r13.A07
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r13.A06
            X.C8K r4 = (X.C8K) r4
            java.lang.Object r6 = r13.A05
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r13.A04
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r2 = r13.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r13.A01
            com.instagram.nme.contextualpromo.ContextualPromoHelper r1 = (com.instagram.nme.contextualpromo.ContextualPromoHelper) r1
            X.0eS.A00(r12)
        L_0x0051:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            X.L4v r0 = r1.A03
            r17 = r0
            com.instagram.common.session.UserSession r0 = r1.A00
            r16 = r0
            X.FGY r0 = new X.FGY
            r22 = r8
            r23 = r7
            r20 = r17
            r21 = r4
            r18 = r16
            r19 = r3
            r16 = r0
            r17 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r9.add(r0)
            r9 = r5
        L_0x0074:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r4 = r6.next()
            X.C8K r4 = (X.C8K) r4
            java.lang.String r0 = "promo_id"
            java.lang.String r8 = r4.A07(r0)
            if (r8 != 0) goto L_0x0089
            return r15
        L_0x0089:
            X.Kiz r3 = X.C62628Kiz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r3 = r4.getOptionalEnumField(r14, r0, r3)
            X.Kiz r3 = (X.C62628Kiz) r3
            if (r3 != 0) goto L_0x0096
            return r15
        L_0x0096:
            com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1 r7 = r1.A02
            X.Bxi r5 = r4.A0E()
            if (r5 == 0) goto L_0x00c1
            java.lang.String r0 = "uri"
            java.lang.String r0 = r5.A07(r0)
        L_0x00a4:
            r13.A01 = r1
            r13.A02 = r2
            r13.A04 = r9
            r13.A05 = r6
            r13.A06 = r4
            r13.A07 = r2
            r13.A08 = r3
            r13.A09 = r8
            r13.A0A = r9
            r13.A00 = r10
            java.lang.Object r12 = r7.A00(r0, r13)
            if (r12 == r11) goto L_0x0104
            r5 = r9
            r7 = r2
            goto L_0x0051
        L_0x00c1:
            r0 = r15
            goto L_0x00a4
        L_0x00c3:
            X.0eS.A00(r12)
            com.instagram.nme.contextualpromo.ContextualPromoApi r0 = r5.A01
            r13.A01 = r5
            r1 = r25
            r13.A02 = r1
            r13.A04 = r15
            r13.A00 = r14
            java.lang.Object r12 = r0.A01(r1, r15, r15, r13)
            if (r12 == r11) goto L_0x0104
            r1 = r5
            goto L_0x00e5
        L_0x00da:
            java.lang.Object r2 = r13.A04
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r13.A01
            com.instagram.nme.contextualpromo.ContextualPromoHelper r1 = (com.instagram.nme.contextualpromo.ContextualPromoHelper) r1
            X.0eS.A00(r12)
        L_0x00e5:
            java.util.AbstractCollection r12 = (java.util.AbstractCollection) r12
            if (r12 != 0) goto L_0x00ea
            return r15
        L_0x00ea:
            r12.size()
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r12)
            java.util.Iterator r6 = r12.iterator()
            goto L_0x0074
        L_0x00f7:
            X.Il5 r13 = new X.Il5
            r13.<init>(r5, r4, r14)
            goto L_0x001d
        L_0x00fe:
            return r9
        L_0x00ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0104:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (r8 != r6) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C62628Kiz r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r15 = this;
            r10 = r16
            r14 = r18
            r3 = 10
            r4 = r20
            boolean r0 = X.ME1.A02(r3, r4)
            if (r0 == 0) goto L_0x00c0
            r7 = r4
            X.ME1 r7 = (X.ME1) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c0
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001c:
            java.lang.Object r8 = r7.A06
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 == r9) goto L_0x004d
            if (r0 != r5) goto L_0x00c7
            java.lang.Object r12 = r7.A05
            X.C8K r12 = (X.C8K) r12
            java.lang.Object r14 = r7.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r10 = r7.A03
            X.Kiz r10 = (X.C62628Kiz) r10
            java.lang.Object r13 = r7.A02
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r4 = r7.A01
            com.instagram.nme.contextualpromo.ContextualPromoHelper r4 = (com.instagram.nme.contextualpromo.ContextualPromoHelper) r4
            X.0eS.A00(r8)
        L_0x0041:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            X.L4v r11 = r4.A03
            com.instagram.common.session.UserSession r9 = r4.A00
            X.FGY r7 = new X.FGY
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x004d:
            java.lang.Object r14 = r7.A03
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r10 = r7.A02
            java.lang.Object r4 = r7.A01
            com.instagram.nme.contextualpromo.ContextualPromoHelper r4 = (com.instagram.nme.contextualpromo.ContextualPromoHelper) r4
            X.0eS.A00(r8)
            goto L_0x0073
        L_0x005b:
            X.0eS.A00(r8)
            com.instagram.nme.contextualpromo.ContextualPromoApi r0 = r15.A01
            r7.A01 = r15
            r7.A02 = r10
            r7.A03 = r14
            r7.A00 = r9
            r2 = r17
            r1 = r19
            java.lang.Object r8 = r0.A01(r2, r14, r1, r7)
            if (r8 == r6) goto L_0x00bf
            r4 = r15
        L_0x0073:
            com.google.common.collect.ImmutableList r8 = (com.google.common.collect.ImmutableList) r8
            r0 = 0
            if (r8 == 0) goto L_0x00cc
            int r1 = r8.size()
            if (r1 != r9) goto L_0x00cc
            r3 = 0
            java.lang.Object r12 = r8.get(r3)
            X.C8K r12 = (X.C8K) r12
            X.Kiz r8 = X.C62628Kiz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "type"
            java.lang.Enum r1 = r12.getOptionalEnumField(r9, r2, r8)
            if (r1 != r10) goto L_0x00cc
            java.lang.String r1 = "promo_id"
            java.lang.String r13 = r12.getOptionalStringField(r3, r1)
            if (r13 == 0) goto L_0x00cc
            java.lang.Enum r10 = r12.getOptionalEnumField(r9, r2, r8)
            X.Kiz r10 = (X.C62628Kiz) r10
            if (r10 == 0) goto L_0x00cc
            com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1 r2 = r4.A02
            X.Bxi r1 = r12.A0E()
            if (r1 == 0) goto L_0x00ad
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.getOptionalStringField(r3, r0)
        L_0x00ad:
            r7.A01 = r4
            r7.A02 = r13
            r7.A03 = r10
            r7.A04 = r14
            r7.A05 = r12
            r7.A00 = r5
            java.lang.Object r8 = r2.A00(r0, r7)
            if (r8 != r6) goto L_0x0041
        L_0x00bf:
            return r6
        L_0x00c0:
            X.ME1 r7 = new X.ME1
            r7.<init>(r15, r4, r3)
            goto L_0x001c
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper.A00(X.Kiz, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C62628Kiz r23, java.lang.String r24, X.AnonymousClass4D7 r25) {
        /*
            r22 = this;
            r12 = r23
            r6 = 0
            r14 = 0
            r3 = 9
            r5 = r25
            boolean r0 = X.ME1.A02(r3, r5)
            r4 = r22
            if (r0 == 0) goto L_0x00eb
            r9 = r5
            X.ME1 r9 = (X.ME1) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00eb
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x001e:
            java.lang.Object r15 = r9.A06
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 == r3) goto L_0x0074
            if (r0 != r7) goto L_0x00f2
            java.lang.Object r4 = r9.A05
            X.C8K r4 = (X.C8K) r4
            java.lang.Object r6 = r9.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r9.A03
            X.Kiz r3 = (X.C62628Kiz) r3
            java.lang.Object r10 = r9.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r9.A01
            com.instagram.nme.contextualpromo.ContextualPromoHelper r5 = (com.instagram.nme.contextualpromo.ContextualPromoHelper) r5
            X.0eS.A00(r15)
        L_0x0043:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            X.L4v r1 = r5.A03
            com.instagram.common.session.UserSession r0 = r5.A00
            X.FGY r14 = new X.FGY
            r18 = r1
            r19 = r4
            r20 = r10
            r21 = r6
            r16 = r0
            r17 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
        L_0x005a:
            return r14
        L_0x005b:
            X.0eS.A00(r15)
            com.instagram.nme.contextualpromo.ContextualPromoApi r0 = r4.A01
            r9.A01 = r4
            r1 = r24
            r9.A02 = r1
            r9.A03 = r12
            r9.A04 = r6
            r9.A00 = r3
            java.lang.Object r15 = r0.A01(r1, r6, r6, r9)
            if (r15 == r8) goto L_0x00f7
            r5 = r4
            goto L_0x0081
        L_0x0074:
            java.lang.Object r6 = r9.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r9.A03
            java.lang.Object r5 = r9.A01
            com.instagram.nme.contextualpromo.ContextualPromoHelper r5 = (com.instagram.nme.contextualpromo.ContextualPromoHelper) r5
            X.0eS.A00(r15)
        L_0x0081:
            java.util.AbstractCollection r15 = (java.util.AbstractCollection) r15
            r0 = 0
            if (r15 == 0) goto L_0x005a
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r15.iterator()
        L_0x008e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00a9
            java.lang.Object r10 = r13.next()
            r4 = r10
            X.3lr r4 = (X.C250663lr) r4
            X.Kiz r2 = X.C62628Kiz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r1 = r4.getOptionalEnumField(r3, r1, r2)
            if (r1 != r12) goto L_0x008e
            r11.add(r10)
            goto L_0x008e
        L_0x00a9:
            r11.size()
            X.2SQ r1 = X.2SP.A00
            java.lang.Object r4 = X.00k.A0H(r11, r1)
            X.C8K r4 = (X.C8K) r4
            if (r4 == 0) goto L_0x005a
            java.lang.String r1 = "promo_id"
            java.lang.String r10 = r4.A07(r1)
            if (r10 == 0) goto L_0x005a
            X.Kiz r2 = X.C62628Kiz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r3 = r4.getOptionalEnumField(r3, r1, r2)
            X.Kiz r3 = (X.C62628Kiz) r3
            if (r3 == 0) goto L_0x005a
            com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1 r2 = r5.A02
            X.Bxi r1 = r4.A0E()
            if (r1 == 0) goto L_0x00d8
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.A07(r0)
        L_0x00d8:
            r9.A01 = r5
            r9.A02 = r10
            r9.A03 = r3
            r9.A04 = r6
            r9.A05 = r4
            r9.A00 = r7
            java.lang.Object r15 = r2.A00(r0, r9)
            if (r15 != r8) goto L_0x0043
            return r8
        L_0x00eb:
            X.ME1 r9 = new X.ME1
            r9.<init>(r4, r5, r3)
            goto L_0x001e
        L_0x00f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper.A01(X.Kiz, java.lang.String, X.4D7):java.lang.Object");
    }
}
