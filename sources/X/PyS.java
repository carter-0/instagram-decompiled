package X;

public final /* synthetic */ class PyS implements Runnable {
    public final PyP A00;

    public PyS(PyP pyP) {
        this.A00 = pyP;
    }

    public final void run() {
        PyP pyP = this.A00;
        synchronized (pyP) {
            if (pyP.A00 == 1) {
                pyP.A01(1, "Timed out while binding");
            }
        }
    }
}
