package X;

import java.io.IOException;

public abstract class CpK {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cv5, java.lang.Object] */
    public static C45363Cv5 parseFromJson(16F r7) {
        Integer num;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                if (C41846B3n.A1Y(r7, A0q)) {
                    obj.A02 = AnonymousClass7TG.A0l(r7);
                } else if (C41845B3m.A1C(A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r7);
                    Integer[] A00 = AnonymousClass05K.A00(7);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            num = null;
                            break;
                        }
                        num = A00[i];
                        if (0qQ.A0K(C18269Voj.A00(num), A0l)) {
                            break;
                        }
                        i++;
                    }
                    obj.A01 = num;
                } else if ("content".equals(A0q)) {
                    obj.A00 = C45041CpJ.parseFromJson(r7);
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
