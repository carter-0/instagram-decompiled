package X;

import com.google.common.collect.ImmutableList;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class FAH {
    public final Deque A00 = new LinkedList();
    public final Map A01 = AnonymousClass7TE.A1E();
    public final Set A02 = AnonymousClass7TE.A1F();

    public static void A00(FAH fah) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) fah.A00);
        for (Reference reference : fah.A02) {
            C49415EvH evH = (C49415EvH) reference.get();
            if (evH != null) {
                0qQ.A0B(copyOf, 0);
                C49707F2s f2s = evH.A00;
                f2s.A08.A00(f2s.A06.A00(f2s.A04, copyOf));
                C49905FEd.A01(f2s.A03);
            }
        }
    }
}
