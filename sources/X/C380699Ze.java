package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;

/* renamed from: X.9Ze  reason: invalid class name and case insensitive filesystem */
public final class C380699Ze extends C344467ru implements B3T {
    public C392139uH A00;
    public C41786B0p A01;
    public final C312136ds A02 = new ATU(this);

    public final void A0A(C371458yK r4) {
        C348407yO r1;
        if (this.A01 == null) {
            this.A01 = (C41786B0p) ((B3S) C343837qt.A00(this, B3S.A00));
        }
        C345167t2 r2 = (C345167t2) C343837qt.A00(this, C345167t2.A01);
        if (r4 != null) {
            C41786B0p b0p = this.A01;
            0qQ.A0A(b0p);
            r1 = b0p.AJp(r4);
        } else {
            r1 = new C348407yO((C371298xy) null, (AnonymousClass82G) null);
        }
        r2.Ddr(r1);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.9uH] */
    public final void EUn(ARRequestAsset aRRequestAsset, C371518yX r12, C41808B1n b1n, C352728Ep r14, String str) {
        if (str != null) {
            ARRequestAsset aRRequestAsset2 = aRRequestAsset;
            if (aRRequestAsset != null) {
                C392139uH r7 = this.A00;
                C392139uH r72 = r7;
                if (r7 == null) {
                    C312426eP B3i = ((B3S) C343837qt.A00(this, B3S.A00)).B3i();
                    0qQ.A07(B3i);
                    C312136ds r0 = this.A02;
                    ? obj = new Object();
                    obj.A00 = B3i;
                    obj.A01 = r0;
                    this.A00 = obj;
                    r72 = obj;
                }
                0qQ.A0A(r72);
                if (r72 != null) {
                    AQR aqr = new AQR(r12, b1n, this, str);
                    C39831ABc aBc = C39831ABc.A00;
                    C312426eP r02 = r72.A00;
                    AQH aqh = new AQH(aqr, aRRequestAsset2, r72, aBc, r14);
                    C312136ds r3 = r72.A01;
                    C312676ew r2 = r02.A00;
                    r2.A0A.execute(new AnonymousClass84Z(aqh, r2, r3));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        b1n.Cst(str);
        A0A((C371458yK) null);
    }

    public C380699Ze(C343837qt r2) {
        this.A00 = r2;
    }
}
