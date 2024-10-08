package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51972G9s;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class MediaSyncState {
    public static 2LV CONVERTER = C71546Omh.A00(57);
    public static long sMcfTypeId;
    public final int action;
    public final ActionMetadata actionMetadata;
    public final String actorId;
    public final String adminMessage;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final String initiatorId;
    public final boolean isRefresh;
    public final long localClockOffsetMs;
    public final String seedContentId;
    public final String tabSource;

    public static native MediaSyncState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncState)) {
                return false;
            }
            MediaSyncState mediaSyncState = (MediaSyncState) obj;
            if (this.action != mediaSyncState.action || !this.actionMetadata.equals(mediaSyncState.actionMetadata) || !this.contentId.equals(mediaSyncState.contentId) || this.contentSource != mediaSyncState.contentSource) {
                return false;
            }
            MediaSyncContent mediaSyncContent = this.content;
            MediaSyncContent mediaSyncContent2 = mediaSyncState.content;
            if (mediaSyncContent == null) {
                if (mediaSyncContent2 != null) {
                    return false;
                }
            } else if (!mediaSyncContent.equals(mediaSyncContent2)) {
                return false;
            }
            String str = this.adminMessage;
            String str2 = mediaSyncState.adminMessage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.localClockOffsetMs != mediaSyncState.localClockOffsetMs) {
                return false;
            }
            String str3 = this.tabSource;
            String str4 = mediaSyncState.tabSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.isRefresh != mediaSyncState.isRefresh) {
                return false;
            }
            String str5 = this.actorId;
            String str6 = mediaSyncState.actorId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.seedContentId;
            String str8 = mediaSyncState.seedContentId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.initiatorId;
            String str10 = mediaSyncState.initiatorId;
            if (str9 != null) {
                return str9.equals(str10);
            }
            if (str10 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.actionMetadata, C66583MXo.A01(this.action));
        return ((((((((C51972G9s.A07(this.localClockOffsetMs, (((((AnonymousClass7TF.A08(this.contentId, A07) + this.contentSource) * 31) + AnonymousClass7TG.A0C(this.content)) * 31) + AnonymousClass7TG.A0E(this.adminMessage)) * 31) + AnonymousClass7TG.A0E(this.tabSource)) * 31) + (this.isRefresh ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.actorId)) * 31) + AnonymousClass7TG.A0E(this.seedContentId)) * 31) + C41845B3m.A00(this.initiatorId);
    }

    public MediaSyncState(int i, ActionMetadata actionMetadata2, String str, int i2, MediaSyncContent mediaSyncContent, String str2, long j, String str3, boolean z, String str4, String str5, String str6) {
        actionMetadata2.getClass();
        str.getClass();
        this.action = i;
        this.actionMetadata = actionMetadata2;
        this.contentId = str;
        this.contentSource = i2;
        this.content = mediaSyncContent;
        this.adminMessage = str2;
        this.localClockOffsetMs = j;
        this.tabSource = str3;
        this.isRefresh = z;
        this.actorId = str4;
        this.seedContentId = str5;
        this.initiatorId = str6;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaSyncState{action=");
        A1A.append(this.action);
        A1A.append(",actionMetadata=");
        A1A.append(this.actionMetadata);
        A1A.append(",contentId=");
        A1A.append(this.contentId);
        A1A.append(",contentSource=");
        A1A.append(this.contentSource);
        A1A.append(",content=");
        A1A.append(this.content);
        A1A.append(",adminMessage=");
        A1A.append(this.adminMessage);
        A1A.append(",localClockOffsetMs=");
        A1A.append(this.localClockOffsetMs);
        A1A.append(",tabSource=");
        A1A.append(this.tabSource);
        A1A.append(",isRefresh=");
        A1A.append(this.isRefresh);
        A1A.append(",actorId=");
        A1A.append(this.actorId);
        A1A.append(",seedContentId=");
        A1A.append(this.seedContentId);
        A1A.append(",initiatorId=");
        return C66584MXp.A0a(this.initiatorId, A1A);
    }
}
