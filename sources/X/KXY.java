package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;
import java.util.Set;

public final class KXY extends K6S {
    public static final String __redex_internal_original_name = "ShareToFriendsStoryAudiencePickerFragmentV2";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C20699WxV(this, 14));
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C20699WxV(this, 15));
    public final AnonymousClass0eM A02 = DbS.A0I(new C20699WxV(this, 16), C66278MLn.A00, new C20613Wvu(11, this, (Object) null), DbS.A0z(AnonymousClass85T.class));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        Boolean Ajy;
        0qQ.A0B(jva, 0);
        C60142JgN jgN = (C60142JgN) this.A04.getValue();
        boolean z = A0A().A01;
        User user = jva.A02;
        if (!user.A2R() && (Ajy = user.A03.Ajy()) != null && Ajy.booleanValue()) {
            LRl lRl = jgN.A00.A00;
            Set set = lRl.A03;
            lRl.A05(jva, JTP.A0j(z ? 1 : 0), !DbU.A0K(set).contains(jva), z);
            05G r4 = jgN.A02;
            do {
            } while (!r4.AIY(r4.getValue(), new C61247Jzf(DbU.A0K(set), DbU.A0K(lRl.A00))));
        }
    }

    public final void CtJ(C46448DfA dfA) {
    }

    public final void configureActionBar(2da r1) {
    }

    public final String getModuleName() {
        return "audience_selection";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        C59845JaL jaL = new C59845JaL(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 10);
        19B r4 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(this, r4, jaL, A002);
        1Eo.A05(r4, new C59845JaL(A0I, r5, this, (AnonymousClass4D7) null, 9), AnonymousClass07a.A00(A0I));
        2YL A0H = DbS.A0H(this.A04);
        1Eo.A05(r4, new MG4(A0H, (AnonymousClass4D7) null, 34), C318116oQ.A00(A0H));
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public KXY() {
        C20699WxV wxV = new C20699WxV(this, 21);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20699WxV(new C20699WxV(this, 18), 19));
        this.A04 = DbS.A0I(new C20699WxV(A002, 20), wxV, new C20613Wvu(12, A002, (Object) null), DbS.A0z(C60142JgN.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1069010999);
        LayoutInflater layoutInflater2 = layoutInflater;
        this.A00 = new K9H(DbT.A06(this, layoutInflater2, 0), this, this, this, this, this, A0B(), true, true);
        A09().A00 = new C63870L9z(requireContext(), (String) null, (String) null, 0, false);
        View inflate = layoutInflater2.inflate(R.layout.layout_audience_picker_v2, viewGroup, false);
        AnonymousClass0fD.A09(-962201778, A022);
        return inflate;
    }
}
