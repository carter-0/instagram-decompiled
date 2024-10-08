package X;

import java.util.Iterator;

/* renamed from: X.NrT  reason: case insensitive filesystem */
public abstract class C69744NrT {
    public static final C69346Njl A00(int i) {
        Object obj;
        C69346Njl njl = C69346Njl.UNSUPPORTED_TYPE;
        if (i > 6) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Stream error returned an unknown code: ");
            A1A.append(i);
            A1A.append(". It may be dataX error: ");
            0KC.A0D("StreamError", AnonymousClass7TF.A0i(new W0C(i), A1A));
        }
        Iterator it = C69346Njl.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C69346Njl) obj).A00 == i) {
                break;
            }
        }
        C69346Njl njl2 = (C69346Njl) obj;
        if (njl2 == null) {
            return njl;
        }
        return njl2;
    }
}
