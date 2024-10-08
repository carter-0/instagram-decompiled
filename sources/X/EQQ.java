package X;

import android.content.Context;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

public final class EQQ extends H4J {
    public Context A00;
    public 0hq A01;
    public IgFragmentActivity A02;
    public AnonymousClass0aP A03;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.KHG, X.11X] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(1049485818);
        DwG dwG = (DwG) obj;
        int A033 = AnonymousClass0fD.A03(2020923037);
        0qQ.A0B(dwG, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("get_challenge", "true");
        A1E.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dwG.A06);
        A1E.put("nonce_code", dwG.A04);
        A1E.put("cni", dwG.A02);
        A1E.put("challenge_context", dwG.A01);
        if (dwG.A07) {
            LA9 la9 = new LA9(this.A00);
            IgFragmentActivity igFragmentActivity = this.A02;
            AnonymousClass0aP r9 = this.A03;
            AnonymousClass7TF.A1B(igFragmentActivity, 0, r9);
            C49944FFx.A01(r9, "auto_conf_consent", AnonymousClass000.A00(1173), "registration_flow", AnonymousClass000.A00(1095));
            1ES.A03(new KHG(1, igFragmentActivity, dwG, r9, A1E, la9));
            i = 169687755;
        } else {
            IgFragmentActivity igFragmentActivity2 = this.A02;
            C360678ey A05 = C359988do.A05(this.A03, dwG.A00, A1E);
            E84.A00(A05, this, 26);
            igFragmentActivity2.schedule(A05);
            i = 405518077;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-1976328683, A032);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 695821162);
        C49952FGh.A02(this.A02, r3);
        AnonymousClass0fD.A0A(-1726134518, A0D);
    }
}
