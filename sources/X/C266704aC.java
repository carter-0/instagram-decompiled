package X;

import java.io.IOException;

/* renamed from: X.4aC  reason: invalid class name and case insensitive filesystem */
public abstract class C266704aC {
    public static AnonymousClass9JE parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass9JE r0 = new AnonymousClass9JE();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("source_media_collection_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A03 = str;
                } else if ("source_media_id".equals(A0q)) {
                    r0.A01 = Long.valueOf(r4.A0y());
                } else if ("source_medium_id".equals(A0q)) {
                    r0.A02 = Long.valueOf(r4.A0y());
                } else if ("acr_type".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A00 = C378199Ow.A00(str);
                } else if ("template_clips_media_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A04 = str;
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
