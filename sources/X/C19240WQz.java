package X;

import java.io.IOException;

/* renamed from: X.WQz  reason: case insensitive filesystem */
public final class C19240WQz implements AnonymousClass1FD {
    public static final C19240WQz A00 = new C19240WQz();

    public final /* bridge */ /* synthetic */ Object invoke(16F r5) {
        0qQ.A0B(r5, 0);
        C53355Gmf gmf = new C53355Gmf(1);
        if (r5.A11() != 16L.A0D) {
            throw new IOException("JSON string for FaceCenter should start with a left brace");
        }
        while (r5.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r5);
            if (A17 != null) {
                int hashCode = A17.hashCode();
                if (hashCode == 120) {
                    if (A17.equals("x")) {
                        gmf.A01 = (float) r5.A0U();
                    }
                    0KC.A0C("FaceCenterJsonHelper", C13988Tno.A0g(A17));
                } else if (hashCode != 121) {
                    if (hashCode == 829251210 && A17.equals("confidence")) {
                        gmf.A00 = (float) r5.A0U();
                    }
                    0KC.A0C("FaceCenterJsonHelper", C13988Tno.A0g(A17));
                } else {
                    if (A17.equals("y")) {
                        gmf.A02 = (float) r5.A0U();
                    }
                    0KC.A0C("FaceCenterJsonHelper", C13988Tno.A0g(A17));
                }
                r5.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return gmf;
    }
}
