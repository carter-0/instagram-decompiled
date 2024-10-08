package X;

import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.KqJ  reason: case insensitive filesystem */
public abstract class C63028KqJ {
    public static C61119JxV parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            TrackDataImpl trackDataImpl = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A17)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r7);
                } else if ("participation_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                }
                r7.A0z();
            }
            if (trackDataImpl == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L(MediaStreamTrack.AUDIO_TRACK_KIND, r7, "StoryMusicPickAggregationItemImpl");
            } else if (num != null || !(r7 instanceof 0c9)) {
                return new C61119JxV(trackDataImpl, num.intValue());
            } else {
                AnonymousClass7TF.A1L("participation_count", r7, "StoryMusicPickAggregationItemImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
