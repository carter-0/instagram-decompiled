package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.Ert  reason: case insensitive filesystem */
public abstract class C49250Ert {
    public static final void A00(FragmentActivity fragmentActivity, 0lg r6, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, r6, fragmentActivity);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("timestamp", str);
        C46649DiU A04 = C46649DiU.A04("com.instagram.equity.sev_transparency.landing_page.screen", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(r6);
        A0N.A0U = "";
        A0N.A0l = A1U;
        C309516Yo A0M = DbV.A0M(C49891FBs.A02(A0N, A04), fragmentActivity, r6);
        A0M.A0D = false;
        A0M.A04();
    }
}
