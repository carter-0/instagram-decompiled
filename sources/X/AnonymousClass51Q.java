package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.51Q  reason: invalid class name */
public abstract class AnonymousClass51Q {
    public static final AnonymousClass51R A00;

    public static final ImmutableList A00(C365998o1 r26, C366518pA r27, Collection collection) {
        String str;
        AnonymousClass51M r1;
        AnonymousClass51M r12;
        Collection<AnonymousClass51N> collection2 = collection;
        0qQ.A0B(collection2, 0);
        ADZ adz = ADZ.A00;
        ArrayList arrayList = new ArrayList(0Yv.A1E(collection2, 10));
        Iterator it = collection2.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass51N r13 = (AnonymousClass51N) it.next();
            if ((r13 instanceof AnonymousClass51M) && (r12 = (AnonymousClass51M) r13) != null) {
                str2 = r12.A0L;
            }
            arrayList.add(str2);
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(collection2, 10));
        for (AnonymousClass51N r14 : collection2) {
            if (!(r14 instanceof AnonymousClass51M) || (r1 = (AnonymousClass51M) r14) == null) {
                str = null;
            } else {
                str = r1.A0M;
            }
            arrayList2.add(str);
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(collection2, 10));
        for (AnonymousClass51N BrP : collection2) {
            arrayList3.add(Integer.valueOf(BrP.BrP()));
        }
        ArrayList arrayList4 = new ArrayList(0Yv.A1E(collection2, 10));
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList4.add(Integer.valueOf(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION));
        }
        ArrayList arrayList5 = new ArrayList(0Yv.A1E(collection2, 10));
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            it3.next();
            arrayList5.add(Integer.valueOf(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION));
        }
        boolean A0a = 0tS.A4E.A00().A0a();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (arrayList.size() == arrayList2.size() && arrayList2.size() == arrayList3.size()) {
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C365998o1 r132 = r26;
                C366518pA r142 = r27;
                C39785A9f A002 = adz.A00(r132, r142, (Float) null, (Float) null, AnonymousClass05K.A00, (String) arrayList.get(i), ((Number) arrayList4.get(i)).intValue(), ((Number) arrayList5.get(i)).intValue(), j, j + ((Number) arrayList3.get(i)).longValue(), A0a);
                if (A002 != null) {
                    builder.add(A002);
                }
                C39785A9f A003 = adz.A00(r132, r142, (Float) null, (Float) null, AnonymousClass05K.A01, (String) arrayList2.get(i), ((Number) arrayList4.get(i)).intValue(), ((Number) arrayList5.get(i)).intValue(), j, j + ((Number) arrayList3.get(i)).longValue(), A0a);
                if (A003 != null) {
                    builder.add(A003);
                }
                j += ((Number) arrayList3.get(i)).longValue();
            }
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }

    public static final ImmutableList A02(Collection collection, boolean z) {
        Object A0C;
        0qQ.A0B(collection, 0);
        if (!z) {
            return A01(collection);
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass51N r1 = (AnonymousClass51N) it.next();
            if (r1 instanceof KN4) {
                A0C = ((KN4) r1).A0B();
            } else if (r1 instanceof AnonymousClass51M) {
                AnonymousClass51M r12 = (AnonymousClass51M) r1;
                if (A05(r12)) {
                    A0C = r12.A0D();
                } else {
                    A0C = r12.A0C();
                }
            } else {
                throw new RuntimeException();
            }
            arrayList.add(A0C);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        0qQ.A0A(copyOf);
        return copyOf;
    }

    public static final ClipSegment A03(AnonymousClass51N r1) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof KN4) {
            return ((KN4) r1).A0B();
        }
        if (r1 instanceof AnonymousClass51M) {
            AnonymousClass51M r12 = (AnonymousClass51M) r1;
            if (A05(r12)) {
                return r12.A0D();
            }
            return r12.A0C();
        }
        throw new RuntimeException();
    }

    public static final boolean A05(AnonymousClass51M r2) {
        String str;
        0qQ.A0B(r2, 0);
        AnonymousClass51R r22 = r2.A0F;
        if (!r22.A0K || (str = r22.A0I) == null || 00l.A0W(str)) {
            return false;
        }
        return true;
    }

    static {
        AnonymousClass51R r1 = new AnonymousClass51R();
        r1.A0F = "";
        A00 = r1;
    }

    public static final ImmutableList A01(Collection collection) {
        ArrayList arrayList = new ArrayList(0Yv.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A03((AnonymousClass51N) it.next()));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public static final LayoutTransform A04(AnonymousClass51N r8) {
        Integer num;
        C376429Hy A04 = r8.A04();
        if (A04 != null) {
            return new LayoutTransform(AnonymousClass05K.A0N, A04.A02, A04.A00, A04.A03, A04.A01, 0, 0, false);
        }
        if (r8.A09()) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        return new LayoutTransform(num, 1.0f, 0.0f, 0.0f, 0.0f, 0, 0, false);
    }
}
