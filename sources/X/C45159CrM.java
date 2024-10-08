package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CrM  reason: case insensitive filesystem */
public abstract class C45159CrM {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CuR, java.lang.Object] */
    public static C45323CuR parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("quiet_time_intervals_for_enforcement".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C47214Dt1 parseFromJson = C48348Ed5.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if (AnonymousClass000.A00(4963).equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0S(r4);
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
