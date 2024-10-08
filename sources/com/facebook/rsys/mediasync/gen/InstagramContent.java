package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class InstagramContent {
    public static 2LV CONVERTER = C71546Omh.A00(53);
    public static long sMcfTypeId;
    public final AudioAttribution audioAttribution;
    public final ArrayList carousel;
    public final String contentId;
    public final ArrayList images;
    public final int mediaType;
    public final InstagramContentOwner owner;
    public final int productType;
    public final String thumbnailUrl;
    public final String trackingToken;
    public final Video video;

    public static native InstagramContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InstagramContent)) {
                return false;
            }
            InstagramContent instagramContent = (InstagramContent) obj;
            if (!this.contentId.equals(instagramContent.contentId) || !this.owner.equals(instagramContent.owner) || this.mediaType != instagramContent.mediaType || this.productType != instagramContent.productType || !this.thumbnailUrl.equals(instagramContent.thumbnailUrl)) {
                return false;
            }
            ArrayList arrayList = this.images;
            ArrayList arrayList2 = instagramContent.images;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            Video video2 = this.video;
            Video video3 = instagramContent.video;
            if (video2 == null) {
                if (video3 != null) {
                    return false;
                }
            } else if (!video2.equals(video3)) {
                return false;
            }
            ArrayList arrayList3 = this.carousel;
            ArrayList arrayList4 = instagramContent.carousel;
            if (arrayList3 == null) {
                if (arrayList4 != null) {
                    return false;
                }
            } else if (!arrayList3.equals(arrayList4)) {
                return false;
            }
            AudioAttribution audioAttribution2 = this.audioAttribution;
            AudioAttribution audioAttribution3 = instagramContent.audioAttribution;
            if (audioAttribution2 == null) {
                if (audioAttribution3 != null) {
                    return false;
                }
            } else if (!audioAttribution2.equals(audioAttribution3)) {
                return false;
            }
            String str = this.trackingToken;
            String str2 = instagramContent.trackingToken;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int A06 = C66583MXo.A06(this.contentId);
        return ((((((((AnonymousClass7TF.A08(this.thumbnailUrl, (((AnonymousClass7TF.A07(this.owner, A06) + this.mediaType) * 31) + this.productType) * 31) + AnonymousClass7TG.A0C(this.images)) * 31) + AnonymousClass7TG.A0C(this.video)) * 31) + AnonymousClass7TG.A0C(this.carousel)) * 31) + AnonymousClass7TG.A0C(this.audioAttribution)) * 31) + C41845B3m.A00(this.trackingToken);
    }

    public InstagramContent(String str, InstagramContentOwner instagramContentOwner, int i, int i2, String str2, ArrayList arrayList, Video video2, ArrayList arrayList2, AudioAttribution audioAttribution2, String str3) {
        C66581MXm.A1R(str, instagramContentOwner, str2);
        this.contentId = str;
        this.owner = instagramContentOwner;
        this.mediaType = i;
        this.productType = i2;
        this.thumbnailUrl = str2;
        this.images = arrayList;
        this.video = video2;
        this.carousel = arrayList2;
        this.audioAttribution = audioAttribution2;
        this.trackingToken = str3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("InstagramContent{contentId=");
        A1A.append(this.contentId);
        A1A.append(AnonymousClass000.A00(2057));
        A1A.append(this.owner);
        A1A.append(",mediaType=");
        A1A.append(this.mediaType);
        A1A.append(",productType=");
        A1A.append(this.productType);
        A1A.append(",thumbnailUrl=");
        A1A.append(this.thumbnailUrl);
        A1A.append(",images=");
        A1A.append(this.images);
        A1A.append(",video=");
        A1A.append(this.video);
        A1A.append(",carousel=");
        A1A.append(this.carousel);
        A1A.append(",audioAttribution=");
        A1A.append(this.audioAttribution);
        A1A.append(",trackingToken=");
        return C66584MXp.A0a(this.trackingToken, A1A);
    }
}
