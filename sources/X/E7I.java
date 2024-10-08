package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

public final class E7I extends MYR {
    public static final String __redex_internal_original_name = "FanClubMemberListSortingOptionsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this, AnonymousClass05K.A00);
    }

    public static final void A00(E7I e7i, Integer num) {
        Integer num2 = AnonymousClass05K.A00;
        boolean z = true;
        FY9 fy9 = new FY9(num2, AnonymousClass7TF.A1W(num, num2));
        Integer num3 = AnonymousClass05K.A01;
        FY9 fy92 = new FY9(num3, AnonymousClass7TF.A1W(num, num3));
        Integer num4 = AnonymousClass05K.A0C;
        if (num != num4) {
            z = false;
        }
        e7i.A0B(0sr.A1P(new FY9[]{fy9, fy92, new FY9(num4, z)}));
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C47758EFs(this));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3R.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }
}
