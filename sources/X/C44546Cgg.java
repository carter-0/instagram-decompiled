package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;

/* renamed from: X.Cgg  reason: case insensitive filesystem */
public abstract class C44546Cgg {
    public static TrackOrOriginalSoundSchema parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            TrackMetadataImpl trackMetadataImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            OriginalSoundData originalSoundData = null;
            TrackDataImpl trackDataImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("metadata".equals(A17)) {
                    trackMetadataImpl = D0F.parseFromJson(r5);
                } else if ("original_sound".equals(A17)) {
                    originalSoundData = 1dk.parseFromJson(r5);
                } else if ("track".equals(A17)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new TrackOrOriginalSoundSchema(originalSoundData, trackDataImpl, trackMetadataImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
