package X;

import com.facebook.mobileconfig.MobileConfigFileRepository;
import java.nio.ByteBuffer;

/* renamed from: X.4c8  reason: invalid class name and case insensitive filesystem */
public final class C267744c8 extends AnonymousClass18N {
    public ByteBuffer A00 = null;
    public final String A01;

    public final void finalize() {
        MobileConfigFileRepository.releaseBuffer(this.A01);
    }

    public final ByteBuffer getJavaByteBuffer() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer javaByteBuffer = MobileConfigFileRepository.getJavaByteBuffer(this.A01);
        this.A00 = javaByteBuffer;
        return javaByteBuffer;
    }

    public C267744c8(String str) {
        this.A01 = str;
    }
}
