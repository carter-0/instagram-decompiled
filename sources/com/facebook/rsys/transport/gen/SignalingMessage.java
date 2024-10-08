package com.facebook.rsys.transport.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22179Xwp;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

public class SignalingMessage {
    public static 2LV CONVERTER = new C22179Xwp(0);
    public static long sMcfTypeId;
    public final boolean disableInlineProcessing;
    public final McfReference extraContext;
    public final SignalingMessageIncomingStats incomingStats;
    public final MetricIdentifiers metricIdentifiers;
    public final byte[] payload;
    public final int transportChannel;

    public static native SignalingMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SignalingMessage)) {
                return false;
            }
            SignalingMessage signalingMessage = (SignalingMessage) obj;
            if (this.transportChannel != signalingMessage.transportChannel || !this.metricIdentifiers.equals(signalingMessage.metricIdentifiers) || !Arrays.equals(this.payload, signalingMessage.payload)) {
                return false;
            }
            McfReference mcfReference = this.extraContext;
            McfReference mcfReference2 = signalingMessage.extraContext;
            if (mcfReference == null) {
                if (mcfReference2 != null) {
                    return false;
                }
            } else if (!mcfReference.equals(mcfReference2)) {
                return false;
            }
            SignalingMessageIncomingStats signalingMessageIncomingStats = this.incomingStats;
            SignalingMessageIncomingStats signalingMessageIncomingStats2 = signalingMessage.incomingStats;
            if (signalingMessageIncomingStats == null) {
                if (signalingMessageIncomingStats2 != null) {
                    return false;
                }
            } else if (!signalingMessageIncomingStats.equals(signalingMessageIncomingStats2)) {
                return false;
            }
            return this.disableInlineProcessing == signalingMessage.disableInlineProcessing;
        }
    }

    public int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.metricIdentifiers, C66583MXo.A01(this.transportChannel)) + Arrays.hashCode(this.payload)) * 31) + AnonymousClass7TG.A0C(this.extraContext)) * 31) + AnonymousClass7TE.A0L(this.incomingStats)) * 31) + (this.disableInlineProcessing ? 1 : 0);
    }

    public SignalingMessage(int i, MetricIdentifiers metricIdentifiers2, byte[] bArr, McfReference mcfReference, SignalingMessageIncomingStats signalingMessageIncomingStats, boolean z) {
        metricIdentifiers2.getClass();
        bArr.getClass();
        this.transportChannel = i;
        this.metricIdentifiers = metricIdentifiers2;
        this.payload = bArr;
        this.extraContext = mcfReference;
        this.incomingStats = signalingMessageIncomingStats;
        this.disableInlineProcessing = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SignalingMessage{transportChannel=");
        A1A.append(this.transportChannel);
        A1A.append(",metricIdentifiers=");
        A1A.append(this.metricIdentifiers);
        A1A.append(",payload=");
        A1A.append(this.payload);
        A1A.append(",extraContext=");
        A1A.append(this.extraContext);
        A1A.append(",incomingStats=");
        A1A.append(this.incomingStats);
        A1A.append(",disableInlineProcessing=");
        return C66584MXp.A0b(A1A, this.disableInlineProcessing);
    }
}
