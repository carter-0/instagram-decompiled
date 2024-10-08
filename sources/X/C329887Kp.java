package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Kp  reason: invalid class name and case insensitive filesystem */
public final class C329887Kp implements View.OnClickListener {
    public final /* synthetic */ C329877Ko A00;

    public C329887Kp(C329877Ko r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(-1226128110);
        C329877Ko r6 = this.A00;
        DirectThreadKey directThreadKey = (DirectThreadKey) r6.A0D.invoke();
        if (directThreadKey == null) {
            i = -1551754344;
        } else {
            Activity activity = r6.A03;
            0nA.A0J(activity);
            NKG nkg = new NKG();
            Bundle bundle = new Bundle();
            bundle.putParcelable(AnonymousClass000.A00(15), directThreadKey);
            nkg.setArguments(bundle);
            C331127Pr r2 = new C331127Pr(r6.A07);
            r2.A0d = r6.A04.getString(2131960270);
            r2.A1G = true;
            r2.A0T = nkg;
            AnonymousClass7L0 r0 = r6.A01;
            if (r0 != null) {
                int i2 = r0.A02;
                r2.A09 = i2;
                r2.A06 = i2;
            }
            r2.A00().A02(activity, nkg);
            i = 1406915994;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
