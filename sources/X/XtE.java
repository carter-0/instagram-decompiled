package X;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class XtE {
    public static XtE A06 = new XtE(true);
    public static XtE A07 = new XtE((Object) AnonymousClass7TE.A0u());
    public static XtE A08 = new XtE((Object) null);
    public static XtE A09 = new XtE((Object) true);
    public static final Executor A0A;
    public static final Executor A0B = SE2.A03.A00;
    public static final ExecutorService A0C;
    public Exception A00;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02;
    public Object A03;
    public boolean A04;
    public final Object A05 = Pxe.A0p();

    static {
        C11191SEr sEr = C11191SEr.A03;
        A0C = sEr.A01;
        A0A = sEr.A00;
    }

    public static XtE A00(Callable callable) {
        ExecutorService executorService = A0C;
        C21496Xcu xcu = new C21496Xcu();
        try {
            executorService.execute(new Y2M(xcu, callable));
        } catch (Exception e) {
            xcu.A01(new RuntimeException("An exception was thrown by an Executor", e));
        }
        return xcu.A00;
    }

    public static void A01(XtE xtE) {
        synchronized (xtE.A05) {
            for (Y95 Ezi : xtE.A01) {
                try {
                    Ezi.Ezi(xtE);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            xtE.A01 = null;
        }
    }

    public final XtE A02(Y95 y95, Executor executor) {
        boolean z;
        C21496Xcu xcu = new C21496Xcu();
        synchronized (this.A05) {
            z = this.A02;
            Y95 y952 = y95;
            Executor executor2 = executor;
            if (!z) {
                this.A01.add(new C22129Xvt(y952, this, xcu, executor2, 0));
            }
        }
        if (z) {
            try {
                executor.execute(new Y32(y95, this, xcu));
            } catch (Exception e) {
                xcu.A01(new RuntimeException("An exception was thrown by an Executor", e));
            }
        }
        return xcu.A00;
    }

    public final Exception A03() {
        Exception exc;
        synchronized (this.A05) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A04() {
        Object obj;
        synchronized (this.A05) {
            obj = this.A03;
        }
        return obj;
    }

    public final void A05(Y95 y95, Executor executor) {
        boolean z;
        C22128Xvs xvs = new C22128Xvs(y95, this);
        C21496Xcu xcu = new C21496Xcu();
        synchronized (this.A05) {
            z = this.A02;
            Executor executor2 = executor;
            if (!z) {
                this.A01.add(new C22129Xvt(xvs, this, xcu, executor2, 1));
            }
        }
        if (z) {
            try {
                executor.execute(new TI5(xvs, this, xcu));
            } catch (Exception e) {
                xcu.A01(new RuntimeException("An exception was thrown by an Executor", e));
            }
        }
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A05) {
            z = this.A04;
        }
        return z;
    }

    public final boolean A07() {
        boolean A1V;
        synchronized (this.A05) {
            A1V = AnonymousClass7TF.A1V(A03());
        }
        return A1V;
    }

    public final boolean A08() {
        boolean z;
        Object obj = this.A05;
        synchronized (obj) {
            z = false;
            if (!this.A02) {
                z = true;
                this.A02 = true;
                this.A04 = true;
                obj.notifyAll();
                A01(this);
            }
        }
        return z;
    }

    public final boolean A09(Object obj) {
        boolean z;
        Object obj2 = this.A05;
        synchronized (obj2) {
            z = false;
            if (!this.A02) {
                z = true;
                this.A02 = true;
                this.A03 = obj;
                obj2.notifyAll();
                A01(this);
            }
        }
        return z;
    }

    public XtE(Object obj) {
        A09(obj);
    }

    public XtE(boolean z) {
        A08();
    }

    public XtE() {
    }
}
