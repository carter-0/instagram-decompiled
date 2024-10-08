package X;

import java.io.IOException;

/* renamed from: X.EoQ  reason: case insensitive filesystem */
public abstract class C49046EoQ {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ez9, java.lang.Object] */
    public static Ez9 parseFromJson(16F r8) {
        C48155EZx eZx;
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("title_text".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r8);
                } else if ("content_text".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r8);
                } else if ("step".equals(A17)) {
                    String A1Q = r8.A1Q();
                    C48155EZx[] values = C48155EZx.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            eZx = C48155EZx.UNKNOWN;
                            break;
                        }
                        eZx = values[i];
                        if (00p.A0j(eZx.name(), A1Q, true)) {
                            break;
                        }
                        i++;
                    }
                    obj.A00 = eZx;
                } else if ("qualifying_value".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r8);
                }
                r8.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
