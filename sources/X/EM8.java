package X;

import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public final class EM8 extends EMB {
    public final /* synthetic */ E36 A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EM8(Fragment fragment, AnonymousClass0iw r8, AnonymousClass0aP r9, G8H g8h, E36 e36, C46634DiE diE, List list) {
        super(fragment, r8, r9, g8h, diE);
        this.A00 = e36;
        this.A01 = list;
    }

    public final void A03(UserSession userSession, User user) {
        E36 e36;
        String username;
        String id;
        boolean z = true;
        UserSession userSession2 = userSession;
        C50031FJq fJq = new C50031FJq(1, user, this, userSession);
        if (this.A01.size() != 1) {
            e36 = this.A00;
            if (!AnonymousClass4KJ.A00(e36.A05)) {
                if (!C319606qt.A01(userSession).A0K(user.getId())) {
                    username = user.getUsername();
                    id = user.getId();
                    z = false;
                } else {
                    List<C49557Exs> list = e36.A05;
                    if (list != null) {
                        for (C49557Exs exs : list) {
                            if (!C319606qt.A01(userSession).A0K(exs.A00.getId())) {
                            }
                        }
                    }
                    super.A03(userSession, user);
                }
                username = user.getUsername();
                id = user.getId();
                z = false;
                E36.A00(fJq, userSession2, e36, username, id, z);
                return;
            }
        }
        if (!C319606qt.A01(userSession).A0K(user.getId())) {
            e36 = this.A00;
            username = user.getUsername();
            id = user.getId();
            E36.A00(fJq, userSession2, e36, username, id, z);
            return;
        }
        super.A03(userSession, user);
    }

    public final void A04(EM4 em4) {
        ImmutableList copyOf;
        int A03 = AnonymousClass0fD.A03(1784124848);
        E36 e36 = this.A00;
        List list = em4.A0B;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        e36.A05 = copyOf;
        List list2 = this.A01;
        if (list2.size() > 1) {
            HashSet A1F = AnonymousClass7TE.A1F();
            A1F.addAll(list2);
            0xY AR4 = DbV.A0d().AR4();
            AR4.E5h(AnonymousClass000.A00(1741), A1F);
            AR4.apply();
        }
        super.A04(em4);
        AnonymousClass0fD.A0A(-467612879, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(-1661707741, C47695EDe.A00(this, obj, 2145434976));
    }

    public static void A01(UserSession userSession, EM8 em8, User user) {
        super.A03(userSession, user);
    }
}
