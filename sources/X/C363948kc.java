package X;

import java.io.IOException;

/* renamed from: X.8kc  reason: invalid class name and case insensitive filesystem */
public abstract class C363948kc {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.8ka, java.lang.Object] */
    public static C363928ka parseFromJson(16F r8) {
        String str;
        C365758nd r1;
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("media_type".equals(A0q)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    C365758nd[] values = C365758nd.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r1 = C365758nd.A06;
                            break;
                        }
                        r1 = values[i];
                        if (0qQ.A0K(r1.A01, A1Q)) {
                            break;
                        }
                        i++;
                    }
                    obj.A02 = r1;
                } else if ("media_json".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    obj.A05 = str;
                } else if ("recovery_count".equals(A0q)) {
                    obj.A00 = r8.A1D();
                } else if ("date_taken".equals(A0q)) {
                    obj.A01 = r8.A0y();
                }
                r8.A0z();
            }
            try {
                int ordinal = obj.A02.ordinal();
                if (ordinal == 0) {
                    String str2 = obj.A05;
                    str2.getClass();
                    obj.A03 = C363938kb.parseFromJson(16P.A00(str2));
                    return obj;
                } else if (ordinal != 1) {
                    return obj;
                } else {
                    String str3 = obj.A05;
                    str3.getClass();
                    obj.A04 = C369998vf.parseFromJson(16P.A00(str3));
                    return obj;
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse media in postprocess. mMediaType: ");
                sb.append(obj.A02);
                C363928ka.A00(e, sb.toString());
                return obj;
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }

    public static void A00(17Z r3, C363928ka r4) {
        r3.A0c();
        C365758nd r0 = r4.A02;
        if (r0 != null) {
            r3.A0R("media_type", r0.A01);
        }
        String str = r4.A05;
        if (str != null) {
            r3.A0R("media_json", str);
        }
        r3.A0P("recovery_count", r4.A00);
        r3.A0Q("date_taken", r4.A01);
        r3.A0Z();
    }
}
