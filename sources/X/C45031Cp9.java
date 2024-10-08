package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cp9  reason: case insensitive filesystem */
public abstract class C45031Cp9 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ct5, java.lang.Object] */
    public static Ct5 parseFromJson(16F r4) {
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
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("is_expanded".equals(A17)) {
                    r4.A0d();
                } else if ("destination".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("sections".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45406Cvm parseFromJson = C45053CpW.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
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
