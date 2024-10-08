package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.LinkedHashMap;

public final class H0B extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "EmpathyNudgeFragment";
    public C55816Hnw A00;
    public final C304836Fk A01 = new C304826Fj(32.0f, 0.0f, 32.0f, 16.0f);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "media_owner_empathy_nudge_v1";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C55816Hnw hnw = this.A00;
        if (hnw != null) {
            1Xj r4 = hnw.A01;
            boolean z = hnw.A03;
            0wc r2 = hnw.A00;
            LinkedHashMap A07 = 0Yt.A07(DbW.A1b("is_launched_from_bottomsheet", String.valueOf(z)));
            0Aj A0e = AnonymousClass7TE.A0e(r2, "instagram_wellbeing_nudging");
            C51969G9p.A1F(A0e, "source_of_action", "heated_thread_empathy", A07);
            C51965G9l.A1J(A0e, r4.getId());
            DbS.A1H(A0e, "impression");
            A0e.Cgf();
        }
    }

    public static final void A00(H0B h0b) {
        AnonymousClass37D A0g = DbV.A0g(h0b, AnonymousClass37D.A00);
        C55816Hnw hnw = h0b.A00;
        if (hnw != null && hnw.A03) {
            C331157Pu A002 = C48943Emh.A00(A0g);
            if (A002 != null) {
                A002.A0T();
            }
        } else if (A0g != null) {
            A0g.A0B();
        }
        C55816Hnw hnw2 = h0b.A00;
        if (hnw2 != null) {
            hnw2.A02.CyZ();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1032262258);
        ComposeView A0H = DbV.A0H(this, C59346JFy.A00(this, 14), 1734306101);
        AnonymousClass0fD.A09(-1575260093, A022);
        return A0H;
    }
}
