package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class OJK {
    public final /* synthetic */ O8J A00;

    public OJK(O8J o8j) {
        this.A00 = o8j;
    }

    public final void A00(C71150OeA oeA, String str) {
        List list;
        boolean z;
        Map map;
        int A0A;
        C71150OeA oeA2 = oeA;
        String str2 = oeA2.A0L;
        0qQ.A06(str2);
        String str3 = oeA2.A0D;
        String str4 = oeA2.A0E;
        String str5 = oeA2.A0C;
        String str6 = oeA2.A09;
        List list2 = oeA2.A0G;
        if (list2 != null) {
            list = Collections.unmodifiableList(list2);
        } else {
            list = null;
        }
        String str7 = oeA2.A0B;
        byte[] bArr = oeA2.A0H;
        byte[] bArr2 = oeA2.A0I;
        Integer valueOf = Integer.valueOf(oeA2.A05);
        Integer valueOf2 = Integer.valueOf(oeA2.A04);
        Integer valueOf3 = Integer.valueOf(oeA2.A03);
        Integer valueOf4 = Integer.valueOf(oeA2.A02);
        String str8 = str;
        if (str4 == null && str3 == null && bArr == null && bArr2 == null) {
            z = false;
        } else {
            z = true;
            if (str7 != null) {
                0qQ.A0B("/image/", 1);
            }
            OYV.A00(str8);
        }
        OWT owt = this.A00.A00;
        N2L n2l = null;
        if (z) {
            byte[] bArr3 = bArr2;
            if (bArr2 == null) {
                bArr3 = bArr;
                if (bArr == null) {
                    if (!(str4 == null || str3 == null)) {
                        String str9 = str5;
                        String str10 = str3;
                        String str11 = str4;
                        String str12 = str2;
                        n2l = new N2L(str12, str11, str10, str9, str6, list, OWT.A06, 1, 1);
                        owt.A00.put(n2l.A03, n2l);
                    }
                }
            }
            if (bArr3.equals(bArr2)) {
                A0A = AnonymousClass7TG.A0A(valueOf4);
            } else if (bArr3.equals(bArr)) {
                A0A = AnonymousClass7TG.A0A(valueOf2);
                valueOf3 = valueOf;
            }
            int A04 = C51967G9n.A04(valueOf3, 0);
            if (!(A0A == 0 || A04 == 0)) {
                String str13 = str5;
                String str14 = str3;
                String str15 = str4;
                String str16 = str2;
                n2l = new N2L(str16, str15, str14, str13, str6, list, bArr3, A0A, A04);
                owt.A00.put(n2l.A03, n2l);
            }
        }
        owt.A01.accept(C60340gF.A00);
        UserSession userSession = owt.A02;
        if (C51965G9l.A1a(0Tu.A05, userSession, 2342156773019551982L)) {
            AnonymousClass59G r0 = (AnonymousClass59G) owt.A03.remove(str8);
            if (r0 == null) {
                r0 = OWT.A05;
            }
            String str17 = (String) r0.A00;
            C254743sy r1 = (C254743sy) r0.A01;
            C254783t2 r5 = (C254783t2) r0.A02;
            if (str17.length() > 0 && r1 != null && r5 != null) {
                C72191OyA A002 = C70171NyP.A00(userSession);
                MsysThreadId A06 = C66647MaG.A06(r1);
                0qQ.A0B(A06, 0);
                long j = A06.A00;
                Map map2 = A002.A02;
                Long valueOf5 = Long.valueOf(j);
                if (map2.containsKey(valueOf5) && (map = (Map) map2.get(valueOf5)) != null) {
                    map.remove(str17);
                    map2.put(valueOf5, map);
                }
                C71148Oe6.A06(userSession, n2l, r5, str8);
            }
        }
    }
}
