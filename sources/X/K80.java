package X;

import android.os.Bundle;
import android.view.View;

public abstract class K80 extends MYR {
    public static final String __redex_internal_original_name = "GreenscreenTabBaseFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getRecyclerView().setNestedScrollingEnabled(false);
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MP6(this, 31));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public K80() {
        0Yh A0z = DbS.A0z(C3507486a.class);
        this.A00 = DbS.A0I(new MMI(this, 34), new MMI(this, 35), new MMZ(35, (Object) null, (Object) this), A0z);
        this.A02 = MMI.A00(this, 33);
        this.A01 = MMI.A00(this, 32);
    }
}
