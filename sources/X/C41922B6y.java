package X;

import java.io.IOException;

/* renamed from: X.B6y  reason: case insensitive filesystem */
public abstract class C41922B6y {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Hm6, java.lang.Object] */
    public static C55709Hm6 parseFromJson(16F r3) {
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
                if ("music_info".equals(A0q)) {
                    obj.A00 = 1dj.parseFromJson(r3);
                } else if ("original_sound_info".equals(A0q)) {
                    obj.A01 = 1dk.parseFromJson(r3);
                } else if ("additional_audio_info".equals(A0q)) {
                    obj.A02 = C67031rk.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
