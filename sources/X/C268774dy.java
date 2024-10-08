package X;

import android.graphics.Bitmap;

/* renamed from: X.4dy  reason: invalid class name and case insensitive filesystem */
public final class C268774dy {
    public static final C268774dy A02;
    public final Bitmap.Config A00;
    public final Bitmap.Config A01;

    public C268774dy(Bitmap.Config config, Bitmap.Config config2) {
        this.A01 = config2;
        this.A00 = config;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    static {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        A02 = new C268774dy(config, config);
    }

    public final String toString() {
        C67489Moj moj = new C67489Moj(getClass().getSimpleName());
        C67489Moj.A00(moj, String.valueOf(100), "minDecodeIntervalMs");
        C67489Moj.A00(moj, String.valueOf(Integer.MAX_VALUE), "maxDimensionPx");
        String valueOf = String.valueOf(false);
        C67489Moj.A00(moj, valueOf, "decodePreviewFrame");
        C67489Moj.A00(moj, valueOf, "useLastFrameForPreview");
        C67489Moj.A00(moj, valueOf, "useEncodedImageForPreview");
        C67489Moj.A00(moj, valueOf, "decodeAllFrames");
        C67489Moj.A00(moj, valueOf, "forceStaticImage");
        C67489Moj.A00(moj, this.A01.name(), "bitmapConfigName");
        C67489Moj.A00(moj, this.A00.name(), "animatedBitmapConfigName");
        C67489Moj.A00(moj, (Object) null, "customImageDecoder");
        C67489Moj.A00(moj, (Object) null, "bitmapTransformation");
        C67489Moj.A00(moj, (Object) null, "colorSpace");
        return 002.A0g("ImageDecodeOptions{", moj.toString(), "}");
    }

    public final int hashCode() {
        return (((-552645669 + this.A01.ordinal()) * 31) + this.A00.ordinal()) * 31 * 31 * 31;
    }
}
