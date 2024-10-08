package X;

import java.io.IOException;

/* renamed from: X.Chj  reason: case insensitive filesystem */
public abstract class C44611Chj {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cue, java.lang.Object] */
    public static C45336Cue parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("headline".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("content".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("button_text".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
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
