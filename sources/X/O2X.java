package X;

import java.io.IOException;

public abstract class O2X {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Nfi, X.Mfb] */
    public static C69159Nfi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? mfb = new C66942Mfb();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("track".equals(A17)) {
                    mfb.A01 = AnonymousClass3UP.parseFromJson(r3);
                } else if ("metadata".equals(A17)) {
                    mfb.A02 = D0F.parseFromJson(r3);
                } else if ("original_sound".equals(A17)) {
                    mfb.A00 = 1dk.parseFromJson(r3);
                } else {
                    C66941Mfa.A01(r3, mfb, A17);
                }
                r3.A0z();
            }
            return mfb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
