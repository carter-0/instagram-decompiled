package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMediaCroppingCoordinates;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;

public final class B66 extends 17P implements C66901qt {
    public final MediaCroppingCoordinatesIntf B5Q() {
        return (MediaCroppingCoordinatesIntf) A05(30261672, ImmutablePandoMediaCroppingCoordinates.class);
    }

    public final MediaCroppingCoordinatesIntf ByW() {
        return (MediaCroppingCoordinatesIntf) A05(386483314, ImmutablePandoMediaCroppingCoordinates.class);
    }

    public final MediaCroppingCoordinatesIntf C6q() {
        return (MediaCroppingCoordinatesIntf) A05(1691945273, ImmutablePandoMediaCroppingCoordinates.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B66, X.1qt] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4J.A00(this));
    }

    public final 1qs F5n() {
        MediaCroppingCoordinates mediaCroppingCoordinates;
        MediaCroppingCoordinates mediaCroppingCoordinates2;
        MediaCroppingCoordinatesIntf B5Q = B5Q();
        MediaCroppingCoordinates mediaCroppingCoordinates3 = null;
        if (B5Q != null) {
            mediaCroppingCoordinates = B5Q.F5m();
        } else {
            mediaCroppingCoordinates = null;
        }
        MediaCroppingCoordinatesIntf ByW = ByW();
        if (ByW != null) {
            mediaCroppingCoordinates2 = ByW.F5m();
        } else {
            mediaCroppingCoordinates2 = null;
        }
        MediaCroppingCoordinatesIntf C6q = C6q();
        if (C6q != null) {
            mediaCroppingCoordinates3 = C6q.F5m();
        }
        return new 1qs(mediaCroppingCoordinates, mediaCroppingCoordinates2, mediaCroppingCoordinates3);
    }
}
