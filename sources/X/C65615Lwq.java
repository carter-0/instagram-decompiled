package X;

import java.util.List;

/* renamed from: X.Lwq  reason: case insensitive filesystem */
public final class C65615Lwq implements C337237fw, C336267eL {
    public C337237fw A00;
    public Object A01 = 0sn.A00;
    public String A02 = "";
    public final L1T A03;

    public final void DDU() {
    }

    public final void EJE() {
    }

    public final void ERO(List list) {
    }

    public final String Amq() {
        return null;
    }

    public final Object B3J() {
        return null;
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

    public final void EhX(String str) {
        this.A02 = str;
        if (str != null) {
            L1T l1t = this.A03;
            L2P l2p = new L2P(this);
            C46730DkJ dkJ = l1t.A00;
            dkJ.A0F(str);
            AnonymousClass7TE.A1Z(new C66167MGe((Object) l1t, (Object) l2p, (AnonymousClass4D7) null, 19), C318116oQ.A00(dkJ));
        }
    }

    public final boolean isLoading() {
        return false;
    }

    public C65615Lwq(L1T l1t) {
        this.A03 = l1t;
    }
}
