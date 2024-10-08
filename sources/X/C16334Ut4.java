package X;

import java.nio.ByteBuffer;

/* renamed from: X.Ut4  reason: case insensitive filesystem */
public final class C16334Ut4 extends C18039VkN {
    public final ByteBuffer A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16334Ut4(C14261Tsj tsj, byte[] bArr) {
        super(tsj, 4);
        0qQ.A0B(bArr, 2);
        0qQ.A0A(tsj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16);
        allocateDirect.put(bArr);
        0qQ.A0B(tsj, 1);
        this.A00 = allocateDirect;
    }
}
