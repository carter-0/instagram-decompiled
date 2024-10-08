package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.9zo  reason: invalid class name and case insensitive filesystem */
public abstract class C395469zo {
    public static C66071jB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66071jB r1 = new C66071jB();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A03 = parseFromJson;
                } else if (AnonymousClass000.A00(5157).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A04 = A0l;
                } else if ("sticker_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A05 = A0l2;
                } else if (AnonymousClass000.A00(1842).equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r4);
                    0qQ.A0B(A00, 0);
                    r1.A01 = A00;
                } else if ("replied_to_message".equals(A17)) {
                    r1.A02 = C254933tI.A00(r4);
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
