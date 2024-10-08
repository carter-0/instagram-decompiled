package X;

import com.instagram.user.model.User;
import java.util.Comparator;

/* renamed from: X.PcQ  reason: case insensitive filesystem */
public final class C73426PcQ implements Comparator {
    public static final C73426PcQ A00 = new C73426PcQ();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C68303N9q n9q = (C68303N9q) obj;
        C68303N9q n9q2 = (C68303N9q) obj2;
        AnonymousClass7TG.A1N(n9q, n9q2);
        User user = n9q.A00;
        String fullName = user.getFullName();
        String username = user.getUsername();
        n9q.CPm();
        if (fullName == null || fullName.isEmpty()) {
            fullName = username;
        }
        User user2 = n9q2.A00;
        String fullName2 = user2.getFullName();
        String username2 = user2.getUsername();
        n9q2.CPm();
        if (fullName2 == null || fullName2.isEmpty()) {
            fullName2 = username2;
        }
        return fullName.compareToIgnoreCase(fullName2);
    }
}
