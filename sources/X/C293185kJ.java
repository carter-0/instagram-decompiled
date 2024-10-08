package X;

/* renamed from: X.5kJ  reason: invalid class name and case insensitive filesystem */
public final class C293185kJ implements Runnable {
    public final /* synthetic */ PyG A00;
    public final /* synthetic */ PyF A01;

    public C293185kJ(PyG pyG, PyF pyF) {
        this.A00 = pyG;
        this.A01 = pyF;
    }

    public final void run() {
        PyG pyG = this.A00;
        synchronized (pyG.A01) {
            B1A b1a = pyG.A00;
            if (b1a != null) {
                b1a.D5F(this.A01);
            }
        }
    }
}
