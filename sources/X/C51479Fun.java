package X;

import android.widget.EditText;
import com.instagram.user.model.User;

/* renamed from: X.Fun  reason: case insensitive filesystem */
public final class C51479Fun implements Runnable {
    public 0SM A00;
    public Dw4 A01;
    public final /* synthetic */ C47678ECn A02;

    public C51479Fun(0SM r1, C47678ECn eCn, Dw4 dw4) {
        this.A02 = eCn;
        this.A01 = dw4;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    public final void run() {
        0SM r2 = this.A00;
        if (r2 != null) {
            r2.A0B(DbV.A0I(this.A02.A00), "feedbackDialog");
        }
        if (this.A01.A02) {
            E3J e3j = this.A02.A00;
            User A0j = DbT.A0j(e3j.A01);
            A0j.A0Z();
            DbT.A1S(e3j.A01, A0j);
            AnonymousClass1Nd.A00(e3j.A01).A00(new Object());
            1Ng A002 = AnonymousClass1Nd.A00(e3j.A01);
            String id = A0j.getId();
            EditText editText = e3j.A00;
            editText.getClass();
            A002.A00(new FWV(id, AnonymousClass7TF.A0f(editText)));
            DbT.A1J(e3j);
        }
    }
}
