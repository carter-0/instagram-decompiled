package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: X.T8r  reason: case insensitive filesystem */
public final class C12822T8r implements Closeable {
    public AnonymousClass9GD A00;
    public final URL A01;
    public volatile InputStream A02;

    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    C11142SBx.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw Pxe.A0e(e2);
                }
            }
        }
    }

    public C12822T8r(URL url) {
        this.A01 = url;
    }
}
