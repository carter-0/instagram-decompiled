package X;

import android.media.MediaCodec;
import androidx.media3.common.Metadata;
import androidx.media3.container.Mp4OrientationData;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Deque;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Sfq  reason: case insensitive filesystem */
public final class C11755Sfq implements C13793ThA {
    public final C11213SFn A00;
    public final C10517RtW A01;

    public final void A9N(Metadata.Entry entry) {
        this.A01.A00 = (Mp4OrientationData) entry;
    }

    public final C11754Sfp AAY(SJM sjm) {
        C11213SFn sFn = this.A00;
        C11754Sfp sfp = new C11754Sfp(sjm);
        sFn.A08.add(sfp);
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(SQX.A01(sjm.A0Y))) {
            sFn.A03 = sfp;
        }
        return sfp;
    }

    public final void FO6(MediaCodec.BufferInfo bufferInfo, TZe tZe, ByteBuffer byteBuffer) {
        long j;
        try {
            C11213SFn sFn = this.A00;
            C11366SPh.A01(tZe instanceof C11754Sfp);
            if (!sFn.A04) {
                FileChannel fileChannel = sFn.A07;
                fileChannel.position(0);
                fileChannel.write(C11411SSj.A00());
                fileChannel.write(sFn.A05.A00(sFn.A08, 0, true));
                sFn.A04 = true;
            }
            C11754Sfp sfp = (C11754Sfp) tZe;
            C11754Sfp sfp2 = sFn.A03;
            if (sfp2 != null) {
                if (sfp.equals(sfp2) && sfp.A00 && (bufferInfo.flags & 1) > 0) {
                    Deque deque = sfp.A02;
                    Object peekFirst = deque.peekFirst();
                    peekFirst.getClass();
                    Object peekLast = deque.peekLast();
                    peekLast.getClass();
                    j = ((MediaCodec.BufferInfo) peekLast).presentationTimeUs - ((MediaCodec.BufferInfo) peekFirst).presentationTimeUs;
                }
                sfp.A00(bufferInfo, byteBuffer);
                Deque deque2 = sfp.A02;
                Object peekFirst2 = deque2.peekFirst();
                peekFirst2.getClass();
                Object peekLast2 = deque2.peekLast();
                peekLast2.getClass();
                long j2 = sFn.A02;
                long j3 = ((MediaCodec.BufferInfo) peekFirst2).presentationTimeUs;
                sFn.A02 = Math.min(j2, j3);
                sFn.A01 = Math.max(sFn.A01, ((MediaCodec.BufferInfo) peekLast2).presentationTimeUs - j3);
            }
            j = sFn.A01;
            if (j >= 2000000) {
                C11213SFn.A00(sFn);
            }
            sfp.A00(bufferInfo, byteBuffer);
            Deque deque22 = sfp.A02;
            Object peekFirst22 = deque22.peekFirst();
            peekFirst22.getClass();
            Object peekLast22 = deque22.peekLast();
            peekLast22.getClass();
            long j22 = sFn.A02;
            long j32 = ((MediaCodec.BufferInfo) peekFirst22).presentationTimeUs;
            sFn.A02 = Math.min(j22, j32);
            sFn.A01 = Math.max(sFn.A01, ((MediaCodec.BufferInfo) peekLast22).presentationTimeUs - j32);
        } catch (IOException e) {
            RK5 rk5 = RK5.$redex_init_class;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Failed to write sample for presentationTimeUs=");
            A1A.append(bufferInfo.presentationTimeUs);
            A1A.append(", size=");
            throw new Exception(Pxe.A0z(A1A, bufferInfo.size), e);
        }
    }

    public final void close() {
        C11213SFn sFn;
        try {
            sFn = this.A00;
            C11213SFn.A00(sFn);
            sFn.A07.close();
            sFn.A06.close();
        } catch (IOException e) {
            throw new Exception("Failed to close the muxer", e);
        } catch (Throwable th) {
            sFn.A07.close();
            sFn.A06.close();
            throw th;
        }
    }

    public C11755Sfq(FileOutputStream fileOutputStream) {
        C10517RtW rtW = new C10517RtW();
        this.A01 = rtW;
        this.A00 = new C11213SFn(C13870Tir.A00, new C10921S0y(rtW, 1), fileOutputStream);
    }
}
