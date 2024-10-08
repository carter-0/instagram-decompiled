package com.facebook.rsys.stream.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22181Xwr;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoStreamSendParams {
    public static 2LV CONVERTER = C22181Xwr.A00(66);
    public static long sMcfTypeId;
    public final double bitratePriority;
    public final int maxBitrateBps;
    public final int maxFrameRate;
    public final int minBitrateBps;
    public final double scaleResolutionDownBy;

    public static native VideoStreamSendParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStreamSendParams)) {
            return false;
        }
        VideoStreamSendParams videoStreamSendParams = (VideoStreamSendParams) obj;
        return this.maxFrameRate == videoStreamSendParams.maxFrameRate && this.minBitrateBps == videoStreamSendParams.minBitrateBps && this.maxBitrateBps == videoStreamSendParams.maxBitrateBps && this.bitratePriority == videoStreamSendParams.bitratePriority && this.scaleResolutionDownBy == videoStreamSendParams.scaleResolutionDownBy;
    }

    public int hashCode() {
        int A01 = AnonymousClass7TF.A01(Double.doubleToLongBits(this.bitratePriority), (((C66583MXo.A01(this.maxFrameRate) + this.minBitrateBps) * 31) + this.maxBitrateBps) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.scaleResolutionDownBy);
        return A01 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public VideoStreamSendParams(int i, int i2, int i3, double d, double d2) {
        this.maxFrameRate = i;
        this.minBitrateBps = i2;
        this.maxBitrateBps = i3;
        this.bitratePriority = d;
        this.scaleResolutionDownBy = d2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoStreamSendParams{maxFrameRate=");
        A1A.append(this.maxFrameRate);
        A1A.append(",minBitrateBps=");
        A1A.append(this.minBitrateBps);
        A1A.append(",maxBitrateBps=");
        A1A.append(this.maxBitrateBps);
        A1A.append(",bitratePriority=");
        A1A.append(this.bitratePriority);
        A1A.append(",scaleResolutionDownBy=");
        A1A.append(this.scaleResolutionDownBy);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
