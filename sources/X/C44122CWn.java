package X;

import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.FormattedStringImpl;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;

/* renamed from: X.CWn  reason: case insensitive filesystem */
public abstract class C44122CWn {
    public static CreatorViewerSignalAudioDetailsImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            FormattedStringImpl formattedStringImpl = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("audio_info".equals(A17)) {
                    trackOrOriginalSoundSchema = C44546Cgg.parseFromJson(r4);
                } else if (C41845B3m.A1L(A17)) {
                    formattedStringImpl = C44152CXr.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new CreatorViewerSignalAudioDetailsImpl(formattedStringImpl, trackOrOriginalSoundSchema);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
