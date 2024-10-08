package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class S8K {
    public static final AutofillData A00(1yd r4, AutofillData autofillData, String str, boolean z) {
        if (str == null || str.length() == 0) {
            return autofillData;
        }
        List A0x = DbX.A0x(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            Pxj.A1R(A1C, it);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            DbU.A1X(00l.A0B(AnonymousClass7TE.A18(it2)), A0r);
        }
        return A01(r4, autofillData, new LinkedHashSet(A0r), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (X.DbY.A1Z(r2, r3, 36322860546206262L) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r7.contains("street-address") != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.browser.lite.extensions.autofill.model.AutofillData A01(X.1yd r5, com.facebook.browser.lite.extensions.autofill.model.AutofillData r6, java.util.LinkedHashSet r7, boolean r8) {
        /*
            if (r7 == 0) goto L_0x0044
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0044
            if (r6 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x0048
            java.lang.String r3 = "address-line1"
            boolean r0 = r7.contains(r3)
            r2 = 0
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "street-address"
            boolean r1 = r7.contains(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r8 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            java.util.Map r0 = r6.A00
            java.lang.String r0 = X.DbT.A11(r3, r0)
            if (r0 == 0) goto L_0x0033
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0033
            r2 = 1
        L_0x0033:
            com.instagram.common.session.UserSession r3 = r5.A00
            if (r2 == 0) goto L_0x0045
            X.0Tu r2 = X.0Tu.A05
        L_0x0039:
            r0 = 36322860546206262(0x810b7300152a36, double:3.034061497616026E-306)
            boolean r0 = X.DbY.A1Z(r2, r3, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0044:
            return r6
        L_0x0045:
            X.0Tu r2 = X.0Tu.A06
            goto L_0x0039
        L_0x0048:
            java.util.Map r4 = r6.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r4)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r3.<init>((java.util.Map) r0)
            boolean r0 = r7.isEmpty()
            r6 = 0
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "address-line1"
            java.lang.String r2 = X.DbT.A11(r0, r4)
            if (r2 == 0) goto L_0x0083
            java.lang.String r0 = "address-line2"
            java.lang.String r1 = X.DbT.A11(r0, r4)
            if (r1 == 0) goto L_0x0083
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x0083
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0083
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0083
            boolean r0 = X.00l.A0d(r2, r1, r6)
            if (r0 != 0) goto L_0x0083
            r6 = 1
        L_0x0083:
            java.lang.String r5 = "address-line1"
            if (r6 == 0) goto L_0x009c
            java.lang.String r2 = X.DbT.A11(r5, r4)
            java.lang.String r1 = ", "
            java.lang.String r0 = "address-line2"
            java.lang.String r0 = X.DbT.A11(r0, r4)
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.util.Map r0 = r3.A00
            r0.put(r5, r1)
        L_0x009c:
            java.lang.String r6 = "street-address"
            boolean r0 = r7.contains(r6)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = X.DbT.A11(r5, r4)
            if (r0 == 0) goto L_0x00c2
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00c2
            java.util.Map r2 = r3.A00
            java.lang.String r1 = X.DbT.A11(r5, r2)
            if (r1 == 0) goto L_0x00c2
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00c2
            r2.put(r6, r1)
        L_0x00c2:
            java.lang.String r0 = X.DbT.A11(r5, r4)
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00eb
        L_0x00ce:
            java.lang.String r0 = X.DbT.A11(r6, r4)
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00eb
            java.util.Map r2 = r3.A00
            java.lang.String r1 = X.DbT.A11(r6, r2)
            if (r1 == 0) goto L_0x00eb
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00eb
            r2.put(r5, r1)
        L_0x00eb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S8K.A01(X.1yd, com.facebook.browser.lite.extensions.autofill.model.AutofillData, java.util.LinkedHashSet, boolean):com.facebook.browser.lite.extensions.autofill.model.AutofillData");
    }
}
