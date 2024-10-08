package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68w  reason: invalid class name and case insensitive filesystem */
public final class C3034568w {
    public boolean A00;
    public final int A01 = hashCode();
    public final long A02;
    public final QuickPerformanceLogger A03;
    public final C338617iF A04;
    public final C2595542d A05;

    public static final void A00(C3034568w r4, long j) {
        C2595542d r0 = r4.A05;
        0qQ.A07(String.format("[%s] %4dms;", Arrays.copyOf(new Object[]{r0.A05, Long.valueOf(j - r0.A00)}, 2)));
    }

    public static final void A01(List list) {
        String str;
        Number number;
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3254272i r2 = (C3254272i) it.next();
            AnonymousClass9IL r0 = r2.A01;
            if (!(r0 == null || (number = (Number) r0.A02) == null)) {
                int intValue = number.intValue();
                if (intValue == 0) {
                    str = "✅";
                } else if (intValue == 1) {
                    str = "❌";
                } else if (intValue == 2) {
                    str = "⚫";
                }
                sb.append(str);
            }
            if (r2.A04) {
                str = "🟡";
            } else {
                str = "⚪";
            }
            sb.append(str);
        }
        sb.append("]");
        0qQ.A07(sb.toString());
    }

    public C3034568w(C338617iF r5, C2595542d r6) {
        this.A05 = r6;
        this.A04 = r5;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A03 = r0;
        this.A02 = r6.A00 - 3000;
    }
}
