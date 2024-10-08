package X;

import com.instagram.common.session.UserSession;
import java.net.URI;
import org.json.JSONObject;

public final class QNB extends C9141RQs {
    public final int A00;
    public final C13794ThC A01;
    public final URI A02;
    public final JSONObject A03;
    public final UserSession A04;

    public QNB(C13794ThC thC, UserSession userSession, URI uri, JSONObject jSONObject, int i) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = thC;
        this.A02 = uri;
        this.A03 = jSONObject;
        this.A00 = i;
    }
}
