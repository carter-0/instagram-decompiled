package X;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;

public final class FHY implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FHY(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 2:
                ((Activity) this.A02).runOnUiThread(new TBB(this));
                return;
            case 3:
                FFL.A02((C48152EZu) this.A02, ((C49695F2f) this.A03).A04, AnonymousClass000.A00(1914), (HashMap) this.A01, 3);
                return;
            default:
                Object obj = this.A02;
                DbX.A1O((C307896Rx) this.A03, DbS.A0P(), (C277014uI) this.A01, obj);
                return;
        }
    }
}
