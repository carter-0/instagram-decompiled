package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.Iet  reason: case insensitive filesystem */
public final class C57690Iet implements JRF {
    public ArrayList A00 = AnonymousClass7TE.A1C();
    public ArrayList A01 = AnonymousClass7TE.A1C();
    public ArrayList A02 = AnonymousClass7TE.A1C();
    public boolean A03;
    public String A04;
    public boolean A05;
    public final GMD A06;
    public final UserSession A07;
    public final Set A08 = DbS.A0y();

    public C57690Iet(GMD gmd, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A06 = gmd;
        this.A04 = str;
    }

    public static void A00(AnonymousClass9JD r2, C57690Iet iet, Object obj) {
        User user;
        iet.A03 = true;
        AnonymousClass9IL r0 = (AnonymousClass9IL) r2.A01;
        if (r0 != null && (user = (User) r0.A02) != null) {
            String id = user.getId();
            iet.A01.add(obj);
            iet.A02.add(id);
            iet.A00.add(r2.A02);
        }
    }

    public final void DaS(C267324bN r8, int i, int i2, boolean z) {
        0qQ.A0B(r8, 0);
        AnonymousClass9JD A022 = this.A06.A02(r8);
        if (A022 != null) {
            String str = A022.A03;
            if (!0qQ.A0K(str, this.A04)) {
                this.A03 = false;
                this.A04 = str;
            }
            if (((long) i) >= 3000 && !this.A03) {
                this.A08.add(str);
                A00(A022, this, str);
            }
        }
    }

    public final void DxZ(C267324bN r4, int i, int i2) {
        AnonymousClass9JD A022;
        0qQ.A0B(r4, 0);
        if (i2 >= 1 && !this.A03 && (A022 = this.A06.A02(r4)) != null) {
            Set set = this.A08;
            String str = A022.A03;
            set.add(str);
            A00(A022, this, str);
        }
    }

    public final void Dxg(C267324bN r3, int i) {
        1Av A002 = 1Au.A00(this.A07);
        Set set = this.A08;
        A002.A19(set);
        set.clear();
        this.A05 = false;
    }

    public final void Dxm(C267324bN r4, Integer num, int i) {
        if (!this.A05) {
            this.A08.addAll(00k.A0X(AnonymousClass7TE.A0q(this.A07).C1t(AnonymousClass000.A00(3010))));
            this.A05 = true;
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
