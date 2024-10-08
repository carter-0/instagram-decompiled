package X;

import java.io.IOException;

/* renamed from: X.5JK  reason: invalid class name */
public abstract class AnonymousClass5JK {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5JL] */
    public static AnonymousClass5JL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("sticker_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A04 = str;
                } else if ("start_time_ms".equals(A0q)) {
                    obj.A01 = r4.A1D();
                } else if ("end_time_ms".equals(A0q)) {
                    obj.A00 = r4.A1D();
                } else if ("tts_voice_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A06 = str;
                } else if ("tts_voice_name".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A07 = str;
                } else if ("tts_sfx".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A03 = str;
                } else if ("tts_shortwave_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A05 = str;
                } else if ("base_sticker_client_model".equals(A0q)) {
                    obj.A02 = C2802050s.parseFromJson(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
