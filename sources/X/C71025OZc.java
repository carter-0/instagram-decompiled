package X;

import com.facebook.rsys.state.gen.State;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.OZc  reason: case insensitive filesystem */
public final class C71025OZc {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final Map A01 = AnonymousClass7TE.A1H();
    public final Executor A02;

    public C71025OZc(Executor executor) {
        0qQ.A0B(executor, 1);
        this.A02 = executor;
    }

    public final synchronized void A02(C74225PrE prE) {
        0qQ.A0B(prE, 0);
        0fh.A01("SubscriptionManager.unregister", -1530983567);
        try {
            Iterator A0v = AnonymousClass7TF.A0v(this.A01);
            while (A0v.hasNext()) {
                Iterator A0v2 = AnonymousClass7TF.A0v((Map) A0v.next());
                while (A0v2.hasNext()) {
                    ((List) A0v2.next()).remove(prE);
                }
            }
            Iterator A0v3 = AnonymousClass7TF.A0v(this.A00);
            while (A0v3.hasNext()) {
                ((List) A0v3.next()).remove(prE);
            }
        } finally {
            0fh.A00(1542753363);
        }
    }

    public final synchronized void A03(C74225PrE prE, Class cls, 0sP r6) {
        Map map = this.A01;
        0fh.A01("SubscriptionManager.registerSelectorToOnChangeMapping", -1718985752);
        try {
            Map map2 = (Map) map.get(cls);
            if (map2 == null) {
                0u4.A05(r6, 1);
                map.put(cls, 0Yt.A07(DbW.A1b(r6, 0sr.A1M(new C74225PrE[]{prE}))));
            } else {
                0u4.A05(r6, 1);
                List A13 = C66580MXl.A13(r6, map2);
                if (A13 == null) {
                    map2.put(r6, 0sr.A1M(new C74225PrE[]{prE}));
                } else {
                    A13.add(prE);
                }
            }
        } finally {
            0fh.A00(250946271);
        }
    }

    public static final Object A00(2LV r2, N4A n4a, Class cls) {
        Object obj;
        0fh.A01("SubscriptionManager.getRsysOrSharedModel", -329391408);
        if (r2 == null) {
            try {
                obj = n4a.A00(cls);
            } catch (Throwable th) {
                0fh.A00(-2009592058);
                throw th;
            }
        } else {
            C69662Npk npk = n4a.A00;
            if (npk != null) {
                obj = ((C68372NDp) npk).A00.A00(r2);
            } else {
                obj = null;
            }
        }
        0fh.A00(1234572049);
        return obj;
    }

    public static final void A01(C74225PrE prE, Map map) {
        Class<State> cls = State.class;
        0fh.A01("SubscriptionManager.registerClassLevelSubscription", 1675181342);
        try {
            List A13 = C66580MXl.A13(cls, map);
            if (A13 == null) {
                map.put(cls, 0sr.A1M(new C74225PrE[]{prE}));
            } else {
                A13.add(prE);
            }
        } finally {
            0fh.A00(-473907439);
        }
    }
}
