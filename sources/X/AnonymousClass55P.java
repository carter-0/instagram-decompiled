package X;

import java.io.IOException;

/* renamed from: X.55P  reason: invalid class name */
public abstract class AnonymousClass55P {
    public static AnonymousClass55Q parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass55Q r0 = new AnonymousClass55Q();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("draft_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A03 = str;
                } else if ("draft_external_source".equals(A0q)) {
                    r0.A01 = Long.valueOf(r3.A0y());
                } else if ("draft_source_type".equals(A0q)) {
                    r0.A00 = Integer.valueOf(r3.A1D());
                } else if ("meta_gallery_media_id".equals(A0q)) {
                    r0.A02 = Long.valueOf(r3.A0y());
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
