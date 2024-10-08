package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.user.model.User;

/* renamed from: X.OLm  reason: case insensitive filesystem */
public final class C70791OLm {
    public C68144N2k A00;
    public OriginalSoundData A01;
    public C15033UKm A02;
    public C274584oc A03;
    public TrackDataImpl A04;
    public TrackMetadataImpl A05;
    public User A06;
    public Long A07;

    public final C66569MWx A00() {
        C66569MWx mWx;
        OriginalSoundData originalSoundData = this.A01;
        if (originalSoundData != null) {
            mWx = new DHT(originalSoundData);
        } else {
            TrackDataImpl trackDataImpl = this.A04;
            if (trackDataImpl == null) {
                return null;
            }
            JVX jvx = new JVX(trackDataImpl);
            jvx.A00 = this.A05;
            mWx = jvx;
        }
        return mWx;
    }
}
