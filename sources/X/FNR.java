package X;

import android.view.View;
import java.util.Map;

public final class FNR implements View.OnClickListener {
    public final /* synthetic */ 2bv A00;
    public final /* synthetic */ AnonymousClass4UC A01;
    public final /* synthetic */ C231942sf A02;

    public FNR(2bv r1, AnonymousClass4UC r2, C231942sf r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(240945314);
        AnonymousClass4UC r3 = this.A01;
        AnonymousClass4VG r1 = r3.A08.A02;
        if (!this.A02.A00 || r1 == null || !r1.A04) {
            this.A00.DbI(r3, AnonymousClass05K.A0C, (Map) null);
        } else {
            this.A00.DbJ(r3);
        }
        AnonymousClass0fD.A0C(-414741364, A05);
    }
}
