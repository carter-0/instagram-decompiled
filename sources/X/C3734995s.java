package X;

import java.util.Set;

/* renamed from: X.95s  reason: invalid class name and case insensitive filesystem */
public abstract class C3734995s {
    public final C3734495k A01(Class cls) {
        C3734495k r0;
        if (this instanceof C3734895r) {
            C3734895r r1 = (C3734895r) this;
            synchronized (r1) {
                r0 = (C3734495k) r1.A02.get(cls);
            }
            return r0;
        }
        AnonymousClass96N r12 = (AnonymousClass96N) this;
        if (r12.A02.contains(cls)) {
            return r12.A00.A01(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public final C3734495k A02(Class cls) {
        C3734495k r0;
        if (this instanceof C3734895r) {
            C3734895r r1 = (C3734895r) this;
            synchronized (r1) {
                r0 = (AnonymousClass96M) r1.A03.get(cls);
                if (r0 == null) {
                    r0 = C3734895r.A06;
                }
            }
            return r0;
        }
        AnonymousClass96N r12 = (AnonymousClass96N) this;
        if (r12.A05.contains(cls)) {
            return r12.A00.A02(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public final Object A03(Class cls) {
        if (this instanceof AnonymousClass96N) {
            AnonymousClass96N r1 = (AnonymousClass96N) this;
            if (r1.A01.contains(cls)) {
                Object A03 = r1.A00.A03(cls);
                if (!cls.equals(C3735295v.class)) {
                    return A03;
                }
                return new AX5((C3735295v) A03, r1.A03);
            }
            throw new RuntimeException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
        }
        C3734495k A01 = A01(cls);
        if (A01 == null) {
            return null;
        }
        return A01.get();
    }

    public final Set A04(Class cls) {
        if (!(this instanceof AnonymousClass96N)) {
            return (Set) A02(cls).get();
        }
        AnonymousClass96N r1 = (AnonymousClass96N) this;
        if (r1.A04.contains(cls)) {
            return r1.A00.A04(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
