package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Sl3  reason: case insensitive filesystem */
public final class C12042Sl3 implements C297755sH {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ Object AUg(Object obj, AnonymousClass4D7 r8) {
        C241503Pl A0m = JTQ.A0m(r8);
        2IS A04 = C41845B3m.A04();
        boolean A1Z = C41848B3p.A1Z(A04, "encoded_token", (String) obj);
        A04.A04("item_capability", "DA");
        A04.A04("target_platform", "INSTAGRAM_ADS");
        17k.A0E(A1Z);
        C239113Fa r4 = new C239113Fa(A04, C7598QNo.class, "InstagramAREffectMetadataQuery", false);
        C363088j4.A00(this.A00).ATL(new C12090Smk((Object) A0m, 1), new C12094Smo(1, this, A0m), r4);
        return A0m.A00();
    }

    public C12042Sl3(UserSession userSession) {
        this.A00 = userSession;
    }
}
