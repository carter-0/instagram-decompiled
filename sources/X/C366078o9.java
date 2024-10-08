package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8o9  reason: invalid class name and case insensitive filesystem */
public final class C366078o9 implements C366088oA {
    public final ArrayList A00 = new ArrayList();

    public final void FK1(Long l) {
        long longValue;
        float f;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue() / 1000000;
        }
        Iterator it = this.A00.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            C39750A7q a7q = (C39750A7q) next;
            TransitionFilter transitionFilter = a7q.A05;
            if (a7q.A07) {
                long j = a7q.A04;
                if (longValue >= j && longValue < a7q.A03) {
                    if (a7q.A06) {
                        f = 0.5f;
                    } else {
                        f = a7q.A01 + ((((float) (longValue - j)) * a7q.A02) / a7q.A00);
                    }
                    transitionFilter.EpD(f);
                }
            }
            f = 0.0f;
            transitionFilter.EpD(f);
        }
    }
}
