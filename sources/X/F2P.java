package X;

import java.util.List;

public final class F2P {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        F2P f2p;
        if (this == obj) {
            return true;
        }
        String str = this.A01;
        String str2 = null;
        if ((obj instanceof F2P) && (f2p = (F2P) obj) != null) {
            str2 = f2p.A01;
        }
        return 0qQ.A0K(str, str2);
    }

    public F2P(String str, String str2, List list, List list2) {
        AnonymousClass7TG.A1O(str, list);
        0qQ.A0B(str2, 4);
        this.A01 = str;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = str2;
    }
}
