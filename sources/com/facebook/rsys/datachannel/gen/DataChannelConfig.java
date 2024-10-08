package com.facebook.rsys.datachannel.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

public class DataChannelConfig {
    public static 2LV CONVERTER = C22180Xwq.A00(40);
    public static long sMcfTypeId;
    public final byte[] initialStateSyncData;
    public final boolean isE2ee;
    public final Long maxRetransmitTime;
    public final Long maxRetransmits;
    public final boolean ordered;
    public final int priority;
    public final boolean sendDataOnCallStart;
    public final int transportType;

    public static native DataChannelConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataChannelConfig)) {
                return false;
            }
            DataChannelConfig dataChannelConfig = (DataChannelConfig) obj;
            if (this.ordered != dataChannelConfig.ordered) {
                return false;
            }
            Long l = this.maxRetransmitTime;
            Long l2 = dataChannelConfig.maxRetransmitTime;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.maxRetransmits;
            Long l4 = dataChannelConfig.maxRetransmits;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            if (this.transportType != dataChannelConfig.transportType) {
                return false;
            }
            byte[] bArr = this.initialStateSyncData;
            byte[] bArr2 = dataChannelConfig.initialStateSyncData;
            if (bArr == null) {
                if (bArr2 != null) {
                    return false;
                }
            } else if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            if (!(this.sendDataOnCallStart == dataChannelConfig.sendDataOnCallStart && this.isE2ee == dataChannelConfig.isE2ee && this.priority == dataChannelConfig.priority)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((C66583MXo.A01(this.ordered ? 1 : 0) + AnonymousClass7TG.A0C(this.maxRetransmitTime)) * 31) + AnonymousClass7TG.A0C(this.maxRetransmits)) * 31) + this.transportType) * 31) + AnonymousClass7TE.A0L(this.initialStateSyncData)) * 31) + (this.sendDataOnCallStart ? 1 : 0)) * 31) + (this.isE2ee ? 1 : 0)) * 31) + this.priority;
    }

    public DataChannelConfig(boolean z, Long l, Long l2, int i, byte[] bArr, boolean z2, boolean z3, int i2) {
        this.ordered = z;
        this.maxRetransmitTime = l;
        this.maxRetransmits = l2;
        this.transportType = i;
        this.initialStateSyncData = bArr;
        this.sendDataOnCallStart = z2;
        this.isE2ee = z3;
        this.priority = i2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DataChannelConfig{ordered=");
        A1A.append(this.ordered);
        A1A.append(",maxRetransmitTime=");
        A1A.append(this.maxRetransmitTime);
        A1A.append(",maxRetransmits=");
        A1A.append(this.maxRetransmits);
        A1A.append(",transportType=");
        A1A.append(this.transportType);
        A1A.append(",initialStateSyncData=");
        A1A.append(this.initialStateSyncData);
        A1A.append(",sendDataOnCallStart=");
        A1A.append(this.sendDataOnCallStart);
        A1A.append(",isE2ee=");
        A1A.append(this.isE2ee);
        A1A.append(",priority=");
        return C21056XCh.A0A(A1A, this.priority);
    }
}
