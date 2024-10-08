package X;

import android.util.Log;
import android.util.SparseArray;

public final /* synthetic */ class PyV implements Runnable {
    public final PyP A00;
    public final PyR A01;

    public PyV(PyP pyP, PyR pyR) {
        this.A00 = pyP;
        this.A01 = pyR;
    }

    public final void run() {
        PyP pyP = this.A00;
        int i = this.A01.A01;
        synchronized (pyP) {
            SparseArray sparseArray = pyP.A03;
            PyR pyR = (PyR) sparseArray.get(i);
            if (pyR != null) {
                Log.w("MessengerIpcClient", Pxg.A0t("Timing out request: ", Pxe.A14(31), i));
                sparseArray.remove(i);
                RKU rku = new RKU(3, "Timed out waiting for response");
                PyR.A00(pyR, rku);
                pyR.A03.A00(rku);
                pyP.A00();
            }
        }
    }
}
