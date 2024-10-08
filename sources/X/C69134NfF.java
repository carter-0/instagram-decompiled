package X;

import android.content.Context;
import java.util.PriorityQueue;

/* renamed from: X.NfF  reason: case insensitive filesystem */
public final class C69134NfF extends OTZ {
    public Integer A00 = AnonymousClass05K.A0C;
    public Integer A01;
    public boolean A02;
    public final Context A03;
    public final 0V2 A04;
    public final PriorityQueue A05;

    public static void A01(C69134NfF nfF, Integer num, long j) {
        Integer num2 = num;
        nfF.A02(new N9C(num2, AnonymousClass05K.A00, new String[0], j, false));
    }

    public static final void A00(C69134NfF nfF) {
        Integer num;
        N9C n9c;
        PriorityQueue priorityQueue = nfF.A05;
        N9C n9c2 = (N9C) priorityQueue.peek();
        if (n9c2 != null && (num = n9c2.A02) != null) {
            if (num == AnonymousClass05K.A0C && nfF.A00 != AnonymousClass05K.A00) {
                return;
            }
            if ((!nfF.A02 || O2L.A00(nfF.A01) < O2L.A00(num)) && (n9c = (N9C) priorityQueue.poll()) != null) {
                0V2 r2 = nfF.A04;
                C262224Cq r1 = nfF.A01;
                long currentTimeMillis = System.currentTimeMillis();
                Integer num2 = n9c.A01;
                String[] strArr = n9c.A04;
                Integer num3 = n9c.A02;
                boolean z = n9c.A03;
                DbZ.A0t(0, num2, strArr, num3);
                O28.A00(new N9C(num2, num3, strArr, currentTimeMillis, z), r1, r2);
            }
        }
    }

    public final void A02(N9C n9c) {
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(n9c.A02, AnonymousClass05K.A0C);
        if (this.A00 != AnonymousClass05K.A00) {
            z = false;
        }
        if (A1W || z) {
            this.A05.add(n9c);
        }
        A00(this);
    }

    public C69134NfF(Context context, O9R o9r) {
        super(o9r);
        this.A03 = context;
        Integer num = AnonymousClass05K.A00;
        this.A01 = num;
        this.A05 = new PriorityQueue(10, new C73429PcU(39));
        this.A04 = 10D.A01(num, 0, 0);
    }
}
