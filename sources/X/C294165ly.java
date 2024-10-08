package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ly  reason: invalid class name and case insensitive filesystem */
public final class C294165ly {
    public static final C294165ly A00 = new Object();

    public static final C14929UFq A00(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 1);
        0bb r2 = new 0bb();
        r2.A06("m_pk", r4.A1e(userSession).getId());
        r2.A06("tracking_token", r4.A1e(userSession).C9L());
        if (!r4.A5D() && r4.A1e(userSession).A5D()) {
            r2.A06("carousel_media_id", r4.getId());
            r2.A05("carousel_index", Long.valueOf((long) r4.A15(userSession)));
        }
        return r2;
    }

    public static final AnonymousClass9JL A01(0jB r7) {
        Integer num = null;
        if (r7 == null) {
            return null;
        }
        String str = (String) r7.A01(C271774jZ.A6S);
        String str2 = (String) r7.A01(C271774jZ.A5I);
        String str3 = (String) r7.A01(C271774jZ.A5b);
        String str4 = (String) r7.A01(C271774jZ.A1C);
        Number number = (Number) r7.A01(C271774jZ.A1A);
        if (number != null) {
            num = Integer.valueOf((int) number.longValue());
        }
        return new AnonymousClass9JL((Integer) null, num, str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C15054ULx A03(com.instagram.common.session.UserSession r13, com.instagram.user.model.Product r14) {
        /*
            r0 = 0
            X.0qQ.A0B(r14, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.String r1 = r14.A0H
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x00b6
            long r11 = r0.longValue()
        L_0x001a:
            com.instagram.user.model.User r0 = r14.A0B
            r8 = 0
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
        L_0x0023:
            X.4Ny r4 = X.C263944Ny.A00(r0)
            boolean r0 = r14.A04()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            r3 = 0
            if (r0 == 0) goto L_0x004e
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r14.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x004e
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L_0x004e
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r2 = r14.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r2.A0C
            if (r0 == 0) goto L_0x00b1
            java.lang.Integer r0 = r0.A0C
            if (r0 == 0) goto L_0x00b1
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x0066:
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r2.A0F
            if (r0 == 0) goto L_0x00af
            java.lang.Long r0 = r0.BLg()
            if (r0 == 0) goto L_0x00ac
            long r0 = r0.longValue()
        L_0x0074:
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x0078:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r14.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r0.A0F
            if (r0 == 0) goto L_0x0088
            java.lang.Boolean r0 = r0.BBR()
            if (r0 == 0) goto L_0x0088
            boolean r3 = r0.booleanValue()
        L_0x0088:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r14.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x00a6
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r0 = r0.A01
            if (r0 == 0) goto L_0x00a6
            com.instagram.model.payments.CurrencyAmountInfo r0 = r0.Btg()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r0.getAmount()
            if (r0 == 0) goto L_0x00a6
            java.lang.Double r8 = X.012.A0p(r0)
        L_0x00a6:
            X.ULx r3 = new X.ULx
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        L_0x00ac:
            r0 = 0
            goto L_0x0074
        L_0x00af:
            r10 = r8
            goto L_0x0078
        L_0x00b1:
            r9 = r8
            goto L_0x0066
        L_0x00b3:
            r0 = r8
            goto L_0x0023
        L_0x00b6:
            r11 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294165ly.A03(com.instagram.common.session.UserSession, com.instagram.user.model.Product):X.ULx");
    }

    public static final C294175lz A04(1Xj r1) {
        return A06(r1, r1.A3K(true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r13 == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C294175lz A06(X.1Xj r17, java.util.List r18) {
        /*
            r8 = 0
            r1 = r18
            if (r18 == 0) goto L_0x0040
            java.util.List r9 = A0C(r1)
            r6 = 10
            int r0 = X.0Yv.A1E(r1, r6)
            int r2 = X.0se.A0L(r0)
            r0 = 16
            if (r2 >= r0) goto L_0x0019
            r2 = 16
        L_0x0019:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Iterator r4 = r1.iterator()
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r4.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r3 = r0.A0H
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Long r2 = X.00y.A0n(r6, r3)
            java.lang.Long r0 = X.00y.A0n(r6, r3)
            r5.put(r2, r0)
            goto L_0x0022
        L_0x0040:
            r9 = r8
            goto L_0x0048
        L_0x0042:
            java.util.Map r13 = A0E(r5)
            if (r13 != 0) goto L_0x004c
        L_0x0048:
            X.0sm r13 = X.0Yt.A0E()
        L_0x004c:
            if (r18 == 0) goto L_0x0191
            java.util.Map r14 = A0D(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x005b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r3 = r4.next()
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            com.instagram.user.model.User r0 = r3.A0B
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = X.AnonymousClass3ZA.A00(r0)
            if (r2 == 0) goto L_0x005b
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r3)
            r5.add(r0)
            goto L_0x005b
        L_0x007a:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0083:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r2 = r5.next()
            X.0eP r2 = (X.0eP) r2
            java.lang.Object r0 = r2.A00
            java.lang.Object r3 = r4.get(r0)
            if (r3 != 0) goto L_0x009f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.put(r0, r3)
        L_0x009f:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r2.A01
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r2 = r0.A0H
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r2)
            r3.add(r0)
            goto L_0x0083
        L_0x00b5:
            int r0 = r4.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x00c6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r2 = X.00k.A0X(r0)
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r2)
            r5.add(r0)
            goto L_0x00c6
        L_0x00e9:
            java.util.Map r16 = X.0Yt.A08(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x00f6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r4 = r5.next()
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            com.instagram.user.model.User r0 = r4.A0B
            if (r0 == 0) goto L_0x00f6
            java.lang.String r2 = X.AnonymousClass3ZA.A00(r0)
            if (r2 == 0) goto L_0x00f6
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r2)
            if (r2 == 0) goto L_0x00f6
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r4)
            r3.add(r0)
            goto L_0x00f6
        L_0x011d:
            r5 = 10
            int r0 = X.0Yv.A1E(r3, r5)
            int r2 = X.0se.A0L(r0)
            r0 = 16
            if (r2 >= r0) goto L_0x012d
            r2 = 16
        L_0x012d:
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>(r2)
            java.util.Iterator r7 = r3.iterator()
        L_0x0136:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0171
            java.lang.Object r6 = r7.next()
            X.0eP r6 = (X.0eP) r6
            java.lang.Object r0 = r6.A00
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r6.A01
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r2 = r0.A0H
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Long r3 = X.00y.A0n(r5, r2)
            java.lang.Long r2 = X.00y.A0n(r5, r2)
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r2)
            java.util.Map r0 = X.0se.A0M(r0)
            java.util.Map r0 = A0E(r0)
            r15.put(r4, r0)
            goto L_0x0136
        L_0x0171:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x017a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0197
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r0.A0F
            if (r0 == 0) goto L_0x017a
            r4.add(r2)
            goto L_0x017a
        L_0x0191:
            r14 = r8
            r16 = r8
            r15 = r8
        L_0x0195:
            r10 = r8
            goto L_0x01a1
        L_0x0197:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0195
            java.util.List r10 = A0C(r4)
        L_0x01a1:
            java.util.ArrayList r0 = r17.A3E()
            if (r0 == 0) goto L_0x01cf
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x01b0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r3.next()
            com.instagram.tagging.model.Tag r0 = (com.instagram.tagging.model.Tag) r0
            java.lang.String r2 = r0.getId()
            X.0qQ.A07(r2)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r2)
            if (r0 == 0) goto L_0x01b0
            r11.add(r0)
            goto L_0x01b0
        L_0x01cf:
            r11 = r8
        L_0x01d0:
            java.util.ArrayList r2 = r17.A3E()
            if (r2 == 0) goto L_0x01fd
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x01e5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r0 = r2.next()
            com.instagram.tagging.model.Tag r0 = (com.instagram.tagging.model.Tag) r0
            java.lang.String r0 = r0.getId()
            X.4Ny r0 = X.C263944Ny.A00(r0)
            r12.add(r0)
            goto L_0x01e5
        L_0x01fd:
            r12 = r8
        L_0x01fe:
            if (r18 == 0) goto L_0x0238
            java.lang.Object r0 = X.00k.A0J(r1)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            if (r0 == 0) goto L_0x0236
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0236
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0236
            X.4Ny r7 = X.C263944Ny.A00(r0)
        L_0x0216:
            java.lang.Boolean r8 = A08(r1)
        L_0x021a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = X.C233822wX.A03(r17)
            if (r0 == 0) goto L_0x022e
            java.lang.String r1 = X.C233822wX.A03(r17)
            java.lang.String r0 = "product_collection_id"
            r2.put(r0, r1)
        L_0x022e:
            X.5lz r6 = new X.5lz
            r17 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        L_0x0236:
            r7 = 0
            goto L_0x0216
        L_0x0238:
            r7 = r8
            goto L_0x021a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294165ly.A06(X.1Xj, java.util.List):X.5lz");
    }

    public static final C15029UKi A07(1Xj r15, Integer num, String str) {
        C376699Iz r4;
        String AYt;
        int intValue;
        String str2;
        Long l;
        C61070Jw8 jw8 = null;
        if (r15 == null) {
            return null;
        }
        if (!r15.A5D() || num == null || (intValue = num.intValue()) == -1) {
            r4 = null;
        } else {
            Long valueOf = Long.valueOf((long) intValue);
            1Xj A1c = r15.A1c(intValue);
            if (A1c != null) {
                str2 = A1c.getId();
            } else {
                str2 = null;
            }
            1Xj A1c2 = r15.A1c(intValue);
            if (A1c2 != null) {
                l = Long.valueOf((long) A1c2.BR7().A00);
            } else {
                l = null;
            }
            r4 = new C376699Iz((Object) valueOf, (Object) l, str2, 5);
        }
        String id = r15.getId();
        if (id == null) {
            id = "";
        }
        long j = (long) r15.BR7().A00;
        long A1A = r15.A1A();
        String C9L = r15.C9L();
        if (r15.A5D()) {
            1Xj A1c3 = r15.A1c(0);
            if (A1c3 != null) {
                AYt = A1c3.A0C.AYt();
            } else {
                AYt = null;
            }
        } else {
            AYt = r15.A0C.AYt();
        }
        String loggingInfoToken = r15.A0C.getLoggingInfoToken();
        C294175lz A04 = A04(r15);
        if (r15.A5v()) {
            jw8 = A02(r15, str);
        }
        return new C15029UKi(r4, jw8, A04, id, C9L, AYt, loggingInfoToken, j, A1A);
    }

    public static final ArrayList A09(1Xj r4) {
        ArrayList A3K = r4.A3K(true);
        if (A3K == null || A3K.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(A3K, 10));
        Iterator it = A3K.iterator();
        while (it.hasNext()) {
            arrayList.add(((Product) it.next()).A0B);
        }
        List A0X = 00k.A0X(arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : A0X) {
            if (hashSet.add(((User) next).getId())) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final List A0C(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Product) it.next()).A0H;
            0qQ.A0B(str, 0);
            Long A0n = 00y.A0n(10, str);
            if (A0n != null) {
                arrayList.add(A0n);
            }
        }
        return arrayList;
    }

    public static final Map A0D(List list) {
        String A002;
        Long A0n;
        0qQ.A0B(list, 0);
        ArrayList<0eP> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            User user = product.A0B;
            if (!(user == null || (A002 = AnonymousClass3ZA.A00(user)) == null || (A0n = 00y.A0n(10, A002)) == null)) {
                arrayList.add(new 0eP(A0n, product));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (0eP r3 : arrayList) {
            Long valueOf = Long.valueOf(((Number) r3.A00).longValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            String str = ((Product) r3.A01).A0H;
            0qQ.A0B(str, 0);
            ((List) obj).add(00y.A0n(10, str));
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new 0eP(entry.getKey(), 00k.A0X((Iterable) entry.getValue())));
        }
        return 0Yt.A08(arrayList2);
    }

    public static final C61070Jw8 A02(1Xj r10, String str) {
        ArrayList arrayList;
        String str2;
        List A3o;
        String A0K;
        AnonymousClass3WT r4 = AnonymousClass3WT.PRODUCT;
        List<C255783ui> A3o2 = r10.A3o(r4);
        List list = null;
        if (A3o2 == null || !(!A3o2.isEmpty())) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (C255783ui r5 : A3o2) {
                String str3 = r5.A0I().A0H;
                0qQ.A0B(str3, 0);
                Long A0n = 00y.A0n(10, str3);
                if (!(A0n == null || (A0K = r5.A0K()) == null)) {
                    0bb r2 = new 0bb();
                    r2.A05("product_id", A0n);
                    r2.A06("sticker_id", A0K);
                    r2.A06("sticker_type", r5.A11.A00);
                    arrayList.add(r2);
                }
            }
        }
        if (str != null) {
            str2 = null;
            if (r10.A5v() && (A3o = r10.A3o(r4)) != null && !A3o.isEmpty()) {
                Iterator it = A3o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C255783ui r1 = (C255783ui) it.next();
                    if (str.equals(r1.A0I().A0H)) {
                        str2 = r1.A0K();
                        break;
                    }
                }
            }
        } else {
            str2 = null;
        }
        Product A26 = r10.A26();
        if (A26 != null) {
            String str4 = A26.A0H;
            0qQ.A0B(str4, 0);
            list = 0sr.A1N(00y.A0n(10, str4));
        }
        return new C61070Jw8((Object) C271784ja.A00(r10.A1y(), r10.A1z(), r10.A20(), r10.A21()), (Object) list, (Object) arrayList, str2, 9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A0A(X.C255773uh r5) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.1Xj r0 = r5.A0b
            if (r0 == 0) goto L_0x004b
            java.util.ArrayList r0 = r0.A3F()
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r2 = r3.next()
            X.3ui r2 = (X.C255783ui) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.3WT r0 = r2.A11
            int r1 = r0.ordinal()
            r0 = 30
            if (r1 == r0) goto L_0x0053
            r0 = 36
            if (r1 == r0) goto L_0x004c
            r0 = 38
            if (r1 != r0) goto L_0x0011
            com.instagram.user.model.Product r0 = r2.A0J()
            if (r0 == 0) goto L_0x0011
        L_0x0039:
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
        L_0x0040:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0011
            r4.addAll(r1)
        L_0x004b:
            return r4
        L_0x004c:
            java.util.List r1 = r2.A0N()
            if (r1 == 0) goto L_0x0011
            goto L_0x0040
        L_0x0053:
            com.instagram.user.model.Product r0 = r2.A0I()
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294165ly.A0A(X.3uh):java.util.ArrayList");
    }

    public static final HashMap A0B(C255773uh r9) {
        ArrayList A09;
        Long A0n;
        String A002;
        HashMap hashMap = new HashMap();
        1Xj r0 = r9.A0b;
        if (!(r0 == null || (A09 = A09(r0)) == null)) {
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                String A003 = AnonymousClass3ZA.A00((User) it.next());
                if (!(A003 == null || (A0n = 00y.A0n(10, A003)) == null)) {
                    ArrayList A0A = A0A(r9);
                    ArrayList<Product> arrayList = new ArrayList<>();
                    Iterator it2 = A0A.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        User user = ((Product) next).A0B;
                        if (!(user == null || (A002 = AnonymousClass3ZA.A00(user)) == null || !A002.equalsIgnoreCase(A003))) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Product product : arrayList) {
                        String str = product.A0H;
                        0qQ.A0B(str, 0);
                        Long A0n2 = 00y.A0n(10, str);
                        if (A0n2 != null) {
                            arrayList2.add(A0n2);
                        }
                    }
                    hashMap.put(A0n, arrayList2);
                }
            }
        }
        return hashMap;
    }

    public static final Map A0E(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key == null || value == null)) {
                arrayList.add(new 0eP(key, value));
            }
        }
        return 0Yt.A08(arrayList);
    }

    public static final C294175lz A05(1Xj r3, Integer num) {
        ArrayList arrayList;
        ArrayList A3J = r3.A3J(num);
        if (A3J != null) {
            arrayList = new ArrayList(0Yv.A1E(A3J, 10));
            Iterator it = A3J.iterator();
            while (it.hasNext()) {
                arrayList.add(C14502TxO.A00(((ProductTag) it.next()).A02));
            }
        } else {
            arrayList = null;
        }
        return A06(r3, arrayList);
    }

    public static final Boolean A08(List list) {
        if (list.isEmpty()) {
            return null;
        }
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Product) it.next()).A04()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
