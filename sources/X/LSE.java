package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.List;

public final class LSE {
    public static final LSE A00 = new Object();

    public final int A02(Context context, List list, List list2, int i) {
        int i2 = 0;
        if (list2 == null || i == -1 || i >= list.size()) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += A00(context, (L40) list2.get(i4));
            i2 += A00(context, (L40) list.get(i4));
        }
        return i3 - i2;
    }

    public static final int A00(Context context, L40 l40) {
        int i;
        if (l40 instanceof KMD) {
            return ((KMD) l40).A00;
        }
        if (l40 instanceof KMC) {
            return ((KMC) l40).A00;
        }
        if (l40 instanceof KMF) {
            C61194Jyn jyn = ((KMF) l40).A04;
            int i2 = jyn.A02 - jyn.A05;
            i = C51970G9q.A07(i2, i2);
        } else if (l40 instanceof KME) {
            i = ((KME) l40).A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return C63117Krl.A00(context, i);
    }

    public static final void A01(View view, List list, List list2, int i) {
        KMC kmc;
        KMC kmc2;
        KMC kmc3;
        KMC kmc4;
        KMF kmf;
        if (view != null) {
            int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
            if (view.getLeft() <= 0 && view.getRight() >= i2 && (list.get(i) instanceof KMF)) {
                int i3 = i - 1;
                Object A0O = 00k.A0O(list, i3);
                if ((A0O instanceof KMC) && (kmc = (KMC) A0O) != null) {
                    int i4 = kmc.A00;
                    Object A0O2 = 00k.A0O(list2, i3);
                    if ((A0O2 instanceof KMC) && (kmc2 = (KMC) A0O2) != null) {
                        int i5 = i4 - kmc2.A00;
                        int i6 = i + 1;
                        Object A0O3 = 00k.A0O(list, i6);
                        if ((A0O3 instanceof KMC) && (kmc3 = (KMC) A0O3) != null) {
                            int i7 = kmc3.A00;
                            Object A0O4 = 00k.A0O(list2, i6);
                            if ((A0O4 instanceof KMC) && (kmc4 = (KMC) A0O4) != null) {
                                int i8 = i7 - kmc4.A00;
                                if (00k.A0O(list, i) instanceof KMF) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof KMF) && (kmf = (KMF) obj) != null) {
                                        list.set(i, new KMF(kmf.A04, kmf.A00, kmf.A01, i5, i8));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
