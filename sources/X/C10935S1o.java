package X;

import android.util.Base64;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import org.webrtc.CameraCapturer;

/* renamed from: X.S1o  reason: case insensitive filesystem */
public final class C10935S1o {
    public final C10227Ron A00;
    public final String A01;
    public final String A02;

    public C10935S1o(C10227Ron ron, String str, String str2) {
        this.A01 = str;
        this.A00 = ron;
        this.A02 = str2;
    }

    public final int A00(String str) {
        String str2;
        String str3;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("format", "json");
        A1E.put("access_token", this.A01);
        if (str == null) {
            try {
                0KC.A0D("AnalyticsHttpClient", "Json data cannot be null");
            } catch (IOException e) {
                0KC.A0G("AnalyticsHttpClient", "Unable to compress message to Json object, using original message", e);
                A1E.put(DialogModule.KEY_MESSAGE, str);
            }
        }
        byte[] bytes = str.getBytes(ReactWebViewManager.HTML_ENCODING);
        ByteArrayOutputStream A0b = Pxe.A0b();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(A0b);
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        A1E.put(DialogModule.KEY_MESSAGE, Base64.encodeToString(A0b.toByteArray(), 2));
        A1E.put("compressed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        C10227Ron ron = this.A00;
        String str4 = this.A02;
        int i = -1;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) ron.A00.get()).openConnection();
                httpURLConnection.setConnectTimeout(CameraCapturer.OPEN_CAMERA_TIMEOUT);
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    httpURLConnection.setRequestProperty("User-Agent", str4);
                    httpURLConnection.setRequestProperty("X-FB-HTTP-Engine", "MQTT Analytics");
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(0fi.A01(httpURLConnection, 133641169));
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        Iterator A0s = AnonymousClass7TF.A0s(A1E);
                        while (A0s.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                            if (A1A.length() != 0) {
                                A1A.append("&");
                            }
                            try {
                                A1A.append(URLEncoder.encode(DbT.A13(A1J), ReactWebViewManager.HTML_ENCODING));
                                A1A.append("=");
                                A1A.append(URLEncoder.encode(DbS.A0s(A1J), ReactWebViewManager.HTML_ENCODING));
                            } catch (UnsupportedEncodingException e2) {
                                0KC.A0G("AnalyticsService", "", e2);
                                dataOutputStream.close();
                                httpURLConnection.disconnect();
                                return i;
                            }
                        }
                        try {
                            dataOutputStream.writeBytes(A1A.toString());
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            i = httpURLConnection.getResponseCode();
                        } catch (IOException e3) {
                            0KC.A0G("AnalyticsService", "Failed to write to output stream", e3);
                        } catch (Throwable th) {
                            dataOutputStream.close();
                            throw th;
                        }
                    } catch (IOException | SecurityException e4) {
                        0KC.A0G("AnalyticsService", "Unable to create output stream", e4);
                    }
                } catch (IOException e5) {
                    try {
                        0KC.A0G("AnalyticsService", "", e5);
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                }
                httpURLConnection.disconnect();
                return i;
            } catch (IOException e6) {
                e = e6;
                str2 = "AnalyticsService";
                str3 = "Failed to open http connection";
                0KC.A0G(str2, str3, e);
                return -1;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            str2 = "AnalyticsService";
            str3 = "Logging end point malformed";
            0KC.A0G(str2, str3, e);
            return -1;
        }
    }
}
