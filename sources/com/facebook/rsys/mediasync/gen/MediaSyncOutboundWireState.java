package com.facebook.rsys.mediasync.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class MediaSyncOutboundWireState {
    public final int action;
    public final long actionCursor;
    public final int adminMessageType;
    public final Integer carouselItemIndex;
    public final String contentId;
    public final int contentSource;
    public final String initiatorId;
    public final long mediaPositionMs;
    public final String seedContentId;
    public final String tabSource;

    public static native MediaSyncOutboundWireState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncOutboundWireState)) {
                return false;
            }
            MediaSyncOutboundWireState mediaSyncOutboundWireState = (MediaSyncOutboundWireState) obj;
            if (this.action != mediaSyncOutboundWireState.action || this.mediaPositionMs != mediaSyncOutboundWireState.mediaPositionMs || !this.contentId.equals(mediaSyncOutboundWireState.contentId) || this.contentSource != mediaSyncOutboundWireState.contentSource || this.adminMessageType != mediaSyncOutboundWireState.adminMessageType) {
                return false;
            }
            String str = this.tabSource;
            String str2 = mediaSyncOutboundWireState.tabSource;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.actionCursor != mediaSyncOutboundWireState.actionCursor) {
                return false;
            }
            Integer num = this.carouselItemIndex;
            Integer num2 = mediaSyncOutboundWireState.carouselItemIndex;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str3 = this.seedContentId;
            String str4 = mediaSyncOutboundWireState.seedContentId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.initiatorId;
            String str6 = mediaSyncOutboundWireState.initiatorId;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int A01 = AnonymousClass7TF.A01(this.mediaPositionMs, C66583MXo.A01(this.action));
        return ((((AnonymousClass7TF.A01(this.actionCursor, (((((AnonymousClass7TF.A08(this.contentId, A01) + this.contentSource) * 31) + this.adminMessageType) * 31) + AnonymousClass7TG.A0E(this.tabSource)) * 31) + AnonymousClass7TG.A0C(this.carouselItemIndex)) * 31) + AnonymousClass7TG.A0E(this.seedContentId)) * 31) + C41845B3m.A00(this.initiatorId);
    }

    public MediaSyncOutboundWireState(int i, long j, String str, int i2, int i3, String str2, long j2, Integer num, String str3, String str4) {
        str.getClass();
        this.action = i;
        this.mediaPositionMs = j;
        this.contentId = str;
        this.contentSource = i2;
        this.adminMessageType = i3;
        this.tabSource = str2;
        this.actionCursor = j2;
        this.carouselItemIndex = num;
        this.seedContentId = str3;
        this.initiatorId = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaSyncOutboundWireState{action=");
        A1A.append(this.action);
        A1A.append(",mediaPositionMs=");
        A1A.append(this.mediaPositionMs);
        A1A.append(",contentId=");
        A1A.append(this.contentId);
        A1A.append(",contentSource=");
        A1A.append(this.contentSource);
        A1A.append(",adminMessageType=");
        A1A.append(this.adminMessageType);
        A1A.append(",tabSource=");
        A1A.append(this.tabSource);
        A1A.append(",actionCursor=");
        A1A.append(this.actionCursor);
        A1A.append(",carouselItemIndex=");
        A1A.append(this.carouselItemIndex);
        A1A.append(",seedContentId=");
        A1A.append(this.seedContentId);
        A1A.append(",initiatorId=");
        return C66584MXp.A0a(this.initiatorId, A1A);
    }
}
