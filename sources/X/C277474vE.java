package X;

import java.io.IOException;

/* renamed from: X.4vE  reason: invalid class name and case insensitive filesystem */
public abstract class C277474vE {
    public static C277484vF parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("audio_toggle_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("video_toggle_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r7.A0d());
                }
                r7.A0z();
            }
            if (bool == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("audio_toggle_enabled", "IGLiveAudioVideoToggle");
            } else if (bool2 != null || !(r7 instanceof 0c9)) {
                return new C277484vF(bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r7).A03.A00("video_toggle_enabled", "IGLiveAudioVideoToggle");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
