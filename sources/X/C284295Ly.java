package X;

import java.io.IOException;

/* renamed from: X.5Ly  reason: invalid class name and case insensitive filesystem */
public abstract class C284295Ly {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5Lz, java.lang.Object] */
    public static C284305Lz parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("l".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A01 = str;
                } else if ("ui".equals(A0q)) {
                    obj.A00 = Long.valueOf(r4.A0y());
                } else if ("pjid".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A07 = str;
                } else if ("nid".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A02 = str;
                } else if ("tid".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A08 = str;
                } else if ("hcs".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A04 = str;
                } else if ("hek".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A05 = str;
                } else if ("hki".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A06 = str;
                } else if ("ca".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A03 = str;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C284305Lz r4) {
        r3.A0c();
        String str = r4.A01;
        if (str != null) {
            r3.A0R("l", str);
        }
        Long l = r4.A00;
        if (l != null) {
            r3.A0Q("ui", l.longValue());
        }
        String str2 = r4.A07;
        if (str2 != null) {
            r3.A0R("pjid", str2);
        }
        String str3 = r4.A02;
        if (str3 != null) {
            r3.A0R("nid", str3);
        }
        String str4 = r4.A08;
        if (str4 != null) {
            r3.A0R("tid", str4);
        }
        String str5 = r4.A04;
        if (str5 != null) {
            r3.A0R("hcs", str5);
        }
        String str6 = r4.A05;
        if (str6 != null) {
            r3.A0R("hek", str6);
        }
        String str7 = r4.A06;
        if (str7 != null) {
            r3.A0R("hki", str7);
        }
        String str8 = r4.A03;
        if (str8 != null) {
            r3.A0R("ca", str8);
        }
        r3.A0Z();
    }
}
