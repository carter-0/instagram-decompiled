package X;

import android.os.Bundle;
import android.view.View;

public final class KUY extends C47480E4f {
    public static final String __redex_internal_original_name = "UserPaySettingsFragment";
    public final AnonymousClass0eM A00 = DbS.A0I(new C73654PhT(this, 7), new C73654PhT(this, 8), new C20614Wvv(31, (Object) null, this), DbS.A0z(C46771Dky.class));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131976252);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object value = this.A00.getValue();
        AnonymousClass7TE.A1Z(new MGD(value, this, (AnonymousClass4D7) null, 17), DbV.A0J(this));
    }
}
