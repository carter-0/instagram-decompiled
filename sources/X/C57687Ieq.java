package X;

import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialStatus;
import java.util.List;

/* renamed from: X.Ieq  reason: case insensitive filesystem */
public final class C57687Ieq implements JRF {
    public boolean A00 = false;
    public final GD6 A01;
    public final JTB A02;
    public final String A03;
    public final String A04;

    public C57687Ieq(GD6 gd6, JTB jtb, String str, String str2) {
        String str3;
        0qQ.A0B(jtb, 4);
        this.A01 = gd6;
        this.A04 = str2;
        this.A02 = jtb;
        if (str != null) {
            str3 = C51965G9l.A0u(str);
        } else {
            str3 = null;
        }
        this.A03 = str3;
    }

    public final void Dxm(C267324bN r6, Integer num, int i) {
        String str;
        boolean z;
        ClipsTrialDict AoL;
        ClipsTrialDict AoL2;
        String id;
        0qQ.A0B(r6, 0);
        if (!this.A00) {
            1Xj r0 = r6.A02;
            MediaTrialStatus mediaTrialStatus = null;
            if (r0 == null || (id = r0.getId()) == null) {
                str = null;
            } else {
                str = 1Xv.A06(id);
            }
            if (0qQ.A0K(str, this.A03)) {
                1Xj r02 = r6.A02;
                if (!(r02 == null || (AoL2 = r02.A0C.AoL()) == null)) {
                    mediaTrialStatus = AoL2.BzK();
                }
                if (mediaTrialStatus == MediaTrialStatus.ACTIVE) {
                    C52058GDe A002 = JSx.A00(r6, this.A01);
                    JTB jtb = this.A02;
                    1Xj r03 = r6.A02;
                    if (r03 == null || (AoL = r03.A0C.AoL()) == null) {
                        z = false;
                    } else {
                        z = AnonymousClass7TF.A1Y(AoL.Cay(), true);
                    }
                    jtb.E1O(r6, A002, this.A04, z);
                    this.A00 = true;
                }
            }
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
