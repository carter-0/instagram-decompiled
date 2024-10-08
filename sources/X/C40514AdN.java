package X;

import java.util.List;

/* renamed from: X.AdN  reason: case insensitive filesystem */
public final class C40514AdN implements G73 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass7YU A01;
    public final /* synthetic */ C254703su A02;

    public final void DoN(1Xj r4) {
        0qQ.A0B(r4, 0);
        List list = (List) this.A01.A09.get(this.A02);
        if (list != null) {
            list.set(this.A00, C295375o3.A02(r4));
        }
    }

    public C40514AdN(AnonymousClass7YU r1, C254703su r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void onFail(String str) {
        0wj.A01.AEf("Failed to fetch direct reshare chaining clips media: $errorMessage", 20135027).report();
    }
}
