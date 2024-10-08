package X;

import java.io.IOException;

/* renamed from: X.5op  reason: invalid class name and case insensitive filesystem */
public abstract class C295735op {
    public static C295745oq parseFromJson(16F r8) {
        C295755or r2;
        0qQ.A0B(r8, 0);
        try {
            C295745oq r0 = new C295745oq();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("layout_content".equals(A0q)) {
                    r0.A01 = C295765os.parseFromJson(r8);
                } else if ("explore_item_info".equals(A0q)) {
                    r0.A00 = C293725lF.parseFromJson(r8);
                } else if ("layout_type".equals(A0q)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    C295755or[] values = C295755or.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r2 = C295755or.INVALID;
                            break;
                        }
                        r2 = values[i];
                        if (0qQ.A0K(r2.A00, A1Q)) {
                            break;
                        }
                        i++;
                    }
                    r0.A02 = r2;
                }
                r8.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
