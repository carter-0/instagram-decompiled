package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NVX extends NKF {
    public static final String __redex_internal_original_name = "DirectDailyPromptsCreationFragment";
    public AnonymousClass2t9 A00;
    public C252063oV A01;
    public C66930MfP A02;
    public C67739Mts A03;
    public final Runnable A04 = new PVC(this);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-660934246);
        super.onCreate(bundle);
        C67739Mts mts = new C67739Mts(requireContext(), getSession(), C69365Nk5.DAILY_PROMPT, false);
        this.A03 = mts;
        UserSession A023 = getSession();
        0qQ.A0B(A023, 0);
        AnonymousClass7TE.A1Z(new C66171MGi(mts, A023, (AnonymousClass4D7) null, 47), C318116oQ.A00(mts));
        this.A02 = C69868NtW.A00(getSession());
        AnonymousClass0fD.A09(-1466822050, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-355403338);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_creation, viewGroup, false);
        AnonymousClass0fD.A09(-1330636787, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1858978625);
        super.onDestroyView();
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(0);
            AnonymousClass0fD.A09(-334604661, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1895046400, A022);
        throw A0y;
    }
}
