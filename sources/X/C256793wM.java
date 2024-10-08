package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3wM  reason: invalid class name and case insensitive filesystem */
public final class C256793wM {
    public final long A00;
    public final C256533vv A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final int A00(int i) {
        List list = this.A03;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C256773wK) list.get(i2)).A01 == i) {
                return i2;
            }
        }
        return -1;
    }

    public C256793wM(long j, String str, List list) {
        this((C256533vv) null, str, list, Collections.emptyList(), j);
    }

    public C256793wM(C256533vv r2, String str, List list, List list2, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = Collections.unmodifiableList(list2);
        this.A01 = r2;
    }
}
