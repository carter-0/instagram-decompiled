package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.IMp  reason: case insensitive filesystem */
public final class C57049IMp implements AnonymousClass32U {
    public final ClipsViewerConfig A00;
    public final UserSession A01;
    public final GD6 A02;
    public final C52012GBj A03;
    public final String A04;

    public C57049IMp(ClipsViewerConfig clipsViewerConfig, UserSession userSession, GD6 gd6, C52012GBj gBj, String str) {
        DbW.A1N(userSession, 1, clipsViewerConfig);
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = gd6;
        this.A03 = gBj;
        this.A00 = clipsViewerConfig;
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DWA(int i, int i2) {
        0sn A1D;
        UserSession userSession = this.A01;
        C229352nF A0Y = C51967G9n.A0Y(userSession);
        String str = this.A04;
        ClipsViewerConfig clipsViewerConfig = this.A00;
        boolean z = clipsViewerConfig.A1r;
        if (str == null) {
            A1D = 0sn.A00;
        } else {
            A1D = AnonymousClass7TE.A1D(A0Y.A02(str).A03);
            ArrayList A1D2 = AnonymousClass7TE.A1D(A0Y.A02(str).A06);
            A1D.removeAll(A1D2);
            if (z) {
                A1D.addAll(A1D2);
            }
        }
        C267324bN A002 = GDY.A00(clipsViewerConfig, userSession, clipsViewerConfig.A1H);
        if (!(A002 == null || str == null)) {
            Set set = A0Y.A02(str).A06;
            set.remove(A002);
            set.add(A002);
        }
        C52009GBg gBg = this.A02.A0A;
        if (i == gBg.A0A() - 2 && gBg.A0E(gBg.A0A() - 1).A01 == C295365o2.GHOST && i <= clipsViewerConfig.A07 && 0 < A1D.size()) {
            C267324bN r1 = (C267324bN) A1D.get(0);
            int A0A = gBg.A0A() - 1;
            if (A0A < 0) {
                A0A = 0;
            }
            0qQ.A0B(r1, 0);
            gBg.A0b(r1, A0A);
            if (str != null) {
                Set set2 = A0Y.A02(str).A06;
                set2.remove(r1);
                set2.add(r1);
            }
        }
    }
}
