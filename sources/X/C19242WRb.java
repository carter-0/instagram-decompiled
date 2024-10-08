package X;

import java.io.IOException;

/* renamed from: X.WRb  reason: case insensitive filesystem */
public final class C19242WRb implements AnonymousClass1FD {
    public static final C19242WRb A00 = new C19242WRb();

    public final /* bridge */ /* synthetic */ Object invoke(16F r4) {
        0qQ.A0B(r4, 0);
        C15050ULg uLg = new C15050ULg(12);
        if (r4.A11() != 16L.A0D) {
            throw new IOException("JSON string for StoryPromptFailureTooltip should start with a left brace");
        }
        while (r4.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r4);
            if (A17 != null) {
                if (A17.equals("error_message_body")) {
                    uLg.A00 = C13989Tnp.A0o(r4);
                } else if (A17.equals(C273654mx.A00(147))) {
                    uLg.A01 = C13989Tnp.A0o(r4);
                } else {
                    0KC.A0C("StoryPromptFailureTooltipJsonHelper", C13988Tno.A0g(A17));
                }
                r4.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return uLg;
    }
}
