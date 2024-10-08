package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.TCw  reason: case insensitive filesystem */
public final class C12907TCw implements Runnable {
    public final /* synthetic */ SEU A00;

    public C12907TCw(SEU seu) {
        this.A00 = seu;
    }

    public final void run() {
        SEU seu = SEU.A02;
        HashMap A1E = AnonymousClass7TE.A1E();
        Q1R q1r = Q1R.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        q1r.A00.drainTo(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            S3E s3e = (S3E) it.next();
            String str = s3e.A00;
            if ("DEVICE_ID".equals(str)) {
                str = "";
            }
            String str2 = s3e.A01;
            String A12 = Pxe.A12(Locale.ROOT, AnonymousClass000.A00(397), Pxf.A1X(str, str2, 2));
            List A1B = Pxe.A1B(A12, A1E);
            if (A1B == null) {
                A1B = AnonymousClass7TE.A1C();
                A1E.put(A12, A1B);
            }
            A1B.add(s3e.toString());
        }
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        if (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            A1J.getKey();
            A1J.getValue();
            0qQ.A0F("folder");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
