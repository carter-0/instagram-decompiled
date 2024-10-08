package X;

import java.io.IOException;

/* renamed from: X.8vy  reason: invalid class name and case insensitive filesystem */
public abstract class C370188vy {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.8vz] */
    public static C370198vz parseFromJson(16F r3) {
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
                if ("is_video".equals(A0q)) {
                    obj.A04 = r3.A0d();
                } else if ("is_video_muted".equals(A0q)) {
                    obj.A05 = r3.A0d();
                } else if ("did_user_mute_audio".equals(A0q)) {
                    obj.A00 = r3.A0d();
                } else if ("has_music_sticker".equals(A0q)) {
                    obj.A02 = r3.A0d();
                } else if ("is_music_burned_into_video".equals(A0q)) {
                    obj.A03 = r3.A0d();
                } else if ("force_play_video_audio".equals(A0q)) {
                    obj.A01 = r3.A0d();
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
