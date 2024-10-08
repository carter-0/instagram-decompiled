package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;

/* renamed from: X.JxO  reason: case insensitive filesystem */
public final class C61112JxO extends AnonymousClass0T0 implements C66564MWs {
    public final OriginalSoundData A00;
    public final TrackData A01;
    public final TrackMetadata A02;

    public final C61112JxO F7h(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61112JxO) {
                C61112JxO jxO = (C61112JxO) obj;
                if (!0qQ.A0K(this.A02, jxO.A02) || !0qQ.A0K(this.A00, jxO.A00) || !0qQ.A0K(this.A01, jxO.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TrackMetadata BSi() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZA() {
        return this.A00;
    }

    public final TrackData C92() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C61112JxO(OriginalSoundData originalSoundData, TrackData trackData, TrackMetadata trackMetadata) {
        this.A02 = trackMetadata;
        this.A00 = originalSoundData;
        this.A01 = trackData;
    }

    public final C66564MWs E7z(1E9 r1) {
        return this;
    }
}
