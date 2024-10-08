package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3Dx  reason: invalid class name and case insensitive filesystem */
public final class C238913Dx extends C249383je {
    public long A00;
    public T7F A01;
    public AnonymousClass1FE A02;
    public C2370236a A03;
    public long A04;

    public final void onScroll(C238133Ar r9, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-282287672);
        long now = this.A02.now();
        long abs = this.A00 + ((long) Math.abs(i5));
        this.A00 = abs;
        C2370236a r6 = this.A03;
        double d = (((double) abs) * 1.0d) / ((double) (now - this.A04));
        synchronized (r6) {
            r6.A00 = d;
        }
        AnonymousClass0fD.A0A(1390822469, A032);
    }

    public final void onScrollStateChanged(C238133Ar r8, int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-1737101365);
        if (i == 1 || i == 2) {
            this.A04 = this.A02.now();
            this.A00 = 0;
        } else if (i == 0) {
            T7F t7f = this.A01;
            if (t7f != null) {
                long j = this.A00;
                List list = t7f.A03;
                if (list.size() < 200 && (i2 = (int) j) > 0) {
                    list.add(Integer.valueOf(i2));
                    t7f.A00++;
                }
            }
            C2370236a r2 = this.A03;
            synchronized (r2) {
                LinkedList linkedList = r2.A03;
                if (!linkedList.isEmpty() && linkedList.getLast() != null && ((String) linkedList.getLast()).startsWith("MainFeedFragment.scrollToTopWithReason")) {
                    r2.A03("MainFeedFragment.scrollToTopFinished");
                }
            }
        }
        AnonymousClass0fD.A0A(2056838202, A032);
    }
}
