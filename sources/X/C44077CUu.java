package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CUu  reason: case insensitive filesystem */
public abstract class C44077CUu {
    public static BDu parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C258213ye r3 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("liker_user_ids".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("recommender_info".equals(A17)) {
                    r3 = C258173ya.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new BDu(r3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
