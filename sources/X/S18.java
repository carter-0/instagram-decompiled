package X;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class S18 {
    public final Network A00;
    public final C10403Rrf A01;

    public final HttpURLConnection A00(URL url) {
        URLConnection openConnection = this.A00.openConnection(url);
        0qQ.A0C(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        C10403Rrf rrf = this.A01;
        httpURLConnection.setConnectTimeout(rrf.A00);
        httpURLConnection.setReadTimeout(rrf.A01);
        return httpURLConnection;
    }

    public S18(Network network, C10403Rrf rrf) {
        this.A00 = network;
        this.A01 = rrf;
    }
}
