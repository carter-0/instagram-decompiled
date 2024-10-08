package X;

import java.util.List;

public final class ARR implements C41791B0u {
    public final /* synthetic */ C39749A7p A00;

    public ARR(C39749A7p a7p) {
        this.A00 = a7p;
    }

    public final C348407yO Coj(C371458yK r14) {
        C39749A7p a7p = this.A00;
        A9C a9c = a7p.A06;
        AH3 ah3 = new AH3(a9c.A03, a9c.A06, "ar_ads_camera");
        a9c.A02 = ah3;
        C63797L7d l7d = a9c.A05;
        ah3.A04 = new C64360Lac(l7d);
        ah3.A03 = l7d.A00;
        AnonymousClass82T r2 = ah3.A07;
        0qQ.A07(r2);
        List list = a9c.A08;
        if (list != null) {
            r2.A01 = new AXO(list);
        }
        AH3 ah32 = a9c.A02;
        if (ah32 == null) {
            0qQ.A0F("renderProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        return new C348407yO(ah32.A01(r14, a9c.A00.A00(C312126dr.A01), (C380949am) null, (B0V) null, (B0W) null, a9c.A07).A00, new C68312N9z(a7p, 0));
    }
}
