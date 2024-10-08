package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

public final class KAC extends 1P0 {
    public final /* synthetic */ KB0 A00;

    public KAC(KB0 kb0) {
        this.A00 = kb0;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-218306257);
        KB0 kb0 = this.A00;
        11Z.A03(new C65845M1l(kb0));
        FragmentActivity fragmentActivity = kb0.A07;
        C59689JTv.A03(fragmentActivity, fragmentActivity.getResources().getString(2131975944), "CreateHighlight_unknown_error_occured", 0);
        AnonymousClass0fD.A0A(1586107197, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int intValue;
        int A03 = AnonymousClass0fD.A03(1302550103);
        int A032 = AnonymousClass0fD.A03(586728231);
        KB0 kb0 = this.A00;
        11Z.A03(new C65845M1l(kb0));
        UserSession userSession = kb0.A0D;
        ReelStore A05 = 1OP.A05(userSession);
        AnonymousClass3HX r0 = ((K14) obj).A00;
        r0.getClass();
        Reel A0I = A05.A0I(r0, true);
        for (C255773uh r3 : A0I.A0O(userSession)) {
            if (r3.A0e == C250963mL.MEDIA) {
                1Xj r1 = r3.A0b;
                r1.getClass();
                r1.A4E(A0I.getId());
            }
        }
        AnonymousClass1Nd.A00(userSession).A05(new AnonymousClass376(A0I, true));
        Intent A09 = DbS.A09();
        if (A0I.getId() != null) {
            A09.putExtra("story_highlight_id", A0I.getId());
        }
        if (A0I.A07() != null) {
            A09.putExtra("story_highlight_cover_image_url", A0I.A07());
        }
        if (C278764xU.A01(userSession) && kb0.A03) {
            Integer num = A0I.A0d;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            AnonymousClass1Nd.A00(userSession).A05(new C321926uy(A0I, Integer.valueOf(intValue).intValue(), true));
        }
        Dba.A0k(kb0.A07, A09);
        AnonymousClass0fD.A0A(2134073265, A032);
        AnonymousClass0fD.A0A(-705032361, A03);
    }
}
