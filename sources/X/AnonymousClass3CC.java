package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3CC  reason: invalid class name */
public final class AnonymousClass3CC implements C233182vC {
    public final /* synthetic */ UserSession A00;

    public AnonymousClass3CC(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ int ATm(Object obj) {
        1PW r2 = (1PW) obj;
        0qQ.A0B(r2, 0);
        return r2.A01;
    }

    public final /* bridge */ /* synthetic */ String ATn(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        String id = r2.A0H.getId();
        0qQ.A07(id);
        return id;
    }

    public final /* bridge */ /* synthetic */ int ATy(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        C233472vm r0 = r2.A0H.A0b;
        if (r0 != null) {
            return r0.A03();
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ String AU6(Object obj) {
        1Xj r0;
        String id;
        C250973mM r5 = (C250973mM) obj;
        0qQ.A0B(r5, 0);
        Reel reel = r5.A0H;
        UserSession userSession = this.A00;
        if (reel.A15(userSession)) {
            return "n/a";
        }
        C255773uh A0A = reel.A0A(userSession, 0);
        0qQ.A07(A0A);
        if (!A0A.CWu() || (r0 = A0A.A0b) == null || (id = r0.getId()) == null) {
            return "n/a";
        }
        return id;
    }

    public final /* bridge */ /* synthetic */ int AU9(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        C233472vm r0 = r2.A0H.A0b;
        if (r0 != null) {
            return r0.A01();
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUA(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        C233472vm r0 = r2.A0H.A0b;
        if (r0 != null) {
            return r0.A02();
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUB(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        C233472vm r0 = r2.A0H.A0b;
        if (r0 != null) {
            return r0.A07();
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUC(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        C233472vm r0 = r2.A0H.A0b;
        if (r0 != null) {
            return r0.A08();
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUD(Object obj) {
        1PW r2 = (1PW) obj;
        0qQ.A0B(r2, 0);
        return r2.A04;
    }

    public final /* bridge */ /* synthetic */ String AUE(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        String id = r2.A0H.getId();
        0qQ.A07(id);
        return id;
    }

    public final /* bridge */ /* synthetic */ String AUK(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        return r2.A0I;
    }

    public final /* bridge */ /* synthetic */ String AUT(Object obj) {
        C250973mM r3 = (C250973mM) obj;
        0qQ.A0B(r3, 0);
        return r3.A0H.ByO(this.A00);
    }

    public final /* bridge */ /* synthetic */ Collection ATq(Object obj) {
        Set emptySet = Collections.emptySet();
        0qQ.A07(emptySet);
        return emptySet;
    }

    public final /* bridge */ /* synthetic */ Collection AUG(Object obj) {
        Set emptySet = Collections.emptySet();
        0qQ.A07(emptySet);
        return emptySet;
    }

    public final /* synthetic */ String ATt(Object obj) {
        return null;
    }

    public final /* synthetic */ Boolean AU2(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ String AUF(Object obj) {
        return null;
    }
}
