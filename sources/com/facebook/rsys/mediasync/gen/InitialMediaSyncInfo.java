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

public class InitialMediaSyncInfo {
    public static 2LV CONVERTER = C71546Omh.A00(52);
    public static long sMcfTypeId;
    public final int action;
    public final int adminMessageType;
    public final Integer carouselItemIndex;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final String initiatorId;
    public final Long mediaPositionMs;
    public final String seedContentId;
    public final String tabSource;

    public static native InitialMediaSyncInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InitialMediaSyncInfo)) {
                return false;
            }
            InitialMediaSyncInfo initialMediaSyncInfo = (InitialMediaSyncInfo) obj;
            if (this.action != initialMediaSyncInfo.action || !this.contentId.equals(initialMediaSyncInfo.contentId) || this.contentSource != initialMediaSyncInfo.contentSource) {
                return false;
            }
            Long l = this.mediaPositionMs;
            Long l2 = initialMediaSyncInfo.mediaPositionMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            MediaSyncContent mediaSyncContent = this.content;
            MediaSyncContent mediaSyncContent2 = initialMediaSyncInfo.content;
            if (mediaSyncContent == null) {
                if (mediaSyncContent2 != null) {
                    return false;
                }
            } else if (!mediaSyncContent.equals(mediaSyncContent2)) {
                return false;
            }
            if (this.adminMessageType != initialMediaSyncInfo.adminMessageType) {
                return false;
            }
            String str = this.tabSource;
            String str2 = initialMediaSyncInfo.tabSource;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Integer num = this.carouselItemIndex;
            Integer num2 = initialMediaSyncInfo.carouselItemIndex;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str3 = this.seedContentId;
            String str4 = initialMediaSyncInfo.seedContentId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.initiatorId;
            String str6 = initialMediaSyncInfo.initiatorId;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass7TF.A08(this.contentId, C66583MXo.A01(this.action)) + this.contentSource) * 31) + AnonymousClass7TG.A0C(this.mediaPositionMs)) * 31) + AnonymousClass7TG.A0C(this.content)) * 31) + this.adminMessageType) * 31) + AnonymousClass7TG.A0E(this.tabSource)) * 31) + AnonymousClass7TG.A0C(this.carouselItemIndex)) * 31) + AnonymousClass7TG.A0E(this.seedContentId)) * 31) + C41845B3m.A00(this.initiatorId);
    }

    public InitialMediaSyncInfo(int i, String str, int i2, Long l, MediaSyncContent mediaSyncContent, int i3, String str2, Integer num, String str3, String str4) {
        str.getClass();
        this.action = i;
        this.contentId = str;
        this.contentSource = i2;
        this.mediaPositionMs = l;
        this.content = mediaSyncContent;
        this.adminMessageType = i3;
        this.tabSource = str2;
        this.carouselItemIndex = num;
        this.seedContentId = str3;
        this.initiatorId = str4;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("InitialMediaSyncInfo{action=");
        A1A.append(this.action);
        A1A.append(",contentId=");
        A1A.append(this.contentId);
        A1A.append(",contentSource=");
        A1A.append(this.contentSource);
        A1A.append(",mediaPositionMs=");
        A1A.append(this.mediaPositionMs);
        A1A.append(",content=");
        A1A.append(this.content);
        A1A.append(",adminMessageType=");
        A1A.append(this.adminMessageType);
        A1A.append(",tabSource=");
        A1A.append(this.tabSource);
        A1A.append(",carouselItemIndex=");
        A1A.append(this.carouselItemIndex);
        A1A.append(",seedContentId=");
        A1A.append(this.seedContentId);
        A1A.append(",initiatorId=");
        return C66584MXp.A0a(this.initiatorId, A1A);
    }
}
