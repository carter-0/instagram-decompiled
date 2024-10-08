package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cob  reason: case insensitive filesystem */
public abstract class C44998Cob {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.A5e, java.lang.Object] */
    public static C39688A5e parseFromJson(16F r4) {
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
                if ("prompt".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("suggestions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    obj.A01 = arrayList;
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
