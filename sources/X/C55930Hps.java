package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hps  reason: case insensitive filesystem */
public final class C55930Hps {
    public final String A00;
    public final Map A01 = AnonymousClass7TE.A1E();

    public C55930Hps(String str, List list) {
        this.A00 = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55931Hpt hpt = (C55931Hpt) it.next();
            this.A01.put(hpt.A01, hpt);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShowreelNativeDocumentState{mName='");
        A1A.append(this.A00);
        A1A.append('\'');
        A1A.append(", mEventActions=");
        A1A.append(this.A01);
        return C51967G9n.A0r(A1A, '}');
    }
}
