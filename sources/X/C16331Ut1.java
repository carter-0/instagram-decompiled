package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* renamed from: X.Ut1  reason: case insensitive filesystem */
public final class C16331Ut1 extends C18607Vv0 {
    public C16331Ut1(C17872VhP vhP, ByteBuffer byteBuffer) {
        super(vhP, byteBuffer);
        GLES20.glBindBuffer(34962, this.A03);
        GLES20.glBufferData(34962, byteBuffer.remaining(), byteBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
    }
}
