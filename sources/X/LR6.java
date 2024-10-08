package X;

import java.util.List;

public final class LR6 {
    public String A00;
    public final String A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final String toString() {
        return this.A01;
    }

    public LR6(String str) {
        this.A01 = str;
    }

    public LR6(String str, List list) {
        this.A01 = str;
        0qQ.A0B(list, 0);
        List list2 = this.A02;
        list2.clear();
        for (Object next : list) {
            0qQ.A0B(next, 0);
            list2.add(next);
        }
    }

    public LR6(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
