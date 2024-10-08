package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FmV  reason: case insensitive filesystem */
public final class C50982FmV implements C332277Ui {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C3263576k A01;
    public final /* synthetic */ C69445Nlp A02;
    public final /* synthetic */ 0wc A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ G87 A06;
    public final /* synthetic */ C48088EVg A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ JSONObject A0A;

    public final void D9a() {
    }

    public C50982FmV(Context context, C3263576k r2, C69445Nlp nlp, 0wc r4, UserSession userSession, User user, G87 g87, C48088EVg eVg, String str, String str2, JSONObject jSONObject) {
        this.A04 = userSession;
        this.A00 = context;
        this.A03 = r4;
        this.A08 = str;
        this.A0A = jSONObject;
        this.A07 = eVg;
        this.A05 = user;
        this.A01 = r2;
        this.A02 = nlp;
        this.A09 = str2;
        this.A06 = g87;
    }

    public final void D9V() {
        UserSession userSession = this.A04;
        Context context = this.A00;
        0wc r3 = this.A03;
        String str = this.A08;
        JSONObject jSONObject = this.A0A;
        C48088EVg eVg = this.A07;
        User user = this.A05;
        C49925FFb.A02(context, this.A01, this.A02, r3, userSession, (C331157Pu) null, (C331127Pr) null, user, this.A06, eVg, str, this.A09, jSONObject);
    }
}
