package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.api.IpcConstants$RequestAction;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ONU {
    public final Context A00;
    public final UserSession A01;
    public final ImmutableMap A02;

    public ImmutableMap A00() {
        return null;
    }

    public String A01() {
        IpcConstants$RequestAction ipcConstants$RequestAction;
        if (this instanceof C68977Nc8) {
            ipcConstants$RequestAction = IpcConstants$RequestAction.PENDING_IMPORTS;
        } else {
            ipcConstants$RequestAction = IpcConstants$RequestAction.FETCH_PENDING_MEDIA;
        }
        return ipcConstants$RequestAction.toString();
    }

    public ONU(Context context, ImmutableMap immutableMap, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = immutableMap;
    }

    public final String A02() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("action", A01());
            ImmutableMap immutableMap = this.A02;
            if (immutableMap != null) {
                JSONObject A112 = DbS.A11();
                Iterator it = immutableMap.entrySet().iterator();
                while (it.hasNext()) {
                    C66584MXp.A18(it, A112);
                }
                A11.put("header", A112);
            }
            ImmutableMap A002 = A00();
            if (A002 != null) {
                JSONObject A113 = DbS.A11();
                Iterator it2 = A002.entrySet().iterator();
                while (it2.hasNext()) {
                    C66584MXp.A18(it2, A113);
                }
                A11.put("payload", A113);
            }
        } catch (JSONException e) {
            C66583MXo.A1I(this.A01, AnonymousClass05K.A0u, e);
        }
        return DbT.A10(A11);
    }
}
