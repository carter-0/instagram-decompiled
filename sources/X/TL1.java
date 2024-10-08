package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class TL1 implements Runnable {
    public static final S22 A02 = new S22("RevokeAccessOperation", new String[0]);
    public final C8370QpZ A00 = new BasePendingResult((AnonymousClass63S) null);
    public final String A01;

    public final void run() {
        S22 s22;
        String str;
        String str2;
        Status status = Status.A06;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(002.A0R("https://accounts.google.com/o/oauth2/revoke?token=", this.A01)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", AnonymousClass000.A00(252));
            if (httpURLConnection.getResponseCode() == 200) {
                status = Status.A08;
            } else {
                Pxh.A1L(A02.A01, "Unable to revoke access!", "RevokeAccessOperation");
            }
        } catch (IOException e) {
            s22 = A02;
            str = String.valueOf(e.toString());
            str2 = "IOException when revoking access: ";
            Pxh.A1L(s22.A01, str2.concat(str), "RevokeAccessOperation");
            this.A00.A06(status);
        } catch (Exception e2) {
            s22 = A02;
            str = String.valueOf(e2.toString());
            str2 = "Exception when revoking access: ";
            Pxh.A1L(s22.A01, str2.concat(str), "RevokeAccessOperation");
            this.A00.A06(status);
        }
        this.A00.A06(status);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.BasePendingResult, X.QpZ] */
    public TL1(String str) {
        AnonymousClass3Qk.A04(str);
        this.A01 = str;
    }
}
