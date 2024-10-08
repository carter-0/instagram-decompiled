package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Rs  reason: invalid class name and case insensitive filesystem */
public final class C378919Rs {
    public final long A00;
    public final C359218cI A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C378919Rs(C359218cI r2, String str, String str2, String str3, List list, long j, boolean z) {
        0qQ.A0B(list, 3);
        this.A02 = str;
        this.A01 = r2;
        this.A05 = list;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = z;
    }

    public final ArrayList A00() {
        String str = this.A02;
        List A1I = AnonymousClass7TE.A1I(str);
        List list = this.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!0qQ.A0K(next, str)) {
                A1C.add(next);
            }
        }
        return 00k.A0S(A1C, A1I);
    }
}
