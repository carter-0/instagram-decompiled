package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class SKE {
    public static int A00(ST0 st0, InputStream inputStream, List list) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new RC9(st0, inputStream);
            }
            inputStream.mark(5242880);
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    int BYu = ((C13795ThE) list.get(i)).BYu(st0, inputStream);
                    if (BYu != -1) {
                        return BYu;
                    }
                    i++;
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType A01(ST0 st0, InputStream inputStream, List list) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new RC9(st0, inputStream);
            }
            inputStream.mark(5242880);
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    ImageHeaderParser$ImageType CAC = ((C13795ThE) list.get(i)).CAC(inputStream);
                    inputStream.reset();
                    if (CAC != ImageHeaderParser$ImageType.UNKNOWN) {
                        return CAC;
                    }
                    i++;
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType A02(ByteBuffer byteBuffer, List list) {
        if (byteBuffer != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    ImageHeaderParser$ImageType CAD = ((C13795ThE) list.get(i)).CAD(byteBuffer);
                    byteBuffer.position(0);
                    if (CAD != ImageHeaderParser$ImageType.UNKNOWN) {
                        return CAD;
                    }
                    i++;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
