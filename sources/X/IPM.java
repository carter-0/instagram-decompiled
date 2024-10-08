package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import java.util.Map;

public abstract class IPM implements C250603lj {
    public final Rect A00 = AnonymousClass7TE.A0W();
    public final Rect A01 = AnonymousClass7TE.A0W();
    public final Map A02 = AnonymousClass7TE.A1H();

    public final String A01(AnonymousClass30Y r20) {
        String str;
        AnonymousClass30Y r1 = r20;
        if (this instanceof GO8) {
            return GO8.A00(r1, (GO8) this);
        }
        UserSession userSession = ((C54340H8m) this).A00;
        Object obj = r1.A03;
        0qQ.A06(obj);
        1Xj r11 = (1Xj) obj;
        String A0F = C231122qu.A0F(userSession, r11);
        if (A0F != null) {
            int hashCode = A0F.hashCode();
            I0g i0g = I0g.A03;
            0qQ.A0B(i0g, 1);
            C56544I0y i0y = i0g.A00;
            if (i0y.A02) {
                str = new String(new char[]{"0123456789abcdef".charAt((hashCode >> 28) & 15), "0123456789abcdef".charAt((hashCode >> 24) & 15), "0123456789abcdef".charAt((hashCode >> 20) & 15), "0123456789abcdef".charAt((hashCode >> 16) & 15), "0123456789abcdef".charAt((hashCode >> 12) & 15), "0123456789abcdef".charAt((hashCode >> 8) & 15), "0123456789abcdef".charAt((hashCode >> 4) & 15), "0123456789abcdef".charAt(hashCode & 15)});
            } else {
                long j = (long) hashCode;
                String str2 = i0y.A00;
                int length = str2.length();
                int length2 = "".length();
                long j2 = ((long) length) + 8 + ((long) length2);
                if (0 > j2 || j2 > 2147483647L) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("The resulting string length is too big: ");
                    throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0i(C291925i6.A03(j2), A1A));
                }
                int i = (int) j2;
                char[] cArr = new char[i];
                if (length != 0) {
                    if (length != 1) {
                        str2.getChars(0, length, cArr, 0);
                    } else {
                        cArr[0] = str2.charAt(0);
                    }
                }
                int i2 = 0;
                int i3 = length;
                int i4 = 32;
                do {
                    i4 -= 4;
                    length++;
                    cArr[i3] = "0123456789abcdef".charAt((int) ((j >> i4) & 15));
                    i3 = length;
                    i2++;
                } while (i2 < 8);
                if (length2 != 0) {
                    if (length2 != 1) {
                        "".getChars(0, length2, cArr, length);
                    } else {
                        cArr[length] = "".charAt(0);
                    }
                }
                int i5 = length + length2;
                if (i5 == i) {
                    str = new String(cArr);
                } else {
                    C60370gV.A01(i5, i);
                    str = new String(cArr, 0, i5);
                }
            }
        } else {
            str = "";
        }
        return 002.A0R(str, r11.getId());
    }

    public final void A02(AnonymousClass30Y r11, C252093oY r12) {
        int i;
        int i2;
        int i3;
        int i4;
        String A012 = A01(r11);
        if (r12.CEk(r11) == AnonymousClass05K.A0C) {
            this.A02.remove(A012);
            return;
        }
        Map map = this.A02;
        JZA jza = (JZA) map.get(A012);
        if (jza == null) {
            jza = new JZA(7, 0, false, false);
        }
        if (jza.A00 == null) {
            Rect rect = this.A00;
            r12.CFR(rect);
            Rect rect2 = this.A01;
            r12.B9a(rect2, r11);
            boolean z = jza.A02;
            if (!z) {
                int i5 = rect2.top;
                int i6 = rect.top;
                if ((i5 > i6 || i5 == i6) && ((i3 = rect2.left) > (i4 = rect.left) || (i3 == i4 && rect2.right == rect.right))) {
                    z = true;
                } else {
                    z = false;
                }
                jza.A02 = z;
            }
            boolean z2 = jza.A01;
            if (!z2) {
                if ((rect2.bottom < rect.bottom || rect2.top == rect.top) && ((i = rect2.right) < (i2 = rect.right) || (rect2.left == rect.left && i == i2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jza.A01 = z2;
            }
            if (z && z2) {
                jza.A00 = String.valueOf(r12.BlK());
            }
            map.put(A012, jza);
        }
    }

    public final boolean A03(AnonymousClass30Y r4) {
        JZA jza = (JZA) this.A02.get(A01(r4));
        if (jza == null) {
            jza = new JZA(7, 0, false, false);
        }
        return AnonymousClass7TF.A1V(jza.A00);
    }
}
