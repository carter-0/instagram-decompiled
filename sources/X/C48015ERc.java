package X;

import android.os.Bundle;
import android.widget.RadioGroup;
import java.util.ArrayList;

/* renamed from: X.ERc  reason: case insensitive filesystem */
public final class C48015ERc extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ColorFilterOptionsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131973374);
    }

    public final String getModuleName() {
        return "color_filter_options";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-47617979);
        super.onCreate(bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A1C2.add(new C70953OTa("on", requireContext().getString(2131956291), requireContext().getString(2131956286)));
        A1C2.add(new C70953OTa("off", requireContext().getString(2131956287), requireContext().getString(2131956283)));
        A1C2.add(new C70953OTa("off", requireContext().getString(2131956290), requireContext().getString(2131956285)));
        A1C2.add(new C70953OTa("off", requireContext().getString(2131956289), requireContext().getString(2131956284)));
        DbU.A1F((RadioGroup.OnCheckedChangeListener) null, "on", A1C, A1C2);
        FGF.A01(A1C, 2131956288);
        setItems(A1C);
        AnonymousClass0fD.A09(-1336838053, A02);
    }
}
