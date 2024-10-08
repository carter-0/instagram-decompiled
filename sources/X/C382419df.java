package X;

import android.media.MediaCodec;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9df  reason: invalid class name and case insensitive filesystem */
public final class C382419df extends C341667nK {
    public final AtomicInteger A00 = new AtomicInteger(4);

    public final void A03(MediaCodec.BufferInfo bufferInfo, C341767nU r4, ByteBuffer byteBuffer) {
        AtomicInteger atomicInteger;
        C341767nU r0;
        if (this.A07.A05) {
            int i = bufferInfo.flags;
            if ((1048576 & i) != 0) {
                atomicInteger = this.A00;
                r0 = C341767nU.SUPERNOVA_AUDIO;
            } else if ((i & 2097152) != 0) {
                atomicInteger = this.A00;
                r0 = C341767nU.AUDIO;
            } else if (r4.ordinal() == this.A00.get()) {
                return;
            } else {
                if (r4 == C341767nU.SUPERNOVA_AUDIO) {
                    r4 = C341767nU.AUDIO;
                }
            }
            atomicInteger.set(r0.ordinal());
            return;
        }
        super.A03(bufferInfo, r4, byteBuffer);
    }

    public final void A05(C341687nM r4, AD9 ad9, C39676A4s a4s) {
        C341767nU r0;
        Integer num = ad9.A03;
        if (num != null) {
            AtomicInteger atomicInteger = this.A00;
            if (num == AnonymousClass05K.A00) {
                r0 = C341767nU.SUPERNOVA_AUDIO;
            } else {
                r0 = C341767nU.AUDIO;
            }
            atomicInteger.set(r0.ordinal());
        }
        super.A05(r4, ad9, a4s);
    }

    public C382419df(Handler handler, C343967r6 r4, C341567nA r5) {
        super(handler, r4, r5);
    }
}
