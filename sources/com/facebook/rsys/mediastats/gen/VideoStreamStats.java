package com.facebook.rsys.mediastats.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoStreamStats {
    public static 2LV CONVERTER = C71546Omh.A00(46);
    public static long sMcfTypeId;
    public final Long avSyncAbsMS;
    public final Float bitrateKbps;
    public final Long bytesReceived;
    public final Long bytesSent;
    public final String codec;
    public final Long e2eDelayMS;
    public final Long estimatedPlayoutTimestampMS;
    public final Long fecPacketsReceived;
    public final Integer frameHeight;
    public final Integer frameWidth;
    public final Long framesDecoded;
    public final Float framesDecodedPerSecond;
    public final Long framesEncoded;
    public final Float framesEncodedPerSecond;
    public final Long jitterMS;
    public final Long nackCount;
    public final Long packetsLost;
    public final Long packetsReceived;
    public final String qualityLimitationReason;
    public final Long retransmittedPacketsSent;
    public final String ssrc;
    public final Float targetBitrateKbps;
    public final Float totalEncodeTime;

    public static native VideoStreamStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStreamStats)) {
                return false;
            }
            VideoStreamStats videoStreamStats = (VideoStreamStats) obj;
            String str = this.ssrc;
            String str2 = videoStreamStats.ssrc;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Integer num = this.frameWidth;
            Integer num2 = videoStreamStats.frameWidth;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            Integer num3 = this.frameHeight;
            Integer num4 = videoStreamStats.frameHeight;
            if (num3 == null) {
                if (num4 != null) {
                    return false;
                }
            } else if (!num3.equals(num4)) {
                return false;
            }
            Float f = this.bitrateKbps;
            Float f2 = videoStreamStats.bitrateKbps;
            if (f == null) {
                if (f2 != null) {
                    return false;
                }
            } else if (!f.equals(f2)) {
                return false;
            }
            Long l = this.bytesSent;
            Long l2 = videoStreamStats.bytesSent;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.bytesReceived;
            Long l4 = videoStreamStats.bytesReceived;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            Long l5 = this.retransmittedPacketsSent;
            Long l6 = videoStreamStats.retransmittedPacketsSent;
            if (l5 == null) {
                if (l6 != null) {
                    return false;
                }
            } else if (!l5.equals(l6)) {
                return false;
            }
            Long l7 = this.framesEncoded;
            Long l8 = videoStreamStats.framesEncoded;
            if (l7 == null) {
                if (l8 != null) {
                    return false;
                }
            } else if (!l7.equals(l8)) {
                return false;
            }
            Float f3 = this.framesEncodedPerSecond;
            Float f4 = videoStreamStats.framesEncodedPerSecond;
            if (f3 == null) {
                if (f4 != null) {
                    return false;
                }
            } else if (!f3.equals(f4)) {
                return false;
            }
            Long l9 = this.framesDecoded;
            Long l10 = videoStreamStats.framesDecoded;
            if (l9 == null) {
                if (l10 != null) {
                    return false;
                }
            } else if (!l9.equals(l10)) {
                return false;
            }
            Float f5 = this.framesDecodedPerSecond;
            Float f6 = videoStreamStats.framesDecodedPerSecond;
            if (f5 == null) {
                if (f6 != null) {
                    return false;
                }
            } else if (!f5.equals(f6)) {
                return false;
            }
            String str3 = this.codec;
            String str4 = videoStreamStats.codec;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            Long l11 = this.e2eDelayMS;
            Long l12 = videoStreamStats.e2eDelayMS;
            if (l11 == null) {
                if (l12 != null) {
                    return false;
                }
            } else if (!l11.equals(l12)) {
                return false;
            }
            Long l13 = this.nackCount;
            Long l14 = videoStreamStats.nackCount;
            if (l13 == null) {
                if (l14 != null) {
                    return false;
                }
            } else if (!l13.equals(l14)) {
                return false;
            }
            Long l15 = this.jitterMS;
            Long l16 = videoStreamStats.jitterMS;
            if (l15 == null) {
                if (l16 != null) {
                    return false;
                }
            } else if (!l15.equals(l16)) {
                return false;
            }
            Long l17 = this.packetsReceived;
            Long l18 = videoStreamStats.packetsReceived;
            if (l17 == null) {
                if (l18 != null) {
                    return false;
                }
            } else if (!l17.equals(l18)) {
                return false;
            }
            Long l19 = this.packetsLost;
            Long l20 = videoStreamStats.packetsLost;
            if (l19 == null) {
                if (l20 != null) {
                    return false;
                }
            } else if (!l19.equals(l20)) {
                return false;
            }
            Long l21 = this.fecPacketsReceived;
            Long l22 = videoStreamStats.fecPacketsReceived;
            if (l21 == null) {
                if (l22 != null) {
                    return false;
                }
            } else if (!l21.equals(l22)) {
                return false;
            }
            Float f7 = this.totalEncodeTime;
            Float f8 = videoStreamStats.totalEncodeTime;
            if (f7 == null) {
                if (f8 != null) {
                    return false;
                }
            } else if (!f7.equals(f8)) {
                return false;
            }
            Float f9 = this.targetBitrateKbps;
            Float f10 = videoStreamStats.targetBitrateKbps;
            if (f9 == null) {
                if (f10 != null) {
                    return false;
                }
            } else if (!f9.equals(f10)) {
                return false;
            }
            Long l23 = this.estimatedPlayoutTimestampMS;
            Long l24 = videoStreamStats.estimatedPlayoutTimestampMS;
            if (l23 == null) {
                if (l24 != null) {
                    return false;
                }
            } else if (!l23.equals(l24)) {
                return false;
            }
            Long l25 = this.avSyncAbsMS;
            Long l26 = videoStreamStats.avSyncAbsMS;
            if (l25 == null) {
                if (l26 != null) {
                    return false;
                }
            } else if (!l25.equals(l26)) {
                return false;
            }
            String str5 = this.qualityLimitationReason;
            String str6 = videoStreamStats.qualityLimitationReason;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((C66583MXo.A01(AnonymousClass7TG.A0E(this.ssrc)) + AnonymousClass7TG.A0C(this.frameWidth)) * 31) + AnonymousClass7TG.A0C(this.frameHeight)) * 31) + AnonymousClass7TG.A0C(this.bitrateKbps)) * 31) + AnonymousClass7TG.A0C(this.bytesSent)) * 31) + AnonymousClass7TG.A0C(this.bytesReceived)) * 31) + AnonymousClass7TG.A0C(this.retransmittedPacketsSent)) * 31) + AnonymousClass7TG.A0C(this.framesEncoded)) * 31) + AnonymousClass7TG.A0C(this.framesEncodedPerSecond)) * 31) + AnonymousClass7TG.A0C(this.framesDecoded)) * 31) + AnonymousClass7TG.A0C(this.framesDecodedPerSecond)) * 31) + AnonymousClass7TG.A0E(this.codec)) * 31) + AnonymousClass7TG.A0C(this.e2eDelayMS)) * 31) + AnonymousClass7TG.A0C(this.nackCount)) * 31) + AnonymousClass7TG.A0C(this.jitterMS)) * 31) + AnonymousClass7TG.A0C(this.packetsReceived)) * 31) + AnonymousClass7TG.A0C(this.packetsLost)) * 31) + AnonymousClass7TG.A0C(this.fecPacketsReceived)) * 31) + AnonymousClass7TG.A0C(this.totalEncodeTime)) * 31) + AnonymousClass7TG.A0C(this.targetBitrateKbps)) * 31) + AnonymousClass7TG.A0C(this.estimatedPlayoutTimestampMS)) * 31) + AnonymousClass7TG.A0C(this.avSyncAbsMS)) * 31) + C41845B3m.A00(this.qualityLimitationReason);
    }

    public VideoStreamStats(String str, Integer num, Integer num2, Float f, Long l, Long l2, Long l3, Long l4, Float f2, Long l5, Float f3, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Float f4, Float f5, Long l12, Long l13, String str3) {
        this.ssrc = str;
        this.frameWidth = num;
        this.frameHeight = num2;
        this.bitrateKbps = f;
        this.bytesSent = l;
        this.bytesReceived = l2;
        this.retransmittedPacketsSent = l3;
        this.framesEncoded = l4;
        this.framesEncodedPerSecond = f2;
        this.framesDecoded = l5;
        this.framesDecodedPerSecond = f3;
        this.codec = str2;
        this.e2eDelayMS = l6;
        this.nackCount = l7;
        this.jitterMS = l8;
        this.packetsReceived = l9;
        this.packetsLost = l10;
        this.fecPacketsReceived = l11;
        this.totalEncodeTime = f4;
        this.targetBitrateKbps = f5;
        this.estimatedPlayoutTimestampMS = l12;
        this.avSyncAbsMS = l13;
        this.qualityLimitationReason = str3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoStreamStats{ssrc=");
        A1A.append(this.ssrc);
        A1A.append(",frameWidth=");
        A1A.append(this.frameWidth);
        A1A.append(",frameHeight=");
        A1A.append(this.frameHeight);
        A1A.append(",bitrateKbps=");
        A1A.append(this.bitrateKbps);
        A1A.append(",bytesSent=");
        A1A.append(this.bytesSent);
        A1A.append(",bytesReceived=");
        A1A.append(this.bytesReceived);
        A1A.append(",retransmittedPacketsSent=");
        A1A.append(this.retransmittedPacketsSent);
        A1A.append(",framesEncoded=");
        A1A.append(this.framesEncoded);
        A1A.append(",framesEncodedPerSecond=");
        A1A.append(this.framesEncodedPerSecond);
        A1A.append(",framesDecoded=");
        A1A.append(this.framesDecoded);
        A1A.append(",framesDecodedPerSecond=");
        A1A.append(this.framesDecodedPerSecond);
        A1A.append(",codec=");
        A1A.append(this.codec);
        A1A.append(",e2eDelayMS=");
        A1A.append(this.e2eDelayMS);
        A1A.append(",nackCount=");
        A1A.append(this.nackCount);
        A1A.append(",jitterMS=");
        A1A.append(this.jitterMS);
        A1A.append(",packetsReceived=");
        A1A.append(this.packetsReceived);
        A1A.append(",packetsLost=");
        A1A.append(this.packetsLost);
        A1A.append(",fecPacketsReceived=");
        A1A.append(this.fecPacketsReceived);
        A1A.append(",totalEncodeTime=");
        A1A.append(this.totalEncodeTime);
        A1A.append(",targetBitrateKbps=");
        A1A.append(this.targetBitrateKbps);
        A1A.append(",estimatedPlayoutTimestampMS=");
        A1A.append(this.estimatedPlayoutTimestampMS);
        A1A.append(",avSyncAbsMS=");
        A1A.append(this.avSyncAbsMS);
        A1A.append(",qualityLimitationReason=");
        return C66584MXp.A0a(this.qualityLimitationReason, A1A);
    }
}
