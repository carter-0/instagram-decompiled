package X;

import android.opengl.GLES20;
import com.facebook.common.dextricks.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Vv0  reason: case insensitive filesystem */
public class C18607Vv0 {
    public int A00;
    public C17872VhP A01;
    public C19726WeS A02;
    public final int A03;
    public final ByteBuffer A04;

    public C18607Vv0(C19726WeS weS) {
        C17872VhP vhP = weS.A00;
        vhP.getClass();
        this.A01 = vhP;
        int[] iArr = {0};
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        this.A03 = i;
        this.A04 = Pxg.A13(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
        this.A00 = 0;
        GLES20.glBindBuffer(34962, i);
        GLES20.glBufferData(34962, Constants.LOAD_RESULT_NEED_REOPTIMIZATION, (Buffer) null, 35048);
        GLES20.glBindBuffer(34962, 0);
        this.A02 = weS;
    }

    public final void A00(int i, int i2) {
        ByteBuffer byteBuffer;
        if (!(this instanceof C16331Ut1) && (byteBuffer = this.A04) != null) {
            int position = byteBuffer.position();
            byteBuffer.position(i);
            GLES20.glBufferSubData(34962, i, i2, byteBuffer);
            byteBuffer.position(position);
            this.A00 = Math.max(i + i2, this.A00);
        }
    }

    public final void finalize() {
        C17872VhP vhP = this.A01;
        vhP.A02.add(new C20092Wkq(this.A03));
    }

    public C18607Vv0(C17872VhP vhP, ByteBuffer byteBuffer) {
        if (!byteBuffer.order().equals(ByteOrder.nativeOrder())) {
            0KC.A0C("MappedBuffer", "MappedBuffer storage MUST be in native order");
        }
        int[] iArr = {0};
        GLES20.glGenBuffers(1, iArr, 0);
        this.A03 = iArr[0];
        this.A04 = null;
        this.A00 = 0;
        this.A01 = vhP;
    }
}
