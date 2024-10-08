package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class SlD implements C13814Thh {
    public static SlD A03;
    public Handler A00;
    public HandlerThread A01;
    public final Map A02;

    public final void EDE(C10773Rxr rxr) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((C13814Thh) A0v.next()).EDE((C10773Rxr) null);
        }
    }

    public final void ESr(String str, String str2) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((C13814Thh) A0v.next()).ESr(str, str2);
        }
    }

    public final void ESs(C10773Rxr rxr, String str, String str2) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((C13814Thh) A0v.next()).ESs(rxr, str, str2);
        }
    }

    public final void FKd() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((C13814Thh) A0v.next()).FKd();
        }
    }

    public final void flush() {
        Looper looper;
        if (!RQ6.A00) {
            boolean z = RQ6.A01;
            Iterator A0v = AnonymousClass7TF.A0v(this.A02);
            while (A0v.hasNext()) {
                C13814Thh thh = (C13814Thh) A0v.next();
                if (z) {
                    if (this.A01 == null) {
                        HandlerThread A0J = Pxf.A0J("CookieManagerFlush", 10);
                        this.A01 = A0J;
                        A0J.start();
                        HandlerThread handlerThread = this.A01;
                        if (handlerThread != null) {
                            looper = handlerThread.getLooper();
                        } else {
                            looper = null;
                        }
                        this.A00 = new Handler(looper);
                    }
                    Handler handler = this.A00;
                    if (handler != null) {
                        handler.post(new TBH(thh));
                    }
                }
                thh.flush();
            }
        }
    }

    public SlD() {
        WeakHashMap weakHashMap = new WeakHashMap();
        this.A02 = weakHashMap;
        Object obj = new Object();
        if (!weakHashMap.containsKey("SystemCookieManager")) {
            weakHashMap.put("SystemCookieManager", obj);
        }
    }
}
