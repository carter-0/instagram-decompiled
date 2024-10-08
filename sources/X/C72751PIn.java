package X;

import android.content.Context;

/* renamed from: X.PIn  reason: case insensitive filesystem */
public final class C72751PIn implements AnonymousClass5IX {
    public final Context A00;
    public final boolean A01;

    public final boolean E1z(AnonymousClass5IY r4) {
        OUW ouw = OUW.A00;
        Context context = this.A00;
        if (ouw.A00(context) || new 1Fs(context).A00.areNotificationsEnabled() != this.A01) {
            return false;
        }
        return true;
    }

    public C72751PIn(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
