package X;

import java.io.IOException;

/* renamed from: X.CpC  reason: case insensitive filesystem */
public abstract class C45034CpC {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cv4, java.lang.Object] */
    public static C45362Cv4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("permission".equals(A17)) {
                    obj.A00 = O1I.parseFromJson(r3);
                } else if ("megaphone_content".equals(A17)) {
                    obj.A02 = C45033CpB.parseFromJson(r3);
                } else if ("age_prompt_content".equals(A17)) {
                    obj.A01 = C45032CpA.parseFromJson(r3);
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
