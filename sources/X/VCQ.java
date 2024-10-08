package X;

import java.io.IOException;

public abstract class VCQ {
    public static VZY parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VZY vzy = new VZY();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(277).equals(A17)) {
                    vzy.A02 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(708).equals(A17)) {
                    vzy.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A17(A17)) {
                    vzy.A04 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(807).equals(A17)) {
                    vzy.A00 = VCM.parseFromJson(r3);
                } else if ("merchant".equals(A17)) {
                    vzy.A01 = VCP.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vzy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
