package X;

import java.util.concurrent.Callable;

/* renamed from: X.3Fi  reason: invalid class name and case insensitive filesystem */
public final class C239193Fi implements Callable {
    public final /* synthetic */ 1Fc A00;
    public final /* synthetic */ 1HW A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ C239123Fb A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C239193Fi(1Fc r1, 1HW r2, 0lg r3, C239123Fb r4, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str;
        this.A00 = r1;
        this.A04 = str2;
        this.A03 = r4;
        this.A05 = str3;
    }

    public final Object call() {
        1HV r0;
        0lg r3 = this.A02;
        if (182.A06(0Tu.A05, r3, 36311745169457913L)) {
            r0 = new 1HV(r3);
        } else {
            r0 = this.A01;
        }
        1Pq r2 = new 1Pq(r0);
        r2.A02(this.A06);
        r2.A00 = this.A00.A00(true);
        r2.A01(AnonymousClass05K.A01);
        r2.A05 = true;
        r2.A03("x-graphql-client-library", "minimal");
        String str = this.A04;
        if (str.length() > 0) {
            r2.A03("X-FB-Friendly-Name", str);
        }
        AnonymousClass1QT A032 = C239123Fb.A03(this.A03, str);
        String str2 = this.A05;
        if (str2 != null) {
            r2.A03("x-ig-graphql-region-hint", str2);
        }
        return new AnonymousClass1QX(r2.A00(), A032.A00());
    }
}
