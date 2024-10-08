package X;

/* renamed from: X.84R  reason: invalid class name */
public final class AnonymousClass84R implements Runnable {
    public final /* synthetic */ PyJ A00;
    public final /* synthetic */ C358108aN A01;

    public AnonymousClass84R(PyJ pyJ, C358108aN r2) {
        this.A00 = pyJ;
        this.A01 = r2;
    }

    public final void run() {
        PyJ pyJ = this.A00;
        if (pyJ.A01) {
            this.A01.onSuccess();
            return;
        }
        String str = "";
        boolean z = true;
        PyF pyF = pyJ.A06;
        if (pyF.A04() != null) {
            if (((C294495mY) pyF.A04()).A01 != null) {
                str = ((C294495mY) pyF.A04()).A01.toString();
            }
            z = ((C294495mY) pyF.A04()).A02;
        }
        this.A01.onFailure(str, z);
    }
}
