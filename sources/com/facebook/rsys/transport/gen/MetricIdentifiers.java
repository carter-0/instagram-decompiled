package com.facebook.rsys.transport.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class MetricIdentifiers {
    public static 2LV CONVERTER = C22181Xwr.A00(68);
    public static long sMcfTypeId;
    public final Long flowId;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;

    public static native MetricIdentifiers createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetricIdentifiers)) {
                return false;
            }
            MetricIdentifiers metricIdentifiers = (MetricIdentifiers) obj;
            Long l = this.flowId;
            Long l2 = metricIdentifiers.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.messageId;
            String str2 = metricIdentifiers.messageId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.remoteSignalingId;
            String str4 = metricIdentifiers.remoteSignalingId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.messageType;
            String str6 = metricIdentifiers.messageType;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C66583MXo.A01(AnonymousClass7TG.A0C(this.flowId)) + AnonymousClass7TG.A0E(this.messageId)) * 31) + AnonymousClass7TG.A0E(this.remoteSignalingId)) * 31) + C41845B3m.A00(this.messageType);
    }

    public MetricIdentifiers(Long l, String str, String str2, String str3) {
        this.flowId = l;
        this.messageId = str;
        this.remoteSignalingId = str2;
        this.messageType = str3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetricIdentifiers{flowId=");
        A1A.append(this.flowId);
        A1A.append(",messageId=");
        A1A.append(this.messageId);
        A1A.append(",remoteSignalingId=");
        A1A.append(this.remoteSignalingId);
        A1A.append(",messageType=");
        return C66584MXp.A0a(this.messageType, A1A);
    }
}
