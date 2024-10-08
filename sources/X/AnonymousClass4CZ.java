package X;

/* renamed from: X.4CZ  reason: invalid class name */
public abstract class AnonymousClass4CZ extends C262074Ca implements C262104Cd {
    public static final AnonymousClass12a A00 = new AnonymousClass12a();

    public boolean A0L(C262094Cc r2) {
        return true;
    }

    public abstract void A0O(Runnable runnable, C262094Cc r2);

    public final C262084Cb get(C634312c r4) {
        C262084Cb r0;
        0qQ.A0B(r4, 1);
        if (r4 instanceof C634212b) {
            C634212b r42 = (C634212b) r4;
            C634312c key = getKey();
            0qQ.A0B(key, 0);
            if ((key == r42 || r42.A00 == key) && (r0 = (C262084Cb) r42.A01.invoke(this)) != null) {
                return r0;
            }
        } else if (C262104Cd.A00 == r4) {
            return this;
        }
        return null;
    }

    public final C262094Cc minusKey(C634312c r4) {
        AnonymousClass4CZ r2 = this;
        0qQ.A0B(r4, 1);
        if (r4 instanceof C634212b) {
            C634212b r42 = (C634212b) r4;
            C634312c key = getKey();
            0qQ.A0B(key, 0);
            if ((key == r42 || r42.A00 == key) && r42.A01.invoke(this) != null) {
                r2 = 19B.A00;
            }
            return r2;
        }
        if (C262104Cd.A00 == r4) {
            r2 = 19B.A00;
        }
        return r2;
    }

    public AnonymousClass4CZ() {
        super(C262104Cd.A00);
    }

    public AnonymousClass4CZ A0M(int i) {
        C634812u.A00(i);
        return new 12v(this, i);
    }

    public String toString() {
        return 002.A0T(getClass().getSimpleName(), Integer.toHexString(System.identityHashCode(this)), '@');
    }

    public void A0N(Runnable runnable, C262094Cc r2) {
        A0O(runnable, r2);
    }
}
