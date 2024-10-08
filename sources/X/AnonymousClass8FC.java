package X;

/* renamed from: X.8FC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8FC implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8E7 A00;

    public /* synthetic */ AnonymousClass8FC(AnonymousClass8E7 r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        AnonymousClass8E8 A002 = this.A00.A00();
        boolean booleanValue = bool.booleanValue();
        AnonymousClass8EA r1 = A002.A00;
        if (r1 != null) {
            int i = 4;
            if (booleanValue) {
                i = 0;
            }
            r1.setVisibility(i);
        }
        for (C3495480u onChanged : A002.A09) {
            onChanged.onChanged(bool);
        }
    }
}
