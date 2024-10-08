package X;

import android.os.Bundle;
import java.util.ArrayList;

public final class NgM extends C47518E6c {
    public static final String __redex_internal_original_name = "DirectSuggestedReplyControlBottomSheetFragment";
    public C70965OTm A00;
    public C255273tr A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "direct_suggested_reply_control_bottom_sheet_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1644114972);
        super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-205769004, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(662698641);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        C50989Fmc.A01(requireContext(), C71401Ok0.A00(this, 38), requireContext().getString(2131960234), A1C);
        C255273tr r1 = this.A01;
        if (r1 != null) {
            if (r1 == C255273tr.A08) {
                C50989Fmc.A01(requireContext(), C71401Ok0.A00(this, 39), requireContext().getString(2131960236), A1C);
            }
            C50989Fmc.A01(requireContext(), C71401Ok0.A00(this, 40), requireContext().getString(2131960235), A1C);
            setItems(A1C);
            AnonymousClass0fD.A09(1604289870, A022);
            return;
        }
        0qQ.A0F("responseSuggestionSource");
        throw AnonymousClass00P.createAndThrow();
    }
}
