package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.ImmutablePandoTrackMetadata;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;

public final class CQY extends 17P implements DT1 {
    public final TrackMetadata BSi() {
        return (TrackMetadata) A04(-450004177, ImmutablePandoTrackMetadata.class);
    }

    public final TrackData C92() {
        return (TrackData) A04(110621003, ImmutablePandoTrackData.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DT1, X.CQY] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44547Cgh.A00(this));
    }

    public final BI4 FCy() {
        return new BI4(C92().FCv(), BSi().FCw());
    }
}
