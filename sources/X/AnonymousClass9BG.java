package X;

import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9BG  reason: invalid class name */
public final class AnonymousClass9BG {
    public final AnonymousClass3EO A00;
    public final 0BQ A01;
    public final Map A02 = new ConcurrentHashMap();
    public final 0lg A03;

    public static int A00(AnonymousClass9BG r4, String str) {
        Map map = r4.A02;
        int i = 0;
        if (map.get(str) != null && r4.A06(str)) {
            Set<Object> BNz = r4.A01.BNz();
            HashSet A022 = A02(((AccountFamily) map.get(str)).A04);
            for (Object contains : BNz) {
                if (A022.contains(contains)) {
                    i++;
                }
            }
        }
        return i;
    }

    public static AnonymousClass9BG A01(0lg r2) {
        return (AnonymousClass9BG) r2.A01(AnonymousClass9BG.class, new AnonymousClass9BH(r2));
    }

    public static HashSet A02(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((User) it.next()).getId());
        }
        return hashSet;
    }

    public final User A03(UserSession userSession) {
        String str = userSession.A06;
        Map map = this.A02;
        if (map.get(str) == null) {
            return null;
        }
        if (A07(str)) {
            return 0eE.A00(userSession).A00();
        }
        List<User> BO0 = AnonymousClass0BO.A00(userSession).BO0();
        HashSet A022 = A02(((AccountFamily) map.get(str)).A04);
        ArrayList arrayList = new ArrayList();
        for (User user : BO0) {
            if (A022.contains(user.getId())) {
                arrayList.add(user);
            }
        }
        if (arrayList.size() == 1) {
            return (User) arrayList.get(0);
        }
        0wb.A03(AnonymousClass000.A00(417), "Showing Log Out family option when there's multiple or no main accounts logged in");
        return null;
    }

    public final boolean A05(String str) {
        String A002;
        String str2;
        AccountFamily accountFamily = (AccountFamily) this.A02.get(str);
        if (accountFamily == null) {
            A002 = AnonymousClass000.A00(417);
            str2 = AnonymousClass000.A00(2513);
        } else {
            AnonymousClass9BP r1 = accountFamily.A00;
            if (r1 == AnonymousClass9BP.UNKNOWN) {
                A002 = AnonymousClass000.A00(417);
                str2 = "The linking state of the requested account isn't fetched yet";
            } else if (r1 != AnonymousClass9BP.UNLINKED_ACCOUNT) {
                return true;
            } else {
                return false;
            }
        }
        0wb.A03(A002, str2);
        return false;
    }

    public AnonymousClass9BG(0lg r2) {
        AnonymousClass3EO r0;
        this.A03 = r2;
        this.A01 = AnonymousClass0BO.A00(r2);
        if (r2 instanceof UserSession) {
            r0 = AnonymousClass3EO.A00(r2);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public final ArrayList A04(UserSession userSession) {
        List list;
        User A032 = A03(userSession);
        if (A032 != null) {
            String id = A032.getId();
            Map map = this.A02;
            if (map.get(id) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(A032);
                AccountFamily accountFamily = (AccountFamily) map.get(A032.getId());
                if (accountFamily.A04.isEmpty()) {
                    list = accountFamily.A03;
                } else {
                    list = accountFamily.A04;
                }
                HashSet A022 = A02(list);
                for (User user : AnonymousClass0BO.A00(userSession).BO0()) {
                    if (A022.contains(user.getId())) {
                        arrayList.add(user);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    public final boolean A06(String str) {
        if (A05(str)) {
            Map map = this.A02;
            if (map.get(str) == null || ((AccountFamily) map.get(str)).A00 != AnonymousClass9BP.CHILD_ACCOUNT) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A07(String str) {
        if (A05(str)) {
            Map map = this.A02;
            if (map.get(str) == null || ((AccountFamily) map.get(str)).A00 != AnonymousClass9BP.MAIN_ACCOUNT) {
                return false;
            }
            return true;
        }
        return false;
    }
}
