package X;

import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Vu  reason: invalid class name and case insensitive filesystem */
public abstract class C379909Vu {
    public static final boolean A06(AnonymousClass3Q2 r6) {
        Set<ADJ> set = r6.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ADJ adj : set) {
            if (adj.A00 == C391079sJ.VIDEO && 0qQ.A0K(adj.A0J, ProductType.STORY.A00) && AnonymousClass7TF.A1Y(adj.A03, false)) {
                return true;
            }
        }
        return false;
    }

    public static final long A00(AnonymousClass3Q2 r1) {
        if (r1.A61) {
            return r1.A0f;
        }
        return r1.A1N.A00();
    }

    public static final boolean A01(AnonymousClass3Q2 r2) {
        List list = r2.A4g;
        if ((list != null && !list.isEmpty()) || AnonymousClass7TE.A1b(r2.A4b) || r2.A57 || C59911Jba.A00(r2)) {
            return true;
        }
        ArrayList A0J = r2.A0J();
        if (A0J != null && !A0J.isEmpty()) {
            return true;
        }
        List list2 = r2.A4P;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(AnonymousClass3Q2 r4) {
        Set<ADJ> set = r4.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ADJ adj : set) {
            if (adj.A00 == C391079sJ.GIF && 0qQ.A0K(adj.A0K, C391369sm.GIPHY.A00)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A03(AnonymousClass3Q2 r4) {
        Set<ADJ> set = r4.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ADJ adj : set) {
            if (adj.A00 == C391079sJ.GIF && 0qQ.A0K(adj.A0K, C391369sm.MUSIC_SOUNDWAVE.A00)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A04(AnonymousClass3Q2 r3) {
        Iterator it = r3.A4t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (0qQ.A0K(((ADJ) next).A0J, ProductType.CLIPS.A00)) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A05(AnonymousClass3Q2 r4) {
        Set<ADJ> set = r4.A4t;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ADJ adj : set) {
            if (adj.A00 == C391079sJ.VIDEO && 0qQ.A0K(adj.A0J, ProductType.STORY.A00) && AnonymousClass7TF.A1Y(adj.A03, true) && 0qQ.A0I(adj.A08, -1.0f)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A07(AnonymousClass3Q2 r5) {
        if (!r5.A5r) {
            for (Object next : r5.A4t) {
                String str = ((ADJ) next).A0K;
                if (str != null && C391369sm.A01.get(str) != null) {
                    if (next != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A08(AnonymousClass3Q2 r3) {
        if (r3.A1G != 1iA.A0Q || !(!r3.A4t.isEmpty())) {
            return false;
        }
        return true;
    }
}
