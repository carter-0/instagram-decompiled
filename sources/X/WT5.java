package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class WT5 implements AnonymousClass0lh, 27S {
    public static final C20980X7u A02 = new C14141Tqb(7);
    public final C14016ToI A00;
    public final UserSession A01;

    public final synchronized List A00() {
        return this.A00.A01();
    }

    public final synchronized void A01(User user) {
        this.A00.A04(user);
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        boolean contains;
        2Cy r4 = (2Cy) obj;
        0qQ.A0B(r4, 0);
        synchronized (this) {
            contains = A00().contains(r4.A00);
        }
        return contains;
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A01).A02(this, 2Cy.class);
    }

    public WT5(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C14016ToI(userSession, C14017ToJ.A02, A02, 20);
        AnonymousClass1Nd.A00(userSession).A01(this, 2Cy.class);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1783660789);
        2Cy r8 = (2Cy) obj;
        synchronized (this) {
            int A0D = AnonymousClass7TG.A0D(r8, -1833600603);
            Iterator it = this.A00.A02().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User A06 = ((C66632Ma1) it.next()).A06();
                User user = r8.A00;
                if (0qQ.A0K(A06, user)) {
                    if (C14025ToR.A01(A06, user)) {
                        A01(user);
                    }
                }
            }
            AnonymousClass0fD.A0A(-128247490, A0D);
        }
        AnonymousClass0fD.A0A(595534, A03);
    }
}
