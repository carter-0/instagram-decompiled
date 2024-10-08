package X;

import android.view.View;
import java.util.Map;

public final class UlN extends OJ1 {
    public final /* synthetic */ C15570Uey A00;

    public UlN(C15570Uey uey) {
        this.A00 = uey;
    }

    public final void A00(View view, C296995qz r13, C296905qq r14, 1Xj r15) {
        VOS vos = this.A00.A00.A00.A02;
        String id = r15.getId();
        C15387Ubm ubm = vos.A00;
        C15387Ubm.A02(ubm);
        0xF r3 = new 0xF();
        0xF.A00(r3, ubm.A02.A00.A01.getId(), "profile_id");
        C15387Ubm.A01(ubm).A02((0xF) null, r3, "information_page", "tap_profile", "media", ubm.A06, ubm.A05, id, (Map) null);
    }
}
