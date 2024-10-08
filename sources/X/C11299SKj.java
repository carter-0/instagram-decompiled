package X;

import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;

/* renamed from: X.SKj  reason: case insensitive filesystem */
public abstract class C11299SKj {
    public static final boolean A02(W3CShippingAddress w3CShippingAddress, W3CShippingAddress w3CShippingAddress2) {
        return w3CShippingAddress != null && 0qQ.A0K(w3CShippingAddress.addressLine, w3CShippingAddress2.addressLine) && 0qQ.A0K(w3CShippingAddress.city, w3CShippingAddress2.city) && 0qQ.A0K(w3CShippingAddress.country, w3CShippingAddress2.country) && 0qQ.A0K(w3CShippingAddress.region, w3CShippingAddress2.region) && 0qQ.A0K(w3CShippingAddress.postalCode, w3CShippingAddress2.postalCode) && 0qQ.A0K(w3CShippingAddress.organization, w3CShippingAddress2.organization) && 0qQ.A0K(w3CShippingAddress.recipient, w3CShippingAddress2.recipient);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.CITY) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.COUNTRY) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.REGION) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.POSTAL_CODE) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.ORGANIZATION) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.RECIPIENT) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r2 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        r3.city = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        if (r2 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r3.country = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        if (r2 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r3.region = r14.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r2 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        r3.postalCode = r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        if (r2 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        r3.organization = r14.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        if (r2 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        r3.recipient = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.offsite.models.message.W3CShippingAddress A01(com.facebookpay.shippingaddress.model.ShippingAddress r14, java.lang.String r15) {
        /*
            if (r15 == 0) goto L_0x0038
            java.lang.String r3 = r14.A02
            if (r3 == 0) goto L_0x0033
            com.facebookpay.offsite.models.message.GsonUtils r0 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            java.util.Map r2 = r0.getToRedactedMap(r15)
            boolean r0 = r2.containsKey(r3)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L_0x002c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x001f:
            java.lang.String r0 = "Default"
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x002c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x002c:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r2 = X.00k.A0k(r0)
            goto L_0x0039
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0038:
            r2 = 0
        L_0x0039:
            r4 = 0
            java.lang.String r9 = ""
            com.facebookpay.offsite.models.message.W3CShippingAddress r3 = new com.facebookpay.offsite.models.message.W3CShippingAddress
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 == 0) goto L_0x0088
            java.lang.String r0 = "addr"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0088
        L_0x0053:
            java.lang.String r0 = "city"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x009f
        L_0x005b:
            java.lang.String r0 = "ctry"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00a6
        L_0x0063:
            java.lang.String r0 = "region"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00ad
        L_0x006c:
            java.lang.String r0 = "zip"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00b4
        L_0x0075:
            java.lang.String r0 = "org"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00bb
        L_0x007e:
            java.lang.String r0 = "recp"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00c2
            return r3
        L_0x0088:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = r14.A08
            if (r0 == 0) goto L_0x0093
            r1.add(r0)
        L_0x0093:
            java.lang.String r0 = r14.A09
            if (r0 == 0) goto L_0x009a
            r1.add(r0)
        L_0x009a:
            r3.addressLine = r1
            if (r2 == 0) goto L_0x009f
            goto L_0x0053
        L_0x009f:
            java.lang.String r0 = r14.A01
            r3.city = r0
            if (r2 == 0) goto L_0x00a6
            goto L_0x005b
        L_0x00a6:
            java.lang.String r0 = r14.A02
            r3.country = r0
            if (r2 == 0) goto L_0x00ad
            goto L_0x0063
        L_0x00ad:
            java.lang.String r0 = r14.A07
            r3.region = r0
            if (r2 == 0) goto L_0x00b4
            goto L_0x006c
        L_0x00b4:
            java.lang.String r0 = r14.A06
            r3.postalCode = r0
            if (r2 == 0) goto L_0x00bb
            goto L_0x0075
        L_0x00bb:
            java.lang.String r0 = r14.A05
            r3.organization = r0
            if (r2 == 0) goto L_0x00c2
            goto L_0x007e
        L_0x00c2:
            java.lang.String r0 = r14.A00
            r3.recipient = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11299SKj.A01(com.facebookpay.shippingaddress.model.ShippingAddress, java.lang.String):com.facebookpay.offsite.models.message.W3CShippingAddress");
    }

    public static final W3CShippingAddress A00(ShippingAddress shippingAddress) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str = shippingAddress.A08;
        if (str != null) {
            A1C.add(str);
        }
        String str2 = shippingAddress.A09;
        if (str2 != null) {
            A1C.add(str2);
        }
        if (DbT.A1b(A1C)) {
            String str3 = shippingAddress.A01;
            if (str3 != null) {
                String str4 = shippingAddress.A02;
                if (str4 != null) {
                    String str5 = shippingAddress.A07;
                    if (str5 != null) {
                        String str6 = shippingAddress.A06;
                        if (str6 != null) {
                            return new W3CShippingAddress(A1C, str3, str4, (String) null, shippingAddress.A05, "", str6, shippingAddress.A00, str5, (String) null);
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw DbT.A0m();
    }
}
