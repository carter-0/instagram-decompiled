package X;

import android.content.Context;

/* renamed from: X.FgN  reason: case insensitive filesystem */
public final class C50662FgN implements C3250670x {
    public final Context A00;
    public final C319866rM A01;
    public final C3250770y A02 = C3250770y.OTHER;
    public final String A03;

    public C50662FgN(Context context, C319866rM r3, String str) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = str;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        return AnonymousClass7TE.A16(this.A00, 2131972998);
    }

    public final C3250770y Aiv() {
        return this.A02;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        this.A01.Czc(this.A03);
    }
}
