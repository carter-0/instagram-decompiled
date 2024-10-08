package X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;

/* renamed from: X.9ar  reason: invalid class name and case insensitive filesystem */
public final class C380999ar extends AudioRenderCallback {
    public final Y1G A00;
    public final /* synthetic */ C40071AQb A01;

    public C380999ar(Y1G y1g, C40071AQb aQb) {
        this.A01 = aQb;
        this.A00 = y1g;
    }

    public final void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
        C40071AQb aQb = this.A01;
        if (!aQb.A05 && Looper.myLooper() == aQb.A02.getLooper()) {
            AQY aqy = aQb.A06;
            C39897ADz aDz = aqy.A0B;
            if (aDz != null) {
                aDz.A09 = true;
            }
            A9M a9m = aqy.A0C;
            byte[] bArr2 = bArr;
            int i5 = i4;
            if (a9m != null) {
                a9m.A01(bArr2, i5);
            }
            aQb.A01();
            Y1G y1g = this.A00;
            ByteBuffer byteBuffer = y1g.A02;
            byteBuffer.clear();
            int min = Math.min(byteBuffer.capacity(), i5);
            if (i5 > min) {
                aqy.A04.Cjw(new C382299dT(002.A0g("Received too many bytes from AR Engine; dropped ", Integer.toString(i4 - min), "bytes")), "inprogress_recording_audio_failure", "LegacyAudioPipeline", "", "high", "onSamplesReady", AnonymousClass7TE.A0Q(aqy));
            }
            byteBuffer.put(bArr2, 0, min);
            byteBuffer.flip();
            aQb.A02(y1g, i5);
        }
    }
}
