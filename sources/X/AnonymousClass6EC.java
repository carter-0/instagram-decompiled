package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6EC  reason: invalid class name */
public final class AnonymousClass6EC {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.0Js] */
    public final void A00(0lg r6, String str, 0sL r8) {
        UserSession userSession;
        String str2;
        0qQ.A0B(r6, 0);
        if ((r6 instanceof UserSession) && (userSession = (UserSession) r6) != null) {
            List BO0 = AnonymousClass0BO.A00(userSession).BO0();
            if (!BO0.isEmpty()) {
                str2 = ((User) BO0.get(0)).getId();
            } else {
                str2 = userSession.A06;
            }
            if (!(str == null || str2 == null || str2.equals(str))) {
                if (!09i.A0A.A0A(new Object(), (0Jv) null, new C72926PPk(r8), str)) {
                    0KC.A0C("ArmadilloNotificationLogger", "Failed to insert operation for the background account");
                    return;
                }
                return;
            }
        }
        r8.invoke(r6, false);
    }

    public final void A01(String str, JSONObject jSONObject, boolean z) {
        String valueOf = String.valueOf(z);
        0qQ.A0B(valueOf, 2);
        try {
            jSONObject.put(str, valueOf);
        } catch (JSONException unused) {
            0KC.A0C("ArmadilloNotificationLogger", "Failed to insert field into JSONObject");
        }
    }
}
