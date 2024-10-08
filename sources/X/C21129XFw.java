package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.XFw  reason: case insensitive filesystem */
public final class C21129XFw extends MediaCodec.Callback {
    public final /* synthetic */ C22254XyC A00;

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    public C21129XFw(C22254XyC xyC) {
        this.A00 = xyC;
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0 && bufferInfo.size <= 0) {
            C22254XyC xyC = this.A00;
            C22254XyC.A01(xyC.A02, xyC.A03, xyC);
        } else if (i < 0) {
            this.A00.A06.A01(C21053XCe.A0V("Unexpected result from encoder.dequeueOutputBuffer: %d", (Locale) null, AnonymousClass7TF.A1b(i)), (Map) null);
        } else {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            if (outputBuffer == null) {
                this.A00.A06.A01(C21053XCe.A0V("onOutputBufferAvailable ByteBuffer %d was null", (Locale) null, AnonymousClass7TF.A1b(i)), (Map) null);
                return;
            }
            if ((bufferInfo.flags & 2) != 0) {
                bufferInfo.flags = 2;
            }
            if (bufferInfo.size > 0) {
                try {
                    this.A00.A06.A00(bufferInfo, outputBuffer);
                } catch (IllegalArgumentException e) {
                    A9O a9o = this.A00.A06;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("IllegalArgumentException - ");
                    A1A.append(e.getMessage());
                    a9o.A01(JTO.A0u(AnonymousClass7TG.A0m(bufferInfo, ". BufferInfo: ", A1A)), (Map) null);
                    return;
                }
            }
            mediaCodec.releaseOutputBuffer(i, false);
            if ((bufferInfo.flags & 4) != 0 && bufferInfo.size > 0) {
                C22254XyC xyC2 = this.A00;
                C22254XyC.A01(xyC2.A02, xyC2.A03, xyC2);
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.A00.A01 = mediaFormat;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        HashMap A1E = AnonymousClass7TE.A1E();
        C22254XyC xyC = this.A00;
        A1E.put(TraceFieldType.CurrentState, XVF.A00(xyC.A0D));
        A1E.put("method_invocation", xyC.A07.toString());
        A1E.put("isRecoverable", String.valueOf(codecException.isRecoverable()));
        A1E.put("isTransient", String.valueOf(codecException.isTransient()));
        xyC.A06.A01(codecException, A1E);
    }
}
