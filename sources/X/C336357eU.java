package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.7eU  reason: invalid class name and case insensitive filesystem */
public final class C336357eU implements C337257fy, C337237fw {
    public C337237fw A00;
    public Object A01 = new ArrayList();
    public String A02 = "";
    public final UserSession A03;
    public final C336347eT A04;
    public final HashMap A05 = new HashMap();

    public C336357eU(UserSession userSession, C336347eT r3) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = r3;
    }

    public final void DDU() {
    }

    public final void EJE() {
    }

    public final void ERO(List list) {
    }

    public final String Amq() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object B3J() {
        return this.A05;
    }

    public final boolean BBY() {
        return false;
    }

    public final String BiY() {
        return this.A02;
    }

    public final String BjE() {
        return "";
    }

    public final String BnF() {
        return null;
    }

    public final Object Bo1() {
        return this.A01;
    }

    public final List Bqo() {
        return null;
    }

    public final boolean CT5() {
        return false;
    }

    public final boolean CWX() {
        return false;
    }

    public final boolean CYL() {
        return false;
    }

    public final void Dam(C337257fy r2) {
        C337237fw r0 = this.A00;
        if (r0 != null) {
            r0.Dam(this);
        }
    }

    public final void EcJ(C337237fw r2) {
        if (this.A00 != r2) {
            this.A00 = r2;
            if (r2 != null) {
                r2.Dam(this);
            }
        }
    }

    public final void EhX(String str) {
        this.A02 = str;
        if (0qQ.A0K(str, "#")) {
            C336347eT r6 = this.A04;
            UserSession userSession = this.A03;
            A4S a4s = new A4S(this);
            C262204Co r0 = r6.A00;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.A04);
            AnonymousClass9KF r2 = new AnonymousClass9KF((Object) userSession, (Object) a4s, (AnonymousClass4D7) null, 42);
            r6.A00 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
        }
    }

    public final boolean isLoading() {
        return false;
    }
}
