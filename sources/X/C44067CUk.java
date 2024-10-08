package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.feed.audio.Audio;
import java.io.IOException;

/* renamed from: X.CUk  reason: case insensitive filesystem */
public abstract class C44067CUk {
    public static AudioNoteResponseInfo parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Audio audio = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("audio_info".equals(A17)) {
                    audio = C2610047w.parseFromJson(r8);
                } else if ("logging_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (audio == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_info", r8, "AudioNoteResponseInfo");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new AudioNoteResponseInfo(audio, str);
            } else {
                AnonymousClass7TF.A1L("logging_id", r8, "AudioNoteResponseInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
