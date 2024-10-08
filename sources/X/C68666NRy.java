package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.NRy  reason: case insensitive filesystem */
public final class C68666NRy extends 0ng {
    public final /* synthetic */ OWT A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68666NRy(OWT owt, String str) {
        super(769113367, 3, true, false);
        this.A00 = owt;
        this.A01 = str;
    }

    public final void run() {
        String str;
        C71150OeA oeA;
        OWT owt = this.A00;
        if (C51965G9l.A1a(0Tu.A05, owt.A02, 2342156773019551982L)) {
            owt.A03.put(this.A01, OWT.A05);
        }
        AnonymousClass0eM r9 = owt.A04;
        C70954OTb oTb = (C70954OTb) r9.getValue();
        long j = oTb.A00;
        if (j != 0) {
            boolean z = false;
            if (SystemClock.uptimeMillis() - j >= 700) {
                z = true;
            }
            oTb.A01 = z;
        }
        oTb.A00 = SystemClock.uptimeMillis();
        C70954OTb oTb2 = (C70954OTb) r9.getValue();
        String str2 = this.A01;
        int hashCode = AnonymousClass0HM.A00().hashCode();
        C11199SEz sEz = C70954OTb.A04;
        String A002 = OYV.A00(str2);
        if (A002 != null) {
            str = OYV.A01(A002, OYV.A02);
        } else {
            str = null;
        }
        Locale locale = oTb2.A03;
        boolean z2 = oTb2.A01;
        OJK ojk = oTb2.A02;
        Runnable runnable = O5C.A01;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str == null || (oeA = (C71150OeA) O5C.A00.get(str)) == null) {
            HashMap hashMap = O5C.A02;
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
            if (abstractCollection != null) {
                abstractCollection.add(ojk);
                return;
            }
            ArrayList A0v = DbS.A0v(1);
            A0v.add(ojk);
            hashMap.put(str, A0v);
            C73378Pbb pbb = new C73378Pbb(new C71150OeA(new OM9(hashCode), str), str, str2, locale, hashCode);
            if (z2) {
                C11199SEz.A03.execute(pbb);
                return;
            }
            if (O5C.A01 != null) {
                synchronized (sEz) {
                    Handler handler = sEz.A00;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                }
            }
            synchronized (sEz) {
                Handler handler2 = sEz.A00;
                if (handler2 == null) {
                    HandlerThread handlerThread = new HandlerThread("WhatsApp Worker Scheduler", 10);
                    AnonymousClass0fe.A00(handlerThread);
                    handlerThread.start();
                    handler2 = new Handler(handlerThread.getLooper());
                    sEz.A00 = handler2;
                }
                handler2.postDelayed(new C73160PXv(sEz, pbb), 700);
            }
            O5C.A01 = pbb;
            return;
        }
        ojk.A00(oeA, str2);
    }
}
