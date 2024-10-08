package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

public final class FLQ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass35N A00;

    public FLQ(AnonymousClass35N r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-829140342);
        AnonymousClass35N r1 = this.A00;
        AnonymousClass9B2 r0 = r1.A09;
        if (r0 == null) {
            AnonymousClass9B2.A04.A00(r1.A0E, new EHN(r1, 6), (AnonymousClass4D6) null, 2);
        } else {
            DirectShareTarget A002 = r0.A00();
            if (A002 != null) {
                AnonymousClass35N.A05(r1, A002);
            }
        }
        AnonymousClass0fD.A0C(523209436, A05);
    }
}
