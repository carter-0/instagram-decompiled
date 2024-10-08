package X;

import com.instagram.arlink.ui.GridPatternView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.La9  reason: case insensitive filesystem */
public final class C64334La9 implements MRQ {
    public final /* synthetic */ GridPatternView A00;

    public C64334La9(GridPatternView gridPatternView) {
        this.A00 = gridPatternView;
    }

    public final void DHh(C14123TqI tqI) {
        GridPatternView gridPatternView = this.A00;
        int i = -16777216;
        if (tqI != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(Collections.unmodifiableList(tqI.A02));
            Collections.sort(A1D, new MAY(4));
            Iterator it = A1D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14122TqH tqH = (C14122TqH) it.next();
                float[] A01 = tqH.A01();
                float f = A01[2];
                if (f >= 0.4f) {
                    if (f < 0.5f) {
                        A01[2] = 0.4f;
                        i = 2eL.A07(A01);
                        break;
                    }
                } else {
                    i = tqH.A05;
                    break;
                }
            }
        }
        Integer valueOf = Integer.valueOf(i);
        gridPatternView.A03 = valueOf;
        C66387MPt mPt = gridPatternView.A02;
        if (mPt != null) {
            int intValue = valueOf.intValue();
            KB6 kb6 = (KB6) mPt;
            kb6.A01 = intValue;
            if (kb6.A0N.isResumed() && kb6.A03 == C62590KiN.A08) {
                kb6.A0Q.setTintColor(intValue);
            }
        }
    }
}
