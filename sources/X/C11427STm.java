package X;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.STm  reason: case insensitive filesystem */
public final class C11427STm {
    public static final char[] A09 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.TPe] */
    public static String A01(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                ? obj = new Object();
                obj.A0G(str, i, i3);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < i2) {
                            int A002 = SUS.A00(str.charAt(i3 + 1));
                            int A003 = SUS.A00(str.charAt(i4));
                            if (!(A002 == -1 || A003 == -1)) {
                                obj.A0B((A002 << 4) + A003);
                                i3 = i4;
                            }
                        }
                        obj.A0E(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            obj.A0B(32);
                        }
                        obj.A0E(codePointAt);
                    }
                    i3 += Character.charCount(codePointAt);
                }
                return obj.A05();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.TPe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.TPe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.TPe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.TPe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.TPe} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(java.lang.String r8, java.lang.String r9, int r10, int r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r4 = r10
        L_0x0001:
            if (r4 >= r11) goto L_0x00cb
            int r2 = r8.codePointAt(r4)
            r0 = 32
            if (r2 < r0) goto L_0x0036
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 == r0) goto L_0x0036
            r0 = 128(0x80, float:1.794E-43)
            if (r2 < r0) goto L_0x0015
            if (r15 != 0) goto L_0x0036
        L_0x0015:
            int r1 = r9.indexOf(r2)
            r0 = -1
            if (r1 != r0) goto L_0x0036
            r0 = 37
            if (r2 != r0) goto L_0x0030
            if (r12 == 0) goto L_0x0036
            if (r13 == 0) goto L_0x002a
            boolean r0 = A05(r8, r4, r11)
            if (r0 == 0) goto L_0x0036
        L_0x002a:
            int r0 = java.lang.Character.charCount(r2)
            int r4 = r4 + r0
            goto L_0x0001
        L_0x0030:
            r0 = 43
            if (r2 != r0) goto L_0x002a
            if (r14 == 0) goto L_0x002a
        L_0x0036:
            X.TPe r3 = new X.TPe
            r3.<init>()
            r3.A0G(r8, r10, r4)
            r5 = 0
        L_0x003f:
            if (r4 >= r11) goto L_0x00c6
            int r2 = r8.codePointAt(r4)
            if (r12 == 0) goto L_0x005d
            r0 = 9
            if (r2 == r0) goto L_0x0057
            r0 = 10
            if (r2 == r0) goto L_0x0057
            r0 = 12
            if (r2 == r0) goto L_0x0057
            r0 = 13
            if (r2 != r0) goto L_0x005d
        L_0x0057:
            int r0 = java.lang.Character.charCount(r2)
            int r4 = r4 + r0
            goto L_0x003f
        L_0x005d:
            r0 = 43
            if (r2 != r0) goto L_0x0073
            if (r14 == 0) goto L_0x0073
            if (r12 == 0) goto L_0x0070
            java.lang.String r6 = "+"
        L_0x0067:
            int r1 = r6.length()
            r0 = 0
            r3.A0G(r6, r0, r1)
            goto L_0x0057
        L_0x0070:
            java.lang.String r6 = "%2B"
            goto L_0x0067
        L_0x0073:
            r0 = 32
            r1 = 37
            if (r2 < r0) goto L_0x0096
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 == r0) goto L_0x0096
            r0 = 128(0x80, float:1.794E-43)
            if (r2 < r0) goto L_0x0083
            if (r15 != 0) goto L_0x0096
        L_0x0083:
            int r6 = r9.indexOf(r2)
            r0 = -1
            if (r6 != r0) goto L_0x0096
            if (r2 != r1) goto L_0x00c2
            if (r12 == 0) goto L_0x0096
            if (r13 == 0) goto L_0x00c2
            boolean r0 = A05(r8, r4, r11)
            if (r0 != 0) goto L_0x00c2
        L_0x0096:
            if (r5 != 0) goto L_0x009d
            X.TPe r5 = new X.TPe
            r5.<init>()
        L_0x009d:
            r5.A0E(r2)
        L_0x00a0:
            boolean r0 = r5.ATS()
            if (r0 != 0) goto L_0x0057
            byte r0 = r5.readByte()
            r6 = r0 & 255(0xff, float:3.57E-43)
            r3.A0B(r1)
            char[] r7 = A09
            int r0 = r6 >> 4
            r0 = r0 & 15
            char r0 = r7[r0]
            r3.A0B(r0)
            r0 = r6 & 15
            char r0 = r7[r0]
            r3.A0B(r0)
            goto L_0x00a0
        L_0x00c2:
            r3.A0E(r2)
            goto L_0x0057
        L_0x00c6:
            java.lang.String r0 = r3.A05()
            return r0
        L_0x00cb:
            java.lang.String r0 = r8.substring(r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11427STm.A02(java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, boolean):java.lang.String");
    }

    public static int A00(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static boolean A05(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || SUS.A00(str.charAt(i + 1)) == -1 || SUS.A00(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    public final String A06() {
        if (this.A05.isEmpty()) {
            return "";
        }
        String str = this.A04;
        return str.substring(str.indexOf(58, this.A03.length() + 3) + 1, str.indexOf(64));
    }

    public final String A07() {
        String str = this.A04;
        int indexOf = str.indexOf(47, this.A03.length() + 3);
        return str.substring(indexOf, SUS.A01(str, "?#", indexOf, str.length()));
    }

    public final String A08() {
        if (this.A08 == null) {
            return null;
        }
        String str = this.A04;
        int indexOf = str.indexOf(63) + 1;
        int length = str.length();
        int i = indexOf;
        byte[] bArr = SUS.A07;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '#') {
                    break;
                }
                i++;
            } else {
                i = length;
                break;
            }
        }
        return str.substring(indexOf, i);
    }

    public final String A09() {
        if (this.A06.isEmpty()) {
            return "";
        }
        int length = this.A03.length() + 3;
        String str = this.A04;
        return str.substring(length, SUS.A01(str, ":@", length, str.length()));
    }

    public final String A0A() {
        S73 s73;
        try {
            s73 = new S73();
            s73.A02("/...", this);
        } catch (IllegalArgumentException unused) {
            s73 = null;
        }
        int length = "".length();
        s73.A03 = A02("", " \"':;<=>@[]^`{}|/\\?#", 0, length, false, false, false, true);
        s73.A02 = A02("", " \"':;<=>@[]^`{}|/\\?#", 0, length, false, false, false, true);
        return s73.A00().toString();
    }

    public final URI A0B() {
        String A0v;
        S73 s73 = new S73();
        String str = this.A03;
        s73.A05 = str;
        s73.A03 = A09();
        s73.A02 = A06();
        s73.A04 = this.A02;
        int i = this.A00;
        if (i == A00(str)) {
            i = -1;
        }
        s73.A00 = i;
        List list = s73.A07;
        list.clear();
        list.addAll(A0C());
        s73.A01(A08());
        if (this.A01 == null) {
            A0v = null;
        } else {
            String str2 = this.A04;
            A0v = Pxe.A0v(str2.indexOf(35), str2);
        }
        s73.A01 = A0v;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String A0t = DbU.A0t(list, i2);
            list.set(i2, A02(A0t, "[]", 0, A0t.length(), true, true, false, true));
        }
        List list2 = s73.A06;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String A0t2 = DbU.A0t(s73.A06, i3);
                if (A0t2 != null) {
                    s73.A06.set(i3, A02(A0t2, "\\^`{|}", 0, A0t2.length(), true, true, true, true));
                }
            }
        }
        String str3 = s73.A01;
        if (str3 != null) {
            s73.A01 = A02(str3, " \"#<>\\^`{|}", 0, str3.length(), true, true, false, false);
        }
        String obj = s73.toString();
        try {
            return new URI(obj);
        } catch (URISyntaxException e) {
            try {
                return URI.create(obj.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw C41845B3m.A0j(e);
            }
        }
    }

    public final ArrayList A0C() {
        String str = this.A04;
        int indexOf = str.indexOf(47, this.A03.length() + 3);
        int A012 = SUS.A01(str, "?#", indexOf, str.length());
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (indexOf < A012) {
            int i = indexOf + 1;
            indexOf = i;
            while (true) {
                if (indexOf < A012) {
                    if (str.charAt(indexOf) == '/') {
                        break;
                    }
                    indexOf++;
                } else {
                    indexOf = A012;
                    break;
                }
            }
            A1C.add(str.substring(i, indexOf));
        }
        return A1C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11427STm) || !((C11427STm) obj).A04.equals(this.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        return this.A04;
    }

    public C11427STm(S73 s73) {
        List list;
        this.A03 = s73.A05;
        String str = s73.A03;
        this.A06 = A01(str, 0, str.length(), false);
        String str2 = s73.A02;
        this.A05 = A01(str2, 0, str2.length(), false);
        this.A02 = s73.A04;
        int i = s73.A00;
        this.A00 = i == -1 ? A00(s73.A05) : i;
        this.A07 = A04(s73.A07, false);
        List list2 = s73.A06;
        String str3 = null;
        if (list2 != null) {
            list = A04(list2, true);
        } else {
            list = null;
        }
        this.A08 = list;
        String str4 = s73.A01;
        this.A01 = str4 != null ? A01(str4, 0, str4.length(), false) : str3;
        this.A04 = s73.toString();
    }

    public static ArrayList A03(String str) {
        String str2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        while (true) {
            int length = str.length();
            if (i > length) {
                return A1C;
            }
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = length;
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                A1C.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                A1C.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            A1C.add(str2);
            i = indexOf + 1;
        }
    }

    public static List A04(List list, boolean z) {
        String str;
        int size = list.size();
        ArrayList A0v = DbS.A0v(size);
        for (int i = 0; i < size; i++) {
            String A19 = AnonymousClass7TE.A19(list, i);
            if (A19 != null) {
                str = A01(A19, 0, A19.length(), z);
            } else {
                str = null;
            }
            A0v.add(str);
        }
        return Collections.unmodifiableList(A0v);
    }
}
