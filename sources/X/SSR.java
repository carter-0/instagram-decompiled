package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class SSR {
    public static SSR A06;
    public static boolean A07;
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final Map A04 = new ConcurrentHashMap();
    public final Set A05 = AnonymousClass7TE.A1F();

    public final void A04(String str) {
        long currentTimeMillis;
        0qQ.A0B(str, 0);
        if (this.A02) {
            currentTimeMillis = System.nanoTime();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        A02(this, str, currentTimeMillis);
    }

    public static final SSR A00() {
        SSR ssr = A06;
        if (ssr != null) {
            return ssr;
        }
        SSR ssr2 = new SSR(A07);
        A06 = ssr2;
        return ssr2;
    }

    public static StringBuilder A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("BLF.plugins.");
        sb.append(str);
        SSR A002 = A00();
        sb.append(".Start");
        A002.A04(002.A0g("BLF.plugins.", str, ".Start"));
        return sb;
    }

    public static final void A02(SSR ssr, String str, long j) {
        if (!ssr.A03 && ssr.A05.add(str)) {
            ssr.A04.put(str, Long.valueOf(j));
        }
    }

    public final void A05(String str, long j) {
        if (this.A02) {
            j = ((j - this.A00) * 1000 * 1000) + this.A01;
        }
        A02(this, str, j);
    }

    public SSR(boolean z) {
        this.A02 = z;
        if (z) {
            this.A01 = System.nanoTime();
            this.A00 = System.currentTimeMillis();
        }
    }

    public static void A03(StringBuilder sb) {
        SSR A002 = A00();
        sb.append(".End");
        A002.A04(sb.toString());
    }
}
