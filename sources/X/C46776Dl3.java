package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dl3  reason: case insensitive filesystem */
public abstract class C46776Dl3 extends 2YL {
    public final 05G A00 = 106.A01(C47868EKo.A00);
    public final 05G A01 = 106.A01(0Yt.A0E());

    public final void A01() {
        Object value;
        LinkedHashMap A03;
        05G r2 = this.A01;
        do {
            value = r2.getValue();
            A03 = 0Yt.A03((Map) value);
            A03.clear();
        } while (!r2.AIY(value, A03));
    }

    public final void A02(User user) {
        Object value;
        LinkedHashMap A03;
        05G r4 = this.A01;
        do {
            value = r4.getValue();
            A03 = 0Yt.A03((Map) value);
            boolean containsKey = A03.containsKey(user.getUsername());
            String username = user.getUsername();
            if (containsKey) {
                A03.remove(username);
            } else {
                A03.put(username, user);
            }
        } while (!r4.AIY(value, A03));
    }
}
