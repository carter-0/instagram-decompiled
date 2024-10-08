package X;

import android.os.Handler;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Wq1  reason: case insensitive filesystem */
public final class C20362Wq1 implements Runnable {
    public static final C20362Wq1 A00 = new C20362Wq1();

    public final void run() {
        Date date = new Date(System.currentTimeMillis() - 10000);
        ConcurrentHashMap concurrentHashMap = C18465VsF.A03;
        synchronized (concurrentHashMap) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                if (((VQl) A1J.getValue()).A01.compareTo(date) < 0) {
                    Dbb.A1V(A1J, linkedHashMap);
                }
            }
            Iterator A0s2 = AnonymousClass7TF.A0s(linkedHashMap);
            while (A0s2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                C18758Vzt vzt = ((VQl) A1J2.getValue()).A00;
                ConcurrentHashMap concurrentHashMap2 = vzt.A08;
                Iterator A0u = C13989Tnp.A0u(concurrentHashMap2);
                while (A0u.hasNext()) {
                    C249903kY.A01(((VQj) A0u.next()).A01);
                }
                concurrentHashMap2.clear();
                vzt.A00 = -1;
                concurrentHashMap.remove(A1J2.getKey());
            }
        }
        ((Handler) C18411VrD.A06.getValue()).postDelayed(C18411VrD.A01, 10000);
    }
}
