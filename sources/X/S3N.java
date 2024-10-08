package X;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class S3N {
    public static S3N A09;
    public long A00;
    public WebView A01;
    public SRY A02;
    public PrefetchCacheEntry A03;
    public String A04;
    public List A05;
    public boolean A06 = false;
    public final Context A07;
    public final LinkedList A08 = Pxe.A1A();

    public final synchronized void A00(PrefetchCacheEntry prefetchCacheEntry) {
        if (this.A06) {
            LinkedList linkedList = this.A08;
            if (linkedList.size() < 10) {
                linkedList.addLast(prefetchCacheEntry);
            } else if (SQO.A00) {
                Log.w("BrowserHtmlResourceExtractor", "Too many extract resource requests, dropping current one");
            }
        } else {
            this.A06 = true;
            SB5.A00(new C12944TFd(prefetchCacheEntry, this));
        }
    }

    public S3N(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A07 = applicationContext;
        SRY A002 = SRY.A00();
        this.A02 = A002;
        C10646Rvf rvf = C10646Rvf.A03;
        if (rvf == null) {
            rvf = new C10646Rvf();
            C10646Rvf.A03 = rvf;
        }
        A002.A05 = rvf;
        this.A02.A05(applicationContext, false);
        this.A05 = Collections.synchronizedList(Pxe.A1A());
    }
}
