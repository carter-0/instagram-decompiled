package X;

import android.media.MediaCodec;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* renamed from: X.ThA  reason: case insensitive filesystem */
public interface C13793ThA {
    void A9N(Metadata.Entry entry);

    C11754Sfp AAY(SJM sjm);

    void FO6(MediaCodec.BufferInfo bufferInfo, TZe tZe, ByteBuffer byteBuffer);

    void close();
}
