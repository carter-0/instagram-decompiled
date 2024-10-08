package X;

/* renamed from: X.3al  reason: invalid class name and case insensitive filesystem */
public final class C244173al extends 2Sg implements C251223ml, C251233mm {
    public final String A00;
    public final 0sP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C244173al(String str, 0sP r5) {
        super(new AnonymousClass2Si((2V1) null, (C251233mm) null), -1);
        0qQ.A0B(r5, 3);
        this.A01 = r5;
        this.A00 = str;
        this.A00.A01 = this;
    }

    public final Object A00(Object obj) {
        0qQ.A0B(obj, 0);
        C377179Kv r1 = new C377179Kv(this, 16);
        String str = this.A00;
        if (!(str == null || str.length() == 0)) {
            r1.invoke();
        }
        Object invoke = this.A01.invoke(obj);
        if (!(str == null || str.length() == 0)) {
            1KZ.A00();
        }
        return invoke;
    }

    public final Object APh(2Sg r2, Object obj) {
        0qQ.A0B(obj, 1);
        return this.A01.invoke(obj);
    }

    public final boolean A01(2Sg r3) {
        if (this == r3) {
            return true;
        }
        if (r3 == null || !0qQ.A0K(getClass(), r3.getClass())) {
            return false;
        }
        return 0qQ.A0K(this.A01, ((C244173al) r3).A01);
    }

    public final C251223ml B2H() {
        return this;
    }
}
