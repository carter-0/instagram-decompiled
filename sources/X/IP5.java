package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class IP5 implements C229222n2 {
    public final int A00;
    public final Object A01;

    public IP5(UserSession userSession, int i) {
        this.A00 = i;
        this.A01 = userSession;
    }

    public final String BK2(AnonymousClass30Y r7) {
        int i;
        StringBuilder A1A;
        String hexString;
        List list;
        1Xj A0u;
        int i2;
        String str;
        int i3 = this.A00;
        0qQ.A0B(r7, 0);
        Object obj = r7.A03;
        String A06 = C231122qu.A06((UserSession) this.A01, (1Nv) obj);
        if (i3 != 0) {
            if (A06 != null) {
                i2 = A06.hashCode();
            } else {
                i2 = 0;
            }
            String hexString2 = Integer.toHexString(i2);
            C267324bN r5 = (C267324bN) obj;
            if (r5 != null) {
                str = C51966G9m.A1B(r5);
            } else {
                str = null;
            }
            return 002.A0g("multiads_", hexString2, str);
        }
        AnonymousClass4HA r0 = (AnonymousClass4HA) r7.A04;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        C267324bN r52 = (C267324bN) obj;
        int i4 = 0;
        if (r52 == null || (list = r52.A0R) == null || (A0u = C51966G9m.A0u(list, i)) == null) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("carousel_");
            if (A06 != null) {
                i4 = A06.hashCode();
            }
            hexString = Integer.toHexString(i4);
        } else {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("carousel_");
            if (A06 != null) {
                i4 = A06.hashCode();
            }
            A1A.append(Integer.toHexString(i4));
            hexString = A0u.getId();
        }
        return AnonymousClass7TF.A0l(hexString, A1A);
    }
}
