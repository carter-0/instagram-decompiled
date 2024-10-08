package X;

import android.util.Pair;
import com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessorCallback;
import java.nio.ByteBuffer;

/* renamed from: X.Sll  reason: case insensitive filesystem */
public final class C12058Sll implements AudioPostProcessorCallback {
    public int A00;
    public ByteBuffer A01;
    public final /* synthetic */ C10730Rx9 A02;

    public C12058Sll(C10730Rx9 rx9) {
        this.A02 = rx9;
    }

    public final Object requestOutputBuffer() {
        C13706TfQ tfQ = this.A02.A00;
        if (tfQ == null) {
            return null;
        }
        Pair EHX = tfQ.EHX();
        ByteBuffer byteBuffer = (ByteBuffer) EHX.first;
        this.A01 = byteBuffer;
        this.A00 = Pxf.A04(EHX);
        return byteBuffer;
    }

    public final void returnOutputBuffer() {
        C10730Rx9 rx9 = this.A02;
        C13706TfQ tfQ = rx9.A00;
        if (tfQ != null) {
            tfQ.DVg(this.A01, this.A00, rx9.A02);
            this.A01 = null;
        }
    }
}
