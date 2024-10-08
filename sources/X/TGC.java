package X;

import java.io.File;

public final class TGC implements Runnable {
    public final /* synthetic */ SE6 A00;
    public final /* synthetic */ String A01;

    public TGC(SE6 se6, String str) {
        this.A00 = se6;
        this.A01 = str;
    }

    public final void run() {
        try {
            File A002 = SE6.A00(this.A00, this.A01);
            if (A002 != null) {
                A002.delete();
            }
        } catch (Exception e) {
            0KC.A0C("AppLogPersistenceProxyBase", 002.A0i("Error deleting ", "callSummaryInfo", e.getMessage(), 10));
        }
    }
}
