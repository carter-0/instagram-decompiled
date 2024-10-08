package X;

import android.graphics.Paint;
import android.os.Build;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.7fS  reason: invalid class name and case insensitive filesystem */
public final class C336957fS {
    public static final C317486nL A01(String str) {
        0qQ.A0B(str, 0);
        return new C317486nL(str, -1);
    }

    public final SimpleImageUrl A04(String str) {
        0qQ.A0B(str, 0);
        return A00(A02(str), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C317486nL A05(com.instagram.common.session.UserSession r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 1
            X.0qQ.A0B(r4, r0)
            if (r5 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0022
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324727021(0x81061c000312ed, double:3.030348513511043E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0041
            X.AIS r0 = X.AIS.A00
            X.6nL r0 = r0.A02(r5)
            return r0
        L_0x0022:
            r0 = 32
            if (r1 >= r0) goto L_0x0041
            r0 = 31
            if (r1 >= r0) goto L_0x0053
            r0 = 30
            if (r1 >= r0) goto L_0x0065
            r0 = 29
            if (r1 >= r0) goto L_0x0077
            X.0eM r0 = X.C336997fW.A00
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r5)
            X.6nL r0 = (X.C317486nL) r0
            return r0
        L_0x0041:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324661484(0x81061c000212ec, double:3.030348513469597E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0053
            X.6nL r0 = X.AGi.A00(r5)
            return r0
        L_0x0053:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324595947(0x81061c000112eb, double:3.030348513428151E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0065
            X.6nL r0 = X.AGh.A00(r5)
            return r0
        L_0x0065:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324530410(0x81061c000012ea, double:3.030348513386705E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0077
            X.6nL r0 = X.AGg.A00(r5)
            return r0
        L_0x0077:
            X.6nL r0 = X.C336967fT.A00(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336957fS.A05(com.instagram.common.session.UserSession, java.lang.String):X.6nL");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A06(com.instagram.common.session.UserSession r9) {
        /*
            r8 = this;
            r3 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x006e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324727021(0x81061c000312ed, double:3.030348513511043E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0081
            X.AzZ r7 = X.C41744AzZ.A00
        L_0x0016:
            X.0sP r7 = (X.0sP) r7
            X.0qQ.A0B(r7, r3)
            X.0eM r0 = X.SS1.A01
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0032:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r5.next()
            X.OCr r0 = (X.C70594OCr) r0
            X.RFj r4 = r0.A00
            java.util.List r0 = r0.A01
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x004b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r7.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            r3.add(r1)
            goto L_0x004b
        L_0x0065:
            X.OCr r0 = new X.OCr
            r0.<init>(r4, r3)
            r6.add(r0)
            goto L_0x0032
        L_0x006e:
            r0 = 32
            if (r1 >= r0) goto L_0x0081
            r0 = 31
            if (r1 >= r0) goto L_0x0091
            r0 = 30
            if (r1 >= r0) goto L_0x00a2
            r0 = 29
            if (r1 >= r0) goto L_0x00b3
            X.Aze r7 = X.C41749Aze.A00
            goto L_0x0016
        L_0x0081:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324661484(0x81061c000212ec, double:3.030348513469597E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0091
            X.Aza r7 = X.C41745Aza.A00
            goto L_0x0016
        L_0x0091:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324595947(0x81061c000112eb, double:3.030348513428151E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00a2
            X.Azb r7 = X.C41746Azb.A00
            goto L_0x0016
        L_0x00a2:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324530410(0x81061c000012ea, double:3.030348513386705E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00b3
            X.Azc r7 = X.C41747Azc.A00
            goto L_0x0016
        L_0x00b3:
            X.Azd r7 = X.C41748Azd.A00
            goto L_0x0016
        L_0x00b7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336957fS.A06(com.instagram.common.session.UserSession):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C317486nL[] A07(com.instagram.common.session.UserSession r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x001c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324727021(0x81061c000312ed, double:3.030348513511043E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0035
            X.6nL[] r0 = X.AIS.A01()
            return r0
        L_0x001c:
            r0 = 32
            if (r1 >= r0) goto L_0x0035
            r0 = 31
            if (r1 >= r0) goto L_0x0047
            r0 = 30
            if (r1 >= r0) goto L_0x0059
            r0 = 29
            if (r1 >= r0) goto L_0x006b
            X.0eM r0 = X.C336997fW.A01
            java.lang.Object r0 = r0.getValue()
            X.6nL[] r0 = (X.C317486nL[]) r0
            return r0
        L_0x0035:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324661484(0x81061c000212ec, double:3.030348513469597E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0047
            X.6nL[] r0 = X.AGi.A01()
            return r0
        L_0x0047:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324595947(0x81061c000112eb, double:3.030348513428151E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0059
            X.6nL[] r0 = X.AGh.A01()
            return r0
        L_0x0059:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316989324530410(0x81061c000012ea, double:3.030348513386705E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x006b
            X.6nL[] r0 = X.AGg.A01()
            return r0
        L_0x006b:
            X.6nL[] r0 = X.C336967fT.A02()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336957fS.A07(com.instagram.common.session.UserSession):X.6nL[]");
    }

    public static final SimpleImageUrl A00(String str, String str2) {
        return new SimpleImageUrl(002.A0u("emoji:/", 002.A0b(str, "-api", Build.VERSION.SDK_INT), "//", str2));
    }

    public static final String A02(String str) {
        0l2 r6 = C317486nL.A03;
        StringBuilder sb = (StringBuilder) r6.A7A();
        if (sb == null) {
            sb = new StringBuilder();
        }
        try {
            sb.setLength(0);
            sb.append("emoji");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                sb.append("-u");
                sb.append(Integer.toHexString(charAt));
            }
            String obj = sb.toString();
            0qQ.A07(obj);
            return obj;
        } finally {
            sb.setLength(0);
            r6.ECR(sb);
        }
    }

    public static final boolean A03(String str) {
        if (!0mp.A0D(str) || !new Paint().hasGlyph(str)) {
            return false;
        }
        return true;
    }
}
