package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.56m  reason: invalid class name and case insensitive filesystem */
public final class C2812456m extends C2811456b {
    public int A00 = 0;
    public AnonymousClass4FJ A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public int A04 = 0;
    public final int A05;
    public final AnonymousClass4FG A06;
    public final List A07;
    public final C2811856g A08;
    public final HashSet A09 = new HashSet();

    public static void A00(C2811456b r2, C2812456m r3) {
        HashSet hashSet = r3.A09;
        if (!hashSet.contains(r2)) {
            hashSet.add(r2);
            r3.A04++;
            r2.A01.remove(r3.A06);
            if (r3.A04 >= r3.A07.size()) {
                r3.A03 = false;
                r3.A03();
                return;
            }
            return;
        }
        throw new RuntimeException("Binding unexpectedly completed twice");
    }

    public static void A01(C2812456m r4) {
        List list = r4.A07;
        ((C2811456b) list.get(r4.A00)).A09(r4.A01);
        int i = r4.A00 + 1;
        r4.A00 = i;
        if (i < list.size()) {
            C2811656e.A02.A02(r4.A08, (long) r4.A05);
        }
    }

    public C2812456m(int i, List list) {
        C382129dC r0;
        this.A05 = i;
        this.A07 = list;
        if (!list.isEmpty()) {
            this.A06 = new AnonymousClass56n(this);
            if (i == 0) {
                r0 = null;
            } else {
                r0 = new C382129dC(this);
            }
            this.A08 = r0;
            return;
        }
        throw new IllegalArgumentException("Empty binding parallel");
    }
}
