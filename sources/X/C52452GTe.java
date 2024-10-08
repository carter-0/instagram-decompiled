package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GTe  reason: case insensitive filesystem */
public abstract class C52452GTe {
    public static 0jB A01(UserSession userSession, C257913yA r11, String str) {
        boolean z;
        List list;
        List list2;
        String str2;
        List list3;
        int i;
        int i2;
        List list4;
        String str3;
        Integer num;
        String str4;
        Long l;
        Integer BG7;
        Integer BGQ;
        String BGL;
        String BGL2;
        List C7t;
        List Agl;
        List C2d;
        if (r11 == null || (((BGL2 = r11.BGL()) == null || BGL2.length() <= 0) && (((C7t = r11.C7t()) == null || !AnonymousClass7TE.A1b(C7t)) && (((Agl = r11.Agl()) == null || !AnonymousClass7TE.A1b(Agl)) && ((C2d = r11.C2d()) == null || !AnonymousClass7TE.A1b(C2d)))))) {
            z = false;
        } else {
            z = true;
        }
        Long l2 = null;
        if (z) {
            0Tu r4 = 0Tu.A06;
            if (182.A06(r4, userSession, 36315125309377529L)) {
                if (r11 != null) {
                    list = r11.C2d();
                } else {
                    list = null;
                }
                boolean z2 = false;
                if (list == null || list.isEmpty() || r11 == null) {
                    list2 = null;
                } else {
                    list2 = r11.C2d();
                }
                0jB A0k = C51965G9l.A0k();
                0j9 r5 = C271774jZ.A7I;
                if (r11 != null) {
                    str2 = r11.C7u();
                } else {
                    str2 = null;
                }
                A0k.A04(r5, str2);
                0j9 r6 = C271774jZ.A7J;
                if (r11 != null) {
                    list3 = r11.C7t();
                    List C7t2 = r11.C7t();
                    if (C7t2 != null) {
                        i = C7t2.size();
                    }
                    i = 0;
                } else {
                    list3 = null;
                    i = 0;
                }
                A0k.A04(r6, String.valueOf(A00(list3, i)));
                0j9 r62 = C271774jZ.A7H;
                if (list2 != null) {
                    i2 = list2.size();
                } else {
                    i2 = 0;
                }
                int i3 = 0;
                A0k.A04(r62, String.valueOf(A00(list2, i2)));
                0j9 r63 = C271774jZ.A76;
                if (r11 != null) {
                    list4 = r11.Agl();
                    List Agl2 = r11.Agl();
                    if (Agl2 != null) {
                        i3 = Agl2.size();
                    }
                } else {
                    list4 = null;
                }
                A0k.A04(r63, String.valueOf(A00(list4, i3)));
                0j9 r1 = C271774jZ.A7A;
                if (r11 == null || (BGL = r11.BGL()) == null || BGL.length() == 0) {
                    z2 = true;
                }
                C51967G9n.A1J(r1, A0k, !z2);
                0j9 r9 = C271774jZ.A7G;
                if (r11 == null || (str3 = r11.C27()) == null) {
                    str3 = "";
                }
                Integer[] A00 = AnonymousClass05K.A00(4);
                int length = A00.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        num = AnonymousClass05K.A00;
                        break;
                    }
                    num = A00[i4];
                    if (0qQ.A0K(GYQ.A00(num), str3)) {
                        break;
                    }
                    i4++;
                }
                A0k.A04(r9, GYQ.A00(num));
                0j9 r12 = C271774jZ.A79;
                if (r11 != null) {
                    str4 = r11.getFormat();
                } else {
                    str4 = null;
                }
                A0k.A04(r12, str4);
                0j9 r13 = C271774jZ.A7E;
                if (r11 == null || (BGQ = r11.BGQ()) == null) {
                    l = null;
                } else {
                    l = C51969G9p.A0r(BGQ);
                }
                A0k.A04(r13, l);
                0j9 r14 = C271774jZ.A7D;
                if (!(r11 == null || (BG7 = r11.BG7()) == null)) {
                    l2 = C51969G9p.A0r(BG7);
                }
                A0k.A04(r14, l2);
                A0k.A04(C271774jZ.A7F, str);
                A0k.A04(C271774jZ.A7B, AnonymousClass7TF.A0R(r4, userSession, 36315125309901821L));
                A0k.A04(C271774jZ.A7C, AnonymousClass7TF.A0R(r4, userSession, 36315125309967358L));
                A0k.A04(C271774jZ.A77, AnonymousClass7TF.A0R(r4, userSession, 36315125310032895L));
                return A0k;
            }
        }
        return null;
    }

    public static final SpannableStringBuilder A00(List list, int i) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        SpannableStringBuilder A0E = C51965G9l.A0E();
        int size = list.size();
        if (i > size) {
            i = size;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) list.get(i2);
            new SpannableStringBuilder();
            if (str != null) {
                012.A0q(str);
            }
            A0E.append((CharSequence) list.get(i2));
            if (i2 < i - 1) {
                A0E.append("_");
            }
        }
        return A0E;
    }
}
