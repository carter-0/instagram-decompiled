package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VIF {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.WUe] */
    public static C19322WUe parseFromJson(16F r5) {
        Integer num;
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (AnonymousClass000.A00(619).equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r5);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    obj.A01 = arrayList;
                } else if ("text_alignment".equals(A17)) {
                    String A1Q = r5.A1Q();
                    if (A1Q.equals("LEFT")) {
                        num = AnonymousClass05K.A00;
                    } else if (A1Q.equals("CENTER")) {
                        num = AnonymousClass05K.A01;
                    } else if (A1Q.equals("RIGHT")) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        throw new IllegalArgumentException(A1Q);
                    }
                    0qQ.A0B(num, 0);
                    obj.A00 = num;
                } else {
                    continue;
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
