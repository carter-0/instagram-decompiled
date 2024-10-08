package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.List;

public final class PHK implements G76 {
    public final /* synthetic */ C370818x7 A00;
    public final /* synthetic */ C67962Mxm A01;
    public final /* synthetic */ NP6 A02;
    public final /* synthetic */ String A03;

    public PHK(C370818x7 r1, C67962Mxm mxm, NP6 np6, String str) {
        this.A01 = mxm;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = np6;
    }

    public final void onActionClicked() {
        User A022;
        C67962Mxm mxm = this.A01;
        C370818x7 r3 = this.A00;
        String str = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        mxm.A02.setVisibility(8);
        r3.A03(str);
        C70554OBc oBc = this.A02.A00;
        C66633Ma2 ma2 = oBc.A00;
        AnonymousClass4DH r4 = ma2.A1J;
        FragmentActivity activity = r4.getActivity();
        if (activity != null && (A022 = 17h.A00(ma2.A0p()).A02(oBc.A01)) != null) {
            List A0n = DbW.A0n(A022);
            0qQ.A07(A0n);
            C291175gg r2 = new C291175gg(A0n);
            1pE A012 = 1pE.A01(activity, r4, ma2.A0p(), "inbox_ads_event_sharing_notice_banner");
            C69635NpI.A00 = true;
            A012.A0B = r2;
            A012.A0v = true;
            A012.A06();
        }
    }

    public final void onBannerDismissed() {
        C67962Mxm mxm = this.A01;
        C370818x7 r3 = this.A00;
        String str = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        mxm.A02.setVisibility(8);
        r3.A03(str);
    }
}
