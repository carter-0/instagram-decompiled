package com.facebook.rsys.photobooth.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class PhotoboothModel {
    public static 2LV CONVERTER = C71546Omh.A00(70);
    public static long sMcfTypeId;
    public final long actionTimeMs;
    public final int actionType;
    public final String actorId;
    public final short captureIntervalMs;
    public final long delayMs;
    public final boolean isStarted;
    public final long localClockOffsetMs;
    public final short totalCaptures;
    public final String username;

    public static native PhotoboothModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PhotoboothModel)) {
                return false;
            }
            PhotoboothModel photoboothModel = (PhotoboothModel) obj;
            if (this.isStarted != photoboothModel.isStarted || this.totalCaptures != photoboothModel.totalCaptures || this.captureIntervalMs != photoboothModel.captureIntervalMs || this.actionTimeMs != photoboothModel.actionTimeMs || this.localClockOffsetMs != photoboothModel.localClockOffsetMs || this.delayMs != photoboothModel.delayMs) {
                return false;
            }
            String str = this.username;
            String str2 = photoboothModel.username;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.actorId;
            String str4 = photoboothModel.actorId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            return this.actionType == photoboothModel.actionType;
        }
    }

    public int hashCode() {
        return ((((AnonymousClass7TF.A01(this.delayMs, AnonymousClass7TF.A01(this.localClockOffsetMs, AnonymousClass7TF.A01(this.actionTimeMs, (((C66583MXo.A01(this.isStarted ? 1 : 0) + this.totalCaptures) * 31) + this.captureIntervalMs) * 31))) + AnonymousClass7TG.A0E(this.username)) * 31) + C41845B3m.A00(this.actorId)) * 31) + this.actionType;
    }

    public PhotoboothModel(boolean z, short s, short s2, long j, long j2, long j3, String str, String str2, int i) {
        Short.valueOf(s).getClass();
        Short.valueOf(s2).getClass();
        this.isStarted = z;
        this.totalCaptures = s;
        this.captureIntervalMs = s2;
        this.actionTimeMs = j;
        this.localClockOffsetMs = j2;
        this.delayMs = j3;
        this.username = str;
        this.actorId = str2;
        this.actionType = i;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PhotoboothModel{isStarted=");
        A1A.append(this.isStarted);
        A1A.append(",totalCaptures=");
        A1A.append(this.totalCaptures);
        A1A.append(",captureIntervalMs=");
        A1A.append(this.captureIntervalMs);
        A1A.append(",actionTimeMs=");
        A1A.append(this.actionTimeMs);
        A1A.append(",localClockOffsetMs=");
        A1A.append(this.localClockOffsetMs);
        A1A.append(",delayMs=");
        A1A.append(this.delayMs);
        A1A.append(",username=");
        A1A.append(this.username);
        A1A.append(",actorId=");
        A1A.append(this.actorId);
        A1A.append(",actionType=");
        A1A.append(this.actionType);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
