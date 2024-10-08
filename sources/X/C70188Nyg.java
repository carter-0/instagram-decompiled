package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.IOException;

/* renamed from: X.Nyg  reason: case insensitive filesystem */
public abstract class C70188Nyg {
    public static 1fV parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            1fV r1 = new 1fV();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("animated_media".equals(A17)) {
                    DirectAnimatedMedia parseFromJson = C70893OQl.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A03 = parseFromJson;
                } else if (AnonymousClass000.A00(1674).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r1.A04 = str;
                } else if ("replied_to_message".equals(A17)) {
                    r1.A01 = C254933tI.A00(r4);
                } else if ("pending_media".equals(A17)) {
                    r1.A02 = LJH.parseFromJson(r4);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A00 = C49753F5e.parseFromJson(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
