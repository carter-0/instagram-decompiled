package X;

import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class Xnx {
    public static final Executor A06;
    public boolean A00;
    public final int A01 = 5;
    public final long A02;
    public final Runnable A03 = new Y2C(this);
    public final Deque A04 = new ArrayDeque();
    public final XZX A05 = new XZX();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        C22023Xt4 xt4 = SUS.A04;
        A06 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new Y4C("OkHttp ConnectionPool", true));
    }

    public Xnx(TimeUnit timeUnit) {
        this.A02 = timeUnit.toNanos(5);
    }

    public final boolean A00(List list, C21504XdI xdI, C21988Xp1 xp1, boolean z) {
        for (Y7U y7u : this.A04) {
            if (!z || y7u.A09 != null) {
                List list2 = y7u.A0D;
                if (list2.size() < y7u.A00 && !y7u.A0C) {
                    C21500Xd1 xd1 = y7u.A0E;
                    C21504XdI xdI2 = xd1.A02;
                    if (xdI2.A00(xdI)) {
                        C11427STm sTm = xdI.A0A;
                        String str = sTm.A02;
                        if (!str.equals(xdI2.A0A.A02)) {
                            if (y7u.A09 != null && list != null) {
                                int size = list.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        continue;
                                        break;
                                    }
                                    C21500Xd1 xd12 = (C21500Xd1) list.get(i);
                                    Proxy.Type type = xd12.A01.type();
                                    Proxy.Type type2 = Proxy.Type.DIRECT;
                                    if (type != type2 || xd1.A01.type() != type2 || !xd1.A00.equals(xd12.A00)) {
                                        i++;
                                    } else if (xdI.A05 == TPE.A00 && y7u.A02(sTm)) {
                                        try {
                                            xdI.A08.A01(str, y7u.A07.A00);
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                        if (xp1.A04 == null) {
                            xp1.A04 = y7u;
                            list2.add(new Y5W(xp1.A00, xp1));
                            return true;
                        }
                        throw Pxe.A0i();
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
