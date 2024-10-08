package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H22 extends C273374mT {
    public static final String __redex_internal_original_name = "AudienceFragment";
    public final AnonymousClass0eM A00 = C58702IwB.A00(this, 13);
    public final AnonymousClass0eM A01 = C58702IwB.A00(this, 14);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C58719IwS(HNK.NOBODY, this, "creator_ai_audience_extra", 41));
    public final AnonymousClass0eM A03 = DbS.A0I(C58702IwB.A01(this, 16), C58702IwB.A01(this, 17), new C58689Ivy(21, this, (Object) null), DbS.A0z(C54182H2c.class));
    public final String A04 = C66579MXk.A00(744);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 17), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A04;
    }

    public static final void A00(H22 h22) {
        C331127Pr A0W = DbS.A0W(h22.getSession());
        A0W.A0d = h22.getString(2131973041);
        A0W.A0C = 1;
        A0W.A03 = 0.7f;
        A0W.A1G = true;
        C331157Pu r1 = (C331157Pu) h22.A00.getValue();
        if (r1 != null) {
            r1.A0F(new H23(), A0W);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-438121803);
        H22.super.onCreate(bundle);
        ((C54182H2c) this.A03.getValue()).A00((HNK) this.A02.getValue());
        AnonymousClass0fD.A09(670490608, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1045642626);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 34), -583327835);
        AnonymousClass0fD.A09(-1224083785, A022);
        return A0H;
    }
}
