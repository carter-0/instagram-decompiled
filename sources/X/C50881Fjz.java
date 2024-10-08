package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjz  reason: case insensitive filesystem */
public final class C50881Fjz implements G6H {
    public final Activity A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final Context A03;

    public C50881Fjz(Context context, UserSession userSession) {
        this.A03 = context;
        this.A02 = userSession;
        this.A00 = (Activity) 0mE.A00(context, Activity.class);
        this.A01 = (FragmentActivity) 0mE.A00(context, FragmentActivity.class);
    }

    public final void CI0(Uri uri, Bundle bundle) {
        C49765F5y.A00();
        Context context = this.A03;
        C50021FJg A002 = C50021FJg.A00(this, 24);
        FJR fjr = FJR.A00;
        0qQ.A0B(fjr, 2);
        FFM.A01(context, A002, fjr);
    }
}
