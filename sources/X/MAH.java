package X;

import com.instagram.pendingmedia.model.ClipInfo;

public final class MAH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ AnonymousClass7IG A02;
    public final /* synthetic */ C381779cJ A03;
    public final /* synthetic */ ClipInfo A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public MAH(C53401GnY gnY, AnonymousClass7IG r2, C381779cJ r3, ClipInfo clipInfo, Long l, String str, int i, boolean z) {
        this.A02 = r2;
        this.A04 = clipInfo;
        this.A06 = str;
        this.A00 = i;
        this.A07 = z;
        this.A03 = r3;
        this.A01 = gnY;
        this.A05 = l;
    }

    public final void run() {
        AnonymousClass7IA r0 = this.A02.A03;
        ClipInfo clipInfo = this.A04;
        String str = this.A06;
        if (str != null) {
            int i = this.A00;
            boolean z = this.A07;
            r0.Dxz(this.A01, this.A03, clipInfo, this.A05, str, i, z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
