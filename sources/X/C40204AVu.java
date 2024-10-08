package X;

/* renamed from: X.AVu  reason: case insensitive filesystem */
public final class C40204AVu implements B1A {
    public final /* synthetic */ 1UP A00;

    public C40204AVu(1UP r1) {
        this.A00 = r1;
    }

    public final void D5F(PyF pyF) {
        String str;
        if (!pyF.A07() || pyF.A04() == null || ((AnonymousClass94A) pyF.A04()).A00 != 1) {
            str = "voltron sideload failed";
        } else {
            str = "voltron sideload success";
        }
        0KC.A0C("i18n_VoltronFbtLanguagePackSideLoader", str);
    }
}
