package X;

import java.io.IOException;

/* renamed from: X.VDc  reason: case insensitive filesystem */
public abstract class C16976VDc {
    public static VST parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VST vst = new VST();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("signal_rank".equals(A17)) {
                    vst.A00 = r3.A1D();
                } else if ("signal_value".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vst.A01 = str;
                }
                r3.A0z();
            }
            return vst;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
