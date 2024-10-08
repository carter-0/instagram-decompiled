package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7zL  reason: invalid class name and case insensitive filesystem */
public abstract class C348947zL {
    public static final int A01(AnonymousClass831 r3) {
        if (r3 == null) {
            return 0;
        }
        List list = r3.A01;
        if (list.isEmpty()) {
            return r3.A00;
        }
        List<AnonymousClass51N> subList = r3.A05().subList(0, list.size());
        ArrayList arrayList = new ArrayList(0Yv.A1E(subList, 10));
        for (AnonymousClass51N A00 : subList) {
            arrayList.add(Integer.valueOf(A00(A00)));
        }
        return 00k.A02(arrayList);
    }

    public static final int A00(AnonymousClass51N r4) {
        if (r4 instanceof AnonymousClass51M) {
            AnonymousClass51M r42 = (AnonymousClass51M) r4;
            AnonymousClass51R r43 = r42.A0F;
            return (int) Math.ceil((((double) (r42.A08 - r42.A09)) * ((double) r43.A06)) / ((double) (r43.A02 - r43.A03)));
        } else if (r4 instanceof KN4) {
            return ((KN4) r4).A00;
        } else {
            return 0;
        }
    }

    public static final File A02(AnonymousClass51M r2, 2Nn r3, boolean z) {
        if (z || r2.A00 == 1.0f) {
            return new File(r2.A0F.A0F);
        }
        File A01 = C39907AIy.A01(r3, new File(r2.A0F.A0F), "adjusted");
        if (A01.exists()) {
            return A01;
        }
        throw new IOException("Adjusted source video file does not exist");
    }
}
