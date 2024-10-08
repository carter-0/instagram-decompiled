package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class Fallback {
    public static 2LV CONVERTER = C71546Omh.A00(51);
    public static long sMcfTypeId;
    public final String attribution;
    public final String attributionImageUrl;
    public final String contentId;
    public final String coverImageUrl;
    public final String message;
    public final Video video;

    public static native Fallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fallback)) {
                return false;
            }
            Fallback fallback = (Fallback) obj;
            if (!this.contentId.equals(fallback.contentId) || !this.coverImageUrl.equals(fallback.coverImageUrl)) {
                return false;
            }
            String str = this.message;
            String str2 = fallback.message;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Video video2 = this.video;
            Video video3 = fallback.video;
            if (video2 == null) {
                if (video3 != null) {
                    return false;
                }
            } else if (!video2.equals(video3)) {
                return false;
            }
            String str3 = this.attributionImageUrl;
            String str4 = fallback.attributionImageUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.attribution;
            String str6 = fallback.attribution;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.coverImageUrl, C66583MXo.A06(this.contentId)) + AnonymousClass7TG.A0E(this.message)) * 31) + AnonymousClass7TG.A0C(this.video)) * 31) + AnonymousClass7TG.A0E(this.attributionImageUrl)) * 31) + C41845B3m.A00(this.attribution);
    }

    public Fallback(String str, String str2, String str3, Video video2, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.contentId = str;
        this.coverImageUrl = str2;
        this.message = str3;
        this.video = video2;
        this.attributionImageUrl = str4;
        this.attribution = str5;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Fallback{contentId=");
        A1A.append(this.contentId);
        A1A.append(",coverImageUrl=");
        A1A.append(this.coverImageUrl);
        A1A.append(",message=");
        A1A.append(this.message);
        A1A.append(",video=");
        A1A.append(this.video);
        A1A.append(",attributionImageUrl=");
        A1A.append(this.attributionImageUrl);
        A1A.append(",attribution=");
        return C66584MXp.A0a(this.attribution, A1A);
    }
}
