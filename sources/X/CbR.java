package X;

import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CbR {
    public static C42058BFl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            User user = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                user = C41846B3n.A0a(r3, user, AnonymousClass7TE.A17(r3), "producer");
                r3.A0z();
            }
            return new C42058BFl(user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
