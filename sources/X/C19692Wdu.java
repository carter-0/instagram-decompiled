package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Wdu  reason: case insensitive filesystem */
public final class C19692Wdu implements X82 {
    public static final int[][] A00 = {new int[]{0, 2}, new int[]{1, 3}};

    public final int Bon(int i, int i2) {
        if (i2 == 2 || i == 1) {
            return 2;
        }
        return JTP.A01((double) (i + 1), 2.0d);
    }

    public final ArrayList Bop(List list, Set set, int i, int i2) {
        int min;
        ArrayList arrayList = new ArrayList();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A0F = AnonymousClass7TG.A0F(it);
            int A0F2 = AnonymousClass7TG.A0F(it);
            if (i == 0) {
                min = Math.max(A0F, A0F2);
            } else {
                min = Math.min(A0F, A0F2);
            }
            AnonymousClass7TF.A1M(arrayList, min);
        } else {
            int Bon = (Bon(i2, set.size()) - 1) - i;
            int i3 = Bon * 2;
            int[] iArr = {i3, i3 + 1};
            if (Bon < 2) {
                iArr = A00[Bon];
            }
            if (Pxf.A1U(set, iArr[0])) {
                AnonymousClass7TF.A1M(arrayList, iArr[0]);
            }
            if (Pxf.A1U(set, iArr[1])) {
                AnonymousClass7TF.A1M(arrayList, iArr[1]);
                return arrayList;
            }
        }
        return arrayList;
    }

    public final boolean Cb5(X82 x82) {
        return x82.getClass().equals(C19692Wdu.class);
    }
}
