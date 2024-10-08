package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class P8Y implements AnonymousClass7FU {
    public final AnonymousClass7FR A00;
    public final 2FW A01 = 2FW.A0y;
    public final MessageIdentifier A02;
    public final long A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final /* synthetic */ boolean ARU() {
        return C3270779h.A01(this);
    }

    public final /* synthetic */ String CBF() {
        return C3270779h.A00(this);
    }

    public P8Y(C254703su r70, String str) {
        C254703su r5 = r70;
        String str2 = str;
        boolean A012 = AnonymousClass7F3.A01(r5, str2);
        this.A05 = A012;
        this.A02 = r5.A0V();
        this.A03 = TimeUnit.MICROSECONDS.toMillis(r5.C7c());
        this.A06 = r5.A1k(new User(str2, (String) null));
        this.A00 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, !A012, A012, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        List<C2607246u> A0v = r5.A0v();
        0qQ.A07(A0v);
        ArrayList A0r = AnonymousClass7TG.A0r(A0v);
        for (C2607246u r0 : A0v) {
            String str3 = r0.A02;
            if (str3 == null) {
                str3 = "";
            }
            A0r.add(str3);
        }
        this.A04 = A0r;
    }

    public final 2FW Aqm() {
        return this.A01;
    }

    public final MessageIdentifier Ar2() {
        return null;
    }

    public final List Atz() {
        return this.A04;
    }

    public final /* synthetic */ C327627Bo Ax9() {
        return C327627Bo.NUX_TYPE_NONE;
    }

    public final boolean BCL() {
        return false;
    }

    public final /* synthetic */ int BIZ() {
        return 0;
    }

    public final AnonymousClass7FR BOV() {
        return this.A00;
    }

    public final MessageIdentifier BSG() {
        return this.A02;
    }

    public final long BSP() {
        return this.A03;
    }

    public final /* synthetic */ AnonymousClass5FV BeQ() {
        return AnonymousClass5FV.None;
    }

    public final /* synthetic */ String Bwc() {
        return null;
    }

    public final /* synthetic */ String Bze() {
        return "";
    }

    public final boolean CU2() {
        return this.A05;
    }

    public final boolean CWG() {
        return this.A06;
    }

    public final boolean CXM() {
        return true;
    }

    public final boolean Cbp() {
        return false;
    }
}
