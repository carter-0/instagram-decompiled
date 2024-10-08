package X;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class RA0 extends 0ng {
    public final /* synthetic */ T77 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA0(T77 t77) {
        super(147);
        this.A00 = t77;
    }

    public final void run() {
        ArrayList A1D;
        try {
            T77 t77 = this.A00;
            synchronized (t77) {
                List list = t77.A00;
                A1D = AnonymousClass7TE.A1D(list);
                list.clear();
            }
            Iterator it = A1D.iterator();
            while (it.hasNext()) {
                S3S s3s = (S3S) ((Reference) it.next()).get();
                if (s3s != null) {
                    s3s.A00();
                }
            }
        } catch (Exception e) {
            0KC.A0F("BleScannerFailsafe", "Error calling appBackgroundTriggered", e);
        }
    }
}
