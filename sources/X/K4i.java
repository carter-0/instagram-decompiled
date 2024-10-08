package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;

public final class K4i extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MarketingActivationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.setTitle("Marketing Activation");
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_chevron_left_pano_outline_24;
        r3.ErG(new AnonymousClass3Jb(A0K));
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_direct_pano_outline_24;
        A0K2.A0K = "";
        A0K2.A0M = "";
        r3.AA3(new AnonymousClass3Jb(A0K2));
    }

    public final String getModuleName() {
        return "marketing_activation_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public K4i() {
        C13346TVt tVt = new C13346TVt(this, 29);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13346TVt(new C13346TVt(this, 26), 27));
        this.A01 = DbS.A0I(new C13346TVt(A002, 28), tVt, new C13349TVw(49, (Object) null, A002), DbS.A0z(C60146JgR.class));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1328343972);
        K4i.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A01);
        MGE.A01(A0H, "test", C318116oQ.A00(A0H), 0);
        AnonymousClass0fD.A09(1697570558, A02);
    }
}
