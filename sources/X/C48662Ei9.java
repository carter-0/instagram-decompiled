package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ei9  reason: case insensitive filesystem */
public abstract class C48662Ei9 {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.DeX] */
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        try {
            String string = new JSONObject(DbY.A0g(r8)).getString("pk");
            UserSession A0Z = DbT.A0Z(r7);
            FragmentActivity A04 = C308206Td.A04(r7);
            AnonymousClass0iw A08 = C308206Td.A08(r7);
            ? obj = new Object();
            obj.A02 = new C46465DfT(A08, A0Z);
            obj.A00 = A0Z;
            AnonymousClass441.A02.A02(A0Z, new C51022FnE(0, A04, obj), string);
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
