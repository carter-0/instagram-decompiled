package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Dkm  reason: case insensitive filesystem */
public final class C46759Dkm extends 2YL {
    public final C54434HDi A00;
    public final String A01;
    public final AnonymousClass0r6 A02;
    public final 0V2 A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final UserSession A06;
    public final String A07;

    public C46759Dkm(UserSession userSession, C54434HDi hDi, String str, String str2) {
        Object value;
        String str3;
        List list;
        Map map;
        String A2n;
        0qQ.A0B(hDi, 1);
        this.A00 = hDi;
        this.A06 = userSession;
        this.A01 = str;
        this.A07 = str2;
        02z A10 = DbS.A10(new C61079JwH((String) null, (List) null, (Map) null, (DefaultConstructorMarker) null, 7, 23));
        this.A04 = A10;
        this.A05 = 10b.A03(A10);
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A03 = A012;
        this.A02 = A012;
        C54434HDi hDi2 = this.A00;
        1Xj A0U = DbV.A0U(hDi2.A01, this.A01);
        if (!(A0U == null || (A2n = A0U.A2n()) == null)) {
            hDi2.A01(A2n, new G4S(this, 11), true);
        }
        do {
            value = A10.getValue();
            C61079JwH jwH = (C61079JwH) value;
            str3 = this.A07;
            list = (List) jwH.A01;
            map = (Map) jwH.A00;
            AnonymousClass7TF.A1B(list, 0, map);
        } while (!A10.AIY(value, new C61079JwH(str3, list, map)));
    }
}
