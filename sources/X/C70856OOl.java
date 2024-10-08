package X;

import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteButtonAction;
import java.io.IOException;

/* renamed from: X.OOl  reason: case insensitive filesystem */
public final class C70856OOl {
    public static NHR parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(1074).equals(A17)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                } else if (AnonymousClass000.A00(195).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A06 = A0l;
                } else if ("media_product_type".equals(A17)) {
                    InstagramMediaProductType valueOf = InstagramMediaProductType.valueOf(r4.A1Q());
                    0qQ.A0B(valueOf, 0);
                    r1.A00 = valueOf;
                } else if (AnonymousClass000.A00(1782).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A05 = A0l2;
                } else if (C273654mx.A00(143).equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A04 = A0l3;
                } else if ("display_body".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    r1.A03 = A0l4;
                } else if ("primary_action".equals(A17)) {
                    PromoteButtonAction parseFromJson = C69816Nsd.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A01 = parseFromJson;
                } else if ("secondary_action".equals(A17)) {
                    r1.A02 = C69816Nsd.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r1, A17);
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
