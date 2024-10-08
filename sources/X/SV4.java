package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class SV4 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public SV4(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                activity = (Activity) this.A02;
                runnable = new TBC(this);
                break;
            case 1:
                activity = (Activity) this.A02;
                runnable = new TBD(this);
                break;
            case 2:
                Context context = (Context) this.A01;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                SCX.A00(context);
                C11423SSz A002 = Ri1.A00((UserSession) this.A02);
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = A002.A03.AR4();
                AR4.E5c("browser_last_clear_date_key", currentTimeMillis);
                AR4.apply();
                C59689JTv.A07(context, 2131954289);
                ((S3Q) this.A03).A05.invoke();
                return;
            default:
                dialogInterface.getClass();
                2EG r3 = 2EG.A1y;
                C11242SHc sHc = ((S3Q) this.A03).A03;
                FH7.A08((FragmentActivity) this.A01, (UserSession) this.A02, r3, "https://help.instagram.com/519522125107875", sHc.A02);
                C11242SHc.A00(sHc, "settings_data_policy_clicked", (String) null);
                return;
        }
        activity.runOnUiThread(runnable);
    }
}
