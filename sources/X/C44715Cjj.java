package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Cjj  reason: case insensitive filesystem */
public abstract class C44715Cjj {
    public static AnonymousClass1fN parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1fN r1 = new AnonymousClass1fN();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("creator_igid".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A02 = A0l;
                } else if ("profile_pic_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r4);
                    0qQ.A0B(A00, 0);
                    r1.A01 = A00;
                } else if ("crown_icon".equals(A17)) {
                    SimpleImageUrl A002 = 16h.A00(r4);
                    0qQ.A0B(A002, 0);
                    r1.A00 = A002;
                } else if ("header_text".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A05 = A0l2;
                } else if (AnonymousClass000.A00(1408).equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A04 = A0l3;
                } else if ("cta_text".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    r1.A03 = A0l4;
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
