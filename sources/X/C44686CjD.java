package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CjD  reason: case insensitive filesystem */
public abstract class C44686CjD {
    public static C45281Ctk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45281Ctk ctk = new C45281Ctk();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("senders".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    ctk.A01 = arrayList;
                } else if (C41845B3m.A1D(A17)) {
                    ctk.A00 = 1Xj.A00(r5);
                }
                r5.A0z();
            }
            return ctk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
