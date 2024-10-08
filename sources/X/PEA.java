package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class PEA implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ PEA(AnonymousClass7Z6 r1, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r3 = this.A00;
        boolean z = this.A03;
        String str = this.A01;
        String str2 = this.A02;
        return new 1cX(new C376649Iu(str2), (C254933tI) null, C66669Mac.A01(r3.A00, oDs, bool, 1cX.class, "", str, (String) null, z, false), (OCA) null, directThreadKey, l, NetInfoModule.CONNECTION_TYPE_NONE, AnonymousClass7TG.A0H(), false, false);
    }
}
