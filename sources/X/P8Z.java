package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P8Z implements AnonymousClass7FU {
    public final long A00;
    public final AnonymousClass7FR A01;
    public final 2FW A02;
    public final MessageIdentifier A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public P8Z(N3F n3f, String str, String str2) {
        String str3;
        long j;
        N3F n3f2 = n3f;
        User user = n3f2.A02;
        List list = null;
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = null;
        }
        boolean equals = str2.equals(str3);
        this.A05 = equals;
        String str4 = n3f2.A05;
        if (str4 != null) {
            this.A03 = C66580MXl.A0i(str4, str);
            Integer num = n3f2.A04;
            if (num != null) {
                j = TimeUnit.SECONDS.toMillis((long) num.intValue());
            } else {
                j = 0;
            }
            this.A00 = j;
            this.A02 = 2FW.A0y;
            boolean z = true;
            this.A07 = true;
            String str5 = n3f2.A07;
            this.A06 = str5 == null ? false : z;
            this.A01 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, !equals, equals, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            this.A04 = str5 != null ? AnonymousClass7TE.A1I(str5) : list;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ boolean ARU() {
        return C3270779h.A01(this);
    }

    public final /* synthetic */ String CBF() {
        return C3270779h.A00(this);
    }

    public final 2FW Aqm() {
        return this.A02;
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
        int intValue;
        if (!(this instanceof NVH) || ((intValue = ((NVH) this).A07.intValue()) != 1 && intValue != 2)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ int BIZ() {
        return 0;
    }

    public final AnonymousClass7FR BOV() {
        return this.A01;
    }

    public final MessageIdentifier BSG() {
        return this.A03;
    }

    public final long BSP() {
        return this.A00;
    }

    public final /* synthetic */ AnonymousClass5FV BeQ() {
        return AnonymousClass5FV.None;
    }

    public final /* synthetic */ String Bwc() {
        return null;
    }

    public final /* synthetic */ String Bze() {
        return this.A01.A06;
    }

    public final boolean CU2() {
        return this.A05;
    }

    public final boolean CWG() {
        return this.A06;
    }

    public final boolean CXM() {
        return this.A07;
    }

    public final boolean Cbp() {
        return false;
    }
}
