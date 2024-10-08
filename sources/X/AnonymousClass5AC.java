package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: X.5AC  reason: invalid class name */
public final class AnonymousClass5AC implements Serializable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final AnonymousClass5AB A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final String toString() {
        Locale locale;
        Object[] objArr;
        String str;
        AnonymousClass5AB r5 = this.A09;
        switch (r5.ordinal()) {
            case 0:
            case 1:
                locale = Locale.US;
                String str2 = this.A0E;
                String str3 = this.A0D;
                String name = r5.name();
                String str4 = this.A0C;
                String str5 = this.A0B;
                long j = this.A05;
                objArr = new Object[]{str2, str3, name, str4, str5, Long.valueOf(j), Long.valueOf(j + this.A02)};
                str = "[%s][%s][%s][%s] - %s [%d, %d] - [%s]";
                break;
            case 2:
                long j2 = this.A05;
                long j3 = this.A04;
                if (j2 == j3) {
                    long j4 = this.A02;
                    if (j4 == this.A03) {
                        locale = Locale.US;
                        objArr = new Object[]{this.A0B, Long.valueOf(j2), Long.valueOf(j2 + j4)};
                        str = "[SPAN HIT] - %s [%d, %d]";
                        break;
                    }
                }
                locale = Locale.US;
                objArr = new Object[]{this.A0B, Long.valueOf(j2), Long.valueOf(j2 + this.A02), Long.valueOf(j3), Long.valueOf(j3 + this.A03)};
                str = "[SPAN_TOUCHED] - %s [%d, %d],[%d,%d]";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                locale = Locale.US;
                objArr = new Object[]{this.A0D, r5, Pair.create(Long.valueOf(this.A07), Long.valueOf(this.A06)), Pair.create(Long.valueOf(this.A01), Long.valueOf(this.A00))};
                str = "[%s][%s] Requested %s, cached %s";
                break;
            default:
                return "Unknown. Err-roar";
        }
        return String.format(locale, str, objArr);
    }

    public AnonymousClass5AC(AnonymousClass5AB r3, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, long j4) {
        this.A09 = r3;
        this.A0E = str;
        this.A0D = str2;
        this.A0B = str3;
        this.A05 = j;
        this.A02 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A0A = str4;
        this.A07 = 0;
        this.A06 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A08 = System.currentTimeMillis();
        this.A0C = str5;
    }

    public AnonymousClass5AC(Pair pair, AnonymousClass5AB r8, String str, String str2, String str3, String str4, long j, long j2) {
        long longValue;
        this.A09 = r8;
        this.A0E = str;
        this.A0D = str2;
        this.A0B = str3;
        this.A07 = j;
        this.A06 = j2;
        long j3 = -1;
        if (pair == null) {
            longValue = -1;
        } else {
            longValue = ((Number) pair.first).longValue();
        }
        this.A01 = longValue;
        this.A00 = pair != null ? ((Number) pair.second).longValue() : j3;
        this.A05 = 0;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = null;
        this.A08 = System.currentTimeMillis();
        this.A0C = str4;
    }
}
