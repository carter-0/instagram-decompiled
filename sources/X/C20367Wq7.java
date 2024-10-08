package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wq7  reason: case insensitive filesystem */
public final class C20367Wq7 implements Runnable, AnonymousClass11X {
    public final C19196WPc A00;

    public final void onCancel() {
    }

    public final void onFinish() {
        C19196WPc wPc = this.A00;
        if (wPc.A08) {
            1ES.A04(this, 1635172738, 3, (int) TimeUnit.SECONDS.toMillis(182.A01(0Tu.A05, wPc.A03.A00, 36605684141462826L)), false, true);
        }
    }

    public final void onStart() {
    }

    public final String getName() {
        return "IgdsVariableSampling";
    }

    public final void run() {
        long j;
        Integer num;
        C19196WPc wPc = this.A00;
        if (wPc.A08) {
            Map map = wPc.A05;
            if (!(!map.isEmpty()) && !00l.A0W("") && ((num = wPc.A00) == null || 0 != num.intValue())) {
                try {
                    map.clear();
                    JSONObject jSONObject = new JSONObject("");
                    Iterator<String> keys = jSONObject.keys();
                    0qQ.A07(keys);
                    while (keys.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(keys);
                        C66580MXl.A1T(A18, map, jSONObject.getInt(A18));
                    }
                    wPc.A00 = 0;
                } catch (JSONException unused) {
                }
            }
            UserSession userSession = wPc.A03.A00;
            boolean A002 = 1CI.A00(userSession);
            0Tu r2 = 0Tu.A05;
            if (A002) {
                j = 36605684141659437L;
            } else {
                j = 36605684141266216L;
            }
            int A01 = (int) 182.A01(r2, userSession, j);
            if (wPc.A06.A05(A01) == 0) {
                1Ln r22 = new 1Ln(AnonymousClass7TE.A0e(wPc.A02, "mobile_uitracker_events"), 341);
                if (DbT.A1Y(r22)) {
                    wPc.A01.post(new C57905IiM(r22, this, A01));
                }
            }
        }
    }

    public C20367Wq7(C19196WPc wPc) {
        this.A00 = wPc;
    }

    public final int getRunnableId() {
        return 1635172738;
    }
}
