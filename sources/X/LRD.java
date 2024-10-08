package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public final class LRD {
    public C63896LAz A00 = null;
    public final UserSession A01;
    public final C313666go A02;
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;

    public LRD(UserSession userSession, C313666go r4) {
        AnonymousClass7TG.A1O(userSession, r4);
        this.A01 = userSession;
        this.A02 = r4;
        02z A012 = 106.A01((Object) null);
        this.A06 = A012;
        this.A0A = 10b.A03(A012);
        02z A013 = 106.A01((Object) null);
        this.A04 = A013;
        this.A08 = 10b.A03(A013);
        02z A014 = 106.A01((Object) null);
        this.A03 = A014;
        this.A07 = 10b.A03(A014);
        02z A015 = 106.A01((Object) null);
        this.A05 = A015;
        this.A09 = 10b.A03(A015);
    }

    private final Set A00(C62530KhM khM, boolean z) {
        HashSet<C63966LFs> hashSet;
        C63896LAz lAz = this.A00;
        if (lAz != null) {
            hashSet = lAz.A03.A02(JTP.A0y(khM), z);
        } else {
            hashSet = 0sl.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(hashSet);
        for (C63966LFs lFs : hashSet) {
            0qQ.A0A(lFs);
            A0r.add(C63483Kxm.A00(this.A01, lFs));
        }
        return 00k.A0k(A0r);
    }

    public final void A02(C63966LFs lFs) {
        this.A06.Epw(C63483Kxm.A00(this.A01, lFs));
        05G r3 = this.A04;
        LinkedHashSet A0y = DbS.A0y();
        C62530KhM khM = C62530KhM.ACTIVE;
        A01(khM, this, A0y, true);
        C62530KhM khM2 = C62530KhM.STALLED;
        A01(khM2, this, A0y, true);
        C62530KhM khM3 = C62530KhM.CONNECTING;
        A01(khM3, this, A0y, true);
        C62530KhM khM4 = C62530KhM.CONNECTED;
        A01(khM4, this, A0y, true);
        A01(C62530KhM.DISCONNECTING, this, A0y, true);
        r3.Epw(A0y);
        05G r1 = this.A03;
        C62530KhM khM5 = C62530KhM.INVITED;
        r1.Epw(A00(khM5, false));
        05G r32 = this.A05;
        LinkedHashSet A0y2 = DbS.A0y();
        if (this.A02 == C313666go.BROADCASTER) {
            A01(khM, this, A0y2, false);
            A01(khM2, this, A0y2, false);
            A01(khM3, this, A0y2, false);
            A01(khM4, this, A0y2, false);
            A01(khM5, this, A0y2, false);
        }
        r32.Epw(A0y2);
    }

    public static void A01(C62530KhM khM, LRD lrd, Collection collection, boolean z) {
        collection.addAll(lrd.A00(khM, z));
    }
}
