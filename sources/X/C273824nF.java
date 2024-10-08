package X;

import java.io.IOException;

/* renamed from: X.4nF  reason: invalid class name and case insensitive filesystem */
public abstract class C273824nF {
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.4nG] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.4nJ, java.lang.Object] */
    public static C273834nG parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("progressive".equals(A0q)) {
                    obj.A01 = C273844nH.parseFromJson(r7);
                } else if ("segmented".equals(A0q)) {
                    obj.A02 = C63371Kvs.parseFromJson(r7);
                } else if ("armadillo_express".equals(A0q)) {
                    obj.A00 = C9838RiA.parseFromJson(r7);
                }
                r7.A0z();
            }
            C273864nJ[] r3 = {obj.A01, obj.A02, obj.A00};
            int i = 0;
            int i2 = 0;
            do {
                if (r3[i] != null) {
                    i2++;
                }
                i++;
            } while (i < 3);
            if (i2 == 1) {
                return obj;
            }
            C273834nG.A00(new Object(), obj);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
