package X;

import android.content.Context;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.Hqo  reason: case insensitive filesystem */
public final class C55983Hqo {
    public final Context A00;
    public final BitSet A01 = DbS.A0w(3);
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Map A03 = AnonymousClass7TE.A1E();
    public final Map A04 = AnonymousClass7TE.A1E();

    public final void A00(C359628dE r9) {
        if (this.A01.nextClearBit(0) >= 3) {
            C359638dF.A03(this.A00, r9, "com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet", (String) null, C359608dC.A01(this.A04), 0);
            return;
        }
        throw DbU.A0i();
    }

    public C55983Hqo(Context context) {
        this.A00 = context;
    }
}
