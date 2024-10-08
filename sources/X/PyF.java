package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class PyF {
    public Exception A00 = null;
    public Object A01 = null;
    public boolean A02 = false;
    public final Object A03 = Pxe.A0p();
    public final ArrayList A04 = AnonymousClass7TE.A1C();

    private void A00() {
        synchronized (this.A03) {
            if (!A06()) {
                throw new IllegalStateException("task has not completed");
            }
        }
    }

    public static void A01(PyF pyF) {
        synchronized (pyF.A03) {
            if (pyF.A06()) {
                throw AnonymousClass7TE.A0z("task has already completed");
            }
        }
    }

    public static void A02(PyF pyF) {
        synchronized (pyF.A03) {
            if (pyF.A06()) {
                ArrayList arrayList = pyF.A04;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PyG pyG = (PyG) it.next();
                    synchronized (pyG.A01) {
                        if (pyG.A00 != null) {
                            pyG.A02.execute(new C293185kJ(pyG, pyF));
                        }
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final Exception A03() {
        Exception exc;
        synchronized (this.A03) {
            A00();
            exc = this.A00;
        }
        return exc;
    }

    public final Object A04() {
        Object obj;
        synchronized (this.A03) {
            A00();
            obj = this.A01;
        }
        return obj;
    }

    public final void A05(B1A b1a, Executor executor) {
        PyG pyG = new PyG(b1a, executor);
        synchronized (this.A03) {
            this.A04.add(pyG);
            A02(this);
        }
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A03) {
            z = this.A02;
        }
        return z;
    }

    public final boolean A07() {
        boolean A1a;
        synchronized (this.A03) {
            A00();
            A1a = DbW.A1a(this.A00);
        }
        return A1a;
    }
}
