package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class FacebookVideoContent {
    public static 2LV CONVERTER = C71546Omh.A00(50);
    public static long sMcfTypeId;
    public final ArrayList availableCaptionLocales;
    public final String contentId;
    public final boolean isLiveStreaming;
    public final boolean isReportable;
    public final String subtitle;
    public final SizedUrl thumbnail;
    public final String title;
    public final Video video;

    public static native FacebookVideoContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FacebookVideoContent)) {
                return false;
            }
            FacebookVideoContent facebookVideoContent = (FacebookVideoContent) obj;
            if (!this.contentId.equals(facebookVideoContent.contentId) || !this.video.equals(facebookVideoContent.video)) {
                return false;
            }
            SizedUrl sizedUrl = this.thumbnail;
            SizedUrl sizedUrl2 = facebookVideoContent.thumbnail;
            if (sizedUrl == null) {
                if (sizedUrl2 != null) {
                    return false;
                }
            } else if (!sizedUrl.equals(sizedUrl2)) {
                return false;
            }
            String str = this.title;
            String str2 = facebookVideoContent.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.subtitle;
            String str4 = facebookVideoContent.subtitle;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.isLiveStreaming == facebookVideoContent.isLiveStreaming && this.isReportable == facebookVideoContent.isReportable && this.availableCaptionLocales.equals(facebookVideoContent.availableCaptionLocales))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A06 = C66583MXo.A06(this.contentId);
        return AnonymousClass7TE.A0N(this.availableCaptionLocales, (((((((((AnonymousClass7TF.A07(this.video, A06) + AnonymousClass7TG.A0C(this.thumbnail)) * 31) + AnonymousClass7TG.A0E(this.title)) * 31) + C41845B3m.A00(this.subtitle)) * 31) + (this.isLiveStreaming ? 1 : 0)) * 31) + (this.isReportable ? 1 : 0)) * 31);
    }

    public FacebookVideoContent(String str, Video video2, SizedUrl sizedUrl, String str2, String str3, boolean z, boolean z2, ArrayList arrayList) {
        C66581MXm.A1R(str, video2, arrayList);
        this.contentId = str;
        this.video = video2;
        this.thumbnail = sizedUrl;
        this.title = str2;
        this.subtitle = str3;
        this.isLiveStreaming = z;
        this.isReportable = z2;
        this.availableCaptionLocales = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FacebookVideoContent{contentId=");
        A1A.append(this.contentId);
        A1A.append(",video=");
        A1A.append(this.video);
        A1A.append(",thumbnail=");
        A1A.append(this.thumbnail);
        A1A.append(",title=");
        A1A.append(this.title);
        A1A.append(",subtitle=");
        A1A.append(this.subtitle);
        A1A.append(",isLiveStreaming=");
        A1A.append(this.isLiveStreaming);
        A1A.append(",isReportable=");
        A1A.append(this.isReportable);
        A1A.append(",availableCaptionLocales=");
        return C66582MXn.A0v(this.availableCaptionLocales, A1A);
    }
}
