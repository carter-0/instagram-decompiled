package X;

import java.util.List;

/* renamed from: X.8bb  reason: invalid class name and case insensitive filesystem */
public final class C358868bb extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C358888bd A03;
    public final C360708f1 A04;
    public final C358928bh A05;
    public final C358938bi A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C358868bb)) {
            return false;
        }
        return 0qQ.A0K(this.A09, ((C358868bb) obj).A09);
    }

    public final int hashCode() {
        return this.A09.hashCode();
    }

    public C358868bb(C358888bd r1, C360708f1 r2, C358928bh r3, C358938bi r4, Integer num, Integer num2, String str, List list, List list2, int i, int i2, int i3, boolean z, boolean z2) {
        this.A09 = str;
        this.A0C = z;
        this.A0D = z2;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = num;
        this.A08 = num2;
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A0A = list;
        this.A0B = list2;
    }
}
