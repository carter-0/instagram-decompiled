package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7N9  reason: invalid class name */
public final class AnonymousClass7N9 implements AnonymousClass7NA {
    public static final String A09 = 0q1.A01(AnonymousClass7N9.class);
    public final AnonymousClass2h0 A00;
    public final C226442gp A01;
    public final AnonymousClass7NB A02;
    public final Map A03 = new LinkedHashMap();
    public final Executor A04;
    public final ExecutorService A05;
    public final AtomicReference A06 = new AtomicReference();
    public final AtomicReference A07 = new AtomicReference();
    public final 0Gb A08;

    public AnonymousClass7N9(0Gb r2, AnonymousClass2h0 r3, C226442gp r4, AnonymousClass7NB r5, Executor executor, ExecutorService executorService) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r2, 6);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A04 = executor;
        this.A05 = executorService;
        this.A08 = r2;
    }

    public static final synchronized void A00(C71532dv r4, C16491Uvm uvm, AnonymousClass7N9 r6) {
        AnonymousClass61R r0;
        synchronized (r6) {
            Map map = r6.A03;
            C17417VUw vUw = (C17417VUw) map.get(uvm);
            if (vUw != null) {
                vUw.A02 = false;
                if (r4 == null) {
                    r6.A08.Ew0(A09, "Successful load did not include valid Document.");
                } else {
                    vUw.A00 = new WeakReference(r4);
                }
                C17417VUw vUw2 = (C17417VUw) map.get(uvm);
                if (vUw2 != null) {
                    Set set = vUw2.A01;
                    for (C17765Vfc vfc : C242173Sx.A0B(C41695Aym.A00, 00k.A0o(set))) {
                        if (r4 != null) {
                            r0 = new AnonymousClass61R(r4);
                        } else {
                            r0 = null;
                        }
                        vfc.A00(r0, uvm);
                    }
                    set.clear();
                }
            }
        }
    }

    static {
        Map map = 0Yh.A03;
    }
}
