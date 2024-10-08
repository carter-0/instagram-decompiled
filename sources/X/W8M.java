package X;

import android.view.View;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import java.util.List;

public final class W8M implements View.OnClickListener {
    public final /* synthetic */ C306146Ky A00;

    public W8M(C306146Ky r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Object value;
        int A05 = AnonymousClass0fD.A05(-320279092);
        C306146Ky r4 = this.A00;
        C306146Ky.A00(r4).A0N(C306146Ky.A01(r4).A08(), !C306146Ky.A01(r4).A09().A09);
        05G r2 = C306146Ky.A01(r4).A02.A01;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C15053ULv.A00((AdvantageAudienceData) null, (TargetingRelaxationConstants) null, (C15053ULv) value, (String) null, (List) null, (List) null, (List) null, 0, 0, 511, !((C15053ULv) r2.getValue()).A09)));
        AnonymousClass0fD.A0C(830037346, A05);
    }
}
