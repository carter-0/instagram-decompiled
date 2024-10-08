package X;

import java.io.IOException;

/* renamed from: X.Nyj  reason: case insensitive filesystem */
public abstract class C70191Nyj {
    public static C65691fy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65691fy r0 = new C65691fy();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("direct_voice_media".equals(A17)) {
                    r0.A01 = C2609847u.parseFromJson(r3);
                } else if ("replied_to_message".equals(A17)) {
                    r0.A00 = C254933tI.A00(r3);
                } else {
                    C66893Meb.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
