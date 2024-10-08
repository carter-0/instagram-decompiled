package X;

/* renamed from: X.TDs  reason: case insensitive filesystem */
public final class C12929TDs implements Runnable {
    public final /* synthetic */ PyJ A00;

    public C12929TDs(PyJ pyJ) {
        this.A00 = pyJ;
    }

    public final void run() {
        PyJ pyJ = this.A00;
        synchronized (pyJ) {
            0hq r1 = pyJ.A07.A02;
            if (r1 != null) {
                pyJ.A00 = true;
                SQH.A02(r1);
            } else {
                0wb.A01(0kg.A0A, "InstagramDownloadableModuleTask:displaySpinner", "display spinner called, but spinner not enabled");
            }
        }
    }
}
