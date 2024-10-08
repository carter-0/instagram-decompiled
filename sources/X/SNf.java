package X;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public final class SNf {
    public static final WeakHashMap A06 = new WeakHashMap();
    public final SparseArray A00 = Pxe.A0L();
    public final Map A01 = new ConcurrentHashMap();
    public final Set A02 = new CopyOnWriteArraySet();
    public final Set A03 = new CopyOnWriteArraySet();
    public final WeakReference A04;
    public final AtomicInteger A05 = Pxf.A10();

    public static SNf A00(Q6H q6h) {
        WeakHashMap weakHashMap = A06;
        SNf sNf = (SNf) weakHashMap.get(q6h);
        if (sNf != null) {
            return sNf;
        }
        SNf sNf2 = new SNf(q6h);
        weakHashMap.put(q6h, sNf2);
        return sNf2;
    }

    public SNf(Q6H q6h) {
        this.A04 = C51965G9l.A0v(q6h);
    }
}
