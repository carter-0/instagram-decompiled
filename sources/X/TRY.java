package X;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public final class TRY extends URLStreamHandler {
    public final URLConnection openConnection(URL url) {
        return new TRX(url);
    }
}
