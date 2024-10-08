package X;

import java.util.Iterator;

/* renamed from: X.9NY  reason: invalid class name */
public final class AnonymousClass9NY implements B1A {
    public final /* synthetic */ AnonymousClass9NU A00;
    public final /* synthetic */ AnonymousClass9NS A01;
    public final /* synthetic */ PyE A02;
    public final /* synthetic */ Iterator A03;

    public AnonymousClass9NY(AnonymousClass9NU r1, AnonymousClass9NS r2, PyE pyE, Iterator it) {
        this.A01 = r2;
        this.A02 = pyE;
        this.A03 = it;
        this.A00 = r1;
    }

    public final void D5F(PyF pyF) {
        C293175kI r5 = (C293175kI) pyF.A04();
        if (r5 == null) {
            0KC.A0E("AppModuleActionQueryV2", "No action result provided - use ActionResult to pass exceptions.");
            PyE pyE = this.A02;
            if (pyE != null) {
                pyE.A00(AnonymousClass7TE.A0z("No action result provided - use ActionResult to pass exceptions."));
                return;
            }
            return;
        }
        C294495mY r0 = r5.A00;
        PyE pyE2 = this.A02;
        if (!(pyE2 == null || r0 == null)) {
            pyE2.A01(r0);
            this.A01.A00 = r5.A01;
        }
        Iterator it = this.A03;
        if (!it.hasNext() && pyE2 != null && !pyE2.A00.A06()) {
            0KC.A0Q("AppModuleActionQueryV2", "All actions executed, but task is incomplete %s", new Object[]{this.A00.A03.toString()});
            pyE2.A00(AnonymousClass7TE.A0z("All actions executed, but task is incomplete"));
        } else if (r5.A02 && it.hasNext()) {
            AnonymousClass9NS r1 = this.A01;
            if (pyE2 == null || pyE2.A00.A06()) {
                pyE2 = null;
            }
            AnonymousClass9NS.A00(this.A00, r1, pyE2, it);
        }
    }
}
