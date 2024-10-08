package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6MA  reason: invalid class name */
public final class AnonymousClass6MA implements AnonymousClass6MB {
    public final HashMap A00 = new HashMap();
    public final Context A01;
    public final HashMap A02 = new HashMap();

    public AnonymousClass6MA(Context context, AnonymousClass6M6 r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r4, 2);
        this.A01 = context;
        A00("story_width", r4.A0F);
        A00("story_height", r4.A0E);
    }

    public final void A01(String str, String str2) {
        0qQ.A0B(str2, 1);
        this.A02.put(str, str2);
    }

    public final void A00(String str, int i) {
        A01(str, String.valueOf(Math.round(0nA.A01(this.A01, (float) i))));
    }

    public final Map B2b() {
        return new HashMap();
    }

    public final Map BLs() {
        return this.A02;
    }

    public final Map BN6() {
        return this.A00;
    }
}
