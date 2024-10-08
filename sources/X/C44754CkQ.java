package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CkQ  reason: case insensitive filesystem */
public abstract class C44754CkQ {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Cwj] */
    public static C45452Cwj parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("pk".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A01 = A0l;
                } else if (C41845B3m.A1B(A17)) {
                    User A0a = C41845B3m.A0a(r5, false);
                    0qQ.A0B(A0a, 0);
                    obj.A00 = A0a;
                } else if ("image_urls".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1B(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    obj.A02 = arrayList;
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
