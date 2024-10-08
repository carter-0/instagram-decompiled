package X;

/* renamed from: X.5PI  reason: invalid class name */
public abstract class AnonymousClass5PI {
    public static final Object A00 = new Object();

    public static final AnonymousClass5PJ A01(C286575Wy r3, Object obj, int i) {
        if (0fL.A02()) {
            0fL.A01(634341122, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object ECw = r3.ECw();
        if (ECw == AnonymousClass5XT.A00) {
            ECw = new AnonymousClass5PJ(i, true, obj);
            r3.FLL(ECw);
        }
        AnonymousClass5PJ r1 = (AnonymousClass5PJ) ECw;
        r1.A0A(obj);
        if (0fL.A02()) {
            0fL.A00(222214924);
        }
        return r1;
    }

    public static final AnonymousClass5PJ A03(Object obj, int i) {
        return new AnonymousClass5PJ(i, true, obj);
    }

    public static final AnonymousClass5PJ A04(Object obj, int i, boolean z) {
        return new AnonymousClass5PJ(i, z, obj);
    }

    public static final boolean A05(C286635Xe r3, C286635Xe r4) {
        AnonymousClass5X7 r0;
        if (r3 == null) {
            return true;
        }
        if (!(r3 instanceof C286625Xd) || !(r4 instanceof C286625Xd)) {
            return false;
        }
        C286625Xd r2 = (C286625Xd) r3;
        if (r2.A05 == null || (r0 = r2.A04) == null || r0.A00 == Integer.MIN_VALUE || r3.equals(r4) || 0qQ.A0K(r2.A04, ((C286625Xd) r4).A04)) {
            return true;
        }
        return false;
    }

    public static final AnonymousClass5PJ A00(C286575Wy r4, Object obj) {
        AnonymousClass5PJ r1;
        r4.ExC(Integer.rotateLeft(-819894182, 1), A00);
        Object ECw = r4.ECw();
        if (ECw == AnonymousClass5XT.A00) {
            r1 = new AnonymousClass5PJ(-819894182, true, obj);
            r4.FLL(r1);
        } else {
            0qQ.A0C(ECw, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            r1 = (AnonymousClass5PJ) ECw;
            r1.A0A(obj);
        }
        C286565Wx.A0I((C286565Wx) r4);
        return r1;
    }

    public static final AnonymousClass5PJ A02(Object obj) {
        return new AnonymousClass5PJ(-632812321, true, obj);
    }
}
