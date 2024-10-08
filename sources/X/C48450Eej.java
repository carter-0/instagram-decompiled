package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.Eej  reason: case insensitive filesystem */
public abstract class C48450Eej {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        String A0H;
        Object A03 = r18.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C3034368u r1 = (C3034368u) A03;
        C307896Rx r15 = r17;
        C307786Rm r11 = r15.A03;
        if (r11 == null) {
            r11 = C308206Td.A09(r15);
        }
        C276544tV A00 = C9812Rha.A00(r11, r15, r1.A02);
        FragmentActivity A08 = Dba.A08(r15);
        0qQ.A0B(A08, 0);
        C358248ab A0Y = DbS.A0Y(A08);
        String A0H2 = A00.A0H();
        if (!(A0H2 == null || A0H2.length() == 0)) {
            A0Y.A05 = A0H2;
        }
        String A0F = A00.A0F();
        if (!(A0F == null || A0F.length() == 0)) {
            A0Y.A0q(A0F);
        }
        List A0M = A00.A0M(35);
        0qQ.A07(A0M);
        if (!A0M.isEmpty()) {
            List A0g = 00k.A0g(A0M, C51564FwA.A00);
            String A0H3 = ((C276544tV) A0g.get(0)).A0H();
            if (A0H3 != null && !A0H3.equals("emphasized")) {
                A0g = 00k.A0g(A0M, new C51562Fw8(1));
            }
            int size = A0g.size();
            for (int i = 0; i < size; i++) {
                Object obj = A0g.get(i);
                0qQ.A07(obj);
                C276544tV r3 = (C276544tV) obj;
                C358278ae r2 = C358278ae.DEFAULT;
                String A0F2 = r3.A0F();
                C277014uI A0A = r3.A0A(35);
                if (!(r3.A0H() == null || (A0H = r3.A0H()) == null)) {
                    int hashCode = A0H.hashCode();
                    if (hashCode != -1829997182) {
                        if (hashCode == 506776930 && A0H.equals("emphasized")) {
                            r2 = C358278ae.BLUE_BOLD;
                        }
                    } else if (A0H.equals("destructive")) {
                        r2 = C358278ae.RED;
                    }
                }
                C50024FJj fJj = null;
                if (A0A != null) {
                    fJj = new C50024FJj(r11, r15, r3, A0A, 2);
                }
                if (A0F2 != null) {
                    if (i == 0) {
                        A0Y.A0Y(fJj, r2, A0F2, true);
                    } else if (i == 1) {
                        A0Y.A0W(fJj, r2, A0F2, true);
                    } else if (i == 2) {
                        A0Y.A0X(fJj, r2, A0F2, true);
                    }
                }
            }
        }
        if (!(A00.A0I() == null || !0qQ.A0K(A00.A0I(), "promotional") || A00.A0E() == null)) {
            SimpleImageUrl A0V = DbS.A0V(A00.A0G());
            String A0E = A00.A0E();
            if (A0E != null) {
                int hashCode2 = A0E.hashCode();
                if (hashCode2 != 1079772361) {
                    if (hashCode2 == 1782764648 && A0E.equals("profile_picture")) {
                        A0Y.A0n(A0V, C308206Td.A07(r11));
                    }
                } else if (A0E.equals("full_width_photo")) {
                    A0Y.A0o(A0V, C308206Td.A07(r11));
                }
            }
            AnonymousClass0iw A07 = C308206Td.A07(r11);
            A0Y.A08 = true;
            A0Y.A0Z.setImageURL(A0V, A07, (C240963Ni) null);
        }
        DbT.A1V(A0Y);
        return null;
    }
}
