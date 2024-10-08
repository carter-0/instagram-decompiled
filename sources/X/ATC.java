package X;

import android.content.Context;

public final class ATC implements C343837qt, B30 {
    public final C340427lF A00 = new C340427lF();
    public final C343827qs A01;

    public final C343697qe Ape(C343717qg r2) {
        0qQ.A0B(r2, 0);
        return this.A01.Ape(r2);
    }

    public final C343917r1 Apf(C343937r3 r2) {
        0qQ.A0B(r2, 0);
        return this.A01.Apf(r2);
    }

    public final Object Apu(C343667qb r2) {
        0qQ.A0B(r2, 0);
        return this.A01.Apu(r2);
    }

    public final boolean CQN(C343717qg r2) {
        0qQ.A0B(r2, 0);
        return this.A01.CQN(r2);
    }

    public final boolean CQO(C343937r3 r2) {
        0qQ.A0B(r2, 0);
        return this.A01.CQO(r2);
    }

    public final synchronized void EIx() {
        this.A01.AJF(new C342937pP(this.A00));
    }

    public final void ESb(C342927pO r2, Object obj) {
        0qQ.A0B(r2, 0);
        this.A00.A00.put(r2, obj);
    }

    public final synchronized void destroy() {
        this.A01.release();
    }

    public final synchronized void pause() {
        this.A01.disconnect();
    }

    public final void ACk(String str) {
        if (((C343817qr) this.A01).A07 == 0) {
            throw AnonymousClass7TE.A0z(str);
        }
    }

    public final Object Apt(C342927pO r2) {
        throw AnonymousClass7TE.A0z("ConnectConfigurationKey not supported!");
    }

    public final Context getContext() {
        Context context = this.A01.getContext();
        0qQ.A07(context);
        return context;
    }

    public ATC(C343827qs r2) {
        this.A01 = r2;
    }
}
