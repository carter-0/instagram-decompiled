package X;

import android.graphics.RectF;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public final class S3Y {
    public long A00;
    public SelfieEvidence A01;
    public S4B A02;
    public ImmutableList A03;
    public Integer A04 = AnonymousClass05K.A00;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final RectF A09;
    public final QCN A0A;
    public final C10419Rrv A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;

    public S3Y(RectF rectF, QCN qcn, Integer num, String str, String str2, Collection collection, int i, long j) {
        AnonymousClass7TF.A1E(collection, 5, num);
        this.A0A = qcn;
        this.A0D = str;
        this.A08 = j;
        this.A0E = str2;
        if (!collection.isEmpty()) {
            this.A03 = ImmutableList.copyOf(collection);
        }
        this.A0B = new C10419Rrv(collection);
        this.A07 = i;
        this.A0C = num;
        this.A09 = rectF;
    }

    public final void A00() {
        String str = this.A0D;
        if (str != null) {
            SQQ.A01(str);
        }
        this.A05 = false;
        String str2 = this.A0E;
        if (str2 != null) {
            SQQ.A01(str2);
        }
        this.A06 = false;
        C10419Rrv rrv = this.A0B;
        PriorityQueue priorityQueue = rrv.A01;
        Iterator A1G = AnonymousClass7TE.A1G(priorityQueue);
        while (A1G.hasNext()) {
            rrv.A00.add(((C10418Rru) A1G.next()).A01);
        }
        priorityQueue.clear();
        Iterator it = rrv.A00.iterator();
        while (it.hasNext()) {
            SQQ.A01(AnonymousClass7TE.A18(it));
        }
    }
}
