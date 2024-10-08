package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;

public final class M8F implements Runnable {
    public final /* synthetic */ C63938LDy A00;
    public final /* synthetic */ C22371Y0z A01;

    public M8F(C63938LDy lDy, C22371Y0z y0z) {
        this.A00 = lDy;
        this.A01 = y0z;
    }

    public final void run() {
        long j;
        Integer num;
        double d;
        double d2;
        String str;
        C62491Kgh kgh;
        VideoEncoderConfig videoEncoderConfig;
        long j2;
        long j3;
        String A06;
        String str2;
        C63938LDy lDy = this.A00;
        if (lDy.A02) {
            C22371Y0z y0z = this.A01;
            y0z.A0B.postDelayed(this, 100);
            MUT mut = y0z.A0G;
            mut.DBD();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - lDy.A01 >= 1000) {
                lDy.A01 = elapsedRealtime;
                C22230Xxl xxl = y0z.A0H;
                LiveStreamSessionProbe liveStreamSessionProbe = xxl.A00;
                if (liveStreamSessionProbe != null) {
                    j2 = liveStreamSessionProbe.getAudioPts();
                } else {
                    j2 = 0;
                }
                LiveStreamSessionProbe liveStreamSessionProbe2 = xxl.A00;
                if (liveStreamSessionProbe2 != null) {
                    j3 = liveStreamSessionProbe2.getVideoPts();
                } else {
                    j3 = 0;
                }
                long j4 = j2 - j3;
                M0X m0x = y0z.A0E;
                m0x.A03 = j4;
                long abs = Math.abs(j4);
                if (abs > 8000) {
                    if (!lDy.A03) {
                        lDy.A03 = true;
                        A06 = 0mp.A06(002.A0Q("AV ptsOffset: ", j4), new Object[0]);
                        str2 = "large_offset_detected";
                    }
                } else if (abs < 1000 && lDy.A03) {
                    lDy.A03 = false;
                    A06 = 0mp.A06(002.A0Q("AV ptsOffset: ", j4), new Object[0]);
                    str2 = "normal_offset_detected";
                }
                LiveStreamingError liveStreamingError = new LiveStreamingError(2010, "checkAudioVideoOffsets", str2, A06, "", false, false, false);
                int i = liveStreamingError.errorCode;
                String str3 = liveStreamingError.domain;
                if (str3 == null) {
                    str3 = "";
                }
                m0x.A0C(i, str3, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
            }
            long j5 = elapsedRealtime - lDy.A00;
            Integer num2 = y0z.A06;
            Integer num3 = AnonymousClass05K.A00;
            if (num2 == num3) {
                j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            } else {
                j = 1000;
            }
            if (j5 >= j) {
                lDy.A00 = elapsedRealtime;
                C22230Xxl xxl2 = y0z.A0H;
                if (xxl2.A04) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = num3;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        num3 = AnonymousClass05K.A0C;
                    } else {
                        num3 = AnonymousClass05K.A01;
                    }
                }
                C17992VjU A002 = LKG.A00(y0z.A0D);
                String str4 = null;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                float f = 0.0f;
                LiveStreamSessionProbe liveStreamSessionProbe3 = xxl2.A00;
                if (!(liveStreamSessionProbe3 == null || (videoEncoderConfig = liveStreamSessionProbe3.getVideoEncoderConfig()) == null)) {
                    int i6 = videoEncoderConfig.videoProfile.A00;
                    if (i6 == 1 || i6 == 2) {
                        str4 = "high";
                    } else {
                        str4 = "baseline";
                    }
                    i2 = videoEncoderConfig.width;
                    i3 = videoEncoderConfig.height;
                    i4 = videoEncoderConfig.bitRate;
                    i5 = videoEncoderConfig.frameRate;
                    f = videoEncoderConfig.iFrameInterval;
                }
                VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = new VideoBroadcastVideoStreamingConfig(str4, f, i4, i5, i3, i2);
                LiveStreamSessionProbe liveStreamSessionProbe4 = xxl2.A00;
                if (liveStreamSessionProbe4 == null || liveStreamSessionProbe4.getTransportThroughputBps() >= 0.0d) {
                    LiveStreamSessionProbe liveStreamSessionProbe5 = xxl2.A00;
                    if (liveStreamSessionProbe5 != null) {
                        d = liveStreamSessionProbe5.getTransportThroughputBps();
                    } else {
                        d = 0.0d;
                    }
                    d2 = d / 1000.0d;
                } else {
                    d2 = -1.0d;
                }
                A002.A00((Pair) null, (Pair) null, videoBroadcastVideoStreamingConfig, Double.valueOf(d2), (Integer) null, Integer.valueOf(intValue), (Long) null, (String) null);
                if (y0z.A06 != num3) {
                    M0X m0x2 = y0z.A0E;
                    switch (num3.intValue()) {
                        case 0:
                            str = "NORMAL";
                            break;
                        case 1:
                            str = "WEAK";
                            break;
                        default:
                            str = "SHOULD_STOP_STREAMING";
                            break;
                    }
                    m0x2.A0H("NetworkStateChange", 002.A07(intValue, "networkState: ", str, ", lagState "));
                    y0z.A06 = num3;
                    if (intValue == 0) {
                        kgh = C62491Kgh.NORMAL;
                    } else if (intValue != 1) {
                        kgh = C62491Kgh.CRITICAL;
                    } else {
                        kgh = C62491Kgh.WEAK;
                    }
                    C62423KfY kfY = ((C65818M0k) mut).A01;
                    11Z.A02(new M8C(kgh, kfY));
                    kfY.A0L(AnonymousClass05K.A0N);
                }
            }
        }
    }
}
