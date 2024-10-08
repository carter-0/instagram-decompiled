package X;

import android.content.Context;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.json.JSONObject;

public final class A9C {
    public C312426eP A00;
    public CameraAREffect A01;
    public AH3 A02;
    public final Context A03;
    public final C312156dv A04;
    public final C63797L7d A05;
    public final UserSession A06;
    public final String A07;
    public final List A08;

    public A9C(Context context, C312156dv r3, C63797L7d l7d, UserSession userSession, String str, List list) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A06 = userSession;
        this.A04 = r3;
        this.A05 = l7d;
        this.A07 = str;
        this.A08 = list;
        C312426eP A002 = C312406eN.A00(context, r3, userSession);
        0qQ.A07(A002);
        this.A00 = A002;
    }

    public final void A00(JSONObject jSONObject) {
        AH3 ah3 = this.A02;
        if (ah3 == null) {
            0qQ.A0F("renderProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass82S r0 = ah3.A06;
        0qQ.A07(r0);
        r0.A00(jSONObject);
    }
}
