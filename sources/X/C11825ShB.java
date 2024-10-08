package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.ShB  reason: case insensitive filesystem */
public final class C11825ShB implements C13520Tbp {
    public static final C11825ShB A00 = new Object();
    public static final SNH A01 = SNH.A01("c", "v", "i", "o");

    public static PointF A00(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public final /* bridge */ /* synthetic */ Object E1k(C12828T8z t8z, float f) {
        C12828T8z t8z2 = t8z;
        if (t8z2.A0E() == AnonymousClass05K.A00) {
            t8z2.A0I();
        }
        t8z2.A0J();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (t8z2.A0Q()) {
            int A0D = t8z2.A0D(A01);
            if (A0D != 0) {
                float f2 = f;
                if (A0D == 1) {
                    arrayList = C11400SRv.A03(t8z2, f2);
                } else if (A0D == 2) {
                    arrayList2 = C11400SRv.A03(t8z2, f2);
                } else if (A0D != 3) {
                    t8z2.A0M();
                    t8z2.A0N();
                } else {
                    arrayList3 = C11400SRv.A03(t8z2, f2);
                }
            } else {
                z = t8z2.A0R();
            }
        }
        t8z2.A0L();
        if (t8z2.A0E() == AnonymousClass05K.A01) {
            t8z2.A0K();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw AnonymousClass7TE.A0w("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new SHA(new PointF(), Collections.emptyList(), false);
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList A0v = DbS.A0v(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                PointF pointF3 = SQL.A00;
                A0v.add(new SH9(A00((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), A00(pointF2, (PointF) arrayList2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF4 = (PointF) arrayList.get(0);
                int i3 = size - 1;
                PointF pointF5 = SQL.A00;
                A0v.add(new SH9(A00((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), A00(pointF4, (PointF) arrayList2.get(0)), pointF4));
            }
            return new SHA(pointF, A0v, z);
        }
    }
}
