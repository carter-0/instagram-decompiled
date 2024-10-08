package X;

public final class PyE {
    public final PyF A00 = new PyF();

    public final void A00(Exception exc) {
        PyF pyF = this.A00;
        Object obj = pyF.A03;
        synchronized (obj) {
            if (!pyF.A02) {
                PyF.A01(pyF);
                pyF.A02 = true;
                pyF.A00 = exc;
                obj.notifyAll();
                PyF.A02(pyF);
            }
        }
    }

    public final void A01(Object obj) {
        PyF pyF = this.A00;
        Object obj2 = pyF.A03;
        synchronized (obj2) {
            if (!pyF.A02) {
                PyF.A01(pyF);
                pyF.A02 = true;
                pyF.A01 = obj;
                obj2.notifyAll();
                PyF.A02(pyF);
            }
        }
    }
}
