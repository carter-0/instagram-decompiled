package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3VX  reason: invalid class name */
public final class AnonymousClass3VX {
    public C18625VvI A00;
    public final List A01 = new ArrayList();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public final void A04(List list, int i, String str) {
        0qQ.A0B(str, 2);
        String A0O = 002.A0O("Position ", i);
        List list2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(A0O);
        sb.append(' ');
        sb.append(list);
        list2.add(sb.toString());
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void A00(double d) {
        this.A02.put("Elapsed time to insertion", String.valueOf(d));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void A01(double d, int i, int i2, int i3, int i4) {
        Map map = this.A03;
        map.put("Media gap to previous ad", String.valueOf(i));
        map.put("Media gap to previous netego", String.valueOf(i2));
        map.put("Highest position rule", String.valueOf(i3));
        map.put("Min gap to previous item", String.valueOf(i4));
        map.put("Time gap to previous item", String.valueOf(d));
    }

    public final void A02(int i) {
        this.A02.put("Max index seen", String.valueOf(i));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void A03(int i, int i2, int i3) {
        Map map = this.A02;
        map.put("Media gap to previous ad", String.valueOf(i));
        map.put("Media gap to previous netego", String.valueOf(i2));
        map.put("Current viewer position", String.valueOf(i3));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }
}
