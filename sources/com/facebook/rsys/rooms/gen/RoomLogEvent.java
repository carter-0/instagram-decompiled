package com.facebook.rsys.rooms.gen;

import X.002;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomLogEvent {
    public final String eventName;
    public final String linkUrl;
    public final String localCallId;

    public static native RoomLogEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomLogEvent)) {
                return false;
            }
            RoomLogEvent roomLogEvent = (RoomLogEvent) obj;
            String str = this.linkUrl;
            String str2 = roomLogEvent.linkUrl;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.eventName.equals(roomLogEvent.eventName) || !this.localCallId.equals(roomLogEvent.localCallId)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.localCallId, AnonymousClass7TF.A08(this.eventName, C66583MXo.A01(AnonymousClass7TG.A0E(this.linkUrl))));
    }

    public final String toString() {
        return 002.A15("RoomLogEvent{linkUrl=", this.linkUrl, ",eventName=", this.eventName, ",localCallId=", this.localCallId, "}");
    }

    public RoomLogEvent(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.linkUrl = str;
        this.eventName = str2;
        this.localCallId = str3;
    }
}
