package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.57b  reason: invalid class name */
public final class AnonymousClass57b implements Runnable {
    public final /* synthetic */ List A00;

    public AnonymousClass57b(List list) {
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
        14i.A00().markerAnnotate(694564060, andIncrement2, "operation", "onAppForegrounded");
        14i.A00().markerAnnotate(694564060, andIncrement2, "asl_session_id", 0LA.A01());
        14i.A00().markerAnnotate(694564060, andIncrement2, "number_of_listeners", size);
        14i.A00().markerAnnotate(694564060, andIncrement2, "thread_priority", Thread.currentThread().getPriority());
        if (!((List) C62000qj.A02.A05.invoke()).contains("onAppForegrounded")) {
            for (C61110lV r1 : list) {
                String name = r1.getClass().getName();
                0qQ.A07(name);
                int andIncrement3 = atomicInteger.getAndIncrement();
                14i.A00().markerStart(694559790, andIncrement3, false);
                14i.A00().markerAnnotate(694559790, andIncrement3, "operation", "onAppForegrounded");
                14i.A00().markerAnnotate(694559790, andIncrement3, "listener", 002.A0g("<cls>", name, "</cls>"));
                14i.A00().markerAnnotate(694559790, andIncrement3, "asl_session_id", 0LA.A01());
                if (((List) C62000qj.A02.A05.invoke()).contains("onAppForegrounded")) {
                    try {
                        r1.onAppForegrounded();
                    } catch (Throwable th) {
                        0f9 AEh = 0wj.A00.AEh(false, (String) null, 694559790, 0);
                        AEh.ERJ(th);
                        AEh.report();
                    }
                } else {
                    r1.onAppForegrounded();
                }
                14i.A00().markerEnd(694559790, andIncrement3, 2);
            }
        } else if (((Boolean) C62000qj.A02.A04.invoke()).booleanValue()) {
            try {
                for (C61110lV r12 : list) {
                    String name2 = r12.getClass().getName();
                    0qQ.A07(name2);
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    14i.A00().markerStart(694559790, andIncrement4, false);
                    14i.A00().markerAnnotate(694559790, andIncrement4, "operation", "onAppForegrounded");
                    14i.A00().markerAnnotate(694559790, andIncrement4, "listener", 002.A0g("<cls>", name2, "</cls>"));
                    14i.A00().markerAnnotate(694559790, andIncrement4, "asl_session_id", 0LA.A01());
                    if (((List) C62000qj.A02.A05.invoke()).contains("onAppForegrounded")) {
                        r12.onAppForegrounded();
                    } else {
                        r12.onAppForegrounded();
                    }
                    14i.A00().markerEnd(694559790, andIncrement4, 2);
                }
            } catch (Throwable th2) {
                0f9 AEh2 = 0wj.A00.AEh(false, (String) null, 694559790, 0);
                AEh2.ERJ(th2);
                AEh2.report();
            }
        } else {
            for (C61110lV r13 : list) {
                try {
                    String name3 = r13.getClass().getName();
                    0qQ.A07(name3);
                    andIncrement = atomicInteger.getAndIncrement();
                    14i.A00().markerStart(694559790, andIncrement, false);
                    14i.A00().markerAnnotate(694559790, andIncrement, "operation", "onAppForegrounded");
                    14i.A00().markerAnnotate(694559790, andIncrement, "listener", 002.A0g("<cls>", name3, "</cls>"));
                    14i.A00().markerAnnotate(694559790, andIncrement, "asl_session_id", 0LA.A01());
                    if (((List) C62000qj.A02.A05.invoke()).contains("onAppForegrounded")) {
                        r13.onAppForegrounded();
                    } else {
                        r13.onAppForegrounded();
                    }
                } catch (Throwable th3) {
                    0f9 AEh3 = 0wj.A00.AEh(false, (String) null, 694559790, 0);
                    AEh3.ERJ(th3);
                    AEh3.report();
                }
                14i.A00().markerEnd(694559790, andIncrement, 2);
            }
        }
        14i.A00().markerEnd(694564060, andIncrement2, 2);
    }
}
