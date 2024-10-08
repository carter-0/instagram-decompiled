package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.54i  reason: invalid class name and case insensitive filesystem */
public abstract class C2808254i {
    public static C2808354j parseFromJson(16F r7) {
        String A1P;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("adCategory".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("cta_text".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("label".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("options".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            if (!(r7.A11() == 16L.A0G || (A1P = r7.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r7.A0z();
            }
            return new C2808354j(str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C2808354j r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R("adCategory", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r2.A0R("cta_text", str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            r2.A0R("label", str3);
        }
        List<String> list = r3.A03;
        if (list != null) {
            16P.A03(r2, "options");
            for (String str4 : list) {
                if (str4 != null) {
                    r2.A0t(str4);
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
