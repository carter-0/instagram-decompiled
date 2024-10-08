package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.9zx  reason: invalid class name and case insensitive filesystem */
public abstract class C395559zx {
    public static C65511d5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65511d5 r1 = new C65511d5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(2742).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A01 = A0l;
                } else if ("whatsapp_display_number".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A03 = A0l2;
                } else if (AnonymousClass000.A00(40).equals(A17)) {
                    ExtendedImageUrl parseFromJson = 16W.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A00 = parseFromJson;
                } else if ("cta_title".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A02 = A0l3;
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
