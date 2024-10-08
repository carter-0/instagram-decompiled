package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class K5O extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "IgLiveSchedulingShareFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C66298MMh.A01(this, 14));
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "ig_live_scheduling_share";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2dY.A01(LY5.A00(this, 67), DbX.A0I(requireView(), R.id.action_bar_container)).A0X(C64469LcW.A00);
        IgdsButton A0b = DbU.A0b(requireView(), R.id.primary_cta_button);
        A0b.setText(2131965342);
        LY5.A01(A0b, 68, this);
        IgdsButton A0b2 = DbU.A0b(requireView(), R.id.secondary_cta_button);
        A0b2.setText(2131968513);
        LY5.A01(A0b2, 69, this);
        A0b2.setVisibility(0);
        ((IgdsHeadline) requireView().requireViewById(R.id.live_scheduling_share_headline)).setBody(2131965351);
        DbZ.A1C(this, MHB.A01(this, (AnonymousClass4D7) null, 12), ((C60184Jh3) this.A02.getValue()).A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final boolean onBackPressed() {
        2YL A0H = DbS.A0H(this.A02);
        MG2.A01(A0H, C318116oQ.A00(A0H), 3);
        return true;
    }

    public K5O() {
        C66298MMh A012 = C66298MMh.A01(this, 18);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(this, 15), 0eO.A02, 16);
        this.A02 = DbS.A0I(C66298MMh.A01(A002, 17), A012, new MJ6(1, (Object) null, A002), DbS.A0z(C60184Jh3.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            2YL A0H = DbS.A0H(((LDK) this.A01.getValue()).A02);
            C318136oS A002 = C318116oQ.A00(A0H);
            MG2 mg2 = new MG2(A0H, (AnonymousClass4D7) null, 1);
            19B r3 = 19B.A00;
            1Eo.A05(r3, new MG2(A0H, (AnonymousClass4D7) null, 2), C51967G9n.A0M(A0H, r3, mg2, A002));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1185025267);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.live_scheduling_share_fragment, false);
        AnonymousClass0fD.A09(1441860216, A022);
        return A0D;
    }
}
