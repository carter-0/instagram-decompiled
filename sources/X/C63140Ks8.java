package X;

import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import java.io.IOException;

/* renamed from: X.Ks8  reason: case insensitive filesystem */
public abstract class C63140Ks8 {
    public static MediaTransformation parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            MediaTransformation mediaTransformation = new MediaTransformation();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("translation_x".equals(A17)) {
                    mediaTransformation.A01 = (float) r4.A0U();
                } else if ("translation_y".equals(A17)) {
                    mediaTransformation.A02 = (float) r4.A0U();
                } else if ("zoom".equals(A17)) {
                    mediaTransformation.A03 = (float) r4.A0U();
                } else if ("rotation".equals(A17)) {
                    mediaTransformation.A00 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return mediaTransformation;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
