package X;

import android.app.Activity;
import android.view.View;

public final class FLH implements View.OnClickListener {
    public final /* synthetic */ C66633Ma2 A00;

    public FLH(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(49785336);
        Activity rootActivity = this.A00.A1J.getRootActivity();
        if (rootActivity != null) {
            rootActivity.onBackPressed();
            AnonymousClass0fD.A0C(-1571736817, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-1408870846, A05);
        throw A0y;
    }
}
