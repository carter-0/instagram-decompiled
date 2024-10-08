package com.facebook.rsys.mosaicgrid.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class GridParticipantMediaInfo {
    public static 2LV CONVERTER = C71546Omh.A00(65);
    public static long sMcfTypeId;
    public final boolean isMosaicGridCapable;
    public final FrameSize videoSize;

    public static native GridParticipantMediaInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridParticipantMediaInfo)) {
            return false;
        }
        GridParticipantMediaInfo gridParticipantMediaInfo = (GridParticipantMediaInfo) obj;
        return this.isMosaicGridCapable == gridParticipantMediaInfo.isMosaicGridCapable && this.videoSize.equals(gridParticipantMediaInfo.videoSize);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.videoSize, C66583MXo.A01(this.isMosaicGridCapable ? 1 : 0));
    }

    public GridParticipantMediaInfo(boolean z, FrameSize frameSize) {
        frameSize.getClass();
        this.isMosaicGridCapable = z;
        this.videoSize = frameSize;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridParticipantMediaInfo{isMosaicGridCapable=");
        A1A.append(this.isMosaicGridCapable);
        A1A.append(",videoSize=");
        return C66582MXn.A0v(this.videoSize, A1A);
    }
}
