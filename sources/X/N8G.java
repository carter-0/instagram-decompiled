package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

public final class N8G extends AnonymousClass0T0 implements AnonymousClass7FU, AnonymousClass7FW {
    public final C328667Fr A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass7FT A03;

    public N8G(C328667Fr r2, String str, String str2) {
        0qQ.A0B(r2, 1);
        this.A03 = r2.A0B;
        this.A00 = r2;
        this.A01 = str;
        this.A02 = str2;
    }

    public final int BIZ() {
        return this.A03.BIZ();
    }

    public final String Bze() {
        return this.A03.Bze();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8G) {
                N8G n8g = (N8G) obj;
                if (!0qQ.A0K(this.A00, n8g.A00) || !0qQ.A0K(this.A01, n8g.A01) || !0qQ.A0K(this.A02, n8g.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean ARU() {
        return C3270779h.A01(this.A03);
    }

    public final 2FW Aqm() {
        return this.A03.A04;
    }

    public final MessageIdentifier Ar2() {
        return this.A03.A05;
    }

    public final List Atz() {
        return this.A03.A07;
    }

    public final C327627Bo Ax9() {
        return this.A03.A03;
    }

    public final boolean BCL() {
        return this.A03.A08;
    }

    public final AnonymousClass7FR BOV() {
        return this.A03.A02;
    }

    public final MessageIdentifier BSG() {
        return this.A03.A06;
    }

    public final long BSP() {
        return this.A03.A00;
    }

    public final AnonymousClass5FV BeQ() {
        return AnonymousClass5FV.None;
    }

    public final String Bwc() {
        return null;
    }

    public final String CBF() {
        return C3270779h.A00(this.A03);
    }

    public final boolean CU2() {
        return this.A03.A09;
    }

    public final boolean CWG() {
        return this.A03.A0A;
    }

    public final boolean CXM() {
        return this.A03.A0B;
    }

    public final boolean Cbp() {
        return this.A03.A0C;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
