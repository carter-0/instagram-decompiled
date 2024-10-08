package X;

import android.os.Bundle;

/* renamed from: X.Fup  reason: case insensitive filesystem */
public final class C51481Fup implements Runnable {
    public final /* synthetic */ FBN A00;
    public final /* synthetic */ C50882Fk0 A01;
    public final /* synthetic */ String A02;

    public C51481Fup(FBN fbn, C50882Fk0 fk0, String str) {
        this.A01 = fk0;
        this.A02 = str;
        this.A00 = fbn;
    }

    public final void run() {
        C50882Fk0 fk0 = this.A01;
        C309516Yo A0J = DbY.A0J(fk0.A02, fk0.A04);
        C47448E2u e2u = new C47448E2u();
        String str = this.A02;
        0qQ.A0A(str);
        Bundle A002 = FBN.A00(this.A00);
        Dbc.A0L(A002, (String) null, (String) null, str, false);
        C48975EnD.A00(A002, EVZ.ARGUMENT_EDIT_PROFILE_FLOW);
        A002.putBoolean("HAS_SMS_CONSENT", false);
        A0J.A0B(A002, e2u);
        A0J.A04();
    }
}
