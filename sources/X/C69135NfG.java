package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.NfG  reason: case insensitive filesystem */
public final class C69135NfG extends OTZ {
    public N9E A00;
    public N9H A01 = A01(this);
    public N9H A02;
    public AnonymousClass0r6 A03;
    public final UserSession A04;
    public final List A05;
    public final Map A06;
    public final 05G A07 = 106.A01(A01(this));

    public static final N9H A01(C69135NfG nfG) {
        return new N9H(A00(AnonymousClass0t1.A01.A01(nfG.A04)), 0Yt.A0E(), 0Yt.A0E(), 0, false, false, false, true, false, false, false, true, false, false, false, false);
    }

    public static final void A02(C69135NfG nfG) {
        C69135NfG nfG2 = nfG;
        LinkedHashMap A032 = 0Yt.A03(nfG2.A02.A03);
        N9E n9e = nfG2.A02.A01;
        N9E n9e2 = nfG2.A00;
        boolean z = n9e.A04;
        boolean z2 = n9e.A07;
        String str = n9e2.A02;
        String str2 = n9e2.A03;
        String str3 = n9e2.A01;
        ImageUrl imageUrl = n9e2.A00;
        boolean z3 = n9e2.A05;
        boolean z4 = n9e2.A06;
        AnonymousClass7TG.A1T(str, str2, str3);
        0qQ.A0B(imageUrl, 5);
        nfG2.A00 = new N9E(imageUrl, str, str2, str3, z, z2, z3, z4);
        int size = A032.size() + 2;
        for (Object put : nfG2.A05) {
            A032.put(String.valueOf(size), put);
            size++;
        }
        LinkedHashMap A033 = 0Yt.A03(nfG2.A02.A02);
        A033.putAll(nfG2.A06);
        N9H n9h = nfG2.A01;
        N9E n9e3 = nfG2.A00;
        Map A0B = 0Yt.A0B(A032);
        boolean z5 = n9h.A0F;
        boolean z6 = n9h.A05;
        boolean z7 = n9h.A0D;
        boolean z8 = n9h.A0B;
        boolean z9 = n9h.A0C;
        boolean z10 = n9h.A08;
        long j = n9h.A00;
        boolean z11 = n9h.A09;
        boolean z12 = n9h.A04;
        boolean z13 = n9h.A07;
        boolean z14 = n9h.A0E;
        boolean z15 = n9h.A0A;
        0qQ.A0B(n9e3, 0);
        boolean z16 = z5;
        boolean z17 = z6;
        boolean z18 = n9h.A06;
        boolean z19 = z7;
        LinkedHashMap linkedHashMap = A033;
        long j2 = j;
        N9E n9e4 = n9e3;
        N9H n9h2 = new N9H(n9e4, A0B, linkedHashMap, j2, z16, z17, z18, z19, z8, z9, z10, z11, z12, z13, z14, z15);
        if (!0qQ.A0K(nfG2.A01, n9h2)) {
            05G r2 = nfG2.A07;
            0qQ.A0B(r2, 0);
            r2.FIA(n9h2);
            nfG2.A01 = n9h2;
        }
    }

    public C69135NfG(UserSession userSession, O9R o9r) {
        super(o9r);
        this.A04 = userSession;
        this.A00 = A00(AnonymousClass7TF.A0Q(userSession));
        this.A02 = A01(this);
        this.A05 = AnonymousClass7TE.A1C();
        this.A06 = AnonymousClass7TE.A1H();
    }

    public static final N9E A00(User user) {
        return new N9E(user.Bh3(), user.getId(), user.getUsername(), user.B8Q(), true, true, false, false);
    }
}
