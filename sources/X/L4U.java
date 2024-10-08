package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.List;

public final class L4U {
    public String A00;
    public final UserSession A01;

    public L4U(UserSession userSession, IngestSessionShim ingestSessionShim) {
        AnonymousClass3Q2 A03;
        AnonymousClass7TG.A1O(userSession, ingestSessionShim);
        this.A01 = userSession;
        List list = ingestSessionShim.A00;
        if (list.size() > 0 && (A03 = 28K.A00(userSession).A03((String) AnonymousClass7TE.A13(list))) != null) {
            A03.A0I();
        }
    }
}
