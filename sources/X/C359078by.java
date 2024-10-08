package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.8by  reason: invalid class name and case insensitive filesystem */
public final class C359078by implements AnonymousClass2Zd {
    public final /* synthetic */ C359068bx A00;

    public final void DFp(AnonymousClass3Q2 r8) {
        C53401GnY gnY;
        0qQ.A0B(r8, 0);
        if (r8.A0E() == ShareType.QUICKSNAP) {
            1Xj r6 = r8.A1C;
            C359068bx r5 = this.A00;
            1Ng A002 = AnonymousClass1Nd.A00(r5.A00);
            if (r6 != null) {
                gnY = new C53401GnY(r6, r5.A02, (String) null, 12);
            } else {
                gnY = null;
            }
            A002.A00(new C64678Lg4(gnY, r5, r8.A3t));
        }
    }

    public final /* synthetic */ void DQx(AnonymousClass3Q2 r1) {
    }

    public C359078by(C359068bx r1) {
        this.A00 = r1;
    }
}
