package X;

/* renamed from: X.9Cv  reason: invalid class name and case insensitive filesystem */
public final class C375249Cv extends C375269Cx implements AnonymousClass974 {
    public C375249Cv() {
        super(C3738097a.DEFAULT_INSTANCE);
    }

    public final void A04(C3741398h r5) {
        A03();
        C3738097a r3 = (C3738097a) this.A00;
        int i = C3738097a.KEY_FIELD_NUMBER;
        r5.getClass();
        AnonymousClass978 r2 = r3.key_;
        if (!((AnonymousClass977) r2).A00) {
            int size = r2.size();
            int i2 = size * 2;
            if (size == 0) {
                i2 = 10;
            }
            r2 = r2.Coo(i2);
            r3.key_ = r2;
        }
        r2.add(r5);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return A00();
    }
}
