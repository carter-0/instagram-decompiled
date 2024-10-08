package X;

import java.io.IOException;

/* renamed from: X.D0i  reason: case insensitive filesystem */
public final class C45658D0i {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.5u5, X.CGr] */
    public static C43877CGr parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? r2 = new C298815u5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("original_media_id".equals(A17)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                } else if ("formatted_mashups_count".equals(A17)) {
                    r2.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    AnonymousClass93W.A00(r4, r2, A17);
                }
                r4.A0z();
            }
            r2.A01();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
