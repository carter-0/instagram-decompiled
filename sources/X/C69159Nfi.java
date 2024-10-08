package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;

/* renamed from: X.Nfi  reason: case insensitive filesystem */
public final class C69159Nfi extends C66942Mfb {
    public OriginalSoundData A00;
    public TrackDataImpl A01;
    public TrackMetadataImpl A02;
    public C66569MWx A03;

    public final C66569MWx A06() {
        C66569MWx mWx;
        OriginalSoundData originalSoundData = this.A00;
        if (originalSoundData != null) {
            mWx = new DHT(originalSoundData);
        } else {
            TrackDataImpl trackDataImpl = this.A01;
            if (trackDataImpl == null) {
                return null;
            }
            JVX jvx = new JVX(trackDataImpl);
            jvx.A00 = this.A02;
            mWx = jvx;
        }
        return mWx;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj instanceof C69159Nfi) {
            C66569MWx mWx = this.A03;
            String str2 = null;
            if (mWx != null) {
                str = mWx.getId();
            } else {
                str = null;
            }
            C66569MWx mWx2 = ((C69159Nfi) obj).A03;
            if (mWx2 != null) {
                str2 = mWx2.getId();
            }
            if (!0qQ.A0K(str, str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String id;
        C66569MWx mWx = this.A03;
        if (mWx == null || (id = mWx.getId()) == null) {
            return 0;
        }
        return id.hashCode();
    }
}
