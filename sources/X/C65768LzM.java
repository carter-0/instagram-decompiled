package X;

import java.util.List;

/* renamed from: X.LzM  reason: case insensitive filesystem */
public final class C65768LzM implements JOZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C53401GnY A02;
    public final /* synthetic */ K6K A03;
    public final /* synthetic */ C381779cJ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C65768LzM(C53401GnY gnY, K6K k6k, C381779cJ r3, int i, long j, boolean z, boolean z2) {
        this.A03 = k6k;
        this.A06 = z;
        this.A00 = i;
        this.A04 = r3;
        this.A02 = gnY;
        this.A01 = j;
        this.A05 = z2;
    }

    public final void DQB(List list) {
        C66484MTn mTn = this.A03.A0D;
        if (mTn != null) {
            List A002 = C63113Krh.A00(list);
            boolean z = this.A06;
            int i = this.A00;
            mTn.EMf(this.A02, this.A04, A002, i, this.A01, z, this.A05);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
