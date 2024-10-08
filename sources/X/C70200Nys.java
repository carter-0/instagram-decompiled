package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nys  reason: case insensitive filesystem */
public abstract class C70200Nys {
    public static C66481nR parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C66481nR r0 = new C66481nR();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("folder_sequence".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                } else {
                    C66670Mad.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
