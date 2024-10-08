package X;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class WRM implements AnonymousClass1FD {
    public static final WRM A00 = new WRM();

    public final /* bridge */ /* synthetic */ Object invoke(16F r9) {
        String A1P;
        0qQ.A0B(r9, 0);
        C61076JwE jwE = new C61076JwE((Integer) null, (String) null, (DefaultConstructorMarker) null, 3, 24);
        if (r9.A11() != 16L.A0D) {
            throw new IOException("JSON string for MediaPollV2StickerOption should start with a left brace");
        }
        while (r9.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r9);
            if (A17 != null) {
                if (A17.equals("text")) {
                    if (!(r9.A11() == 16L.A0G || (A1P = r9.A1P()) == null)) {
                        jwE.A01 = A1P;
                    }
                } else if (A17.equals("count")) {
                    jwE.A00 = AnonymousClass7TF.A0X(r9);
                } else {
                    0KC.A0C("MediaPollV2StickerOptionJsonHelper", C13988Tno.A0g(A17));
                }
                r9.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return jwE;
    }
}
