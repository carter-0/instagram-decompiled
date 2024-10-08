package exoplayer2.av1.src;

import X.AnonymousClass5Oj;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;

public class Dav1dOutputBuffer extends AnonymousClass5Oj {
    public int bufferId = -1;
    public ColorInfo colorInfo;
    public ByteBuffer data;
    public int height;
    public int mode = -1;
    public final Dav1dDecoder owner;
    public int width;

    public void clear() {
        if (this.bufferId != -1 && this.mode == 0) {
            this.owner.releaseOutputBufferInternalDav1d(this);
        }
        super.clear();
    }

    public boolean initForRgb(int i, int i2) {
        int i3;
        this.width = i;
        this.height = i2;
        if (i < 0 || i2 < 0) {
            return false;
        }
        if ((i2 > 0 && i >= Integer.MAX_VALUE / i2) || (i3 = i * i2) < 0 || i3 >= 1073741823) {
            return false;
        }
        int i4 = i3 * 2;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i4) {
            this.data = ByteBuffer.allocateDirect(i4);
            return true;
        }
        this.data.position(0);
        this.data.limit(i4);
        return true;
    }

    public boolean initForYuvSurface(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.bufferId = i3;
        return true;
    }

    public void release() {
        this.owner.A04(this);
    }

    public Dav1dOutputBuffer(Dav1dDecoder dav1dDecoder) {
        this.owner = dav1dDecoder;
    }
}
