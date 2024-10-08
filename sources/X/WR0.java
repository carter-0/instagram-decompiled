package X;

import java.io.IOException;

public final class WR0 implements AnonymousClass1FD {
    public static final WR0 A00 = new WR0();

    public final /* bridge */ /* synthetic */ Object invoke(16F r4) {
        0qQ.A0B(r4, 0);
        C53368Gms gms = new C53368Gms(22);
        if (r4.A11() != 16L.A0D) {
            throw new IOException("JSON string for GradientColor should start with a left brace");
        }
        while (r4.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r4);
            if (A17 != null) {
                if (A17.equals("top_color")) {
                    gms.A01 = r4.A1D();
                } else if (A17.equals("bottom_color")) {
                    gms.A00 = r4.A1D();
                } else {
                    0KC.A0C("GradientColorJsonHelper", C13988Tno.A0g(A17));
                }
                r4.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return gms;
    }
}
