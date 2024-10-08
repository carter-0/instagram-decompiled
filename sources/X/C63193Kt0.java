package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Kt0  reason: case insensitive filesystem */
public abstract class C63193Kt0 {
    public static LN5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            LN5 ln5 = new LN5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(617).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    ln5.A01 = A0l;
                } else if ("prompt".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    ln5.A02 = A0l2;
                } else if ("recipe_caption".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    ln5.A03 = A0l3;
                } else if ("background_color".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    ln5.A00 = A0l4;
                } else if ("sticker_style_str".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    ln5.A06 = A0l5;
                } else if (AnonymousClass000.A00(817).equals(A17)) {
                    String A0l6 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l6, 0);
                    ln5.A08 = A0l6;
                } else if ("topic".equals(A17)) {
                    String A0l7 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l7, 0);
                    ln5.A07 = A0l7;
                } else if (TraceFieldType.RequestID.equals(A17)) {
                    String A0l8 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l8, 0);
                    ln5.A04 = A0l8;
                } else if ("response_id".equals(A17)) {
                    String A0l9 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l9, 0);
                    ln5.A05 = A0l9;
                }
                r4.A0z();
            }
            return ln5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
