package X;

/* renamed from: X.6fB  reason: invalid class name and case insensitive filesystem */
public final class C312796fB implements AnonymousClass2Kv {
    public final /* synthetic */ C312756f7 A00;

    public C312796fB(C312756f7 r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r6) {
        C250663lr r4;
        C250663lr optionalTreeField;
        C312746f6 r1;
        if (r6 == null || (r4 = (C250663lr) r6.Bny()) == null || (optionalTreeField = r4.getOptionalTreeField(0, "viewer", C306256Ll.class, 1410799676)) == null || (r1 = (C312746f6) optionalTreeField.getOptionalEnumField(0, "flm_ar_effect_consent_state", C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            C312756f7 r3 = this.A00;
            IllegalStateException illegalStateException = new IllegalStateException("Failed to receive user consent state from graphql");
            C312716f1 r0 = r3.A00;
            illegalStateException.getMessage();
            r0.A05 = false;
            return;
        }
        C312716f1 r02 = this.A00.A00;
        r02.A01(r1);
        r02.A05 = false;
    }
}
