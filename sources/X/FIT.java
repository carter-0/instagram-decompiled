package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.direct.stella.permission.StellaPermissionActivity;

public final class FIT implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public FIT(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C357068Wi.A02((C357068Wi) this.A01, this.A03, this.A02);
                return;
            case 1:
                String str = this.A03;
                String str2 = this.A02;
                AnonymousClass0cT r0 = StellaPermissionActivity.A01;
                O0B.A00(str, str2);
                Dba.A0k((Activity) this.A01, DbS.A09());
                return;
            default:
                EEM eem = (EEM) this.A01;
                String str3 = this.A02;
                Dba.A0q(eem.A04, eem.A08, new C11225SFz(str3), this.A03);
                return;
        }
    }
}
