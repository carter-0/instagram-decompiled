package X;

import android.content.Intent;
import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: X.3Gh  reason: invalid class name and case insensitive filesystem */
public final class C239393Gh implements AnonymousClass0b0 {
    public C49592EzB A00;
    public final 2cc A01;

    public C239393Gh(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A01 = C71342cb.A00(r2);
    }

    public final synchronized void DMz(Intent intent) {
        0qQ.A0B(intent, 0);
        Uri data = intent.getData();
        if (data != null) {
            Uri.Builder scheme = new Uri.Builder().scheme(data.getScheme());
            String host = data.getHost();
            if (host == null) {
                host = "";
            }
            if (00p.A0k(host, "www.", false)) {
                host = host.substring(4);
                0qQ.A07(host);
            }
            String obj = scheme.authority(host).path(data.getPath()).build().toString();
            if (obj != null) {
                2cc r0 = this.A01;
                String A03 = r0.A03();
                String str = r0.A0C;
                if (str == null) {
                    str = "";
                }
                String str2 = r0.A05;
                Pattern pattern = 0mp.A03;
                if (str2 == null) {
                    str2 = "";
                }
                this.A00 = new C49592EzB(obj, A03, str, str2);
            }
        }
    }
}
