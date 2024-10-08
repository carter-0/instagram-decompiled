package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

public final class FJ0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C3263576k A01;
    public final /* synthetic */ C69445Nlp A02;
    public final /* synthetic */ 0wc A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C331157Pu A05;
    public final /* synthetic */ C331127Pr A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ G87 A08;
    public final /* synthetic */ C48088EVg A09;
    public final /* synthetic */ JSONObject A0A;

    public FJ0(Context context, C3263576k r2, C69445Nlp nlp, 0wc r4, UserSession userSession, C331157Pu r6, C331127Pr r7, User user, G87 g87, C48088EVg eVg, JSONObject jSONObject) {
        this.A03 = r4;
        this.A09 = eVg;
        this.A07 = user;
        this.A01 = r2;
        this.A02 = nlp;
        this.A04 = userSession;
        this.A0A = jSONObject;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = context;
        this.A08 = g87;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C331127Pr r0;
        0qQ.A0B(dialogInterface, 0);
        0wc r4 = this.A03;
        C48088EVg eVg = this.A09;
        User user = this.A07;
        AnonymousClass73V.A02(r4, this.A01, this.A02, eVg, "click", "optimistic_restrict_learn_more_button", user.getId());
        dialogInterface.dismiss();
        1YZ r02 = 1YZ.A02;
        if (r02 != null) {
            UserSession userSession = this.A04;
            E66 A012 = ((F30) r02.A00.getValue()).A01(userSession, user.Bh3(), eVg, user.getId(), user.getUsername(), this.A0A, true, false);
            C331157Pu r1 = this.A05;
            if (r1 == null || (r0 = this.A06) == null) {
                Context context = this.A00;
                FmG fmG = new FmG(this.A08, 14);
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A0U = fmG;
                A0W.A00().A03(context, A012);
                return;
            }
            r0.A0T = A012;
            r1.A0F(A012, r0);
        }
    }
}
