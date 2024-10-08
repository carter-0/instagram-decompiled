package X;

import com.instagram.user.model.User;
import java.util.Comparator;

/* renamed from: X.PcR  reason: case insensitive filesystem */
public final class C73427PcR implements Comparator {
    public static final C73427PcR A00 = new C73427PcR();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C68303N9q n9q = (C68303N9q) obj;
        C68303N9q n9q2 = (C68303N9q) obj2;
        AnonymousClass7TG.A1N(n9q, n9q2);
        User user = n9q.A00;
        String fullName = user.getFullName();
        String username = user.getUsername();
        boolean CPm = user.CPm();
        boolean z = user.A06;
        if (fullName == null || fullName.isEmpty() || !AnonymousClass50n.A09(fullName, CPm, z)) {
            fullName = username;
        }
        User user2 = n9q2.A00;
        String fullName2 = user2.getFullName();
        String username2 = user2.getUsername();
        boolean CPm2 = user2.CPm();
        boolean z2 = user2.A06;
        if (fullName2 == null || fullName2.isEmpty() || !AnonymousClass50n.A09(fullName2, CPm2, z2)) {
            fullName2 = username2;
        }
        return fullName.compareToIgnoreCase(fullName2);
    }
}
