package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class Dc1 {
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);
    public Dc0 A00;
    public Runnable A01;
    public final Handler A02;
    public final 0lg A03;
    public final List A04 = 0sr.A1P(new String[]{"com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity", "com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity", "com.instagram.urlhandler.WebAndUserExternalUrlHandler"});

    public Dc1(0lg r4) {
        0qQ.A0B(r4, 1);
        this.A03 = r4;
        this.A00 = new Dc0(r4, new C51651FyD(this, 28));
        this.A02 = new Handler(C64021Cb.A00());
    }

    public static final void A00(Intent intent, Uri uri, Dc1 dc1, String str, String str2) {
        String string;
        Dc0 dc0 = dc1.A00;
        if (dc0.A01) {
            dc0.A0J("handler", str);
            if (uri != null) {
                String scheme = uri.getScheme();
                if (scheme != null) {
                    dc1.A00.A0J("url_scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    dc1.A00.A0J("url_host", host);
                }
                String path = uri.getPath();
                if (path != null) {
                    dc1.A00.A0J("absolute_url", path);
                }
            }
            String stringExtra = intent.getStringExtra("EXTRA_REFERRER");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                dc1.A00.A0J("source_application", stringExtra);
            }
            Bundle extras = intent.getExtras();
            if (!(extras == null || (string = extras.getString("short_url")) == null || string.length() == 0)) {
                dc1.A00.A0J("short_url", string);
            }
            dc1.A00.A01.A05();
            if (!00k.A0u(dc1.A04, str2)) {
                dc1.A00.A00.A05();
                return;
            }
            C51296Frp frp = new C51296Frp(dc1);
            dc1.A02.postDelayed(frp, A05);
            dc1.A01 = frp;
        }
    }

    public final void A01() {
        Dc0 dc0 = this.A00;
        if (dc0.A01) {
            dc0.A00.A05();
        }
    }

    public final void A02(String str) {
        Dc0 dc0 = this.A00;
        if (dc0.A01) {
            dc0.A00.A07(str);
        }
    }
}
