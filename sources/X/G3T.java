package X;

import com.instagram.user.model.User;

public final class G3T extends 0Yg implements 0sP {
    public static final G3T A00 = new G3T();

    public G3T() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        User user = (User) obj;
        0qQ.A0B(user, 0);
        String pkId = user.A03.getPkId();
        if (pkId == null) {
            return "";
        }
        return pkId;
    }
}
