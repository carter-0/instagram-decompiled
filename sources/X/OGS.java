package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import org.webrtc.MediaStreamTrack;

public final class OGS {
    public final MediaStats A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public OGS(MediaStats mediaStats) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(mediaStats, 1);
        this.A00 = mediaStats;
        int i = mediaStats.channelType;
        String str4 = "unknown";
        if (i == 0) {
            str = MediaStreamTrack.AUDIO_TRACK_KIND;
        } else if (i != 1) {
            str = str4;
        } else {
            str = MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        this.A01 = str;
        int i2 = mediaStats.streamDirection;
        if (i2 == 0) {
            str2 = "outgoing";
        } else if (i2 != 1) {
            str2 = str4;
        } else {
            str2 = "incoming";
        }
        this.A03 = str2;
        int i3 = mediaStats.streamType;
        if (i3 == 1) {
            str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        } else if (i3 != 2) {
            str3 = str4;
        } else {
            str3 = "screen share";
        }
        this.A04 = str3;
        int i4 = mediaStats.mediaPath;
        if (i4 == 1) {
            str4 = "SFU";
        } else if (i4 == 2) {
            str4 = "P2P";
        }
        this.A02 = str4;
    }
}
