package X;

/* renamed from: X.8Aa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C351718Aa implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8AL A00;

    public /* synthetic */ C351718Aa(AnonymousClass8AL r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8AL r2 = this.A00;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        r2.A09 = booleanValue;
        if (booleanValue) {
            r2.A0B(false);
        } else {
            r2.A0C(false);
        }
    }
}
