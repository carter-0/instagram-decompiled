package X;

import java.io.IOException;

/* renamed from: X.O0g  reason: case insensitive filesystem */
public abstract class C70276O0g {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.O8z, java.lang.Object] */
    public static C70500O8z parseFromJson(16F r7) {
        String str;
        String str2;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("image_url".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                    obj.A00 = str2;
                } else if ("image_type".equals(A17)) {
                    String A1Q = r7.A1Q();
                    0qQ.A0B(A1Q, 0);
                    Integer[] A00 = AnonymousClass05K.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (i < length) {
                        if (1 - A00[i].intValue() != 0) {
                            str = "circle";
                        } else {
                            str = "square";
                        }
                        if (!str.equals(A1Q)) {
                            i++;
                        }
                    }
                    throw AnonymousClass7TE.A0y();
                } else {
                    continue;
                }
                r7.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
