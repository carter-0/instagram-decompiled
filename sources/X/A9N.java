package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Map;

public final class A9N {
    public A3P A00;
    public volatile boolean A01 = false;
    public final /* synthetic */ C341707nO A02;

    public A9N(C341707nO r2) {
        this.A02 = r2;
    }

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (this.A01) {
            return;
        }
        if ((bufferInfo.flags & 4) != 0) {
            this.A01 = true;
            return;
        }
        C341707nO r2 = this.A02;
        synchronized (r2) {
            C341667nK r1 = r2.A07;
            if (r1 != null) {
                r1.A03(bufferInfo, C341767nU.AUDIO, byteBuffer);
            }
        }
    }

    public final void A01(Exception exc) {
        if (this.A00 != null) {
            C391719tX r4 = new C391719tX(22001, (Throwable) exc);
            C341707nO r2 = this.A02;
            C343467qG r0 = r2.A05;
            if (r0 != null) {
                r4.A01(r0.A00());
            }
            try {
                r4.A00("supported_configs", C39902AIk.A02(C39902AIk.A03()));
            } catch (Exception unused) {
            }
            r2.A0F.Cjv(r4, "inprogress_recording_audio_failure", "AudioRecordingTrack", "", "AudioEncoderCallback", (Map) null, AnonymousClass7TE.A0Q(r2));
            C341627nG r1 = this.A00.A00;
            r1.A04(r4);
            r1.A07(new AUN());
            this.A00 = null;
        }
    }
}
