package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.9zp  reason: invalid class name and case insensitive filesystem */
public abstract class C395479zp {
    public static C66081jF parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C66081jF r1 = new C66081jF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A02 = parseFromJson;
                } else if ("sticker_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r1.A04 = str;
                } else if (AnonymousClass000.A00(1842).equals(A17)) {
                    ExtendedImageUrl parseFromJson2 = 16W.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r1.A03 = parseFromJson2;
                } else if ("replied_to_message".equals(A17)) {
                    r1.A01 = C254933tI.A00(r4);
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
