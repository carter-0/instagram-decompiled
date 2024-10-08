package X;

import java.util.List;

public final class MA6 implements Runnable {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ AnonymousClass7IG A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public MA6(C53401GnY gnY, AnonymousClass7IG r2, Long l, List list, boolean z, boolean z2) {
        this.A01 = r2;
        this.A03 = list;
        this.A04 = z;
        this.A00 = gnY;
        this.A02 = l;
        this.A05 = z2;
    }

    public final void run() {
        AnonymousClass7IG.A02(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }
}
