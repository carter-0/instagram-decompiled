package X;

import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LqM  reason: case insensitive filesystem */
public final class C65267LqM implements C74452Pv7 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final GiphyRequestSurface A02;
    public final List A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ String E1v(1XP r2) {
        CU0 cu0;
        C61293K1g k1g = (C61293K1g) r2;
        0qQ.A0B(k1g, 0);
        CU3 cu3 = k1g.A00;
        if (cu3 == null || (cu0 = cu3.A01) == null) {
            return null;
        }
        return cu0.A00;
    }

    public final /* bridge */ /* synthetic */ List E1w(1XP r6, C62564Khu khu, String str) {
        List list;
        C61293K1g k1g = (C61293K1g) r6;
        0qQ.A0B(khu, 0);
        0qQ.A0B(k1g, 1);
        boolean z = true;
        if (khu.ordinal() != 2) {
            list = k1g.A01.A05;
        } else {
            list = k1g.A01.A04;
        }
        List A16 = JTR.A16(list);
        if (A16 == null) {
            return 0sn.A00;
        }
        UserSession userSession = this.A01;
        Boolean valueOf = Boolean.valueOf(AnonymousClass7TF.A1W(khu, C62564Khu.GIPHY_STICKERS));
        if (str.length() != 0) {
            z = false;
        }
        ArrayList A012 = C64129LPd.A01(userSession, valueOf, A16, z);
        if (this.A00 == null) {
            return A012;
        }
        A16.size();
        A012.size();
        return A012;
    }

    public C65267LqM(GiphyRequestSurface giphyRequestSurface, AnonymousClass0iw r2, UserSession userSession, List list, boolean z) {
        this.A03 = list;
        this.A02 = giphyRequestSurface;
        this.A01 = userSession;
        this.A04 = z;
        this.A00 = r2;
    }

    public final 1OC AEX(AnonymousClass1O9 r4, String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(this.A03);
        if (this.A04 && str.length() == 0) {
            A1C.add(C62564Khu.CUTOUT_STICKERS);
        }
        return C63450KxF.A00(this.A02, this.A01, str, A1C);
    }
}
