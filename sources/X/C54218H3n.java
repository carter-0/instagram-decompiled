package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H3n  reason: case insensitive filesystem */
public final class C54218H3n extends GT9 {
    public static final String __redex_internal_original_name = "CommentListBottomsheetComposeFragment";
    public int A00;
    public final AnonymousClass0eM A01 = GT9.A00(this, 47);
    public final AnonymousClass0eM A02 = GT9.A00(this, 49);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58177Inh(this, 3));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C58177Inh(this, 4));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(C58299Ipg.A00);
    public final AnonymousClass0eM A06 = GT9.A00(this, 44);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass4DU A002 = I03.A00(this.A09);
        C334297b2 r3 = new C334297b2((C333777a7) A04().A0B.A03.getValue(), AnonymousClass7TE.A0l(this.A0A), A002);
        r3.A00(view, AnonymousClass3DZ.A00(this));
        ((C334657be) this.A05.getValue()).A03 = new C58177Inh(view, 1);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHG(r3, viewLifecycleOwner, this, r6, (AnonymousClass4D7) null, 37), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1072754486);
        super.onCreate(bundle);
        this.mLifecycleRegistry.A09((C334177an) this.A05.getValue());
        AnonymousClass0fD.A09(-1798951561, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(263828775);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new JG1(15, viewGroup, this), -419719480), false, 182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A0A), 36318771737336260L));
        AnonymousClass0fD.A09(1638370570, A022);
        return A012;
    }
}
