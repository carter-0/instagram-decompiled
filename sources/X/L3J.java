package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

public final class L3J {
    public final int A00 = UUID.randomUUID().hashCode();
    public final UserSession A01;

    public L3J(UserSession userSession) {
        this.A01 = userSession;
    }
}
