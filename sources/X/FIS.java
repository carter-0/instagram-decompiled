package X;

import android.content.DialogInterface;

public final class FIS implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public FIS(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                Dd4 dd4 = (Dd4) this.A02;
                Dd0 A012 = C46354Dcy.A01(dd4.A0A);
                C283155Gi r3 = (C283155Gi) this.A03;
                int i2 = this.A01;
                AnonymousClass0iw r1 = dd4.A08;
                0qQ.A0B(r1, 2);
                Dd0.A0E(r1, A012, r3, "activity_log_dialog_go_click_event", i2);
                Dd4.A0D(dd4, r3);
                return;
            case 1:
                Dd4 dd42 = (Dd4) this.A02;
                int i3 = this.A01;
                AnonymousClass0iw r12 = dd42.A08;
                0qQ.A0B(r12, 2);
                Dd0.A0E(r12, C46354Dcy.A01(dd42.A0A), (C283155Gi) this.A03, "activity_log_dialog_cancel_click_event", i3);
                dialogInterface.dismiss();
                return;
            default:
                ((F2T) C47444E2q.A00((C47444E2q) this.A03).A04.A04.getValue()).A00((AnonymousClass3UM) this.A02, this.A01);
                return;
        }
    }
}
