package X;

import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mbb  reason: case insensitive filesystem */
public final class C66730Mbb implements AnonymousClass68Z {
    public static final C66730Mbb A00 = new C66730Mbb();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Long l;
        C66721MbS mbS = (C66721MbS) obj;
        int i = mbS.A00.A00;
        C2611948q r4 = mbS.A01;
        0qQ.A06(r4);
        List<AnonymousClass2Ep> list = mbS.A03;
        int size = list.size();
        if (AnonymousClass7TE.A1b(list)) {
            l = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(((2Eu) C66582MXn.A0r(list)).BKd()));
        } else {
            l = null;
        }
        HashSet A1F = AnonymousClass7TE.A1F();
        for (AnonymousClass2Ep r1 : list) {
            if (!r1.CUG() && (!r1.BRZ().isEmpty())) {
                A1F.add(((User) r1.BRZ().get(0)).getId());
            }
        }
        return new GAX(r4, l, (Set) A1F, i, size);
    }
}
