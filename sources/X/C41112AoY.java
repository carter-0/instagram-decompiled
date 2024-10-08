package X;

import java.util.List;

/* renamed from: X.AoY  reason: case insensitive filesystem */
public final class C41112AoY implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C369008tg A01;
    public final /* synthetic */ A3N A02;

    public C41112AoY(C369008tg r1, A3N a3n, long j) {
        this.A02 = a3n;
        this.A00 = j;
        this.A01 = r1;
    }

    public final void run() {
        long j;
        AJ3 aj3 = this.A02.A00;
        if (aj3.A05 == -1) {
            aj3.A05 = this.A00;
            C342057ny.A00(new C41016An0(aj3.A0P, aj3.A0R));
        }
        List list = aj3.A0T;
        if (list.size() <= 35) {
            list.add(this.A01);
        }
        long j2 = this.A00 - aj3.A05;
        if (!aj3.A0Y) {
            AnonymousClass8HX r4 = aj3.A0P;
            String str = aj3.A0R;
            if (aj3.A0W) {
                j = 1000000000;
            } else {
                j = 1800000000;
            }
            C342057ny.A00(new C41211Aq9(r4, str, j2, j));
        }
    }
}
