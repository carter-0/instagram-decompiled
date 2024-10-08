package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51972G9s;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class Video {
    public static 2LV CONVERTER = C71546Omh.A00(60);
    public static long sMcfTypeId;
    public final float aspectRatio;
    public final String dashManifest;
    public final long durationMs;
    public final SizedUrl url;

    public static native Video createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            SizedUrl sizedUrl = this.url;
            SizedUrl sizedUrl2 = video.url;
            if (sizedUrl == null) {
                if (sizedUrl2 != null) {
                    return false;
                }
            } else if (!sizedUrl.equals(sizedUrl2)) {
                return false;
            }
            String str = this.dashManifest;
            String str2 = video.dashManifest;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!(this.durationMs == video.durationMs && this.aspectRatio == video.aspectRatio)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C51972G9s.A07(this.durationMs, (C66583MXo.A01(AnonymousClass7TG.A0C(this.url)) + C41845B3m.A00(this.dashManifest)) * 31) + Float.floatToIntBits(this.aspectRatio);
    }

    public Video(SizedUrl sizedUrl, String str, long j, float f) {
        this.url = sizedUrl;
        this.dashManifest = str;
        this.durationMs = j;
        this.aspectRatio = f;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Video{url=");
        A1A.append(this.url);
        A1A.append(",dashManifest=");
        A1A.append(this.dashManifest);
        A1A.append(",durationMs=");
        A1A.append(this.durationMs);
        A1A.append(",aspectRatio=");
        A1A.append(this.aspectRatio);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
