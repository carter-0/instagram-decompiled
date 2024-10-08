package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.48M  reason: invalid class name */
public abstract class AnonymousClass48M {
    public static final User A00(UserSession userSession, PendingRecipient pendingRecipient) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(pendingRecipient, 1);
        String str = pendingRecipient.A0B;
        if (str == null) {
            str = "";
        }
        User user = new User(str, pendingRecipient.A0C);
        user.A0l(pendingRecipient.A03);
        user.A0t(pendingRecipient.A0A);
        user.A1F(pendingRecipient.A0b);
        user.A1E(pendingRecipient.A0Z);
        if (pendingRecipient.A01 == 0) {
            user.A0y(pendingRecipient.A0J);
        } else {
            user.A1B(pendingRecipient.A0V);
        }
        user.A03.Epv(pendingRecipient.A05);
        user.A03.EQB(Boolean.valueOf(pendingRecipient.A0K));
        user.A03.ESd(Boolean.valueOf(pendingRecipient.A0L));
        user.A0c(pendingRecipient.A01);
        user.A03.EVt(Boolean.valueOf(pendingRecipient.A0N));
        user.A03.Ea3(Boolean.valueOf(pendingRecipient.A0U));
        user.A0n(pendingRecipient.A04);
        user.A03.ESo(pendingRecipient.A09);
        user.A03.Eit(Integer.valueOf(pendingRecipient.A02));
        Integer num = pendingRecipient.A06;
        if (num != null) {
            user.A0o(16U.A00(num.intValue()));
        }
        user.A03.EXk(Boolean.valueOf(pendingRecipient.A0S));
        user.A03.EXj(Boolean.valueOf(pendingRecipient.A0R));
        user.A03.EOt(Boolean.valueOf(pendingRecipient.A0I));
        user.A13(pendingRecipient.A0O);
        user.A1G(pendingRecipient.A0c);
        user.A03.Enb(Boolean.valueOf(pendingRecipient.A0e));
        user.A03.EYA(Boolean.valueOf(pendingRecipient.A0F));
        user.A03.EdS(Boolean.valueOf(pendingRecipient.A0X));
        user.A03.ETD(Boolean.valueOf(pendingRecipient.A0M));
        return 17h.A00(userSession).A01(user, false, false);
    }

    public static final ArrayList A01(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PendingRecipient((User) it.next()));
        }
        return 00k.A0U(arrayList);
    }
}
