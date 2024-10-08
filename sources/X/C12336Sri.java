package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;

/* renamed from: X.Sri  reason: case insensitive filesystem */
public final class C12336Sri implements C13779Tgu {
    public final ByteBuffer A00 = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
    public final MediaCodec.BufferInfo A01 = new MediaCodec.BufferInfo();

    public final void EQ8(int i, int i2, long j, int i3) {
        this.A01.set(0, i2, j, i3);
    }

    public final MediaCodec.BufferInfo AiO() {
        return this.A01;
    }

    public final ByteBuffer AjB() {
        return this.A00;
    }
}
