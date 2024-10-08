package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.LaA  reason: case insensitive filesystem */
public final class C64335LaA implements MRQ {
    public final /* synthetic */ KB6 A00;
    public final /* synthetic */ C64126LOx A01;

    public C64335LaA(KB6 kb6, C64126LOx lOx) {
        this.A01 = lOx;
        this.A00 = kb6;
    }

    public final void DHh(C14123TqI tqI) {
        C64126LOx lOx = this.A01;
        int i = -16777216;
        if (tqI != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(Collections.unmodifiableList(tqI.A02));
            01V.A1D(A1D, MAS.A00);
            Iterator it = A1D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14122TqH tqH = (C14122TqH) it.next();
                float[] A012 = tqH.A01();
                0qQ.A07(A012);
                float f = A012[2];
                if (f >= 0.4f) {
                    if (f < 0.5f) {
                        A012[2] = 0.4f;
                        i = 2eL.A07(A012);
                        break;
                    }
                } else {
                    i = tqH.A05;
                    break;
                }
            }
        }
        Integer valueOf = Integer.valueOf(i);
        lOx.A02 = valueOf;
        KB6 kb6 = this.A00;
        if (kb6 == null) {
            return;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (kb6.A0N.isResumed() && kb6.A03 == C62590KiN.A09) {
                kb6.A0Q.setTintColor(intValue);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
