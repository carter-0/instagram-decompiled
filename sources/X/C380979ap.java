package X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.9ap  reason: invalid class name and case insensitive filesystem */
public final class C380979ap extends AudioRenderCallback {
    public final /* synthetic */ C40071AQb A00;

    public C380979ap(C40071AQb aQb) {
        this.A00 = aQb;
    }

    public final void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
        C40071AQb aQb = this.A00;
        if (!aQb.A05 && Looper.myLooper() == aQb.A02.getLooper()) {
            AQY aqy = aQb.A06;
            C39897ADz aDz = aqy.A0B;
            if (aDz != null) {
                aDz.A09 = true;
            }
            A9M a9m = aqy.A0C;
            if (a9m != null) {
                a9m.A01(bArr, i4);
            }
            aQb.A01();
            int length = aqy.A01.length;
            if (i4 > length) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i4);
                while (byteBuffer.position() < i4) {
                    int min = Math.min(i4 - byteBuffer.position(), length);
                    byteBuffer.get(aqy.A01, 0, min);
                    C40071AQb.A00(aQb, aqy.A01, i, min);
                }
                return;
            }
            C40071AQb.A00(aQb, bArr, i, i4);
        }
    }
}
