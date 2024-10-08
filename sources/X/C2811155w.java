package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.55w  reason: invalid class name and case insensitive filesystem */
public final class C2811155w implements View.OnLongClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass35R A01;

    public C2811155w(UserSession userSession, AnonymousClass35R r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Twa, java.lang.Object] */
    public final boolean onLongClick(View view) {
        if (1pR.A00 == null) {
            return false;
        }
        FragmentActivity fragmentActivity = this.A01.A01;
        if (!AnonymousClass06S.A01(fragmentActivity.getSupportFragmentManager())) {
            return false;
        }
        UserSession userSession = this.A00;
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        C14398TvR.A00();
        r1.A0D(new Object().A03(userSession));
        r1.A0A = "composite_search_back_stack";
        r1.A04();
        return true;
    }
}
