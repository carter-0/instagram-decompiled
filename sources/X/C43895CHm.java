package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;

/* renamed from: X.CHm  reason: case insensitive filesystem */
public final class C43895CHm extends 17P implements C46234DRp {
    public C46233DRo A00;
    public 1Xj A01;

    public final C46234DRp E70(1E9 r3) {
        C46233DRo dRo = this.A00;
        if (dRo == null) {
            dRo = (C46233DRo) A05(-1964537064, C43894CHi.class);
        }
        if (dRo != null) {
            dRo.E6z(r3);
        } else {
            dRo = null;
        }
        this.A00 = dRo;
        this.A01 = C41848B3p.A18(r3, this, 700235949);
        return this;
    }

    public final C61092Jx3 F0A(1E9 r14) {
        BDn bDn;
        C46233DRo dRo = this.A00;
        if (dRo == null) {
            dRo = (C46233DRo) A05(-1964537064, C43894CHi.class);
        }
        BI4 bi4 = null;
        if (dRo != null) {
            bDn = dRo.F09(r14);
        } else {
            bDn = null;
        }
        ACRType aCRType = (ACRType) A0N(-772425076, C46039DJw.A00);
        String A0j = A0j(501281532);
        String A0k = A0k(1025801609);
        1Xj A002 = r14.A00(C41848B3p.A18(r14, this, 700235949));
        String A0i = A0i(2106546059);
        String A0j2 = A0j(-153285260);
        String A0j3 = A0j(501699126);
        SmartReelType smartReelType = (SmartReelType) A0N(-357148978, C46040DJx.A00);
        ReelType reelType = (ReelType) A0N(1096874389, C46041DJy.A00);
        DT1 dt1 = (DT1) A05(-2028976363, CQY.class);
        if (dt1 != null) {
            bi4 = dt1.FCy();
        }
        return new C61092Jx3(bDn, aCRType, smartReelType, bi4, A002, reelType, A0j, A0k, A0i, A0j2, A0j3);
    }
}
