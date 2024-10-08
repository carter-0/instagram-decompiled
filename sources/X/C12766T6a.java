package X;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.T6a  reason: case insensitive filesystem */
public final class C12766T6a implements AnonymousClass1Px {
    public final 1Fn A00;
    public final InputStream A01;

    public final 1Fn Aqb() {
        return null;
    }

    public final 1Fn Aql() {
        return this.A00;
    }

    public final InputStream E15() {
        return this.A01;
    }

    public final long getContentLength() {
        FileInputStream fileInputStream;
        FileChannel channel;
        InputStream inputStream = this.A01;
        if (!(inputStream instanceof FileInputStream) || (fileInputStream = (FileInputStream) inputStream) == null || (channel = fileInputStream.getChannel()) == null) {
            return 0;
        }
        return channel.size();
    }

    public C12766T6a(1Fn r1, InputStream inputStream) {
        this.A00 = r1;
        this.A01 = inputStream;
    }
}
