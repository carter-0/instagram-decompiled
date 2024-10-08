package X;

import java.io.IOException;

/* renamed from: X.51H  reason: invalid class name */
public abstract class AnonymousClass51H {
    public static AnonymousClass51I parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            AnonymousClass51I r0 = new AnonymousClass51I();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                String str = null;
                if ("audio_overlay_file_path".equals(A0q)) {
                    if (r6.A11() != 16L.A0G) {
                        str = r6.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A05 = str;
                } else if ("audio_volume".equals(A0q)) {
                    r0.A00 = (float) r6.A0U();
                } else if ("seek_time_ms".equals(A0q)) {
                    r0.A02 = r6.A1D();
                } else if ("start_at_time_ms".equals(A0q)) {
                    r0.A03 = r6.A1D();
                } else if ("audio_duration_ms".equals(A0q)) {
                    r0.A01 = r6.A1D();
                } else if ("music_browse_playlist_id".equals(A0q)) {
                    if (r6.A11() != 16L.A0G) {
                        str = r6.A1P();
                    }
                    r0.A07 = str;
                } else if ("media_audio_overlay_type".equals(A0q)) {
                    AnonymousClass51J r1 = (AnonymousClass51J) AnonymousClass51J.A01.get(r6.A1Q());
                    if (r1 == null) {
                        r1 = AnonymousClass51J.UNKNOWN;
                    }
                    r0.A04 = r1;
                }
                r6.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass51I r3) {
        r2.A0c();
        r2.A0R("audio_overlay_file_path", r3.A05);
        r2.A0O("audio_volume", r3.A00);
        r2.A0P("seek_time_ms", r3.A02);
        r2.A0P("start_at_time_ms", r3.A03);
        r2.A0P("audio_duration_ms", r3.A01);
        String str = r3.A07;
        if (str != null) {
            r2.A0R("music_browse_playlist_id", str);
        }
        r2.A0R("media_audio_overlay_type", r3.A04.A00);
        r2.A0Z();
    }
}
