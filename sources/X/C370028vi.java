package X;

import java.io.IOException;

/* renamed from: X.8vi  reason: invalid class name and case insensitive filesystem */
public abstract class C370028vi {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.8vj] */
    public static C370038vj parseFromJson(16F r3) {
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
                if ("serialized_overlay_edits".equals(A0q)) {
                    obj.A04 = C370048vk.parseFromJson(r3);
                } else if ("serialized_drawing_edits".equals(A0q)) {
                    obj.A03 = C370088vo.parseFromJson(r3);
                } else if ("text_mode_metadata".equals(A0q)) {
                    obj.A05 = C39807AAe.parseFromJson(r3);
                } else if ("story_caption_meta_data".equals(A0q)) {
                    obj.A06 = C2802450w.parseFromJson(r3);
                } else if ("reel_link_edits".equals(A0q)) {
                    obj.A00 = C370108vq.parseFromJson(r3);
                } else if ("music_overlay_edits".equals(A0q)) {
                    obj.A02 = C370128vs.parseFromJson(r3);
                } else if ("immersive_photo_edits".equals(A0q)) {
                    obj.A01 = C370138vt.parseFromJson(r3);
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
