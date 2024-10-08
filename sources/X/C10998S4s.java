package X;

import android.content.Context;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.S4s  reason: case insensitive filesystem */
public final class C10998S4s {
    public final Context A00;
    public final BitSet A01 = DbS.A0w(3);
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Map A03 = AnonymousClass7TE.A1E();
    public final Map A04 = AnonymousClass7TE.A1E();

    public final void A00(String str) {
        this.A04.put("ad_id", str);
        this.A01.set(0);
    }

    public final void A01(String str) {
        this.A04.put("tracking_token", str);
        this.A01.set(2);
    }

    public C10998S4s(Context context) {
        this.A00 = context;
    }
}
