package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

public final class EQP extends H4J {
    public 0hq A00;
    public IgFragmentActivity A01;
    public 0lg A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -1523307642);
        C49952FGh.A02(this.A01, r3);
        AnonymousClass0fD.A0A(-33805730, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(364843757);
        DwC dwC = (DwC) obj;
        int A0D = AnonymousClass7TG.A0D(dwC, -1923531883);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("get_challenge", "true");
        A1E.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dwC.A04);
        A1E.put("nonce_code", dwC.A03);
        A1E.put("cni", dwC.A02);
        A1E.put("challenge_context", dwC.A01);
        IgFragmentActivity igFragmentActivity = this.A01;
        C360678ey A05 = C359988do.A05(this.A02, dwC.A00, A1E);
        E84.A00(A05, this, 27);
        igFragmentActivity.schedule(A05);
        AnonymousClass0fD.A0A(-1927168070, A0D);
        AnonymousClass0fD.A0A(1032321216, A03);
    }
}
