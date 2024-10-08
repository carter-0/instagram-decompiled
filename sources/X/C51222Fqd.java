package X;

import android.os.Bundle;

/* renamed from: X.Fqd  reason: case insensitive filesystem */
public final class C51222Fqd implements Runnable {
    public final /* synthetic */ ESP A00;

    public C51222Fqd(ESP esp) {
        this.A00 = esp;
    }

    public final void run() {
        F3Y A002 = FFR.A00();
        ESP esp = this.A00;
        Bundle bundle = esp.A00;
        if (bundle == null) {
            0qQ.A0F("twoFacResponseBundle");
            throw AnonymousClass00P.createAndThrow();
        } else {
            Dbc.A0S(A002.A00(bundle.getStringArrayList("backup_codes"), esp.A01), esp.requireActivity(), esp.A05);
        }
    }
}
