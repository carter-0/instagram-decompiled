package X;

import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class PED implements B1V {
    public final /* synthetic */ DirectAREffectShare A00;
    public final /* synthetic */ AnonymousClass7Z6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ PED(DirectAREffectShare directAREffectShare, AnonymousClass7Z6 r2, String str, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A02 = str;
        this.A00 = directAREffectShare;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A01;
        boolean z = this.A03;
        String str = this.A02;
        DirectAREffectShare directAREffectShare = this.A00;
        1bp r3 = new 1bp(C66669Mac.A05(r0.A00, oDs, AnonymousClass1ez.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r3.A00 = directAREffectShare;
        return r3;
    }
}
