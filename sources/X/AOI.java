package X;

import android.app.Activity;
import android.view.View;
import java.util.List;

public final class AOI implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C49694F2e A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public AOI(Activity activity, C49694F2e f2e, String str, List list) {
        this.A01 = f2e;
        this.A02 = str;
        this.A00 = activity;
        this.A03 = list;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(200192179);
        this.A01.A00(this.A00, this.A02);
        AnonymousClass0fD.A0C(751734214, A05);
    }
}
