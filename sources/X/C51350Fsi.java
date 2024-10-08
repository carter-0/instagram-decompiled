package X;

import android.content.Context;

/* renamed from: X.Fsi  reason: case insensitive filesystem */
public final class C51350Fsi implements Runnable {
    public final /* synthetic */ AnonymousClass3JD A00;
    public final /* synthetic */ NIQ A01;

    public C51350Fsi(AnonymousClass3JD r1, NIQ niq) {
        this.A01 = niq;
        this.A00 = r1;
    }

    public final void run() {
        C250663lr A0U;
        NIQ niq = this.A01;
        if (!niq.mDetached) {
            AnonymousClass3JD r0 = this.A00;
            if (r0 == null || (A0U = C41845B3m.A0U(r0)) == null || !A0U.getCoercedBooleanField(0, C66579MXk.A00(415))) {
                Context context = niq.getContext();
                if (context != null) {
                    C59689JTv.A0F(context, "AI Subscription item deletion", 2131952849);
                    return;
                }
                return;
            }
            DbZ.A17(niq);
        }
    }
}
