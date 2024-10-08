package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.62Q  reason: invalid class name */
public abstract class AnonymousClass62Q {
    public static final AnonymousClass62P A00(Iterable iterable) {
        AnonymousClass62P r0;
        0qQ.A0B(iterable, 0);
        if (!(iterable instanceof AnonymousClass62P) || (r0 = (AnonymousClass62P) iterable) == null) {
            return A03(iterable);
        }
        return r0;
    }

    public static final C304516Dt A01(Map map) {
        C304516Dt r0;
        YCP ycp;
        0qQ.A0B(map, 0);
        if (((map instanceof C304516Dt) && (r0 = (C304516Dt) map) != null) || ((map instanceof YCP) && (ycp = (YCP) map) != null && (r0 = ycp.AEL()) != null)) {
            return r0;
        }
        AnonymousClass6G6 r1 = AnonymousClass6G6.A03;
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
        C21085XDy xDy = new C21085XDy(r1);
        xDy.putAll(map);
        return xDy.AEL();
    }

    public static final YCQ A02(Iterable iterable) {
        YCQ ycq;
        YCR ycr;
        0qQ.A0B(iterable, 0);
        if ((!(iterable instanceof YCQ) || (ycq = (YCQ) iterable) == null) && (!(iterable instanceof YCR) || (ycr = (YCR) iterable) == null || (ycq = ycr.AEM()) == null)) {
            return A06(iterable, C21082XDv.A03);
        }
        return ycq;
    }

    public static final AnonymousClass62O A03(Iterable iterable) {
        AnonymousClass62R r0;
        AnonymousClass62O AEK;
        AnonymousClass62O r02;
        0qQ.A0B(iterable, 0);
        if ((iterable instanceof AnonymousClass62O) && (r02 = (AnonymousClass62O) iterable) != null) {
            return r02;
        }
        if ((iterable instanceof AnonymousClass62R) && (r0 = (AnonymousClass62R) iterable) != null && (AEK = r0.AEK()) != null) {
            return AEK;
        }
        AnonymousClass62M r2 = AnonymousClass62M.A01;
        0qQ.A0B(r2, 0);
        if (iterable instanceof Collection) {
            return r2.A09((Collection) iterable);
        }
        C14133TqS tqS = new C14133TqS(r2, r2.A00);
        018.A16(iterable, tqS);
        return tqS.AEK();
    }

    public static final AnonymousClass62O A04(Object... objArr) {
        0qQ.A0B(objArr, 0);
        AnonymousClass62M r1 = AnonymousClass62M.A01;
        List asList = Arrays.asList(objArr);
        0qQ.A07(asList);
        return r1.A09(asList);
    }

    public static final C21082XDv A05(Iterable iterable) {
        XE5 xe5;
        C21082XDv AEM;
        0qQ.A0B(iterable, 0);
        if ((!(iterable instanceof C21082XDv) || (AEM = (C21082XDv) iterable) == null) && (!(iterable instanceof XE5) || (xe5 = (XE5) iterable) == null || (AEM = xe5.AEM()) == null)) {
            return A06(iterable, C21082XDv.A03);
        }
        return AEM;
    }

    public static final C21082XDv A06(Iterable iterable, C21082XDv xDv) {
        XE5 xe5;
        0qQ.A0B(xDv, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            0qQ.A0B(collection, 0);
            xe5 = new XE5(xDv);
            xe5.addAll(collection);
        } else {
            xe5 = new XE5(xDv);
            018.A16(iterable, xe5);
        }
        return xe5.AEM();
    }
}
