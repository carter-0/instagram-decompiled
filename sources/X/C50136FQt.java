package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.FQt  reason: case insensitive filesystem */
public final class C50136FQt implements AnonymousClass2gO {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C227802jw A01;

    public C50136FQt(FragmentActivity fragmentActivity, C227802jw r2) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int i;
        View view;
        C62503Kgt kgt = (C62503Kgt) obj;
        C227802jw r0 = this.A01;
        UserSession A05 = r0.getSession();
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass35N A0H = r0.A0A().A0H();
        0qQ.A0B(A05, 0);
        if (kgt != null) {
            int ordinal = kgt.ordinal();
            if (ordinal == 0) {
                i = 2131975485;
                AnonymousClass35Q r02 = A0H.A0G;
                if (r02 != null) {
                    view = r02.A00;
                } else {
                    return;
                }
            } else if (ordinal == 2) {
                i = 2131975487;
                view = A0H.A0H.A00;
            } else {
                return;
            }
            if (view != null) {
                AnonymousClass5Gt A0V = DbZ.A0V(fragmentActivity, i);
                A0V.A07(C283255Gu.A0A);
                A0V.A08(C283255Gu.A09);
                A0V.A04(view, 0, fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), true);
                A0V.A0B = true;
                A0V.A00 = 5000;
                A0V.A00().A07(A05);
            }
        }
    }
}
