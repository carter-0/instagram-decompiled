package X;

import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.SNb  reason: case insensitive filesystem */
public final class C11325SNb {
    public final double A00;
    public final double A01;
    public final double A02;
    public final int A03;
    public final 1Uk A04;

    public static final S35 A00(String str) {
        List A0R = 00l.A0R(str, new String[]{"/"}, 0);
        if (A0R.size() != 6) {
            return null;
        }
        return new S35(AnonymousClass7TE.A19(A0R, 0), DbU.A0t(A0R, 1), Pxg.A0J(A0R, 2), Pxg.A0J(A0R, 3), Boolean.parseBoolean(AnonymousClass7TE.A19(A0R, 4)), Boolean.parseBoolean(AnonymousClass7TE.A19(A0R, 5)));
    }

    public C11325SNb(1Uf r2, double d, double d2, double d3, int i) {
        this.A03 = i;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        1Uk A002 = r2.A00("ig_video_cache_store");
        0qQ.A07(A002);
        this.A04 = A002;
    }

    public static final void A01(1W3 r4, List list, int i) {
        if (list.size() >= i) {
            PriorityQueue priorityQueue = new PriorityQueue(list.size(), new C13113TLw(14));
            priorityQueue.addAll(list);
            int A022 = DbT.A02(list, i);
            for (int i2 = 0; i2 < A022; i2++) {
                S35 s35 = (S35) priorityQueue.remove();
                if (s35 != null) {
                    r4.A06(s35.A03);
                }
            }
        }
    }
}
