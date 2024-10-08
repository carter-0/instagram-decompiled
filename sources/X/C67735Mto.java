package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mto  reason: case insensitive filesystem */
public final class C67735Mto extends 2YL {
    public final AnonymousClass4DU A00;
    public final V4D A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final AnonymousClass2U7 A0B;

    public C67735Mto(AnonymousClass4DU r19, V4D v4d, User user, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        List list2;
        CreatorShoppingInfo Asf;
        AnonymousClass4DU r6 = r19;
        0qQ.A0B(r6, 4);
        String str6 = str;
        String str7 = str2;
        AnonymousClass7TG.A1S(str6, str7);
        V4D v4d2 = v4d;
        0qQ.A0B(v4d2, 9);
        User user2 = user;
        this.A02 = user2;
        this.A00 = r6;
        this.A03 = str6;
        this.A05 = str7;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = v4d2;
        this.A04 = str5;
        AnonymousClass3T1 A0A2 = C242173Sx.A0A(00k.A0o(00k.A0S((user == null || (Asf = user2.A03.Asf()) == null || (list2 = Asf.BN1()) == null) ? 0sn.A00 : list2, AnonymousClass7TE.A1I(z ? user2 : null))));
        this.A0B = A0A2;
        C242193Sz A0E = C242173Sx.A0E(C74162Pq3.A00, A0A2);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        0Yt.A0G(A1H, A0E);
        this.A0A = 0Yt.A0A(A1H);
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            AnonymousClass7TF.A1I(A0k.getUsername(), A0k, A0p);
        }
        this.A09 = 0Yt.A08(A0p);
        C242193Sz A0E2 = C242173Sx.A0E(new C20785Wyw(this, 25), this.A0B);
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User A0k2 = DbT.A0k(it2);
            String username = A0k2.A03.getUsername();
            0qQ.A0A(username);
            ImageUrl Bh3 = A0k2.A03.Bh3();
            String A002 = AnonymousClass3ZA.A00(A0k2);
            0qQ.A0A(A002);
            String A003 = AnonymousClass3ZA.A00(A0k2);
            0qQ.A0A(A003);
            A0p2.add(new N3G(Bh3, username, A002, A003, this.A03, this.A05, this.A06, this.A07, this.A04, -1, false));
        }
        AnonymousClass3T1 A0A3 = C242173Sx.A0A(new C73520Pe3(C74177PqJ.A00, C74176PqI.A00, new 0hJ(new AnonymousClass2U7[]{A0E2, 00k.A0o(A0p2)})));
        C74204Pqk pqk = C74204Pqk.A00;
        0qQ.A0B(pqk, 1);
        this.A08 = C242173Sx.A07(new C73519Pe2(pqk, A0A3));
    }
}
