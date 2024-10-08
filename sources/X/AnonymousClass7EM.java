package X;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7EM  reason: invalid class name */
public final class AnonymousClass7EM implements C328007Db {
    public boolean A00;
    public final Activity A01;
    public final UserSession A02;
    public final C252063oV A03;
    public final C333107Xr A04;

    public final void A01(C376679Ix r5) {
        C252063oV r2 = this.A03;
        r2.setVisibility(0);
        r2.getView().setBackgroundColor(r5.A01);
        ((ImageView) r2.getView()).setImageTintList(ColorStateList.valueOf(r5.A02));
        AnonymousClass0fU.A00(new AnonymousClass9O7(r5, this), r2.getView());
        String str = r5.A04;
        if (str != null && !this.A00) {
            this.A00 = true;
            r2.getView().postDelayed(new C41083Ao5(this, str), 500);
        }
    }

    public final void A00() {
        C252063oV r1 = this.A03;
        r1.setVisibility(8);
        if (r1.CVM()) {
            r1.getView().setOnClickListener((View.OnClickListener) null);
        }
    }

    public final View BJd() {
        return this.A03.getView();
    }

    public AnonymousClass7EM(Activity activity, UserSession userSession, C252063oV r3, C333107Xr r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = activity;
        this.A02 = userSession;
    }
}
