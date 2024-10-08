package com.facebook.rsys.mosaicgrid.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class MosaicGridParams {
    public static 2LV CONVERTER = C71546Omh.A00(68);
    public static long sMcfTypeId;
    public final FrameSize initialVideoSize;
    public final boolean isMosaicGridCapable;

    public static native MosaicGridParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MosaicGridParams)) {
            return false;
        }
        MosaicGridParams mosaicGridParams = (MosaicGridParams) obj;
        return this.isMosaicGridCapable == mosaicGridParams.isMosaicGridCapable && this.initialVideoSize.equals(mosaicGridParams.initialVideoSize);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.initialVideoSize, C66583MXo.A01(this.isMosaicGridCapable ? 1 : 0));
    }

    public MosaicGridParams(boolean z, FrameSize frameSize) {
        frameSize.getClass();
        this.isMosaicGridCapable = z;
        this.initialVideoSize = frameSize;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MosaicGridParams{isMosaicGridCapable=");
        A1A.append(this.isMosaicGridCapable);
        A1A.append(",initialVideoSize=");
        return C66582MXn.A0v(this.initialVideoSize, A1A);
    }
}
