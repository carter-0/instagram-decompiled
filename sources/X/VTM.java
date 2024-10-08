package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class VTM {
    public final 1Av A00;
    public final Set A01;

    public VTM(UserSession userSession) {
        HashSet hashSet = new HashSet();
        this.A01 = hashSet;
        1Av A002 = 1Au.A00(userSession);
        this.A00 = A002;
        try {
            String str = (String) Pxe.A0s(A002, A002.A0K, 1Av.A8a, 3);
            if (str != null && str.length() > 0) {
                String[] A1b = DbU.A1b(DbW.A0o(str, ","), 0);
                hashSet.addAll(0sr.A1P(Arrays.copyOf(A1b, A1b.length)));
            }
        } catch (Exception e) {
            0KC.A0F("SearchBlacklistStore", "Error reading to hidden entries.  Clearing results.", e);
            0xY A0p = AnonymousClass7TE.A0p(this.A00);
            A0p.ED3("blacklist_search_ids");
            A0p.apply();
        }
    }
}
