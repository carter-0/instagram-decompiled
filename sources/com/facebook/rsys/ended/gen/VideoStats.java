package com.facebook.rsys.ended.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoStats {
    public static 2LV CONVERTER = C22180Xwq.A00(46);
    public static long sMcfTypeId;
    public final Long total1080phdDurationMs;
    public final Long total720phdDurationMs;
    public final Long totalDurationMs;

    public static native VideoStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStats)) {
                return false;
            }
            VideoStats videoStats = (VideoStats) obj;
            Long l = this.totalDurationMs;
            Long l2 = videoStats.totalDurationMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.total720phdDurationMs;
            Long l4 = videoStats.total720phdDurationMs;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            Long l5 = this.total1080phdDurationMs;
            Long l6 = videoStats.total1080phdDurationMs;
            if (l5 != null) {
                return l5.equals(l6);
            }
            if (l6 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((C66583MXo.A01(AnonymousClass7TG.A0C(this.totalDurationMs)) + AnonymousClass7TG.A0C(this.total720phdDurationMs)) * 31) + AnonymousClass7TE.A0L(this.total1080phdDurationMs);
    }

    public VideoStats(Long l, Long l2, Long l3) {
        this.totalDurationMs = l;
        this.total720phdDurationMs = l2;
        this.total1080phdDurationMs = l3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoStats{totalDurationMs=");
        A1A.append(this.totalDurationMs);
        A1A.append(",total720phdDurationMs=");
        A1A.append(this.total720phdDurationMs);
        A1A.append(",total1080phdDurationMs=");
        return C66582MXn.A0v(this.total1080phdDurationMs, A1A);
    }
}
