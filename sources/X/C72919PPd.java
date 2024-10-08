package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.PPd  reason: case insensitive filesystem */
public final class C72919PPd implements C337237fw, C336267eL {
    public C337237fw A00;
    public Object A01 = AnonymousClass7TE.A1C();
    public String A02 = "";
    public final UserSession A03;
    public final O8H A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();

    public final void DDU() {
    }

    public final void EJE() {
    }

    public final void ERO(List list) {
    }

    public final void EhX(String str) {
        String str2 = str;
        this.A02 = str;
        if (str != null) {
            O8H o8h = this.A04;
            UserSession userSession = this.A03;
            OAH oah = new OAH(this);
            AnonymousClass4D7 A0t = C51975G9x.A0t(o8h.A00);
            o8h.A00 = C51966G9m.A1L(new MH7((Object) userSession, (Object) oah, str2, A0t, 14, 42), 19E.A02(AnonymousClass12T.A00.A04));
        }
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

    public final Integer BlQ() {
        return null;
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

    public final boolean isLoading() {
        return false;
    }

    public C72919PPd(UserSession userSession, O8H o8h) {
        this.A03 = userSession;
        this.A04 = o8h;
    }
}
