package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Xuy  reason: case insensitive filesystem */
public final class C22072Xuy implements C22521Y7s, Y8G {
    public static C22072Xuy A0C;
    public static final ImmutableList A0D = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList A0E = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList A0F = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList A0G = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList A0H = ImmutableList.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static final ImmutableList A0I = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final C21362XYp A08 = new C21362XYp();
    public final XnG A09 = new XnG();
    public final YB5 A0A;
    public final ImmutableMap A0B;

    public static long A00(C22072Xuy xuy, int i) {
        ImmutableMap immutableMap = xuy.A0B;
        Number number = (Number) immutableMap.get(Integer.valueOf(i));
        if (number == null && (number = (Number) immutableMap.get(0)) == null) {
            number = 1000000L;
        }
        return number.longValue();
    }

    public static void A01(C22072Xuy xuy, int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != xuy.A07) {
            xuy.A07 = j2;
            Iterator it = xuy.A08.A00.iterator();
            while (it.hasNext()) {
                C21406XaE xaE = (C21406XaE) it.next();
                if (!xaE.A00) {
                    xaE.A01.post(new Y3X(xaE, i, j, j2));
                }
            }
        }
    }

    public C22072Xuy(Context context, YB5 yb5, Map map) {
        this.A0B = ImmutableMap.copyOf(map);
        this.A0A = yb5;
        if (context != null) {
            SOE A002 = SOE.A00(context);
            int A022 = A002.A02();
            this.A00 = A022;
            this.A02 = A00(this, A022);
            C22070Xuw xuw = new C22070Xuw(this);
            CopyOnWriteArrayList copyOnWriteArrayList = A002.A02;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference.get() == null) {
                    copyOnWriteArrayList.remove(reference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(xuw));
            A002.A01.post(new Y2I(xuw, A002));
            return;
        }
        this.A00 = 0;
        this.A02 = A00(this, 0);
    }
}
