package X;

import java.io.IOException;

/* renamed from: X.7wQ  reason: invalid class name and case insensitive filesystem */
public final class C347197wQ {
    public static C347187wP parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("message_prefs".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A03 = str;
                } else if ("save_to_camera_roll".equals(A0q)) {
                    r0.A02 = Boolean.valueOf(r3.A0d());
                } else if ("blocked_reels".equals(A0q)) {
                    r0.A00 = C347537wy.parseFromJson(r3);
                } else if ("besties".equals(A0q)) {
                    r0.A01 = C347557x0.parseFromJson(r3);
                } else if ("persist_stories_to_private_profile".equals(A0q)) {
                    r3.A0d();
                } else if ("allow_story_reshare".equals(A0q)) {
                    r0.A04 = r3.A0d();
                } else {
                    1XY.A01(r3, r0, A0q);
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
