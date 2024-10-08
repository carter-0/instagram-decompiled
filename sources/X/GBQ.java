package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class GBQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final Activity A06;
    public final AnonymousClass2T3 A07;
    public final C227182im A08;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2T3, java.lang.Object] */
    public GBQ(Activity activity, Context context, UserSession userSession, boolean z) {
        int A012;
        int A002;
        int i;
        int i2;
        int i3;
        this.A06 = activity;
        0Tu r2 = 0Tu.A05;
        if (1AW.A06(r2, 18303505643083402L) || 182.A06(r2, userSession, 36317929922369171L)) {
            A012 = AnonymousClass0nB.A01(context);
            A002 = AnonymousClass0nB.A00(context);
        } else {
            A012 = 0nA.A06(context);
            A002 = 0nA.A05(context);
        }
        ? obj = new Object();
        obj.A01 = A012;
        obj.A00 = A002;
        this.A07 = obj;
        int i4 = 0;
        if (C226122ff.A03()) {
            i = C226122ff.A01();
        } else {
            i = 0;
        }
        this.A03 = i;
        if (C226122ff.A03()) {
            i2 = C226122ff.A00();
        } else {
            i2 = 0;
        }
        this.A02 = i2;
        if (z) {
            i3 = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        } else {
            i3 = 0;
        }
        this.A04 = i3;
        i4 = !(activity instanceof ModalActivity) ? 2Yu.A0G(activity.getApplicationContext(), 0Pn.A01(userSession)) : i4;
        this.A05 = i4;
        this.A01 = obj.A01;
        this.A00 = obj.A00 - (((i4 + this.A04) + this.A03) + this.A02);
        this.A08 = new C57426IaW(this, 0);
    }
}
