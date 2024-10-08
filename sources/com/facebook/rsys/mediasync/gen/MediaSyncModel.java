package com.facebook.rsys.mediasync.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class MediaSyncModel {
    public final boolean isRefresh;
    public final MediaSyncOutboundWireState outboundWireState;
    public final MediaSyncState state;

    public static native MediaSyncModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncModel)) {
                return false;
            }
            MediaSyncModel mediaSyncModel = (MediaSyncModel) obj;
            MediaSyncState mediaSyncState = this.state;
            MediaSyncState mediaSyncState2 = mediaSyncModel.state;
            if (mediaSyncState == null) {
                if (mediaSyncState2 != null) {
                    return false;
                }
            } else if (!mediaSyncState.equals(mediaSyncState2)) {
                return false;
            }
            MediaSyncOutboundWireState mediaSyncOutboundWireState = this.outboundWireState;
            MediaSyncOutboundWireState mediaSyncOutboundWireState2 = mediaSyncModel.outboundWireState;
            if (mediaSyncOutboundWireState == null) {
                if (mediaSyncOutboundWireState2 != null) {
                    return false;
                }
            } else if (!mediaSyncOutboundWireState.equals(mediaSyncOutboundWireState2)) {
                return false;
            }
            return this.isRefresh == mediaSyncModel.isRefresh;
        }
    }

    public final int hashCode() {
        return ((C66583MXo.A01(AnonymousClass7TG.A0C(this.state)) + AnonymousClass7TE.A0L(this.outboundWireState)) * 31) + (this.isRefresh ? 1 : 0);
    }

    public MediaSyncModel(MediaSyncState mediaSyncState, MediaSyncOutboundWireState mediaSyncOutboundWireState, boolean z) {
        this.state = mediaSyncState;
        this.outboundWireState = mediaSyncOutboundWireState;
        this.isRefresh = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaSyncModel{state=");
        A1A.append(this.state);
        A1A.append(",outboundWireState=");
        A1A.append(this.outboundWireState);
        A1A.append(",isRefresh=");
        return C66584MXp.A0b(A1A, this.isRefresh);
    }
}
