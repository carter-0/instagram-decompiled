package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.56c  reason: invalid class name and case insensitive filesystem */
public final class C2811556c {
    public static C2811556c A08;
    public boolean A00 = false;
    public boolean A01 = false;
    public final ArrayList A02 = new ArrayList();
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final Map A05 = new HashMap();
    public final Set A06 = new LinkedHashSet();
    public final AnonymousClass56d A07;

    public final synchronized void A00(C2811956h r9) {
        RuntimeException runtimeException;
        if (!r9.A02) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected added GraphBinding to be active: ");
            sb.append(r9);
            runtimeException = new RuntimeException(sb.toString());
        } else if (this.A01) {
            this.A03.add(r9);
        } else {
            Set set = this.A06;
            set.add(r9);
            ArrayList arrayList = r9.A05;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                Map map = this.A05;
                C2813056t r1 = (C2813056t) map.get(obj);
                if (r1 != null) {
                    r1.A00++;
                } else {
                    C2813056t r12 = new C2813056t();
                    r12.A00 = 1;
                    map.put(obj, r12);
                }
            }
            if (set.size() == 1) {
                AnonymousClass56d r2 = this.A07;
                if (r2.A01 == null) {
                    runtimeException = new RuntimeException("Must set a binding graph first.");
                } else if (!r2.A03) {
                    r2.A03 = true;
                    if (!r2.A02) {
                        r2.A05.A01(r2.A04);
                        r2.A02 = true;
                    }
                } else {
                    runtimeException = new RuntimeException("Tried to start but was already running.");
                }
            }
            this.A00 = true;
        }
        throw runtimeException;
    }

    public final synchronized void A01(C2811956h r9) {
        RuntimeException runtimeException;
        if (this.A01) {
            this.A04.add(r9);
        } else {
            Set set = this.A06;
            if (set.remove(r9)) {
                ArrayList arrayList = r9.A05;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = arrayList.get(i);
                    Map map = this.A05;
                    C2813056t r1 = (C2813056t) map.get(obj);
                    int i2 = r1.A00 - 1;
                    r1.A00 = i2;
                    if (i2 == 0) {
                        map.remove(obj);
                    }
                }
                if (set.isEmpty()) {
                    AnonymousClass56d r5 = this.A07;
                    if (r5.A03) {
                        r5.A03 = false;
                        C2811656e r3 = r5.A05;
                        C2811856g r2 = r5.A04;
                        r2.A02.set((Object) null);
                        Choreographer choreographer = r3.A00;
                        if (choreographer != null) {
                            Choreographer.FrameCallback frameCallback = r2.A00;
                            if (frameCallback == null) {
                                frameCallback = new C2813156u(r2);
                                r2.A00 = frameCallback;
                            }
                            choreographer.removeFrameCallback(frameCallback);
                        } else {
                            Handler handler = r3.A01;
                            Runnable runnable = r2.A01;
                            if (runnable == null) {
                                runnable = new C22378Y1g(r2);
                                r2.A01 = runnable;
                            }
                            handler.removeCallbacks(runnable);
                        }
                        r5.A02 = false;
                        this.A02.clear();
                        if (!this.A05.isEmpty()) {
                            runtimeException = new RuntimeException("Failed to clean up all nodes");
                        }
                    } else {
                        runtimeException = new RuntimeException("Tried to stop but wasn't running.");
                    }
                }
                this.A00 = true;
            } else {
                runtimeException = new RuntimeException("Tried to unregister non-existent binding");
            }
            throw runtimeException;
        }
    }

    public C2811556c(AnonymousClass56d r3) {
        this.A07 = r3;
    }
}
