package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Sfp  reason: case insensitive filesystem */
public final class C11754Sfp implements C13512Tbd, TZe {
    public boolean A00;
    public final SJM A01;
    public final Deque A02 = new ArrayDeque();
    public final Deque A03 = new ArrayDeque();
    public final List A04 = AnonymousClass7TE.A1C();
    public final List A05 = AnonymousClass7TE.A1C();
    public final List A06 = AnonymousClass7TE.A1C();

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (bufferInfo.size != 0 && byteBuffer.remaining() != 0) {
            if ((bufferInfo.flags & 1) > 0) {
                this.A00 = true;
            }
            if (this.A00 || !MediaStreamTrack.VIDEO_TRACK_KIND.equals(SQX.A01(this.A01.A0Y))) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                allocateDirect.put(byteBuffer);
                allocateDirect.rewind();
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                bufferInfo2.set(allocateDirect.position(), allocateDirect.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                this.A02.addLast(bufferInfo2);
                this.A03.addLast(allocateDirect);
            }
        }
    }

    public final int FN2() {
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(SQX.A01(this.A01.A0Y))) {
            return 48000;
        }
        return 90000;
    }

    public C11754Sfp(SJM sjm) {
        this.A01 = sjm;
    }
}
