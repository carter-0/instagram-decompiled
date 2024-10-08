package X;

import java.util.List;

/* renamed from: X.6Yb  reason: invalid class name and case insensitive filesystem */
public final class C309386Yb extends C252233om {
    public final int A00;
    public final /* synthetic */ 1MJ A01;

    public C309386Yb(1MJ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onDestroy() {
        1MJ r1 = this.A01;
        int i = this.A00;
        1MJ.A00(r1, (List) null, i);
        r1.A03.remove(Integer.valueOf(i));
    }
}
