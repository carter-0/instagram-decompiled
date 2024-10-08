package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;

public final class FYN implements C232262tL {
    public final TrackOrOriginalSoundSchema A00;
    public final AnonymousClass0iw A01;

    public FYN(TrackOrOriginalSoundSchema trackOrOriginalSoundSchema, AnonymousClass0iw r3) {
        0qQ.A0B(trackOrOriginalSoundSchema, 1);
        this.A00 = trackOrOriginalSoundSchema;
        this.A01 = r3;
    }

    /* renamed from: A00 */
    public final String getKey() {
        String str;
        TrackData trackData;
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = this.A00;
        OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
        if ((originalSoundData != null && (str = originalSoundData.A0I) != null) || ((trackData = trackOrOriginalSoundSchema.A01) != null && (str = trackData.getAudioAssetId()) != null)) {
            return str;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema;
        FYN fyn = (FYN) obj;
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema2 = this.A00;
        if (fyn != null) {
            trackOrOriginalSoundSchema = fyn.A00;
        } else {
            trackOrOriginalSoundSchema = null;
        }
        return 0qQ.A0K(trackOrOriginalSoundSchema2, trackOrOriginalSoundSchema);
    }
}
