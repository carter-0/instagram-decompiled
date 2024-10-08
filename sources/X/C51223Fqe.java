package X;

import android.os.Bundle;

/* renamed from: X.Fqe  reason: case insensitive filesystem */
public final class C51223Fqe implements Runnable {
    public final /* synthetic */ ESP A00;

    public C51223Fqe(ESP esp) {
        this.A00 = esp;
    }

    public final void run() {
        FFR.A03();
        ESP esp = this.A00;
        Bundle requireArguments = esp.requireArguments();
        E6B e6b = new E6B();
        Dbc.A0S(e6b, DbU.A0I(requireArguments, e6b, esp), esp.A05);
    }
}
