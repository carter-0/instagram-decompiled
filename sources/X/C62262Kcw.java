package X;

import android.os.Bundle;
import android.widget.TextView;

/* renamed from: X.Kcw  reason: case insensitive filesystem */
public final class C62262Kcw extends K8J {
    public static final String __redex_internal_original_name = "IgLiveQuestionBroadcasterFragment";

    public final String getModuleName() {
        return "live_question_sheet";
    }

    public final void A0D() {
        String str;
        super.A0D();
        TextView textView = this.A02;
        if (textView != null) {
            DbT.A18(requireContext(), textView, 2131965310);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                DbT.A18(requireContext(), textView2, 2131965308);
                return;
            }
            str = "emptyDescription";
        } else {
            str = "emptyTitle";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1227026468);
        super.onCreate(bundle);
        setModuleNameV2("live_question_sheet");
        AnonymousClass0fD.A09(-1430031479, A02);
    }
}
