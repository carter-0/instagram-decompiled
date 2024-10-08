package X;

import java.io.IOException;

/* renamed from: X.HZg  reason: case insensitive filesystem */
public abstract class C54950HZg {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.HnA] */
    public static C55775HnA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("note_id".equals(A17)) {
                    obj.A00 = r5.A0y();
                } else if (AnonymousClass000.A00(1620).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A02 = A0l;
                } else if ("note_text".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A01 = 16W.parseFromJson(r5);
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
