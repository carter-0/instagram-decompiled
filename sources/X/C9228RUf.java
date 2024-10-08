package X;

import android.webkit.WebResourceResponse;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* renamed from: X.RUf  reason: case insensitive filesystem */
public abstract class C9228RUf {
    public static WebResourceResponse A00(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "";
        }
        Charset charset = StandardCharsets.UTF_8;
        WebResourceResponse webResourceResponse = new WebResourceResponse("text/plain", charset.name().toLowerCase(Locale.US), new ByteArrayInputStream(str2.getBytes(charset)));
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        A0Q.put("Access-Control-Allow-Origin", "*");
        A0Q.put("Access-Control-Allow-Headers", "*");
        webResourceResponse.setResponseHeaders(Pxe.A0Z(A0Q, "Access-Control-Allow-Methods", "GET, OPTIONS"));
        webResourceResponse.setStatusCodeAndReasonPhrase(i, str);
        return webResourceResponse;
    }
}
