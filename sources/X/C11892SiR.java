package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.location.platform.api.Location;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SiR  reason: case insensitive filesystem */
public final class C11892SiR implements C13812Thf {
    public static final C9204RTh A06 = new Object();
    public InputStream A00;
    public HttpURLConnection A01;
    public final int A02;
    public final C9204RTh A03;
    public final C11859Shl A04;
    public volatile boolean A05;

    private InputStream A00(URL url, URL url2, Map map, int i) {
        int i2;
        int i3;
        int i4;
        RC6 A002;
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new RCS("In re-direct loop", (Throwable) null, -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    httpURLConnection.addRequestProperty(DbT.A13(A1J), DbS.A0s(A1J));
                }
                int i5 = this.A02;
                httpURLConnection.setConnectTimeout(i5);
                httpURLConnection.setReadTimeout(i5);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.A01 = httpURLConnection;
                try {
                    0fi.A02(httpURLConnection, -167850520);
                    this.A00 = 0fi.A00(this.A01, -2142065203);
                    if (this.A05) {
                        return null;
                    }
                    try {
                        i3 = this.A01.getResponseCode();
                    } catch (IOException unused2) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                        i3 = -1;
                    }
                    int i6 = i3 / 100;
                    if (AnonymousClass7TF.A1S(i6, 2)) {
                        HttpURLConnection httpURLConnection2 = this.A01;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                A002 = new RC6(0fi.A00(httpURLConnection2, 1829354929), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                A002 = 0fi.A00(httpURLConnection2, -1924838033);
                            }
                            this.A00 = A002;
                            return A002;
                        } catch (IOException e) {
                            try {
                                i4 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                                Log.isLoggable("HttpUrlFetcher", 3);
                                i4 = -1;
                            }
                            throw new RCS("Failed to obtain InputStream", e, i4);
                        }
                    } else if (AnonymousClass7TF.A1S(i6, 3)) {
                        String headerField = this.A01.getHeaderField(Location.TAG);
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                cleanup();
                                return A00(url3, url, map, i + 1);
                            } catch (MalformedURLException e2) {
                                throw new RCS(002.A0R("Bad redirect url: ", headerField), e2, i3);
                            }
                        } else {
                            throw new RCS("Received empty or null redirect url", (Throwable) null, i3);
                        }
                    } else if (i3 == -1) {
                        throw new RCS("Http request failed", (Throwable) null, -1);
                    } else {
                        try {
                            throw new RCS(this.A01.getResponseMessage(), (Throwable) null, i3);
                        } catch (IOException e3) {
                            throw new RCS("Failed to get a response message", e3, i3);
                        }
                    }
                } catch (IOException e4) {
                    try {
                        i2 = this.A01.getResponseCode();
                    } catch (IOException unused4) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                        i2 = -1;
                    }
                    throw new RCS("Failed to connect or obtain data", e4, i2);
                }
            } catch (IOException e5) {
                throw new RCS("URL.openConnection threw", e5, 0);
            }
        } else {
            throw new RCS("Too many (> 5) redirects!", (Throwable) null, -1);
        }
    }

    public final void cancel() {
        this.A05 = true;
    }

    public C11892SiR(C11859Shl shl, int i) {
        C9204RTh rTh = A06;
        this.A04 = shl;
        this.A02 = i;
        this.A03 = rTh;
    }

    public final Class AvH() {
        return InputStream.class;
    }

    public final Integer AvP() {
        return AnonymousClass05K.A01;
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        SystemClock.elapsedRealtimeNanos();
        try {
            C11859Shl shl = this.A04;
            URL url = shl.A01;
            if (url == null) {
                if (TextUtils.isEmpty(shl.A00)) {
                    String str = shl.A04;
                    if (TextUtils.isEmpty(str)) {
                        URL url2 = shl.A05;
                        C9217RTu.A00(url2);
                        str = url2.toString();
                    }
                    shl.A00 = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                url = new URL(shl.A00);
                shl.A01 = url;
            }
            tfA.D7o(A00(url, (URL) null, shl.A03.BCm(), 0));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            tfA.DOG(e);
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
        if (Log.isLoggable("HttpUrlFetcher", 2)) {
            SystemClock.elapsedRealtimeNanos();
        }
    }

    public final void cleanup() {
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.A01;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.A01 = null;
    }
}
