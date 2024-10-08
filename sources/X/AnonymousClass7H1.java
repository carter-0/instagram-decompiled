package X;

import android.widget.Filterable;
import java.util.List;
import java.util.Map;

/* renamed from: X.7H1  reason: invalid class name */
public abstract class AnonymousClass7H1 extends C331047Ph implements Filterable {
    public final void A0C(List list, Map map) {
        String str;
        String fullName;
        List<AnonymousClass170> list2 = list;
        0qQ.A0B(list2, 0);
        List list3 = ((AnonymousClass7H0) this).A0F;
        list3.clear();
        for (AnonymousClass170 r2 : list2) {
            String str2 = null;
            Map map2 = map;
            if (map != null) {
                str = (String) map2.get(r2.getId());
            } else {
                str = null;
            }
            String fullName2 = r2.getFullName();
            String username = r2.getUsername();
            r2.CPm();
            if (str != null) {
                fullName2 = str;
            } else if (fullName2 == null || fullName2.isEmpty()) {
                fullName2 = username;
            }
            0qQ.A07(fullName2);
            if (str == null || str.length() == 0) {
                fullName = r2.getFullName();
                String username2 = r2.getUsername();
                int BIW = r2.BIW();
                boolean CPm = r2.CPm();
                boolean COa = r2.COa();
                if (BIW != 0) {
                    fullName = null;
                } else if (AnonymousClass50n.A09(fullName, CPm, COa) && !username2.equals(fullName)) {
                    fullName = username2;
                }
            } else {
                fullName = r2.getUsername();
            }
            Long BST = r2.BST();
            if (BST != null) {
                str2 = BST.toString();
            }
            list3.add(new AnonymousClass77I(r2.Bh3(), fullName2, fullName, str, str2, r2.getId(), r2.getUsername(), r2.BIW(), r2.isVerified()));
        }
    }
}
