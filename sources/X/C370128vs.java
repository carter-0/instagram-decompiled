package X;

import java.io.IOException;

/* renamed from: X.8vs  reason: invalid class name and case insensitive filesystem */
public abstract class C370128vs {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.8pP] */
    public static C366628pP parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("music_sticker_tag".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A03 = str;
                } else if ("music_data_source".equals(A0q)) {
                    obj.A02 = C39558A0a.parseFromJson(r3);
                } else if ("start_time_ms".equals(A0q)) {
                    obj.A01 = r3.A1D();
                } else if ("duration_ms".equals(A0q)) {
                    obj.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
