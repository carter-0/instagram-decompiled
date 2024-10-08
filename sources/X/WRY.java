package X;

import java.io.IOException;

public final class WRY implements AnonymousClass1FD {
    public static final WRY A00 = new WRY();

    public final /* bridge */ /* synthetic */ Object invoke(16F r4) {
        String A1P;
        String A1P2;
        0qQ.A0B(r4, 0);
        C15050ULg uLg = new C15050ULg(11);
        if (r4.A11() != 16L.A0D) {
            throw new IOException("JSON string for PromptTitles should start with a left brace");
        }
        while (r4.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r4);
            if (A17 != null) {
                if (A17.equals("first")) {
                    if (!(r4.A11() == 16L.A0G || (A1P2 = r4.A1P()) == null)) {
                        uLg.A00 = A1P2;
                    }
                } else if (!A17.equals("second")) {
                    0KC.A0C("PromptTitlesJsonHelper", C13988Tno.A0g(A17));
                } else if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                    uLg.A01 = A1P;
                }
                r4.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return uLg;
    }
}
