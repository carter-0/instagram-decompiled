package X;

import android.os.Build;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7WI  reason: invalid class name */
public final class AnonymousClass7WI {
    public boolean A00;
    public final 1wn A01 = new AnonymousClass7WJ(this);
    public final UserSession A02;
    public final AnonymousClass0eK A03;
    public final C62320sa A04;

    public AnonymousClass7WI(UserSession userSession, AnonymousClass0eK r3, C62320sa r4) {
        0qQ.A0B(r4, 1);
        this.A04 = r4;
        this.A02 = userSession;
        this.A03 = r3;
    }

    public static final void A00(AnonymousClass7WI r4, 2Kb r5) {
        AnonymousClass0eK r3 = r4.A03;
        Object obj = r3.get();
        0qQ.A07(obj);
        if (((C333517Zg) obj).C6l().COb() && !A01(r4)) {
            Integer num = r5.A01;
            if (num == AnonymousClass05K.A0D) {
                0sn r1 = 0sn.A00;
                Object obj2 = r3.get();
                0qQ.A07(obj2);
                ((C333517Zg) obj2).AkC().Ctg(r1);
            }
            if (Build.VERSION.SDK_INT >= 30 && r4.A00 && num == AnonymousClass05K.A01) {
                if (182.A06(0Tu.A05, r4.A02, 36325145470513821L)) {
                    ((View) r4.A04.invoke()).performHapticFeedback(16);
                }
            }
        }
    }

    public static final boolean A01(AnonymousClass7WI r2) {
        Object obj = r2.A03.get();
        0qQ.A07(obj);
        List<User> list = ((C333517Zg) obj).C6l().C6Q().A0b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (User A1X : list) {
                if (A1X.A1X()) {
                    return true;
                }
            }
        }
        return false;
    }
}
