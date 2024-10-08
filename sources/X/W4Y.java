package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class W4Y implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public W4Y(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            String str = this.A02;
            0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A01, AnonymousClass000.A00(3378));
            A0e.AAJ("visual_style", AnonymousClass000.A00(268));
            A0e.AAJ("from", "dialog_tap_outside");
            C13988Tno.A1D(A0e, str);
            A0e.Cgf();
            return;
        }
        VA1.A00((UserSession) this.A01).A08("promotion_list", AnonymousClass000.A00(4200), this.A02, (String) null);
    }
}
