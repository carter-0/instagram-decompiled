package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dl0  reason: case insensitive filesystem */
public final class C46773Dl0 extends 2YL {
    public int A00 = -1;
    public final int A01;
    public final IGRevShareProductType A02;
    public final UserSession A03;
    public final C49377Euf A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07 = DbS.A10(false);
    public final 05G A08;

    public C46773Dl0(IGRevShareProductType iGRevShareProductType, UserSession userSession, C49377Euf euf, int i) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = euf;
        this.A02 = iGRevShareProductType;
        this.A01 = i;
        1HR r0 = new 1HR(0);
        this.A05 = r0;
        this.A06 = 0u9.A04(r0);
        this.A08 = 106.A01(C47961EOm.A00);
        C51647Fy6.A02(this, C318116oQ.A00(this), 14);
    }

    public final void A00(C48189EaV eaV) {
        C318136oS A002;
        0sL fy6;
        C47960EOl eOl;
        int i;
        C47180Drv drv;
        C48189EaV eaV2 = eaV;
        if (eaV2 instanceof C47953EOe) {
            05G r1 = this.A08;
            Object value = r1.getValue();
            if ((value instanceof C47960EOl) && (eOl = (C47960EOl) value) != null) {
                List list = eOl.A00;
                int i2 = ((C47953EOe) eaV2).A00;
                C47180Drv drv2 = (C47180Drv) 00k.A0O(list, i2);
                int i3 = 0;
                if (drv2 == null || drv2.A03) {
                    i = this.A00 - 1;
                } else {
                    i = this.A00 + 1;
                }
                this.A00 = i;
                int i4 = this.A01;
                boolean z = false;
                if (i4 != -1 && i >= i4) {
                    z = true;
                }
                if (z) {
                    C51647Fy6.A02(this, C318116oQ.A00(this), 15);
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (Object next : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C47180Drv drv3 = (C47180Drv) next;
                    if (i3 == i2) {
                        String str = drv3.A02;
                        String str2 = drv3.A01;
                        boolean z2 = drv3.A04;
                        AnonymousClass7TF.A1B(str, 0, str2);
                        drv = new C47180Drv(str, str2, 0, !drv3.A03, z2);
                    } else if (z) {
                        boolean z3 = drv3.A03;
                        String str3 = drv3.A02;
                        String str4 = drv3.A01;
                        AnonymousClass7TF.A1B(str3, 0, str4);
                        drv = new C47180Drv(str3, str4, 0, z3, z3);
                    } else {
                        String str5 = drv3.A02;
                        boolean z4 = drv3.A03;
                        String str6 = drv3.A01;
                        AnonymousClass7TF.A1B(str5, 0, str6);
                        drv = new C47180Drv(str5, str6, 0, z4, true);
                    }
                    A0r.add(drv);
                    i3 = i5;
                }
                05G r4 = this.A07;
                do {
                } while (!r4.AIY(r4.getValue(), true));
                r1.Epw(new C47960EOl(A0r));
                return;
            }
            return;
        }
        if (eaV2 instanceof C47955EOg) {
            A002 = C318116oQ.A00(this);
            fy6 = new MH3(this, (AnonymousClass4D7) null, 49);
        } else if (eaV2 instanceof C47954EOf) {
            A002 = C318116oQ.A00(this);
            fy6 = new C51647Fy6((Object) this, (AnonymousClass4D7) null, 16);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        AnonymousClass7TE.A1Z(fy6, A002);
    }
}
