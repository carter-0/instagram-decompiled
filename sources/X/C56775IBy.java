package X;

import android.view.View;

/* renamed from: X.IBy  reason: case insensitive filesystem */
public final class C56775IBy implements View.OnClickListener {
    public final /* synthetic */ C317646nb A00;
    public final /* synthetic */ C317546nR A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C249693kD A03;

    public C56775IBy(C317646nb r1, C317546nR r2, C255783ui r3, C249693kD r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(279839946);
        C317646nb r3 = this.A00;
        1Xj BPf = this.A03.BPf();
        if (BPf != null) {
            C317546nR r1 = this.A01;
            r3.D1U(BPf, r1, r1, this.A02);
            View view2 = r1.A00;
            if (view2 != null) {
                if (view2.isHapticFeedbackEnabled()) {
                    View view3 = r1.A00;
                    if (view3 != null) {
                        view3.performHapticFeedback(1);
                    }
                }
                AnonymousClass0fD.A0C(-1168124184, A05);
                return;
            }
            0qQ.A0F("buttonView");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-975129858, A05);
        throw A0y;
    }
}
