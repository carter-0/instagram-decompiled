package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VC1 {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VZT, java.lang.Object] */
    public static VZT parseFromJson(16F r4) {
        Integer num;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1E(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("qid".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1C(A17)) {
                    String A1Q = r4.A1Q();
                    if ("single".equals(A1Q)) {
                        num = AnonymousClass05K.A00;
                    } else if ("multiple".equals(A1Q)) {
                        num = AnonymousClass05K.A01;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                    obj.A01 = num;
                } else if (AnonymousClass000.A00(807).equals(A17)) {
                    obj.A00 = r4.A1D();
                } else if ("answers".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VY0 parseFromJson = VC0.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
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
