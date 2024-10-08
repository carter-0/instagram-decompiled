package com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C307896Rx;
import X.C60340gF;
import X.S1M;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1", f = "BKBloksActionInapppurchaseFetchPriceAndBuyImpl.kt", i = {0}, l = {88, 101, 137}, m = "invokeSuspend", n = {"catalogType"}, s = {"L$0"})
public final class BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ S1M A02;
    public final /* synthetic */ C307896Rx A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ Map A0A;
    public final /* synthetic */ Map A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(S1M s1m, C307896Rx r3, String str, String str2, String str3, String str4, List list, List list2, Map map, Map map2, AnonymousClass4D7 r12) {
        super(2, r12);
        this.A03 = r3;
        this.A07 = str;
        this.A0A = map;
        this.A04 = str2;
        this.A0B = map2;
        this.A02 = s1m;
        this.A08 = list;
        this.A09 = list2;
        this.A06 = str3;
        this.A05 = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        C307896Rx r2 = this.A03;
        String str = this.A07;
        Map map = this.A0A;
        String str2 = this.A04;
        Map map2 = this.A0B;
        return new BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(this.A02, r2, str, str2, this.A06, this.A05, this.A08, this.A09, map, map2, r14);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            X.1Hj r7 = X.1Hj.A02
            r8 = r25
            int r0 = r8.A00
            java.lang.String r18 = "Required value was null."
            java.lang.String r12 = "FETCH_PRICE_AND_BUY"
            java.lang.String r11 = "FETCH_PRICE"
            r15 = 3
            r10 = 2
            r13 = 1
            java.lang.String r6 = "status"
            r5 = 0
            if (r0 == 0) goto L_0x003f
            if (r0 == r13) goto L_0x00fb
            if (r0 == r10) goto L_0x019d
            X.0eS.A00(r1)
        L_0x001e:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            java.util.Map r1 = r8.A0B
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "PURCHASE_SUCCESS"
            r1.put(r6, r0)
        L_0x002b:
            X.S1M r0 = r8.A02
            r0.A00(r1)
            X.C10024RlJ.A00 = r5
        L_0x0032:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0035:
            r0 = 593(0x251, float:8.31E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.put(r6, r0)
            goto L_0x002b
        L_0x003f:
            X.0eS.A00(r1)
            X.6Rx r0 = r8.A03
            androidx.fragment.app.FragmentActivity r9 = X.C308206Td.A04(r0)
            X.0lg r4 = X.C308206Td.A0B(r0)
            java.lang.String r0 = r8.A07
            r3 = 0
            X.Jvk r2 = new X.Jvk
            r2.<init>(r0, r3)
            java.util.Map r14 = r8.A0A
            java.lang.String r0 = "app_name"
            java.lang.String r23 = X.DbT.A11(r0, r14)
            java.lang.String r0 = ""
            if (r23 != 0) goto L_0x0062
            r23 = r0
        L_0x0062:
            java.lang.String r1 = "catalog_type"
            java.lang.String r1 = X.DbT.A11(r1, r14)
            if (r1 == 0) goto L_0x006b
            r0 = r1
        L_0x006b:
            X.0qQ.A0B(r9, r13)
            X.0qQ.A0B(r4, r10)
            r24 = 7
            X.IoE r1 = new X.IoE
            r19 = r1
            r20 = r9
            r21 = r4
            r22 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            java.lang.Class<X.T7Q> r2 = X.T7Q.class
            java.lang.Object r9 = r4.A01(r2, r1)
            X.T7Q r9 = (X.T7Q) r9
            java.lang.String r1 = r8.A04
            r17 = r1
            java.util.Map r14 = r8.A0B
            r8.A01 = r0
            r8.A00 = r13
            boolean r1 = r9.A03
            java.lang.String r16 = "params"
            if (r1 == 0) goto L_0x00b0
            java.lang.String r2 = r9.A02
            java.lang.String r1 = r9.A07
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00b0
            X.Jvk r2 = r9.A00
            if (r2 == 0) goto L_0x0111
            X.Jvk r1 = r9.A05
            if (r2 != r1) goto L_0x00b0
            X.T7R r1 = r9.A01
        L_0x00ad:
            if (r1 != r7) goto L_0x0102
            return r7
        L_0x00b0:
            java.lang.String r1 = r9.A07
            r9.A02 = r1
            r9.A03 = r3
            X.T7R r1 = r9.A01
            if (r1 == 0) goto L_0x00bd
            r1.A01()
        L_0x00bd:
            X.Jvk r1 = r9.A05
            r9.A00 = r1
            X.1X5 r2 = X.C49054EoY.A00()
            com.instagram.common.session.UserSession r1 = r9.A06
            androidx.fragment.app.FragmentActivity r13 = r9.A04
            X.T7R r1 = r2.A00(r13, r1)
            r9.A01 = r1
            X.1IW r20 = X.JTS.A0s(r8)
            X.1a8 r4 = X.1a8.A00()
            X.T7R r2 = r9.A01
            X.0qQ.A0A(r2)
            X.Jvk r1 = r9.A00
            if (r1 == 0) goto L_0x0111
            X.1aU r2 = r2.A00(r13, r1)
            X.PSX r1 = new X.PSX
            r19 = r1
            r21 = r9
            r22 = r14
            r23 = r17
            r24 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            r4.A02(r2, r1)
            java.lang.Object r1 = r20.A0E()
            goto L_0x00ad
        L_0x00fb:
            java.lang.Object r0 = r8.A01
            java.lang.String r0 = (java.lang.String) r0
            X.0eS.A00(r1)
        L_0x0102:
            X.T7R r1 = (X.T7R) r1
            X.C10024RlJ.A00 = r1
            if (r1 != 0) goto L_0x0172
            X.S1M r1 = r8.A02
            java.util.Map r0 = r8.A0B
            r1.A00(r0)
            goto L_0x0032
        L_0x0111:
            X.0qQ.A0F(r16)
            goto L_0x0133
        L_0x0115:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r1 = 0
            java.util.Iterator r17 = r3.iterator()
        L_0x0122:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x014a
            java.lang.Object r14 = r17.next()
            int r16 = r1 + 1
            if (r1 >= 0) goto L_0x0138
            X.0sr.A1T()
        L_0x0133:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0138:
            X.RF1 r3 = X.RF1.ITEM_TYPE_SUBS
            java.lang.Object r1 = r4.get(r1)
            if (r14 != r3) goto L_0x0146
            r10.add(r1)
        L_0x0143:
            r1 = r16
            goto L_0x0122
        L_0x0146:
            r2.add(r1)
            goto L_0x0143
        L_0x014a:
            boolean r1 = X.DbT.A1b(r10)
            r3 = 0
            if (r1 == 0) goto L_0x0170
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r10)
        L_0x0155:
            boolean r1 = X.DbT.A1b(r2)
            if (r1 == 0) goto L_0x015f
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x015f:
            X.1IW r2 = X.JTS.A0s(r8)
            X.SoZ r1 = new X.SoZ
            r1.<init>(r4, r9, r2)
            r13.A03(r1, r0, r3, r10)
            java.lang.Object r1 = r2.A0E()
            goto L_0x019a
        L_0x0170:
            r10 = r5
            goto L_0x0155
        L_0x0172:
            java.lang.String r2 = r8.A04
            boolean r1 = X.0qQ.A0K(r2, r11)
            if (r1 != 0) goto L_0x0180
            boolean r1 = X.0qQ.A0K(r2, r12)
            if (r1 == 0) goto L_0x01ed
        L_0x0180:
            X.T7R r13 = X.C10024RlJ.A00
            if (r13 == 0) goto L_0x025c
            java.util.Map r9 = r8.A0B
            java.util.List r3 = r8.A08
            java.util.List r4 = r8.A09
            r8.A01 = r5
            r8.A00 = r10
            int r2 = r3.size()
            int r1 = r4.size()
            if (r2 == r1) goto L_0x0115
            java.lang.String r1 = "SIZE_MISMATCH"
        L_0x019a:
            if (r1 != r7) goto L_0x01a0
            return r7
        L_0x019d:
            X.0eS.A00(r1)
        L_0x01a0:
            java.lang.String r2 = "SIZE_MISMATCH"
            boolean r0 = X.0qQ.A0K(r1, r2)
            java.util.Map r1 = r8.A0B
            if (r0 == 0) goto L_0x01b6
            r1.put(r6, r2)
            X.S1M r0 = r8.A02
            r0.A00(r1)
            X.C10024RlJ.A00 = r5
            goto L_0x0032
        L_0x01b6:
            java.lang.String r0 = "product_status"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r0 = "AVAILABLE"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01d7
            r0 = 550(0x226, float:7.71E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.put(r6, r0)
            X.S1M r0 = r8.A02
            r0.A00(r1)
            X.C10024RlJ.A00 = r5
            goto L_0x0032
        L_0x01d7:
            java.lang.String r0 = "FETCHED"
            r1.put(r6, r0)
            java.lang.String r2 = r8.A04
            boolean r0 = X.0qQ.A0K(r2, r11)
            if (r0 == 0) goto L_0x01ed
            X.S1M r0 = r8.A02
            r0.A00(r1)
            X.C10024RlJ.A00 = r5
            goto L_0x0032
        L_0x01ed:
            java.lang.String r0 = "BUY"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01fb
            boolean r0 = X.0qQ.A0K(r2, r12)
            if (r0 == 0) goto L_0x0032
        L_0x01fb:
            X.6Rx r1 = r8.A03
            X.T7R r9 = X.C10024RlJ.A00
            if (r9 == 0) goto L_0x0261
            java.util.Map r4 = r8.A0B
            java.util.List r0 = r8.A08
            java.lang.Object r13 = X.00k.A0I(r0)
            X.RF1 r13 = (X.RF1) r13
            java.util.List r0 = r8.A09
            java.lang.Object r14 = X.00k.A0I(r0)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r10 = r8.A06
            java.lang.String r2 = r8.A05
            java.util.Map r0 = r8.A0A
            r8.A01 = r5
            r8.A00 = r15
            java.util.LinkedHashMap r12 = X.0Yt.A03(r0)
            java.lang.String r0 = "product_id"
            r12.put(r0, r10)
            java.lang.String r0 = "payee_id"
            r12.put(r0, r2)
            X.1IW r3 = X.JTS.A0s(r8)
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r1)
            X.3mC r11 = X.C250863mB.A03
            X.3u9 r1 = X.C255453u9.A01
            X.3zM r0 = new X.3zM
            r0.<init>(r1, r1)
            java.lang.String r15 = r11.A02(r12, r0)
            X.QOs r12 = new X.QOs
            r16 = r10
            r17 = r5
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.Sob r0 = new X.Sob
            r0.<init>(r4, r3)
            r9.A02(r2, r12, r0, r5)
            java.lang.Object r1 = r3.A0E()
            if (r1 != r7) goto L_0x001e
            return r7
        L_0x025c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0261:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
