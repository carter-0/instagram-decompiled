package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.Vg1  reason: case insensitive filesystem */
public final class C17789Vg1 {
    public final VL6 A00 = new VL6();
    public final Map A01 = new HashMap();

    public final void A00(String str) {
        VQV vqv;
        IllegalStateException th;
        synchronized (this) {
            Map map = this.A01;
            Object obj = map.get(str);
            C9217RTu.A00(obj);
            vqv = (VQV) obj;
            int i = vqv.A00;
            if (i >= 1) {
                int i2 = i - 1;
                vqv.A00 = i2;
                if (i2 == 0) {
                    VQV vqv2 = (VQV) map.remove(str);
                    if (vqv2.equals(vqv)) {
                        Queue queue = this.A00.A00;
                        synchronized (queue) {
                            try {
                                if (queue.size() < 10) {
                                    queue.offer(vqv2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(vqv);
                        sb.append(", but actually removed: ");
                        sb.append(vqv2);
                        th = new IllegalStateException(Pxg.A0s(", safeKey: ", str, sb));
                    }
                }
            } else {
                th = new IllegalStateException(002.A07(i, "Cannot release a lock that is not held, safeKey: ", str, ", interestedThreads: "));
            }
            throw th;
        }
        vqv.A01.unlock();
    }
}
