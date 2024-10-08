package X;

/* renamed from: X.S3l  reason: case insensitive filesystem */
public abstract class C10977S3l {
    public static final SJ8 A00;
    public static final C10977S3l A01 = new Object();
    public static final C10977S3l A02;
    public static final C10977S3l A03;
    public static final C10977S3l A04 = new Object();
    public static final C10977S3l A05 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S3l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.S3l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.S3l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.S3l, java.lang.Object] */
    static {
        ? obj = new Object();
        A02 = obj;
        A03 = obj;
        A00 = new SJ8(SJ8.A04, obj, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public final float A00(int i, int i2, int i3, int i4) {
        if (this instanceof QHJ) {
            return 1.0f;
        }
        if (this instanceof QHI) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
        if (this instanceof QHH) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
        return Math.min(1.0f, A04.A00(i, i2, i3, i4));
    }

    public final Integer A01(int i, int i2, int i3, int i4) {
        if ((this instanceof QHJ) || (this instanceof QHI) || (this instanceof QHH) || A00(i, i2, i3, i4) == 1.0f) {
            return AnonymousClass05K.A01;
        }
        return A04.A01(i, i2, i3, i4);
    }
}
