package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cjs  reason: case insensitive filesystem */
public abstract class C44724Cjs {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.CsT, java.lang.Object] */
    public static C45215CsT parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("list".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r4);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (arrayList != null) {
                obj.A00 = arrayList;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
