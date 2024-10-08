package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public final class TR5 extends Thread {
    public final /* synthetic */ Map A00;

    public TR5(Map map) {
        this.A00 = map;
    }

    public final void run() {
        String str;
        StringBuilder sb;
        String str2;
        HttpURLConnection httpURLConnection;
        Map map = this.A00;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            buildUpon.appendQueryParameter(A18, DbT.A11(A18, map));
        }
        String A0b = Pxf.A0b(buildUpon);
        try {
            httpURLConnection = (HttpURLConnection) new URL(A0b).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder A14 = Pxe.A14(Pxf.A09(A0b) + 65);
                A14.append("Received non-success response code ");
                A14.append(responseCode);
                Log.w("HttpUrlPinger", Pxg.A0s(" from pinging URL: ", A0b, A14));
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            e = e;
            str = e.getMessage();
            sb = Pxh.A0q(str, Pxf.A09(A0b) + 32);
            str2 = "Error while parsing ping URL: ";
            Pxj.A1M(str2, A0b, ". ", str, sb);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (IOException | RuntimeException e2) {
            e = e2;
            str = e.getMessage();
            sb = Pxh.A0q(str, Pxf.A09(A0b) + 27);
            str2 = "Error while pinging URL: ";
            Pxj.A1M(str2, A0b, ". ", str, sb);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
