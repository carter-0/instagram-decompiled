package X;

import java.util.List;

/* renamed from: X.VmB  reason: case insensitive filesystem */
public abstract class C18135VmB {
    public static Object A00(C307896Rx r18, AnonymousClass6Tm r19) {
        String str;
        String str2;
        String str3;
        String str4;
        AnonymousClass6Tm r3 = r19;
        C276544tV r4 = (C276544tV) r3.A00();
        List list = r3.A00;
        if (list.size() > 3) {
            str = DbU.A0t(list, 3);
        } else {
            str = null;
        }
        if (list.size() > 4) {
            str2 = DbU.A0t(list, 4);
        } else {
            str2 = null;
        }
        if (list.size() > 5) {
            str3 = (String) r3.A03(5);
        } else {
            str3 = null;
        }
        if (list.size() > 6) {
            str4 = DbU.A0t(list, 6);
        } else {
            str4 = null;
        }
        C307896Rx r32 = r18;
        A01(C308206Td.A04(r32), C308206Td.A08(r32), r32, r4, C308206Td.A0B(r32), (Integer) null, (Integer) null, (Long) null, str, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r7.CcK() == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(androidx.fragment.app.FragmentActivity r14, X.AnonymousClass0iw r15, X.C307896Rx r16, X.C276544tV r17, com.instagram.common.session.UserSession r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.Long r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            r13 = r23
            X.WWp r11 = new X.WWp
            r0 = r22
            r11.<init>(r0, r15)
            com.instagram.user.model.Product r12 = X.C18132Vm8.A01(r17)
            r0 = r25
            r10 = r18
            X.1Xj r7 = X.DbV.A0U(r10, r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = r28
            if (r28 == 0) goto L_0x0023
            java.lang.String r0 = "id"
            r1.put(r0, r2)
        L_0x0023:
            r6 = 0
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r5 = new com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo
            r0 = r27
            r5.<init>(r0, r6, r1)
            r1 = 2131438274(0x7f0b2ac2, float:1.849847E38)
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductFeedItem> r0 = com.instagram.model.shopping.productfeed.ProductFeedItem.class
            r2 = r16
            java.lang.Object r1 = X.C308206Td.A0F(r2, r0, r1)
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            if (r1 == 0) goto L_0x0090
            com.instagram.model.shopping.productfeed.ProductTile r0 = r1.A02
            if (r0 == 0) goto L_0x008e
            com.instagram.model.shopping.productfeed.ProductTileMedia r4 = r0.A00(r10)
        L_0x0042:
            java.lang.String r3 = r1.getId()
        L_0x0046:
            X.3kF r8 = X.C249713kF.A00
            if (r23 != 0) goto L_0x004c
            java.lang.String r13 = "bloks"
        L_0x004c:
            r9 = r14
            r14 = r24
            X.WNN r2 = r8.A0L(r9, r10, r11, r12, r13, r14)
            r0 = r26
            r2.A0S = r0
            long r0 = X.DbY.A04(r21)
            r2.A01 = r0
            r2.A02(r7, r6)
            r2.A05 = r4
            r2.A0L = r3
            r0 = r31
            r2.A0G = r0
            r0 = r32
            r2.A0H = r0
            r0 = r19
            r2.A0D = r0
            r0 = r20
            r2.A0C = r0
            if (r7 == 0) goto L_0x007d
            boolean r1 = r7.CcK()
            r0 = 1
            if (r1 != 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            r2.A0X = r0
            r2.A0A = r5
            r0 = r29
            r2.A0I = r0
            r0 = r30
            r2.A0F = r0
            X.WNN.A01(r2)
            return
        L_0x008e:
            r4 = r6
            goto L_0x0042
        L_0x0090:
            r3 = r6
            r4 = r6
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18135VmB.A01(androidx.fragment.app.FragmentActivity, X.0iw, X.6Rx, X.4tV, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
