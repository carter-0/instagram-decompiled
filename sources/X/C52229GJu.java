package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GJu  reason: case insensitive filesystem */
public final class C52229GJu extends C270664h6 {
    public final Context A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final AnonymousClass2fL A03;
    public final 1Ua A04;
    public final GM9 A05;
    public final C52185GIb A06;
    public final C55573Hjt A07;
    public final String A08;
    public final C62320sa A09;

    public C52229GJu(Context context, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C52185GIb gIb, C55573Hjt hjt, String str, C62320sa r8) {
        0qQ.A0B(str, 5);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = clipsViewerConfig;
        this.A09 = r8;
        this.A08 = str;
        this.A07 = hjt;
        this.A06 = gIb;
        1Ua A0j = C51971G9r.A0j(userSession);
        0qQ.A07(A0j);
        this.A04 = A0j;
        this.A03 = AnonymousClass2fL.A00(userSession);
        this.A05 = C52166GHi.A00(userSession);
    }

    public final void D3u(C52263GLe gLe) {
        ImmutableList immutableList;
        C52263GLe gLe2 = gLe;
        0qQ.A0B(gLe2, 0);
        C298835u7 r4 = gLe2.A01;
        boolean BU8 = r4.BaP().BU8();
        UserSession userSession = this.A02;
        List list = gLe2.A09;
        List A002 = AnonymousClass93X.A00(userSession, this.A08, list);
        C55573Hjt hjt = this.A07;
        boolean z = gLe2.A0D;
        0tS.A4E.A01(C51966G9m.A0P(hjt.A00));
        if (182.A06(0Tu.A05, userSession, 36325918561547632L) || 1KU.A05(userSession) || 1KU.A04(userSession)) {
            ClipsViewerConfig clipsViewerConfig = this.A01;
            if ((clipsViewerConfig.A1H != null || ((immutableList = clipsViewerConfig.A0E) != null && !immutableList.isEmpty())) && z) {
                C52185GIb gIb = this.A06;
                String str = gLe2.A04;
                UserSession userSession2 = gIb.A05;
                if ((!1KU.A05(userSession2) && !1KU.A04(userSession2)) || str != null) {
                    ArrayList A0U = 00k.A0U(A002);
                    if (1KU.A05(userSession)) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (Object next : list) {
                            if (GDZ.A01(((C267324bN) next).A01)) {
                                A1C.add(next);
                            }
                        }
                        A0U.addAll(A1C);
                    }
                    if (gLe2.A0C) {
                        GM9 gm9 = this.A05;
                        Long l = gLe2.A02;
                        Long l2 = gLe2.A03;
                        gm9.A05.clear();
                        gm9.A04.clear();
                        gm9.A01(-1, false, A0U);
                        UserSession userSession3 = gm9.A02;
                        if ((1KU.A05(userSession3) || 1KU.A04(userSession3)) && ((l == null || l.longValue() == -1) && l2 != null)) {
                            gm9.A01 = l2.longValue();
                            0xY AR4 = gm9.A03.AR4();
                            AR4.E5c("latest_headload_timestamp", gm9.A01);
                            AR4.apply();
                        }
                    } else {
                        this.A05.A01(-1, false, A0U);
                    }
                }
            }
        }
        ((GD6) this.A09.invoke()).A0C(A002, z, gLe2.A0G, r4.Cdj(), BU8, gLe2.A0E);
    }

    public final void D3r(H3D h3d) {
        ((GD6) this.A09.invoke()).A03 = false;
    }

    public final void D3s() {
        this.A09.invoke();
    }

    public final void D3t(C52228GJt gJt) {
        C62320sa r2 = this.A09;
        ((GD6) r2.invoke()).A0A((Integer) null);
        ((GD6) r2.invoke()).A03 = false;
    }
}
