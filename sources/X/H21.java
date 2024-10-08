package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H21 extends C273374mT {
    public static final String __redex_internal_original_name = "ReachabilityFragment";
    public final AnonymousClass0eM A00 = C58702IwB.A00(this, 21);
    public final AnonymousClass0eM A01 = C51975G9x.A0r(this, "creator_ai_audience_extra", 0eO.A02, 36);
    public final AnonymousClass0eM A02 = DbS.A0I(C58702IwB.A01(this, 23), C58702IwB.A01(this, 24), new C58689Ivy(23, this, (Object) null), DbS.A0z(C54182H2c.class));
    public final String A03 = "creators_genai_reachability";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object value = this.A01.getValue();
        0qQ.A0B(value, 0);
        H2N h2n = ((C54182H2c) this.A02.getValue()).A01;
        int i = 2131966201;
        int i2 = 2131966199;
        if (value == HNK.ANYBODY_CREATOR_DOES_NOT_FOLLOW) {
            i = 2131966200;
            i2 = 2131966198;
        }
        h2n.A02.Epw(new JV5((C266444Yx) DbS.A0Q(new Object[0], i2), (C266444Yx) DbS.A0Q(new Object[0], i), 1));
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 18), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(38477790);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 36), 717076799);
        AnonymousClass0fD.A09(-1824681295, A022);
        return A0H;
    }
}
