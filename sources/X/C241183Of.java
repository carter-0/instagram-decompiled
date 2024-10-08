package X;

import java.io.IOException;

/* renamed from: X.3Of  reason: invalid class name and case insensitive filesystem */
public abstract class C241183Of {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.3Og, java.lang.Object] */
    public static C241193Og parseFromJson(16F r4) {
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
                if ("explore".equals(A0q)) {
                    C241213Oi parseFromJson = C241203Oh.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A01 = parseFromJson;
                } else if ("clips".equals(A0q)) {
                    C241213Oi parseFromJson2 = C241203Oh.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    obj.A00 = parseFromJson2;
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
}
