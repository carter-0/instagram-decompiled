package X;

import com.facebook.wearable.datax.Connection;
import java.nio.ByteBuffer;

/* renamed from: X.Vfa  reason: case insensitive filesystem */
public final class C17764Vfa {
    public final /* synthetic */ Connection A00;

    public C17764Vfa(Connection connection) {
        this.A00 = connection;
    }

    public final ByteBuffer A00() {
        Connection connection = this.A00;
        C16798V6f v6f = Connection.Companion;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(connection.pollReceiveFragmentNative(connection.f1native.A00(), (ByteBuffer) null, 0));
        0qQ.A0A(allocateDirect);
        0qQ.A0B(allocateDirect, 0);
        if (allocateDirect.remaining() >= connection.pollReceiveFragmentNative(connection.f1native.A00(), (ByteBuffer) null, 0)) {
            C13988Tno.A1S(allocateDirect, connection.pollReceiveFragmentNative(connection.f1native.A00(), allocateDirect, allocateDirect.position()));
            allocateDirect.flip();
            return allocateDirect;
        }
        throw new IllegalStateException(002.A02(allocateDirect.remaining(), connection.pollReceiveFragmentNative(connection.f1native.A00(), (ByteBuffer) null, 0), "Buffer remaining space is to small ", " < "));
    }
}
