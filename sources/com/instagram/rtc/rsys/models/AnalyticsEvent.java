package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class AnalyticsEvent {
    public static 2LV CONVERTER = new C71545Omg(18);
    public static long sMcfTypeId;
    public final Map boolParams;
    public final boolean initiator;
    public final String localCallId;
    public final Map numberParams;
    public final String serverInfoData;
    public final int step;
    public final Map stringParams;
    public final String videoCallId;

    public static native AnalyticsEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnalyticsEvent)) {
                return false;
            }
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
            if (this.step != analyticsEvent.step || this.initiator != analyticsEvent.initiator || !this.localCallId.equals(analyticsEvent.localCallId)) {
                return false;
            }
            String str = this.videoCallId;
            String str2 = analyticsEvent.videoCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.serverInfoData;
            String str4 = analyticsEvent.serverInfoData;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!this.stringParams.equals(analyticsEvent.stringParams) || !this.numberParams.equals(analyticsEvent.numberParams) || !this.boolParams.equals(analyticsEvent.boolParams)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.localCallId, (C66583MXo.A01(this.step) + (this.initiator ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.videoCallId)) * 31) + C41845B3m.A00(this.serverInfoData)) * 31) + this.stringParams.hashCode()) * 31) + this.numberParams.hashCode()) * 31) + this.boolParams.hashCode();
    }

    public AnalyticsEvent(int i, boolean z, String str, String str2, String str3, Map map, Map map2, Map map3) {
        C66581MXm.A1R(str, map, map2);
        map3.getClass();
        this.step = i;
        this.initiator = z;
        this.localCallId = str;
        this.videoCallId = str2;
        this.serverInfoData = str3;
        this.stringParams = map;
        this.numberParams = map2;
        this.boolParams = map3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AnalyticsEvent{step=");
        A1A.append(this.step);
        A1A.append(",initiator=");
        A1A.append(this.initiator);
        A1A.append(",localCallId=");
        A1A.append(this.localCallId);
        A1A.append(",videoCallId=");
        A1A.append(this.videoCallId);
        A1A.append(",serverInfoData=");
        A1A.append(this.serverInfoData);
        A1A.append(",stringParams=");
        A1A.append(this.stringParams);
        A1A.append(",numberParams=");
        A1A.append(this.numberParams);
        A1A.append(",boolParams=");
        return C66582MXn.A0v(this.boolParams, A1A);
    }
}
