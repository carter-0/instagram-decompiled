package X;

import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class WVb implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ InfoCenterFactShareInfoIntf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ WVb(AnonymousClass7Z6 r1, InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = infoCenterFactShareInfoIntf;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf = this.A01;
        1bp r3 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65601ee.class, str, z), directThreadKey, l, System.currentTimeMillis() * 1000);
        InfoCenterFactShareInfo infoCenterFactShareInfo = (InfoCenterFactShareInfo) infoCenterFactShareInfoIntf;
        r3.A03 = infoCenterFactShareInfo.A00;
        r3.A08 = infoCenterFactShareInfo.A0A;
        r3.A09 = infoCenterFactShareInfo.A0B;
        r3.A0B = infoCenterFactShareInfo.A0G;
        r3.A0A = infoCenterFactShareInfo.A0F;
        r3.A05 = infoCenterFactShareInfo.A07;
        r3.A00 = infoCenterFactShareInfoIntf.BCg();
        r3.A01 = infoCenterFactShareInfoIntf.Ale();
        r3.A07 = infoCenterFactShareInfo.A09;
        r3.A04 = infoCenterFactShareInfo.A01;
        r3.A06 = infoCenterFactShareInfo.A08;
        r3.A02 = infoCenterFactShareInfoIntf;
        return r3;
    }
}
