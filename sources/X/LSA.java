package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.Thread;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class LSA {
    public boolean A00;
    public boolean A01;
    public final C66525MVd A02;
    public final C66488MTr A03;
    public final Object A04 = new Object();
    public final String A05;
    public final Map A06 = new WeakHashMap();
    public final Queue A07 = new ConcurrentLinkedQueue();
    public final Object A08 = new Object();
    public volatile MCu A09;

    public static synchronized void A01(LSA lsa) {
        synchronized (lsa) {
            synchronized (lsa.A08) {
                if (lsa.A09 == null || lsa.A09.getState() == Thread.State.TERMINATED) {
                    lsa.A09 = new MCu(lsa);
                    lsa.A09.start();
                }
                synchronized (lsa.A09) {
                    lsa.A09.A00 = true;
                    lsa.A09.notify();
                }
            }
        }
    }

    public LSA(Context context, UserSession userSession, C66488MTr mTr) {
        this.A02 = new C65331LrU(context, userSession);
        this.A05 = 002.A0R("FU_", "CreationRenderController");
        this.A03 = mTr;
    }

    public static void A00(LSA lsa) {
        if (lsa.A09 != null) {
            synchronized (lsa.A08) {
                if (lsa.A09 != null) {
                    lsa.A09 = null;
                }
            }
        }
    }

    public static void A02(Exception exc, String str) {
        0wb.A07(002.A0u("RenderManager ", str, ": ", exc.getMessage()), exc);
    }
}
