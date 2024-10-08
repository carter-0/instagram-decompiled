package X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.9ao  reason: invalid class name and case insensitive filesystem */
public final class C380969ao extends AudioRenderCallback {
    public final /* synthetic */ C341577nB A00;

    public C380969ao(C341577nB r1) {
        this.A00 = r1;
    }

    public final void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
        C341577nB r3 = this.A00;
        if (r3.A0D == null || Looper.myLooper() == r3.A0D.getLooper()) {
            C39897ADz aDz = r3.A0E;
            if (aDz != null) {
                aDz.A09 = true;
            }
            A9M a9m = r3.A0F;
            byte[] bArr2 = bArr;
            int i5 = i4;
            if (a9m != null) {
                a9m.A01(bArr, i5);
            }
            C341577nB.A01(r3);
            byte[] bArr3 = r3.A09;
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            if (i5 > 4096) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i5);
                while (byteBuffer.position() < i5) {
                    int min = Math.min(i4 - byteBuffer.position(), 4096);
                    byteBuffer.get(bArr3, 0, min);
                    C341577nB.A02(r3, bArr3, i6, i7, i8, min);
                }
                return;
            }
            C341577nB.A02(r3, bArr2, i6, i7, i8, i5);
        }
    }
}
