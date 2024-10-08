package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Ep9 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Vir, java.lang.Object] */
    public static C17958Vir parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("sublist".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r4);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    }
                    obj.A00 = arrayList;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
