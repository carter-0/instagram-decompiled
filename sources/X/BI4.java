package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;

public final class BI4 extends AnonymousClass0T0 implements DT1 {
    public final TrackData A00;
    public final TrackMetadata A01;

    public final BI4 FCy() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI4) {
                BI4 bi4 = (BI4) obj;
                if (!0qQ.A0K(this.A01, bi4.A01) || !0qQ.A0K(this.A00, bi4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TrackMetadata BSi() {
        return this.A01;
    }

    public final TrackData C92() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTrackSchema", C44547Cgh.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public BI4(TrackData trackData, TrackMetadata trackMetadata) {
        AnonymousClass7TG.A1O(trackMetadata, trackData);
        this.A01 = trackMetadata;
        this.A00 = trackData;
    }
}
