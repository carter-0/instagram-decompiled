package X;

import java.io.IOException;

/* renamed from: X.4we  reason: invalid class name and case insensitive filesystem */
public abstract class C278294we {
    /* JADX WARNING: type inference failed for: r1v3, types: [X.4wf, java.lang.Object] */
    public static C278304wf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("start".equals(A0q)) {
                    num = Integer.valueOf(r4.A1D());
                } else if ("end".equals(A0q)) {
                    num2 = Integer.valueOf(r4.A1D());
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (num != null) {
                obj.A01 = num.intValue();
            }
            if (num2 == null) {
                return obj;
            }
            obj.A00 = num2.intValue();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
