package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OeO  reason: case insensitive filesystem */
public abstract class C71152OeO {
    public static final C254873tC A03(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, Integer num, Integer num2, String str, String str2, String str3, String str4, int i) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, extendedImageUrl, extendedImageUrl2, extendedImageUrl3, bool, bool, (Boolean) null, (Integer) null, num, num2, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, (String) null, str2, str3, (String) null, (String) null, str4, (String) null, (String) null, (List) null, (List) null, i, 0, 0, false);
    }

    public static final C254873tC A04(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, Integer num, String str, String str2, String str3, String str4, List list, int i, int i2) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, extendedImageUrl, extendedImageUrl2, extendedImageUrl3, bool, bool, (Boolean) null, (Integer) null, num, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, (String) null, str2, str3, (String) null, (String) null, str4, (String) null, (String) null, (List) null, list, i, i2, 0, false);
    }

    public static final C254873tC A05(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, String str, String str2, String str3, String str4, int i, int i2) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, extendedImageUrl, extendedImageUrl2, extendedImageUrl3, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, (String) null, str2, str3, (String) null, (String) null, str4, (String) null, (String) null, (List) null, (List) null, i, i2, 0, false);
    }

    public static final C254873tC A06(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2, boolean z) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool2 = Boolean.FALSE;
        return A02(r0, extendedImageUrl, extendedImageUrl2, (ExtendedImageUrl) null, bool2, bool2, bool, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, l, str, str2, (String) null, str3, str4, str5, str6, str7, (String) null, (String) null, (List) null, list, i, i2, 0, z);
    }

    public static final C254873tC A0A(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, extendedImageUrl, extendedImageUrl2, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, str2, str3, (String) null, str4, (String) null, str5, (String) null, (String) null, (List) null, (List) null, i, i2, 0, false);
    }

    public static final C254873tC A0C(ExtendedImageUrl extendedImageUrl, String str, int i) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, extendedImageUrl, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (List) null, (List) null, i, 0, 0, false);
    }

    public static final C254873tC A0F(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3) {
        return A0A(extendedImageUrl, (ExtendedImageUrl) null, str, str2, (String) null, str3, (String) null, 0, 0);
    }

    public static final C254873tC A0H(Long l, String str, String str2, String str3) {
        String str4 = str2;
        0qQ.A0B(str4, 2);
        List A1I = AnonymousClass7TE.A1I(new AnonymousClass9JN(str4, "web_url", (String) null));
        return A02(C254883tD.SINGLE, (ExtendedImageUrl) null, (ExtendedImageUrl) null, (ExtendedImageUrl) null, false, (Boolean) null, (Boolean) null, 1, (Integer) null, (Integer) null, 0, (Integer) null, (Integer) null, C51972G9s.A0i(str3), l, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, A1I, 8, 0, 0, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6.length() == 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C254873tC A0K(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = 1
            if (r6 == 0) goto L_0x000a
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            java.lang.String r1 = ""
            com.instagram.model.mediasize.ExtendedImageUrl r3 = new com.instagram.model.mediasize.ExtendedImageUrl
            if (r0 == 0) goto L_0x0047
            r3.<init>(r1, r2, r2)
        L_0x0014:
            if (r7 == 0) goto L_0x001c
            int r0 = r7.length()
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r7 = r1
        L_0x001d:
            if (r8 == 0) goto L_0x0025
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r8 = r1
        L_0x0026:
            if (r4 == 0) goto L_0x0042
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0042
            java.util.Locale r2 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "https://www.instagram.com/_n/product_display_page?business_user_id=%s&merchant_name=shop&product_id=%s&entry_point=direct_hscroll_xma"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            X.0qQ.A07(r1)
        L_0x0042:
            X.3tC r0 = A0E(r3, r7, r8, r1)
            return r0
        L_0x0047:
            r3.<init>(r6, r2, r2)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71152OeO.A0K(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):X.3tC");
    }

    public static final C254873tC A0L(String str, String str2, String str3, String str4, List list) {
        ExtendedImageUrl extendedImageUrl;
        String str5 = str4;
        if (str4 == null) {
            extendedImageUrl = null;
        } else {
            extendedImageUrl = new ExtendedImageUrl(str5, -1, -1);
        }
        C254873tC A02 = A02(C254883tD.GRID_VIEW_3X2, extendedImageUrl, (ExtendedImageUrl) null, (ExtendedImageUrl) null, false, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, str, str2, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                String str6 = (String) next;
                if (!(str6 == null || str6.length() == 0)) {
                    A1C.add(next);
                }
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                A0r.add(new ExtendedImageUrl(AnonymousClass7TE.A18(it), -1, -1));
            }
            if (A0r.size() == 6) {
                A02.A1d = A0r;
            }
        }
        return A02;
    }

    public static final C254873tC A00() {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, (ExtendedImageUrl) null, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A07(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, extendedImageUrl, extendedImageUrl2, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A08(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2, String str3) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, extendedImageUrl, extendedImageUrl2, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, str, str2, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A09(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2, String str3, String str4, String str5) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, extendedImageUrl, extendedImageUrl2, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, str2, str3, str4, (String) null, (String) null, str5, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A0B(ExtendedImageUrl extendedImageUrl, String str) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.TRUE;
        return A02(r0, (ExtendedImageUrl) null, extendedImageUrl, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A0D(ExtendedImageUrl extendedImageUrl, String str, String str2) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, (ExtendedImageUrl) null, extendedImageUrl, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A0E(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, extendedImageUrl, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, str, str2, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A0G(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, String str4) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, extendedImageUrl, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, (String) null, str2, str3, (String) null, (String) null, str4, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A0I(String str, String str2, String str3) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, (ExtendedImageUrl) null, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, str, str2, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A0J(String str, String str2, String str3) {
        C254883tD r0 = C254883tD.SINGLE;
        Boolean bool = Boolean.FALSE;
        return A02(r0, (ExtendedImageUrl) null, (ExtendedImageUrl) null, (ExtendedImageUrl) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, str, str2, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, 0, 0, 0, false);
    }

    public static final C254873tC A01() {
        return A00();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3tC, java.lang.Object] */
    public static final C254873tC A02(C254883tD r5, ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i, int i2, int i3, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        ? obj = new Object();
        obj.A0Q = C254883tD.SINGLE;
        obj.A08 = 0;
        obj.A09 = 0;
        obj.A1i = false;
        obj.A1e = false;
        obj.A1f = false;
        obj.A0C = 0;
        obj.A02 = i;
        obj.A0U = extendedImageUrl;
        if (num != null) {
            obj.A00 = num.intValue();
        }
        obj.A11 = str2;
        obj.A10 = str3;
        obj.A0X = extendedImageUrl2;
        obj.A08 = i2;
        obj.A09 = i3;
        obj.A0T = extendedImageUrl3;
        obj.A1N = str4;
        if (num2 != null) {
            obj.A07 = num2.intValue();
        }
        obj.A1L = str5;
        if (num3 != null) {
            obj.A06 = num3.intValue();
        }
        obj.A0t = str6;
        obj.A1F = str7;
        obj.A0l = null;
        obj.A0k = null;
        obj.A0u = str8;
        obj.A0e = bool;
        obj.A0b = bool2;
        obj.A0c = valueOf;
        obj.A1d = null;
        obj.A0Q = r5;
        if (num4 != null) {
            obj.A01 = num4.intValue();
        }
        obj.A1V = list;
        obj.A0m = l;
        obj.A1U = list2;
        obj.A1G = null;
        obj.A1H = null;
        obj.A1I = null;
        obj.A1J = null;
        obj.A0Y = null;
        if (bool3 != null) {
            obj.A1g = bool3.booleanValue();
        }
        obj.A0f = num6;
        obj.A1E = str9;
        obj.A0g = num5;
        obj.A0h = null;
        obj.A1D = str10;
        obj.A0n = l2;
        obj.A0s = str;
        return obj;
    }
}
