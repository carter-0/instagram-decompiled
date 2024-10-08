package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public final class NgN extends C47518E6c {
    public static final String __redex_internal_original_name = "DirectPendingFilterCustomizationFragment";
    public OTF A00;
    public C70499O8y A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "pending_filter_customization";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new FGF((CharSequence) getString(2131959916)));
        if (this.A00 != null) {
            for (C69415Nkv nkv : OTF.A02) {
                Integer num = nkv.A01;
                if (num != null) {
                    String string = getString(num.intValue());
                    OTF otf = this.A00;
                    if (otf != null) {
                        A1C.add(new PR8(new C71459Ol0(6, this, nkv), string, otf.A01.contains(nkv)));
                    }
                }
            }
            setItems(A1C);
            return;
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-911669715);
        super.onCreate(bundle);
        0lg A0R = DbY.A0R(this.A02);
        this.A00 = (OTF) A0R.A01(OTF.class, new C73914Plp(A0R, 28));
        AnonymousClass0fD.A09(1293575009, A022);
    }
}
