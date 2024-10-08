package X;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class SP8 {
    public static final Pattern A09 = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern A0A = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern A0B = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final Pattern A0C = Pattern.compile("(\\d{2,4})[^\\d]*");
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        if (r1 > r0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        if (r1 == ':') goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r1 == 9) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0013 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014 A[LOOP:0: B:0:0x0000->B:9:0x0014, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.String r2, int r3, int r4, boolean r5) {
        /*
        L_0x0000:
            if (r3 >= r4) goto L_0x0039
            char r1 = r2.charAt(r3)
            r0 = 32
            if (r1 >= r0) goto L_0x0017
            r0 = 9
            if (r1 != r0) goto L_0x0037
        L_0x000e:
            r1 = 0
        L_0x000f:
            r0 = r5 ^ 1
            if (r1 != r0) goto L_0x0014
            return r3
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x0000
        L_0x0017:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L_0x0037
            r0 = 48
            if (r1 < r0) goto L_0x000e
            r0 = 57
            if (r1 <= r0) goto L_0x0037
            r0 = 97
            if (r1 < r0) goto L_0x002c
            r0 = 122(0x7a, float:1.71E-43)
        L_0x0029:
            if (r1 <= r0) goto L_0x0037
            goto L_0x000e
        L_0x002c:
            r0 = 65
            if (r1 < r0) goto L_0x0033
            r0 = 90
            goto L_0x0029
        L_0x0033:
            r0 = 58
            if (r1 != r0) goto L_0x000e
        L_0x0037:
            r1 = 1
            goto L_0x000f
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP8.A00(java.lang.String, int, int, boolean):int");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SP8)) {
            return false;
        }
        SP8 sp8 = (SP8) obj;
        if (sp8.A02.equals(this.A02) && sp8.A04.equals(this.A04) && sp8.A01.equals(this.A01) && sp8.A03.equals(this.A03) && sp8.A00 == this.A00 && sp8.A08 == this.A08 && sp8.A06 == this.A06 && sp8.A07 == this.A07 && sp8.A05 == this.A05) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((C51972G9s.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A04, C66583MXo.A06(this.A02))))) + (this.A08 ^ true ? 1 : 0)) * 31) + (this.A06 ^ true ? 1 : 0)) * 31) + (this.A07 ^ true ? 1 : 0)) * 31) + (this.A05 ^ true ? 1 : 0);
    }

    public SP8(String str, String str2, String str3, String str4, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A01 = str3;
        this.A03 = str4;
        this.A08 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
    }

    public final String toString() {
        String format;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A02);
        A1A.append('=');
        A1A.append(this.A04);
        if (this.A07) {
            long j = this.A00;
            if (j == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                A1A.append("; expires=");
                format = ((DateFormat) C10047Rlk.A00.get()).format(new Date(j));
            }
            A1A.append(format);
        }
        if (!this.A05) {
            A1A.append("; domain=");
            A1A.append(this.A01);
        }
        A1A.append("; path=");
        A1A.append(this.A03);
        if (this.A08) {
            A1A.append("; secure");
        }
        if (this.A06) {
            A1A.append("; httponly");
        }
        return A1A.toString();
    }
}
