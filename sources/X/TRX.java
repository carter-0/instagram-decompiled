package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public final class TRX extends URLConnection {
    public final void connect() {
    }

    public final InputStream getInputStream() {
        return new ByteArrayInputStream((byte[]) null);
    }

    public TRX(URL url) {
        super(url);
    }
}
