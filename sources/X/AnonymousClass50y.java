package X;

import java.io.IOException;

/* renamed from: X.50y  reason: invalid class name */
public abstract class AnonymousClass50y {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.50z, java.lang.Object] */
    public static C2802650z parseFromJson(16F r8) {
        Integer num;
        String str;
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
                if ("span_start".equals(A0q)) {
                    obj.A02 = r8.A1D();
                } else if ("span_end".equals(A0q)) {
                    obj.A00 = r8.A1D();
                } else if ("span_flags".equals(A0q)) {
                    obj.A01 = r8.A1D();
                } else if ("metadata_model".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A04 = str;
                } else if ("metadata_model_type".equals(A0q)) {
                    String A1Q = r8.A1Q();
                    Integer[] A00 = AnonymousClass05K.A00(24);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = null;
                            break;
                        }
                        num = A00[i];
                        if (0qQ.A0K(AnonymousClass510.A00(num), A1Q)) {
                            break;
                        }
                        i++;
                    }
                    0qQ.A0B(num, 0);
                    obj.A03 = num;
                }
                r8.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
