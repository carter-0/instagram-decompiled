package com.facebook.rsys.log.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class LogModel {
    public static 2LV CONVERTER = C22180Xwq.A00(68);
    public static long sMcfTypeId;
    public final String callTrigger;
    public final boolean isConnectedEnd;
    public final Long peerId;
    public final String sharedCallId;
    public final Long startingBatteryLevel;
    public final boolean uploadConsoleLogAtEnd;
    public final boolean wasDeviceCharged;

    public static native LogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LogModel)) {
                return false;
            }
            LogModel logModel = (LogModel) obj;
            String str = this.sharedCallId;
            String str2 = logModel.sharedCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Long l = this.peerId;
            Long l2 = logModel.peerId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (!this.callTrigger.equals(logModel.callTrigger)) {
                return false;
            }
            Long l3 = this.startingBatteryLevel;
            Long l4 = logModel.startingBatteryLevel;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            if (!(this.wasDeviceCharged == logModel.wasDeviceCharged && this.isConnectedEnd == logModel.isConnectedEnd && this.uploadConsoleLogAtEnd == logModel.uploadConsoleLogAtEnd)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.callTrigger, (C66583MXo.A01(AnonymousClass7TG.A0E(this.sharedCallId)) + AnonymousClass7TG.A0C(this.peerId)) * 31) + AnonymousClass7TE.A0L(this.startingBatteryLevel)) * 31) + (this.wasDeviceCharged ? 1 : 0)) * 31) + (this.isConnectedEnd ? 1 : 0)) * 31) + (this.uploadConsoleLogAtEnd ? 1 : 0);
    }

    public LogModel(String str, Long l, String str2, Long l2, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        this.sharedCallId = str;
        this.peerId = l;
        this.callTrigger = str2;
        this.startingBatteryLevel = l2;
        this.wasDeviceCharged = z;
        this.isConnectedEnd = z2;
        this.uploadConsoleLogAtEnd = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LogModel{sharedCallId=");
        A1A.append(this.sharedCallId);
        A1A.append(",peerId=");
        A1A.append(this.peerId);
        A1A.append(",callTrigger=");
        A1A.append(this.callTrigger);
        A1A.append(",startingBatteryLevel=");
        A1A.append(this.startingBatteryLevel);
        A1A.append(",wasDeviceCharged=");
        A1A.append(this.wasDeviceCharged);
        A1A.append(",isConnectedEnd=");
        A1A.append(this.isConnectedEnd);
        A1A.append(",uploadConsoleLogAtEnd=");
        return C66584MXp.A0b(A1A, this.uploadConsoleLogAtEnd);
    }
}
