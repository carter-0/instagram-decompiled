package X;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.4ev  reason: invalid class name and case insensitive filesystem */
public final class C269314ev implements Serializable {
    public static final C269314ev A07 = new C269314ev();
    public final C269324ew A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final Locale A04;
    public final C269334ex A05;
    public transient TimeZone A06;

    public final C269314ev A00(C269314ev r15) {
        TimeZone timeZone;
        C269314ev r6 = r15;
        C269314ev r0 = A07;
        if (r15 == r0 || r15 == this) {
            return this;
        }
        if (this == r0) {
            return r6;
        }
        String str = r15.A02;
        if (str.isEmpty()) {
            str = this.A02;
        }
        C269324ew r8 = r15.A00;
        if (r8 == C269324ew.ANY) {
            r8 = this.A00;
        }
        Locale locale = r15.A04;
        if (locale == null) {
            locale = this.A04;
        }
        C269334ex r7 = this.A05;
        C269334ex r1 = r15.A05;
        int i = r1.A00;
        int i2 = r1.A01;
        if (!(i == 0 && i2 == 0)) {
            int i3 = r7.A01;
            if (!(i3 == 0 && r7.A00 == 0)) {
                int i4 = ((i ^ -1) & i3) | i2;
                int i5 = r7.A00;
                int i6 = i | ((i2 ^ -1) & i5);
                if (!(i4 == i3 && i6 == i5)) {
                    r1 = new C269334ex(i4, i6);
                }
            }
            r7 = r1;
        }
        Boolean bool = r15.A01;
        if (bool == null) {
            bool = this.A01;
        }
        String str2 = r15.A03;
        if (str2 == null || str2.isEmpty()) {
            str2 = this.A03;
            timeZone = this.A06;
        } else {
            timeZone = r15.A06;
        }
        return new C269314ev(r7, r8, bool, str, str2, locale, timeZone);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C269314ev r5 = (C269314ev) obj;
                if (this.A00 == r5.A00 && this.A05.equals(r5.A05)) {
                    Boolean bool = this.A01;
                    Boolean bool2 = r5.A01;
                    if (bool == null) {
                        if (bool2 != null) {
                            return false;
                        }
                    } else if (bool2 == null || !bool.equals(bool2)) {
                        return false;
                    }
                    String str = this.A03;
                    String str2 = r5.A03;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                    if (!this.A02.equals(r5.A02)) {
                        return false;
                    }
                    TimeZone timeZone = this.A06;
                    TimeZone timeZone2 = r5.A06;
                    if (timeZone == null) {
                        if (timeZone2 != null) {
                            return false;
                        }
                    } else if (timeZone2 == null || !timeZone.equals(timeZone2)) {
                        return false;
                    }
                    Locale locale = this.A04;
                    Locale locale2 = r5.A04;
                    return locale == null ? locale2 == null : locale2 != null && locale.equals(locale2);
                }
            }
            return false;
        }
    }

    public final Boolean A01(RDC rdc) {
        C269334ex r2 = this.A05;
        int ordinal = 1 << rdc.ordinal();
        if ((r2.A00 & ordinal) != 0) {
            return Boolean.FALSE;
        }
        if ((ordinal & r2.A01) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final TimeZone A02() {
        TimeZone timeZone = this.A06;
        if (timeZone != null) {
            return timeZone;
        }
        String str = this.A03;
        if (str == null) {
            return null;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str);
        this.A06 = timeZone2;
        return timeZone2;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A03;
        if (str == null) {
            hashCode = 1;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (hashCode ^ this.A02.hashCode()) + this.A00.hashCode();
        Boolean bool = this.A01;
        if (bool != null) {
            hashCode2 ^= bool.hashCode();
        }
        Locale locale = this.A04;
        if (locale != null) {
            hashCode2 += locale.hashCode();
        }
        return hashCode2 ^ this.A05.hashCode();
    }

    public final String toString() {
        return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", new Object[]{this.A02, this.A00, this.A01, this.A04, this.A03, this.A05});
    }

    public C269314ev(C269334ex r1, C269324ew r2, Boolean bool, String str, String str2, Locale locale, TimeZone timeZone) {
        this.A02 = str == null ? "" : str;
        this.A00 = r2 == null ? C269324ew.ANY : r2;
        this.A04 = locale;
        this.A06 = timeZone;
        this.A03 = str2;
        this.A05 = r1;
        this.A01 = bool;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C269314ev() {
        /*
            r8 = this;
            X.4ew r2 = X.C269324ew.ANY
            X.4ex r1 = X.C269334ex.A02
            java.lang.String r4 = ""
            r3 = 0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0019
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r4)
            r5 = r4
        L_0x0013:
            r0 = r8
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0019:
            r6 = r3
            r5 = r3
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269314ev.<init>():void");
    }
}
