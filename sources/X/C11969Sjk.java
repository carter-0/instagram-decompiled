package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.Sjk  reason: case insensitive filesystem */
public final class C11969Sjk implements C13799ThI {
    public final ByteBuffer A00;
    public final ST0 A01;
    public final List A02;

    public final void EyD() {
    }

    public final Bitmap ANg(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new C8848RCo((ByteBuffer) this.A00.position(0)), (Rect) null, options);
    }

    public final int BGB() {
        List list = this.A02;
        ByteBuffer byteBuffer = (ByteBuffer) this.A00.position(0);
        ST0 st0 = this.A01;
        if (byteBuffer != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    int BYv = ((C13795ThE) list.get(i)).BYv(st0, byteBuffer);
                    if (BYv != -1) {
                        return BYv;
                    }
                    i++;
                } finally {
                    byteBuffer.position(0);
                }
            }
        }
        return -1;
    }

    public final ImageHeaderParser$ImageType BGI() {
        return SKE.A02((ByteBuffer) this.A00.position(0), this.A02);
    }

    public C11969Sjk(ST0 st0, ByteBuffer byteBuffer, List list) {
        this.A00 = byteBuffer;
        this.A02 = list;
        this.A01 = st0;
    }
}
