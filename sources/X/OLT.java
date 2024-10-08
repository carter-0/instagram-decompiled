package X;

import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

public final class OLT {
    public int A00;
    public int A01;
    public String A02;
    public HashMap A03;
    public List A04;

    public final void A00(User user) {
        if (this.A04.remove(user)) {
            this.A00--;
        }
    }
}
