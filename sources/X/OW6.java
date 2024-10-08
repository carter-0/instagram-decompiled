package X;

import java.util.ArrayList;
import java.util.List;

public final class OW6 {
    public int A00;
    public int A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OW6(android.content.Context r7, com.instagram.common.session.UserSession r8, X.AnonymousClass2Ep r9, java.util.List r10, int r11, boolean r12) {
        /*
            r6 = this;
            r0 = 4
            X.0qQ.A0B(r10, r0)
            java.lang.String r1 = X.AnonymousClass48N.A07(r7, r8, r9)
            X.0qQ.A07(r1)
            java.util.ArrayList r2 = X.C271384il.A04(r7, r8, r9, r10)
            java.util.List r3 = r9.BRZ()
            r0 = r6
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OW6.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2Ep, java.util.List, int, boolean):void");
    }

    public final C68167N3h A00() {
        return (C68167N3h) this.A03.get(this.A00);
    }

    public final C68167N3h A01(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.A03;
        if (i < list.size()) {
            return (C68167N3h) list.get(i);
        }
        return null;
    }

    public OW6(String str, List list, List list2, int i, boolean z) {
        this.A02 = str;
        this.A05 = z;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A03 = A1C;
        A1C.addAll(list);
        this.A01 = i;
        this.A04 = AnonymousClass7TE.A1D(list2);
        this.A00 = 0;
    }
}
