package X;

/* renamed from: X.5AI  reason: invalid class name */
public abstract class AnonymousClass5AI {
    public void A00(AnonymousClass5AF r2, AnonymousClass5AF r3) {
        ((AnonymousClass5AH) this).A02.lazySet(r2, r3);
    }

    public void A01(AnonymousClass5AF r2, Thread thread) {
        ((AnonymousClass5AH) this).A03.lazySet(r2, thread);
    }

    public boolean A02(AnonymousClass5AG r2, AnonymousClass5AG r3, AnonymousClass5AE r4) {
        return 1Ev.A00(r4, r2, r3, ((AnonymousClass5AH) this).A00);
    }

    public boolean A03(AnonymousClass5AF r2, AnonymousClass5AF r3, AnonymousClass5AE r4) {
        return 1Ev.A00(r4, r2, r3, ((AnonymousClass5AH) this).A04);
    }

    public boolean A04(AnonymousClass5AE r3, Object obj, Object obj2) {
        return 1Ev.A00(r3, (Object) null, obj2, ((AnonymousClass5AH) this).A01);
    }
}
