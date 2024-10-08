package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Shd  reason: case insensitive filesystem */
public final class C11851Shd implements C13795ThE {
    public final int BYu(ST0 st0, InputStream inputStream) {
        int A0M = new C227922kK(inputStream).A0M("Orientation", 1);
        if (A0M == 0) {
            return -1;
        }
        return A0M;
    }

    public final int BYv(ST0 st0, ByteBuffer byteBuffer) {
        return BYu(st0, new C8848RCo(byteBuffer));
    }

    public final ImageHeaderParser$ImageType CAC(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final ImageHeaderParser$ImageType CAD(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
