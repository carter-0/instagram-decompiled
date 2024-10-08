package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Q0r  reason: case insensitive filesystem */
public abstract class C7245Q0r {
    public static final ByteBuffer A01(int i, int i2) {
        int i3 = i2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, i, i3, 6408, 5121, allocateDirect);
        allocateDirect.rewind();
        C7242Q0o.A01("glReadPixels");
        return allocateDirect;
    }

    public static final void A02(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i * 4;
        int arrayOffset = byteBuffer.arrayOffset();
        int arrayOffset2 = byteBuffer.arrayOffset() + ((i2 - 1) * i3);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 < i2 / 2) {
                System.arraycopy(byteBuffer.array(), arrayOffset, bArr, 0, i3);
                System.arraycopy(byteBuffer.array(), arrayOffset2, byteBuffer.array(), arrayOffset, i3);
                System.arraycopy(bArr, 0, byteBuffer.array(), arrayOffset2, i3);
                arrayOffset += i3;
                arrayOffset2 -= i3;
                i4 = i5;
            } else {
                byteBuffer.rewind();
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.R9i, X.11X] */
    public static final boolean A03(C18594Vul vul, int i, int i2) {
        try {
            1ES.A03(new C8781R9i(vul, A01(i, i2), i, i2));
            return true;
        } catch (Exception | OutOfMemoryError e) {
            0KC.A0H("IgLiveScreenshotCapturer", "Error saving frame to buffer.", e);
            return false;
        }
    }

    public static final Bitmap A00(int i, int i2) {
        ByteBuffer A01 = A01(i, i2);
        A02(A01, i, i2);
        Bitmap A0B = AnonymousClass7TF.A0B(i, i2);
        A0B.copyPixelsFromBuffer(A01);
        return A0B;
    }
}
