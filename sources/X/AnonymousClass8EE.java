package X;

/* renamed from: X.8EE  reason: invalid class name */
public final class AnonymousClass8EE {
    public final /* synthetic */ AnonymousClass8EA A00;

    public AnonymousClass8EE(AnonymousClass8EA r1) {
        this.A00 = r1;
    }

    public final void A00(boolean z) {
        AnonymousClass8E8 r0 = this.A00.A04;
        if (r0 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        for (C3495480u onChanged : r0.A07) {
            onChanged.onChanged(Boolean.valueOf(z));
        }
    }
}
