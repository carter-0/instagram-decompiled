package X;

import java.util.List;

/* renamed from: X.AdO  reason: case insensitive filesystem */
public final class C40515AdO implements G73 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C254703su A01;
    public final /* synthetic */ 1E8 A02;
    public final /* synthetic */ List A03;

    public final void DoN(1Xj r5) {
        0qQ.A0B(r5, 0);
        int i = this.A00;
        if (i >= 0) {
            List list = this.A03;
            if (i < list.size() && 0qQ.A0K(((AnonymousClass59G) list.get(i)).A00, this.A01)) {
                ((C254703su) ((AnonymousClass59G) list.get(i)).A00).A14(r5);
                this.A02.A03(r5);
            }
        }
    }

    public C40515AdO(C254703su r1, 1E8 r2, List list, int i) {
        this.A00 = i;
        this.A03 = list;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void onFail(String str) {
        0wj.A01.AEf("Failed to fetch direct reshare chaining clips media: $errorMessage", 20135027).report();
    }
}
