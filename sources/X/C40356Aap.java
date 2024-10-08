package X;

import android.app.Dialog;

/* renamed from: X.Aap  reason: case insensitive filesystem */
public final class C40356Aap implements MV5 {
    public final /* synthetic */ AnonymousClass8LU A00;

    public C40356Aap(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void DEG(Exception exc) {
        AnonymousClass8LU r3 = this.A00;
        02m.A0p.markerEnd(18948745, 3);
        AnonymousClass8LU.A0B(r3, 2131961740);
    }

    public final void Doe(String str) {
        AnonymousClass8LU r3 = this.A00;
        02m.A0p.markerEnd(18948745, 2);
        AnonymousClass8LU.A0B(r3, 2131976517);
    }

    public final void onFinish() {
        AnonymousClass8LU r1 = this.A00;
        if (C305756Jk.A01(r1.A0c)) {
            r1.onResume();
        }
        AnonymousClass7TF.A1N(r1.A15);
    }

    public final void onStart() {
        AnonymousClass8LU r0 = this.A00;
        AnonymousClass0eM r3 = r0.A15;
        ((AnonymousClass6ST) r3.getValue()).A00(r0.A0W.getString(2131969783));
        AnonymousClass0fN.A00((Dialog) r3.getValue());
    }
}
