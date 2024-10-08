package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ViF  reason: case insensitive filesystem */
public final class C17924ViF {
    public final Context A00;
    public final C16678UzE A01;
    public final WGU A02;
    public final C15478UdT A03;
    public final PromoteData A04;
    public final C15320UaS A05;
    public final AnonymousClass0iw A06;
    public final FragmentActivity A07;
    public final UserSession A08;

    public final String A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            PromoteData promoteData = this.A04;
            JSONObject put = jSONObject2.put("currency", promoteData.A1j.getCurrencyCode());
            N4Q n4q = promoteData.A0N;
            if (n4q != null) {
                jSONObject.put("payment_amount", put.put("amount", n4q.A00));
                return jSONObject.toString();
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public C17924ViF(Context context, FragmentActivity fragmentActivity, C16678UzE uzE, C15478UdT udT, PromoteData promoteData, C15320UaS uaS, AnonymousClass0iw r8) {
        this.A00 = context;
        this.A03 = udT;
        this.A04 = promoteData;
        this.A07 = fragmentActivity;
        this.A05 = uaS;
        this.A06 = r8;
        this.A01 = uzE;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A08 = userSession;
        WGU A002 = WGU.A00(userSession);
        0qQ.A07(A002);
        this.A02 = A002;
    }
}
