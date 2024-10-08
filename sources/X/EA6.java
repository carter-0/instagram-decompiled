package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EA6 extends C231632rz {
    public final UserSession A00;
    public final E35 A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EA6(UserSession userSession, E35 e35) {
        this.A00 = userSession;
        this.A01 = e35;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-1297744938);
        if (view == null) {
            i2 = 170133023;
        } else {
            if (obj != null) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.viewbinder.AvailableBannersViewBinder.Holder");
                C49638Ezv ezv = (C49638Ezv) tag;
                AnonymousClass73N r10 = (AnonymousClass73N) obj;
                E35 e35 = this.A01;
                DbZ.A0t(0, ezv, r10, e35);
                ezv.A03.setImageResource(r10.BEF());
                ezv.A02.setText(r10.getTitle());
                String subtitle = r10.getSubtitle();
                if (subtitle != null) {
                    ezv.A01.setText(002.A0u(" ", "•", " ", subtitle));
                }
                FPG.A00(ezv.A00, 23, r10, e35);
            }
            i2 = 123502588;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1989181848);
        if (viewGroup != null) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.profile_available_banner_item, false);
            A0A.setTag(new C49638Ezv(A0A));
            AnonymousClass0fD.A0A(298853910, A03);
            return A0A;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A0A(-1850096506, A03);
        throw A0h;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
