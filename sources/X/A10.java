package X;

import java.io.IOException;

public abstract class A10 {
    public static Af0 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Af0 af0 = new Af0();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C273654mx.A00(831).equals(A17)) {
                    af0.A03 = A11.A00(r3.A1Q());
                } else if ("music_sticker_model".equals(A17)) {
                    af0.Edm(C255673uX.parseFromJson(r3));
                } else if ("color".equals(A17)) {
                    af0.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return af0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
