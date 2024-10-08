package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;

/* renamed from: X.Gzo  reason: case insensitive filesystem */
public final class C54119Gzo extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ShareToBroadcastChannelFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C58176Ing(this, 32));
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C58176Ing(this, 33));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58176Ing(this, 39));
    public final AnonymousClass0eM A04;
    public final String A05 = __redex_internal_original_name;

    public final void onViewCreated(View view, Bundle bundle) {
        C48147EZp eZp;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C50337FYu fYu = (C50337FYu) this.A00.getValue();
        String A0t = DbS.A0t(this.A01);
        0qQ.A0B(A0t, 0);
        C50337FYu.A02(fYu);
        if (A0t.equals(AnonymousClass000.A00(649))) {
            eZp = C48147EZp.FAN_CLUB_CREATOR_ONBOARDING;
        } else if (A0t.equals("prodash_next_step")) {
            eZp = C48147EZp.PRODASH_NEXT_STEPS;
        } else {
            eZp = C48147EZp.CONVERSATION_STARTER_PILL;
        }
        C50337FYu.A01(eZp, C48146EZo.THREAD_VIEW, fYu, "creator_share_ssc_to_bc_sheet_rendered", "view", (Map) null);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C54119Gzo() {
        C58176Ing ing = new C58176Ing(this, 40);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58176Ing(new C58176Ing(this, 36), 37));
        this.A04 = DbS.A0I(new C58176Ing(A002, 38), ing, new C58187Inr(22, A002, (Object) null), DbS.A0z(C60137JgI.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1703513547);
        ComposeView A0H = DbV.A0H(this, JGK.A01(this, 31), 112471782);
        AnonymousClass0fD.A09(1943352129, A022);
        return A0H;
    }
}
