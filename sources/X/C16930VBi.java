package X;

import java.io.IOException;

/* renamed from: X.VBi  reason: case insensitive filesystem */
public abstract class C16930VBi {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.VZR, java.lang.Object] */
    public static VZR parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1E(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1A(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A03 = A0l;
                } else if ("link_text".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("link".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(3272).equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            String str = obj.A00;
            if (str == null) {
                return obj;
            }
            C16654Uyq.A01.get(str);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
