package X;

import android.content.Context;

/* renamed from: X.R9p  reason: case insensitive filesystem */
public final class C8788R9p extends 0ng {
    public final /* synthetic */ 1Lw A00;

    public final void run() {
        Context context = C60960kU.A00;
        if (context != null) {
            context.getSharedPreferences("ig_connection_type", 0).edit().putString("last_type", this.A00.A01).commit();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8788R9p(1Lw r2) {
        super(1521204412);
        this.A00 = r2;
    }
}
