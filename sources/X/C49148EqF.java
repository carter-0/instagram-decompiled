package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EqF  reason: case insensitive filesystem */
public abstract class C49148EqF {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ex0, java.lang.Object] */
    public static C49521Ex0 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("sections".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C49523Ex2 parseFromJson = C49151EqI.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("policy_link".equals(A17)) {
                    obj.A00 = C49149EqG.parseFromJson(r4);
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
