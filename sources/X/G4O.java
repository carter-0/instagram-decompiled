package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

public final class G4O extends 0Yg implements 0sP {
    public static final G4O A00 = new G4O();

    public G4O() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        0qQ.A0B(directShareTarget, 0);
        String str = directShareTarget.A0I;
        String str2 = str;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            List A0m = DbW.A0m(directShareTarget);
            String username = ((AnonymousClass17C) A0m.get(0)).getUsername();
            int size = A0m.size();
            if (size != 1) {
                return 002.A0b(username, " +", size - 1);
            }
            return username;
        } else if (str2 == null) {
            return "";
        } else {
            return str2;
        }
    }
}
