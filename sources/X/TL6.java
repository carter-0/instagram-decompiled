package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class TL6 implements Runnable {
    public final /* synthetic */ List A00;

    public TL6(List list) {
        this.A00 = list;
    }

    public final void run() {
        int andIncrement;
        14i r0 = 14i.A08;
        List<C61110lV> list = this.A00;
        int size = list.size();
        AtomicInteger atomicInteger = 14i.A0H;
        int andIncrement2 = atomicInteger.getAndIncrement();
        14i.A00().markerStart(694564060, andIncrement2, false);
        14i.A00().markerAnnotate(694564060, andIncrement2, "operation", "onAppForegrounded_timeSensitive");
        14i.A00().markerAnnotate(694564060, andIncrement2, "asl_session_id", 0LA.A01());
        14i.A00().markerAnnotate(694564060, andIncrement2, "number_of_listeners", size);
        14i.A00().markerAnnotate(694564060, andIncrement2, "thread_priority", Thread.currentThread().getPriority());
        if (!((List) C62000qj.A02.A05.invoke()).contains("onAppForegrounded_timeSensitive")) {
            for (C61110lV r13 : list) {
                String A0y = C66581MXm.A0y(r13);
                0qQ.A07(A0y);
                int andIncrement3 = atomicInteger.getAndIncrement();
                14i.A00().markerStart(694559790, andIncrement3, false);
                14i.A00().markerAnnotate(694559790, andIncrement3, "operation", "onAppForegrounded_timeSensitive");
                14i.A00().markerAnnotate(694559790, andIncrement3, "listener", 002.A0g("<cls>", A0y, "</cls>"));
                if (A01(andIncrement3)) {
                    try {
                        r13.onAppForegrounded();
                    } catch (Throwable th) {
                        A00(false, th);
                    }
                } else {
                    r13.onAppForegrounded();
                }
                14i.A00().markerEnd(694559790, andIncrement3, 2);
            }
        } else if (AnonymousClass7TE.A1a(C62000qj.A02.A04.invoke())) {
            try {
                for (C61110lV r132 : list) {
                    String A0y2 = C66581MXm.A0y(r132);
                    0qQ.A07(A0y2);
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    14i.A00().markerStart(694559790, andIncrement4, false);
                    14i.A00().markerAnnotate(694559790, andIncrement4, "operation", "onAppForegrounded_timeSensitive");
                    14i.A00().markerAnnotate(694559790, andIncrement4, "listener", 002.A0g("<cls>", A0y2, "</cls>"));
                    if (A01(andIncrement4)) {
                        r132.onAppForegrounded();
                    } else {
                        r132.onAppForegrounded();
                    }
                    14i.A00().markerEnd(694559790, andIncrement4, 2);
                }
            } catch (Throwable th2) {
                A00(false, th2);
            }
        } else {
            for (C61110lV r133 : list) {
                try {
                    String A0y3 = C66581MXm.A0y(r133);
                    0qQ.A07(A0y3);
                    andIncrement = atomicInteger.getAndIncrement();
                    14i.A00().markerStart(694559790, andIncrement, false);
                    14i.A00().markerAnnotate(694559790, andIncrement, "operation", "onAppForegrounded_timeSensitive");
                    14i.A00().markerAnnotate(694559790, andIncrement, "listener", 002.A0g("<cls>", A0y3, "</cls>"));
                    if (A01(andIncrement)) {
                        r133.onAppForegrounded();
                    } else {
                        r133.onAppForegrounded();
                    }
                } catch (Throwable th3) {
                    A00(false, th3);
                }
                14i.A00().markerEnd(694559790, andIncrement, 2);
            }
        }
        14i.A00().markerEnd(694564060, andIncrement2, 2);
    }

    public static void A00(Boolean bool, Throwable th) {
        0f9 AEh = 0wj.A00.AEh(bool, (String) null, 694559790, 0);
        AEh.ERJ(th);
        AEh.report();
    }

    public static boolean A01(int i) {
        14i.A00().markerAnnotate(694559790, i, "asl_session_id", 0LA.A01());
        return ((List) C62000qj.A02.A05.invoke()).contains("onAppForegrounded_timeSensitive");
    }
}
