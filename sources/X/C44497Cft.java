package X;

import java.io.IOException;

/* renamed from: X.Cft  reason: case insensitive filesystem */
public abstract class C44497Cft {
    public static C42106BHj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C42107BHk bHk = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            AnonymousClass3IJ r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("question_list".equals(A17)) {
                    bHk = D08.parseFromJson(r4);
                } else if ("simple_action".equals(A17)) {
                    r3 = D20.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C42106BHj(bHk, r3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
