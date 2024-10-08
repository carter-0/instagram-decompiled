package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class VS0 {
    public final UserSession A00;
    public final List A01;

    public VS0(UserSession userSession) {
        this.A00 = userSession;
        String A04 = 182.A04(0Tu.A05, userSession, 36891621588992918L);
        List A18 = DbV.A18(A04.length() == 0 ? "48x64x80x100x120x140x160x200x240x280x332x403x480x540x640x720x810x960x1080x1286x1500x1800" : A04, "x");
        ArrayList A0r = AnonymousClass7TG.A0r(A18);
        Iterator it = A18.iterator();
        while (it.hasNext()) {
            AnonymousClass7TF.A1M(A0r, Integer.parseInt(AnonymousClass7TE.A18(it)));
        }
        this.A01 = A0r;
    }
}
