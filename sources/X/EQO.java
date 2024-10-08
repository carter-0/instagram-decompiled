package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

public final class EQO extends H4J {
    public AnonymousClass4DH A00;
    public 0lg A01;

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 884526452);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C49952FGh.A02(activity, r3);
        }
        AnonymousClass0fD.A0A(-1117349838, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1404332675);
        DwD dwD = (DwD) obj;
        int A0D = AnonymousClass7TG.A0D(dwD, 325514432);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("get_challenge", "true");
        A1E.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dwD.A04);
        A1E.put("nonce_code", dwD.A03);
        A1E.put("cni", dwD.A02);
        A1E.put("challenge_context", dwD.A01);
        AnonymousClass4DH r2 = this.A00;
        C360678ey A05 = C359988do.A05(this.A01, dwD.A00, A1E);
        E84.A00(A05, this, 29);
        r2.schedule(A05);
        AnonymousClass0fD.A0A(1338927497, A0D);
        AnonymousClass0fD.A0A(1454565288, A03);
    }
}
