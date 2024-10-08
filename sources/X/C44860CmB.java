package X;

import java.io.IOException;

/* renamed from: X.CmB  reason: case insensitive filesystem */
public abstract class C44860CmB {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cuw, java.lang.Object] */
    public static C45354Cuw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("media_or_ad".equals(A17)) {
                    obj.A01 = 1Xj.A00(r3);
                } else if (AnonymousClass000.A00(3140).equals(A17)) {
                    obj.A02 = C44859CmA.parseFromJson(r3);
                } else if ("explore_story".equals(A17)) {
                    obj.A00 = C251833nk.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
