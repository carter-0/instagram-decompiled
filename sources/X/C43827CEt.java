package X;

import com.instagram.api.schemas.RankingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.CEt  reason: case insensitive filesystem */
public final class C43827CEt extends AnonymousClass3HP implements C298835u7, AnonymousClass1XV {
    public long A00 = -1;
    public long A01 = -1;
    public C239773Ic A02;
    public BBP A03;
    public C276104sZ A04;
    public RankingInfo A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public String A09;
    public HashMap A0A;
    public List A0B = 0sn.A00;
    public List A0C;
    public List A0D;

    public final String BaG() {
        return null;
    }

    public final boolean CPJ() {
        return false;
    }

    public final boolean Cdj() {
        Boolean bool = true;
        return bool.equals(this.A07);
    }

    public final void EQF(String str) {
        0qQ.A0B(str, 0);
    }

    public final List Ahh() {
        return this.A0D;
    }

    public final HashMap Ahj() {
        return this.A0A;
    }

    public final long AjJ() {
        return this.A00;
    }

    public final long AjP() {
        return this.A01;
    }

    public final List Ao1() {
        List<C61074JwC> list = this.A0C;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C61074JwC jwC : list) {
            0qQ.A0B(jwC, 0);
            C267324bN A032 = C295325ny.A03(C295325ny.A01(jwC));
            if (A032 != null) {
                A1C.add(A032);
            }
        }
        return A1C;
    }

    public final List Ao2() {
        List<C61074JwC> list = this.A0C;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C61074JwC A012 : list) {
            A0r.add(C295325ny.A01(A012));
        }
        return A0r;
    }

    public final List Ao4() {
        List<BB0> list = this.A0B;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (BB0 bb0 : list) {
            0qQ.A0B(bb0, 0);
            A0r.add(C295325ny.A02(new C276014sL(bb0.A00, bb0.A01)));
        }
        return A0r;
    }

    public final C276114sa BaP() {
        return this.A04;
    }

    public final String Bnn() {
        return this.A09;
    }

    public final boolean CP6() {
        if (!this.A04.A01) {
            return false;
        }
        return true;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        BBP bbp = this.A03;
        if (bbp != null) {
            return bbp;
        }
        C41845B3m.A0v();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getNextMaxId() {
        return this.A04.A00;
    }

    public C43827CEt() {
        C298855u9 A002 = C276114sa.A00.A00(false);
        A002.A00 = null;
        this.A04 = A002.A00();
    }

    public final void EQE(long j) {
        this.A00 = j;
    }

    public final void EQG(long j) {
        this.A01 = j;
    }
}
