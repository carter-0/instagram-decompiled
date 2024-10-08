package X;

import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import java.io.IOException;

/* renamed from: X.CWp  reason: case insensitive filesystem */
public abstract class C44124CWp {
    public static CreatorViewerSignalDetailsImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CreatorViewerSignalAudioDetailsImpl creatorViewerSignalAudioDetailsImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            CreatorViewerSignalPlainDetailsImpl creatorViewerSignalPlainDetailsImpl = null;
            CreatorViewerSignalReelsTextDetailsImpl creatorViewerSignalReelsTextDetailsImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("audio_details".equals(A17)) {
                    creatorViewerSignalAudioDetailsImpl = C44122CWn.parseFromJson(r5);
                } else if ("plain_details".equals(A17)) {
                    creatorViewerSignalPlainDetailsImpl = C44130CWv.parseFromJson(r5);
                } else if ("reels_text_details".equals(A17)) {
                    creatorViewerSignalReelsTextDetailsImpl = C44132CWx.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new CreatorViewerSignalDetailsImpl(creatorViewerSignalAudioDetailsImpl, creatorViewerSignalPlainDetailsImpl, creatorViewerSignalReelsTextDetailsImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
