package X;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/* renamed from: X.RAz  reason: case insensitive filesystem */
public final class C8823RAz extends V4Q {
    public static final List A00;

    public final Integer A00(String str) {
        Integer A0m;
        char c;
        0qQ.A0B(str, 0);
        Locale locale = Locale.ROOT;
        String A0n = Pxf.A0n(locale, new 11S("[^\\dA-Z˜Ñ&]*").A00(Pxf.A0n(locale, str), ""));
        if (Pxj.A0C(A0n) != 13) {
            return AnonymousClass05K.A01;
        }
        if (new 11S("[A-Z\\u00D1&]{4}\\d{6}[A-Z0-9]{3}").A08(A0n)) {
            if (!A00.contains(C51967G9n.A0q(A0n, 0, 4)) && (A0m = 00y.A0m(C51967G9n.A0q(A0n, 4, 6), 10)) != null) {
                int intValue = A0m.intValue();
                Integer A0m2 = 00y.A0m(C51967G9n.A0q(A0n, 6, 8), 10);
                if (A0m2 != null) {
                    int intValue2 = A0m2.intValue() - 1;
                    Integer A0m3 = 00y.A0m(C51967G9n.A0q(A0n, 8, 10), 10);
                    if (A0m3 != null) {
                        int intValue3 = A0m3.intValue();
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        int floor = ((int) Math.floor((double) (gregorianCalendar.get(1) / 100))) * 100;
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(intValue + floor, intValue2, intValue3);
                        if (gregorianCalendar2.compareTo(gregorianCalendar) > 0) {
                            gregorianCalendar2 = new GregorianCalendar((floor - 100) + intValue, intValue2, intValue3);
                        }
                        if (gregorianCalendar2.get(5) == intValue3 && gregorianCalendar2.get(2) == intValue2 && gregorianCalendar2.get(1) % 100 == intValue) {
                            int codePointAt = A0n.codePointAt(12);
                            String A0g = 00p.A0g(C51967G9n.A0q(A0n, 0, 12), "-", "", false);
                            int i = 0;
                            int i2 = 0;
                            do {
                                i2 += 00l.A04("0123456789ABCDEFGHIJKLMN&OPQRSTUVWXYZ Ñ", (char) A0g.codePointAt(i), 0) * (13 - i);
                                i++;
                            } while (i < 12);
                            int i3 = 11 - (i2 % 11);
                            if (i3 == 10) {
                                c = 'A';
                            } else if (i3 != 11) {
                                c = (char) String.valueOf(i3).codePointAt(0);
                            } else {
                                c = '0';
                            }
                            if (c != codePointAt) {
                                return AnonymousClass05K.A0j;
                            }
                            return AnonymousClass05K.A00;
                        }
                    }
                }
            }
        }
        return AnonymousClass05K.A15;
    }

    public final String A01(String str) {
        StringBuilder A0n;
        char codePointAt;
        0qQ.A0B(str, 0);
        String A002 = new 11S("[^\\dA-Z˜Ñ&]*").A00(AnonymousClass7TF.A0k(str), "");
        int A0C = Pxj.A0C(A002);
        if (A0C <= 4) {
            return Pxf.A0d(A002, "[\\d]*", "");
        }
        String A0d = Pxf.A0d(C51967G9n.A0q(A002, 0, 4), "[\\d]*", "");
        int i = A0C;
        if (A0C > 10) {
            i = 10;
        }
        String A0d2 = Pxf.A0d(C51967G9n.A0q(A002, 4, i), "\\D", "");
        if (A0C > 10) {
            if (A0C > 13) {
                A0C = 13;
            }
            String A0d3 = Pxf.A0d(C51967G9n.A0q(A002, 10, A0C), "&", "");
            int A0C2 = Pxj.A0C(A0d3);
            if (A0C2 != 0) {
                String A0i = 002.A0i(A0d, A0d2, C51967G9n.A0q(A0d3, 0, Math.min(2, A0C2)), '-');
                if (A0C2 != 3 || '0' > (codePointAt = (char) A0d3.codePointAt(2))) {
                    return A0i;
                }
                if (codePointAt >= ':' && codePointAt != 'A') {
                    return A0i;
                }
                A0n = AnonymousClass7TF.A0n(A0i);
                A0n.append(codePointAt);
                return A0n.toString();
            }
        }
        A0n = AnonymousClass7TF.A0n(A0d);
        A0n.append(A0d2);
        return A0n.toString();
    }

    static {
        String[] strArr = new String[41];
        System.arraycopy(new String[]{"MEAR", "MEAS", "MEON", "MION", "MOCO", "MULA", "PEDA", "PEDO", "PENE", "PUTA", "PUTO", "QULO", "RATA", "RUIN"}, AnonymousClass7TF.A1X(new String[]{"BUEI", "BUEY", "CACA", "CACO", "CAGA", "CAGO", "CAKA", "CAKO", "COGE", "COJA", "COJE", "COJI", "CULO", "COJO", "FETO", "GUEY", "JOTO", "KACA", "KACO", "KAGA", "KAGO", "KOGE", "KOJO", "KAKA", "KULO", "MAME", "MAMO"}, strArr) ? 1 : 0, strArr, 27, 14);
        A00 = 0sr.A1P(strArr);
    }
}
