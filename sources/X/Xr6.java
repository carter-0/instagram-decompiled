package X;

import android.content.Context;
import com.facebook.ultralight.UL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Xr6 {
    public static final Y9D A03 = new C22149XwE();
    public static final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final XLv A00;
    public final C22224Xxe A01;
    public final Context A02;

    public static final void A01(C21390XZx xZx) {
        List list = xZx.A00;
        17k.A0F(AnonymousClass7TE.A1b(list));
        list.remove(list.size() - 1);
        List list2 = xZx.A01;
        17k.A0F(AnonymousClass7TE.A1b(list2));
        list2.remove(list2.size() - 1);
    }

    public Xr6(C22224Xxe xxe) {
        Context context;
        this.A01 = xxe;
        List list = xxe.BHE().A00;
        if (list.isEmpty()) {
            context = C22224Xxe.A00();
        } else {
            context = (Context) C66582MXn.A0r(list);
        }
        this.A02 = context;
        this.A00 = new XLv(this, xxe);
    }

    public static Object A00(int i) {
        Object obj;
        Context A002 = C22224Xxe.A00();
        0Sd.A00(A002);
        C22224Xxe xxe = C22224Xxe.get(A002);
        ConcurrentHashMap concurrentHashMap = A04;
        Integer valueOf = Integer.valueOf(i);
        Object obj2 = concurrentHashMap.get(valueOf);
        if (obj2 != null) {
            return obj2;
        }
        ConcurrentHashMap concurrentHashMap2 = XY7.A00;
        concurrentHashMap2.putIfAbsent(valueOf, valueOf);
        Object obj3 = concurrentHashMap2.get(valueOf);
        synchronized (obj3) {
            obj = concurrentHashMap.get(obj3);
            if (obj == null) {
                XLy Bpn = xxe.Bpn();
                Class<Xr6> cls = Xr6.class;
                Y9D y9d = A03;
                Map map = Bpn.A01.A00;
                Object obj4 = map.get(cls);
                if (obj4 == null) {
                    synchronized (map) {
                        try {
                            obj4 = map.get(cls);
                            if (obj4 == null) {
                                obj4 = y9d.Cg0(Bpn);
                                map.put(cls, obj4);
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(002.A0R("Error creating the scope ", cls.getCanonicalName()), e);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                Xr6 xr6 = (Xr6) obj4;
                C21390XZx BHE = xr6.A01.BHE();
                BHE.A00.add(C22224Xxe.A00());
                BHE.A01.add(xr6.A00);
                C22556YAg AcB = xxe.AcB();
                ((C21390XZx) C21994Xpz.A00.get()).A01.add(AcB.Bpl());
                try {
                    obj = UL.factorymap.get(i, AcB.Bpn(), C22224Xxe.A00());
                    if (obj != null) {
                        concurrentHashMap.put(obj3, obj);
                    }
                    C21994Xpz.A01();
                    A01(BHE);
                } catch (Throwable th2) {
                    th = th2;
                    C21994Xpz.A01();
                    A01(BHE);
                    throw th;
                }
            }
        }
        return obj;
    }
}
