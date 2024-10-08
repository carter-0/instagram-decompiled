package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FJq  reason: case insensitive filesystem */
public final class C50031FJq implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C50031FJq(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            EM8.A01((UserSession) this.A03, (EM8) this.A01, (User) this.A02);
            return;
        }
        EMI.A01((UserSession) this.A02, (EMI) ((C50535Fdv) this.A01).A01, (User) this.A03);
    }
}
